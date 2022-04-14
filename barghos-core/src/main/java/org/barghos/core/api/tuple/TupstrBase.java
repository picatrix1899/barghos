package org.barghos.core.api.tuple;

import java.util.Arrays;

/**
 * This interface represents any modifiable N-dimensional string tuple.
 * 
 * @author picatrix1899
 */
public interface TupstrBase extends TupstrR, Cloneable
{
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TupstrBase setByIndex(int index, String value);
	
	/**
	 * Adopts the values from an existing instance of {@link TupstrR}.
	 * 
	 * @param t An existing implementation of {@link TupstrR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default TupstrBase set(TupstrR t)
	{
		return setArray(t.toArray());
	}
	
	/**
	 * Sets all values to a single value.
	 * 
	 * <p>
	 * This is usually used for resetting the tuple back to 0 again, by calling <code>set(0)</code>.
	 * </p>
	 * 
	 * @param value The value used for all values of the tuple.
	 * 
	 * @return The current tuple.
	 */
	default TupstrBase set(String value)
	{
		String[] values = new String[getDimensions()];
		
		Arrays.fill(values, value);
		
		return setArray(values);
	}
	
	/**
	 * Sets the values to the corresponding components.
	 * 
	 * @param values The values to store in the components of the tuple.
	 * 
	 * @return The current tuple.
	 */
	default TupstrBase setArray(String... values)
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);
		
		return this;
	}
	
	/** {@inheritDoc} */
	TupstrBase clone();
}
