package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TuplC;
import org.barghos.tuple.api.tn.TuplR;

/**
 * This interface provides the common functions and methods for long tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2lC extends Tup2lR, TuplC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2lC setX(long x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2lC setY(long y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2lR}.
	 * 
	 * @param t An existing implementation of {@link Tup2lR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2lC set(Tup2lR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC set(long value)
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
	default Tup2lC set(long x, long y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC set(@MinLength(2) TuplR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC setByIndex(@IntValueRange(min=0, max=1) int index, long value)
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
	default Tup2lC setArray(@MinLength(2) long... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2lC copy();
}