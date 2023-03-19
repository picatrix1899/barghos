package org.barghos.tuple.api.t4;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for float tuples with four dimensions.
 */
public interface Tup4fC extends Tup4fR, TupfC
{
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4fC setV0(float v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4fC setV1(float v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4fC setV2(float v2);
	
	/**
	 * Sets the value of the fourth component of the tuple.
	 * 
	 * @param v3 The new value.
	 * 
	 * @return The current tuple.
	 */
	Tup4fC setV3(float v3);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4fR}.
	 * 
	 * @param t An existing implementation of {@link Tup4fR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4fC set(Tup4fR t)
	{
		return set(t.getV0(), t.getV1(), t.getV2(), t.getV3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4fC set(float value)
	{
		return set(value, value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v3 The new value of the fourth component.
	 * 
	 * @return The current tuple.
	 */
	default Tup4fC set(float v0, float v1, float v2, float v3)
	{
		setV0(v0);
		setV1(v1);
		setV2(v2);
		setV3(v3);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4fC set(@MinLength(4) TupfR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4fC setByIndex(@IntValueRange(min=0, max=3) int index, float value)
	{
		Objects.checkIndex(index, 4);
		
		switch(index)
		{
			case 0: return setV0(value);
			case 1: return setV1(value);
			case 2: return setV2(value);
			case 3: return setV3(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4fC setArray(@MinLength(4) float... v)
	{
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4fC copy();
}