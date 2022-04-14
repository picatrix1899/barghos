package org.barghos.core.api.tuple;

import java.util.Arrays;

/**
 * This interface represents any modifiable N-dimensional double tuple.
 * 
 * @author picatrix1899
 */
public interface TupdBase extends TupdR, Cloneable
{
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TupdBase setByIndex(int index, double value);
	
	/**
	 * Adopts the values from an existing instance of {@link TupdR}.
	 * 
	 * @param t An existing implementation of {@link TupdR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default TupdBase set(TupdR t)
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
	default TupdBase set(double value)
	{
		double[] values = new double[getDimensions()];
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
	default TupdBase setArray(double... values)
	{
		int dimensions = getDimensions();
		for(int i = 0; i < dimensions; i++)
		{
			setByIndex(i, values[i]);
		}
		
		return this;
	}
	
	/** {@inheritDoc} */
	TupdBase clone();
}
