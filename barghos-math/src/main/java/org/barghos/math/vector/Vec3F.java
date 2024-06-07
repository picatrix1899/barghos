package org.barghos.math.vector;

import org.barghos.core.tuple.Tup3fR;
import org.barghos.math.api.vector.SimpleVec2fR;

public class Vec3F implements Vec3fC
{
	private float x;
	private float y;
	private float z;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Vec3f()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link SimpleVec2fR} and adopts the values.
	 * 
	 * @param v An existing implementation of {@link SimpleVec2fR} to adopt the values from.
	 */
	public Vec3f(Tup3fR v)
	{
		set(v);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Vec3f(float value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Vec3f(float[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the vector.
	 * @param y The initial y value of the vector.
	 */
	public Vec3f(float x, float y, float z)
	{
		set(x, y, z);
	}

	public float getX()
	{
		return this.x;
	}

	public float getY()
	{
		return this.y;
	}

	public float getZ()
	{
		return this.z;
	}

	public Vec3f createNew()
	{
		return new Vec3f();
	}

	public Vec3f createNew(float x, float y, float z)
	{
		return new Vec3f(x, y, z);
	}

	public Vec3f copy()
	{
		return new Vec3f(this);
	}

	public Vec3fC setX(float x)
	{
		this.x = x;
		
		return this;
	}

	public Vec3fC setY(float y)
	{
		this.y = y;
		
		return this;
	}

	public Vec3fC setZ(float z)
	{
		this.z = z;
		
		return this;
	}
}
