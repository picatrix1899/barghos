package org.barghos.glfw;

import org.barghos.annotation.AllowNull;
import org.barghos.impl.core.memory.PointerI;
import org.lwjgl.glfw.GLFWFramebufferSizeCallbackI;
import org.lwjgl.glfw.GLFWWindowPosCallbackI;
import org.lwjgl.glfw.GLFWWindowSizeCallbackI;

public interface GlfwProvider
{
	long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share);
	
	void glfwSetWindowTitle(long window, CharSequence title);
	
	void glfwMakeContextCurrent(long window);
	
	void glfwHideWindow(long window);
	
	void glfwShowWindow(long window);
	
	void glfwDestroyWindow(long window);
	
	void glfwPollEvents();
	
	void glfwSwapBuffers(long window);

	void glfwGetFramebufferSize(long window, PointerI size);
	
	void glfwGetWindowSize(long window, PointerI size);
	
	void glfwSwapInterval(int interval);
	
	void glfwGetWindowPos(long window, PointerI pos);
	
	void glfwSetWindowPos(long window, int xpos, int ypos);
	
	boolean glfwWindowShouldClose(long window);
	
	void glfwSetWindowShouldClose(long window, boolean value);
	
	boolean glfwInit();
	
	void glfwTerminate();
	
	void glfwSetWindowSize(long window, int width, int height);
	
	void glfwSetWindowSizeCallback(long window, @AllowNull GLFWWindowSizeCallbackI cbfun);
	
	void glfwSetFramebufferSizeCallback(long window, @AllowNull GLFWFramebufferSizeCallbackI cbfun);
	
	void glfwSetWindowPosCallback(long window, @AllowNull GLFWWindowPosCallbackI cbfun);
}
