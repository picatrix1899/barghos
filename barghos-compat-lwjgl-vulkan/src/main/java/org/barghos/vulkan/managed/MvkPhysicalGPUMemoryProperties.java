package org.barghos.vulkan.managed;

import org.lwjgl.vulkan.VkMemoryType;
import org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties;
import org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2;

public class MvkPhysicalGPUMemoryProperties
{
	public final MvkMemoryType[] memoryTypes;
	
	public MvkPhysicalGPUMemoryProperties(VkPhysicalDeviceMemoryProperties2 properties)
	{
		VkPhysicalDeviceMemoryProperties baseProperties = properties.memoryProperties();
		
		VkMemoryType.Buffer memoryTypesBuf = baseProperties.memoryTypes();
		MvkMemoryType[] memoryTypes = new MvkMemoryType[memoryTypesBuf.remaining()];
		for(int i = 0; i < memoryTypesBuf.remaining(); i++)
		{
			memoryTypes[i] = new MvkMemoryType(memoryTypesBuf.get(i));
		}
		
		this.memoryTypes = memoryTypes;
	}
}
