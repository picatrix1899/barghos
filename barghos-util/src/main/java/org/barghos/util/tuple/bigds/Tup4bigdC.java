package org.barghos.util.tuple.bigds;

import java.math.BigDecimal;
import java.util.Objects;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

/**
 * This interface provides the common functions and methods for {@link BigDecimal} tuples with four dimensions.
 */
public interface Tup4bigdC extends Tup4bigdR, TupbigdC
{
	/** {@inheritDoc}} */
	@Override
	Tup4bigdC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bigdC createNew(Tup4bigdR t)
	{
		return createNew(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bigdC createNew(@MinLength(4) BigDecimal[] t)
	{
		return createNew(t[0], t[1], t[2], t[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bigdC createNew(BigDecimal value)
	{
		return createNew(value, value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4bigdC createNew(BigDecimal v0, BigDecimal v1, BigDecimal v2, BigDecimal v3);
	
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
	Tup4bigdC v0(BigDecimal v0);
	
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
	Tup4bigdC v1(BigDecimal v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup4bigdC v2(BigDecimal v2);
	
	/**
	 * Sets the value of the fourth component of the tuple.
	 * 
	 * @param v3 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original concept was too close to the naming conventions
	 * of vectors. Because not all tuples are necessarily vectors, the vector naming convention might be confusing to understand or could even
	 * create conflicts hence it was changed.
	 */
	Tup4bigdC v3(BigDecimal v3);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4bigdR}.
	 * 
	 * @param t An existing implementation of {@link Tup4bigdR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4bigdC set(Tup4bigdR t)
	{
		return set(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bigdC set(BigDecimal value)
	{
		return set(value, value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v2 The new value of the fourth component.
	 * 
	 * @return The current tuple.
	 */
	default Tup4bigdC set(BigDecimal v0, BigDecimal v1, BigDecimal v2, BigDecimal v3)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		v3(v3);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bigdC set(@MinLength(4) TupbigdR t)
	{
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bigdC setByIndex(@IntValueRange(min=0, max=3) int index, BigDecimal value)
	{
		Objects.checkIndex(index, 4);
		
		switch(index)
		{
			case 0: return v0(value);
			case 1: return v1(value);
			case 2: return v2(value);
			case 3: return v3(value);
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4bigdC setArray(@MinLength(4) BigDecimal... v)
	{
		return set(v[0], v[1], v[2], v[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4bigdC copy();
}