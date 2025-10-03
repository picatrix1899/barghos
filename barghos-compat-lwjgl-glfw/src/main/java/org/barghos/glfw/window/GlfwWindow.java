package org.barghos.glfw.window;

import static org.lwjgl.glfw.GLFW.*;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.IntBuffer;

import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFWVidMode;

public final class GlfwWindow
{
	public static final IOnCloseCallback EMPTY_ON_CLOSE_CALLBACK = () -> {};
	public static final IOnFramebufferResizeCallback EMPTY_ON_FRAMEBUFFER_RESIZE_CALLBACK = (_, _, _, _) -> {};
	public static final IOnWindowResizeCallback EMPTY_ON_WINDOW_RESIZE_CALLBACK = (_, _, _, _) -> {};
	public static final IOnPosChangeCallback EMPTY_ON_POS_CHANGE_CALLBACK = (_, _, _, _) -> {};
	
	private long handle;
	
	private int windowPosX;
	private int windowPosY;
	
	private int windowWidth;
	private int windowHeight;
	
	private int framebufferWidth;
	private int framebufferHeight;
	
	private long monitor;
	
	private String title;
	
	private final Arena tempArena;
	private final MemorySegment tempSegA;
	private final MemorySegment tempSegB;
	private final IntBuffer tempBufA;
	private final IntBuffer tempBufB;
	
	private IOnCloseCallback onCloseCallback = EMPTY_ON_CLOSE_CALLBACK;
	private IOnFramebufferResizeCallback onFramebufferResizeCallback = EMPTY_ON_FRAMEBUFFER_RESIZE_CALLBACK;
	private IOnWindowResizeCallback onWindowResizeCallback = EMPTY_ON_WINDOW_RESIZE_CALLBACK;
	private IOnPosChangeCallback onPosChangeCallback = EMPTY_ON_POS_CHANGE_CALLBACK;
	
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
		
		this.tempArena = Arena.ofAuto();
		this.tempSegA = tempArena.allocate(ValueLayout.JAVA_INT, 1);
		this.tempSegB = tempArena.allocate(ValueLayout.JAVA_INT, 1);
		this.tempBufA = this.tempSegA.asByteBuffer().asIntBuffer();
		this.tempBufB = this.tempSegB.asByteBuffer().asIntBuffer();
		
		this.title = settings.title;
		
		updateWindowPos();
		updateCurrentMonitor();
		updateWindowSize();
		updateFramebufferSize();
		
		glfwSetWindowSizeCallback(this.handle, this::onWindowResize);
		glfwSetWindowPosCallback(this.handle, this::onPosChange);
		glfwSetFramebufferSizeCallback(this.handle, this::onFramebufferResize);
		glfwSetWindowCloseCallback(this.handle, this::onClose);
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
	
	public void releaseResources()
	{
		glfwDestroyWindow(this.handle);
	}
	
	public int framebufferWidth()
	{
		return this.framebufferWidth;
	}
	
	public int framebufferHeight()
	{
		return this.framebufferHeight;
	}
	
	public int windowWidth()
	{
		return this.windowWidth;
	}
	
	public int windowHeight()
	{
		return this.windowHeight;
	}
	
	public String title()
	{
		return this.title;
	}
	
	public int windowPosX()
	{
		return this.windowPosX;
	}
	
	public int windowPosY()
	{
		return this.windowPosY;
	}
	
	public double windowAspectRatio()
	{
		return (double)this.windowWidth / (double)this.windowHeight;
	}
	
	public double framebufferAspectRatio()
	{
		return (double)this.framebufferWidth / (double)this.framebufferHeight;
	}
	
	public long monitor()
	{
		return this.monitor;
	}
	
	public void title(String title)
	{
		glfwSetWindowTitle(this.handle, title);
		
		this.title = title;
	}
	
	public void pos(int posX, int posY)
	{
		glfwSetWindowPos(this.handle, posX, posY);
		
		this.windowPosX = posX;
		this.windowPosY = posY;
	}
	
	public void size(int width, int height)
	{
		glfwSetWindowSize(this.handle, width, height);
		
		this.windowWidth = width;
		this.windowHeight = height;
	}
	
	private void updateWindowSize()
	{
		glfwGetWindowSize(this.handle, this.tempBufA, this.tempBufB);
		
		this.windowWidth = this.tempBufA.get(0);
		this.windowHeight = this.tempBufB.get(0);
	}
	
	private void updateFramebufferSize()
	{
		glfwGetFramebufferSize(this.handle, this.tempBufA, this.tempBufB);
		
		this.framebufferWidth = this.tempBufA.get(0);
		this.framebufferHeight = this.tempBufB.get(0);
	}
	
	private void updateWindowPos()
	{
		glfwGetWindowPos(this.handle, this.tempBufA, this.tempBufB);
		
		this.windowPosX = this.tempBufA.get(0);
		this.windowPosY = this.tempBufB.get(0);
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
	private void updateCurrentMonitor()
	{
	    PointerBuffer monitors = glfwGetMonitors();

	    long bestmonitor = glfwGetPrimaryMonitor();
    	
    	while(monitors.hasRemaining())
	    {
	        long monitor = monitors.get();
	        
	        GLFWVidMode mode = glfwGetVideoMode(monitor);
	        
	        int monitorWidth = mode.width();
	        int monitorHeight = mode.height();
	        
	        glfwGetMonitorPos(monitor, this.tempBufA, this.tempBufB);
	        
	        int monitorPosX = this.tempBufA.get(0);
	        int monitorPosY = this.tempBufB.get(0);
	        
	        int bestoverlap = 0;

	        int overlap = Math.max(0, Math.min(this.windowPosX + this.windowWidth, monitorPosX + monitorWidth) - Math.max(this.windowPosX, monitorPosX)) *
	                Math.max(0, Math.min(this.windowPosY + this.windowHeight, monitorPosY + monitorHeight) - Math.max(this.windowPosY, monitorPosY));

	        if (bestoverlap < overlap) {
	            bestoverlap = overlap;
	            bestmonitor = monitor;
	        }
	    }
	    
	    this.monitor = bestmonitor;
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
		this.onCloseCallback.call();;
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
		int oldWidth = this.windowWidth;
		int oldHeight = this.windowHeight;
		
		this.windowWidth = width;
		this.windowHeight = height;
		
		this.onWindowResizeCallback.call(oldWidth, oldHeight, this.windowWidth, this.windowHeight);
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
		int oldWidth = this.framebufferWidth;
		int oldHeight = this.framebufferHeight;
		
		this.framebufferWidth = width;
		this.framebufferHeight = height;
		
		this.onFramebufferResizeCallback.call(oldWidth, oldHeight, this.framebufferWidth, this.framebufferHeight);
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
		int oldPosX = this.windowPosX;
		int oldPosY = this.windowPosY;
		
		this.windowPosX = posX;
		this.windowPosY = posY;
		
		this.onPosChangeCallback.call(oldPosX, oldPosY, this.windowPosX, this.windowPosY);
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
}
