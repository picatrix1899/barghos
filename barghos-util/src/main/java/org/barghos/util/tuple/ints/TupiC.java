package org.barghos.util.tuple.ints;

import java.util.Arrays;

import org.barghos.annotation.IntMinValue;

/**
 * This interface provides the common functions and methods for int tuples with flexible dimension counts.
 */
public interface TupiC extends TupiR
{
	/**
	 * Sets the value of the component at the given index.
	 *
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 *
	 * @return The current tuple.
	 */
	TupiC setByIndex(@IntMinValue(0) int index, int value);

	/**
	 * Adopts the component values from an existing instance of {@link TupiR}.
	 *
	 * @param t An existing implementation of {@link TupiR} to adopt the component values from.
	 *
	 * @return The current tuple.
	 */
	default TupiC set(TupiR t)
	{
		return setArray(t.toArray());
	}

	/**
	 * Sets all component values to a single value.
	 *
	 * @param value The value used for all component values of the tuple.
	 *
	 * @return The current tuple.
	 */
	default TupiC set(int value)
	{
		int[] values = new int[dimensions()];

		Arrays.fill(values, value);

		return setArray(values);
	}

	/**
	 * Sets the component values to the corresponding values in the array.
	 *
	 * @param values The array with the values for the components.
	 *
	 * @return The current tuple.
	 */
	default TupiC setArray(int... values)
	{
		int dimensions = dimensions();

		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);

		return this;
	}

	/** {@inheritDoc} */
	@Override
	TupiC copy();
}
