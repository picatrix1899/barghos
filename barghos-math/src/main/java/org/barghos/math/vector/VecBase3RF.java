package org.barghos.math.vector;

import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.floats.Tup3RF;

/**
 * This interface provides non-invasive (read only) functions and methods for basic float vectors
 * with three dimensions.
 */
public interface VecBase3RF extends Tup3RF
{
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
	VecBase3RF createNew(Tup3RF v);
	
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
	VecBase3RF createNew(@MinLength(3) float... v);
	
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
	VecBase3RF createNew(float value);
	
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
	VecBase3RF createNew(float x, float y, float z);
	
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	@Override
	VecBase3RF copy();
	
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
	float v0();
	
	/** {@inheritDoc} */
	@Override
	float v1();
	
	/** {@inheritDoc} */
	@Override
	float v2();
}