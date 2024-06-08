package org.barghos.util.tuple.bools;

/**
 * This interface provides common operations for boolean tuples with a
 * implicit fixed number of components. Therefore the operations of this
 * interface will not alter the size of this tuple and will not create new tuple
 * instances with different sizes than the size of this tuple.
 */
public interface FixTupWBo extends TupWBo, FixTupRBo
{
	/**
	 * Creates a new instance of the original type of this tuple with the
	 * same size as this tuple and leaves all component values at their default
	 * value.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the same size as
	 * this tuple.
	 */
	FixTupWBo createNew();
	
	/** {@inheritDoc} */
	@Override
	FixTupWBo createNew(TupRBo t);
	
	/** {@inheritDoc} */
	@Override
	FixTupWBo createNew(boolean... t);
	
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
	@Override
	FixTupWBo setAt(int index, boolean value);

	/**
	 * Adopts the component values from the given tuple {@code (t)}. The size of
	 * the given tuple {@code (t)} has to be equal to the size of this tuple
	 * ({@link #size()}).
	 *
	 * @param t The tuple to adopt the component values from.
	 *
	 * @return This tuple.
	 */
	@Override
	FixTupWBo set(TupRBo t);

	/**
	 * Adopts the component values from the given tuple {@code (t)}. The size of
	 * the given tuple {@code (t)} has to be equal to the size of this tuple
	 * ({@link #size()}).
	 *
	 * @param t The tuple to adopt the component values from as an array.
	 *
	 * @return This tuple.
	 */
	@Override
	FixTupWBo set(boolean... t);
	
	/**
	 * Sets all component values to a single value.
	 *
	 * @param value The value to which all components should be set.
	 *
	 * @return This tuple.
	 */
	@Override
	FixTupWBo set(boolean value);
	
	/** {@inheritDoc} */
	@Override
	FixTupWBo copy();
	
	/** {@inheritDoc} */
	@Override
	FixTupWBo arrangeN(int... indices);
	
	/** {@inheritDoc} */
	@Override
	FixTupWBo swizzleN(int indexA, int indexB);
	
	/**
	 * Arranges the order of the component values by their indices.
	 * This does not change the size of the tuple.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in this tuple should be
	 * placed at the new index 2, the value 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1. The given array
	 * of indices has to be of the same size as this tuple ({@link #size()}).
	 * It is however not required to use all indices, neither is it required
	 * that each index is only used once.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return This tuple.
	 */
	FixTupWBo arrange(int... indices);
	
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
	@Override
	FixTupWBo swizzle(int indexA, int indexB);
}
