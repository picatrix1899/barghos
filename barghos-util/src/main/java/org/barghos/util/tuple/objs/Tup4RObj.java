package org.barghos.util.tuple.objs;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.Nullable;

/**
 * This interface provides non-modifying operations for Object tuples with 
 * four components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface Tup4RObj extends FixTupRObj
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
	Tup4RObj createNew(Tup4RObj t);
	
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (t)}. The size of the given
	 * tuple {@code (t)} has to be a minimum of four components.
	 * 
	 * @param t The tuple to adopt the component values from.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	@Override
	Tup4RObj createNew(TupRObj t);
	
	/**
	 * Creates a new instance of the type of this tuple and adopts the component
	 * values from the given tuple {@code (t)}. The size of the given tuple
	 * {@code (t)} has to be a minimum of four entries.
	 * 
	 * @param t The tuple to adopt the component values from as an array.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	@Override
	Tup4RObj createNew(Object... t);
	
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
	Tup4RObj createNew(Object value);
	
	/**
	 * Creates a new instance of the original type of this tuple and adopts the
	 * component values from the given tuple {@code (v0, v1, v2, v3)}.
	 * 
	 * @param v0 The new value of the first component.
	 * @param v1 The new value of the second component.
	 * @param v2 The new value of the third component.
	 * @param v3 The new value of the fourth component.
	 * 
	 * @return
	 * A new instance of the original type of this tuple with the adopted
	 * component values.
	 */
	Tup4RObj createNew(Object v0, Object v1, Object v2, Object v3);
	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup4RObj} this will
	 * be always four.
	 * 
	 * @apiNote
	 * Do not override this function, as it already returns the correct value
	 * for any tuple with four components.
	 */
	@Override
	default int size()
	{
		return 4;
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
	Object v0();
	
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
	Object v1();
	
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
	Object v2();
	
	/**
	 * Returns the value of the fourth component of the tuple.
	 * 
	 * @return The value of the fourth component.
	 * 
	 * @implNote The abstract naming concept of "Value n" (Vn; i.e. "v0") was
	 * introduced, as the original concept was too close to the naming
	 * conventions of vectors. Because not all tuples are necessarily vectors,
	 * the vector naming convention might be confusing to understand or could
	 * even create conflicts hence it was changed.
	 */
	Object v3();
	
	/**
	 * Returns the value of the component at the given index from the tuple.
	 *
	 * <p>
	 * The valid index range is from 0 to 3.
	 *
	 * @param index
	 * The index of the component of which the value is to be returned.
	 *
	 * @return The value of the component at the given index.
	 */
	@Override
	Object getAt(int index);
	
	/**
	 * Returns all component values of the tuple in order as a new array of the
	 * size of four entries.
	 * 
	 * <p>
	 * Modifications made to the returned array will not alter the values in the
	 * tuple.
	 *
	 * @return An array of the size of four entries,
	 * filled with the component values at their respective original index.
	 */
	@Override
	Object[] toArray();
	
	/**
	 * Fills the given result array {@code res} with the component values of the
	 * tuple in order and returns it. The size of the result array has to be
	 * equal to or greater than four entries.
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
	Object[] toArray(@ExtractionParam Object[] res);
	
	/** {@inheritDoc} */
	@Override
	Tup4RObj copy();
	
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
	 * {@code v(3) = t.v3}<br>
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
	boolean equals(@Nullable Tup4RObj t);
	
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
	 * {@code v(3) = t.v(3)}<b>
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
	boolean equals(@Nullable TupRObj t);
	
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
	 * {@code v(3) = t[3]}<br>
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
	boolean equals(@Nullable Object... t);
	
	/**
	 * Returns whether the component values of this tuple and the component
	 * values of the given tuple {@code (v0, v1, v2, v3)} are exactly equal.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(0) = v0}<br>
	 * {@code v(1) = v1}<br>
	 * {@code v(2) = v2}<br>
	 * {@code v(3) = v3}<br>
	 * 
	 * @param v0 The value of the first component of the tuple to compare with.
	 * @param v1 The value of the second component of the tuple to compare with.
	 * @param v2 The value of the third component of the tuple to compare with.
	 * @param v3 The value of the fourth component of the tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the component values of this tuple and the given tuple
	 * are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equals(Object v0, Object v1, Object v2, Object v3);
	
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
	 * The valid index range is from 0 to 3.
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
	boolean equalsAt(int index, @Nullable Tup4RObj t);
	
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
	 * The valid index range is from 0 to 3.
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
	boolean equalsAt(int index, @Nullable TupRObj t);
	
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
	 * The valid index range is from 0 to 3.
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
	boolean equalsAt(int index, @Nullable Object... t);
	
	/**
	 * Returns whether the component value at the given index of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * The valid index range is from 0 to 3.
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
	boolean equalsAt(int index, Object value);
	
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
	boolean equalsAtV0(@Nullable Tup4RObj t);
	
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
	boolean equalsAtV0(@Nullable TupRObj t);
	
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
	boolean equalsAtV0(@Nullable Object... t);
	
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
	boolean equalsAtV0(Object value);
	
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
	boolean equalsAtV1(@Nullable Tup4RObj t);
	
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
	boolean equalsAtV1(@Nullable TupRObj t);
	
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
	boolean equalsAtV1(@Nullable Object... t);
	
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
	boolean equalsAtV1(Object value);
	
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
	 * {@code v(2) = t.v(2)}
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
	boolean equalsAtV2(@Nullable Tup4RObj t);
	
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
	 * {@code v(2) = t.v(2)}
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
	boolean equalsAtV2(@Nullable TupRObj t);
	
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
	boolean equalsAtV2(@Nullable Object... t);
	
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
	boolean equalsAtV2(Object value);
	
	/**
	 * Returns whether the fourth component value of this tuple and
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
	 * {@code v(3) = t.v(3)}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null} and the
	 * fourth component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV3(@Nullable Tup4RObj t);
	
	/**
	 * Returns whether the fourth component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no fourth
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
	 * {@code v(3) = t.v(3)}
	 * 
	 * @param t The tuple to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * fourth component value is available in the given tuple and the fourth
	 * component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV3(@Nullable TupRObj t);
	
	/**
	 * Returns whether the fourth component value of this tuple and
	 * of the given tuple {@code (t)} are exactly equal.
	 * 
	 * <p>
	 * If the given tuple {@code (t)} is null or the given tuple has no fourth
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
	 * {@code v(3) = t[3]}
	 * 
	 * @param t The tuple to compare with as an array.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the given tuple {@code (t)} is not {@code null}, the
	 * fourth component value is available in the given tuple and the fourth
	 * component value of this tuple and the given tuple are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV3(@Nullable Object... t);
	
	/**
	 * Returns whether the fourth component value of this tuple and
	 * the given value are exactly equal.
	 * 
	 * <p>
	 * <b>Formula:</b>
	 * <br>
	 * {@code v(3) = value}
	 * 
	 * @param t The value to compare with.
	 * 
	 * @return
	 * <p>
	 * {@code true} - If the fourth component value of this tuple and the given
	 * value are equal.
	 * 
	 * <p>
	 * {@code false} - Otherwise.
	 */
	boolean equalsAtV3(Object value);
	
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
	 * The valid index range is from 0 to 3. The given array has to have at
	 * least four entries. It is however not required to use all indices,
	 * neither is it required that each index is only used once.
	 * 
	 * @param indices The indices of the components of this tuple in new order.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	@Override
	Tup4RObj arrangeN(int... indices);
	
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
	 * The valid index range is from 0 to 3. It is however not required to use
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
	 * @param i3
	 * The index of the old component value which will be adopted to the
	 * fourth component.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	Tup4RObj arrangeN(int i0, int i1, int i2, int i3);
	
	/**
	 * Swaps two component values at the given indices and returns the result
	 * as a new instance of the original type of this tuple, so that the value
	 * at the first given index becomes the value at the second given index and
	 * the value at the second given index becomes the value at the fist given
	 * index.
	 * 
	 * <p>
	 * The valid index range is from 0 to 3. It is however not
	 * required to use different indices.
	 * 
	 * @param indexA The index to the first component value to be swapped.
	 * @param indexB The index to the second component value to be swapped.
	 * 
	 * @return A new instance of this type of tuple with the result.
	 */
	@Override
	Tup4RObj swizzleN(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup4RObj swizzleV0V1N();
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup4RObj swizzleV0V2N();
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v3} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup4RObj swizzleV0V3N();
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup4RObj swizzleV1V2N();
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v3} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup4RObj swizzleV1V3N();
	
	/**
	 * Swaps the values of the components {@code v2} and {@code v3} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup4RObj swizzleV2V3N();
	
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
	 * The valid index range is from 0 to 3. The component at the given index in
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
	int compareAt(int index, @Nullable Tup4RObj t);
	
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
	 * The valid index range is from 0 to 3. The component at the given index in
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
	int compareAt(int index, @Nullable TupRObj t);
	
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
	 * The valid index range is from 0 to 3. The component at the given index in
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
	int compareAt(int index, @Nullable Object... t);
	
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
	 * The valid index range is from 0 to 3.
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
	int compareAt(int index, Object value);
	
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
	int compareAtV0(@Nullable Tup4RObj t);
	
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
	int compareAtV0(@Nullable TupRObj t);
	
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
	int compareAtV0(@Nullable Object... t);
	
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
	int compareAtV0(Object value);
	
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
	int compareAtV1(@Nullable Tup4RObj t);
	
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
	int compareAtV1(@Nullable TupRObj t);
	
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
	int compareAtV1(@Nullable Object... t);
	
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
	int compareAtV1(Object value);
	
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
	int compareAtV2(@Nullable Tup4RObj t);
	
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
	int compareAtV2(@Nullable TupRObj t);
	
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
	int compareAtV2(@Nullable Object... t);
	
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
	int compareAtV2(Object value);
	
	/**
     * Compares the fourth component value of this tuple with the fourth
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the fourth component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the fourth component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The fourth component in the given tuple has to be available.
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
	int compareAtV3(@Nullable Tup4RObj t);
	
	/**
     * Compares the fourth component value of this tuple with the fourth
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the fourth component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the fourth component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The fourth component in the given tuple has to be available.
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
	int compareAtV3(@Nullable TupRObj t);
	
	/**
     * Compares the fourth component value of this tuple with the fourth
     * component value of the given tuple {@code (t)}.
     * 
     * <p>
     * The sign of the returned integer value determines if the fourth component
     * value is less than (result: {@code -1}), equal to (result: {@code 0}) or
     * greater than (result: {@code 1}) the fourth component value of the given
     * tuple {@code (t)}.
     *
     * <p>
	 * The fourth component in the given tuple has to be available.
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
	int compareAtV3(@Nullable Object... t);
	
	/**
     * Compares the fourth component value of this tuple with the given value.
     * 
     * <p>
     * The sign of the returned integer value determines if the fourth component
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
	int compareAtV3(Object value);
}