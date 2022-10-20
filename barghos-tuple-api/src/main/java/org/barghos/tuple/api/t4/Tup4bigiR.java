package org.barghos.tuple.api.t4;

import java.math.BigInteger;
import java.util.Objects;

import org.barghos.documentation.ExtractionParam;
import org.barghos.documentation.IntMinValue;
import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;
import org.barghos.documentation.Nullable;

import org.barghos.tuple.api.tn.TupbigiR;

/**
 * This interface provides non invasive (readonly) functions and methods for {@link BigInteger} tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4bigiR extends TupbigiR
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
	BigInteger getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	BigInteger getY();
	
	/**
	 * Returns the value of the z component of the tuple.
	 * 
	 * @return The value of the z component.
	 */
	BigInteger getZ();
	
	/**
	 * Returns the value of the w component of the tuple.
	 * 
	 * @return The value of the w component.
	 */
	BigInteger getW();
	
	/** {@inheritDoc}} */
	@Override
	default BigInteger getByIndex(@IntValueRange(min=0, max=3) int index)
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
	default boolean isZero()
	{
		return	getX().compareTo(BigInteger.ZERO) == 0 &&
				getY().compareTo(BigInteger.ZERO) == 0 &&
				getZ().compareTo(BigInteger.ZERO) == 0 &&
				getW().compareTo(BigInteger.ZERO) == 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero(@IntMinValue(0) BigInteger tolerance)
	{
		if(tolerance.compareTo(BigInteger.ZERO) < 0) throw new IllegalArgumentException();
		
		return	getX().abs().compareTo(tolerance) <= 0 &&
				getY().abs().compareTo(tolerance) <= 0 &&
				getZ().abs().compareTo(tolerance) <= 0 &&
				getW().abs().compareTo(tolerance) <= 0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default BigInteger[] toArray(@ExtractionParam @MinLength(4) BigInteger[] res)
	{
		res[0] = getX();
		res[1] = getY();
		res[2] = getZ();
		res[3] = getW();
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4bigiR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4bigiR other);
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4bigiR other, @IntMinValue(0) BigInteger tolerance);
}