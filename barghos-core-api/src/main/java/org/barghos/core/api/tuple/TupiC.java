package org.barghos.core.api.tuple;

import java.util.Arrays;

import org.barghos.core.api.util.ExtendedCloneable;

/**
 * This interface represents any modifiable N-dimensional integer tuple.
 * 
 * @author picatrix1899
 */
public interface TupiC extends TupiR, ExtendedCloneable
{
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TupiC setByIndex(int index, int value);
	
	/**
	 * Adopts the values from an existing instance of {@link TupiR}.
	 * 
	 * @param t An existing implementation of {@link TupiR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default TupiC set(TupiR t)
	{
		return setArray(t.toArray());
	}
	
	/**
	 * Sets all values to a single value.
	 * 
	 * @param value The value used for all values of the tuple.
	 * 
	 * @return The current tuple.
	 */
	default TupiC set(int value)
	{
		int[] values = new int[getDimensions()];
		
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
	default TupiC setArray(int... values)
	{
		int dimensions = getDimensions();
		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupiC shallowClone()
	{
		return clone();
	}
	
	/** {@inheritDoc}} */
	@Override
	default TupiC deepClone()
	{
		return clone();
	}
	
	/**
	 * @return A new instance of the current tuple with the same component values.
	 */
	TupiC clone();
}
