package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupcC;
import org.barghos.tuple.api.tn.TupcR;

/**
 * This interface provides the common functions and methods for char tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2cC extends Tup2cR, TupcC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2cC setX(char x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2cC setY(char y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2cR}.
	 * 
	 * @param t An existing implementation of {@link Tup2cR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2cC set(Tup2cR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2cC set(char value)
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
	default Tup2cC set(char x, char y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2cC set(@MinLength(2) TupcR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2cC setByIndex(@IntValueRange(min=0, max=1) int index, char value)
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
	default Tup2cC setArray(@MinLength(2) char... v)
	{
		return set(v[0], v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2cC copy();
}