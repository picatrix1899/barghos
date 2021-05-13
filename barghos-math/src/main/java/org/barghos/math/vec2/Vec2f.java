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
	
	@Override
	public Vec2f getNewInstance(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.getNewInstance(t);
	}
	
	@Override
	public Vec2f getNewInstance(float value)
	{
		return (Vec2f)Vec2fRW.super.getNewInstance(value);
	}
	
	@Override
	public Vec2f getNewInstance(float x, float y)
	{
		return new Vec2f(x, y);
	}
	
	@Override
	public Vec2f addN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.addN(t);
	}
	
	@Override
	public Vec2f addN(float value)
	{
		return (Vec2f)Vec2fRW.super.addN(value);
	}
	
	@Override
	public Vec2f addN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.addN(x, y);
	}
	
	@Override
	public Vec2f subN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.subN(t);
	}
	
	@Override
	public Vec2f subN(float value)
	{
		return (Vec2f)Vec2fRW.super.subN(value);
	}
	
	@Override
	public Vec2f subN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.subN(x, y);
	}
	
	@Override
	public Vec2f mulN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.mulN(t);
	}
	
	@Override
	public Vec2f mulN(float value)
	{
		return (Vec2f)Vec2fRW.super.mulN(value);
	}
	
	@Override
	public Vec2f mulN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.mulN(x, y);
	}
	
	@Override
	public Vec2f divN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.divN(t);
	}
	
	@Override
	public Vec2f divN(float value)
	{
		return (Vec2f)Vec2fRW.super.divN(value);
	}
	
	@Override
	public Vec2f divN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.divN(x, y);
	}
	
	@Override
	public Vec2f normalizeN()
	{
		return (Vec2f)Vec2fRW.super.normalizeN();
	}
	
	@Override
	public Vec2f safeNormalizeN()
	{
		return (Vec2f)Vec2fRW.super.safeNormalizeN();
	}
	
	@Override
	public Vec2f safeTrNormalizeN(float tolerance)
	{
		return (Vec2f)Vec2fRW.super.safeTrNormalizeN(tolerance);
	}
	
	@Override
	public Vec2f invertN()
	{
		return (Vec2f)Vec2fRW.super.invertN();
	}
	
	@Override
	public Vec2f reciprocalN()
	{
		return (Vec2f)Vec2fRW.super.reciprocalN();
	}
	
	@Override
	public Vec2f safeReciprocalN()
	{
		return (Vec2f)Vec2fRW.super.safeReciprocalN();
	}
	
	@Override
	public Vec2f safeTrReciprocalN(float tolerance)
	{
		return (Vec2f)Vec2fRW.super.safeTrReciprocalN(tolerance);
	}
	
	@Override
	public Vec2f add(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.add(t);
	}
	
	@Override
	public Vec2f add(float value)
	{
		return (Vec2f)Vec2fRW.super.add(value);
	}
	
	@Override
	public Vec2f add(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.add(x, y);
	}
	
	@Override
	public Vec2f sub(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.sub(t);
	}
	
	@Override
	public Vec2f sub(float value)
	{
		return (Vec2f)Vec2fRW.super.sub(value);
	}
	
	@Override
	public Vec2f sub(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.sub(x, y);
	}
	
	@Override
	public Vec2f mul(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.mul(t);
	}
	
	@Override
	public Vec2f mul(float value)
	{
		return (Vec2f)Vec2fRW.super.mul(value);
	}
	
	@Override
	public Vec2f mul(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.mul(x, y);
	}
	
	@Override
	public Vec2f div(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.div(t);
	}
	
	@Override
	public Vec2f div(float value)
	{
		return (Vec2f)Vec2fRW.super.div(value);
	}
	
	@Override
	public Vec2f div(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.div(x, y);
	}
	
	@Override
	public Vec2f normalize()
	{
		return (Vec2f)Vec2fRW.super.normalize();
	}
	
	@Override
	public Vec2f safeNormalize()
	{
		return (Vec2f)Vec2fRW.super.safeNormalize();
	}
	
	@Override
	public Vec2f safeTrNormalize(float tolerance)
	{
		return (Vec2f)Vec2fRW.super.safeTrNormalize(tolerance);
	}
	
	@Override
	public Vec2f invert()
	{
		return (Vec2f)Vec2fRW.super.invert();
	}
	
	@Override
	public Vec2f reciprocal()
	{
		return (Vec2f)Vec2fRW.super.reciprocal();
	}
	
	@Override
	public Vec2f safeReciprocal()
	{
		return (Vec2f)Vec2fRW.super.safeReciprocal();
	}
	
	@Override
	public Vec2f safeTrReciprocal(float tolerance)
	{
		return (Vec2f)Vec2fRW.super.safeTrReciprocal(tolerance);
	}
}
