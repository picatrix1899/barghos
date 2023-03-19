package org.barghos.math.api.vector;

import org.barghos.tuple.api.t2.Tup2fR;

/**
 * This interface provides non invasive (readonly) functions and methods for basic float vectors with two dimensions.
 */
public interface SimpleVec2fR extends Tup2fR
{
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
	float getX();
	
	/**
	 * Returns the value of the y component of the vector.
	 * 
	 * @return The value of the y component.
	 */
	float getY();
	
	/** {@inheritDoc} */
	@Override
	default float getV0()
	{
		return getX();
	}
	
	/** {@inheritDoc} */
	@Override
	default float getV1()
	{
		return getY();
	}
}
