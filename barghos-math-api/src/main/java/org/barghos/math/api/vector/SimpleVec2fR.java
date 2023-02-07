package org.barghos.math.api.vector;

import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.Nullable;
import org.barghos.tuple.api.t2.Tup2fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides non invasive (readonly) functions and methods for basic float vectors with two dimensions.
 * 
 * @author picatrix1899
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
	@Override
	float getX();
	
	/**
	 * Returns the value of the y component of the vector.
	 * 
	 * @return The value of the y component.
	 */
	@Override
	float getY();
	
	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable Tup2fR other)
	{
		if(other == null) return false;
		if(this == other) return true;
		
		if(getX() != other.getX()) return false;
		if(getY() != other.getY()) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable Tup2fR other, @FloatMinValue(0.0f) float tolerance)
	{
		if(other == null) return false;
		if(this == other) return true;
		
		if(Math.abs(getX() - other.getX()) > tolerance) return false;
		if(Math.abs(getY() - other.getY()) > tolerance) return false;
		
		return false;
	}

	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupfR other)
	{
		if(other == null) return false;
		if(this == other) return true;
		if(other.getDimensions() != 2) return false;
		
		if(getX() != other.getByIndex(0)) return false;
		if(getY() != other.getByIndex(1)) return false;
		
		return true;
	}

	/** {@inheritDoc} */
	@Override
	default boolean equals(@Nullable TupfR other, @FloatMinValue(0.0f) float tolerance)
	{
		if(other == null) return false;
		if(this == other) return true;
		if(other.getDimensions() != 2) return false;
		
		if(Math.abs(getX() - other.getByIndex(0)) > tolerance) return false;
		if(Math.abs(getY() - other.getByIndex(1)) > tolerance) return false;
		
		return true;
	}
}
