package org.barghos.tuple.api.t3;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.tuple.api.tn.TupfC;
import org.barghos.tuple.api.tn.TupfR;

/**
 * This interface provides the common functions and methods for float tuples with three dimensions.
 */
public interface Tup3fC extends Tup3fR, TupfC
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
	Tup3fC setV0(float v0);
	
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
	Tup3fC setV1(float v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarly vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3fC setV2(float v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3fR}.
	 * 
	 * @param t An existing implementation of {@link Tup3fR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3fC set(Tup3fR t)
	{
		return set(t.getV0(), t.getV1(), t.getV2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3fC set(float value)
	{
		return set(value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * 
	 * @return The current tuple.
	 */
	default Tup3fC set(float v0, float v1, float v2)
	{
		setV0(v0);
		setV1(v1);
		setV2(v2);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3fC set(@MinLength(3) TupfR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3fC setByIndex(@IntValueRange(min=0, max=2) int index, float value)
	{
		Objects.checkIndex(index, 3);
		
		switch(index)
		{
			case 0: return setV0(value);
			case 1: return setV1(value);
			case 2: return setV2(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3fC setArray(@MinLength(3) float... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3fC copy();
}