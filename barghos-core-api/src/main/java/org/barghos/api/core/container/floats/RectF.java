package org.barghos.api.core.container.floats;

import org.barghos.annotation.ExtractionParam;

public class RectF
{
	public float x;
	public float y;
	public float width;
	public float height;
	
	public RectF()
	{
		set(0.0f, 0.0f, 1.0f, 1.0f);
	}
	
	public RectF(RectF r)
	{
		set(r);
	}
	
	public RectF(float[] r)
	{
		set(r);
	}
	
	public RectF(float x, float y, float width, float height)
	{
		set(x, y, width, height);
	}
	
	public float x()
	{
		return this.x;
	}
	
	public float y()
	{
		return this.y;
	}
	
	public float width()
	{
		return this.width;
	}
	
	public float height()
	{
		return this.height;
	}
	
	public RectF set(RectF r)
	{
		this.x = r.x;
		this.y = r.y;
		this.width = r.width;
		this.height = r.height;
		
		return this;
	}
	
	public RectF set(float[] r)
	{
		this.x = r[0];
		this.y = r[1];
		this.width = r[2];
		this.height = r[3];
		
		return this;
	}
	
	public RectF set(float x, float y, float width, float height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		return this;
	}
	
	public float[] toArray()
	{
		return new float[] {this.x, this.y, this.width, this.height};
	}
	
	public float[] toArray(@ExtractionParam float[] res)
	{
		res[0] = this.x;
		res[1] = this.y;
		res[2] = this.width;
		res[3] = this.height;
		
		return res;
	}
}
