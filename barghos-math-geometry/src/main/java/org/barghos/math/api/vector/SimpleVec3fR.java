package org.barghos.math.api.vector;

import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup3fR;

/**
 * This interface provides non-invasive (read only) functions and methods for basic float vectors
 * with three dimensions.
 */
public interface SimpleVec3fR extends Tup3fR
{
	/**
	 * Creates a new instance of the type of this vector.
	 * 
	 * @return A new instance.
	 */
	@Override
	SimpleVec3fR createNew();
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the
	 * given vector {@code (v)}.
	 * 
	 * @param v
	 *     The vector to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	@Override
	default SimpleVec3fR createNew(Tup3fR v)
	{
		return createNew(v.v0(), v.v1(), v.v2());
	}
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the
	 * given vector {@code (v[0], v[1], v[2])}.
	 * 
	 * @param v
	 *     The vector as an array with at least three entries to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	@Override
	default SimpleVec3fR createNew(@MinLength(3) float[] v)
	{
		return createNew(v[0], v[1], v[2]);
	}
	
	/**
	 * Creates a new instance of the type of this vector and sets the component values to the given
	 * value {@code (value)}.
	 * 
	 * @param value
	 *     The value that will be used for all component values.
	 * 
	 * @return A new instance.
	 */
	@Override
	default SimpleVec3fR createNew(float value)
	{
		return createNew(value, value, value);
	}
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the
	 * given vector {@code (x, y, z)}.
	 * 
	 * @param x
	 *     The value of the x component.
	 * @param y
	 *     The value of the y component.
	 * @param z
	 *     The value of the z component.
	 * 
	 * @return A new instance.
	 */
	SimpleVec3fR createNew(float x, float y, float z);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	@Override
	SimpleVec3fR copy();
	
	/**
	 * Returns the value of the x component of the vector.
	 * 
	 * @return The value of the x component.
	 */
	float x();
	
	/**
	 * Returns the value of the y component of the vector.
	 * 
	 * @return The value of the y component.
	 */
	float y();
	
	/**
	 * Returns the value of the z component of the vector.
	 * 
	 * @return The value of the z component.
	 */
	float z();
	
	/** {@inheritDoc} */
	@Override
	default float v0()
	{
		return x();
	}
	
	/** {@inheritDoc} */
	@Override
	default float v1()
	{
		return y();
	}
	
	/** {@inheritDoc} */
	@Override
	default float v2()
	{
		return z();
	}
}