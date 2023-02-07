package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;
import org.barghos.annotation.ShortMinValue;

import org.barghos.tuple.api.tn.TupsR;

/**
 * This interface provides non invasive (readonly) functions and methods for short tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2sR extends TupsR
{
	/** {@inheritDoc} */
	@Override
	default int getDimensions()
	{
		return 2;
	}
	
	/**
	 * Returns the value of the x component of the tuple.
	 * 
	 * @return The value of the x component.
	 */
	short getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	short getY();
	
	/** {@inheritDoc} */
	@Override
	default short getByIndex(@IntValueRange(min=0, max=1) int index)
	{
		Objects.checkIndex(index, 2);

		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isZero()
	{
		return	getX() == (short)0 &&
				getY() == (short)0;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isZero(@ShortMinValue(0) short tolerance)
	{
		if(tolerance < (short)0) throw new IllegalArgumentException();
		
		return	Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance;
	}
	
	/** {@inheritDoc} */
	@Override
	default short[] toArray(@ExtractionParam @MinLength(2) short[] res)
	{
		res[0] = getX();
		res[1] = getY();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2sR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup2sR other);
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup2sR other, @ShortMinValue(0) short tolerance);
}