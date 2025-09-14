package org.barghos.impl.core.tuple.bigis;

import java.math.BigInteger;

/**
 * This interface provides common operations for {@link BigInteger} tuples.
 * 
 * <p>
 * Whether the tuple allows to alter the size of this tuple or create new tuple
 * instances with different sizes than the size of this tuple is left to the
 * implementation. However every implementation guarantees to support the
 * creation of tuples of the same size.
 */
public interface TupWBigi extends TupRBigi
{
	/**
	 * Sets the value of the component at the given index.
	 *
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 *
	 * @param index
	 * The index of the component of which the value is to be set.
	 * @param value The new value for the component.
	 *
	 * @return This tuple.
	 */
	TupWBigi setAt(int index, BigInteger value);

	/**
	 * Adopts the component values from the given tuple {@code (t)}.
	 *
	 * <p>
	 * Whether the size of the given tuple {@code (t)} has to be equal to the
	 * size of this tuple ({@link #size()}) or not is left to the
	 * implementation. However every implementation guarantees to support
	 * tuples of the same size.
	 *
	 * @param t The tuple to adopt the component values from.
	 *
	 * @return This tuple.
	 */
	TupWBigi set(TupRBigi t);

	/**
	 * Adopts the component values from the given tuple {@code (t)}.
	 *
	 * <p>
	 * Whether the size of the given tuple {@code (t)} has to be equal to the
	 * size of this tuple ({@link #size()}) or not is left to the
	 * implementation. However every implementation guarantees to support
	 * tuples of the same size.
	 *
	 * @param t The tuple to adopt the component values from as an array.
	 *
	 * @return This tuple.
	 */
	TupWBigi set(BigInteger... t);
	
	/**
	 * Sets all component values to a single value.
	 *
	 * @param value The value to which all components should be set.
	 *
	 * @return This tuple.
	 */
	TupWBigi set(BigInteger value);
	
	/** {@inheritDoc} */
	@Override
	TupWBigi copy();
	
	/** {@inheritDoc} */
	@Override
	TupWBigi swizzleN(int indexA, int indexB);
	
	/**
	 * Swaps two component values at the given indices, so that the value
	 * at the first given index becomes the value at the second given index and
	 * the value at the second given index becomes the value at the fist given
	 * index.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1. It is however not
	 * required to use different indices.
	 * 
	 * @param indexA The index to the first component value to be swapped.
	 * @param indexB The index to the second component value to be swapped.
	 * 
	 * @return This tuple.
	 */
	TupWBigi swizzle(int indexA, int indexB);
}
