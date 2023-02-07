package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupboC;
import org.barghos.tuple.api.tn.TupboR;

/**
 * This interface provides the common functions and methods for boolean tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4boC extends Tup4boR, TupboC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4boC setX(boolean x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4boC setY(boolean y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4boC setZ(boolean z);
	
	/**
	 * Sets the value of the w component of the tuple.
	 * 
	 * @param w The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4boC setW(boolean w);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4boR}.
	 * 
	 * @param t An existing implementation of {@link Tup4boR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4boC set(Tup4boR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4boC set(boolean value)
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
	default Tup4boC set(boolean x, boolean y, boolean z, boolean w)
	{
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	default Tup4boC set(@MinLength(4) TupboR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4boC setByIndex(@IntValueRange(min=0, max=3) int index, boolean value)
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
	default Tup4boC setArray(@MinLength(4) boolean... v)
	{
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4boC copy();
}