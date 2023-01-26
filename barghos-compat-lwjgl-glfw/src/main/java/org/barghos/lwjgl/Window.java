package org.barghos.lwjgl;

import static org.lwjgl.glfw.GLFW.*;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;

import org.barghos.math.api.vector.Vec2fR;
import org.barghos.math.vector.Vec2f;

public class Window
{
	private long id;
	private int width;
	private int height;
	private String title;
	private long sharedContext;
	private long monitor;
	
	private GLCapabilities capabilities;
	
	private CloseCallback windowCloseCallback;
	private FramebufferResizeCallback framebufferResizeCallback;
	private SetWindowHintsCallback setWindowHintsCallback;
	
	public Window(int width, int height, String title)
	{
		this(width, height, title, 0, 0);
	}
	
	public Window(int width, int height, String title, long monitor)
	{
		this(width, height, title, monitor, 0);
	}
	
	public Window(int width, int height, String title, long monitor, long sharedContext)
	{
		this.width = width;
		this.height = height;
		this.title = title;
		this.monitor = monitor;
		this.sharedContext = sharedContext;
	}
	
	public void init()
	{
		onSetWindowHints();
		
		this.id = glfwCreateWindow(this.width, this.height, this.title, this.monitor, this.sharedContext);
		
		if(this.id == 0)
		{
			throw new Error();
		}
		
		glfwMakeContextCurrent(this.id);
		
		this.capabilities = GL.createCapabilities();

		glfwSetWindowCloseCallback(this.id, (window) -> onClose(window));
		glfwSetFramebufferSizeCallback(this.id, (window, width, height) -> onFramebufferResize(id, width, height));
	}
	
	public void tick()
	{
		glfwPollEvents();
	}
	
	public void render()
	{
		glfwSwapBuffers(this.id);
	}
	
	public void release()
	{
		glfwDestroyWindow(this.id);
	}
	
	public long getId()
	{
		return this.id;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public Vec2fR getSize()
	{
		return new Vec2f(this.width, this.height);
	}
	
	public void setSize(int width, int height)
	{
		this.width = width;
		this.height = height;
		
		glfwSetWindowSize(this.id, width, height);
		
		setViewport();
	}
	
	public float getAspectRatiof()
	{
		return (float)this.width / (float)this.height;
	}
	
	public GLCapabilities getGLCapabilities()
	{
		return this.capabilities;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setViewport()
	{
		GL11.glViewport(0, 0, this.width, this.height);
	}
	
	public void setTitle(String title)
	{
		this.title = title;
		glfwSetWindowTitle(this.id, title);
	}
	
	public void disableVsync()
	{
		glfwSwapInterval(0);
	}
	
	public void enableVsync()
	{
		glfwSwapInterval(1);
	}
	
	public void setVsync(boolean state)
	{
		if(state)
			enableVsync();
		else
			disableVsync();
	}
	
	public void show()
	{
		glfwShowWindow(this.id);
	}
	
	public void hide()
	{
		glfwHideWindow(this.id);
	}
	
	public void setCursor(long cursorId)
	{
		glfwSetCursor(this.id, cursorId);
	}
	
	public void setCloseCallback(CloseCallback callback)
	{
		this.windowCloseCallback = callback;
	}
	
	public void setFramebufferResizeCallback(FramebufferResizeCallback callback)
	{
		this.framebufferResizeCallback = callback;
	}
	
	public void setSetWindowHintsCallback(SetWindowHintsCallback callback)
	{
		this.setWindowHintsCallback = callback;
	}
	
	private void onSetWindowHints()
	{
		if(this.setWindowHintsCallback != null)this.setWindowHintsCallback.call();
	}
	
	private void onClose(long id)
	{
		if(this.windowCloseCallback != null) this.windowCloseCallback.call(id);
	}
	
	private void onFramebufferResize(long id, int width, int height)
	{
		this.width = width;
		this.height = height;
		
		setViewport();
		
		if(this.framebufferResizeCallback != null) this.framebufferResizeCallback.call(id, width, height);
	}
	
	public interface FramebufferResizeCallback
	{
		void call(long id, int width, int height);
	}
	
	public interface CloseCallback
	{
		void call(long id);
	}
	
	public interface SetWindowHintsCallback
	{
		void call();
	}
}
