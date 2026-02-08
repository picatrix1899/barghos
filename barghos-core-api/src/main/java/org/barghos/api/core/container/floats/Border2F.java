package org.barghos.api.core.container.floats;

public class Border2F
{
	public float up;
	public float right;
	public float down;
	public float left;
	
	public Border2F(Border2F b)
	{
		set(b);
	}
	
	public Border2F(float up, float right, float down, float left)
	{
		set(up, right, down, left);
	}
	
	public float up()
	{
		return this.up;
	}
	
	public float right()
	{
		return this.right;
	}
	
	public float down()
	{
		return this.down;
	}
	
	public float left()
	{
		return this.left;
	}
	
	public Border2F set(Border2F b)
	{
		this.up = b.up;
		this.right = b.right;
		this.down = b.down;
		this.left = b.left;
		
		return this;
	}
	
	public Border2F set(float up, float right, float down, float left)
	{
		this.up = up;
		this.right = right;
		this.down = down;
		this.left = left;
		
		return this;
	}
}
