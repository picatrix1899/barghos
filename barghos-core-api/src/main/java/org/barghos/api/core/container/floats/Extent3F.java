package org.barghos.api.core.container.floats;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;

public class Extent3F
{
	private float[] e = new float[3];
	
	public Extent3F()
	{
		set(1.0f, 1.0f, 1.0f);
	}
	
	public Extent3F(Extent3F r)
	{
		set(r);
	}
	
	public Extent3F(float[] r)
	{
		set(r);
	}
	
	public Extent3F(float width, float height, float depth)
	{
		set(width, height, depth);
	}
	
	public float width()
	{
		return this.e[0];
	}
	
	public float height()
	{
		return this.e[1];
	}
	
	public float depth()
	{
		return this.e[2];
	}
	
	public Extent3F set(Extent3F r)
	{
		r.toArray(this.e);
		
		return this;
	}
	
	public Extent3F set(float[] e)
	{
		System.arraycopy(e, 0, this.e, 0, 3);
		
		return this;
	}
	
	public Extent3F set(float width, float height, float depth)
	{
		e[0] = width;
		e[1] = height;
		e[2] = depth;
		
		return this;
	}
	
	public float[] toArray()
	{
		return Arrays.copyOf(this.e, 3);
	}
	
	public float[] toArray(@ExtractionParam float[] res)
	{
		System.arraycopy(this.e, 0, res, 0, 3);
		
		return res;
	}
}
