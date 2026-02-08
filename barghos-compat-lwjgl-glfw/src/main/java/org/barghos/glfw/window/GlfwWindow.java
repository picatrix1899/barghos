package org.barghos.glfw.window;

import static org.lwjgl.glfw.GLFW.*;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;

import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFWVidMode;

public final class GlfwWindow
{
	public static final IOnCloseCallback EMPTY_ON_CLOSE_CALLBACK = () -> {};
	public static final IOnFramebufferResizeCallback EMPTY_ON_FRAMEBUFFER_RESIZE_CALLBACK = (_, _, _, _) -> {};
	public static final IOnWindowResizeCallback EMPTY_ON_WINDOW_RESIZE_CALLBACK = (_, _, _, _) -> {};
	public static final IOnPosChangeCallback EMPTY_ON_POS_CHANGE_CALLBACK = (_, _, _, _) -> {};
	public static final IOnCursorPosChangeCallback EMPTY_ON_CURSOR_POS_CHANGE_CALLBACK = (_, _, _, _) -> {};
	
	private long handle;
	
	private int lastWindowPosX;
	private int lastWindowPosY;
	private int windowPosX;
	private int windowPosY;
	
	private int lastWindowWidth;
	private int lastWindowHeight;
	private int windowWidth;
	private int windowHeight;
	private float lastWindowAspectRatio;
	private float windowAspectRatio;
	
	private int lastFramebufferWidth;
	private int lastFramebufferHeight;
	private int framebufferWidth;
	private int framebufferHeight;
	private float lastFramebufferAspectRatio;
	private float framebufferAspectRatio;
	
	private long lastMonitor;
	private long monitor;
	
	private String lastTitle;
	private String title;
	
	private float lastCursorPosX;
	private float lastCursorPosY;
	private float cursorPosX;
	private float cursorPosY;
	
	private final Arena tempArena;
	private final MemorySegment tempSegIntA;
	private final MemorySegment tempSegIntB;
	private final MemorySegment tempSegDoubleA;
	private final MemorySegment tempSegDoubleB;
	private final IntBuffer tempBufIntA;
	private final IntBuffer tempBufIntB;
	private final DoubleBuffer tempBufDoubleA;
	private final DoubleBuffer tempBufDoubleB;
	
	private IOnCloseCallback onCloseCallback = EMPTY_ON_CLOSE_CALLBACK;
	private IOnFramebufferResizeCallback onFramebufferResizeCallback = EMPTY_ON_FRAMEBUFFER_RESIZE_CALLBACK;
	private IOnWindowResizeCallback onWindowResizeCallback = EMPTY_ON_WINDOW_RESIZE_CALLBACK;
	private IOnPosChangeCallback onPosChangeCallback = EMPTY_ON_POS_CHANGE_CALLBACK;
	private IOnCursorPosChangeCallback onCursorPosChangeCallback = EMPTY_ON_CURSOR_POS_CHANGE_CALLBACK;
	
	public static GlfwWindow create(Settings settings)
	{
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, settings.isResizable ? GLFW_TRUE : GLFW_FALSE);
		glfwWindowHint(GLFW_FOCUS_ON_SHOW, settings.focusOnShow ? GLFW_TRUE : GLFW_FALSE);
		glfwWindowHint(GLFW_SAMPLES, settings.msaaSamples);
		
		long handle = glfwCreateWindow(settings.windowWidth, settings.windowHeight, settings.title, settings.monitor, settings.sharedContext);
		
		if(handle == 0)
		{
			return null;
		}
		
		GlfwWindow window = new GlfwWindow(handle, settings);
		
		return window;
	}
	
	private GlfwWindow(long handle, Settings settings)
	{
		this.handle = handle;
		
		this.tempArena = Arena.ofConfined();
		this.tempSegIntA = tempArena.allocate(ValueLayout.JAVA_INT, 1);
		this.tempSegIntB = tempArena.allocate(ValueLayout.JAVA_INT, 1);
		this.tempSegDoubleA = tempArena.allocate(ValueLayout.JAVA_DOUBLE, 1);
		this.tempSegDoubleB = tempArena.allocate(ValueLayout.JAVA_DOUBLE, 1);
		
		this.tempBufIntA = this.tempSegIntA.asByteBuffer().order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
		this.tempBufIntB = this.tempSegIntB.asByteBuffer().order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
		this.tempBufDoubleA = this.tempSegDoubleA.asByteBuffer().order(ByteOrder.LITTLE_ENDIAN).asDoubleBuffer();
		this.tempBufDoubleB = this.tempSegDoubleB.asByteBuffer().order(ByteOrder.LITTLE_ENDIAN).asDoubleBuffer();
		
		this.title = settings.title;
		
		initWindowPos();
		initCurrentMonitor();
		initWindowSize();
		initFramebufferSize();
		initCursorPos();
		
		glfwSetWindowSizeCallback(this.handle, this::onWindowResize);
		glfwSetWindowPosCallback(this.handle, this::onPosChange);
		glfwSetFramebufferSizeCallback(this.handle, this::onFramebufferResize);
		glfwSetWindowCloseCallback(this.handle, this::onClose);
		glfwSetCursorPosCallback(this.handle, this::onCursorPosChange);
	}
	
	public void makeContextCurrent()
	{
		glfwMakeContextCurrent(this.handle);
	}
	
	public long handle()
	{
		return this.handle;
	}
	
	public boolean shouldClose()
	{
		return glfwWindowShouldClose(this.handle);
	}
	
	public void requestAttention()
	{
		glfwRequestWindowAttention(this.handle);
	}
	
	public void show()
	{
		glfwShowWindow(this.handle);
	}
	
	public void hide()
	{
		glfwHideWindow(this.handle);

	}
	
	public void minimize()
	{
		glfwIconifyWindow(this.handle);
	}
	
	public void maximize()
	{
		glfwMaximizeWindow(this.handle);
	}
	
	public void restore()
	{
		glfwRestoreWindow(this.handle);
	}
	
	public void fullscreen()
	{
		glfwSetWindowMonitor(this.handle, this.monitor, 0, 0, 0, 0, 0);
	}
	
	public void focus()
	{
		glfwFocusWindow(this.handle);
	}
	
	public void swapBuffers()
	{
		glfwSwapBuffers(this.handle);
	}
	
	public void normalCursor()
	{
		glfwSetInputMode(this.handle, GLFW_CURSOR, GLFW_CURSOR_NORMAL);
	}
	
	public void hiddenCursor()
	{
		glfwSetInputMode(this.handle, GLFW_CURSOR, GLFW_CURSOR_HIDDEN);
	}
	
	public void disabledCursor()
	{
		glfwSetInputMode(this.handle, GLFW_CURSOR, GLFW_CURSOR_DISABLED);
	}
	
	public void capturedCursor()
	{
		glfwSetInputMode(this.handle, GLFW_CURSOR, GLFW_CURSOR_CAPTURED);
	}
	
	public void setCursor(long cursor)
	{
		glfwSetCursor(this.handle, cursor);
	}
	
	public void releaseResources()
	{
		glfwDestroyWindow(this.handle);
		
		this.tempArena.close();
	}
	
	public int lastFramebufferWidth()
	{
		return this.lastFramebufferWidth;
	}
	
	public double lastFramebufferWidthd()
	{
		return this.lastFramebufferWidth;
	}
	
	public float lastFramebufferWidthf()
	{
		return this.lastFramebufferWidth;
	}
	
	public int framebufferWidth()
	{
		return this.framebufferWidth;
	}
	
	public double framebufferWidthd()
	{
		return this.framebufferWidth;
	}
	
	public float framebufferWidthf()
	{
		return this.framebufferWidth;
	}
	
	public int lastFramebufferHeight()
	{
		return this.lastFramebufferHeight;
	}
	
	public double lastFramebufferHeightd()
	{
		return this.lastFramebufferHeight;
	}
	
	public float lastFramebufferHeightf()
	{
		return this.lastFramebufferHeight;
	}
	
	public int framebufferHeight()
	{
		return this.framebufferHeight;
	}
	
	public double framebufferHeightd()
	{
		return this.framebufferHeight;
	}
	
	public float framebufferHeightf()
	{
		return this.framebufferHeight;
	}
	
	public int lastWindowWidth()
	{
		return this.lastWindowWidth;
	}
	
	public double lastWindowWidthd()
	{
		return this.windowWidth;
	}
	
	public float lastWindowWidthf()
	{
		return this.windowWidth;
	}
	
	public int windowWidth()
	{
		return this.windowWidth;
	}
	
	public double windowWidthd()
	{
		return this.windowWidth;
	}
	
	public float windowWidthf()
	{
		return this.windowWidth;
	}
	
	public int lastWindowHeight()
	{
		return this.lastWindowHeight;
	}
	
	public double lastWindowHeightd()
	{
		return this.lastWindowHeight;
	}
	
	public float lastWindowHeightf()
	{
		return this.lastWindowHeight;
	}
	
	public int windowHeight()
	{
		return this.windowHeight;
	}
	
	public double windowHeightd()
	{
		return this.windowHeight;
	}
	
	public float windowHeightf()
	{
		return this.windowHeight;
	}
	
	public String lastTitle()
	{
		return this.lastTitle;
	}
	
	public String title()
	{
		return this.title;
	}
	
	public int lastWindowPosX()
	{
		return this.lastWindowPosX;
	}
	
	public double lastWindowPosXd()
	{
		return this.lastWindowPosX;
	}
	
	public float lastWindowPosXf()
	{
		return this.lastWindowPosX;
	}
	
	public int windowPosX()
	{
		return this.windowPosX;
	}
	
	public double windowPosXd()
	{
		return this.windowPosX;
	}
	
	public float windowPosXf()
	{
		return this.windowPosX;
	}
	
	public int lastWindowPosY()
	{
		return this.lastWindowPosY;
	}
	
	public double lastWindowPosYd()
	{
		return this.lastWindowPosY;
	}
	
	public float lastWindowPosYf()
	{
		return this.lastWindowPosY;
	}
	
	public int windowPosY()
	{
		return this.windowPosY;
	}
	
	public double windowPosYd()
	{
		return this.windowPosY;
	}
	
	public float windowPosYf()
	{
		return this.windowPosY;
	}
	
	public double lastWindowAspectRatio()
	{
		return this.lastWindowAspectRatio;
	}
	
	public float lastWindowAspectRatiof()
	{
		return this.lastWindowAspectRatio;
	}
	
	public double windowAspectRatio()
	{
		return this.windowAspectRatio;
	}
	
	public float windowAspectRatiof()
	{
		return this.windowAspectRatio;
	}
	
	public double lastFramebufferAspectRatio()
	{
		return this.lastFramebufferAspectRatio;
	}
	
	public float lastFramebufferAspectRatiof()
	{
		return this.lastFramebufferAspectRatio;
	}
	
	public double framebufferAspectRatio()
	{
		return this.framebufferAspectRatio;
	}
	
	public float framebufferAspectRatiof()
	{
		return this.framebufferAspectRatio;
	}
	
	public long lastMonitor()
	{
		return this.lastMonitor;
	}
	
	public long monitor()
	{
		return this.monitor;
	}
	
	public double lastCursorPosX()
	{
		return this.lastCursorPosX;
	}
	
	public float lastCursorPosXf()
	{
		return this.lastCursorPosX;
	}
	
	public double cursorPosX()
	{
		return this.cursorPosX;
	}
	
	public float cursorPosXf()
	{
		return this.cursorPosX;
	}
	
	public double lastCursorPosY()
	{
		return this.lastCursorPosY;
	}
	
	public float lastCursorPosYf()
	{
		return this.lastCursorPosY;
	}
	
	public double cursorPosY()
	{
		return this.cursorPosY;
	}
	
	public float cursorPosYf()
	{
		return this.cursorPosY;
	}
	
	public void title(String title)
	{
		glfwSetWindowTitle(this.handle, title);
		
		this.lastTitle = title;
		this.title = title;
	}
	
	public void pos(int posX, int posY)
	{
		glfwSetWindowPos(this.handle, posX, posY);
		
		this.lastWindowPosX = this.windowPosX = posX;
		this.lastWindowPosY = this.windowPosY = posY;
	}
	
	public void size(int width, int height)
	{
		glfwSetWindowSize(this.handle, width, height);
		
		this.lastWindowWidth = this.windowWidth = width;
		this.lastWindowHeight = this.windowHeight = height;
		this.lastWindowAspectRatio = this.windowAspectRatio = (float)this.windowWidth / (float)this.windowHeight;
	}
	
	public void cursorPos(float x, float y)
	{
		glfwSetCursorPos(this.handle, x, y);
		
		this.lastCursorPosX = this.cursorPosX = x;
		this.lastCursorPosY = this.cursorPosY = y;
	}
	
	private void initWindowSize()
	{
		this.tempBufIntA.position(0);
		this.tempBufIntB.position(0);
		
		glfwGetWindowSize(this.handle, this.tempBufIntA, this.tempBufIntB);
		
		this.lastWindowWidth = this.windowWidth = this.tempBufIntA.get(0);
		this.lastWindowHeight = this.windowHeight = this.tempBufIntB.get(0);
		this.lastWindowAspectRatio = this.windowAspectRatio = (float)this.windowWidth / (float)this.windowHeight;
	}
	
	private void initFramebufferSize()
	{
		this.tempBufIntA.position(0);
		this.tempBufIntB.position(0);
		
		glfwGetFramebufferSize(this.handle, this.tempBufIntA, this.tempBufIntB);
		
		this.lastFramebufferWidth = this.framebufferWidth = this.tempBufIntA.get(0);
		this.lastFramebufferHeight = this.framebufferHeight = this.tempBufIntB.get(0);
		this.lastFramebufferAspectRatio = this.framebufferAspectRatio = (float)this.framebufferWidth / (float)this.framebufferHeight;
	}
	
	private void initWindowPos()
	{
		this.tempBufIntA.position(0);
		this.tempBufIntB.position(0);
		
		glfwGetWindowPos(this.handle, this.tempBufIntA, this.tempBufIntB);
		
		this.lastWindowPosX = this.windowPosX = this.tempBufIntA.get(0);
		this.lastWindowPosY = this.windowPosY = this.tempBufIntB.get(0);
	}
	
	/** Determines the current monitor that the specified window is being displayed on.
	 * If the monitor could not be determined, the primary monitor will be returned.
	 * 
	 * From
	 * <a href="https://stackoverflow.com/questions/21421074/how-to-create-a-full-screen-window-on-the-current-monitor-with-glfw">
	 * StackOverflow: How to create a full screen window on the current monitor with GLFW"
	 * </a><br>
	 * @param window The window to query
	 * @return The current monitor on which the window is being displayed, or the primary monitor if one could not be determined
	 * 
	 * @author <a href="https://stackoverflow.com/a/31526753/2398263">Shmo</a><br>
	 * @author Brian_Entei
	 * @author picatrix1899
	 */
	private void initCurrentMonitor()
	{
	    PointerBuffer monitors = glfwGetMonitors();

	    long bestmonitor = glfwGetPrimaryMonitor();
    	
    	while(monitors.hasRemaining())
	    {
	        long monitor = monitors.get();
	        
	        GLFWVidMode mode = glfwGetVideoMode(monitor);
	        
	        int monitorWidth = mode.width();
	        int monitorHeight = mode.height();
	        
	        glfwGetMonitorPos(monitor, this.tempBufIntA, this.tempBufIntB);
	        
	        int monitorPosX = this.tempBufIntA.get(0);
	        int monitorPosY = this.tempBufIntB.get(0);
	        
	        int bestoverlap = 0;

	        int overlap = Math.max(0, Math.min(this.windowPosX + this.windowWidth, monitorPosX + monitorWidth) - Math.max(this.windowPosX, monitorPosX)) *
	                Math.max(0, Math.min(this.windowPosY + this.windowHeight, monitorPosY + monitorHeight) - Math.max(this.windowPosY, monitorPosY));

	        if (bestoverlap < overlap) {
	            bestoverlap = overlap;
	            bestmonitor = monitor;
	        }
	    }
	    
	    this.lastMonitor = this.monitor = bestmonitor;
	}
	
	private void initCursorPos()
	{
		this.tempBufDoubleA.position(0);
		this.tempBufDoubleB.position(0);
		
		glfwGetCursorPos(this.handle, this.tempBufDoubleA, this.tempBufDoubleB);
		
		float cursorPosX = (float)this.tempBufDoubleA.get(0);
		float cursorPosY = (float)this.tempBufDoubleB.get(0);
		
		this.lastCursorPosX = this.cursorPosX = cursorPosX;
		this.lastCursorPosY = this.cursorPosY = cursorPosY;
	}
	
	public void onCloseCallback(IOnCloseCallback callback)
	{
		this.onCloseCallback = callback != null ? callback : EMPTY_ON_CLOSE_CALLBACK;
	}
	
	public IOnCloseCallback onCloseCallback()
	{
		return this.onCloseCallback;
	}
	
	private void onClose(long window)
	{
		this.onCloseCallback.call();
	}
	
	public void onWindowResizeCallback(IOnWindowResizeCallback callback)
	{
		this.onWindowResizeCallback = callback != null ? callback : EMPTY_ON_WINDOW_RESIZE_CALLBACK;
	}
	
	public IOnWindowResizeCallback onWindowResizeCallback()
	{
		return this.onWindowResizeCallback;
	}
	
	private void onWindowResize(long window, int width, int height)
	{
		this.lastWindowWidth = this.windowWidth;
		this.lastWindowHeight = this.windowHeight;
		
		this.windowWidth = width;
		this.windowHeight = height;
		this.windowAspectRatio = (float)this.windowWidth / (float)this.windowHeight;
		
		this.onWindowResizeCallback.call(this.lastWindowWidth, this.lastWindowHeight, this.windowWidth, this.windowHeight);
	}
	
	public void onFramebufferResizeCallback(IOnFramebufferResizeCallback callback)
	{
		this.onFramebufferResizeCallback = callback != null ? callback : EMPTY_ON_FRAMEBUFFER_RESIZE_CALLBACK;
	}
	
	public IOnFramebufferResizeCallback onFramebufferResizeCallback()
	{
		return this.onFramebufferResizeCallback;
	}
	
	private void onFramebufferResize(long window, int width, int height)
	{
		this.lastFramebufferWidth = this.framebufferWidth;
		this.lastFramebufferHeight = this.framebufferHeight;
		
		this.framebufferWidth = width;
		this.framebufferHeight = height;
		this.framebufferAspectRatio = (float)this.framebufferWidth / (float)this.framebufferHeight;
		
		this.onFramebufferResizeCallback.call(this.lastFramebufferWidth, this.lastFramebufferHeight, this.framebufferWidth, this.framebufferHeight);
	}
	
	public void onPosChangeCallback(IOnPosChangeCallback callback)
	{
		this.onPosChangeCallback = callback != null ? callback : EMPTY_ON_POS_CHANGE_CALLBACK;
	}
	
	public IOnPosChangeCallback onPosChangeCallback()
	{
		return this.onPosChangeCallback;
	}
	
	private void onPosChange(long window, int posX, int posY)
	{
		this.lastWindowPosX = this.windowPosX;
		this.lastWindowPosY = this.windowPosY;
		
		this.windowPosX = posX;
		this.windowPosY = posY;
		
		this.onPosChangeCallback.call(this.lastWindowPosX, this.lastWindowPosY, this.windowPosX, this.windowPosY);
	}
	
	public void onCursorPosChangeCallback(IOnCursorPosChangeCallback callback)
	{
		this.onCursorPosChangeCallback = callback != null ? callback : EMPTY_ON_CURSOR_POS_CHANGE_CALLBACK;
	}
	
	public IOnCursorPosChangeCallback onCursorPosChangeCallback()
	{
		return this.onCursorPosChangeCallback;
	}
	
	private void onCursorPosChange(long window, double posX, double posY)
	{
		this.lastCursorPosX = this.cursorPosX;
		this.lastCursorPosY = this.cursorPosY;
		
		this.cursorPosX = (float)posX;
		this.cursorPosY = (float)posY;
		
		this.onCursorPosChangeCallback.call(this.lastCursorPosX, this.lastCursorPosY, this.cursorPosX, this.cursorPosY);
	}
	
	public static class Settings
	{
		public int sharedContext = 0;
		public boolean isResizable = false;
		public boolean focusOnShow = true;
		public int monitor = 0;
		public int msaaSamples = 0;
		
		public String title = "Demo";
		
		public int windowWidth = 800;
		public int windowHeight = 600;
	}
	
	@FunctionalInterface
	public static interface IOnCloseCallback
	{
		void call();
	}
	
	@FunctionalInterface
	public static interface IOnFramebufferResizeCallback
	{
		void call(int oldWidth, int oldHeight, int newWidth, int newHeight);
	}
	
	@FunctionalInterface
	public static interface IOnWindowResizeCallback
	{
		void call(int oldWidth, int oldHeight, int newWidth, int newHeight);
	}
	
	@FunctionalInterface
	public static interface IOnPosChangeCallback
	{
		void call(int oldPosX, int oldPosY, int newPosX, int newPosY);
	}
	
	@FunctionalInterface
	public static interface IOnCursorPosChangeCallback
	{
		void call(float oldPosX, float oldPosY, float newPosX, float newPosY);
	}
}
