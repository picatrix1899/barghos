package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for float tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2fC extends Tup2fR, TupfC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2fC setX(float x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2fC setY(float y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2fR}.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2fC set(Tup2fR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2fC set(float value)
	{
		return set(value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * 
	 * @return The current tuple.
	 */
	default Tup2fC set(float x, float y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2fC set(@MinLength(2) TupfR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2fC setByIndex(@IntValueRange(min=0, max=1) int index, float value)
	{
		Objects.checkIndex(index, 2);

		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2fC setArray(@MinLength(2) float... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2fC copy();
}