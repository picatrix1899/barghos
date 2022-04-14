package org.barghos.math.point;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dBase;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.math.api.point.Point2dBase;
import org.barghos.math.api.point.Point2dR;

/**
 * This class represents a 2-dimensional double point.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Point2d implements Point2dBase
{
	protected double x;
	protected double y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Point2d()
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
	public Point2d(TupdR t)
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
	public Point2d(Tup2dR t)
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
	public Point2d(double value)
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
	public Point2d(double[] v)
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
	public Point2d(double x, double y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public double getX()
	{
		return this.x;
	}

	/** {@inheritDoc}} */
	@Override
	public double getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2dBase setX(double x)
	{
		this.x = x;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2dBase setY(double y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public <T extends Tup2dBase> T copyTo(T res)
	{
		res.set(this);
		
		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Tup2dBase> T vectorTo(double pX, double pY, T res)
	{
		res.set(pX - getX(), pY - getY());
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public <T extends Tup2dBase> T vectorFrom(double pX, double pY, T res)
	{
		res.set(getX() - pX, getY() - pY);
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "point2d(" + getX() + ", " + getY() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Point2d clone()
	{
		return new Point2d(this);
	}
}
