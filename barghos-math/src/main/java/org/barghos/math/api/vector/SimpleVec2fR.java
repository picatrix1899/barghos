package org.barghos.math.api.vector;

import org.barghos.annotation.MinLength;
import org.barghos.core.tuple.Tup2fR;

/**
 * This interface provides non-invasive (read only) functions and methods for basic float vectors
 * with two dimensions.
 */
public interface SimpleVec2fR extends Tup2fR
{
	/**
	 * Creates a new instance of the type of this vector.
	 * 
	 * @return A new instance.
	 */
	SimpleVec2fR createNew();
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the
	 * given vector {@code (v)}.
	 * 
	 * @param v
	 *     The vector to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default SimpleVec2fR createNew(Tup2fR v)
	{
		return createNew(v.v0(), v.v1());
	}
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the
	 * given vector {@code (v[0], v[1])}.
	 * 
	 * @param v
	 *     The vector as an array to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default SimpleVec2fR createNew(@MinLength(2) float[] v)
	{
		return createNew(v[0], v[1]);
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
	default SimpleVec2fR createNew(float value)
	{
		return createNew(value, value);
	}
	
	/**
	 * Creates a new instance of the type of this vector and adopts the component values from the
	 * given vector {@code (x, y)}.
	 * 
	 * @param x
	 *     The value of the x component.
	 * @param y
	 *     The value of the y component.
	 * 
	 * @return A new instance.
	 */
	SimpleVec2fR createNew(float x, float y);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	@Override
	SimpleVec2fR copy();
	
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
}
