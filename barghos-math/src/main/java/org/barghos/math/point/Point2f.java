package org.barghos.math.point;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fBase;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.math.api.point.Point2fBase;
import org.barghos.math.api.point.Point2fR;
import org.barghos.math.api.vector.Vec2fBase;
import org.barghos.math.api.vector.Vec2fR;
import org.barghos.math.vector.Vec2f;

/**
 * This class represents a 2-dimensional float point.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Point2f implements Point2fBase
{
	protected float x;
	protected float y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 * 
	 * @since 1.0.0.0
	 */
	public Point2f()
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
	public Point2f(TupfR t)
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
	public Point2f(Tup2fR t)
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
	public Point2f(float value)
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
	public Point2f(float[] v)
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
	public Point2f(float x, float y)
	{
		set(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public float getX()
	{
		return this.x;
	}

	/** {@inheritDoc}} */
	@Override
	public float getY()
	{
		return this.y;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Tup2fBase setX(float x)
	{
		this.x = x;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2fBase setY(float y)
	{
		this.y = y;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2fR asReadonlyVector()
	{
		return asVector();
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2fBase asVector()
	{
		return new Vec2f(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2fBase> T asVector(T res)
	{
		res.set(this);
		
		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2fBase vectorTo(Point2fR p)
	{
		return vectorTo(p, new Vec2f());
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2fBase> T vectorTo(Point2fR p, T res)
	{
		res.set(p.getX() - getX(), p.getY() - getY());
		
		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2fBase vectorFrom(Point2fR p)
	{
		return vectorFrom(p, new Vec2f());
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2fBase> T vectorFrom(Point2fR p, T res)
	{
		res.set(getX() - p.getX(), getY() - p.getY());
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "point2f(" + getX() + ", " + getY() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Point2f clone()
	{
		return new Point2f(this);
	}
}
