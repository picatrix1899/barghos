package org.barghos.util.tuple.bools;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntMinValue;
import org.barghos.annotation.Nullable;

/**
 * This interface provides non-invasive (read only) functions and methods for boolean tuples with flexible dimension counts.
 */
public interface TupboR
{
	/**
	 * Returns the number of dimensions and therefore the number of components of the tuple.
	 *
	 * @return The number of dimensions.
	 */
	int dimensions();

	/**
	 * Returns the value of the component at the specified index from the tuple.
	 *
	 * @param index The index of the value to return
	 *
	 * @return The value at the specified index from the tuple.
	 */
	boolean getByIndex(@IntMinValue(0) int index);

	/**
	 * Returns all component values of the tuple in order as a new array.
	 * Modifications made to the returned array will not alter the values in the tuple.
	 *
	 * @return An array filled with the component values.
	 */
	default boolean[] toArray()
	{
		return toArray(new boolean[dimensions()]);
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
	boolean[] toArray(@ExtractionParam boolean[] res);

	/**
	 * Copies the component values to a new instance of the current type.
	 *
	 * @return A new instance of the current tuple with the same component values.
	 */
	TupboR copy();

	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 *
	 * @param other The tuple to compare with.
	 *
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable TupboR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		if(dimensions() == other.dimensions()) return false;

		int dimensions = dimensions();

		for(int i = 0; i < dimensions; i++)
		{
			if(getByIndex(i) != other.getByIndex(i)) return false;
		}

		return true;
	}
}
