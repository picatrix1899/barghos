package org.barghos.util.tuple.strings;

import java.util.Arrays;

import org.barghos.annotation.IntMinValue;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for string tuples
 * with flexible dimension counts.
 */
public interface TupstrC extends TupstrR
{
	/** {@inheritDoc}} */
	@Override
	TupstrC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default TupstrC createNew(TupstrR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	TupstrC createNew(String[] t);
	
	/**
	 * Sets the value of the component at the given index.
	 *
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 *
	 * @return The current tuple.
	 */
	TupstrC setByIndex(@IntMinValue(0) int index, String value);

	/**
	 * Adopts the component values from an existing instance of {@link TupstrR}.
	 *
	 * @param t An existing implementation of {@link TupstrR} to adopt the
	 * component values from.
	 *
	 * @return The current tuple.
	 */
	default TupstrC set(TupstrR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArray(t.toArray());
	}

	/**
	 * Sets all component values to a single value.
	 *
	 * @param value The value used for all component values of the tuple.
	 *
	 * @return The current tuple.
	 */
	default TupstrC set(String value)
	{
		String[] values = new String[size()];

		Arrays.fill(values, value);

		return setArray(values);
	}

	/**
	 * Adopts the component values from an existing instance of {@link TupstrR}.
	 * If the other tuple contains more or less values than the size of this
	 * tuple the tuple gets resized accordingly.
	 *
	 * @param t An existing implementation of {@link TupstrR} to adopt the
	 * component values from.
	 *
	 * @return The current tuple.
	 */
	default TupstrC setResize(TupstrR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArrayResize(t.toArray());
	}
	
	/**
	 * Sets the component values to the corresponding values in the array.
	 * If more or less values are passed than the size of this tuple the tuple
	 * gets resized accordingly.
	 *
	 *
	 * @param values The array with the values for the components.
	 *
	 * @return The current tuple.
	 */
	default TupstrC setArray(String... t)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("t", t);
			Validation.expectSize("t", t, size());
		}
		
		int size = size();

		for(int i = 0; i < size; i++)
			setByIndex(i, t[i]);

		return this;
	}

	/**
	 * Sets the component values to the corresponding values in the array.
	 *
	 * @param values The array with the values for the components.
	 *
	 * @return The current tuple.
	 */
	TupstrC setArrayResize(String... t);
	
	/** {@inheritDoc} */
	@Override
	TupstrC copy();
	
	/** {@inheritDoc}} */
	@Override
	default TupstrR resizeN(int size)
	{
		Validation.validateMin("size", size, 0);
		
		String[] oldValues = toArray();
		String[] newValues = new String[size];
		
		int s = Math.min(size(), size);
		
		for(int i = 0; i < s; i++)
			newValues[i] = oldValues[i];
		
		return createNew(newValues);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupstrR rearrangeN(int[] indices)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("indices", indices);
			Validation.expectSize("indices", indices, size());
		}
		
		int size = size();
		
		String[] values = new String[size];
		
		for(int i = 0; i < size; i++)
			values[i] = getByIndex(indices[i]);
		
		return createNew(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupstrR rearrangeResizeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		
		String[] values = new String[indices.length];
		
		for(int i = 0; i < indices.length; i++)
			values[i] = getByIndex(indices[i]);
		
		return createNew(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupstrR swapByIndexN(int indexA, int indexB)
	{
		if(Validation.argumentValidation())
		{
			int lastIndex = size() - 1;
			Validation.inRange("indexA", indexA, 0, lastIndex);
			Validation.inRange("indexB", indexB, 0, lastIndex);
		}
		
		String[] values = toArray();
		String temp = values[indexA];
		values[indexA] = values[indexB];
		values[indexB] = temp;
		
		return createNew(values);
	}
	
	/**
	 * Resizes the tuple to the passed size and either trims of any excess
	 * components or adds new empty components.
	 * 
	 * @param size The new size.
	 * 
	 * @return This tuple.
	 */
	default TupstrC resize(int size)
	{
		Validation.validateMin("size", size, 0);
		
		String[] oldValues = toArray();
		String[] newValues = new String[size];
		
		int s = Math.min(size(), size);
		
		for(int i = 0; i < s; i++)
			newValues[i] = oldValues[i];
		
		setArrayResize(newValues);
		
		return this;
	}
	
	/**
	 * Rearranges the order of the component values by their indices.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in the tuple should be
	 * placed at the index 2, the index 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * @param indices The indices in the tuple in new order.
	 * 
	 * @return This tuple.
	 */
	default TupstrR rearrange(int[] indices)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("indices", indices);
			Validation.expectSize("indices", indices, size());
		}
		
		int size = size();
		
		String[] values = new String[size];
		
		for(int i = 0; i < size; i++)
			values[i] = getByIndex(indices[i]);
		
		setArrayResize(values);
		
		return this;
	}
	
	/**
	 * Rearranges the order of the component values by their indices. If more or
	 * less indices are passed than the size of this tuple the tuple gets
	 * resized accordingly.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in the tuple should be
	 * placed at the index 2, the index 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * @param indices The indices in the tuple in new order.
	 * 
	 * @return This tuple.
	 */
	default TupstrC rearrangeResize(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		
		String[] values = new String[indices.length];
		
		for(int i = 0; i < indices.length; i++)
			values[i] = getByIndex(indices[i]);
		
		setArrayResize(values);
		
		return this;
	}
	
	/**
	 * Swaps two component values based on their indices.
	 * 
	 * @param indexA The index to the first value to be swapped.
	 * @param indexB The index to the second value to be swapped.
	 * 
	 * @return This tuple.
	 */
	default TupstrC swapByIndex(int indexA, int indexB)
	{
		if(Validation.argumentValidation())
		{
			int lastIndex = size() - 1;
			Validation.inRange("indexA", indexA, 0, lastIndex);
			Validation.inRange("indexB", indexB, 0, lastIndex);
		}
		
		String temp = getByIndex(indexA);
		setByIndex(indexA, getByIndex(indexB));
		setByIndex(indexB, temp);
		
		return this;
	}
}
