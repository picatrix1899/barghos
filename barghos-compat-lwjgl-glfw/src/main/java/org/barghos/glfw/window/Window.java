package org.barghos.glfw.window;

import java.lang.foreign.Arena;

import org.barghos.glfw.Glfw;
import org.barghos.util.memory.PointerI;

public class Window 
{
	private long id;
	private long handle;
	private WindowState state;
	
	public Window(long id, long handle, WindowState state)
	{
		this.id = id;
		this.handle = handle;
		this.state = state;
		
		Glfw.glfwSetWindowPosCallback(handle, this::onWindowPosCallback);
		Glfw.glfwSetWindowSizeCallback(handle, this::onWindowSizeCallback);
		Glfw.glfwSetFramebufferSizeCallback(handle, this::onFramebufferSizeCallback);
	}
	
	public Window swapBuffers()
	{
		Glfw.glfwSwapBuffers(this.handle);
		
		return this;
	}
	
	public Window pollEvents()
	{
		Glfw.glfwPollEvents();
		
		return this;
	}
	
	public Window show()
	{
		Glfw.glfwShowWindow(this.handle);
		
		return this;
	}
	
	public Window hide()
	{
		Glfw.glfwHideWindow(this.handle);
		
		return this;
	}

	public long handle()
	{
		return this.handle;
	}

	public long id()
	{
		return this.id;
	}
	
	public Window makeContextCurrent()
	{
		Glfw.glfwMakeContextCurrent(this.handle);
		
		return this;
	}
	
	public String title()
	{
		return this.state.title;
	}
	
	public Window title(String title)
	{
		Glfw.glfwSetWindowTitle(this.handle, title);
		this.state.title = title;
		
		return this;
	}
	
	public int posX()
	{
		return this.state.posX;
	}
	
	public int posY()
	{
		return this.state.posY;
	}
	
	public Window pos(int x, int y)
	{
		Glfw.glfwSetWindowPos(this.handle, x, y);
		
		return this;
	}
	
	public int width()
	{
		return this.state.width;
	}
	
	public int height()
	{
		return this.state.height;
	}
	
	public Window size(int width, int height)
	{
		Glfw.glfwSetWindowSize(this.handle, width, height);
		
		return this;
	}
	
	public WindowState state()
	{
		return this.state;
	}
	
	public Window forceStateUpdate()
	{
		try(Arena arena = Arena.ofConfined())
		{
			PointerI p = new PointerI(arena, 2);
			
			Glfw.glfwGetWindowPos(this.handle, p);
			this.state.fbWidth = p.getAt(0);
			this.state.fbHeight = p.getAt(1);
			
			Glfw.glfwGetWindowSize(this.handle, p);
			this.state.width = p.getAt(0);
			this.state.height = p.getAt(1);
			
			Glfw.glfwGetFramebufferSize(this.handle, p);
			this.state.fbWidth = p.getAt(0);
			this.state.fbHeight = p.getAt(1);
		}
		
		return this;
	}

	public int fbWidth()
	{
		return this.state.fbWidth;
	}
	
	public int fbHeight()
	{
		return this.state.fbHeight;
	}
	
	public boolean shouldClose()
	{
		return Glfw.glfwWindowShouldClose(this.handle);
	}
	
	public Window shouldClose(boolean value)
	{
		Glfw.glfwSetWindowShouldClose(this.handle, value);
		
		return this;
	}
	
	private void onWindowPosCallback(long window, int x, int y)
	{
		this.state.posX = x;
		this.state.posY = y;
	}
	
	private void onWindowSizeCallback(long window, int width, int height)
	{
		this.state.width = width;
		this.state.height = height;
	}
	
	private void onFramebufferSizeCallback(long window, int width, int height)
	{
		this.state.fbWidth = width;
		this.state.fbHeight = height;
	}
}
