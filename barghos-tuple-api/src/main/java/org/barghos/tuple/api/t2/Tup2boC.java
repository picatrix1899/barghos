package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TupboC;
import org.barghos.tuple.api.tn.TupboR;

/**
 * This interface provides the common functions and methods for boolean tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2boC extends Tup2boR, TupboC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2boC setX(boolean x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2boC setY(boolean y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2boR}.
	 * 
	 * @param t An existing implementation of {@link Tup2boR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2boC set(Tup2boR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2boC set(boolean value)
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
	default Tup2boC set(boolean x, boolean y)
	{
		return setX(x).setY(y);
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2boC set(@MinLength(2) TupboR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2boC setByIndex(@IntValueRange(min=0, max=1) int index, boolean value)
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
	default Tup2boC setArray(@MinLength(2) boolean... v)
	{
		return set(v[0], v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2boC copy();
}