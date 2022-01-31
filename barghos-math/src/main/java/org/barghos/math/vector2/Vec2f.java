package org.barghos.math.vector2;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;

import org.barghos.math.api.vector2.Vec2fRW;

/**
 * This class represents a 2-dimensional float vector.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Vec2f implements Vec2fRW
{
	/**
	 * The x component.
	 */
	protected float x;
	
	/**
	 * The y component.
	 */
	protected float y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2f()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupfR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2f(TupfR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2fR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2f(Tup2fR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2f(float value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2f(float[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2f(float x, float y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public float getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc} */
	@Override
	public float getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f setX(float x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f setY(float y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f getNewInstance(float x, float y)
	{
		return new Vec2f(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec2d(" + getX() + ", " + getY() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f set(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f set(float value)
	{
		return (Vec2f)Vec2fRW.super.set(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f set(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f setByIndex(int index, float value)
	{
		return (Vec2f)Vec2fRW.super.setByIndex(index, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f setArray(float... values)
	{
		return (Vec2f)Vec2fRW.super.setArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f set(TupfR t)
	{
		return (Vec2f)Vec2fRW.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f add(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.add(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f add(float value)
	{
		return (Vec2f)Vec2fRW.super.add(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f add(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.add(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f sub(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.sub(t);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2f sub(float value)
	{
		return (Vec2f)Vec2fRW.super.sub(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f sub(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.sub(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revSub(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.revSub(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revSub(float value)
	{
		return (Vec2f)Vec2fRW.super.revSub(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revSub(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.revSub(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f mul(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.mul(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f mul(float value)
	{
		return (Vec2f)Vec2fRW.super.mul(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f mul(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.mul(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f div(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.div(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f div(float value)
	{
		return (Vec2f)Vec2fRW.super.div(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f div(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.div(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revDiv(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.revDiv(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revDiv(float value)
	{
		return (Vec2f)Vec2fRW.super.revDiv(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revDiv(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.revDiv(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f normal()
	{
		return (Vec2f)Vec2fRW.super.normal();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f normalSafe()
	{
		return (Vec2f)Vec2fRW.super.normalSafe();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f normalSafeWithMargin(float tolerance)
	{
		return (Vec2f)Vec2fRW.super.normalSafeWithMargin(tolerance);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f invert()
	{
		return (Vec2f)Vec2fRW.super.invert();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f inverse()
	{
		return (Vec2f)Vec2fRW.super.inverse();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f inverse(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.inverse(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f inverse(float value)
	{
		return (Vec2f)Vec2fRW.super.inverse(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f inverse(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.inverse(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f getNewInstance(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f getNewInstance(float value)
	{
		return (Vec2f)Vec2fRW.super.getNewInstance(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f getNewInstanceFromArray(float... values)
	{
		return (Vec2f)Vec2fRW.super.getNewInstanceFromArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f getNewInstance(TupfR t)
	{
		return (Vec2f)Vec2fRW.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f addN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.addN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f addN(float value)
	{
		return (Vec2f)Vec2fRW.super.addN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f addN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.addN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f subN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.subN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f subN(float value)
	{
		return (Vec2f)Vec2fRW.super.subN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f subN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.subN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revSubN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.revSubN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revSubN(float value)
	{
		return (Vec2f)Vec2fRW.super.revSubN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revSubN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.revSubN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f mulN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.mulN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f mulN(float value)
	{
		return (Vec2f)Vec2fRW.super.mulN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f mulN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.mulN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f divN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.divN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f divN(float value)
	{
		return (Vec2f)Vec2fRW.super.divN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f divN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.divN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revDivN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.revDivN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revDivN(float value)
	{
		return (Vec2f)Vec2fRW.super.revDivN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f revDivN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.revDivN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f normalN()
	{
		return (Vec2f)Vec2fRW.super.normalN();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f normalSafeN()
	{
		return (Vec2f)Vec2fRW.super.normalSafeN();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f normalSafeWithMarginN(float tolerance)
	{
		return (Vec2f)Vec2fRW.super.normalSafeWithMarginN(tolerance);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f invertN()
	{
		return (Vec2f)Vec2fRW.super.invertN();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f inverseN()
	{
		return (Vec2f)Vec2fRW.super.inverseN();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f inverseN(Tup2fR t)
	{
		return (Vec2f)Vec2fRW.super.inverseN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f inverseN(float value)
	{
		return (Vec2f)Vec2fRW.super.inverseN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f inverseN(float x, float y)
	{
		return (Vec2f)Vec2fRW.super.inverseN(x, y);
	}
}
