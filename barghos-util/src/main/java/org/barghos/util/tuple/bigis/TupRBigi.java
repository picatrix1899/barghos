package org.barghos.util.tuple.bigis;

import java.math.BigInteger;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.AllowNull;

/**
 * This interface provides non-modifying operations for {@link BigInteger}
 * tuples. Therefore the operations of this interface will not alter the
 * component values of this tuple nor the size of this tuple.
 * 
 * <p>
 * Whether the tuple allows to create new tuple instances with different sizes
 * than the size of this tuple is left to the implementation. However every
 * implementation guarantees to support the creation of tuples of the same
 * size.
 */
public interface TupRBigi
{
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
	BigInteger getAt(int index);

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
	BigInteger[] toArray();

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
	BigInteger[] toArray(@ExtractionParam BigInteger[] res);
	
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
	boolean isZero();
	
	/**
	 * Returns whether all component values are approximately zero.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * zero in positive and negative direction. This margin allows for example
	 * to compensate for floating point precision errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
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
	boolean isZero(BigInteger tolerance);

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
	boolean isZeroAt(int index);
	
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
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
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
	boolean isZeroAt(BigInteger tolerance, int index);
	
	/**
	 * Creates a copy of this tuple with adopted component values.
	 * Therefore it creates a new instance of the original type of this tuple
	 * and adopts the component values from this tuple.
	 * 
	 * @return A copy of this tuple with the component values adopted.
	 */
	TupRBigi copy();

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
	boolean equals(@AllowNull TupRBigi t);
	
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
	boolean equals(@AllowNull BigInteger... t);
	
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
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equals(TupRBigi)}.
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
	boolean equals(BigInteger tolerance, TupRBigi t);
	
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
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equals(BigInteger[]) equals(BigInteger...)}.
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
	boolean equals(BigInteger tolerance, @AllowNull BigInteger... t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
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
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(int index, @AllowNull TupRBigi t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
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
	 * {@code v(index) = t[index]}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(int index, @AllowNull BigInteger... t);
	
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
	 * {@code true} - If the component value at the given index of this tuple
	 * and the given value are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(int index, BigInteger value);
	
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
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, TupRBigi)}.
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
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(BigInteger tolerance, int index, @AllowNull TupRBigi t);
	
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
	 * If the given tuple {@code (t)} is null or the given index is not
	 * available in the given tuple this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, BigInteger[]) equalsAt(int, BigInteger...)}.
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
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * component value at the given index is available in the given tuple and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(BigInteger tolerance, int index, @AllowNull BigInteger... t);
	
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
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, BigInteger) equalsAt(int, BigInteger)}.
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
	 * {@code true} - If the component value at the given index of this tuple
	 * and the given value are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(BigInteger tolerance, int index, BigInteger value);
	
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
	TupRBigi swizzleN(int indexA, int indexB);
}
