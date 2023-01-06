package org.barghos.math.vector;

import org.barghos.math.api.vector.SimpleVec2fR;
import org.barghos.math.api.vector.Vec2fC;

/**
 * This class represents a two dimensional float vector.
 * 
 * @author picatrix1899
 */
public class Vec2f implements Vec2fC
{
	/**
	 * The x component.
	 */
	private float x;
	
	/**
	 * The x component.
	 */
	private float y;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Vec2f()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link SimpleVec2fR} and adopts the values.
	 * 
	 * @param v An existing implementation of {@link SimpleVec2fR} to adopt the values from.
	 */
	public Vec2f(SimpleVec2fR v)
	{
		set(v);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Vec2f(float value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Vec2f(float[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the vector.
	 * @param y The initial y value of the vector.
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
	public Vec2f createNew()
	{
		return new Vec2f();
	}

	/** {@inheritDoc} */
	@Override
	public Vec2f createNew(SimpleVec2fR v)
	{
		return createNew(v.getX(), v.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f createNew(float[] v)
	{
		return createNew(v[0], v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f createNew(float value)
	{
		return new Vec2f(value, value);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec2f createNew(float x, float y)
	{
		return new Vec2f(x, y);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2f copy()
	{
		return new Vec2f(this);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2fC setX(float x)
	{
		this.x = x;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec2fC setY(float y)
	{
		this.y = y;
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public String toString()
	{
		return "vec2f(x=" + getX() + ", y=" + getY() + ")";
	}
}
