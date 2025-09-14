package org.barghos.api.core.container.floats;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;

public class RectXF
{
	private float[] r = new float[4];
	
	public RectXF()
	{
		set(0.0f, 0.0f, 1.0f, 1.0f);
	}
	
	public RectXF(RectXF r)
	{
		set(r);
	}
	
	public RectXF(float[] r)
	{
		set(r);
	}
	
	public RectXF(float x, float y, float width, float height)
	{
		set(x, y, width, height);
	}
	
	public float x()
	{
		return this.r[0];
	}
	
	public float y()
	{
		return this.r[1];
	}
	
	public float width()
	{
		return this.r[2];
	}
	
	public float height()
	{
		return this.r[3];
	}
	
	public RectXF set(RectXF r)
	{
		r.toArray(this.r);
		
		return this;
	}
	
	public RectXF set(float[] r)
	{
		System.arraycopy(r, 0, this.r, 0, 4);
		
		return this;
	}
	
	public RectXF set(float x, float y, float width, float height)
	{
		r[0] = x;
		r[1] = y;
		r[2] = width;
		r[3] = height;
		
		return this;
	}
	
	public float[] toArray()
	{
		return Arrays.copyOf(this.r, 4);
	}
	
	public float[] toArray(@ExtractionParam float[] res)
	{
		System.arraycopy(this.r, 0, res, 0, 4);
		
		return res;
	}
}
