package org.barghos.vulkan.managed;

import org.barghos.util.id.IdGeneratorL;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkInstance;

public class MvkContext
{
	public static final IdGeneratorL CONTEXT_ID_COUNTER = new IdGeneratorL();
	
	public final long id;
	
	public VkInstance instance;
	public VkDevice device;
	public MvkPhysicalGPU physicalGpu;
	
	public MvkContext()
	{
		this.id = CONTEXT_ID_COUNTER.next();
	}
	
	public boolean equals(MvkContext context)
	{
		if(context == null) return false;
		if(context == this) return true;
		
		return context.id == this.id;
	}
}
