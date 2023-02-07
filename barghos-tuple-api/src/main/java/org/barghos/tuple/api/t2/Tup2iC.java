package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupiC;
import org.barghos.tuple.api.tn.TupiR;

/**
 * This interface provides the common functions and methods for int tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2iC extends Tup2iR, TupiC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2iC setX(int x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2iC setY(int y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2iR}.
	 * 
	 * @param t An existing implementation of {@link Tup2iR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2iC set(Tup2iR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2iC set(int value)
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
	default Tup2iC set(int x, int y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2iC set(@MinLength(2) TupiR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2iC setByIndex(@IntValueRange(min=0, max=1) int index, int value)
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
	default Tup2iC setArray(@MinLength(2) int... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2iC copy();
}