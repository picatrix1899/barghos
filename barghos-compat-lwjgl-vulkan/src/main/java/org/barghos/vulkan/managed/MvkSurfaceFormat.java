package org.barghos.vulkan.managed;

import org.lwjgl.vulkan.VkSurfaceFormat2KHR;
import org.lwjgl.vulkan.VkSurfaceFormatKHR;

public class MvkSurfaceFormat
{
	public final int format;
	public final int colorSpace;
	
	public MvkSurfaceFormat(VkSurfaceFormat2KHR format)
	{
		VkSurfaceFormatKHR baseFormat = format.surfaceFormat();
		this.format = baseFormat.format();
		this.colorSpace = baseFormat.colorSpace();
	}
}
