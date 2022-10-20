package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.documentation.DoubleMinValue;
import org.barghos.documentation.ExtractionParam;
import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;
import org.barghos.documentation.Nullable;

import org.barghos.tuple.api.tn.TupdR;

/**
 * This interface provides non invasive (readonly) functions and methods for double tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2dR extends TupdR
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
	double getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	double getY();
	
	/** {@inheritDoc} */
	@Override
	default double getByIndex(@IntValueRange(min=0, max=1) int index)
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
	default boolean isFinite()
	{
		return	Double.isFinite(getX()) &&
				Double.isFinite(getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isZero()
	{
		return	getX() == 0.0f &&
				getY() == 0.0f;
	}
	
	/** {@inheritDoc} */
	@Override
	default boolean isZero(@DoubleMinValue(0.0) double tolerance)
	{
		if(tolerance < 0.0) throw new IllegalArgumentException();
		
		return	Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance;
	}
	
	/** {@inheritDoc} */
	@Override
	default double[] toArray(@ExtractionParam @MinLength(2) double[] res)
	{
		res[0] = getX();
		res[1] = getY();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2dR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup2dR other);
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup2dR other, @DoubleMinValue(0.0) double tolerance);
}