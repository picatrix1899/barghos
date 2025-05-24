package org.barghos.vulkan.managed;

import static org.lwjgl.vulkan.KHRGetSurfaceCapabilities2.*;
import static org.lwjgl.vulkan.KHRSurface.*;
import static org.lwjgl.vulkan.VK14.*;

import java.nio.IntBuffer;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkPhysicalDevice;
import org.lwjgl.vulkan.VkPhysicalDeviceFeatures2;
import org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties2;
import org.lwjgl.vulkan.VkPhysicalDeviceProperties2;
import org.lwjgl.vulkan.VkPhysicalDeviceSurfaceInfo2KHR;
import org.lwjgl.vulkan.VkQueueFamilyProperties2;
import org.lwjgl.vulkan.VkSurfaceCapabilities2KHR;
import org.lwjgl.vulkan.VkSurfaceFormat2KHR;

public class MvkPhysicalGPU
{
	private VkPhysicalDevice handle;
	private MvkPhysicalGPUProperties deviceProperties;
	private MvkPhysicalGPUFeatures deviceFeatures;
	private MvkPhysicalGPUMemoryProperties memoryProperties;
	private MvkQueueFamilyProperties[] queueFamilyPropertyListArray;
	
	public MvkPhysicalGPU(VkPhysicalDevice handle)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			this.handle = handle;
			
			this.deviceProperties = getPhysicalDeviceProperties(this.handle, stack);
			this.deviceFeatures = getPhysicalDeviceFeatures(this.handle, stack);
			this.memoryProperties = getPhysicalDeviceMemoryProperties(this.handle, stack);
			this.queueFamilyPropertyListArray = getPhysicalDeviceQueueFamilyProperties(this.handle, stack);
		}
	}
	
	public VkPhysicalDevice handle()
	{
		return this.handle;
	}

	public MvkPhysicalGPUProperties deviceProperties()
	{
		return this.deviceProperties;
	}
	
	public MvkPhysicalGPUFeatures deviceFeatures()
	{
		return this.deviceFeatures;
	}

	public MvkPhysicalGPUMemoryProperties memoryProperties()
	{
		return this.memoryProperties;
	}

	public MvkQueueFamilyProperties[] queueFamilyPropertyListArray()
	{
		return this.queueFamilyPropertyListArray;
	}
	
	public boolean supportsSurface(int queueFamilyIndex, long surface, MemoryStack stack)
	{
		return getPhysicalDeviceSurfaceSupportKHR(this.handle, queueFamilyIndex, surface, stack);
	}

	public int findMemoryType(int typeFilter, int properties, MemoryStack stack)
	{
		for(int i = 0; i < this.memoryProperties.memoryTypes.length; i++)
		{
			if((typeFilter & (1 << i)) != 0 && (this.memoryProperties.memoryTypes[i].propertyFlags & properties) == properties)
			{
				return i;
			}
		}
		
		throw new Error();
	}
	
	public static MvkSurfaceFormat[] getPhysicalDeviceSurfaceFormats(VkPhysicalDevice physicalDevice, long surface, MemoryStack stack)
	{
		VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo = VkPhysicalDeviceSurfaceInfo2KHR.calloc(stack);
		surfaceInfo.sType$Default();
		surfaceInfo.surface(surface);
		
		IntBuffer countBuf = stack.mallocInt(1);
		
		vkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, surfaceInfo, countBuf, null);
		
		int count = countBuf.get(0);
		
		VkSurfaceFormat2KHR.Buffer buf = VkSurfaceFormat2KHR.calloc(count, stack);
	
		for (int i = 0; i < count; i++) {
			buf.get(i).sType$Default();
		}
		
		vkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, surfaceInfo, countBuf, buf);
		
		MvkSurfaceFormat[] out = new MvkSurfaceFormat[count];
		
		for(int i = 0; i < count; i++)
		{
			VkSurfaceFormat2KHR format = buf.get(i);
			MvkSurfaceFormat formats = new MvkSurfaceFormat(format);
			
			out[i] = formats;
		}
			
		return out;
	}
	
	private static MvkPhysicalGPUMemoryProperties getPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, MemoryStack stack)
	{
		VkPhysicalDeviceMemoryProperties2 deviceFeatures = VkPhysicalDeviceMemoryProperties2.calloc(stack);
		deviceFeatures.sType$Default();
		
		vkGetPhysicalDeviceMemoryProperties2(physicalDevice, deviceFeatures);
		
		return new MvkPhysicalGPUMemoryProperties(deviceFeatures);
	}
	
	private static MvkPhysicalGPUFeatures getPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, MemoryStack stack)
	{
		VkPhysicalDeviceFeatures2 deviceFeatures = VkPhysicalDeviceFeatures2.calloc(stack);
		deviceFeatures.sType$Default();
		
		vkGetPhysicalDeviceFeatures2(physicalDevice, deviceFeatures);
		
		return new MvkPhysicalGPUFeatures(deviceFeatures);
	}
	
	private static MvkPhysicalGPUProperties getPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, MemoryStack stack)
	{
		VkPhysicalDeviceProperties2 deviceProperties = VkPhysicalDeviceProperties2.calloc(stack);
		deviceProperties.sType$Default();
		
		vkGetPhysicalDeviceProperties2(physicalDevice, deviceProperties);
		
		return new MvkPhysicalGPUProperties(deviceProperties);
	}
	
	private static MvkQueueFamilyProperties[] getPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, MemoryStack stack)
	{
		IntBuffer countBuf = stack.mallocInt(1);
		
		vkGetPhysicalDeviceQueueFamilyProperties2(physicalDevice, countBuf, null);
		
		int count = countBuf.get(0);
		
		VkQueueFamilyProperties2.Buffer buf = VkQueueFamilyProperties2.calloc(count, stack);
	
		for (int i = 0; i < count; i++) {
			buf.get(i).sType$Default();
		}
		
		vkGetPhysicalDeviceQueueFamilyProperties2(physicalDevice, countBuf, buf);
		
		MvkQueueFamilyProperties[] out = new MvkQueueFamilyProperties[count];
		
		for(int i = 0; i < count; i++)
		{
			VkQueueFamilyProperties2 prop = buf.get(i);
			MvkQueueFamilyProperties properties = new MvkQueueFamilyProperties(i, prop);
			
			out[i] = properties;
		}
			
		return out;
	}
	
	private static boolean getPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long surface, MemoryStack stack)
	{
		IntBuffer buf = stack.mallocInt(1);
		
		vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, queueFamilyIndex, surface, buf);
		
		return buf.get(0) == VK_TRUE;
	}
	
	public static MvkSurfaceCapabilities getPhysicalDeviceSurfaceCapabilities(VkPhysicalDevice physicalDevice, long surface, MemoryStack stack)
	{
		VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo = VkPhysicalDeviceSurfaceInfo2KHR.calloc(stack);
		surfaceInfo.sType$Default();
		surfaceInfo.surface(surface);
		
		VkSurfaceCapabilities2KHR surfaceCapabilities = VkSurfaceCapabilities2KHR.calloc(stack);
		surfaceCapabilities.sType$Default();
		
		vkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice, surfaceInfo, surfaceCapabilities);
		
		return new MvkSurfaceCapabilities(surfaceCapabilities);
	}
}
