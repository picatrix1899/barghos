package org.barghos.util.tuple.shorts;

import java.util.Arrays;

import org.barghos.annotation.IntMinValue;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for short tuples
 * with flexible dimension counts.
 */
public interface TupsC extends TupsR
{
	/** {@inheritDoc}} */
	@Override
	TupsC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default TupsC createNew(TupsR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	TupsC createNew(short[] t);
	
	/**
	 * Sets the value of the component at the given index.
	 *
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 *
	 * @return The current tuple.
	 */
	TupsC setByIndex(@IntMinValue(0) int index, short value);

	/**
	 * Adopts the component values from an existing instance of {@link TupsR}.
	 *
	 * @param t An existing implementation of {@link TupsR} to adopt the
	 * component values from.
	 *
	 * @return The current tuple.
	 */
	default TupsC set(TupsR t)
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
	default TupsC set(short value)
	{
		short[] values = new short[size()];

		Arrays.fill(values, value);

		return setArray(values);
	}

	/**
	 * Adopts the component values from an existing instance of {@link TupsR}.
	 * If the other tuple contains more or less values than the size of this
	 * tuple the tuple gets resized accordingly.
	 *
	 * @param t An existing implementation of {@link TupsR} to adopt the
	 * component values from.
	 *
	 * @return The current tuple.
	 */
	default TupsC setResize(TupsR t)
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
	default TupsC setArray(short... t)
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
	TupsC setArrayResize(short... t);
	
	/** {@inheritDoc} */
	@Override
	TupsC copy();
	
	/** {@inheritDoc}} */
	@Override
	default TupsC resizeN(int size)
	{
		Validation.validateMin("size", size, 0);
		
		short[] oldValues = toArray();
		short[] newValues = new short[size];
		
		int s = Math.min(size(), size);
		
		for(int i = 0; i < s; i++)
			newValues[i] = oldValues[i];
		
		return createNew(newValues);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupsC rearrangeN(int[] indices)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("indices", indices);
			Validation.expectSize("indices", indices, size());
		}
		
		int size = size();
		
		short[] values = new short[size];
		
		for(int i = 0; i < size; i++)
			values[i] = getByIndex(indices[i]);
		
		return createNew(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupsC rearrangeResizeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		
		short[] values = new short[indices.length];
		
		for(int i = 0; i < indices.length; i++)
			values[i] = getByIndex(indices[i]);
		
		return createNew(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupsC swapByIndexN(int indexA, int indexB)
	{
		if(Validation.argumentValidation())
		{
			int lastIndex = size() - 1;
			Validation.inRange("indexA", indexA, 0, lastIndex);
			Validation.inRange("indexB", indexB, 0, lastIndex);
		}
		
		short[] values = toArray();
		short temp = values[indexA];
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
	default TupsC resize(int size)
	{
		Validation.validateMin("size", size, 0);
		
		short[] oldValues = toArray();
		short[] newValues = new short[size];
		
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
	default TupsC rearrange(int[] indices)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("indices", indices);
			Validation.expectSize("indices", indices, size());
		}
		
		int size = size();
		
		short[] values = new short[size];
		
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
	default TupsC rearrangeResize(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		
		short[] values = new short[indices.length];
		
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
	default TupsC swapByIndex(int indexA, int indexB)
	{
		if(Validation.argumentValidation())
		{
			int lastIndex = size() - 1;
			Validation.inRange("indexA", indexA, 0, lastIndex);
			Validation.inRange("indexB", indexB, 0, lastIndex);
		}
		
		short temp = getByIndex(indexA);
		setByIndex(indexA, getByIndex(indexB));
		setByIndex(indexB, temp);
		
		return this;
	}
}
