package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.annotation.Nullable;

import org.barghos.tuple.api.tn.TupobjR;

/**
 * This interface provides non invasive (readonly) functions and methods for object tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4objR extends TupobjR
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
	Object getX();
	
	/**
	 * Returns the value of the y component of the tuple.
	 * 
	 * @return The value of the y component.
	 */
	Object getY();
	
	/**
	 * Returns the value of the z component of the tuple.
	 * 
	 * @return The value of the z component.
	 */
	Object getZ();
	
	/**
	 * Returns the value of the w component of the tuple.
	 * 
	 * @return The value of the w component.
	 */
	Object getW();
	
	/** {@inheritDoc}} */
	@Override
	default Object getByIndex(@IntValueRange(min=0, max=3) int index)
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
	default Object[] toArray(@ExtractionParam @MinLength(4) Object[] res)
	{
		res[0] = getX();
		res[1] = getY();
		res[2] = getZ();
		res[3] = getW();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4objR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup4objR other);
}