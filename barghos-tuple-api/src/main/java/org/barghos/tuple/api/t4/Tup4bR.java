package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.documentation.ByteMinValue;
import org.barghos.documentation.ExtractionParam;
import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;
import org.barghos.documentation.Nullable;

import org.barghos.tuple.api.tn.TupbR;

/**
 * This interface provides non invasive (readonly) functions and methods for byte tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4bR extends TupbR
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
	byte getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	byte getY();
	
	/**
	 * Returns the value of the z component of the tuple.
	 * 
	 * @return The value of the z component.
	 */
	byte getZ();
	
	/**
	 * Returns the value of the w component of the tuple.
	 * 
	 * @return The value of the w component.
	 */
	byte getW();
	
	/** {@inheritDoc}} */
	@Override
	default byte getByIndex(@IntValueRange(min=0, max=3) int index)
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
		return	getX() == (byte)0 &&
				getY() == (byte)0 &&
				getZ() == (byte)0 &&
				getW() == (byte)0;
	}
	
	/** {@inheritDoc}} */
	@Override
	default boolean isZero(@ByteMinValue(0) byte tolerance)
	{
		if(tolerance < (byte)0) throw new IllegalArgumentException();
		
		return	Math.abs(getX()) <= tolerance &&
				Math.abs(getY()) <= tolerance &&
				Math.abs(getZ()) <= tolerance &&
				Math.abs(getW()) <= tolerance;
	}
	
	/** {@inheritDoc}} */
	@Override
	default byte[] toArray(@ExtractionParam @MinLength(4) byte[] res)
	{
		res[0] = getX();
		res[1] = getY();
		res[2] = getZ();
		res[3] = getW();
		
		return res;
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4bR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4bR other);
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4bR other, @ByteMinValue(0) byte tolerance);
}