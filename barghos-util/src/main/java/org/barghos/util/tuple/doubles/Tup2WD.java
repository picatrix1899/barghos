package org.barghos.util.tuple.doubles;

/**
 * This interface provides common operations for double tuples with two
 * components.
 */
public interface Tup2WD extends Tup2RD, FixTupWD
{
	/** {@inheritDoc} */
	@Override
	Tup2WD createNew(Tup2RD t);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD createNew(TupRD t);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD createNew(double... t);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD createNew(double value);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD createNew(double v0, double v1);
	
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
	Tup2WD v0(double v0);
	
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
	Tup2WD v1(double v1);
	
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
	Tup2WD setAt(int index, double value);
	
	/**
	 * Adopts the component values from the given tuple {@code t}.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return This tuple.
	 */
	Tup2WD set(Tup2RD t);
	
	/**
	 * Adopts the component values from the given tuple {@code (t)}. The given
	 * tuple has to have at least two components.
	 *
	 * @param t The tuple to adopt the component values from.
	 *
	 * @return This tuple.
	 */
	@Override
	Tup2WD set(TupRD t);
	
	/**
	 * Adopts the component values from the given tuple {@code (t)}. The given
	 * tuple has to have at least two components.
	 *
	 * @param t The tuple to adopt the component values from as an array.
	 *
	 * @return This tuple.
	 */
	@Override
	Tup2WD set(double... t);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD set(double value);
	
	/**
	 * Adopts the component values from the given tuple {@code (v0, v1)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return This tuple.
	 */
	Tup2WD set(double v0, double v1);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD copy();
	
	/** {@inheritDoc} */
	@Override
	Tup2WD arrangeN(int... indices);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD arrangeN(int iV0, int iV1);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD swizzleN(int indexA, int indexB);
	
	/** {@inheritDoc} */
	@Override
	Tup2WD swizzleV0V1N();
	
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
	@Override
	Tup2WD arrange(int... indices);
	
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
	Tup2WD arrange(int iV0, int iV1);
	
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
	Tup2WD swizzle(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1}.
	 * 
	 * @return This tuple.
	 */
	Tup2WD swizzleV0V1();
}