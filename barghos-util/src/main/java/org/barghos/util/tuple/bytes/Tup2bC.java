package org.barghos.util.tuple.bytes;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

/**
 * This interface provides the common functions and methods for byte tuples with two dimensions.
 */
public interface Tup2bC extends Tup2bR, TupbC
{
	/** {@inheritDoc}} */
	@Override
	Tup2bC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2bC createNew(Tup2bR t)
	{
		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2bC createNew(@MinLength(2) byte[] t)
	{
		return createNew(t[0], t[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2bC createNew(byte value)
	{
		return createNew(value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2bC createNew(byte v0, byte v1);
	
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
	Tup2bC v0(byte v0);
	
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
	Tup2bC v1(byte v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2bR}.
	 * 
	 * @param t An existing implementation of {@link Tup2bR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2bC set(Tup2bR t)
	{
		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bC set(byte value)
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
	default Tup2bC set(byte v0, byte v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bC set(@MinLength(2) TupbR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bC setByIndex(@IntValueRange(min=0, max=1) int index, byte value)
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
	default Tup2bC setArray(@MinLength(2) byte... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2bC copy();
}