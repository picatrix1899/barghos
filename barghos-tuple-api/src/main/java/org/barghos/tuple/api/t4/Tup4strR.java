package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.documentation.ExtractionParam;
import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;
import org.barghos.documentation.Nullable;

import org.barghos.tuple.api.tn.TupstrR;

/**
 * This interface provides non invasive (readonly) functions and methods for string tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4strR extends TupstrR
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
	String getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	String getY();
	
	/**
	 * Returns the value of the z component of the tuple.
	 * 
	 * @return The value of the z component.
	 */
	String getZ();
	
	/**
	 * Returns the value of the w component of the tuple.
	 * 
	 * @return The value of the w component.
	 */
	String getW();
	
	/** {@inheritDoc}} */
	@Override
	default String getByIndex(@IntValueRange(min=0, max=3) int index)
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
	default String[] toArray(@ExtractionParam @MinLength(4) String[] res)
	{
		res[0] = getX();
		res[1] = getY();
		res[2] = getZ();
		res[3] = getW();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4strR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4strR other);
}