package org.barghos.api.core.container.ints;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;

public class Extent2I
{
	private int[] e = new int[2];
	
	public Extent2I()
	{
		set(1, 1);
	}
	
	public Extent2I(Extent2I r)
	{
		set(r);
	}
	
	public Extent2I(int[] r)
	{
		set(r);
	}
	
	public Extent2I(int width, int height)
	{
		set(width, height);
	}
	
	public int width()
	{
		return this.e[0];
	}
	
	public int height()
	{
		return this.e[1];
	}
	
	public Extent2I set(Extent2I r)
	{
		r.toArray(this.e);
		
		return this;
	}
	
	public Extent2I set(int[] e)
	{
		System.arraycopy(e, 0, this.e, 0, 2);
		
		return this;
	}
	
	public Extent2I set(int width, int height)
	{
		e[0] = width;
		e[1] = height;
		
		return this;
	}
	
	public int[] toArray()
	{
		return Arrays.copyOf(this.e, 2);
	}
	
	public int[] toArray(@ExtractionParam int[] res)
	{
		System.arraycopy(this.e, 0, res, 0, 2);
		
		return res;
	}
}
