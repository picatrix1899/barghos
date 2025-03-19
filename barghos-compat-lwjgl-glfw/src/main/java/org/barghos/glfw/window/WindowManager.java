package org.barghos.glfw.window;

import org.barghos.glfw.Glfw;

public class WindowManager
{
	public Window master;
	
	public void createMasterWindow(WindowSettings settings, WindowState state)
	{
		Window window = createWindowInstance(settings, state);
		
		if(window == null) throw new Error();
		
		this.master = window;
	}
	
	private Window createWindowInstance(WindowSettings settings, WindowState state)
	{
		WindowHint.startVisible(false);
		WindowHint.doubleBuffering(true);
		
		WindowHint.samples(settings.msSamples);
		WindowHint.resizable(settings.resizable);

        long handle = Glfw.glfwCreateWindow(state.width, state.height, state.title, state.monitor, settings.share);

		if(handle == 0) return null;
		
		if(state.posX != -1 && state.posY != -1) Glfw.glfwSetWindowPos(handle, state.posX, state.posY);
		
		Window window = new Window(0, handle, state);
		
		window.forceStateUpdate();

		window.makeContextCurrent();
		
		Glfw.glfwSwapInterval(0);
		
		return window;
	}
	
	public void destroyMasterWindow()
	{
		if(this.master == null) return;
		
		Glfw.glfwDestroyWindow(this.master.handle());
		
		this.master = null;
	}
}
