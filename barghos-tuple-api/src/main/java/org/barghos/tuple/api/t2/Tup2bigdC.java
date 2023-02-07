package org.barghos.tuple.api.t2;

import java.math.BigDecimal;
import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupbigdC;
import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This interface provides the common functions and methods for {@link BigDecimal} tuples with two dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup2bigdC extends Tup2bigdR, TupbigdC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2bigdC setX(BigDecimal x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup2bigdC setY(BigDecimal y);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2bigdR}.
	 * 
	 * @param t An existing implementation of {@link Tup2bigdR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2bigdC set(Tup2bigdR t)
	{
		return set(t.getX(), t.getY());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigdC set(BigDecimal value)
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
	default Tup2bigdC set(BigDecimal x, BigDecimal y)
	{
		setX(x);
		setY(y);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigdC set(@MinLength(2) TupbigdR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigdC setByIndex(@IntValueRange(min=0, max=1) int index, BigDecimal value)
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
	default Tup2bigdC setArray(@MinLength(2) BigDecimal... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2bigdC copy();
}