package org.barghos.util.tuple.bigis;

import java.math.BigInteger;
import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.bigis.Tup2bigiC;

/**
 * This interface provides the common functions and methods for {@link BigInteger} tuples with two dimensions.
 */
public interface Tup2bigiC extends Tup2bigiR, TupbigiC
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
	Tup2bigiC v0(BigInteger v0);
	
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
	Tup2bigiC v1(BigInteger v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2bigiR}.
	 * 
	 * @param t An existing implementation of {@link Tup2bigiR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2bigiC set(Tup2bigiR t)
	{
		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigiC set(BigInteger value)
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
	default Tup2bigiC set(BigInteger v0, BigInteger v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigiC set(@MinLength(2) TupbigiR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigiC setByIndex(@IntValueRange(min=0, max=1) int index, BigInteger value)
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
	default Tup2bigiC setArray(@MinLength(2) BigInteger... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2bigiC copy();
}