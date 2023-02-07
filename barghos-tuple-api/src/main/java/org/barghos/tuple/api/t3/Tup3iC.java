package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupiC;
import org.barghos.tuple.api.tn.TupiR;

/**
 * This interface provides the common functions and methods for int tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3iC extends Tup3iR, TupiC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3iC setX(int x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3iC setY(int y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3iC setZ(int z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3iR}.
	 * 
	 * @param t An existing implementation of {@link Tup3iR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3iC set(Tup3iR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3iC set(int value)
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
	default Tup3iC set(int x, int y, int z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3iC set(@MinLength(3) TupiR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3iC setByIndex(@IntValueRange(min=0, max=2) int index, int value)
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
	default Tup3iC setArray(@MinLength(3) int... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3iC copy();
}