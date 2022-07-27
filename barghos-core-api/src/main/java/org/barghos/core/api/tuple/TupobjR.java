package org.barghos.core.api.tuple;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.util.Validateable;

/**
 * This interface grants readonly access to any N-dimensional object tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface TupobjR extends Validateable
{
	/**
	 * Returns the number of dimensions of the tuple.
	 * That is the count of components in this tuple.
	 * 
	 * @return The number of dimensions.
	 */
	int getDimensions();
	
	/**
	 * Returns the value of the component at the specified index from the tuple.
	 * 
	 * @param index The index of the value to return
	 * 
	 * @return The value at the specified index from the tuple.
	 */
	Object getByIndex(int index);
	
	/**
	 * Returns all components of the tuple as a new array.
	 * Any modifications to the result array will not alter the values in the tuple.
	 * 
	 * @return The result array with all components in it.
	 */
	default Object[] toArray()
	{
		return toArray(new Object[getDimensions()]);
	}
	
	/**
	 * Returns all components of the tuple as the given array.
	 * The array has to consist of as many entries as this tuple has dimensions.
	 * Any modifications to the result array will not alter the values in the tuple.
	 * 
	 * @param res The result array.
	 * 
	 * @return The result array with all components in it.
	 */
	Object[] toArray(@ExtractionParam Object[] res);
	
	/**
	 * Returns true if all the components are valid.
	 * What values are considered valid or invalid depends on the tuple type.
	 * 
	 * @return True if all the components are valid.
	 */
	default boolean isValid()
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(getByIndex(i) == null) return false;
		
		return true;
	}
}
