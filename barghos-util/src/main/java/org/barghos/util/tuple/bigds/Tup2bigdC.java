package org.barghos.util.tuple.bigds;

import java.math.BigDecimal;
import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;
import org.barghos.util.tuple.bigds.Tup2bigdC;

/**
 * This interface provides the common functions and methods for {@link BigDecimal} tuples with two dimensions.
 */
public interface Tup2bigdC extends Tup2bigdR, TupbigdC
{
	/** {@inheritDoc}} */
	@Override
	Tup2bigdC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2bigdC createNew(Tup2bigdR t)
	{
		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2bigdC createNew(@MinLength(2) BigDecimal[] t)
	{
		return createNew(t[0], t[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2bigdC createNew(BigDecimal value)
	{
		return createNew(value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2bigdC createNew(BigDecimal v0, BigDecimal v1);
	
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
	Tup2bigdC v0(BigDecimal v0);
	
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
	Tup2bigdC v1(BigDecimal v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2bigdR}.
	 * 
	 * @param t An existing implementation of {@link Tup2bigdR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2bigdC set(Tup2bigdR t)
	{
		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigdC set(BigDecimal value)
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
	default Tup2bigdC set(BigDecimal v0, BigDecimal v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigdC set(@MinLength(2) TupbigdR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2bigdC setByIndex(@IntValueRange(min=0, max=1) int index, BigDecimal value)
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
	default Tup2bigdC setArray(@MinLength(2) BigDecimal... values)
	{
		return set(values[0], values[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2bigdC copy();
}