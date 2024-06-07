package org.barghos.util.tuple.bigis;

import java.math.BigInteger;

/**
 * This interface provides common operations for {@link BigInteger} tuples with
 * three components.
 */
public interface Tup4WBigi extends Tup4RBigi, FixTupWBigi
{
	/** {@inheritDoc} */
	@Override
	Tup4WBigi createNew(Tup4RBigi t);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi createNew(TupRBigi t);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi createNew(BigInteger... t);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi createNew(BigInteger value);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi createNew(BigInteger v0, BigInteger v1, BigInteger v2, BigInteger v3);
	
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
	Tup4WBigi v0(BigInteger v0);
	
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
	Tup4WBigi v1(BigInteger v1);
	
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
	Tup4WBigi v2(BigInteger v2);
	
	/**
	 * Sets the value of the fourth component of the tuple.
	 * 
	 * @param v3 The new value.
	 * 
	 * @return This tuple.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Tup4WBigi v3(BigInteger v3);
	
	/**
	 * Sets the value of the component at the given index.
	 *
	 * <p>
	 * The valid index range is from 0 to 3.
	 *
	 * @param index
	 * The index of the component of which the value is to be set.
	 * @param value The new value for the component.
	 *
	 * @return This tuple.
	 */
	@Override
	Tup4WBigi setAt(int index, BigInteger value);
	
	/**
	 * Adopts the component values from the given tuple {@code t}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi set(Tup4RBigi t);
	
	/**
	 * Adopts the component values from the given tuple {@code (t)}. The given
	 * tuple has to have at least four components.
	 *
	 * @param t The tuple to adopt the component values from.
	 *
	 * @return This tuple.
	 */
	@Override
	Tup4WBigi set(TupRBigi t);
	
	/**
	 * Adopts the component values from the given tuple {@code (t)}. The given
	 * tuple has to have at least four components.
	 *
	 * @param t The tuple to adopt the component values from as an array.
	 *
	 * @return This tuple.
	 */
	@Override
	Tup4WBigi set(BigInteger... t);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi set(BigInteger value);
	
	/**
	 * Adopts the component values from the given tuple {@code (v0, v1, v2, v3)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v3 The new value of the fourth component.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi set(BigInteger v0, BigInteger v1, BigInteger v2, BigInteger v3);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi copy();
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi arrangeN(int... indices);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi arrangeN(int iV0, int iV1, int iV2, int iV3);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi swizzleN(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi swizzleV0V1N();
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi swizzleV0V2N();
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi swizzleV0V3N();
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi swizzleV1V2N();
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi swizzleV1V3N();
	
	/** {@inheritDoc} */
	@Override
	Tup4WBigi swizzleV2V3N();
	
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
	 * The valid index range is from 0 to 3. The given array has to have at
	 * least four entries. It is however not required to use all indices, neither
	 * is it required that each index is only used once.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return This tuple.
	 */
	@Override
	Tup4WBigi arrange(int... indices);
	
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
	 * The valid index range is from 0 to 3. It is however not required to use
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
	 * @param i3
	 * The index of the old component value which will be adopted to the
	 * fourth component.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi arrange(int iV0, int iV1, int iV2, int iV3);
	
	/**
	 * Swaps two component values at the given indices, so that the value at the
	 * first given index becomes the value at the second given index and the
	 * value at the second given index becomes the value at the fist given
	 * index.
	 * 
	 * <p>
	 * The valid index range is from 0 to 3. It is however not
	 * required to use different indices.
	 * 
	 * @param indexA The index to the first component value to be swapped.
	 * @param indexB The index to the second component value to be swapped.
	 * 
	 * @return This tuple.
	 */
	@Override
	Tup4WBigi swizzle(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi swizzleV0V1();
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi swizzleV0V2();
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi swizzleV0V3();
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2}.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi swizzleV1V2();
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi swizzleV1V3();
	
	/**
	 * Swaps the values of the components {@code v2} and {@code v3}.
	 * 
	 * @return This tuple.
	 */
	Tup4WBigi swizzleV2V3();
}