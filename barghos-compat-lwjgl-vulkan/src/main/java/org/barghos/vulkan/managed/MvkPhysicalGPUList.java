package org.barghos.vulkan.managed;

import static org.lwjgl.vulkan.VK14.*;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkPhysicalDevice;

public class MvkPhysicalGPUList
{	
	private MvkPhysicalGPU[] physicalGpus;
	
	public MvkPhysicalGPUList(Settings settings)
	{
		try(MemoryStack stack = MemoryStack.stackPush())
		{
			MvkPhysicalGPU[] physicalGpus = enumeratePhysicalDevices(settings.context.instance, stack);

			record RatedGpu(int score, MvkPhysicalGPU gpu) {}
			
			List<RatedGpu> suitablePhysicalGpus = new ArrayList<>();
			
			for(MvkPhysicalGPU physGpu : physicalGpus)
			{
				boolean meetsRequirements = true;
				for(RequiredFeatureProcessor processor : settings.requirementProcessors)
				{
					if(!processor.supportsFeatures(physGpu))
					{
						meetsRequirements = false;
						break;
					}
				}

				if(!meetsRequirements) continue;

				int score = 0;
				for(RatingProcessor processor : settings.ratingProcessors)
				{
					score += processor.rate(physGpu);
				}
				
				RatedGpu ratedGpu = new RatedGpu(score, physGpu);
				
				suitablePhysicalGpus.add(ratedGpu);
			}
			
			suitablePhysicalGpus.sort(Comparator.comparingInt(RatedGpu::score).reversed());
			
			MvkPhysicalGPU[] sortedPhysicalGpus = new MvkPhysicalGPU[suitablePhysicalGpus.size()];
			
			for(int i = 0; i < suitablePhysicalGpus.size(); i++)
			{
				sortedPhysicalGpus[i] = suitablePhysicalGpus.get(i).gpu;
			}
			
			this.physicalGpus = sortedPhysicalGpus;
		}
	}
	
	public MvkPhysicalGPU[] physicalGpus()
	{
		return this.physicalGpus;
	}
	
	public static MvkPhysicalGPU[] enumeratePhysicalDevices(VkInstance vkInstance, MemoryStack stack)
	{
		IntBuffer countBuf = stack.mallocInt(1);
		
		vkEnumeratePhysicalDevices(vkInstance, countBuf, null);
		
		int count = countBuf.get(0);
		
		PointerBuffer buf = stack.mallocPointer(count);
		
		vkEnumeratePhysicalDevices(vkInstance, countBuf, buf);

		MvkPhysicalGPU[] out = new MvkPhysicalGPU[count];
		for(int i = 0; i < count; i++)
		{
			out[i] = new MvkPhysicalGPU(new VkPhysicalDevice(buf.get(i), vkInstance));
		}
		
		return out;
	}
	
	public static class Settings
	{
		public MvkContext context;
		public final List<RequiredFeatureProcessor> requirementProcessors = new ArrayList<>(); 
		public final List<RatingProcessor> ratingProcessors = new ArrayList<>();
	}
	
	public static interface RequiredFeatureProcessor
	{
		boolean supportsFeatures(MvkPhysicalGPU physicalGpu);
	}
	
	public static interface RatingProcessor
	{
		int rate(MvkPhysicalGPU physicalGpu);
	}
}
