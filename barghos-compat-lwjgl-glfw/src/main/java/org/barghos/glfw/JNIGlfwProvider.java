package org.barghos.glfw;

import java.nio.IntBuffer;

import org.barghos.annotation.AllowNull;
import org.barghos.impl.core.memory.PointerI;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWFramebufferSizeCallbackI;
import org.lwjgl.glfw.GLFWWindowPosCallbackI;
import org.lwjgl.glfw.GLFWWindowSizeCallbackI;

public class JNIGlfwProvider implements GlfwProvider
{
	public long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share)
	{
		return GLFW.glfwCreateWindow(width, height, title, monitor, share);
	}
	
	public void glfwSetWindowTitle(long window, CharSequence title)
	{
		GLFW.glfwSetWindowTitle(window, title);
	}
	
	public void glfwMakeContextCurrent(long window)
	{
		GLFW.glfwMakeContextCurrent(window);
	}
	
	public void glfwHideWindow(long window)
	{
		GLFW.glfwHideWindow(window);
	}
	
	public void glfwShowWindow(long window)
	{
		GLFW.glfwShowWindow(window);
	}
	
	public void glfwDestroyWindow(long window)
	{
		GLFW.glfwDestroyWindow(window);
	}
	
	public void glfwPollEvents()
	{
		GLFW.glfwPollEvents();
	}
	
	public void glfwSwapBuffers(long window)
	{
		GLFW.glfwSwapBuffers(window);
	}
	
	public void glfwGetFramebufferSize(long window, PointerI size)
	{
		IntBuffer buf = size.asIntBuffer();
		
		GLFW.glfwGetFramebufferSize(window, buf.slice(0, 1), buf.slice(1, 1));
	}
	
	public void glfwGetWindowSize(long window, PointerI size)
	{
		IntBuffer buf = size.asIntBuffer();
		
		GLFW.glfwGetFramebufferSize(window, buf.slice(0, 1), buf.slice(1, 1));
	}
	
	public void glfwSwapInterval(int interval)
	{
		GLFW.glfwSwapInterval(interval);
	}
	
	public void glfwGetWindowPos(long window, PointerI pos)
	{
		IntBuffer buf = pos.asIntBuffer();
		
		GLFW.glfwGetWindowPos(window, buf.slice(0, 1), buf.slice(1, 1));
	}
	
	public void glfwSetWindowPos(long window, int posX, int posY)
	{
		GLFW.glfwSetWindowPos(window, posX, posY);
	}
	
	public boolean glfwWindowShouldClose(long window)
	{
		return GLFW.glfwWindowShouldClose(window);
	}
	
	public void glfwSetWindowShouldClose(long window, boolean value)
	{
		GLFW.glfwSetWindowShouldClose(window, value);
	}
	
	public boolean glfwInit()
	{
		return GLFW.glfwInit();
	}
	
	public void glfwTerminate()
	{
		GLFW.glfwTerminate();
	}
	
	public void glfwSetWindowSize(long window, int width, int height)
	{
		GLFW.glfwSetWindowSize(window, width, height);
	}
	
	public void glfwSetWindowSizeCallback(long window, @AllowNull GLFWWindowSizeCallbackI cbfun)
	{
		GLFW.glfwSetWindowSizeCallback(window, cbfun);
	}
	
	public void glfwSetFramebufferSizeCallback(long window, @AllowNull GLFWFramebufferSizeCallbackI cbfun)
	{
		GLFW.glfwSetFramebufferSizeCallback(window, cbfun);
	}
	
	public void glfwSetWindowPosCallback(long window, @AllowNull GLFWWindowPosCallbackI cbfun)
	{
		GLFW.glfwSetWindowPosCallback(window, cbfun);
	}
}
