package org.barghos.impl.core.tuple.chars;

/**
 * This interface provides non-modifying operations for char tuples with a
 * varying number of components. Therefore the operations of this interface will
 * not alter the component values of this tuple, not the size of this tuple but
 * may create new tuple instances with different sizes than the size of this
 * tuple.
 */
public interface VarTupRC extends TupRC
{
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	VarTupRC createNew(TupRC t);
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}.
	 * 
	 * @param t The tuple to adopt the component values from as an array.
	 * 
	 * @return
	 * A new instance of the type of this tuple with the respective component
	 * values.
	 */
	VarTupRC createNew(char... t);

	/** {@inheritDoc} */
	@Override
	VarTupRC copy();
	
	/**
	 * Resizes the tuple to the given size and either trims of any excess
	 * components or adds new components with their value set to the default
	 * value. The result is returned as a new instance of the original type of
	 * this tuple.
	 * 
	 * @param size The new size.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the result.
	 */
	VarTupRC resizeN(int size);
	
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
	VarTupRC arrangeN(int... indices);
	
	/** {@inheritDoc} */
	@Override
	VarTupRC swizzleN(int indexA, int indexB);
}
