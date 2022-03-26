package org.barghos.math.vector;

import org.barghos.core.api.tuple.TupdR;
import org.barghos.core.api.tuple3.Tup3dR;
import org.barghos.math.api.vector.Vec3dBase;
import org.barghos.math.api.vector.Vec3dR;

/**
 * This class represents a 3-dimensional double vector.
 * 
 * @author picatrix1899
 */
public class Vec3d implements Vec3dBase
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
	 * The z component.
	 */
	public double z;
	
	/**
	 * Creates a new instance with all components set to 0.
	 */
	public Vec3d()
	{
		set(0);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link TupdR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 */
	public Vec3d(TupdR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance from an existing instance of {@link Tup3dR} and adopts the values.
	 * 
	 * @param t An existing implementation of {@link Tup3dR} to adopt the values from.
	 */
	public Vec3d(Tup3dR t)
	{
		set(t);
	}
	
	/**
	 * Creates a new instance with all values set to a single value.
	 * 
	 * @param value The value used as the initial value for all values of the tuple.
	 */
	public Vec3d(double value)
	{
		set(value);
	}
	
	/**
	 * Creates a new instance with the values set to the corresponding parameters.
	 * 
	 * @param v The x and y values as an array.
	 */
	public Vec3d(double[] v)
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
	public Vec3d(double x, double y, double z)
	{
		set(x, y, z);
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
	public double getZ()
	{
		return this.z;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3dBase setX(double x)
	{
		this.x = x;
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	public Vec3dBase setY(double y)
	{
		this.y = y;
		
		return this;
	}

	/** {@inheritDoc} */
	@Override
	public Vec3dBase setZ(double z)
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
		long temp = Double.doubleToLongBits(getX());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getY());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getZ());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	/** {@inheritDoc}} */
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		
		if(obj instanceof Vec3dR)
		{
			Vec3dR other = (Vec3dR) obj;
			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX())) return false;
			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY())) return false;
			if(Double.doubleToLongBits(getZ()) != Double.doubleToLongBits(other.getZ())) return false;
			
			return true;
		}
		
		if(obj instanceof Tup3dR)
		{
			Tup3dR other = (Tup3dR) obj;
			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getX())) return false;
			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getY())) return false;
			if(Double.doubleToLongBits(getZ()) != Double.doubleToLongBits(other.getZ())) return false;
			
			return true;
		}
		
		if(obj instanceof TupdR)
		{
			TupdR other = (TupdR) obj;
			if(getDimensions() != other.getDimensions()) return false;
			if(Double.doubleToLongBits(getX()) != Double.doubleToLongBits(other.getByIndex(0))) return false;
			if(Double.doubleToLongBits(getY()) != Double.doubleToLongBits(other.getByIndex(1))) return false;
			if(Double.doubleToLongBits(getZ()) != Double.doubleToLongBits(other.getByIndex(2))) return false;
			
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
	public Vec3d clone()
	{
		return new Vec3d(this);
	}
}
