package org.barghos.glfw.window;

import static org.lwjgl.glfw.GLFW.*;

public class WindowHint
{
	public static void resizable(boolean resizable)
	{
		glfwWindowHint(GLFW_RESIZABLE, resizable ? GLFW_TRUE : GLFW_FALSE);
	}
	
	public static void glVersion(int major, int minor, GLProfile profile)
	{
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, major);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, minor);
		
		int p = 0;
		switch(profile)
		{
			case ANY:
				p = GLFW_OPENGL_ANY_PROFILE;
				break;
			case COMPAT:
				p = GLFW_OPENGL_COMPAT_PROFILE;
				break;
			case CORE:
				p = GLFW_OPENGL_CORE_PROFILE;
				break;
		}
		
		glfwWindowHint(GLFW_OPENGL_PROFILE, p);
	}
	
	public static void depthBits(int bits)
	{
		glfwWindowHint(GLFW_DEPTH_BITS, bits);
	}
	
	public static void samples(int samples)
	{
		glfwWindowHint(GLFW_SAMPLES, samples);
	}
	
	public static void doubleBuffering(boolean doublebuffering)
	{
		glfwWindowHint(GLFW_DOUBLEBUFFER, doublebuffering ? GLFW_TRUE : GLFW_FALSE);
	}
	
	public static void startVisible(boolean auto)
	{
		glfwWindowHint(GLFW_VISIBLE, auto ? GLFW_TRUE : GLFW_FALSE);
	}
	
	public static void decorated(boolean decorated)
	{
		glfwWindowHint(GLFW_DECORATED, decorated ? GLFW_TRUE : GLFW_FALSE);
	}
	
	public static enum GLProfile
	{
		ANY,
		COMPAT,
		CORE
	}
}
