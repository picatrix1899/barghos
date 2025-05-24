package org.barghos.util.tuple.bigds;

import java.math.BigDecimal;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.AllowNull;

/**
 * This interface provides non-modifying operations for {@link BigDecimal}
 * tuples with two components. Therefore the operations of this interface will
 * not alter the component values of this tuple.
 */
public interface Tup2RBigd extends FixTupRBigd
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
	Tup2RBigd createNew(Tup2RBigd t);
	
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (t)}. The size of the given
	 * tuple {@code (t)} has to be a minimum of two components.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	@Override
	Tup2RBigd createNew(TupRBigd t);
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}. The size of the given tuple
	 * {@code (t)} has to be a minimum of two entries.
	 * 
	 * @param t The tuple to adopt the component values from as an array.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	@Override
	Tup2RBigd createNew(BigDecimal... t);
	
	/**
	 * Creates a new instance of the type of this tuple and sets the component
	 * values to the given value.
	 * 
	 * @param value The value that will be used for all component values.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the component
	 * values set to the given value.
	 */
	Tup2RBigd createNew(BigDecimal value);
	
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (v0, v1)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	Tup2RBigd createNew(BigDecimal v0, BigDecimal v1);
	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup2RBigd} this will
	 * be always two.
	 * 
	 * @apiNote
	 * Do not override this function, as it already returns the correct value
	 * for any tuple with two components.
	 */
	@Override
	default int size()
	{
		return 2;
	}
	
	/**
	 * Returns the value of the first component of the tuple.
	 * 
	 * @return The value of the first component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	BigDecimal v0();
	
	/**
	 * Returns the value of the second component of the tuple.
	 * 
	 * @return The value of the second component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	BigDecimal v1();
	
	/**
	 * Returns the value of the component at the given index from the tuple.
	 *
	 * <p>
	 * The valid index range is from 0 to 1.
	 *
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
	 *
	 * @param index
	 * The index of the component of which the value is to be returned.
	 *
	 * @return The value of the component at the given index.
	 */
	@Override
	BigDecimal getAt(int index);
	
	/**
	 * Returns all component values of the tuple in order as a new array of the
	 * size of two entries.
	 * 
	 * <p>
	 * Modifications made to the returned array will not alter the values in the
	 * tuple.
	 *
	 * @return An array of the size of two entries,
	 * filled with the component values at their respective original index.
	 */
	@Override
	BigDecimal[] toArray();
	
	/**
	 * Fills the given result array {@code res} with the component values of the
	 * tuple in order and returns it. The size of the result array has to be
	 * equal to or greater than two entries.
	 * 
	 * <p>
	 * Modifications made to the result array will not alter the values in the
	 * tuple.
	 *
	 * @param res The result array to fill with the component values.
	 *
	 * @return The result array {@code res} filled with the component values.
	 */
	@Override
	BigDecimal[] toArray(@ExtractionParam BigDecimal[] res);
	
	/**
	 * Returns whether the component value at the given index is exactly zero.
	 *
	 * <p>
	 * The valid index range is from 0 to 1.
	 *
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	@Override
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
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	@Override
	boolean isZeroAt(BigDecimal tolerance, int index);
	
	/**
	 * Returns whether the first component value is exactly zero.
	 *
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = 0.0f}
	 *
	 * @return
	 * <p>
	 * {@code true} - If the first component value is exactly zero.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean isZeroAtV0();
	
	/**
	 * Returns whether the second component value is exactly zero.
	 *
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(1) = 0.0f}
	 *
	 * @return
	 * <p>
	 * {@code true} - If the second component value is exactly zero.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean isZeroAtV1();
	
	/**
	 * Returns whether the first component value is approximately zero.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * zero in positive and negative direction. This margin allows for example
	 * to compensate for floating point precision errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #zeroAtV0()}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= v(0) <= tolerance}
	 *
	 * @param tolerance
	 * The tolerance around zero, that should still count as zero. 
	 *
	 * @return
	 * <p>
	 * {@code true} - If the first component value is zero, taking into account
	 * the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean isZeroAtV0(BigDecimal tolerance);
	
	/**
	 * Returns whether the second component value is approximately zero.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * zero in positive and negative direction. This margin allows for example
	 * to compensate for floating point precision errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #zeroAtV1()}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= v(1) <= tolerance}
	 *
	 * @param tolerance
	 * The tolerance around zero, that should still count as zero. 
	 *
	 * @return
	 * <p>
	 * {@code true} - If the second component value is zero, taking into account
	 * the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean isZeroAtV1(BigDecimal tolerance);
	
	/** {@inheritDoc} */
	@Override
	Tup2RBigd copy();
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = t.v0}<br>
	 * {@code v(1) = t.v1}<br>
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * component values of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(@AllowNull Tup2RBigd t);
	
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
	 * {@code v(0) = t.v(0)}<b>
	 * {@code v(1) = t.v(1)}<b>
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
	@Override
	boolean equals(@AllowNull TupRBigd t);
	
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
	 * {@code v(0) = t[0]}<br>
	 * {@code v(1) = t[1]}<br>
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
	@Override
	boolean equals(@AllowNull BigDecimal... t);
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (v0, v1)} are exactly equal.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = v0}<br>
	 * {@code v(1) = v1}
	 * 
	 * @param v0 The value of the first component of the tuple to compare with.
	 * @param v1 The value of the second component of the tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component values of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(BigDecimal v0, BigDecimal v1);
	
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
	 * If the given tuple {@code (t)} is null this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equals(Tup2RBigd)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t.v0) <= tolerance}<br>
	 * {@code -tolerance <= (v(1) - t.v1) <= tolerance}<br>
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * component values of this tuple and the given tuple are equal, taking into
	 * account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(BigDecimal tolerance, @AllowNull Tup2RBigd t);
	
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
	 * {@link #equals(TupRBigd)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t.v(0)) <= tolerance}<br>
	 * {@code -tolerance <= (v(1) - t.v(1)) <= tolerance}<br>
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
	@Override
	boolean equals(BigDecimal tolerance, @AllowNull TupRBigd t);

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
	 * {@link #equals(BigDecimal[]) equals(BigDecimal...)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t[0]) <= tolerance}<br>
	 * {@code -tolerance <= (v(1) - t[1]) <= tolerance}<br>
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
	@Override
	boolean equals(BigDecimal tolerance, @AllowNull BigDecimal... t);
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (v0, v1)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equals(BigDecimal, BigDecimal)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - v0) <= tolerance}<br>
	 * {@code -tolerance <= (v(1) - v1) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param v0 The value of the first component of the tuple to compare with.
	 * @param v1 The value of the second component of the tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component values of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(BigDecimal tolerance, BigDecimal v0, BigDecimal v1);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(int index, @AllowNull Tup2RBigd t);
	
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
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	@Override
	boolean equalsAt(int index, @AllowNull TupRBigd t);
	
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
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(index) = t[index]}
	 * 
	 * @param index
	 * The index of the component of which the value is to be checked.
	 * @param t The tuple to compare with as an array.
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
	@Override
	boolean equalsAt(int index, @AllowNull BigDecimal... t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	@Override
	boolean equalsAt(int index, BigDecimal value);
	
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
	 * If the given tuple {@code (t)} is null this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAt(int, Tup2RBigd)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and
	 * the component value at the given index of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAt(BigDecimal tolerance, int index, @AllowNull Tup2RBigd t);
	
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
	 * {@link #equalsAt(int, TupRBigd)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	@Override
	boolean equalsAt(BigDecimal tolerance, int index, @AllowNull TupRBigd t);
	
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
	 * {@link #equalsAt(int, BigDecimal[]) equalsAt(int, BigDecimal...)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	 * the component values at the given index of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	@Override
	boolean equalsAt(BigDecimal tolerance, int index, @AllowNull BigDecimal... t);
	
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
	 * {@link #equalsAt(int, BigDecimal)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1.
	 * 
	 * <table>
	 * <tr><th>Index</th><th>Component</th></tr>
	 * <tr><td>0</td><td>v0</td></tr>
	 * <tr><td>1</td><td>v1</td></tr>
	 * </table>
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
	@Override
	boolean equalsAt(BigDecimal tolerance, int index, BigDecimal value);
	
	/**
	 * Returns whether the first component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = t.v0}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * first component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV0(@AllowNull Tup2RBigd t);
	
	/**
	 * Returns whether the first component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no first
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = t.v(0)}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * first component value is available in the given tuple and the first
	 * component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV0(@AllowNull TupRBigd t);
	
	/**
	 * Returns whether the first component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no first
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = t[0]}
	 * 
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * first component value is available in the given tuple and the first
	 * component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV0(@AllowNull BigDecimal... t);
	
	/**
	 * Returns whether the first component value of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = value}
	 * 
	 * @param t The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the first component value of this tuple and the given
	 * value are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV0(BigDecimal value);
	
	/**
	 * Returns whether the second component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(1) = t.v1}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * second component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV1(@AllowNull Tup2RBigd t);
	
	/**
	 * Returns whether the second component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no second
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(1) = t.v(1)}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * second component value is available in the given tuple and the second
	 * component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV1(@AllowNull TupRBigd t);
	
	/**
	 * Returns whether the second component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no second
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does not require this tuple and the given
	 * tuple {@code (t)} to be the same instance.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(1) = t[1]}
	 * 
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * second component value is available in the given tuple and the second
	 * component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV1(@AllowNull BigDecimal... t);
	
	/**
	 * Returns whether the second component value of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(1) = value}
	 * 
	 * @param t The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the second component value of this tuple and the given
	 * value are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV1(BigDecimal value);
	
	/**
	 * Returns whether the first component value of this tuple and of the given
	 * tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV0(Tup2RBigd)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t.v0) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * first component value of this tuple and the given tuple are equal, taking
	 * into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV0(BigDecimal tolerance, @AllowNull Tup2RBigd t);
	
	/**
	 * Returns whether the first component value of this tuple and of the given
	 * tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no first
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV0(TupRBigd)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t.v(0)) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * first component value is available in the given tuple and the first
	 * component value of this tuple and the given tuple are equal, taking into
	 * account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV0(BigDecimal tolerance, @AllowNull TupRBigd t);
	
	/**
	 * Returns whether the first component value of this tuple and of the given
	 * tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no first
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV0(BigDecimal[]) equalsAtV0(BigDecimal...)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t[0]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * first component value is available in the given tuple and the first
	 * component value of this tuple and the given tuple are equal, taking into
	 * account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV0(BigDecimal tolerance, @AllowNull BigDecimal... t);
	
	/**
	 * Returns whether the first component value of this tuple and the given
	 * value are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV0(BigDecimal)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - value) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the first component value of this tuple and the given
	 * value are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV0(BigDecimal tolerance, BigDecimal value);
	
	/**
	 * Returns whether the second component value of this tuple and of the given
	 * tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV1(Tup2RBigd)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(1) - t.v1) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * second component value of this tuple and the given tuple are equal,
	 * taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV1(BigDecimal tolerance, @AllowNull Tup2RBigd t);
	
	/**
	 * Returns whether the second component value of this tuple and of the given
	 * tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no second
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV1(TupRBigd)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(1) - t.v(1)) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * second component value is available in the given tuple and the second
	 * component value of this tuple and the given tuple are equal, taking into
	 * account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV1(BigDecimal tolerance, @AllowNull TupRBigd t);
	
	/**
	 * Returns whether the second component value of this tuple and of the given
	 * tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no second
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV1(BigDecimal[]) equalsAtV1(BigDecimal...)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(1) - t[1]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * second component value is available in the given tuple and the second
	 * component value of this tuple and the given tuple are equal, taking into
	 * account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV1(BigDecimal tolerance, @AllowNull BigDecimal... t);
	
	/**
	 * Returns whether the second component value of this tuple and the given
	 * value are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV1(BigDecimal)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(1) - value) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the second component value of this tuple and the given
	 * value are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV1(BigDecimal tolerance, BigDecimal value);
	
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
	 * The valid index range is from 0 to 1. The given array has to have at
	 * least two entries. It is however not required to use all indices, neither
	 * is it required that each index is only used once.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	@Override
	Tup2RBigd arrangeN(int... indices);
	
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
	 * @return A new instance of this type of tuple with the result.
	 */
	Tup2RBigd arrangeN(int i0, int i1);
	
	/**
	 * Swaps two component values at the given indices and returns the result
	 * as a new instance of the original type of this tuple, so that the value
	 * at the first given index becomes the value at the second given index and
	 * the value at the second given index becomes the value at the fist given
	 * index.
	 * 
	 * <p>
	 * The valid index range is from 0 to 1. It is however not
	 * required to use different indices.
	 * 
	 * @param indexA The index to the first component value to be swapped.
	 * @param indexB The index to the second component value to be swapped.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	@Override
	Tup2RBigd swizzleN(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup2RBigd swizzleV0V1N();
}