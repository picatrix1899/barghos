package org.barghos.util.tuple.longs;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for long tuples with
 * three dimensions.
 */
public interface Tup3lC extends Tup3lR, TuplC
{
	/** {@inheritDoc}} */
	@Override
	Tup3lC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC createNew(TuplR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC createNew(Tup3lR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC createNew(@MinLength(3) long[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 3);
		
		return createNew(t[0], t[1], t[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC createNew(long value)
	{
		return createNew(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3lC createNew(long v0, long v1, long v2);
	
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
	Tup3lC v0(long v0);
	
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
	Tup3lC v1(long v1);
	
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
	Tup3lC v2(long v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3lR}.
	 * 
	 * @param t An existing implementation of {@link Tup3lR} to adopt the
	 * component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3lC set(Tup3lR t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC set(long value)
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
	default Tup3lC set(long v0, long v1, long v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC set(@MinLength(3) TuplR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC setByIndex(@IntValueRange(min=0, max=2) int index, long value)
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
	default Tup3lC setArray(@MinLength(3) long... t)
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
	Tup3lC copy();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3lC setResize(TuplR t)
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
	default Tup3lC setArrayResize(long... t)
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
	default Tup3lC resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 3);
		
		long v0 = getByIndex(indices[0]);
		long v1 = getByIndex(indices[1]);
		long v2 = getByIndex(indices[2]);
		
		return createNew(v0, v1, v2);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3lC rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC swapV0AndV1N()
	{
		return createNew(v1(), v0(), v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC swapV0AndV2N()
	{
		return createNew(v2(), v1(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC swapV1AndV2N()
	{
		return createNew(v0(), v2(), v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 2);
		Validation.validateInRange("indexB", indexB, 0, 2);
		
		long[] values = toArray();
		long temp = values[indexA];
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
	default Tup3lC resize(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC rearrange(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 3);
		
		long v0 = getByIndex(indices[0]);
		long v1 = getByIndex(indices[1]);
		long v2 = getByIndex(indices[2]);
		
		return set(v0, v1, v2);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup3lC rearrangeResize(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	default Tup3lC swapV0AndV1()
	{
		return set(v1(), v0(), v2());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup3lC swapV0AndV2()
	{
		return set(v2(), v1(), v0());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup3lC swapV1AndV2()
	{
		return set(v0(), v2(), v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3lC swapByIndex(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 2);
		Validation.validateInRange("indexB", indexB, 0, 2);
		
		long temp = getByIndex(indexA);
		setByIndex(indexA, getByIndex(indexB));
		setByIndex(indexB, temp);
		
		return this;
	}
}