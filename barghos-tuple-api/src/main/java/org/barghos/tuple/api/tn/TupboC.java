package org.barghos.tuple.api.tn;

import java.util.Arrays;

import org.barghos.annotation.IntMinValue;

/**
 * This interface provides the common functions and methods for boolean tuples with flexible dimension counts.
 * 
 * @author picatrix1899
 */
public interface TupboC extends TupboR
{
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TupboC setByIndex(@IntMinValue(0) int index, boolean value);
	
	/**
	 * Adopts the component values from an existing instance of {@link TupboR}.
	 * 
	 * @param t An existing implementation of {@link TupboR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default TupboC set(TupboR t)
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
	default TupboC set(boolean value)
	{
		boolean[] values = new boolean[getDimensions()];
		
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
	default TupboC setArray(boolean... values)
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	TupboC copy();
}
