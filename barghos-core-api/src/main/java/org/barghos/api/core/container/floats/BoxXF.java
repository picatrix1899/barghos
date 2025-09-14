package org.barghos.api.core.container.floats;

import java.util.Arrays;

import org.barghos.annotation.ExtractionParam;

public class BoxXF
{
	private float[] r = new float[6];
	
	public BoxXF()
	{
		set(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
	}
	
	public BoxXF(BoxXF r)
	{
		set(r);
	}
	
	public BoxXF(float[] r)
	{
		set(r);
	}
	
	public BoxXF(float x, float y, float z, float width, float height, float depth)
	{
		set(x, y, z, width, height, depth);
	}
	
	public float x()
	{
		return this.r[0];
	}
	
	public float y()
	{
		return this.r[1];
	}
	
	public float z()
	{
		return this.r[2];
	}
	
	public float width()
	{
		return this.r[3];
	}
	
	public float height()
	{
		return this.r[4];
	}
	
	public float depth()
	{
		return this.r[5];
	}
	
	public BoxXF set(BoxXF r)
	{
		r.toArray(this.r);
		
		return this;
	}
	
	public BoxXF set(float[] r)
	{
		System.arraycopy(r, 0, this.r, 0, 6);
		
		return this;
	}
	
	public BoxXF set(float x, float y, float z, float width, float height, float depth)
	{
		r[0] = x;
		r[1] = y;
		r[2] = z;
		r[3] = width;
		r[4] = height;
		r[5] = depth;
		
		return this;
	}
	
	public float[] toArray()
	{
		return Arrays.copyOf(this.r, 6);
	}
	
	public float[] toArray(@ExtractionParam float[] res)
	{
		System.arraycopy(this.r, 0, res, 0, 6);
		
		return res;
	}
}
