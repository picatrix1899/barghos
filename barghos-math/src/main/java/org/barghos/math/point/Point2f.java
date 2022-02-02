package org.barghos.math.point;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple2.Tup2fR;
import org.barghos.core.api.tuple2.Tup2fRW;
import org.barghos.math.api.point.Point2fR;
import org.barghos.math.api.point.Point2fRW;
import org.barghos.math.api.vector.Vec2fR;
import org.barghos.math.api.vector.Vec2fRW;
import org.barghos.math.api.vector.Vec2fW;
import org.barghos.math.vector.Vec2f;

/**
 * This class represents a 2-dimensional float point.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public class Point2f implements Point2fRW
{
	protected float x;
	protected float y;
	
	protected transient Vec2fRWAccessor vec2fAccessor;
	
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
	public Tup2fRW setX(float x)
	{
		this.x = x;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2fRW setY(float y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	public Tup2fRW getNewInstance(float x, float y)
	{
		return new Point2f(x, y);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2fR asReadonlyVector()
	{
		return asVector();
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2fW asWriteonlyVector()
	{
		return asVector();
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2fRW asVector()
	{
		return new Vec2f(this);
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2fR asReadonlyVectorReference()
	{
		return asVectorReference();
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2fW asWriteonlyVectorReference()
	{
		return asVectorReference();
	}
	
	/** {@inheritDoc}} */
	@Override
	public Vec2fRW asVectorReference()
	{
		if(this.vec2fAccessor == null) this.vec2fAccessor = new Vec2fRWAccessor();
		
		return this.vec2fAccessor;
	}
	
	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2fW> T asVector(T res)
	{
		res.set(this);
		
		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2fRW vectorTo(Point2fR p)
	{
		return vectorTo(p, new Vec2f());
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2fW> T vectorTo(Point2fR p, T res)
	{
		res.set(p.getX() - getX(), p.getY() - getY());
		
		return res;
	}

	/** {@inheritDoc}} */
	@Override
	public Vec2fRW vectorFrom(Point2fR p)
	{
		return vectorFrom(p, new Vec2f());
	}

	/** {@inheritDoc}} */
	@Override
	public <T extends Vec2fW> T vectorFrom(Point2fR p, T res)
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
	
	/**
	 * This class is an accessor that provides the functionality of the {@link Vec2fRW} interface
	 * for an instance of {@link Point2f}.
	 * It is directly referencing the point instance.
	 * Therefore any call to functions that would alter the vector will alter the original point.
	 * 
	 * @author picatrix1899
	 * 
	 * @since 1.0.0.0
	 */
	private class Vec2fRWAccessor implements Vec2fRW
	{
		/** {@inheritDoc}} */
		@Override
		public float getX()
		{
			return Point2f.this.getX();
		}

		/** {@inheritDoc}} */
		@Override
		public float getY()
		{
			return Point2f.this.getY();
		}

		/** {@inheritDoc}} */
		@Override
		public Vec2fRW setX(float x)
		{
			Point2f.this.setX(x);
			
			return this;
		}

		/** {@inheritDoc}} */
		@Override
		public Vec2fRW setY(float y)
		{
			Point2f.this.setY(y);
			
			return this;
		}

		/** {@inheritDoc}} */
		@Override
		public Vec2fRW getNewInstance(float x, float y)
		{
			return new Vec2f(x, y);
		}
		
		/** {@inheritDoc}} */
		@Override
		public String toString()
		{
			return "point2f.Vec2fRWAccessor(" + getX() + ", " + getY() + ")";
		}
	}
}
