package org.barghos.vulkan.managed;

import static org.lwjgl.vulkan.VK14.*;

import java.lang.ref.Cleaner.Cleanable;
import java.nio.LongBuffer;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkMemoryAllocateInfo;

public class MvkMemory
{
	private long handle = VK_NULL_HANDLE;
	private long mappedHandle = VK_NULL_HANDLE;
	private final long size;
	
	private final MvkContext context;
	private final Cleanable cleanable;
	
	public MvkMemory(Settings settings)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			this.context = settings.context;
			
			VkMemoryAllocateInfo memoryAllocateInfo = VkMemoryAllocateInfo.calloc(stack);
			memoryAllocateInfo.sType$Default();
			memoryAllocateInfo.allocationSize(settings.size);
			memoryAllocateInfo.memoryTypeIndex(settings.context.physicalGpu.findMemoryType(settings.memoryTypeBits, settings.memoryTypeBits, stack));

			this.handle = allocateMemory(this.context.device, memoryAllocateInfo, stack);
			
			this.size = settings.size;
			
			this.cleanable = MvkCleaner.CLEANER.register(this, () -> {
				if(this.handle == VK_NULL_HANDLE) return;
				
				if(this.mappedHandle != VK_NULL_HANDLE) vkUnmapMemory(this.context.device, this.handle);
				this.mappedHandle = VK_NULL_HANDLE;
				
				vkFreeMemory(this.context.device, handle, null);
				
				this.handle = VK_NULL_HANDLE;
			});
		}
	}
	
	public MvkContext context()
	{
		return this.context;
	}
	
	public long handle()
	{
		ensureValid();
		
		return this.handle;
	}
	
	public long mappedHandle()
	{
		ensureValid();
		
		return this.mappedHandle;
	}
	
	public boolean isMapped()
	{
		return this.mappedHandle != VK_NULL_HANDLE;
	}
	
	public void map()
	{
		ensureValid();
		
		if(this.isMapped()) return;
		
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			this.mappedHandle = mapMemory(this.context.device, this.handle, 0, this.size, 0, stack);
		}
	}
	
	public void map(long offset, long size)
	{
		ensureValid();
		
		if(this.isMapped()) return;
		
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			this.mappedHandle = mapMemory(this.context.device, this.handle, offset, size, 0, stack);
		}
	}
	
	public void unmap()
	{
		ensureValid();
		
		if(!this.isMapped()) return;
		
		if(this.mappedHandle != VK_NULL_HANDLE) vkUnmapMemory(this.context.device, this.handle);
		this.mappedHandle = VK_NULL_HANDLE;
	}
	
	public boolean isValid()
	{
		return this.handle != VK_NULL_HANDLE;
	}
	
	public void close()
	{
		this.cleanable.clean();
	}
	
	private void ensureValid()
	{
		if(this.handle == VK_NULL_HANDLE) throw new RuntimeException("Memory object already closed.");
	}
	
	public static long mapMemory(VkDevice device, long memory, long offset, long size, int flags, MemoryStack stack)
	{
		PointerBuffer buf = stack.mallocPointer(1);
		
		vkMapMemory(device, memory, offset, size, flags, buf);
		
		return buf.get(0);
	}
	
	public static long allocateMemory(VkDevice device, VkMemoryAllocateInfo allocateInfo, MemoryStack stack)
	{
		LongBuffer buf = stack.mallocLong(1);
		
		vkAllocateMemory(device, allocateInfo, null, buf);
		
		return buf.get(0);
	}
	
	public static class Settings
	{
		public MvkContext context;
		public long size;
		public int memoryTypeBits;
		public int properties;
	}
}
