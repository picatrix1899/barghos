package org.barghos.util.container.ints;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;

public class BoxXI
{
	private int[] r = new int[6];
	
	public BoxXI()
	{
		set(0, 0, 0, 1, 1, 1);
	}
	
	public BoxXI(BoxXI r)
	{
		set(r);
	}
	
	public BoxXI(int[] r)
	{
		set(r);
	}
	
	public BoxXI(int x, int y, int z, int width, int height, int depth)
	{
		set(x, y, z, width, height, depth);
	}
	
	public int x()
	{
		return this.r[0];
	}
	
	public int y()
	{
		return this.r[1];
	}
	
	public int z()
	{
		return this.r[2];
	}
	
	public int width()
	{
		return this.r[3];
	}
	
	public int height()
	{
		return this.r[4];
	}
	
	public int depth()
	{
		return this.r[5];
	}
	
	public BoxXI set(BoxXI r)
	{
		r.toArray(this.r);
		
		return this;
	}
	
	public BoxXI set(int[] r)
	{
		System.arraycopy(r, 0, this.r, 0, 6);
		
		return this;
	}
	
	public BoxXI set(int x, int y, int z, int width, int height, int depth)
	{
		r[0] = x;
		r[1] = y;
		r[2] = z;
		r[3] = width;
		r[4] = height;
		r[5] = depth;
		
		return this;
	}
	
	public int[] toArray()
	{
		return Arrays.copyOf(this.r, 6);
	}
	
	public int[] toArray(@ExtractionParam int[] res)
	{
		System.arraycopy(this.r, 0, res, 0, 6);
		
		return res;
	}
}
