package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TupstrC;
import org.barghos.tuple.api.tn.TupstrR;

/**
 * This interface provides the common functions and methods for string tuples with three dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup3strC extends Tup3strR, TupstrC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3strC setX(String x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3strC setY(String y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup3strC setZ(String z);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3strR}.
	 * 
	 * @param t An existing implementation of {@link Tup3strR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3strC set(Tup3strR t)
	{
		return set(t.getX(), t.getY(), t.getZ());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3strC set(String value)
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
	default Tup3strC set(String x, String y, String z)
	{
		return setX(x).setY(y).setZ(z);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3strC set(@MinLength(3) TupstrR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3strC setByIndex(@IntValueRange(min=0, max=2) int index, String value)
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
	default Tup3strC setArray(@MinLength(3) String... v)
	{
		return set(v[0], v[1], v[2]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup3strC copy();
}