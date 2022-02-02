package org.barghos.math.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.math.api.vector.Vec2dRW;

/**
 * This class represents a 2-dimensional double vector.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Vec2d implements Vec2dRW
{
	/**
	 * The x component.
	 */
	protected double x;
	
	/**
	 * The y component.
	 */
	protected double y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2d()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2d(TupdR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2dR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2dR} to adopt the values from.
	 * 
	 * @since 1.0.0.0
	 */
	public Vec2d(Tup2dR t)
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
	public Vec2d(double value)
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
	public Vec2d(double[] v)
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
	public Vec2d(double x, double y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public double getX()
	{
		return this.x;
	}
	
	/** {@inheritDoc} */
	@Override
	public double getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d setX(double x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d setY(double y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d getNewInstance(double x, double y)
	{
		return new Vec2d(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec2d(" + getX() + ", " + getY() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d clone()
	{
		return new Vec2d(this);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d set(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d set(double value)
	{
		return (Vec2d)Vec2dRW.super.set(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d set(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.set(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d setByIndex(int index, double value)
	{
		return (Vec2d)Vec2dRW.super.setByIndex(index, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d setArray(double... values)
	{
		return (Vec2d)Vec2dRW.super.setArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d set(TupdR t)
	{
		return (Vec2d)Vec2dRW.super.set(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d add(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.add(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d add(double value)
	{
		return (Vec2d)Vec2dRW.super.add(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d add(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.add(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d sub(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.sub(t);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2d sub(double value)
	{
		return (Vec2d)Vec2dRW.super.sub(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d sub(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.sub(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revSub(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.revSub(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revSub(double value)
	{
		return (Vec2d)Vec2dRW.super.revSub(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revSub(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.revSub(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d mul(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.mul(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d mul(double value)
	{
		return (Vec2d)Vec2dRW.super.mul(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d mul(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.mul(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d div(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.div(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d div(double value)
	{
		return (Vec2d)Vec2dRW.super.div(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d div(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.div(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revDiv(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.revDiv(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revDiv(double value)
	{
		return (Vec2d)Vec2dRW.super.revDiv(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revDiv(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.revDiv(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d normal()
	{
		return (Vec2d)Vec2dRW.super.normal();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d normalSafe()
	{
		return (Vec2d)Vec2dRW.super.normalSafe();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d normalSafeWithMargin(double tolerance)
	{
		return (Vec2d)Vec2dRW.super.normalSafeWithMargin(tolerance);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d invert()
	{
		return (Vec2d)Vec2dRW.super.invert();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d inverse()
	{
		return (Vec2d)Vec2dRW.super.inverse();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d inverse(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.inverse(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d inverse(double value)
	{
		return (Vec2d)Vec2dRW.super.inverse(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d inverse(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.inverse(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d getNewInstance(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d getNewInstance(double value)
	{
		return (Vec2d)Vec2dRW.super.getNewInstance(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d getNewInstanceFromArray(double... values)
	{
		return (Vec2d)Vec2dRW.super.getNewInstanceFromArray(values);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d getNewInstance(TupdR t)
	{
		return (Vec2d)Vec2dRW.super.getNewInstance(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d addN(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.addN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d addN(double value)
	{
		return (Vec2d)Vec2dRW.super.addN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d addN(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.addN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d subN(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.subN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d subN(double value)
	{
		return (Vec2d)Vec2dRW.super.subN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d subN(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.subN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revSubN(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.revSubN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revSubN(double value)
	{
		return (Vec2d)Vec2dRW.super.revSubN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revSubN(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.revSubN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d mulN(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.mulN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d mulN(double value)
	{
		return (Vec2d)Vec2dRW.super.mulN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d mulN(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.mulN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d divN(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.divN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d divN(double value)
	{
		return (Vec2d)Vec2dRW.super.divN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d divN(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.divN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revDivN(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.revDivN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revDivN(double value)
	{
		return (Vec2d)Vec2dRW.super.revDivN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d revDivN(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.revDivN(x, y);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d normalN()
	{
		return (Vec2d)Vec2dRW.super.normalN();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d normalSafeN()
	{
		return (Vec2d)Vec2dRW.super.normalSafeN();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d normalSafeWithMarginN(double tolerance)
	{
		return (Vec2d)Vec2dRW.super.normalSafeWithMarginN(tolerance);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d invertN()
	{
		return (Vec2d)Vec2dRW.super.invertN();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d inverseN()
	{
		return (Vec2d)Vec2dRW.super.inverseN();
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d inverseN(Tup2dR t)
	{
		return (Vec2d)Vec2dRW.super.inverseN(t);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d inverseN(double value)
	{
		return (Vec2d)Vec2dRW.super.inverseN(value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d inverseN(double x, double y)
	{
		return (Vec2d)Vec2dRW.super.inverseN(x, y);
	}
}
