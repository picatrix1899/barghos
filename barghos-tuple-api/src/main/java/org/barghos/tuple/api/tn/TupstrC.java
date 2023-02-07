package org.barghos.tuple.api.tn;

import java.util.Arrays;

import org.barghos.annotation.IntMinValue;

/**
 * This interface provides the common functions and methods for boolean tuples with flexible dimension counts.
 * 
 * @author picatrix1899
 */
public interface TupstrC extends TupstrR
{
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TupstrC setByIndex(@IntMinValue(0)int index, String value);
	
	/**
	 * Adopts the component values from an existing instance of {@link TupstrR}.
	 * 
	 * @param t An existing implementation of {@link TupstrR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default TupstrC set(TupstrR t)
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
	default TupstrC set(String value)
	{
		String[] values = new String[getDimensions()];
		
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
	default TupstrC setArray(String... values)
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	TupstrC copy();
}
