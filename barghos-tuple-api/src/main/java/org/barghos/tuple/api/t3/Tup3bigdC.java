package org.barghos.tuple.api.t3;

import java.math.BigDecimal;
import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupbigdC;
import org.barghos.tuple.api.tn.TupbigdR;

/**
 * This interface provides the common functions and methods for {@link BigDecimal} tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3bigdC extends Tup3bigdR, TupbigdC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bigdC setX(BigDecimal x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bigdC setY(BigDecimal y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3bigdC setZ(BigDecimal z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3bigdR}.
	 * 
	 * @param t An existing implementation of {@link Tup3bigdR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bigdC set(Tup3bigdR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC set(BigDecimal value)
	{
		return set(value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * @param z The new value of the z component.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bigdC set(BigDecimal x, BigDecimal y, BigDecimal z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC set(@MinLength(3) TupbigdR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC setByIndex(@IntValueRange(min=0, max=2) int index, BigDecimal value)
	{
		Objects.checkIndex(index, 3);
		
		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			case 2: return setZ(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC setArray(@MinLength(3) BigDecimal... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3bigdC copy();
}