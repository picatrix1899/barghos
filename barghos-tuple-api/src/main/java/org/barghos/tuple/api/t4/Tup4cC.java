package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupcC;
import org.barghos.tuple.api.tn.TupcR;

/**
 * This interface provides the common functions and methods for char tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4cC extends Tup4cR, TupcC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4cC setX(char x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4cC setY(char y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4cC setZ(char z);
	
	/**
	 * Sets the value of the w component of the tuple.
	 * 
	 * @param w The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4cC setW(char w);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4cR}.
	 * 
	 * @param t An existing implementation of {@link Tup4cR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4cC set(Tup4cR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4cC set(char value)
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
	default Tup4cC set(char x, char y, char z, char w)
	{
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		
		return this;
	}

	/** {@inheritDoc}} */
	@Override
	default Tup4cC set(@MinLength(4) TupcR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4cC setByIndex(@IntValueRange(min=0, max=3) int index, char value)
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
	default Tup4cC setArray(@MinLength(4) char... v)
	{
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4cC copy();
}