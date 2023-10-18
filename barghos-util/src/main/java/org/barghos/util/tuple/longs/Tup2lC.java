package org.barghos.util.tuple.longs;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for long tuples with
 * two dimensions.
 */
public interface Tup2lC extends Tup2lR, TuplC
{
	/** {@inheritDoc}} */
	@Override
	Tup2lC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2lC createNew(TuplR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2lC createNew(Tup2lR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2lC createNew(@MinLength(2) long[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 2);
		
		return createNew(t[0], t[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2lC createNew(long value)
	{
		return createNew(value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2lC createNew(long v0, long v1);
	
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
	Tup2lC v0(long v0);
	
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
	Tup2lC v1(long v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2lR}.
	 * 
	 * @param t An existing implementation of {@link Tup2lR} to adopt the
	 * component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2lC set(Tup2lR t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC set(long value)
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
	default Tup2lC set(long v0, long v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC set(@MinLength(2) TuplR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC setByIndex(@IntValueRange(min=0, max=1) int index, long value)
	{
		Validation.validateInRange("index", index, 0, 1);

		switch(index)
		{
			case 0: return v0(value);
			case 1: return v1(value);
			
			default: throw new AssertionError(index);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC setArray(@MinLength(2) long... t)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("t", t);
			Validation.expectSize("t", t, 2);
		}
		
		return set(t[0], t[1]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup2lC copy();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2lC setResize(TuplR t)
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
	default Tup2lC setArrayResize(long... t)
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
	default Tup2lC resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2lC rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 2);
		
		long v0 = getByIndex(indices[0]);
		long v1 = getByIndex(indices[1]);
		
		return createNew(v0, v1);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2lC rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2lC swapV0AndV1N()
	{
		return createNew(v1(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2lC swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 1);
		Validation.validateInRange("indexB", indexB, 0, 1);
		
		long v0 = getByIndex(indexA);
		long v1 = getByIndex(indexB);
		
		return createNew(v1, v0);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2lC resize(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC rearrange(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 2);
		
		long v0 = getByIndex(indices[0]);
		long v1 = getByIndex(indices[1]);
		
		return set(v0, v1);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2lC rearrangeResize(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	default Tup2lC swapV0AndV1()
	{
		return set(v1(), v0());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2lC swapByIndex(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 1);
		Validation.validateInRange("indexB", indexB, 0, 1);
		
		long v0 = getByIndex(indexA);
		long v1 = getByIndex(indexB);
		
		return set(v0, v1);
	}
}