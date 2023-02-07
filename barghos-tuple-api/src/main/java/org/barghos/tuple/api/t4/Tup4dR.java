package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.annotation.DoubleMinValue;
import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;

import org.barghos.tuple.api.tn.TupdR;

/**
 * This interface provides non invasive (readonly) functions and methods for double tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4dR extends TupdR
{
	/** {@inheritDoc}} */
	@Override
	default int getDimensions()
	{
		return 4;
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
	
	/**
	 * Returns the value of the z component of the tuple.
	 * 
	 * @return The value of the z component.
	 */
	double getZ();
	
	/**
	 * Returns the value of the w component of the tuple.
	 * 
	 * @return The value of the w component.
	 */
	double getW();
	
	/** {@inheritDoc}} */
	@Override
	default double getByIndex(@IntValueRange(min=0, max=3) int index)
	{
		Objects.checkIndex(index, 4);
		
		switch(index)
		{
			case 0: return getX();
			case 1: return getY();
			case 2: return getZ();
			case 3: return getW();
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isFinite()
	{
		return	Double.isFinite(getX()) &&
				Double.isFinite(getY()) &&
				Double.isFinite(getZ()) &&
				Double.isFinite(getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero()
	{
		return	getX() == 0.0 &&
				getY() == 0.0 &&
				getZ() == 0.0 &&
				getW() == 0.0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero(@DoubleMinValue(0.0) double tolerance)
	{
		if(tolerance < 0.0) throw new IllegalArgumentException();
		
		return	Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance &&
				Math.abs(getZ()) <= tolerance &&
				Math.abs(getW()) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	default double[] toArray(@ExtractionParam @MinLength(4) double[] res)
	{
		res[0] = getX();
		res[1] = getY();
		res[2] = getZ();
		res[3] = getW();
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4dR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4dR other);
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4dR other, @DoubleMinValue(0.0) double tolerance);
}