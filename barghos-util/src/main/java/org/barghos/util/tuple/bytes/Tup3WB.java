package org.barghos.util.tuple.bytes;

/**
 * This interface provides common operations for byte tuples with three
 * components.
 */
public interface Tup3WB extends Tup3RB, FixTupWB
{
	/** {@inheritDoc} */
	@Override
	Tup3WB createNew(Tup3RB t);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB createNew(TupRB t);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB createNew(byte... t);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB createNew(byte value);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB createNew(byte v0, byte v1, byte v2);
	
	/**
	 * Sets the value of the first component of the tuple.
	 * 
	 * @param v0 The new value.
	 * 
	 * @return This tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup3WB v0(byte v0);
	
	/**
	 * Sets the value of the second component of the tuple.
	 * 
	 * @param v1 The new value.
	 * 
	 * @return This tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup3WB v1(byte v1);
	
	/**
	 * Sets the value of the third component of the tuple.
	 * 
	 * @param v2 The new value.
	 * 
	 * @return This tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup3WB v2(byte v2);
	
	/**
	 * Sets the value of the component at the given index.
	 *
	 * <p>
	 * The valid index range is from 0 to 2.
	 *
	 * @param index
	 * The index of the component of which the value is to be set.
	 * @param value The new value for the component.
	 *
	 * @return This tuple.
	 */
	@Override
	Tup3WB setAt(int index, byte value);
	
	/**
	 * Adopts the component values from the given tuple {@code t}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return This tuple.
	 */
	Tup3WB set(Tup3RB t);
	
	/**
	 * Adopts the component values from the given tuple {@code (t)}. The given
	 * tuple has to have at least three components.
	 *
	 * @param t The tuple to adopt the component values from.
	 *
	 * @return This tuple.
	 */
	@Override
	Tup3WB set(TupRB t);
	
	/**
	 * Adopts the component values from the given tuple {@code (t)}. The given
	 * tuple has to have at least three components.
	 *
	 * @param t The tuple to adopt the component values from as an array.
	 *
	 * @return This tuple.
	 */
	@Override
	Tup3WB set(byte... t);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB set(byte value);
	
	/**
	 * Adopts the component values from the given tuple {@code (v0, v1, v2)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * 
	 * @return This tuple.
	 */
	Tup3WB set(byte v0, byte v1, byte v2);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB copy();
	
	/** {@inheritDoc} */
	@Override
	Tup3WB arrangeN(int... indices);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB arrangeN(int iV0, int iV1, int iV2);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB swizzleN(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	Tup3WB swizzleV0V1N();
	
	/** {@inheritDoc} */
	@Override
	Tup3WB swizzleV0V2N();
	
	/** {@inheritDoc} */
	@Override
	Tup3WB swizzleV1V2N();
	
	/**
	 * Arranges the order of the component values by their indices. This does
	 * not change the size of the tuple.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in this tuple should be
	 * placed at the new index 2, the value 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2. The given array has to have at
	 * least three entries. It is however not required to use all indices, neither
	 * is it required that each index is only used once.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return This tuple.
	 */
	@Override
	Tup3WB arrange(int... indices);
	
	/**
	 * Arranges the order of the component values by their indices. This does
	 * not change the size of the tuple.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in this tuple should be
	 * placed at the new index 2, the value 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2. It is however not required to use
	 * all indices, neither is it required that each index is only used once.
	 * 
	 * @param i0
	 * The index of the old component value which will be adopted to the
	 * first component.
	 * @param i1
	 * The index of the old component value which will be adopted to the
	 * second component.
	 * @param i2
	 * The index of the old component value which will be adopted to the
	 * third component.
	 * 
	 * @return This tuple.
	 */
	Tup3WB arrange(int iV0, int iV1, int iV2);
	
	/**
	 * Swaps two component values at the given indices, so that the value at the
	 * first given index becomes the value at the second given index and the
	 * value at the second given index becomes the value at the fist given
	 * index.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2. It is however not
	 * required to use different indices.
	 * 
	 * @param indexA The index to the first component value to be swapped.
	 * @param indexB The index to the second component value to be swapped.
	 * 
	 * @return This tuple.
	 */
	@Override
	Tup3WB swizzle(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	Tup3WB swizzleV0V1();
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	Tup3WB swizzleV0V2();
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	Tup3WB swizzleV1V2();
}