package org.barghos.util.tuple.longs;

import java.util.Arrays;

import org.barghos.annotation.IntMinValue;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for long tuples with flexible dimension
 * counts.
 */
public interface TuplC extends TuplR
{
	/** {@inheritDoc}} */
	@Override
	TuplC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default TuplC createNew(TuplR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	TuplC createNew(long[] t);
	
	/**
	 * Sets the value of the component at the given index.
	 *
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 *
	 * @return The current tuple.
	 */
	TuplC setByIndex(@IntMinValue(0) int index, long value);

	/**
	 * Adopts the component values from an existing instance of {@link TuplR}.
	 *
	 * @param t An existing implementation of {@link TuplR} to adopt the component values from.
	 *
	 * @return The current tuple.
	 */
	default TuplC set(TuplR t)
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
	default TuplC set(long value)
	{
		long[] values = new long[size()];

		Arrays.fill(values, value);

		return setArray(values);
	}

	/**
	 * Adopts the component values from an existing instance of {@link TuplR}. If the other tuple
	 * contains more or less values than the size of this tuple the tuple gets resized accordingly.
	 *
	 * @param t An existing implementation of {@link TuplR} to adopt the component values from.
	 *
	 * @return The current tuple.
	 */
	default TuplC setResize(TuplR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArrayResize(t.toArray());
	}
	
	/**
	 * Sets the component values to the corresponding values in the array. If more or less values
	 * are passed than the size of this tuple the tuple gets resized accordingly.
	 *
	 *
	 * @param values The array with the values for the components.
	 *
	 * @return The current tuple.
	 */
	default TuplC setArray(long... t)
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
	TuplC setArrayResize(long... t);

	/** {@inheritDoc} */
	@Override
	TuplC copy();
}
