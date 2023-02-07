package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupobjC;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This interface provides the common functions and methods for objects tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2objC extends Tup2objR, TupobjC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2objC setX(Object x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2objC setY(Object y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2objR}.
	 * 
	 * @param t An existing implementation of {@link Tup2objR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2objC set(Tup2objR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2objC set(Object value)
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
	default Tup2objC set(Object x, Object y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2objC set(@MinLength(2) TupobjR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2objC setByIndex(@IntValueRange(min=0, max=1) int index, Object value)
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
	default Tup2objC setArray(@MinLength(2) Object... v)
	{
		return set(v[0], v[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2objC copy();
}