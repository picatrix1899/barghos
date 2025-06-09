package org.barghos.util.container.ints;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;

public class Extent3I
{
	private int[] e = new int[3];
	
	public Extent3I()
	{
		set(1, 1, 1);
	}
	
	public Extent3I(Extent3I r)
	{
		set(r);
	}
	
	public Extent3I(int[] r)
	{
		set(r);
	}
	
	public Extent3I(int width, int height, int depth)
	{
		set(width, height, depth);
	}
	
	public int width()
	{
		return this.e[0];
	}
	
	public int height()
	{
		return this.e[1];
	}
	
	public int depth()
	{
		return this.e[2];
	}
	
	public Extent3I set(Extent3I r)
	{
		r.toArray(this.e);
		
		return this;
	}
	
	public Extent3I set(int[] e)
	{
		System.arraycopy(e, 0, this.e, 0, 3);
		
		return this;
	}
	
	public Extent3I set(int width, int height, int depth)
	{
		e[0] = width;
		e[1] = height;
		e[2] = depth;
		
		return this;
	}
	
	public int[] toArray()
	{
		return Arrays.copyOf(this.e, 3);
	}
	
	public int[] toArray(@ExtractionParam int[] res)
	{
		System.arraycopy(this.e, 0, res, 0, 3);
		
		return res;
	}
}
