package org.barghos.util.tuple.objs;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for objects tuples with two dimensions.
 */
public interface Tup2objC extends Tup2objR, TupobjC
{
	/** {@inheritDoc}} */
	@Override
	Tup2objC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup2objC createNew(TupobjR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2objC createNew(Tup2objR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2objC createNew(@MinLength(2) Object[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 2);
		
		return createNew(t[0], t[1]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2objC createNew(Object value)
	{
		return createNew(value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup2objC createNew(Object v0, Object v1);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup2objC v0(Object v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup2objC v1(Object v1);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup2objR}.
	 * 
	 * @param t An existing implementation of {@link Tup2objR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup2objC set(Tup2objR t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2objC set(Object value)
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
	default Tup2objC set(Object v0, Object v1)
	{
		v0(v0);
		v1(v1);
		
		return this;
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2objC set(@MinLength(2) TupobjR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc} */
	@Override
	default Tup2objC setByIndex(@IntValueRange(min=0, max=1) int index, Object value)
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
	default Tup2objC setArray(@MinLength(2) Object... t)
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
	Tup2objC copy();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup2objC setResize(TupobjR t)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup2objC setArrayResize(short... t)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup2objC resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2objC rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 2);
		
		Object v0 = getByIndex(indices[0]);
		Object v1 = getByIndex(indices[1]);
		
		return createNew(v0, v1);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup2objC rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2objC swapV0AndV1N()
	{
		return createNew(v1(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup2objC swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 1);
		Validation.validateInRange("indexB", indexB, 0, 1);
		
		Object v0 = getByIndex(indexA);
		Object v1 = getByIndex(indexB);
		
		return createNew(v1, v0);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup2objC resize(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Rearranges the order of the component values by their indices.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new positions. If the value at
	 * the current index 7 in the tuple should be placed at the index 2, the index 7 would be passed
	 * at index 2 in the indices array.
	 * 
	 * @param indices The indices in the tuple in new order.
	 * 
	 * @return This tuple.
	 */
	default Tup2objC rearrange(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 2);
		
		Object v0 = getByIndex(indices[0]);
		Object v1 = getByIndex(indices[1]);
		
		return set(v0, v1);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup2objC rearrangeResize(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	default Tup2objC swapV0AndV1()
	{
		return set(v1(), v0());
	}
	
	/**
	 * Swaps two component values based on their indices.
	 * 
	 * @param indexA The index to the first value to be swapped.
	 * @param indexB The index to the second value to be swapped.
	 * 
	 * @return This tuple.
	 */
	default Tup2objC swapByIndex(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 1);
		Validation.validateInRange("indexB", indexB, 0, 1);
		
		Object v0 = getByIndex(indexA);
		Object v1 = getByIndex(indexB);
		
		return set(v0, v1);
	}
}