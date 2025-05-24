package org.barghos.vulkan.managed;

import org.lwjgl.vulkan.VkExtent2D;

public class MvkExtent2D
{
	public final int width;
	public final int height;
	
	public MvkExtent2D(VkExtent2D extent)
	{
		this.width = extent.width();
		this.height = extent.height();
	}
}
