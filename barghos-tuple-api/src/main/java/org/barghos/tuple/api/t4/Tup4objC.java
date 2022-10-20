package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.documentation.IntValueRange;
import org.barghos.documentation.MinLength;

import org.barghos.tuple.api.tn.TupobjC;
import org.barghos.tuple.api.tn.TupobjR;

/**
 * This interface provides the common functions and methods for objects tuples with four dimensions.
 * 
 * @author picatrix1899
 */
public interface Tup4objC extends Tup4objR, TupobjC
{
	/**
	 * Sets the value of the x component of the tuple.
	 * 
	 * @param x The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4objC setX(Object x);
	
	/**
	 * Sets the value of the y component of the tuple.
	 * 
	 * @param y The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4objC setY(Object y);
	
	/**
	 * Sets the value of the z component of the tuple.
	 * 
	 * @param z The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4objC setZ(Object z);
	
	/**
	 * Sets the value of the w component of the tuple.
	 * 
	 * @param w The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4objC setW(Object w);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4objR}.
	 * 
	 * @param t An existing implementation of {@link Tup4objR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4objC set(Tup4objR t)
	{
		return set(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4objC set(Object value)
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
	default Tup4objC set(Object x, Object y, Object z, Object w)
	{
		setX(x);
		setY(y);
		setZ(z);
		setW(w);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4objC set(@MinLength(4) TupobjR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4objC setByIndex(@IntValueRange(min=0, max=3) int index, Object value)
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
	default Tup4objC setArray(@MinLength(4) Object... v)
	{
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4objC copy();
}