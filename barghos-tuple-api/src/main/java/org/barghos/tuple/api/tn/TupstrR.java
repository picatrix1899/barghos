package org.barghos.tuple.api.tn;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntMinValue;
import org.barghos.annotation.Nullable;

/**
 * This interface provides non invasive (readonly) functions and methods for string tuples with flexible dimension counts.
 * 
 * @author picatrix1899
 */
public interface TupstrR
{
	/**
	 * Returns the number of dimensions and therefore the number of components of the tuple.
	 * 
	 * @return The number of dimensions.
	 */
	int getDimensions();
	
	/**
	 * Returns the value of the component at the specified index from the tuple.
	 * 
	 * @param index The index of the value to return
	 * 
	 * @return The value at the specified index from the tuple.
	 */
	String getByIndex(@IntMinValue(0) int index);
	
	/**
	 * Returns all component values of the tuple in order as a new array.
	 * Modifications made to the returned array will not alter the values in the tuple.
	 * 
	 * @return An array filled with the component values.
	 */
	default String[] toArray()
	{
		return toArray(new String[getDimensions()]);
	}
	
	/**
	 * Fills the given result array with the component values of the tuple in order and returns it.
	 * The size of the result array has to be equal to or greater than the number of dimensions of this tuple.
	 * Modifications made to the result array will not alter the values in the tuple.
	 * 
	 * @param res The result array.
	 * 
	 * @return The result array filled with the component values.
	 */
	String[] toArray(@ExtractionParam String[] res);
	
	/**
	 * Copies the component values to a new instance of the current type.
	 * 
	 * @return A new instance of the current tuple with the same component values.
	 */
	TupstrR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable TupstrR other);
}
