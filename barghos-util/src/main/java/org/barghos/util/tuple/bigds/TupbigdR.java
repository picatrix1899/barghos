package org.barghos.util.tuple.bigds;

import java.math.BigDecimal;

import org.barghos.annotation.DoubleMinValue;
import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntMinValue;
import org.barghos.annotation.Nullable;

import org.barghos.validation.Validation;

/**
 * This interface provides non-invasive (read only) functions and methods for
 * {@link BigDecimal} tuples with flexible dimension counts.
 */
public interface TupbigdR
{
	/**
	 * Creates a new instance of the type of this tuple.
	 * 
	 * @return A new instance.
	 */
	TupbigdR createNew();
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return A new instance.
	 */
	default TupbigdR createNew(TupbigdR t)
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
	TupbigdR createNew(BigDecimal[] t);
	
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
	BigDecimal getByIndex(@IntMinValue(0) int index);

	/**
	 * Returns all component values of the tuple in order as a new array.
	 * Modifications made to the returned array will not alter the values in the
	 * tuple.
	 *
	 * @return An array filled with the component values.
	 */
	default BigDecimal[] toArray()
	{
		return toArray(new BigDecimal[size()]);
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
	BigDecimal[] toArray(@ExtractionParam BigDecimal[] res);

	/**
	 * Returns true if all component values are exactly zero.
	 *
	 * @return True if all component values are exactly zero.
	 */
	default boolean isZero()
	{
		int size = size();

		for(int i = 0; i < size; i++)
			if(getByIndex(i).compareTo(BigDecimal.ZERO) != 0) return false;

		return true;
	}

	/**
	 * Returns true if all component values are exactly zero or within a
	 * inclusive margin of the given tolerance.
	 *
	 * @param tolerance The tolerance around zero, that should still count as
	 * zero.
	 *
	 * @return True if all component values are within the margin around zero.
	 *
	 * @throws IllegalArgumentException If the tolerance is below zero.
	 */
	default boolean isZero(@DoubleMinValue(0.0) BigDecimal tolerance)
	{
		Validation.validateMin("tolerance", tolerance, BigDecimal.ZERO);

		int size = size();

		for(int i = 0; i < size; i++)
			if(getByIndex(i).abs().compareTo(tolerance) > 0) return false;

		return true;
	}

	/**
	 * Copies the component values to a new instance of the current type.
	 *
	 * @return A new instance of the current tuple with the same component
	 * values.
	 */
	TupbigdR copy();

	/**
	 * Compares the value of the components of this tuple and the given tuple
	 * and returns true, if the value of each component of this tuple is equal
	 * to the value of the corresponding component in the other tuple.
	 *
	 * @param other The tuple to compare with.
	 *
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable TupbigdR other)
	{
		if(other == null) return false;
		if(other == this) return true;
		
		int size = size();
		
		if(size == other.size()) return false;

		for(int i = 0; i < size; i++)
			if(getByIndex(i).compareTo(other.getByIndex(i)) != 0) return false;

		return true;
	}

	/**
	 * Compares the value of the components of this tuple and the given tuple
	 * and returns true, if the value of each component of this tuple is equal
	 * to or within an inclusive margin of the given tolerance around the value
	 * of the corresponding component in the other tuple.
	 *
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is component-wise equal to the other tuple.
	 */
	default boolean equals(@Nullable TupbigdR other, @DoubleMinValue(0.0) BigDecimal tolerance)
	{
		Validation.validateMin("tolerance", tolerance, BigDecimal.ZERO);
		
		if(other == null) return false;
		if(other == this) return true;
		
		int size = size();
		
		if(size == other.size()) return false;

		for(int i = 0; i < size; i++)
			if(getByIndex(i).subtract(other.getByIndex(i)).abs().compareTo(tolerance) > 0) return false;

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
	default TupbigdR resizeN(int size)
	{
		Validation.validateMin("size", size, 0);
		
		BigDecimal[] oldValues = toArray();
		BigDecimal[] newValues = new BigDecimal[size];
		
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
	default TupbigdR rearrangeN(int[] indices)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("indices", indices);
			Validation.expectSize("indices", indices, size());
		}
		
		int size = size();
		
		BigDecimal[] values = new BigDecimal[size];
		
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
	default TupbigdR rearrangeResizeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);

		BigDecimal[] values = new BigDecimal[indices.length];
		
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
	default TupbigdR swapByIndexN(int indexA, int indexB)
	{
		if(Validation.argumentValidation())
		{
			int lastIndex = size() - 1;
			Validation.inRange("indexA", indexA, 0, lastIndex);
			Validation.inRange("indexB", indexB, 0, lastIndex);
		}
		
		BigDecimal[] values = toArray();
		BigDecimal temp = values[indexA];
		values[indexA] = values[indexB];
		values[indexB] = temp;
		
		return createNew(values);
	}
}
