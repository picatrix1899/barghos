package org.barghos.util.tuple.floats;

/**
 * This interface provides common operations for float tuples with a
 * varying number of components.
 */
public interface VarTupWF extends TupWF, VarTupRF
{
	/**
	 * Creates a new instance of the original type of this tuple with no
	 * components.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with no components.
	 */
	VarTupWF createNew();
	
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
	VarTupWF createNew(TupRF t);
	
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
	VarTupWF createNew(float... t);
	
	/** {@inheritDoc} */
	@Override
	VarTupWF setAt(int index, float value);

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
	VarTupWF set(TupRF t);

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
	VarTupWF set(float... t);
	
	/** {@inheritDoc} */
	@Override
	VarTupWF copy();
	
	/** {@inheritDoc} */
	@Override
	VarTupWF resizeN(int size);
	
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
	VarTupWF arrangeN(int... indices);
	
	/** {@inheritDoc} */
	@Override
	VarTupWF swizzleN(int indexA, int indexB);
	
	/**
	 * Resizes the tuple to the passed size and either trims of any excess
	 * components or adds new empty components.
	 * 
	 * @param size The new size.
	 * 
	 * @return This tuple.
	 */
	VarTupWF resize(int size);
	
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
	VarTupWF arrange(int... indices);
	
	/** {@inheritDoc} */
	@Override
	VarTupWF swizzle(int indexA, int indexB);
}
