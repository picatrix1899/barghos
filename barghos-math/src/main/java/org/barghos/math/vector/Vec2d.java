package org.barghos.math.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.math.api.vector.Vec2dC;
import org.barghos.math.api.vector.Vec2dR;

/**
 * This class represents a 2-dimensional double vector.
 * 
 * @author picatrix1899
 */
public class Vec2d implements Vec2dC
{
	/**
	 * The x component.
	 */
	public double x;
	
	/**
	 * The y component.
	 */
	public double y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Vec2d()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 */
	public Vec2d(TupdR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup2dR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup2dR} to adopt the values from.
	 */
	public Vec2d(Tup2dR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Vec2d(double value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
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
	public Vec2dC setX(double x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2dC setY(double y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		long temp = Double.doubleToLongBits(getX());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getY());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Vec2dR)
		{
			Vec2dR other = (Vec2dR) obj;
			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX())) return false;
			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY())) return false;
			
			return true;
		}
		
		if(obj instanceof Tup2dR)
		{
			Tup2dR other = (Tup2dR) obj;
			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX())) return false;
			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY())) return false;
			
			return true;
		}
		
		if(obj instanceof TupdR)
		{
			TupdR other = (TupdR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getByIndex(0))) return false;
			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getByIndex(1))) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "vec2d(x=" + getX() + ", y=" + getY() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2d clone()
	{
		return new Vec2d(this);
	}
}
