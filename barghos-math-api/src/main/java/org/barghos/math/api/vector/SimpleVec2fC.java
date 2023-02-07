package org.barghos.math.api.vector;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.t2.Tup2fC;
import org.barghos.tuple.api.t2.Tup2fR;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for basic float tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface SimpleVec2fC extends SimpleVec2fR, Tup2fC
{
	/** {@inheritDoc} */
	@Override
	SimpleVec2fC copy();
	
	/**
	 * Sets the value of the x component of the vector.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current vector.
	 */
	@Override
	SimpleVec2fC setX(float x);
	
	/**
	 * Sets the value of the y component of the vector.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current vector.
	 */
	@Override
	SimpleVec2fC setY(float y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2fR}.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec2fC set(Tup2fR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/**
	 * Sets all component values to a single value.
	 * 
	 * @param value The value used for all component values of the vector.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec2fC set(float value)
	{
		return set(value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec2fC set(float x, float y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/**
	 * Adopts the component values from an existing instance of {@link TupfR}.
	 * 
	 * @param t An existing implementation of {@link TupfR} to adopt the component values from.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec2fC set(@MinLength(2) TupfR t)
	{
		return setArray(t.toArray());
	}
	
	/**
	 * Sets the value of the component at the given index.
	 * 
	 * @param index The index of the component to store the value in.
	 * @param value The new value for the component.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec2fC setByIndex(@IntValueRange(min=0, max=1) int index, float value)
	{
		Objects.checkIndex(index, 2);

		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			
			default: throw new AssertionError(index);
		}
	}
	
	/**
	 * Sets the component values to the corresponding values in the array.
	 * 
	 * @param values The array with the values for the components.
	 * 
	 * @return The current vector.
	 */
	@Override
	default SimpleVec2fC setArray(@MinLength(2) float... values)
	{
		return set(values[0], values[1]);
	}
}
