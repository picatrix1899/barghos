package org.barghos.tuple.api.t2;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for float tuples with two dimensions.
 */
public interface Tup2fC extends Tup2fR, TupfC
{
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarly vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup2fC setV0(float v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarly vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup2fC setV1(float v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2fR}.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2fC set(Tup2fR t)
	{
		return set(t.getV0(), t.getV1());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2fC set(float value)
	{
		return set(value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return The current tuple.
	 */
	default Tup2fC set(float v0, float v1)
	{
		setV0(v0);
		setV1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2fC set(@MinLength(2) TupfR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2fC setByIndex(@IntValueRange(min=0, max=1) int index, float value)
	{
		Objects.checkIndex(index, 2);

		switch(index)
		{
			case 0: return setV0(value);
			case 1: return setV1(value);
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2fC setArray(@MinLength(2) float... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2fC copy();
}