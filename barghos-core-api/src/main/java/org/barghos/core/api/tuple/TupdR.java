package org.barghos.core.api.tuple;

import java.nio.DoubleBuffer;

import org.barghos.core.api.documentation.ExtractionParam;
import org.barghos.core.api.util.Validateable;

/**
 * This interface grants readonly access to any N-dimensional double tuples.
 * 
 * <p>
 * It should be prefered by design before direct usage of a type in method parameters,
 * if the method only reads data from the parameter.
 * 
 * @author picatrix1899
 */
public interface TupdR extends Validateable
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
	double getByIndex(int index);
	
	/**
	 * Returns all components of the tuple as a new array.
	 * Any modifications to the result array will not alter the values in the tuple.
	 * 
	 * @return The result array with all components in it.
	 */
	default double[] toArray()
	{
		return toArray(new double[getDimensions()]);
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
	double[] toArray(@ExtractionParam double[] res);
	
	/**
	 * Puts the components of the tuple into the given buffer.
	 * 
	 * @param buffer The buffer to put the components into.
	 * 
	 * @return The buffer.
	 */
	DoubleBuffer toBuffer(DoubleBuffer buffer);
	
	/**
	 * Returns true if all components are finite and therefore not NaN or Infinity.
	 * 
	 * @return True if all components are finite.
	 */
	default boolean isFinite()
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(!Double.isFinite(getByIndex(i))) return false;
		
		return true;
	}
	
	/**
	 * Returns true if all components are exactly zero.
	 * 
	 * @return True if all components are exactly zero.
	 */
	default boolean isExactlyZero()
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(getByIndex(i) != 0.0) return false;
		
		return true;
	}
	
	/**
	 * Returns true if all components are zero within inclusive the given tolerance.
	 * 
	 * @param tolerance The tolerance around zero, that should still count as zero.
	 * 
	 * @return True if all components are technically zero.
	 */
	default boolean isZero(double tolerance)
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(Math.abs(getByIndex(i)) > tolerance) return false;
		
		return true;
	}
}
