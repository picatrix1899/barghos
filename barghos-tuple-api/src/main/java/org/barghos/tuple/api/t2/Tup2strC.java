package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TupstrC;
import org.barghos.tuple.api.tn.TupstrR;

/**
 * This interface provides the common functions and methods for string tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2strC extends Tup2strR, TupstrC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2strC setX(String x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2strC setY(String y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2strR}.
	 * 
	 * @param t An existing implementation of {@link Tup2strR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2strC set(Tup2strR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC set(String value)
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
	default Tup2strC set(String x, String y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2strC set(@MinLength(2) TupstrR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2strC setByIndex(@IntValueRange(min=0, max=1) int index, String value)
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
	default Tup2strC setArray(@MinLength(2) String... v)
	{
		return set(v[0], v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2strC copy();
}