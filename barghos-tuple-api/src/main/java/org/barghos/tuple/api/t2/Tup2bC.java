package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TupbC;
import org.barghos.tuple.api.tn.TupbR;

/**
 * This interface provides the common functions and methods for byte tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2bC extends Tup2bR, TupbC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2bC setX(byte x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2bC setY(byte y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2bR}.
	 * 
	 * @param t An existing implementation of {@link Tup2bR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2bC set(Tup2bR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bC set(byte value)
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
	default Tup2bC set(byte x, byte y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bC set(@MinLength(2) TupbR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bC setByIndex(@IntValueRange(min=0, max=1) int index, byte value)
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
	default Tup2bC setArray(@MinLength(2) byte... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2bC copy();
}