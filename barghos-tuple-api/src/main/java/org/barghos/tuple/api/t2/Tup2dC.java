package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupdC;
import org.barghos.tuple.api.tn.TupdR;

/**
 * This interface provides the common functions and methods for double tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2dC extends Tup2dR, TupdC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2dC setX(double x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2dC setY(double y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2dR}.
	 * 
	 * @param t An existing implementation of {@link Tup2dR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2dC set(Tup2dR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2dC set(double value)
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
	default Tup2dC set(double x, double y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2dC set(@MinLength(2) TupdR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2dC setByIndex(@IntValueRange(min=0, max=1) int index, double value)
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
	default Tup2dC setArray(@MinLength(2) double... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2dC copy();
}