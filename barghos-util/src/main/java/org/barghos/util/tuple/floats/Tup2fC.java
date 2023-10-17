package org.barghos.util.tuple.floats;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.floats.Tup2fC;

/**
 * This interface provides the common functions and methods for float tuples with two dimensions.
 */
public interface Tup2fC extends Tup2fR, TupfC
{
	/** {@inheritDoc}} */
	@Override
	Tup2fC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2fC createNew(Tup2fR t)
	{
		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2fC createNew(@MinLength(2) float[] t)
	{
		return createNew(t[0], t[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2fC createNew(float value)
	{
		return createNew(value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2fC createNew(float v0, float v1);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup2fC v0(float v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup2fC v1(float v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2fR}.
	 * 
	 * @param t An existing implementation of {@link Tup2fR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2fC set(Tup2fR t)
	{
		return set(t.v0(), t.v1());
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
		v0(v0);
		v1(v1);
		
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
			case 0: return v0(value);
			case 1: return v1(value);
			
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