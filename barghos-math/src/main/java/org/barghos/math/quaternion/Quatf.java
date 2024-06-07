package org.barghos.math.quaternion;

import org.barghos.core.tuple.Tup4fR;
import org.barghos.math.api.vector.SimpleVec2fR;

public class Quatf implements QuatfC
{
	private float x;
	private float y;
	private float z;
	private float w;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Quatf()
	{
		set(0.0f, 0.0f, 0.0f, 1.0f);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link SimpleVec2fR} and adopts the values.
	 * 
	 * @param v An existing implementation of {@link SimpleVec2fR} to adopt the values from.
	 */
	public Quatf(Tup4fR v)
	{
		set(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Quatf(float[] v)
	{
		setArray(v);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param x The initial x value of the vector.
	 * @param y The initial y value of the vector.
	 */
	public Quatf(float x, float y, float z, float w)
	{
		set(x, y, z, w);
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

	public float getW()
	{
		return this.w;
	}

	public QuatfC createNew()
	{
		return new Quatf();
	}

	public QuatfC createNew(float x, float y, float z, float w)
	{
		return new Quatf(x, y, z, w);
	}

	public QuatfC copy()
	{
		return new Quatf(this);
	}

	public QuatfC setX(float x)
	{
		this.x = x;
		
		return this;
	}

	public QuatfC setY(float y)
	{
		this.y = y;
		
		return this;
	}

	public QuatfC setZ(float z)
	{
		this.z = z;
		
		return this;
	}

	public QuatfC setW(float w)
	{
		this.w = w;
		
		return this;
	}

}
