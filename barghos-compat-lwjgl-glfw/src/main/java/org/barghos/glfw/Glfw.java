package org.barghos.glfw;

import org.barghos.annotation.Nullable;
import org.barghos.util.memory.PointerI;
import org.lwjgl.glfw.GLFWFramebufferSizeCallbackI;
import org.lwjgl.glfw.GLFWWindowPosCallbackI;
import org.lwjgl.glfw.GLFWWindowSizeCallbackI;

public class Glfw
{
	public static final GlfwProvider PROVIDER = new JNIGlfwProvider();
	
	public static long glfwCreateWindow(int width, int height, String title, long monitor, long share)
	{
		return PROVIDER.glfwCreateWindow(width, height, title, monitor, share);
	}
	
	public static void glfwSetWindowTitle(long window, CharSequence title)
	{
		PROVIDER.glfwSetWindowTitle(window, title);
	}
	
	public static void glfwMakeContextCurrent(long window)
	{
		PROVIDER.glfwMakeContextCurrent(window);
	}
	
	public static void glfwHideWindow(long window)
	{
		PROVIDER.glfwHideWindow(window);
	}
	
	public static void glfwShowWindow(long window)
	{
		PROVIDER.glfwShowWindow(window);
	}
	
	public static void glfwDestroyWindow(long window)
	{
		PROVIDER.glfwDestroyWindow(window);
	}
	
	public static void glfwPollEvents()
	{
		PROVIDER.glfwPollEvents();
	}
	
	public static void glfwSwapBuffers(long window)
	{
		PROVIDER.glfwSwapBuffers(window);
	}
	
	public static void glfwGetFramebufferSize(long window, PointerI size)
	{
		PROVIDER.glfwGetFramebufferSize(window, size);
	}
	
	public static void glfwGetWindowSize(long window, PointerI size)
	{
		PROVIDER.glfwGetWindowSize(window, size);
	}
	
	public static void glfwSwapInterval(int interval)
	{
		PROVIDER.glfwSwapInterval(interval);
	}

	public static void glfwGetWindowPos(long window, PointerI pos)
	{
		PROVIDER.glfwGetWindowPos(window, pos);
	}
	
	public static void glfwSetWindowPos(long window, int posX, int posY)
	{
		PROVIDER.glfwSetWindowPos(window, posX, posY);
	}
	
	public static boolean glfwWindowShouldClose(long window)
	{
		return PROVIDER.glfwWindowShouldClose(window);
	}
	
	public static void glfwSetWindowShouldClose(long window, boolean value)
	{
		PROVIDER.glfwSetWindowShouldClose(window, value);
	}
	
	public static boolean glfwInit()
	{
		return PROVIDER.glfwInit();
	}
	
	public static void glfwTerminate()
	{
		PROVIDER.glfwTerminate();
	}
	
	public static void glfwSetWindowSize(long window, int width, int height)
	{
		PROVIDER.glfwSetWindowSize(window, width, height);
	}
	
	public static void glfwSetWindowSizeCallback(long window, @Nullable GLFWWindowSizeCallbackI cbfun)
	{
		PROVIDER.glfwSetWindowSizeCallback(window, cbfun);
	}
	
	public static void glfwSetFramebufferSizeCallback(long window, @Nullable GLFWFramebufferSizeCallbackI cbfun)
	{
		PROVIDER.glfwSetFramebufferSizeCallback(window, cbfun);
	}
	
	public static void glfwSetWindowPosCallback(long window, @Nullable GLFWWindowPosCallbackI cbfun)
	{
		PROVIDER.glfwSetWindowPosCallback(window, cbfun);
	}
}
