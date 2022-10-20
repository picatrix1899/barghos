package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TuplC;
import org.barghos.tuple.api.tn.TuplR;

/**
 * This interface provides the common functions and methods for long tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3lC extends Tup3lR, TuplC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3lC setX(long x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3lC setY(long y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3lC setZ(long z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3lR}.
	 * 
	 * @param t An existing implementation of {@link Tup3lR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3lC set(Tup3lR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC set(long value)
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
	default Tup3lC set(long x, long y, long z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC set(@MinLength(3) TuplR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC setByIndex(@IntValueRange(min=0, max=2) int index, long value)
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
	default Tup3lC setArray(@MinLength(3) long... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3lC copy();
}