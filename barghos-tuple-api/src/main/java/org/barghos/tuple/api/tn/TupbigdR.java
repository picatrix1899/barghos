package org.barghos.tuple.api.tn;

import java.math.BigDecimal;

import org.barghos.documentation.DoubleMinValue;
import org.barghos.documentation.ExtractionParam;
import org.barghos.documentation.IntMinValue;
import org.barghos.documentation.Nullable;

/**
 * This interface provides non invasive (readonly) functions and methods for {@link BigDecimal} tuples with flexible dimension counts.
 * 
 * @author picatrix1899
 */
public interface TupbigdR
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
	BigDecimal getByIndex(@IntMinValue(0) int index);
	
	/**
	 * Returns all component values of the tuple in order as a new array.
	 * Modifications made to the returned array will not alter the values in the tuple.
	 * 
	 * @return An array filled with the component values.
	 */
	default BigDecimal[] toArray()
	{
		return toArray(new BigDecimal[getDimensions()]);
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
	BigDecimal[] toArray(@ExtractionParam BigDecimal[] res);
	
	/**
	 * Returns true if all component values are exactly zero.
	 * 
	 * @return True if all component values are exactly zero.
	 */
	default boolean isZero()
	{
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(getByIndex(i).compareTo(BigDecimal.ZERO) != 0) return false;
		
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
	default boolean isZero(@DoubleMinValue(0.0) BigDecimal tolerance)
	{
		if(tolerance.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException();
		
		int dimensions = getDimensions();
		
		for(int i = 0; i < dimensions; i++)
			if(getByIndex(i).abs().compareTo(tolerance) > 0) return false;
		
		return true;
	}
	
	/**
	 * Copies the component values to a new instance of the current type.
	 * 
	 * @return A new instance of the current tuple with the same component values.
	 */
	TupbigdR copy();
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * 
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable TupbigdR other);
	
	/**
	 * Compares the value of the components of this tuple and the given tuple and returns true,
	 * if the value of each component of this tuple is equal to or within an inclusive margin of the given tolerance around
	 * the value of the corresponding component in the other tuple.
	 * 
	 * @param other The tuple to compare with.
	 * @param tolerance The tolerance that defines the margin.
	 * @return True if this tuple is componentwise equal to the other tuple.
	 */
	boolean equals(@Nullable TupbigdR other, @DoubleMinValue(0.0) BigDecimal tolerance);
}
