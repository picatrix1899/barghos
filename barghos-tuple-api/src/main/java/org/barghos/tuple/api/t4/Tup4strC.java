package org.barghos.tuple.api.t4;

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
public interface Tup4strC extends Tup4strR, TupstrC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4strC setX(String x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4strC setY(String y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4strC setZ(String z);
	
	/**
	 * Sets the value of the w component of the tuple.
	 * 
	 * @param w The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4strC setW(String w);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4strR}.
	 * 
	 * @param t An existing implementation of {@link Tup4strR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4strC set(Tup4strR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC set(String value)
	{
		return set(value, value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param x The new value of the x component.
	 * @param y The new value of the y component.
	 * @param z The new value of the z component.
	 * @param w The new value of the w component.
	 * 
	 * @return The current tuple.
	 */
	default Tup4strC set(String x, String y, String z, String w)
	{
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC set(@MinLength(4) TupstrR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC setByIndex(@IntValueRange(min=0, max=3) int index, String value)
	{
		Objects.checkIndex(index, 4);
		
		switch(index)
		{
			case 0: return setX(value);
			case 1: return setY(value);
			case 2: return setZ(value);
			case 3: return setW(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC setArray(@MinLength(4) String... v)
	{
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4strC copy();
}