package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.documentation.ExtractionParam;
import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;
import org.barghos.documentation.Nullable;

import org.barghos.tuple.api.tn.TupobjR;

/**
 * This interface provides non invasive (readonly) functions and methods for object tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3objR extends TupobjR
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
	
	/** {@inheritDoc}} */
	@Override
	default Object getByIndex(@IntValueRange(min=0, max=2) int index)
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
	default Object[] toArray(@ExtractionParam @MinLength(3) Object[] res)
	{
		res[0] = getX();
		res[1] = getY();
		res[2] = getZ();
		
		return res;
	}
	
	/** {@inheritDoc} */
	@Override
	Tup3objR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable Tup3objR other);
}