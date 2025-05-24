package org.barghos.vulkan.managed;

import java.nio.ByteBuffer;

import org.lwjgl.vulkan.VkPhysicalDeviceProperties;
import org.lwjgl.vulkan.VkPhysicalDeviceProperties2;

public class MvkPhysicalGPUProperties
{
	public final MvkVersion apiVersion;
	public final MvkVersion driverVersion;
	public final int vendorId;
	public final int deviceId;
	public final String deviceName;
	public final int deviceType;
	public final byte[] pipelineCacheUUIDs;
	
	public MvkPhysicalGPUProperties(VkPhysicalDeviceProperties2 properties)
	{
		VkPhysicalDeviceProperties baseProperties = properties.properties();
		
		ByteBuffer pipelineCacheUUIDBuf = baseProperties.pipelineCacheUUID();
		byte[] pipelineCacheUUIDs = new byte[pipelineCacheUUIDBuf.remaining()];
		
		for(int i = 0; i < pipelineCacheUUIDBuf.remaining(); i++)
		{
			pipelineCacheUUIDs[i] = pipelineCacheUUIDBuf.get(i);
		}
		
		this.apiVersion = MvkVersion.fromVulkanApi(baseProperties.apiVersion());
		this.driverVersion = MvkVersion.fromVulkan(baseProperties.driverVersion());
		this.vendorId = baseProperties.vendorID();
		this.deviceId = baseProperties.deviceID();
		this.deviceName = baseProperties.deviceNameString();
		this.deviceType = baseProperties.deviceType();
		this.pipelineCacheUUIDs = pipelineCacheUUIDs;
	}
}
