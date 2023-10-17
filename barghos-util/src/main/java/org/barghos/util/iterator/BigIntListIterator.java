package org.barghos.util.iterator;

import java.math.BigInteger;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * An iterator for {@link BigInteger} lists that allows the programmer
 * to traverse the list in either direction, modify
 * the list during iteration, and obtain the iterator's
 * current position in the list. For more details see
 * {@link ListIterator}.
 * 
 * <p>
 * The {@link BigIntListIterator} works with the primitive values instead of
 * boxed ones.
 */
public interface BigIntListIterator extends ListIterator<BigInteger>, BigIntIterator
{
	/**
     * Returns the previous element in the list and moves the cursor
     * position backwards.  This method may be called repeatedly to
     * iterate through the list backwards, or intermixed with calls to
     * {@link #nextBigInt} to go back and forth. (Note that alternating calls
     * to {@link #nextBigInt} and {@link #previousBigInt} will return the same
     * element repeatedly.)
     * 
     * <p>
     * Unlike {@link #previous} this returns the primitive value instead of the boxed ones.
     *
     * @return The previous element in the list.
     * 
     * @throws NoSuchElementException If the iteration has no previous
     *         values.
     */
	BigInteger previousBigInt();
	
	/**
     * Replaces the last element returned by {@link #nextBigInt} or
     * {@link #previousBigInt} with the specified element (optional operation).
     * This call can be made only if neither {@link #remove} nor {@link
     * #insertBigInt} have been called after the last call to {@link #nextBigInt} or
     * {@link #previousBigInt}.
     * 
     * <p>
     * Unlike {@link #set} this uses the primitive value instead of the boxed ones.
     *
     * @param value The value with which to replace the last value returned by
     *          {@link #nextBigInt} or {@link #previousBigInt}.
     *          
     * @throws UnsupportedOperationException If the {@link #setBigInt} operation
     *         is not supported by this list iterator.
     * @throws IllegalArgumentException If some aspect of the specified
     *         element prevents it from being added to this list.
     * @throws IllegalStateException If neither {@link #nextBigInt} nor
     *         {@link #previousBigInt} have been called, or {@link #remove} or
     *         {@link #insertBigInt} have been called after the last call to
     *         {@link #nextBigInt} or {@link #previousBigInt}.
     */
	void setBigInt(BigInteger value);
	
	/**
     * Inserts the specified element into the list (optional operation).
     * The element is inserted immediately before the element that
     * would be returned by {@link #nextBigInt}, if any, and after the element
     * that would be returned by {@link #previousBigInt}, if any.  (If the
     * list contains no elements, the new element becomes the sole element
     * on the list.)  The new element is inserted before the implicit
     * cursor: a subsequent call to {@link #nextBigInt} would be unaffected, and a
     * subsequent call to {@link #previousBigInt} would return the new element.
     * (This call increases by one the value that would be returned by a
     * call to {@code nextIndex} or {@code previousIndex}).
     *
     * <p>
     * Unlike {@link #add} this uses the primitive value instead of the boxed ones.
     *
     * @param value The value to insert.
     * 
     * @throws UnsupportedOperationException If the {@link #insertBigInt} method is
     *         not supported by this list iterator.
     * @throws IllegalArgumentException If some aspect of this element
     *         prevents it from being added to this list.
     */
	void insertBigInt(BigInteger value);
	
	/** {@inheritDoc} */
	@Override
    default BigInteger next()
    {
		return nextBigInt();
    }

	/** {@inheritDoc} */
	@Override
    default BigInteger previous()
    {
		return previousBigInt();
    }

	/** {@inheritDoc} */
	@Override
    default void set(BigInteger e)
    {
		setBigInt(e);
    }

	/** {@inheritDoc} */
	@Override
    default void add(BigInteger e)
    {
		insertBigInt(e);
    }
}