package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;

import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides non invasive (readonly) functions and methods for float tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3fR extends TupfR
{
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 3;
	}
	
	/**
	 * Returns the value of the x component of the tuple.
	 * 
	 * @return The value of the x component.
	 */
	float getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	float getY();
	
	/**
	 * Returns the value of the z component of the tuple.
	 * 
	 * @return The value of the z component.
	 */
	float getZ();
	
	/** {@inheritDoc}} */
	@Override
	default float getByIndex(@IntValueRange(min=0, max=2) int index)
	{
		Objects.checkIndex(index, 3);
		
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
			case 2: return getZ();
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isFinite()
	{
		return	Float.isFinite(getX()) &&
				Float.isFinite(getY()) &&
				Float.isFinite(getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return	getX() == 0.0f &&
				getY() == 0.0f &&
				getZ() == 0.0f;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero(@FloatMinValue(0.0f) float tolerance)
	{
		if(tolerance < 0.0f) throw new IllegalArgumentException();
		
		return	Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance &&
				Math.abs(getZ()) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	default float[] toArray(@ExtractionParam @MinLength(3) float[] res)
	{
		res[0] = getX();
		res[1] = getY();
		res[2] = getZ();
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3fR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup3fR other);
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup3fR other, @FloatMinValue(0.0f) float tolerance);
}