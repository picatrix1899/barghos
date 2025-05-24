package org.barghos.vulkan.managed;

import static org.lwjgl.vulkan.VK14.*;

public class MvkVersion
{
	public final int variant;
	public final int major;
	public final int minor;
	public final int patch;
	
	public MvkVersion(int variant, int major, int minor, int patch)
	{
		this.variant = variant;
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}
	
	public MvkVersion(int major, int minor, int patch)
	{
		this.variant = 0;
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}
	
	public int toVulkan()
	{
		return VK_MAKE_VERSION(this.major, this.minor, this.patch);
	}
	
	public int toVulkanApi()
	{
		return VK_MAKE_API_VERSION(this.variant, this.major, this.minor, this.patch);
	}
	
	public static MvkVersion fromVulkan(int version)
	{
		int major = VK_VERSION_MAJOR(version);
		int minor = VK_VERSION_MINOR(version);
		int patch = VK_VERSION_PATCH(version);
		
		return new MvkVersion(major, minor, patch);
	}
	
	public static MvkVersion fromVulkanApi(int version)
	{
		int variant = VK_API_VERSION_VARIANT(version);
		int major = VK_VERSION_MAJOR(version);
		int minor = VK_VERSION_MINOR(version);
		int patch = VK_VERSION_PATCH(version);
		
		return new MvkVersion(variant, major, minor, patch);
	}
}
