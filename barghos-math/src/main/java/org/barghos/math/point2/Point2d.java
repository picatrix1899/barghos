package org.barghos.math.point2;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dRW;

import org.barghos.math.api.point2.Point2dR;
import org.barghos.math.api.point2.Point2dRW;
import org.barghos.math.api.vector2.Vec2dR;
import org.barghos.math.api.vector2.Vec2dRW;
import org.barghos.math.api.vector2.Vec2dW;

import org.barghos.math.vector2.Vec2d;

/**
 * This class represents a 2-dimensional double point.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Point2d implements Point2dRW
{
	protected double x;
	protected double y;
	
	protected transient Vec2dRWAccessor vec2dAccessor;
	
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
	public Tup2dRW setX(double x)
	{
		this.x = x;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2dRW setY(double y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2dRW getNewInstance(double x, double y)
	{
		return new Point2d(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2dR asReadonlyVector()
	{
		return asVector();
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2dW asWriteonlyVector()
	{
		return asVector();
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2dRW asVector()
	{
		return new Vec2d(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2dR asReadonlyVectorReference()
	{
		return asVectorReference();
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2dW asWriteonlyVectorReference()
	{
		return asVectorReference();
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2dRW asVectorReference()
	{
		if(this.vec2dAccessor == null) this.vec2dAccessor = new Vec2dRWAccessor();
		
		return this.vec2dAccessor;
	}
	
	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2dW> T asVector(T res)
	{
		res.set(this);
		
		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2dRW vectorTo(Point2dR p)
	{
		return vectorTo(p, new Vec2d());
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2dW> T vectorTo(Point2dR p, T res)
	{
		res.set(p.getX() - getX(), p.getY() - getY());
		
		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2dRW vectorFrom(Point2dR p)
	{
		return vectorFrom(p, new Vec2d());
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2dW> T vectorFrom(Point2dR p, T res)
	{
		res.set(getX() - p.getX(), getY() - p.getY());
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "point2d(" + getX() + ", " + getY() + ")";
	}
	
	/**
	 * This class is an accessor that provides the functionality of the {@link Vec2dRW} interface
	 * for an instance of {@link Point2d}.
	 * It is directly referencing the point instance.
	 * Therefore any call to functions that would alter the vector will alter the original point.
	 * 
	 * @author picatrix1899
	 * 
	 * @since 1.0.0.0
	 */
	private class Vec2dRWAccessor implements Vec2dRW
	{
		/** {@inheritDoc}} */
		@Override
		public double getX()
		{
			return Point2d.this.getX();
		}

		/** {@inheritDoc}} */
		@Override
		public double getY()
		{
			return Point2d.this.getY();
		}

		/** {@inheritDoc}} */
		@Override
		public Vec2dRW setX(double x)
		{
			Point2d.this.setX(x);
			
			return this;
		}

		/** {@inheritDoc}} */
		@Override
		public Vec2dRW setY(double y)
		{
			Point2d.this.setY(y);
			
			return this;
		}

		/** {@inheritDoc}} */
		@Override
		public Vec2dRW getNewInstance(double x, double y)
		{
			return new Vec2d(x, y);
		}
		
		/** {@inheritDoc}} */
		@Override
		public String toString()
		{
			return "point2d.Vec2dRWAccessor(" + getX() + ", " + getY() + ")";
		}
	}
}
