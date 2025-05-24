package org.barghos.vulkan.managed;

import org.lwjgl.vulkan.VkPhysicalDeviceFeatures;
import org.lwjgl.vulkan.VkPhysicalDeviceFeatures2;

public class MvkPhysicalGPUFeatures
{
	public final boolean geometryShader;
	public final boolean tesselationShader;
	public final boolean sparseBinding;
	
	public MvkPhysicalGPUFeatures(VkPhysicalDeviceFeatures2 properties)
	{
		VkPhysicalDeviceFeatures baseProperties = properties.features();
		
		this.geometryShader = baseProperties.geometryShader();
		this.tesselationShader = baseProperties.tessellationShader();
		this.sparseBinding = baseProperties.sparseBinding();
	}
}
