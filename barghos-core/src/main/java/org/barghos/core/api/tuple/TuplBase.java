package org.barghos.core.api.tuple;

import java.util.Arrays;

/**
 * This interface represents any modifiable N-dimensional long tuple.
 * 
 * @author picatrix1899
 */
public interface TuplBase extends TuplR, Cloneable
{
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TuplBase setByIndex(int index, long value);
	
	/**
	 * Adopts the values from an existing instance of {@link TuplR}.
	 * 
	 * @param t An existing implementation of {@link TuplR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default TuplBase set(TuplR t)
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
	default TuplBase set(long value)
	{
		long[] values = new long[getDimensions()];
		
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
	default TuplBase setArray(long... values)
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);
		
		return this;
	}
	
	/** {@inheritDoc} */
	TuplBase clone();
}
