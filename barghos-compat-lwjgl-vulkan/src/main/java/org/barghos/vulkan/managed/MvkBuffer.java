package org.barghos.vulkan.managed;

import static org.lwjgl.vulkan.VK14.*;

import java.lang.ref.Cleaner.Cleanable;
import java.nio.LongBuffer;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkBufferCreateInfo;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkMemoryRequirements;

public class MvkBuffer
{
	private long handle;
	private MvkMemory memory;
	
	private final Cleanable cleanable;
	
	public MvkBuffer(Settings settings)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			VkBufferCreateInfo bufferCreateInfo = VkBufferCreateInfo.calloc(stack);
			bufferCreateInfo.sType$Default();
			bufferCreateInfo.size(settings.size);
			bufferCreateInfo.usage(settings.usage);
			bufferCreateInfo.sharingMode(settings.sharingMode);
			
			long buffer = createBuffer(settings.context.device, bufferCreateInfo, stack);
			
			VkMemoryRequirements memoryRequirements = getBufferMemoryRequirements(settings.context.device, buffer, stack);
			
			MvkMemory.Settings memoryCreateSettings = new MvkMemory.Settings();
			memoryCreateSettings.size = memoryRequirements.size();
			memoryCreateSettings.memoryTypeBits = memoryRequirements.memoryTypeBits();
			memoryCreateSettings.properties = settings.properties;
			
			MvkMemory memory = new MvkMemory(memoryCreateSettings);
			
			vkBindBufferMemory(settings.context.device, buffer, memory.handle(), 0);
			
			this.handle = buffer;
			this.memory = memory;

			this.cleanable = MvkCleaner.CLEANER.register(this, () -> {
				vkDestroyBuffer(settings.context.device, handle, null);
				this.memory.close();
			});
		}
	}
	
	public boolean isValid()
	{
		return this.handle != VK_NULL_HANDLE;
	}
	
	public long handle()
	{
		ensureValid();
		
		return this.handle;
	}
	
	public long memoryHandle()
	{
		ensureValid();
		
		return this.memory.handle();
	}
	
	public long mappedMemoryHandle()
	{
		ensureValid();
		
		return this.memory.mappedHandle();
	}
	
	public boolean isMapped()
	{
		ensureValid();
		
		return this.memory.isMapped();
	}
	
	public void map()
	{
		ensureValid();
		
		this.memory.map();
	}
	
	public void unmap()
	{
		ensureValid();
		
		this.memory.unmap();
	}
	
	public void close()
	{
		this.cleanable.clean();
	}

	private void ensureValid()
	{
		if(this.handle == VK_NULL_HANDLE) throw new RuntimeException("Fence object already closed.");
	}
	
	private static VkMemoryRequirements getBufferMemoryRequirements(VkDevice device, long buffer, MemoryStack stack)
	{
		VkMemoryRequirements memoryRequirements = VkMemoryRequirements.calloc(stack);
		
		vkGetBufferMemoryRequirements(device, buffer, memoryRequirements);
		
		return memoryRequirements;
	}
	
	private static long createBuffer(VkDevice device, VkBufferCreateInfo createInfo, MemoryStack stack)
	{
		LongBuffer buf = stack.callocLong(1);
		
		vkCreateBuffer(device, createInfo, null, buf);
		
		return buf.get(0);
	}
	
	public static class Settings
	{
		private MvkContext context;
		
		public long size;
		public int usage;
		public int sharingMode;
		public int properties;
		
		public MvkContext context()
		{
			return this.context;
		}
		
		public Settings context(MvkContext context)
		{
			this.context = context;
			
			return this;
		}
		
	}
}
