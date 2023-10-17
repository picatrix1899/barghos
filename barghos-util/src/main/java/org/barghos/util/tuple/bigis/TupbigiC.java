package org.barghos.util.tuple.bigis;

import java.math.BigInteger;
import java.util.Arrays;

import org.barghos.annotation.IntMinValue;

/**
 * This interface provides the common functions and methods for {@link BigInteger} tuples with flexible dimension counts.
 */
public interface TupbigiC extends TupbigiR
{
	/**
	 * Sets the value of the component at the given index.
	 *
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 *
	 * @return The current tuple.
	 */
	TupbigiC setByIndex(@IntMinValue(0) int index, BigInteger value);

	/**
	 * Adopts the component values from an existing instance of {@link TupbigiR}.
	 *
	 * @param t An existing implementation of {@link TupbigiR} to adopt the component values from.
	 *
	 * @return The current tuple.
	 */
	default TupbigiC set(TupbigiR t)
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
	default TupbigiC set(BigInteger value)
	{
		BigInteger[] values = new BigInteger[dimensions()];

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
	default TupbigiC setArray(BigInteger... values)
	{
		int dimensions = dimensions();

		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);

		return this;
	}

	/** {@inheritDoc} */
	@Override
	TupbigiC copy();
}
