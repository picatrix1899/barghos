package org.barghos.tuple.api.tn;

import java.math.BigDecimal;
import java.util.Arrays;

import org.barghos.documentation.IntMinValue;

/**
 * This interface provides the common functions and methods for {@link BigDecimal} tuples with flexible dimension counts.
 * 
 * @author picatrix1899
 */
public interface TupbigdC extends TupbigdR
{
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TupbigdC setByIndex(@IntMinValue(0) int index, BigDecimal value);
	
	/**
	 * Adopts the component values from an existing instance of {@link TupbigdR}.
	 * 
	 * @param t An existing implementation of {@link TupbigdR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default TupbigdC set(TupbigdR t)
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
	default TupbigdC set(BigDecimal value)
	{
		BigDecimal[] values = new BigDecimal[getDimensions()];
		
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
	default TupbigdC setArray(BigDecimal... values)
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			setByIndex(i, values[i]);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	TupbigdC copy();
}
