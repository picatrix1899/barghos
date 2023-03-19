package org.barghos.math.api.vector;

import org.barghos.tuple.api.t4.Tup4fR;

/**
 * This interface provides non invasive (readonly) functions and methods for basic float vectors with four dimensions.
 */
public interface SimpleVec4fR extends Tup4fR
{
	/**
	 * Creates a new instance of the current class with the same component values.
	 * 
	 * @return A new instance.
	 */
	@Override
	SimpleVec4fR copy();
	
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
	
	/**
	 * Returns the value of the w component of the vector.
	 * 
	 * @return The value of the w component.
	 */
	float getW();
	
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
	
	/** {@inheritDoc} */
	@Override
	default float getV3()
	{
		return getW();
	}
}