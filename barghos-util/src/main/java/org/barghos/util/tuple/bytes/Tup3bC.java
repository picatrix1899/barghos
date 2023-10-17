package org.barghos.util.tuple.bytes;

import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.bytes.Tup3bC;

/**
 * This interface provides the common functions and methods for byte tuples with three dimensions.
 */
public interface Tup3bC extends Tup3bR, TupbC
{
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
	Tup3bC v0(byte v0);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3bC v1(byte v1);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup3bC v2(byte v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3bR}.
	 * 
	 * @param t An existing implementation of {@link Tup3bR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bC set(Tup3bR t)
	{
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bC set(byte value)
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
	default Tup3bC set(byte v0, byte v1, byte v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bC set(@MinLength(3) TupbR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bC setByIndex(@IntValueRange(min=0, max=2) int index, byte value)
	{
		Objects.checkIndex(index, 3);
		
		switch(index)
		{
			case 0: return v0(value);
			case 1: return v1(value);
			case 2: return v2(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bC setArray(@MinLength(3) byte... values)
	{
		return set(values[0], values[1], values[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3bC copy();
}