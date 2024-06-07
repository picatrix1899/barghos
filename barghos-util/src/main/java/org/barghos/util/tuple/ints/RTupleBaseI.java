package org.barghos.util.tuple.ints;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.IntMinValue;
import org.barghos.annotation.Nullable;

/**
 * This interface provides non-modifying operations for int tuples with an
 * implicitly fixed number of components. Therefore the operations of this
 * interface will not alter the component values of this tuple, not the size of
 * this tuple and will not create new tuple instances with different sizes than
 * the size of this tuple.
 */
public interface RTupleBaseI
{
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (t)}. The size of the given
	 * tuple {@code (t)} has to be equal to the size of this tuple
	 * ({@link #size()}).
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	RTupleBaseI createNew(RTupleBaseI t);
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}. The size of the given tuple
	 * {@code (t)} has to be equal to the size of this tuple ({@link #size()}).
	 * 
	 * @param t The tuple to adopt the component values from as an array.
	 * 
	 * @return
	 * A new instance of the type of this tuple with the respective component
	 * values.
	 */
	RTupleBaseI createNew(int... t);
	
	/**
	 * Returns the size and therefore the number of components of the tuple.
	 *
	 * @return The size and therefore the number of components of the tuple.
	 */
	int size();

	/**
	 * Returns the value of the component at the given index from the tuple.
	 *
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 *
	 * @param index
	 * The index of the component of which the value is to be returned.
	 *
	 * @return The value of the component at the given index.
	 */
	int getAt(@IntMinValue(0) int index);

	/**
	 * Returns all component values of the tuple in order as a new array of the
	 * size of this tuple ({@link #size()}).
	 * 
	 * <p>
	 * Modifications made to the returned array will not alter the values in the
	 * tuple.
	 *
	 * @return An array of the size of this tuple ({@link #size()}),
	 * filled with the component values at their respective original index.
	 */
	int[] toArray();

	/**
	 * Fills the given result array {@code res} with the component values of the
	 * tuple in order and returns it. The size of the result array has to be
	 * equal to or greater than the size of this tuple ({@link #size()}).
	 * 
	 * <p>
	 * Modifications made to the result array will not alter the values in the
	 * tuple.
	 *
	 * @param res The result array to fill with the component values.
	 *
	 * @return The result array {@code res} filled with the component values.
	 */
	int[] toArray(@ExtractionParam int[] res);
	
	/**
	 * Returns whether all component values are exactly zero.
	 *
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(n) = 0.0f}
	 *
	 * @return
	 * <p>
	 * {@code true} - If all component values are exactly zero.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean zero();
	
	/**
	 * Returns whether all component values are approximately zero.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * zero in positive and negative direction. This margin allows for example
	 * to compensate for floating point precision errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #zero()}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= v(n) <= tolerance}
	 *
	 * @param tolerance
	 * The tolerance around zero, that should still count as zero. 
	 *
	 * @return
	 * <p>
	 * {@code true} - If all component values are zero, taking into account the
	 * given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean zero(@IntMinValue(0) int tolerance);

	/**
	 * Returns whether the component value at the given index is exactly zero.
	 *
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 *
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = 0.0f}
	 *
	 * @param index
	 * The index of the component of which the value is to be checked.
	 *
	 * @return
	 * <p>
	 * {@code true} - If the component value at the given index is exactly zero.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean zeroAt(@IntMinValue(0) int index);
	
	/**
	 * Returns whether the component value at the given index is approximately
	 * zero.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * zero in positive and negative direction. This margin allows for example
	 * to compensate for floating point precision errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #zeroAt(int)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= v(index) <= tolerance}
	 *
	 * @param tolerance
	 * The tolerance around zero, that should still count as zero. 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 *
	 * @return
	 * <p>
	 * {@code true} - If the component value at the given index is zero, taking
	 * into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean zeroAt(@IntMinValue(0) int tolerance, @IntMinValue(0) int index);
	
	/**
	 * Creates a copy of this tuple with adopted component values.
	 * Therefore it creates a new instance of the original type of this tuple
	 * and adopts the component values from this tuple.
	 * 
	 * @return A copy of this tuple with the component values adopted.
	 */
	RTupleBaseI copy();

	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(n) = t.v(n)}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(@Nullable RTupleBaseI t);
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(n) = t[n]}
	 * 
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(@Nullable int... t);

	/**
	 * Returns whether the component values of this tuple and the given
	 * value are exactly equal.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(n) = value}
	 * 
	 * @param value The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component values of this tuple and the given value
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(int value);
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #equals(RTupleBaseI)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(n) - t.v(n)) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(@IntMinValue(0) int tolerance, @Nullable RTupleBaseI t);
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #equals(int[]) equals(int...)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(n) - t[n]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(@IntMinValue(0) int tolerance, @Nullable int... t);
	
	/**
	 * Returns whether the component values of this tuple and the given value
	 * are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #equals(int)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(n) - value) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param value The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component values of this tuple and
	 * the given value are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(@IntMinValue(0) int tolerance, int value);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = t.v(index)}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component value at the given index of
	 * this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(@IntMinValue(0) int index, @Nullable RTupleBaseI t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = t.v(index)}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component value at the given index of
	 * this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(@IntMinValue(0) int index, @Nullable int... t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = value}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param value The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If  the component value at the given index of this tuple
	 * and the given value are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(@IntMinValue(0) int index, int value);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #equalsAt(int, RTupleBaseI)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(index) - t.v(index)) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(@IntMinValue(0) int tolerance, @IntMinValue(0) int index, @Nullable RTupleBaseI t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or of different size this returns
	 * false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #equalsAt(int, int[]) equalsAt(int, int...)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(index) - t[index]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, is of
	 * the same size as this tuple and the component values of this tuple and
	 * the given tuple are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(@IntMinValue(0) int tolerance, @IntMinValue(0) int index, @Nullable int... t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #equalsAt(int, int) equalsAt(int, int)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(index) - value) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param value The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component values of this tuple and the given value
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(@IntMinValue(0) int tolerance, @IntMinValue(0) int index, int value);
	
	/**
	 * Arranges the order of the component values by their indices and returns
	 * the result as a new instance of the original type of this tuple.
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
	 * @return A new instance of this type of tuple with the result.
	 */
	RTupleBaseI arrangeN(@IntMinValue(0) int... indices);
	
	/**
	 * Swaps two component values at the given indices and returns the result
	 * as a new instance of the original type of this tuple, so that the value
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
	 * @return A new instance of this type of tuple with the result.
	 */
	RTupleBaseI swizzleN(@IntMinValue(0) int indexA, @IntMinValue(0) int indexB);
	
	/**
     * Compares the component value at the given index of this tuple with the
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the component value
     * at the given index is less than (result: {@code -1}), equal to
     * (result: {@code 0}) or greater than (result: {@code 1}) the component
     * value at the given index of the given tuple {@code (t)}.
     *
     * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
     *
     * @param index
	 * The index of the component of which the value is to be compared.
     * @param t The tuple to compare with.
     * 
     * @return
     * <p>
     * {@code 0} - If the component value is equal to the component value of the
     * given tuple.
     * 
     * <p>
     * {@code -1} - If the component value is less than the component value of
     * the given tuple.
     * 
     * <p>
     * {@code 1} - If the component value is greater than the component value of
     * the given tuple.
     */
	int compareAt(int index, RTupleBaseI t);
	
	/**
     * Compares the component value at the given index of this tuple with the
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the component value
     * at the given index is less than (result: {@code -1}), equal to
     * (result: {@code 0}) or greater than (result: {@code 1}) the component
     * value at the given index of the given tuple {@code (t)}.
     *
     * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
     *
     * @param index
	 * The index of the component of which the value is to be compared.
     * @param t The tuple to compare with as an array.
     * 
     * @return
     * <p>
     * {@code 0} - If the component value is equal to the component value of the
     * given tuple.
     * 
     * <p>
     * {@code -1} - If the component value is less than the component value of
     * the given tuple.
     * 
     * <p>
     * {@code 1} - If the component value is greater than the component value of
     * the given tuple.
     */
	int compareAt(int index, int... t);
	
	/**
     * Compares the component value at the given index of this tuple with the
     * given value.
     * 
     * <p>
     * The sign of the returned integer value determines if the component value
     * at the given index is less than (result: {@code -1}), equal to
     * (result: {@code 0}) or greater than (result: {@code 1}) the given value.
     *
     * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
     *
     * @param index
	 * The index of the component of which the value is to be compared.
     * @param value The value to compare with.
     * 
     * @return
     * <p>
     * {@code 0} - If the component value is equal to the given value.
     * 
     * <p>
     * {@code -1} - If the component value is less than the given value.
     * 
     * <p>
     * {@code 1} - If the component value is greater than the given value.
     */
	int compareAt(int index, int value);
	
	/**
     * Compares the component value at the given index of this tuple with the
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the component value
     * at the given index is less than (result: {@code -1}), equal to
     * (result: {@code 0}) or greater than (result: {@code 1}) the component
     * value at the given index of the given tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #compareAt(int, RTupleBaseI) compareAt(int, RTupleBaseI)}.
	 * 
     * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
     * @param index
	 * The index of the component of which the value is to be compared.
     * @param t The tuple to compare with.
     * 
     * @return
     * <p>
     * {@code 0} - If the component value is equal to the component value of the
     * given tuple.
     * 
     * <p>
     * {@code -1} - If the component value is less than the component value of
     * the given tuple.
     * 
     * <p>
     * {@code 1} - If the component value is greater than the component value of
     * the given tuple.
     */
	int compareAt(@IntMinValue(0) int tolerance, int index, @Nullable RTupleBaseI t);
	
	/**
     * Compares the component value at the given index of this tuple with the
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the component value
     * at the given index is less than (result: {@code -1}), equal to
     * (result: {@code 0}) or greater than (result: {@code 1}) the component
     * value at the given index of the given tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #compareAt(int, int[]) compareAt(int, int...)}.
	 * 
     * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
     * @param index
	 * The index of the component of which the value is to be compared.
     * @param t The tuple to compare with as an array.
     * 
     * @return
     * <p>
     * {@code 0} - If the component value is equal to the component value of the
     * given tuple.
     * 
     * <p>
     * {@code -1} - If the component value is less than the component value of
     * the given tuple.
     * 
     * <p>
     * {@code 1} - If the component value is greater than the component value of
     * the given tuple.
     */
	int compareAt(@IntMinValue(0) int tolerance, int index, @Nullable int... t);
	
	/**
     * Compares the component value at the given index of this tuple with the
     * given tuple, taking into account the given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the component value
     * at the given index is less than (result: {@code -1}), equal to
     * (result: {@code 0}) or greater than (result: {@code 1}) the component
     * value at the given index of the given tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0. A tolerance of 0 behaves like
	 * {@link #compareAt(int, int) compareAt(int, int)}.
	 * 
     * <p>
	 * The valid index range is from 0 to {@link #size()} - 1.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
     * @param index
	 * The index of the component of which the value is to be compared.
     * @param value The value to compare with.
     * 
     * @return
     * <p>
     * {@code 0} - If the component value is equal to the given value.
     * 
     * <p>
     * {@code -1} - If the component value is less than the given value.
     * 
     * <p>
     * {@code 1} - If the component value is greater than the given value.
     */
	int compareAt(@IntMinValue(0) int tolerance, int index, int value);
}
