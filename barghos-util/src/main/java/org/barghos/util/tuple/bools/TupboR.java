package org.barghos.util.tuple.bools;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntMinValue;
import org.barghos.annotation.Nullable;

import org.barghos.validation.Validation;

/**
 * This interface provides non-invasive (read only) functions and methods for
 * boolean tuples with flexible dimension counts.
 */
public interface TupboR
{
	/**
	 * Creates a new instance of the type of this tuple.
	 * 
	 * @return A new instance.
	 */
	TupboR createNew();
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default TupboR createNew(TupboR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple as an array with at least three entries to adopt the
	 * component values from.
	 * 
	 * @return A new instance.
	 */
	TupboR createNew(boolean[] t);
	
	/**
	 * Returns the size and therefore the number of components of the tuple.
	 *
	 * @return The size of the tuple.
	 */
	int size();

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
	 * Modifications made to the returned array will not alter the values in the
	 * tuple.
	 *
	 * @return An array filled with the component values.
	 */
	default boolean[] toArray()
	{
		return toArray(new boolean[size()]);
	}

	/**
	 * Fills the given result array with the component values of the tuple in
	 * order and returns it. The size of the result array has to be equal to or
	 * greater than the number of dimensions of this tuple. Modifications made
	 * to the result array will not alter the values in the tuple.
	 *
	 * @param res The result array.
	 *
	 * @return The result array filled with the component values.
	 */
	boolean[] toArray(@ExtractionParam boolean[] res);

	/**
	 * Copies the component values to a new instance of the current type.
	 *
	 * @return A new instance of the current tuple with the same component
	 * values.
	 */
	TupboR copy();

	/**
	 * Compares the value of the components of this tuple and the given tuple
	 * and returns true, if the value of each component of this tuple is equal
	 * to the value of the corresponding component in the other tuple.
	 *
	 * @param other The tuple to compare with.
	 *
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable TupboR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		int size = size();
		
		if(size == other.size()) return false;

		for(int i = 0; i < size; i++)
			if(getByIndex(i) != other.getByIndex(i)) return false;

		return true;
	}
	
	/**
	 * Resizes the tuple to the passed size and either trims of any excess
	 * components or adds new empty components. The result is returned as a new
	 * instance of this type of tuple.
	 * 
	 * @param size The new size.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default TupboR resizeN(int size)
	{
		Validation.validateMin("size", size, 0);
		
		boolean[] oldValues = toArray();
		boolean[] newValues = new boolean[size];
		
		int s = Math.min(size(), size);
		
		for(int i = 0; i < s; i++)
			newValues[i] = oldValues[i];

		return createNew(newValues);
	}
	
	/**
	 * Rearranges the order of the component values by their indices and returns
	 * the result as a new instance of this type of tuple.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in the tuple should be
	 * placed at the index 2, the index 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * @param indices The indices in the tuple in new order.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default TupboR rearrangeN(int[] indices)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("indices", indices);
			Validation.expectSize("indices", indices, size());
		}
		
		int size = size();
		
		boolean[] values = new boolean[size];
		
		for(int i = 0; i < size; i++)
			values[i] = getByIndex(indices[i]);
		
		return createNew(values);
	}
	
	/**
	 * Rearranges the order of the component values by their indices and returns
	 * the result as a new instance of this type of tuple. If more or less
	 * indices are passed than the size of this tuple the new tuple gets resized
	 * accordingly.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in the tuple should be
	 * placed at the index 2, the index 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * @param indices The indices in the tuple in new order.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default TupboR rearrangeResizeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);

		boolean[] values = new boolean[indices.length];
		
		for(int i = 0; i < indices.length; i++)
			values[i] = getByIndex(indices[i]);
		
		return createNew(values);
	}
	
	/**
	 * Swaps two component values based on their indices and returns the result
	 * as a new instance of this type of tuple.
	 * 
	 * @param indexA The index to the first value to be swapped.
	 * @param indexB The index to the second value to be swapped.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	default TupboR swapByIndexN(int indexA, int indexB)
	{
		if(Validation.argumentValidation())
		{
			int lastIndex = size() - 1;
			Validation.inRange("indexA", indexA, 0, lastIndex);
			Validation.inRange("indexB", indexB, 0, lastIndex);
		}
		
		boolean[] values = toArray();
		boolean temp = values[indexA];
		values[indexA] = values[indexB];
		values[indexB] = temp;
		
		return createNew(values);
	}
}
