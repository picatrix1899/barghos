package org.barghos.util.tuple.floats;

/**
 * This interface provides common operations for float tuples with two
 * components.
 */
public interface ITup2WF extends ITup2RF, ITupWF
{
	/** {@inheritDoc} */
	@Override
	ITup2WF createNew(ITup2RF t);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF createNew(ITupRF t);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF createNew(float[] t);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF createNew(float value);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF createNew(float v0, float v1);
	
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
	ITup2WF v0(float v0);
	
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
	ITup2WF v1(float v1);
	
	/**
	 * Sets the value of the component at the given index.
	 *
	 * <p>
	 * The valid index range is from 0 to 1.
	 *
	 * @param index
	 * The index of the component of which the value is to be set.
	 * @param value The new value for the component.
	 *
	 * @return This tuple.
	 */
	@Override
	ITup2WF setAt(int index, float value);
	
	/**
	 * Adopts the component values from the given tuple {@code t}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return This tuple.
	 */
	ITup2WF set(ITup2RF t);
	
	/**
	 * Adopts the component values from the given tuple {@code (t)}. The given
	 * tuple has to have at least two components.
	 *
	 * @param t The tuple to adopt the component values from.
	 *
	 * @return This tuple.
	 */
	@Override
	ITup2WF set(ITupRF t);
	
	/**
	 * Adopts the component values from the given tuple {@code (t)}. The given
	 * tuple has to have at least two components.
	 *
	 * @param t The tuple to adopt the component values from as an array.
	 *
	 * @return This tuple.
	 */
	@Override
	ITup2WF set(float[] t);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF set(float value);
	
	/**
	 * Adopts the component values from the given tuple {@code (v0, v1)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return This tuple.
	 */
	ITup2WF set(float v0, float v1);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF copy();
	
	/** {@inheritDoc} */
	@Override
	ITup2WF arrangeN(int[] indices);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF arrangeN(int indexV0, int indexV1);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF swizzleN(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	ITup2WF swizzleV0V1N();
	
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
	 * The valid index range is from 0 to 1. The given array has to have at
	 * least two entries. It is however not required to use all indices, neither
	 * is it required that each index is only used once.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return This tuple.
	 */
	ITup2WF arrange(int[] indices);
	
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
	 * The valid index range is from 0 to 1. It is however not required to use
	 * all indices, neither is it required that each index is only used once.
	 * 
	 * @param i0
	 * The index of the old component value which will be adopted to the
	 * first component.
	 * @param i1
	 * The index of the old component value which will be adopted to the
	 * second component.
	 * 
	 * @return This tuple.
	 */
	ITup2WF arrange(int indexV0, int indexV1);
	
	/**
	 * Swaps two component values at the given indices, so that the value at the
	 * first given index becomes the value at the second given index and the
	 * value at the second given index becomes the value at the fist given
	 * index.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1. It is however not
	 * required to use different indices.
	 * 
	 * @param indexA The index to the first component value to be swapped.
	 * @param indexB The index to the second component value to be swapped.
	 * 
	 * @return This tuple.
	 */
	@Override
	ITup2WF swizzle(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	ITup2WF swizzleV0V1();

	ITup2WF minComponents(ITup2RF t);
	
	ITup2WF minComponents(ITupRF t);
	
	ITup2WF minComponents(float[] t);
	
	ITup2WF minComponents(float tv0, float tv1);
	
	ITup2WF minComponentsN(ITup2RF t);
	
	ITup2WF minComponentsN(ITupRF t);
	
	ITup2WF minComponentsN(float[] t);
	
	ITup2WF minComponentsN(float tv0, float tv1);

	ITup2WF maxComponents(ITup2RF t);
	
	ITup2WF maxComponents(ITupRF t);
	
	ITup2WF maxComponents(float[] t);
	
	ITup2WF maxComponents(float tv0, float tv1);
	
	ITup2WF maxComponentsN(ITup2RF t);
	
	ITup2WF maxComponentsN(ITupRF t);
	
	ITup2WF maxComponentsN(float[] t);
	
	ITup2WF maxComponentsN(float tv0, float tv1);
}