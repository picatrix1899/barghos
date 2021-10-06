package org.barghos.core.api.tuple;

import java.util.Arrays;

/**
 * This interface grants writeonly access to any N-dimensional integer tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only writes data to the parameter.
 * 
 * @author picatrix1899
 */
public interface TupiW
{
	/**
	 * Returns the number of dimensions of the tuple.
	 * That is the count of components in this tuple.
	 * 
	 * @return The number of dimensions.
	 */
	int getDimensions();
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current tuple.
	 */
	TupiW setByIndex(int index, int value);
	
	/**
	 * Adopts the values from an existing instance of {@link TupiR}.
	 * 
	 * @param t An existing implementation of {@link TupiR} to adopt the values from.
	 * 
	 * @return The current tuple.
	 */
	default TupiW set(TupiR t)
	{
		return setArray(t.getArray());
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
	default TupiW set(int value)
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
	default TupiW setArray(int... values)
	{
		int dimensions = getDimensions();
		for(int i = 0; i < dimensions; i++)
		{
			setByIndex(i, values[i]);
		}
		
		return this;
	}
}
