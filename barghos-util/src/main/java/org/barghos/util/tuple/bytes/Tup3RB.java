package org.barghos.util.tuple.bytes;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.Nullable;

/**
 * This interface provides non-modifying operations for byte tuples with 
 * three components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface Tup3RB extends FixTupRB
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
	Tup3RB createNew(Tup3RB t);
	
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (t)}. The size of the given
	 * tuple {@code (t)} has to be a minimum of three components.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	@Override
	Tup3RB createNew(TupRB t);
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}. The size of the given tuple
	 * {@code (t)} has to be a minimum of three entries.
	 * 
	 * @param t The tuple to adopt the component values from as an array.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	@Override
	Tup3RB createNew(byte... t);
	
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
	Tup3RB createNew(byte value);
	
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (v0, v1, v2)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	Tup3RB createNew(byte v0, byte v1, byte v2);
	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup3RB} this will
	 * be always three.
	 * 
	 * @apiNote
	 * Do not override this function, as it already returns the correct value
	 * for any tuple with three components.
	 */
	@Override
	default int size()
	{
		return 3;
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
	byte v0();
	
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
	byte v1();
	
	/**
	 * Returns the value of the third component of the tuple.
	 * 
	 * @return The value of the third component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	byte v2();
	
	/**
	 * Returns the value of the component at the given index from the tuple.
	 *
	 * <p>
	 * The valid index range is from 0 to 2.
	 *
	 * @param index
	 * The index of the component of which the value is to be returned.
	 *
	 * @return The value of the component at the given index.
	 */
	@Override
	byte getAt(int index);
	
	/**
	 * Returns all component values of the tuple in order as a new array of the
	 * size of three entries.
	 * 
	 * <p>
	 * Modifications made to the returned array will not alter the values in the
	 * tuple.
	 *
	 * @return An array of the size of three entries,
	 * filled with the component values at their respective original index.
	 */
	@Override
	byte[] toArray();
	
	/**
	 * Fills the given result array {@code res} with the component values of the
	 * tuple in order and returns it. The size of the result array has to be
	 * equal to or greater than three entries.
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
	byte[] toArray(@ExtractionParam byte[] res);
	
	/**
	 * Returns whether the component value at the given index is exactly zero.
	 *
	 * <p>
	 * The valid index range is from 0 to 2.
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
	 * The valid index range is from 0 to 2.
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
	boolean isZeroAt(byte tolerance, int index);
	
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
	 * Returns whether the third component value is exactly zero.
	 *
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(2) = 0.0f}
	 *
	 * @return
	 * <p>
	 * {@code true} - If the third component value is exactly zero.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean isZeroAtV2();
	
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
	boolean isZeroAtV0(byte tolerance);
	
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
	boolean isZeroAtV1(byte tolerance);
	
	/**
	 * Returns whether the third component value is approximately zero.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * zero in positive and negative direction. This margin allows for example
	 * to compensate for floating point precision errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #zeroAtV2()}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= v(2) <= tolerance}
	 *
	 * @param tolerance
	 * The tolerance around zero, that should still count as zero. 
	 *
	 * @return
	 * <p>
	 * {@code true} - If the third component value is zero, taking into account
	 * the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean isZeroAtV2(byte tolerance);
	
	/** {@inheritDoc} */
	@Override
	Tup3RB copy();
	
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
	 * {@code v(2) = t.v2}<br>
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
	boolean equals(@Nullable Tup3RB t);
	
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
	 * {@code v(2) = t.v(2)}<b>
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
	boolean equals(@Nullable TupRB t);
	
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
	 * {@code v(2) = t[2]}<br>
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
	boolean equals(@Nullable byte... t);
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (v0, v1, v2)} are exactly equal.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = v0}<br>
	 * {@code v(1) = v1}<br>
	 * {@code v(2) = v2}<br>
	 * 
	 * @param v0 The value of the first component of the tuple to compare with.
	 * @param v1 The value of the second component of the tuple to compare with.
	 * @param v2 The value of the third component of the tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component values of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(byte v0, byte v1, byte v2);
	
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
	 * {@link #equals(Tup3RB)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t.v0) <= tolerance}<br>
	 * {@code -tolerance <= (v(1) - t.v1) <= tolerance}<br>
	 * {@code -tolerance <= (v(2) - t.v2) <= tolerance}<br>
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
	boolean equals(byte tolerance, @Nullable Tup3RB t);
	
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
	 * {@link #equals(TupRB)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t.v(0)) <= tolerance}<br>
	 * {@code -tolerance <= (v(1) - t.v(1)) <= tolerance}<br>
	 * {@code -tolerance <= (v(2) - t.v(2)) <= tolerance}<br>
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
	boolean equals(byte tolerance, @Nullable TupRB t);

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
	 * {@link #equals(double[]) equals(double...)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - t[0]) <= tolerance}<br>
	 * {@code -tolerance <= (v(1) - t[1]) <= tolerance}<br>
	 * {@code -tolerance <= (v(2) - t[2]) <= tolerance}<br>
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
	boolean equals(byte tolerance, @Nullable byte... t);
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (v0, v1, v2)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equals(double, double, double)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(0) - v0) <= tolerance}<br>
	 * {@code -tolerance <= (v(1) - v1) <= tolerance}<br>
	 * {@code -tolerance <= (v(2) - v2) <= tolerance}<br>
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param v0 The value of the first component of the tuple to compare with.
	 * @param v1 The value of the second component of the tuple to compare with.
	 * @param v2 The value of the third component of the tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component values of this tuple and the given tuple
	 * are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(byte tolerance, byte v0, byte v1, byte v2);
	
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
	 * The valid index range is from 0 to 2.
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
	boolean equalsAt(int index, @Nullable Tup3RB t);
	
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
	 * The valid index range is from 0 to 2.
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
	boolean equalsAt(int index, @Nullable TupRB t);
	
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
	 * The valid index range is from 0 to 2.
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
	boolean equalsAt(int index, @Nullable byte... t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2.
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
	boolean equalsAt(int index, byte value);
	
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
	 * {@link #equalsAt(int, Tup3RB)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2.
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
	boolean equalsAt(byte tolerance, int index, @Nullable Tup3RB t);
	
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
	 * {@link #equalsAt(int, TupRB)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2.
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
	boolean equalsAt(byte tolerance, int index, @Nullable TupRB t);
	
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
	 * {@link #equalsAt(int, double[]) equalsAt(int, double...)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2.
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
	boolean equalsAt(byte tolerance, int index, @Nullable byte... t);
	
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
	 * {@link #equalsAt(int, double)}.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2.
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
	boolean equalsAt(byte tolerance, int index, byte value);
	
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
	 * {@code v(0) = t.v(0)}
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
	boolean equalsAtV0(@Nullable Tup3RB t);
	
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
	boolean equalsAtV0(@Nullable TupRB t);
	
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
	boolean equalsAtV0(@Nullable byte... t);
	
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
	boolean equalsAtV0(byte value);
	
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
	 * {@code v(1) = t.v(1)}
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
	boolean equalsAtV1(@Nullable Tup3RB t);
	
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
	boolean equalsAtV1(@Nullable TupRB t);
	
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
	boolean equalsAtV1(@Nullable byte... t);
	
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
	boolean equalsAtV1(byte value);
	
	/**
	 * Returns whether the third component value of this tuple and
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
	 * {@code v(1) = t.v(1)}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * third component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV2(@Nullable Tup3RB t);
	
	/**
	 * Returns whether the third component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no third
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
	 * third component value is available in the given tuple and the third
	 * component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV2(@Nullable TupRB t);
	
	/**
	 * Returns whether the third component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no third
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
	 * {@code v(2) = t[2]}
	 * 
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * third component value is available in the given tuple and the third
	 * component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV2(@Nullable byte... t);
	
	/**
	 * Returns whether the third component value of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(2) = value}
	 * 
	 * @param t The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the third component value of this tuple and the given
	 * value are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV2(byte value);
	
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
	 * {@link #equalsAtV0(Tup3RB)}.
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
	boolean equalsAtV0(byte tolerance, @Nullable Tup3RB t);
	
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
	 * {@link #equalsAtV0(TupRB)}.
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
	boolean equalsAtV0(byte tolerance, @Nullable TupRB t);
	
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
	 * {@link #equalsAtV0(double[]) equalsAtV0(double...)}.
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
	boolean equalsAtV0(byte tolerance, @Nullable byte... t);
	
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
	 * {@link #equalsAtV0(double)}.
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
	boolean equalsAtV0(byte tolerance, byte value);
	
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
	 * {@link #equalsAtV1(Tup3RB)}.
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
	boolean equalsAtV1(byte tolerance, @Nullable Tup3RB t);
	
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
	 * {@link #equalsAtV1(TupRB)}.
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
	boolean equalsAtV1(byte tolerance, @Nullable TupRB t);
	
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
	 * {@link #equalsAtV1(double[]) equalsAtV1(double...)}.
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
	boolean equalsAtV1(byte tolerance, @Nullable byte... t);
	
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
	 * {@link #equalsAtV1(double)}.
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
	boolean equalsAtV1(byte tolerance, byte value);
	
	/**
	 * Returns whether the third component value of this tuple and of the given
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
	 * {@link #equalsAtV2(Tup3RB)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(2) - t.v2) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * third component value of this tuple and the given tuple are equal,
	 * taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV2(byte tolerance, @Nullable Tup3RB t);
	
	/**
	 * Returns whether the third component value of this tuple and of the given
	 * tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no third
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV2(TupRB)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(2) - t.v(2)) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * third component value is available in the given tuple and the third
	 * component value of this tuple and the given tuple are equal, taking into
	 * account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV2(byte tolerance, @Nullable TupRB t);
	
	/**
	 * Returns whether the third component value of this tuple and of the given
	 * tuple {@code (t)} are approximately equal.
	 * 
	 * <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no third
	 * component this returns false.
	 * 
	 * <p>
	 * As in most situations only the component values of the tuple are relevant
	 * when working with tuples, this does require this tuple and the given
	 * tuple {@code t} to be the same instance.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #equalsAtV2(double[]) equalsAtV1(double...)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(2) - t[2]) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * third component value is available in the given tuple and the third
	 * component value of this tuple and the given tuple are equal, taking into
	 * account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV2(byte tolerance, @Nullable byte... t);
	
	/**
	 * Returns whether the third component value of this tuple and the given
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
	 * {@link #equalsAtV2(double)}.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code -tolerance <= (v(2) - value) <= tolerance}
	 * 
	 * @param tolerance
	 * The tolerance around the values, that should still count as the value.
	 * @param t The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the third component value of this tuple and the given
	 * value are equal, taking into account the given tolerance.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV2(byte tolerance, byte value);
	
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
	 * The valid index range is from 0 to 2. The given array has to have at
	 * least three entries. It is however not required to use all indices,
	 * neither is it required that each index is only used once.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	@Override
	Tup3RB arrangeN(int... indices);
	
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
	 * The valid index range is from 0 to 2. It is however not required to use
	 * all indices, neither is it required that each index is only used once.
	 * 
	 * @param i0
	 * The index of the old component value which will be adopted to the
	 * first component.
	 * @param i1
	 * The index of the old component value which will be adopted to the
	 * second component.
	 * @param i2
	 * The index of the old component value which will be adopted to the
	 * third component.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	Tup3RB arrangeN(int i0, int i1, int i2);
	
	/**
	 * Swaps two component values at the given indices and returns the result
	 * as a new instance of the original type of this tuple, so that the value
	 * at the first given index becomes the value at the second given index and
	 * the value at the second given index becomes the value at the fist given
	 * index.
	 * 
	 * <p>
	 * The valid index range is from 0 to 2. It is however not
	 * required to use different indices.
	 * 
	 * @param indexA The index to the first component value to be swapped.
	 * @param indexB The index to the second component value to be swapped.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	@Override
	Tup3RB swizzleN(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup3RB swizzleV0V1N();
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup3RB swizzleV0V2N();
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup3RB swizzleV1V2N();
	
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
	 * The valid index range is from 0 to 2. The component at the given index in
	 * the given tuple has to be available.
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
	int compareAt(int index, Tup3RB t);
	
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
	 * The valid index range is from 0 to 2. The component at the given index in
	 * the given tuple has to be available.
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
	@Override
	int compareAt(int index, TupRB t);
	
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
	 * The valid index range is from 0 to 2. The component at the given index in
	 * the given tuple has to be available.
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
	@Override
	int compareAt(int index, byte... t);
	
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
	 * The valid index range is from 0 to 2.
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
	@Override
	int compareAt(int index, byte value);
	
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
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAt(int, Tup3RB)}.
	 * 
     * <p>
	 * The valid index range is from 0 to 2. The component at the given index in
	 * the given tuple has to be available.
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
	int compareAt(byte tolerance, int index, Tup3RB t);
	
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
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAt(int, TupRB)}.
	 * 
     * <p>
	 * The valid index range is from 0 to 2. The component at the given index in
	 * the given tuple has to be available.
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
	@Override
	int compareAt(byte tolerance, int index, TupRB t);
	
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
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAt(int, double[]) compareAt(int, double...)}.
	 * 
     * <p>
	 * The valid index range is from 0 to 2. The component at the given index in
	 * the given tuple has to be available.
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
	@Override
	int compareAt(byte tolerance, int index, byte... t);
	
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
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAt(int, double)}.
	 * 
     * <p>
	 * The valid index range is from 0 to 2.
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
	@Override
	int compareAt(byte tolerance, int index, byte value);
	
	/**
     * Compares the first component value of this tuple with the first component
     * value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the first component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the first component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The first component in the given tuple has to be available.
     *
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
	int compareAtV0(Tup3RB t);
	
	/**
     * Compares the first component value of this tuple with the first component
     * value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the first component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the first component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The first component in the given tuple has to be available.
     *
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
	int compareAtV0(TupRB t);
	
	/**
     * Compares the first component value of this tuple with the first component
     * value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the first component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the first component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The first component in the given tuple has to be available.
     *
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
	int compareAtV0(byte... t);
	
	/**
     * Compares the first component value of this tuple with the given value.
     * 
     * <p>
     * The sign of the returned integer value determines if the first component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the given value.
     *
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
	int compareAtV0(byte value);
	
	/**
     * Compares the second component value of this tuple with the second
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the second component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the second component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The second component in the given tuple has to be available.
     *
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
	int compareAtV1(Tup3RB t);
	
	/**
     * Compares the second component value of this tuple with the second
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the second component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the second component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The second component in the given tuple has to be available.
     *
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
	int compareAtV1(TupRB t);
	
	/**
     * Compares the second component value of this tuple with the second
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the second component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the second component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The second component in the given tuple has to be available.
     *
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
	int compareAtV1(byte... t);
	
	/**
     * Compares the second component value of this tuple with the given value.
     * 
     * <p>
     * The sign of the returned integer value determines if the second component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the given value.
     *
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
	int compareAtV1(byte value);
	
	/**
     * Compares the third component value of this tuple with the third
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the third component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the third component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The third component in the given tuple has to be available.
     *
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
	int compareAtV2(Tup3RB t);
	
	/**
     * Compares the third component value of this tuple with the third
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the third component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the third component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The third component in the given tuple has to be available.
     *
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
	int compareAtV2(TupRB t);
	
	/**
     * Compares the third component value of this tuple with the third
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the third component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the third component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The third component in the given tuple has to be available.
     *
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
	int compareAtV2(byte... t);
	
	/**
     * Compares the third component value of this tuple with the given value.
     * 
     * <p>
     * The sign of the returned integer value determines if the third component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the given value.
     *
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
	int compareAtV2(byte value);
	
	/**
     * Compares the first component value of this tuple with the first
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the first component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the first component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV0(Tup3RB)}.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV0(byte tolerance, Tup3RB t);
	
	/**
     * Compares the first component value of this tuple with the first
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the first component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the first component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV0(TupRB)}.
	 * 
     * <p>
	 * The first component has to be available.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV0(byte tolerance, TupRB t);
	
	/**
     * Compares the first component value of this tuple with the first
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the first component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the first component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV0(double[]) compareAtV0(double...)}.
	 * 
     * <p>
	 * The first component in the given tuple has to be available.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV0(byte tolerance, byte... t);
	
	/**
     * Compares the first component value of this tuple with the given value,
     * taking into account the given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the first component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the given value.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV0(double)}.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV0(byte tolerance, byte value);
	
	/**
     * Compares the second component value of this tuple with the second
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the second component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the second component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV1(Tup3RB)}.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV1(byte tolerance, Tup3RB t);
	
	/**
     * Compares the second component value of this tuple with the second
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the second component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the second component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV1(TupRB)}.
	 * 
     * <p>
	 * The second component has to be available.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV1(byte tolerance, TupRB t);
	
	/**
     * Compares the second component value of this tuple with the second
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the second component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the second component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV1(double[]) compareAtV1(double...)}.
	 * 
     * <p>
	 * The second component in the given tuple has to be available.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV1(byte tolerance, byte... t);
	
	/**
     * Compares the second component value of this tuple with the given value,
     * taking into account the given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the second component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the given value.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV1(double)}.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV1(byte tolerance, byte value);
	
	/**
     * Compares the third component value of this tuple with the third
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the third component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the third component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV2(Tup3RB)}.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV2(byte tolerance, Tup3RB t);
	
	/**
     * Compares the third component value of this tuple with the third
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the third component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the third component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV2(TupRB)}.
	 * 
     * <p>
	 * The third component has to be available.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV2(byte tolerance, TupRB t);
	
	/**
     * Compares the third component value of this tuple with the third
     * component value of the given tuple {@code (t)}, taking into account the
     * given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the third component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the third component value of the given
     * tuple {@code (t)}.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV2(double[]) compareAtV1(double...)}.
	 * 
     * <p>
	 * The third component in the given tuple has to be available.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV2(byte tolerance, byte... t);
	
	/**
     * Compares the third component value of this tuple with the given value,
     * taking into account the given tolerance.
     * 
     * <p>
     * The sign of the returned integer value determines if the third component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the given value.
     * 
     *  <p>
	 * This takes into account an inclusive margin of the given tolerance around
	 * the compared values in positive and negative direction.
	 * This margin allows for example to compensate for floating point precision
	 * errors.
	 * 
	 * <p>
	 * The minimum allowed tolerance is 0.0f. A tolerance of 0.0f behaves like
	 * {@link #compareAtV2(double)}.
     *
     * @param tolerance
	 * The tolerance around the values, that should still count as the value.
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
	int compareAtV2(byte tolerance, byte value);
}