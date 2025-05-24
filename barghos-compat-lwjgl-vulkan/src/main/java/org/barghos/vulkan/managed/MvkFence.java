package org.barghos.vulkan.managed;

import static org.lwjgl.vulkan.VK14.*;

import java.lang.ref.Cleaner.Cleanable;
import java.nio.LongBuffer;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkFenceCreateInfo;

public class MvkFence
{
	private long handle = VK_NULL_HANDLE;
	
	private final MvkContext context;
	private final Cleanable cleanable;
	
	public MvkFence(Settings settings)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			this.context = settings.context;
			
			int flags = 0;
			if(settings.isSignaled) flags |= VK_FENCE_CREATE_SIGNALED_BIT;
			
			VkFenceCreateInfo fenceCreateInfo = VkFenceCreateInfo.calloc(stack);
			fenceCreateInfo.sType$Default();
			fenceCreateInfo.flags(flags);
			
			this.handle = createFence(this.context.device, fenceCreateInfo, stack);
			
			this.cleanable = MvkCleaner.CLEANER.register(this, () -> {
				if(this.handle == VK_NULL_HANDLE) return;
				
				vkDestroyFence(this.context.device, this.handle, null);
				
				this.handle = VK_NULL_HANDLE;
			});
		}
	}

	public long handle()
	{
		ensureValid();
		
		return this.handle;
	}
	
	public void waitFor()
	{
		ensureValid();

		vkWaitForFences(this.context.device, this.handle, true, Long.MAX_VALUE);
	}
	
	public void waitFor(long timeout)
	{
		ensureValid();
		
		vkWaitForFences(this.context.device, this.handle, true, timeout);
	}
	
	public void reset()
	{
		ensureValid();
		
		vkResetFences(this.context.device, this.handle);
	}

	public boolean isValid()
	{
		return this.handle != VK_NULL_HANDLE;
	}
	
	public void close()
	{
		this.cleanable.clean();
	}
	
	public static void waitForAll(MvkFence[] fences)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			LongBuffer buf = stack.mallocLong(fences.length);
		
			MvkContext context = fences[0].context;
			
			for(int i = 0; i < fences.length; i++)
			{
				buf.put(i, fences[i].handle);
			}

			vkWaitForFences(context.device, buf, true, Long.MAX_VALUE);
		}
	}
	
	public static void waitForAll(MvkFence[] fences, long timeout)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			LongBuffer buf = stack.mallocLong(fences.length);
		
			MvkContext context = fences[0].context;
			
			for(int i = 0; i < fences.length; i++)
			{
				buf.put(i, fences[i].handle);
			}

			vkWaitForFences(context.device, buf, true, timeout);
		}
	}
	
	public static void waitForOne(MvkFence[] fences)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			LongBuffer buf = stack.mallocLong(fences.length);
		
			MvkContext context = fences[0].context;
			
			for(int i = 0; i < fences.length; i++)
			{
				buf.put(i, fences[i].handle);
			}

			vkWaitForFences(context.device, buf, false, Long.MAX_VALUE);
		}
	}
	
	public static void waitForOne(MvkFence[] fences, long timeout)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			LongBuffer buf = stack.mallocLong(fences.length);
		
			MvkContext context = fences[0].context;
			
			for(int i = 0; i < fences.length; i++)
			{
				buf.put(i, fences[i].handle);
			}

			vkWaitForFences(context.device, buf, false, timeout);
		}
	}
	
	private void ensureValid()
	{
		if(this.handle == VK_NULL_HANDLE) throw new RuntimeException("Fence object already closed.");
	}
	
	private static long createFence(VkDevice device, VkFenceCreateInfo createInfo, MemoryStack stack)
	{
		LongBuffer buf = stack.callocLong(1);
		vkCreateFence(device, createInfo, null, buf);
		
		return buf.get(0);
	}
	
	public static class Settings
	{
		private MvkContext context;
		
		private boolean isSignaled;
		
		public MvkContext context()
		{
			return this.context;
		}
		
		public Settings context(MvkContext context)
		{
			this.context = context;
			
			return this;
		}
		
		public boolean isSignaled()
		{
			return this.isSignaled;
		}
		
		public Settings signaled()
		{
			this.isSignaled = true;
			
			return this;
		}
		
		public Settings isSignaled(boolean signaled)
		{
			this.isSignaled = signaled;
			
			return this;
		}
	}
}
