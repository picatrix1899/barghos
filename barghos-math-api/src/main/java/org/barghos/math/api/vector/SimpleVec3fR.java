package org.barghos.math.api.vector;

import org.barghos.tuple.api.t3.Tup3fR;

/**
 * This interface provides non invasive (readonly) functions and methods for basic float vectors with three dimensions.
 */
public interface SimpleVec3fR extends Tup3fR
{
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
	float getX();
	
	/**
	 * Returns the value of the y component of the vector.
	 * 
	 * @return The value of the y component.
	 */
	float getY();
	
	/**
	 * Returns the value of the z component of the vector.
	 * 
	 * @return The value of the z component.
	 */
	float getZ();
	
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
	
	/** {@inheritDoc} */
	@Override
	default float getV2()
	{
		return getZ();
	}
}