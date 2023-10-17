package org.barghos.util.tuple.shorts;

import org.barghos.annotation.IntValueRange;
import org.barghos.annotation.MinLength;

import org.barghos.validation.Validation;

/**
 * This interface provides the common functions and methods for short tuples with three dimensions.
 */
public interface Tup3sC extends Tup3sR, TupsC
{
	/** {@inheritDoc}} */
	@Override
	Tup3sC createNew();
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC createNew(TupsR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC createNew(Tup3sR t)
	{
		Validation.validateNotNull("t", t);
		
		return createNew(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC createNew(@MinLength(3) short[] t)
	{
		Validation.validateNotNull("t", t);
		Validation.validateMinSize("t", t, 3);
		
		return createNew(t[0], t[1], t[2]);
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC createNew(short value)
	{
		return createNew(value, value, value);
	}
	
	/** {@inheritDoc}} */
	@Override
	Tup3sC createNew(short v0, short v1, short v2);
	
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
	Tup3sC v0(short v0);
	
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
	Tup3sC v1(short v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return The current tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn) was introduced, as the original
	 * concept was too close to the naming conventions of vectors. Because not all tuples are
	 * necessarily vectors, the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup3sC v2(short v2);
	
	/**
	 * Adopts the component values from an existing instance of {@link Tup3sR}.
	 * 
	 * @param t An existing implementation of {@link Tup3sR} to adopt the component values from.
	 * 
	 * @return The current tuple.
	 */
	default Tup3sC set(Tup3sR t)
	{
		Validation.validateNotNull("t", t);
		
		return set(t.v0(), t.v1(), t.v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC set(short value)
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
	default Tup3sC set(short v0, short v1, short v2)
	{
		v0(v0);
		v1(v1);
		v2(v2);
		
		return this;
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC set(@MinLength(3) TupsR t)
	{
		Validation.validateNotNull("t", t);
		
		return setArray(t.toArray());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC setByIndex(@IntValueRange(min=0, max=2) int index, short value)
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
	default Tup3sC setArray(@MinLength(3) short... t)
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
	Tup3sC copy();
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup3sC setResize(TupsR t)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup3sC setArrayResize(short... t)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup3sC resizeN(int size)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC rearrangeN(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 3);
		
		short v0 = getByIndex(indices[0]);
		short v1 = getByIndex(indices[1]);
		short v2 = getByIndex(indices[2]);
		
		return createNew(v0, v1, v2);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup3sC rearrangeResizeN(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC swapV0AndV1N()
	{
		return createNew(v1(), v0(), v2());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sR swapV0AndV2N()
	{
		return createNew(v2(), v1(), v0());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sR swapV1AndV2N()
	{
		return createNew(v0(), v2(), v1());
	}
	
	/** {@inheritDoc}} */
	@Override
	default Tup3sC swapByIndexN(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 2);
		Validation.validateInRange("indexB", indexB, 0, 2);
		
		short[] values = toArray();
		short temp = values[indexA];
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
	default Tup3sC resize(int size)
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
	default Tup3sC rearrange(int[] indices)
	{
		Validation.validateNotNull("indices", indices);
		Validation.validateExpectSize("indices", indices, 3);
		
		short v0 = getByIndex(indices[0]);
		short v1 = getByIndex(indices[1]);
		short v2 = getByIndex(indices[2]);
		
		return set(v0, v1, v2);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Unsupported by fixed sized tuples.
	 */
	@Deprecated
	default Tup3sC rearrangeResize(int[] indices)
	{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	default Tup3sC swapV0AndV1()
	{
		return set(v1(), v0(), v2());
	}
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup3sR swapV0AndV2()
	{
		return set(v2(), v1(), v0());
	}
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	default Tup3sR swapV1AndV2()
	{
		return set(v0(), v2(), v1());
	}
	
	/**
	 * Swaps two component values based on their indices.
	 * 
	 * @param indexA The index to the first value to be swapped.
	 * @param indexB The index to the second value to be swapped.
	 * 
	 * @return This tuple.
	 */
	default Tup3sC swapByIndex(int indexA, int indexB)
	{
		Validation.validateInRange("indexA", indexA, 0, 2);
		Validation.validateInRange("indexB", indexB, 0, 2);
		
		short temp = getByIndex(indexA);
		setByIndex(indexA, getByIndex(indexB));
		setByIndex(indexB, temp);
		
		return this;
	}
}