package org.barghos.math.vector;

import org.barghos.math.api.vector.SimpleVec2fR;
import org.barghos.math.api.vector.Vec2fR;

/**
 * This class represents an immutable an therefore readonly two dimensional float vector.
 * 
 * @author picatrix1899
 */
public class ImmutableVec2f implements Vec2fR
{
	/**
	 * The x component.
	 */
	private final float x;
	
	/**
	 * The x component.
	 */
	private final float y;
	
	/**
	 * Creates a new instance from an existing instance of {@link SimpleVec2fR} and adopts the values.
	 * 
	 * @param v An existing implementation of {@link SimpleVec2fR} to adopt the values from.
	 */
	public ImmutableVec2f(SimpleVec2fR v)
	{
		this(v.getX(), v.getY());
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public ImmutableVec2f(float value)
	{
		this(value, value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public ImmutableVec2f(float[] v)
	{
		this(v[0], v[1]);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the vector.
	 * @param y The initial y value of the vector.
	 */
	public ImmutableVec2f(float x, float y)
	{
		this.x = x;
		this.y = y;
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
	public Vec2fR createNew()
	{
		return new ImmutableVec2f(0, 0);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2fR createNew(float x, float y)
	{
		return new ImmutableVec2f(x, y);
	}

	/** {@inheritDoc} */
	@Override
	public Vec2fR copy()
	{
		return new ImmutableVec2f(this);
	}

}
