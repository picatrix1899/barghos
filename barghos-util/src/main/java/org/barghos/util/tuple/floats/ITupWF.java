package org.barghos.util.tuple.floats;

/**
 * This interface provides common operations for float tuples.
 * 
 * <p>
 * Whether the tuple allows to alter the size of this tuple or create new tuple
 * instances with different sizes than the size of this tuple is left to the
 * implementation. However every implementation guarantees to support the
 * creation of tuples of the same size.
 */
public interface ITupWF extends ITupRF
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
	ITupWF setAt(int index, float value);

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
	ITupWF set(ITupRF t);

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
	ITupWF set(float[] t);
}
