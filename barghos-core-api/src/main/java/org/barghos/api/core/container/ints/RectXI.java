package org.barghos.api.core.container.ints;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;

public class RectXI
{
	private int[] r = new int[4];
	
	public RectXI()
	{
		set(0, 0, 1, 1);
	}
	
	public RectXI(RectXI r)
	{
		set(r);
	}
	
	public RectXI(int[] r)
	{
		set(r);
	}
	
	public RectXI(int x, int y, int width, int height)
	{
		set(x, y, width, height);
	}
	
	public int x()
	{
		return this.r[0];
	}
	
	public int y()
	{
		return this.r[1];
	}
	
	public int width()
	{
		return this.r[2];
	}
	
	public int height()
	{
		return this.r[3];
	}
	
	public RectXI set(RectXI r)
	{
		r.toArray(this.r);
		
		return this;
	}
	
	public RectXI set(int[] r)
	{
		System.arraycopy(r, 0, this.r, 0, 4);
		
		return this;
	}
	
	public RectXI set(int x, int y, int width, int height)
	{
		r[0] = x;
		r[1] = y;
		r[2] = width;
		r[3] = height;
		
		return this;
	}
	
	public int[] toArray()
	{
		return Arrays.copyOf(this.r, 4);
	}
	
	public int[] toArray(@ExtractionParam int[] res)
	{
		System.arraycopy(this.r, 0, res, 0, 4);
		
		return res;
	}
}
