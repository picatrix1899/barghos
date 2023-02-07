package org.barghos.tuple.api.tn;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.FloatMinValue;
import org.barghos.annotation.IntMinValue;
import org.barghos.annotation.Nullable;

/**
 * This interface provides non invasive (readonly) functions and methods for float tuples with flexible dimension counts.
 * 
 * @author picatrix1899
 */
public interface TupfR
{
	/**
	 * Returns the number of dimensions and therefore the number of components of the tuple.
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
	float getByIndex(@IntMinValue(0) int index);
	
	/**
	 * Returns all component values of the tuple in order as a new array.
	 * Modifications made to the returned array will not alter the values in the tuple.
	 * 
	 * @return An array filled with the component values.
	 */
	default float[] toArray()
	{
		return toArray(new float[getDimensions()]);
	}
	
	/**
	 * Fills the given result array with the component values of the tuple in order and returns it.
	 * The size of the result array has to be equal to or greater than the number of dimensions of this tuple.
	 * Modifications made to the result array will not alter the values in the tuple.
	 * 
	 * @param res The result array.
	 * 
	 * @return The result array filled with the component values.
	 */
	float[] toArray(@ExtractionParam float[] res);
	
	/**
	 * Returns true if all component values are finite as defined by {@link Float#isFinite(float)} and are therefore neither NaN or Infinity.
	 * 
	 * @return True if all component values are finite.
	 */
	default boolean isFinite()
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(!Float.isFinite(getByIndex(i))) return false;
		
		return true;
	}
	
	/**
	 * Returns true if all component values are exactly zero.
	 * 
	 * @return True if all component values are exactly zero.
	 */
	default boolean isZero()
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(getByIndex(i) != 0.0f) return false;
		
		return true;
	}
	
	/**
	 * Returns true if all component values are exactly zero or within a inclusive margin of the given tolerance.
	 * 
	 * @param tolerance The tolerance around zero, that should still count as zero.
	 * 
	 * @return True if all component values are withing the margin around zero.
	 * 
	 * @throws IllegalArgumentException If the tolerance is below zero.
	 */
	default boolean isZero(@FloatMinValue(0.0f) float tolerance)
	{
		if(tolerance < 0.0f) throw new IllegalArgumentException();
		
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(Math.abs(getByIndex(i)) > tolerance) return false;
		
		return true;
	}
	
	/**
	 * Copies the component values to a new instance of the current type.
	 * 
	 * @return A new instance of the current tuple with the same component values.
	 */
	TupfR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable TupfR other);
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable TupfR other, @FloatMinValue(0.0f) float tolerance);
}
