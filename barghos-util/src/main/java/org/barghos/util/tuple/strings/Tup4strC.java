package org.barghos.util.tuple.strings;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for string tuples
 * with three dimensions.
 */
public interface Tup4strC extends Tup4strR, TupstrC
{
	/** {@inheritDoc}} */
	@Override
	Tup4strC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC createNew(TupstrR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC createNew(Tup4strR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC createNew(@MinLength(4) String[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 3);
		
		return createNew(t[0], t[1], t[2], t[3]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC createNew(String value)
	{
		return createNew(value, value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup4strC createNew(String v0, String v1, String v2, String v3);
	
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
	Tup4strC v0(String v0);
	
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
	Tup4strC v1(String v1);
	
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
	Tup4strC v2(String v2);
	
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
	Tup4strC v3(String v3);
	
	/**
	 * Adopts the component values from an existing instance of
	 * {@link Tup4strR}.
	 * 
	 * @param t An existing implementation of {@link Tup4strR} to adopt the
	 * component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup4strC set(Tup4strR t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1(), t.v2(), t.v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC set(String value)
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
	default Tup4strC set(String v0, String v1, String v2, String v3)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		v3(v3);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC set(@MinLength(4) TupstrR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC setByIndex(@IntValueRange(min=0, max=3) int index, String value)
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
	default Tup4strC setArray(@MinLength(4) String... t)
	{
		if(Validation.argumentValidation())
		{
			Validation.notNull("t", t);
			Validation.expectSize("t", t, 3);
		}
		
		return set(t[0], t[1], t[2], t[3]);
	}
	
	/** {@inheritDoc} */
	@Override
	Tup4strC copy();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup4strC setResize(TupstrR t)
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
	default Tup4strC setArrayResize(String... t)
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
	default Tup4strC resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 4);
		
		String v0 = getByIndex(indices[0]);
		String v1 = getByIndex(indices[1]);
		String v2 = getByIndex(indices[2]);
		String v3 = getByIndex(indices[3]);
		
		return createNew(v0, v1, v2, v3);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup4strC rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC swapV0AndV1N()
	{
		return createNew(v1(), v0(), v2(), v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC swapV0AndV2N()
	{
		return createNew(v2(), v1(), v0(), v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC swapV0AndV3N()
	{
		return createNew(v3(), v1(), v2(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC swapV1AndV2N()
	{
		return createNew(v0(), v2(), v1(), v3());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC swapV1AndV3N()
	{
		return createNew(v0(), v3(), v2(), v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC swapV2AndV3N()
	{
		return createNew(v0(), v1(), v3(), v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 3);
		Validation.validateInRange("indexB", indexB, 0, 3);
		
		String[] values = toArray();
		String temp = values[indexA];
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
	default Tup4strC resize(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC rearrange(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 4);
		
		String v0 = getByIndex(indices[0]);
		String v1 = getByIndex(indices[1]);
		String v2 = getByIndex(indices[2]);
		String v3 = getByIndex(indices[3]);
		
		return set(v0, v1, v2, v3);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup4strC rearrangeResize(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	default Tup4strC swapV0AndV1()
	{
		return createNew(v1(), v0(), v2(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup4strC swapV0AndV2()
	{
		return createNew(v2(), v1(), v0(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	default Tup4strC swapV0AndV3()
	{
		return createNew(v3(), v1(), v2(), v0());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup4strC swapV1AndV2()
	{
		return createNew(v0(), v2(), v1(), v3());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	default Tup4strC swapV1AndV3()
	{
		return createNew(v0(), v3(), v2(), v1());
	}
	
	/**
	 * Swaps the values of the components {@code v2} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	default Tup4strC swapV2AndV3()
	{
		return createNew(v0(), v1(), v3(), v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup4strC swapByIndex(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 3);
		Validation.validateInRange("indexB", indexB, 0, 3);
		
		String temp = getByIndex(indexA);
		setByIndex(indexA, getByIndex(indexB));
		setByIndex(indexB, temp);
		
		return this;
	}
}