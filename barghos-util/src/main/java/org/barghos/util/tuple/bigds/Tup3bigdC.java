package org.barghos.util.tuple.bigds;

import java.math.BigDecimal;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for
 * {@link BigDecimal} tuples with three dimensions.
 */
public interface Tup3bigdC extends Tup3bigdR, TupbigdC
{
	/** {@inheritDoc}} */
	@Override
	Tup3bigdC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC createNew(TupbigdR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC createNew(Tup3bigdR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC createNew(@MinLength(3) BigDecimal[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 3);
		
		return createNew(t[0], t[1], t[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC createNew(BigDecimal value)
	{
		return createNew(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3bigdC createNew(BigDecimal v0, BigDecimal v1, BigDecimal v2);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	Tup3bigdC v0(BigDecimal v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	Tup3bigdC v1(BigDecimal v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	Tup3bigdC v2(BigDecimal v2);
	
	/**
	 * Adopts the component values from an existing instance of
	 * {@link Tup3bigdR}.
	 * 
	 * @param t An existing implementation of {@link Tup3bigdR} to adopt the
	 * component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3bigdC set(Tup3bigdR t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC set(BigDecimal value)
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
	default Tup3bigdC set(BigDecimal v0, BigDecimal v1, BigDecimal v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC set(@MinLength(3) TupbigdR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC setByIndex(@IntValueRange(min=0, max=2) int index, BigDecimal value)
	{
		Validation.validateInRange("index", index, 0, 2);
		
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
	default Tup3bigdC setArray(@MinLength(3) BigDecimal... t)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("t", t);
			Validation.expectSize("t", t, 3);
		}
		
		return set(t[0], t[1], t[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3bigdC copy();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3bigdC setResize(TupbigdR t)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3bigdC setArrayResize(BigDecimal... t)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3bigdC resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 3);
		
		BigDecimal v0 = getByIndex(indices[0]);
		BigDecimal v1 = getByIndex(indices[1]);
		BigDecimal v2 = getByIndex(indices[2]);
		
		return createNew(v0, v1, v2);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3bigdC rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC swapV0AndV1N()
	{
		return createNew(v1(), v0(), v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC swapV0AndV2N()
	{
		return createNew(v2(), v1(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC swapV1AndV2N()
	{
		return createNew(v0(), v2(), v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 2);
		Validation.validateInRange("indexB", indexB, 0, 2);
		
		BigDecimal[] values = toArray();
		BigDecimal temp = values[indexA];
		values[indexA] = values[indexB];
		values[indexB] = temp;
		
		return createNew(values);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3bigdC resize(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC rearrange(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 3);
		
		BigDecimal v0 = getByIndex(indices[0]);
		BigDecimal v1 = getByIndex(indices[1]);
		BigDecimal v2 = getByIndex(indices[2]);
		
		return set(v0, v1, v2);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3bigdC rearrangeResize(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	default Tup3bigdC swapV0AndV1()
	{
		return set(v1(), v0(), v2());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup3bigdC swapV0AndV2()
	{
		return set(v2(), v1(), v0());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup3bigdC swapV1AndV2()
	{
		return set(v0(), v2(), v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3bigdC swapByIndex(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 2);
		Validation.validateInRange("indexB", indexB, 0, 2);
		
		BigDecimal temp = getByIndex(indexA);
		setByIndex(indexA, getByIndex(indexB));
		setByIndex(indexB, temp);
		
		return this;
	}
}