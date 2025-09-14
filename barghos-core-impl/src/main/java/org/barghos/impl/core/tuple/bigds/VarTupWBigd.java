package org.barghos.impl.core.tuple.bigds;

import java.math.BigDecimal;

/**
 * This interface provides common operations for {@link BigDecimal} tuples with
 * a varying number of components.
 */
public interface VarTupWBigd extends TupWBigd, VarTupRBigd
{
	/**
	 * Creates a new instance of the original type of this tuple with no
	 * components.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with no components.
	 */
	VarTupWBigd createNew();
	
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (t)}.
	 * 
	 * <p>
	 * The given tuple {@code (t)} may be of different size than this tuple.
	 * In that case the new tuple has a size equal to the given tuple.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	@Override
	VarTupWBigd createNew(TupRBigd t);
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}.
	 * 
	 * <p>
	 * The given tuple {@code (t)} may be of different size than this tuple.
	 * In that case the new tuple has a size equal to the given tuple.
	 * 
	 * @param t The tuple to adopt the component values from as an array.
	 * 
	 * @return
	 * A new instance of the type of this tuple with the respective component
	 * values.
	 */
	@Override
	VarTupWBigd createNew(BigDecimal... t);
	
	/** {@inheritDoc} */
	@Override
	VarTupWBigd setAt(int index, BigDecimal value);

	/**
	 * Adopts the component values from the given tuple {@code (t)}.
	 *
	 * <p>
	 * The given tuple {@code (t)} may be of different size than this tuple.
	 * In that case the this tuple gets resized accordingly.
	 *
	 * @param t The tuple to adopt the component values from.
	 *
	 * @return This tuple.
	 */
	@Override
	VarTupWBigd set(TupRBigd t);

	/**
	 * Adopts the component values from the given tuple {@code (t)}.
	 * 
	 * <p>
	 * The given tuple {@code (t)} may be of different size than this tuple.
	 * In that case the this tuple gets resized accordingly.
	 *
	 * @param t The tuple to adopt the component values from as an array.
	 *
	 * @return This tuple.
	 */
	@Override
	VarTupWBigd set(BigDecimal... t);
	
	/** {@inheritDoc} */
	@Override
	VarTupWBigd copy();
	
	/** {@inheritDoc} */
	@Override
	VarTupWBigd resizeN(int size);
	
	/**
	 * Arranges the order of the component values by their indices and returns
	 * the result as a new instance of the original type of this tuple.
	 * 
	 * <p>
	 * The passed indices array contains the current indices at the new
	 * positions. If the value at the current index 7 in this tuple should be
	 * placed at the new index 2, the value 7 would be passed at index 2 in the
	 * indices array.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1. It is however not
	 * required to use all indices, neither is it required that each index is
	 * only used once. The given array of indices may be of different size than
	 * this tuple. In that case the resulting tuple has as many components as
	 * specified indices in the array.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	@Override
	VarTupWBigd arrangeN(int... indices);
	
	/** {@inheritDoc} */
	@Override
	VarTupWBigd swizzleN(int indexA, int indexB);
	
	/**
	 * Resizes the tuple to the passed size and either trims of any excess
	 * components or adds new empty components.
	 * 
	 * @param size The new size.
	 * 
	 * @return This tuple.
	 */
	VarTupWBigd resize(int size);
	
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
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * It is however not required to use all indices, neither is it required
	 * that each index is only used once. The given array of indices may be of
	 * different size than this tuple. In that case the resulting tuple has as
	 * many components as specified indices in the array.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return This tuple.
	 */
	VarTupWBigd arrange(int... indices);
	
	/** {@inheritDoc} */
	@Override
	VarTupWBigd swizzle(int indexA, int indexB);
}
