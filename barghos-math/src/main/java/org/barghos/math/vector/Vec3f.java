package org.barghos.math.vector;

import org.barghos.core.api.tuple.TupfR;
import org.barghos.core.api.tuple3.Tup3fR;
import org.barghos.math.BarghosMath;
import org.barghos.math.api.vector.Vec3fC;
import org.barghos.math.api.vector.Vec3fR;
import org.barghos.math.api.vector.Vec3fUtil;

/**
 * This class represents a 3-dimensional float vector.
 * 
 * @author picatrix1899
 */
public class Vec3f implements Vec3fC
{
	/**
	 * The x component.
	 */
	public float x;
	
	/**
	 * The y component.
	 */
	public float y;
	
	/**
	 * The z component.
	 */
	public float z;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Vec3f()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupfR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the values from.
	 */
	public Vec3f(TupfR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3fR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3fR} to adopt the values from.
	 */
	public Vec3f(Tup3fR t)
	{
		set(t);
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
	 * @param x The initial x value of the tuple.
	 * @param y The initial y value of the tuple.
	 * @param z The initial z value of the tuple.
	 */
	public Vec3f(float x, float y, float z)
	{
		set(x, y, z);
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
	public float getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC setX(float x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC setY(float y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3fC setZ(float z)
	{
		this.z = z;
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(getX());
		result = prime * result + Float.floatToIntBits(getY());
		result = prime * result + Float.floatToIntBits(getZ());
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Vec3fR)
		{
			Vec3fR other = (Vec3fR) obj;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getX())) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getY())) return false;
			if(Float.floatToIntBits(getZ()) != Float.floatToIntBits(other.getZ())) return false;
			
			return true;
		}
		
		if(obj instanceof Tup3fR)
		{
			Tup3fR other = (Tup3fR) obj;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getX())) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getY())) return false;
			if(Float.floatToIntBits(getZ()) != Float.floatToIntBits(other.getZ())) return false;
			
			return true;
		}
		
		if(obj instanceof TupfR)
		{
			TupfR other = (TupfR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(Float.floatToIntBits(getX()) != Float.floatToIntBits(other.getByIndex(0))) return false;
			if(Float.floatToIntBits(getY()) != Float.floatToIntBits(other.getByIndex(1))) return false;
			if(Float.floatToIntBits(getZ()) != Float.floatToIntBits(other.getByIndex(2))) return false;
			
			return true;
		}
		
		return false;
	}
	
	/** {@inheritDoc}} */
	@Override
	public String toString()
	{
		return "vec3d(x=" + getX() + ", y=" + getY() + ", z=" + getZ() + ")";
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3f clone()
	{
		return new Vec3f(this);
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3fC cross(float x, float y, float z)
	{
		if(BarghosMath.DEFAULT_COORD_SYSTEM_3f.isRightHanded()) return Vec3fUtil.cross(getX(), getY(),  getZ(), x, y, z, this);
		
		return Vec3fUtil.cross(x, y, z, getX(), getY(),  getZ(), this);
	}
}
