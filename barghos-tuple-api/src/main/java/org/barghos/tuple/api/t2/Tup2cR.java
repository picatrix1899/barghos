package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.documentation.ExtractionParam;
import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;
import org.barghos.documentation.Nullable;

import org.barghos.tuple.api.tn.TupcR;

/**
 * This interface provides non invasive (readonly) functions and methods for char tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2cR extends TupcR
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
	char getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	char getY();
	
	/** {@inheritDoc} */
	@Override
	default char getByIndex(@IntValueRange(min=0, max=1) int index)
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
	default char[] toArray(@ExtractionParam @MinLength(2) char[] res)
	{
		res[0] = getX();
		res[1] = getY();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2cR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup2cR other);
}