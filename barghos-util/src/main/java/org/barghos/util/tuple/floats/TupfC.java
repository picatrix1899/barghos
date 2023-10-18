package org.barghos.util.tuple.floats;

import java.util.Arrays;

import org.barghos.annotation.IntMinValue;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for float tuples
 * with flexible dimension counts.
 */
public interface TupfC extends TupfR
{
	/** {@inheritDoc}} */
	@Override
	TupfC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default TupfC createNew(TupfR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	TupfC createNew(float[] t);
	
	/**
	 * Sets the value of the component at the given index.
	 *
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 *
	 * @return The current tuple.
	 */
	TupfC setByIndex(@IntMinValue(0) int index, float value);

	/**
	 * Adopts the component values from an existing instance of {@link TupfR}.
	 *
	 * @param t An existing implementation of {@link TupfR} to adopt the
	 * component values from.
	 *
	 * @return The current tuple.
	 */
	default TupfC set(TupfR t)
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
	default TupfC set(float value)
	{
		float[] values = new float[size()];

		Arrays.fill(values, value);

		return setArray(values);
	}

	/**
	 * Adopts the component values from an existing instance of {@link TupfR}.
	 * If the other tuple contains more or less values than the size of this
	 * tuple the tuple gets resized accordingly.
	 *
	 * @param t An existing implementation of {@link TupfR} to adopt the 
	 * component values from.
	 *
	 * @return The current tuple.
	 */
	default TupfC setResize(TupfR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArrayResize(t.toArray());
	}
	
	/**
	 * Sets the component values to the corresponding values in the array.
	 *
	 * @param values The array with the values for the components.
	 *
	 * @return The current tuple.
	 */
	default TupfC setArray(float... t)
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
	TupfC setArrayResize(float... t);
	
	/** {@inheritDoc} */
	@Override
	TupfC copy();
	
	/** {@inheritDoc}} */
	@Override
	default TupfC resizeN(int size)
	{
		Validation.validateMin("size", size, 0);
		
		float[] oldValues = toArray();
		float[] newValues = new float[size];
		
		int s = Math.min(size(), size);
		
		for(int i = 0; i < s; i++)
			newValues[i] = oldValues[i];
		
		return createNew(newValues);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupfC rearrangeN(int[] indices)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("indices", indices);
			Validation.expectSize("indices", indices, size());
		}
		
		int size = size();
		
		float[] values = new float[size];
		
		for(int i = 0; i < size; i++)
			values[i] = getByIndex(indices[i]);
		
		return createNew(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupfC rearrangeResizeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		
		float[] values = new float[indices.length];
		
		for(int i = 0; i < indices.length; i++)
			values[i] = getByIndex(indices[i]);
		
		return createNew(values);
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupfC swapByIndexN(int indexA, int indexB)
	{
		if(Validation.argumentValidation())
		{
			int lastIndex = size() - 1;
			Validation.inRange("indexA", indexA, 0, lastIndex);
			Validation.inRange("indexB", indexB, 0, lastIndex);
		}
		
		float[] values = toArray();
		float temp = values[indexA];
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
	default TupfC resize(int size)
	{
		Validation.validateMin("size", size, 0);
		
		float[] oldValues = toArray();
		float[] newValues = new float[size];
		
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
	default TupfC rearrange(int[] indices)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("indices", indices);
			Validation.expectSize("indices", indices, size());
		}
		
		int size = size();
		
		float[] values = new float[size];
		
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
	default TupfC rearrangeResize(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		
		float[] values = new float[indices.length];
		
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
	default TupfC swapByIndex(int indexA, int indexB)
	{
		if(Validation.argumentValidation())
		{
			int lastIndex = size() - 1;
			Validation.inRange("indexA", indexA, 0, lastIndex);
			Validation.inRange("indexB", indexB, 0, lastIndex);
		}
		
		float temp = getByIndex(indexA);
		setByIndex(indexA, getByIndex(indexB));
		setByIndex(indexB, temp);
		
		return this;
	}
}
