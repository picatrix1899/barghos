package org.barghos.util.tuple.chars;

import org.barghos.annotation.ExtractionParam;
import org.barghos.annotation.Nullable;

/**
 * This interface provides non-modifying operations for char tuples with 
 * three components. Therefore the operations of this interface will not alter
 * the component values of this tuple.
 */
public interface Tup3RC extends FixTupRC
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
	Tup3RC createNew(Tup3RC t);
	
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
	Tup3RC createNew(TupRC t);
	
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
	Tup3RC createNew(char... t);
	
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
	Tup3RC createNew(char value);
	
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
	Tup3RC createNew(char v0, char v1, char v2);
	
	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * For any derivative or implementation of {@link Tup3RC} this will
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
	char v0();
	
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
	char v1();
	
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
	char v2();
	
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
	char getAt(int index);
	
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
	char[] toArray();
	
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
	char[] toArray(@ExtractionParam char[] res);
	
	/** {@inheritDoc} */
	@Override
	Tup3RC copy();
	
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
	boolean equals(@Nullable Tup3RC t);
	
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
	boolean equals(@Nullable TupRC t);
	
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
	boolean equals(@Nullable char... t);
	
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
	boolean equals(char v0, char v1, char v2);
	
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
	boolean equalsAt(int index, @Nullable Tup3RC t);
	
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
	boolean equalsAt(int index, @Nullable TupRC t);
	
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
	boolean equalsAt(int index, @Nullable char... t);
	
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
	boolean equalsAt(int index, char value);
	
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
	boolean equalsAtV0(@Nullable Tup3RC t);
	
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
	boolean equalsAtV0(@Nullable TupRC t);
	
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
	boolean equalsAtV0(@Nullable char... t);
	
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
	boolean equalsAtV0(char value);
	
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
	boolean equalsAtV1(@Nullable Tup3RC t);
	
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
	boolean equalsAtV1(@Nullable TupRC t);
	
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
	boolean equalsAtV1(@Nullable char... t);
	
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
	boolean equalsAtV1(char value);
	
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
	boolean equalsAtV2(@Nullable Tup3RC t);
	
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
	boolean equalsAtV2(@Nullable TupRC t);
	
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
	boolean equalsAtV2(@Nullable char... t);
	
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
	boolean equalsAtV2(char value);
	
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
	Tup3RC arrangeN(int... indices);
	
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
	Tup3RC arrangeN(int i0, int i1, int i2);
	
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
	Tup3RC swizzleN(int indexA, int indexB);
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v1} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup3RC swizzleV0V1N();
	
	/**
	 * Swaps the values of the components {@code v0} and {@code v2} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup3RC swizzleV0V2N();
	
	/**
	 * Swaps the values of the components {@code v1} and {@code v2} and returns
	 * the result as a new instance of the type of this tuple.
	 * 
	 * @return A new instance of the type of this tuple with the result.
	 */
	Tup3RC swizzleV1V2N();
	
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
	int compareAt(int index, Tup3RC t);
	
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
	int compareAt(int index, TupRC t);
	
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
	int compareAt(int index, char... t);
	
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
	int compareAt(int index, char value);
	
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
	int compareAtV0(Tup3RC t);
	
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
	int compareAtV0(TupRC t);
	
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
	int compareAtV0(char... t);
	
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
	int compareAtV0(char value);
	
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
	int compareAtV1(Tup3RC t);
	
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
	int compareAtV1(TupRC t);
	
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
	int compareAtV1(char... t);
	
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
	int compareAtV1(char value);
	
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
	int compareAtV2(Tup3RC t);
	
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
	int compareAtV2(TupRC t);
	
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
	int compareAtV2(char... t);
	
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
	int compareAtV2(char value);
}