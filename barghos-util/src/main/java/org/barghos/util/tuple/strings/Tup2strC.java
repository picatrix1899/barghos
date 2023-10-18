package org.barghos.util.tuple.strings;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for string tuples
 * with two dimensions.
 */
public interface Tup2strC extends Tup2strR, TupstrC
{	
	/** {@inheritDoc}} */
	@Override
	Tup2strC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC createNew(TupstrR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC createNew(Tup2strR t)
	{
		Validation.validateNotNull("t", t);

		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC createNew(@MinLength(2) String[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 2);
		
		return createNew(t[0], t[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC createNew(String value)
	{
		return createNew(value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2strC createNew(String v0, String v1);
	
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
	Tup2strC v0(String v0);
	
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
	Tup2strC v1(String v1);
	
	/**
	 * Adopts the component values from an existing instance of
	 * {@link Tup2strR}.
	 * 
	 * @param t An existing implementation of {@link Tup2strR} to adopt the
	 * component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2strC set(Tup2strR t)
	{
		Validation.validateNotNull("t", t);

		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC set(String value)
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
	default Tup2strC set(String v0, String v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2strC set(@MinLength(2) TupstrR t)
	{
		Validation.validateNotNull("t", t);

		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2strC setByIndex(@IntValueRange(min=0, max=1) int index, String value)
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
	default Tup2strC setArray(String... t)
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
	Tup2strC copy();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2strC setResize(TupstrR t)
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
	default Tup2strC setArrayResize(String... t)
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
	default Tup2strC resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 2);
		
		String v0 = getByIndex(indices[0]);
		String v1 = getByIndex(indices[1]);
		
		return createNew(v0, v1);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2strC rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC swapV0AndV1N()
	{
		return createNew(v1(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 1);
		Validation.validateInRange("indexB", indexB, 0, 1);
		
		String v0 = getByIndex(indexA);
		String v1 = getByIndex(indexB);
		
		return createNew(v1, v0);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2strC resize(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC rearrange(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 2);
		
		String v0 = getByIndex(indices[0]);
		String v1 = getByIndex(indices[1]);
		
		return set(v0, v1);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	@Override
	default Tup2strC rearrangeResize(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	default Tup2strC swapV0AndV1()
	{
		return set(v1(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2strC swapByIndex(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 1);
		Validation.validateInRange("indexB", indexB, 0, 1);
		
		String v0 = getByIndex(indexA);
		String v1 = getByIndex(indexB);
		
		return set(v0, v1);
	}
}