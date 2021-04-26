package org.barghos.math.vec2;

import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.math.api.vec2.Vec2fRW;

public class Vec2f implements Vec2fRW
{
	public float x;
	public float y;
	
	public Vec2f() { }
	
	public Vec2f(Tup2fR t)
	{
		set(t);
	}
	
	public Vec2f(float value)
	{
		set(value);
	}
	
	public Vec2f(float x, float y)
	{
		set(x, y);
	}
	
	@Override
	public float getX()
	{
		return this.x;
	}
	
	@Override
	public float getY()
	{
		return this.y;
	}
	
	@Override
	public Vec2f setX(float x)
	{
		this.x = x;
		
		return this;
	}
	
	@Override
	public Vec2f setY(float y)
	{
		this.y = y;
		
		return this;
	}
	
	@Override
	public Vec2f set(Tup2fR t)
	{
		return set(t.getX(), t.getY());
	}
	
	@Override
	public Vec2f set(float value)
	{
		return set(value, value);
	}
	
	@Override
	public Vec2f set(float x, float y)
	{
		return setX(x).setY(y);
	}
	
	@Override
	public Vec2f clone()
	{
		return new Vec2f(this);
	}
}
