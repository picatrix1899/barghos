package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupsC;
import org.barghos.tuple.api.tn.TupsR;

/**
 * This interface provides the common functions and methods for short tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2sC extends Tup2sR, TupsC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2sC setX(short x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2sC setY(short y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2sR}.
	 * 
	 * @param t An existing implementation of {@link Tup2sR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2sC set(Tup2sR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2sC set(short value)
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
	default Tup2sC set(short x, short y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2sC set(@MinLength(2) TupsR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2sC setByIndex(@IntValueRange(min=0, max=1) int index, short value)
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
	default Tup2sC setArray(@MinLength(2) short... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2sC copy();
}