package org.barghos.vulkan.managed;

import org.lwjgl.vulkan.VkExtent3D;

public class MvkExtent3D
{
	public final int width;
	public final int height;
	public final int depth;
	
	public MvkExtent3D(VkExtent3D extent)
	{
		this.width = extent.width();
		this.height = extent.height();
		this.depth = extent.depth();
	}
}
