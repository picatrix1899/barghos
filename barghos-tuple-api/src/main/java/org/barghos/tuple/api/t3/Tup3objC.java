package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupobjC;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This interface provides the common functions and methods for objects tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3objC extends Tup3objR, TupobjC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3objC setX(Object x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3objC setY(Object y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3objC setZ(Object z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3objR}.
	 * 
	 * @param t An existing implementation of {@link Tup3objR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3objC set(Tup3objR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3objC set(Object value)
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
	default Tup3objC set(Object x, Object y, Object z)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3objC set(@MinLength(3) TupobjR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3objC setByIndex(@IntValueRange(min=0, max=2) int index, Object value)
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
	default Tup3objC setArray(@MinLength(3) Object... v)
	{
		return set(v[0], v[1], v[2]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup3objC copy();
}