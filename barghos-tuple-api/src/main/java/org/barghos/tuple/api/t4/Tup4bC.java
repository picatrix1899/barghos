package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TupbC;
import org.barghos.tuple.api.tn.TupbR;

/**
 * This interface provides the common functions and methods for byte tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4bC extends Tup4bR, TupbC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4bC setX(byte x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4bC setY(byte y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4bC setZ(byte z);
	
	/**
	 * Sets the value of the w component of the tuple.
	 * 
	 * @param w The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4bC setW(byte w);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4bR}.
	 * 
	 * @param t An existing implementation of {@link Tup4bR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4bC set(Tup4bR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bC set(byte value)
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
	default Tup4bC set(byte x, byte y, byte z, byte w)
	{
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bC set(@MinLength(4) TupbR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bC setByIndex(@IntValueRange(min=0, max=3) int index, byte value)
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
	default Tup4bC setArray(@MinLength(4) byte... v)
	{
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4bC copy();
}