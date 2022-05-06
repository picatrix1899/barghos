package org.barghos.core.api.tuple;

import java.math.BigInteger;
import java.util.Arrays;

import org.barghos.core.api.util.ExtendedCloneable;

/**
 * This interface represents any modifiable N-dimensional big integer tuple.
 * 
 * @author picatrix1899
 */
public interface TupbigiC extends TupbigiR, ExtendedCloneable
{
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TupbigiC setByIndex(int index, BigInteger value);
	
	/**
	 * Adopts the values from an existing instance of {@link TupbigiR}.
	 * 
	 * @param t An existing implementation of {@link TupbigiR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default TupbigiC set(TupbigiR t)
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
	default TupbigiC set(BigInteger value)
	{
		BigInteger[] values = new BigInteger[getDimensions()];
		
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
	default TupbigiC setArray(BigInteger... values)
	{
		int dimensions = getDimensions();
		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	TupbigiC shallowClone();
	
	/** {@inheritDoc}} */
	@Override
	TupbigiC deepClone();
	
	/**
	 * @return A new instance of the current tuple with the same component values.
	 */
	TupbigiC clone();
}
