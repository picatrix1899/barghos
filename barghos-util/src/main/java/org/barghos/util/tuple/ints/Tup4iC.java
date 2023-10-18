package org.barghos.util.tuple.ints;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for int tuples with
 * four dimensions.
 */
public interface Tup4iC extends Tup4iR, TupiC
{
	/** {@inheritDoc}} */
	@Override
	Tup4iC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC createNew(TupiR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC createNew(Tup4iR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC createNew(@MinLength(4) int[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 3);
		
		return createNew(t[0], t[1], t[2], t[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC createNew(int value)
	{
		return createNew(value, value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4iC createNew(int v0, int v1, int v2, int v3);
	
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
	Tup4iC v0(int v0);
	
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
	Tup4iC v1(int v1);
	
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
	Tup4iC v2(int v2);
	
	/**
	 * Sets the value of the fourth component of the tuple.
	 * 
	 * @param v3 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced,
	 * as the original concept was too close to the naming conventions of
	 * vectors. Because not all tuples are necessarily vectors, the vector
	 * naming convention might be confusing to understand or could even create
	 * conflicts hence it was changed.
	 */
	Tup4iC v3(int v3);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup4iR}.
	 * 
	 * @param t An existing implementation of {@link Tup4iR} to adopt the
	 * component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4iC set(Tup4iR t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC set(int value)
	{
		return set(value, value, value, value);
	}
	
	/**
	 * Sets the values of all components to the corresponding parameters.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v3 The new value of the fourth component.
	 * 
	 * @return The current tuple.
	 */
	default Tup4iC set(int v0, int v1, int v2, int v3)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		v3(v3);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC set(@MinLength(4) TupiR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC setByIndex(@IntValueRange(min=0, max=3) int index, int value)
	{
		Validation.validateInRange("index", index, 0, 3);
		
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
	default Tup4iC setArray(@MinLength(4) int... t)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("t", t);
			Validation.expectSize("t", t, 3);
		}
		
		return set(t[0], t[1], t[2], t[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4iC copy();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup4iC setResize(TupiR t)
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
	default Tup4iC setArrayResize(int... t)
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
	default Tup4iC resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 4);
		
		int v0 = getByIndex(indices[0]);
		int v1 = getByIndex(indices[1]);
		int v2 = getByIndex(indices[2]);
		int v3 = getByIndex(indices[3]);
		
		return createNew(v0, v1, v2, v3);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup4iC rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC swapV0AndV1N()
	{
		return createNew(v1(), v0(), v2(), v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC swapV0AndV2N()
	{
		return createNew(v2(), v1(), v0(), v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC swapV0AndV3N()
	{
		return createNew(v3(), v1(), v2(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC swapV1AndV2N()
	{
		return createNew(v0(), v2(), v1(), v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC swapV1AndV3N()
	{
		return createNew(v0(), v3(), v2(), v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC swapV2AndV3N()
	{
		return createNew(v0(), v1(), v3(), v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 3);
		Validation.validateInRange("indexB", indexB, 0, 3);
		
		int[] values = toArray();
		int temp = values[indexA];
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
	default Tup4iC resize(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC rearrange(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 4);
		
		int v0 = getByIndex(indices[0]);
		int v1 = getByIndex(indices[1]);
		int v2 = getByIndex(indices[2]);
		int v3 = getByIndex(indices[3]);
		
		return set(v0, v1, v2, v3);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup4iC rearrangeResize(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	default Tup4iC swapV0AndV1()
	{
		return createNew(v1(), v0(), v2(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup4iC swapV0AndV2()
	{
		return createNew(v2(), v1(), v0(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	default Tup4iC swapV0AndV3()
	{
		return createNew(v3(), v1(), v2(), v0());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup4iC swapV1AndV2()
	{
		return createNew(v0(), v2(), v1(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	default Tup4iC swapV1AndV3()
	{
		return createNew(v0(), v3(), v2(), v1());
	}
	
	/**
	 * Swaps the values of the components {@code v2} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	default Tup4iC swapV2AndV3()
	{
		return createNew(v0(), v1(), v3(), v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4iC swapByIndex(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 3);
		Validation.validateInRange("indexB", indexB, 0, 3);
		
		int temp = getByIndex(indexA);
		setByIndex(indexA, getByIndex(indexB));
		setByIndex(indexB, temp);
		
		return this;
	}
}