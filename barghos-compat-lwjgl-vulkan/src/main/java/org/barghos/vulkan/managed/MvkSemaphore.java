package org.barghos.vulkan.managed;

import static org.lwjgl.vulkan.VK14.*;

import java.lang.ref.Cleaner.Cleanable;
import java.nio.LongBuffer;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkSemaphoreCreateInfo;
import org.lwjgl.vulkan.VkSemaphoreTypeCreateInfo;

public class MvkSemaphore
{
	private long handle = VK_NULL_HANDLE;
	
	private final MvkContext context;
	private final Cleanable cleanable;
	
	public MvkSemaphore(Settings settings)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			this.context = settings.context;

			VkSemaphoreCreateInfo semaphoreCreateInfo = VkSemaphoreCreateInfo.calloc(stack);
			semaphoreCreateInfo.sType$Default();
			
			if(settings.useTypeCreate)
			{
				int type = switch(settings.type) {
					case BINARY -> VK_SEMAPHORE_TYPE_BINARY;
					case TIMELINE -> VK_SEMAPHORE_TYPE_TIMELINE;
					default -> VK_SEMAPHORE_TYPE_BINARY;
				};
				
				VkSemaphoreTypeCreateInfo semaphoreTypeCreateInfo = VkSemaphoreTypeCreateInfo.calloc(stack);
				semaphoreTypeCreateInfo.sType$Default();
				semaphoreTypeCreateInfo.initialValue(settings.initialValue);
				semaphoreTypeCreateInfo.semaphoreType(type);
				
				semaphoreCreateInfo.pNext(semaphoreTypeCreateInfo);
			}

			this.handle = createSemaphore(this.context.device, semaphoreCreateInfo, stack);
			
			this.cleanable = MvkCleaner.CLEANER.register(this, () -> {
				if(this.handle == VK_NULL_HANDLE) return;
				
				vkDestroySemaphore(this.context.device, handle, null);
				
				this.handle = VK_NULL_HANDLE;
			});
		}
	}
	
	public long handle()
	{
		ensureValid();
		
		return this.handle;
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
		if(this.handle == VK_NULL_HANDLE) throw new RuntimeException("Semaphore object already closed.");
	}
	
	private static long createSemaphore(VkDevice device, VkSemaphoreCreateInfo createInfo, MemoryStack stack)
	{
		LongBuffer buf = stack.callocLong(1);
		vkCreateSemaphore(device, createInfo, null, buf);
		
		return buf.get(0);
	}
	
	public static class Settings
	{
		private MvkContext context;
		
		private boolean useTypeCreate;
		private long initialValue;
		private Type type;
		
		public MvkContext context()
		{
			return this.context;
		}
		
		public Settings context(MvkContext context)
		{
			this.context = context;
			
			return this;
		}
		
		public Type type()
		{
			return this.type;
		}
		
		public Settings type(Type type)
		{
			this.type = type;
			this.useTypeCreate = true;
			
			return this;
		}
		
		public Settings timeline()
		{
			this.type = Type.TIMELINE;
			this.useTypeCreate = true;
			
			return this;
		}
		
		public Settings binary()
		{
			this.type = Type.BINARY;
			this.useTypeCreate = true;
			
			return this;
		}
		
		public long initialValue()
		{
			return this.initialValue;
		}
		
		public Settings initialValue(long value)
		{
			this.initialValue = value;
			this.useTypeCreate = true;
			
			return this;
		}
	}
	
	public static enum Type
	{
		BINARY,
		TIMELINE
		;
	}
}
