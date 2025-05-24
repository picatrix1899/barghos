package org.barghos.vulkan.managed;

import org.lwjgl.vulkan.VkMemoryType;

public class MvkMemoryType
{
	public final int heapIndex;
	public final int propertyFlags;
	
	public MvkMemoryType(VkMemoryType memoryType)
	{
		this.heapIndex = memoryType.heapIndex();
		this.propertyFlags = memoryType.propertyFlags();
	}
}
