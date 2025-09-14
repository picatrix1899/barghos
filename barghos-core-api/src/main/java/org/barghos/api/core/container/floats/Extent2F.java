package org.barghos.api.core.container.floats;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;

public class Extent2F
{
	private float[] e = new float[2];
	
	public Extent2F()
	{
		set(1.0f, 1.0f);
	}
	
	public Extent2F(Extent2F r)
	{
		set(r);
	}
	
	public Extent2F(float[] r)
	{
		set(r);
	}
	
	public Extent2F(float width, float height)
	{
		set(width, height);
	}
	
	public float width()
	{
		return this.e[0];
	}
	
	public float height()
	{
		return this.e[1];
	}
	
	public Extent2F set(Extent2F r)
	{
		r.toArray(this.e);
		
		return this;
	}
	
	public Extent2F set(float[] e)
	{
		System.arraycopy(e, 0, this.e, 0, 2);
		
		return this;
	}
	
	public Extent2F set(float width, float height)
	{
		e[0] = width;
		e[1] = height;
		
		return this;
	}
	
	public float[] toArray()
	{
		return Arrays.copyOf(this.e, 2);
	}
	
	public float[] toArray(@ExtractionParam float[] res)
	{
		System.arraycopy(this.e, 0, res, 0, 2);
		
		return res;
	}
}
