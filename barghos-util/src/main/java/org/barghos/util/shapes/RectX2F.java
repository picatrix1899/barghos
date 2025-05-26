package org.barghos.util.shapes;

public class RectX2F
{
	private float[] r = new float[4];
	
	public RectX2F()
	{
		set(0.0f, 0.0f, 1.0f, 1.0f);
	}
	
	public RectX2F(RectX2F r)
	{
		
	}
	
	public RectX2F(float[] r)
	{
		
	}
	
	public RectX2F(float x, float y, float width, float height)
	{
		
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
	
	public RectX2F set(float x, float y, float width, float height)
	{
		r[0] = x;
		r[1] = y;
		r[2] = width;
		r[3] = height;
		
		return this;
	}
}
