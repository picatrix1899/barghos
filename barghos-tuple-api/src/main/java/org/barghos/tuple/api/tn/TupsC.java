package org.barghos.tuple.api.tn;

import java.util.Arrays;

import org.barghos.documentation.IntMinValue;

/**
 * This interface provides the common functions and methods for short tuples with flexible dimension counts.
 * 
 * @author picatrix1899
 */
public interface TupsC extends TupsR
{
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
	 * @param t An existing implementation of {@link TupsR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default TupsC set(TupsR t)
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
	default TupsC set(short value)
	{
		short[] values = new short[getDimensions()];
		
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
	default TupsC setArray(short... values)
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	TupsC copy();
}
