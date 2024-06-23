package org.barghos.util.iterator;

import java.math.BigDecimal;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * An iterator for {@link BigDecimal} lists that allows the programmer
 * to traverse the list in either direction, modify
 * the list during iteration, and obtain the iterator's
 * current position in the list. For more details see
 * {@link ListIterator}.
 * 
 * <p>
 * The {@link BigDecListIterator} works with the primitive values instead of
 * boxed ones.
 */
public interface BigDecListIterator extends ListIterator<BigDecimal>, BigDecIterator
{
	/**
	 * Returns the previous element in the list and moves the cursor
	 * position backwards.  This method may be called repeatedly to
	 * iterate through the list backwards, or intermixed with calls to
	 * {@link #nextBigDec} to go back and forth. (Note that alternating calls
	 * to {@link #nextBigDec} and {@link #previousBigDec} will return the same
	 * element repeatedly.)
	 * 
	 * <p>
	 * Unlike {@link #previous} this returns the primitive value instead of the boxed ones.
	 *
	 * @return The previous element in the list.
	 * 
	 * @throws NoSuchElementException If the iteration has no previous
	 *		 values.
	 */
	BigDecimal previousBigDec();
	
	/**
	 * Replaces the last element returned by {@link #nextBigDec} or
	 * {@link #previousBigDec} with the specified element (optional operation).
	 * This call can be made only if neither {@link #remove} nor {@link
	 * #insertBigDec} have been called after the last call to {@link #nextBigDec} or
	 * {@link #previousBigDec}.
	 * 
	 * <p>
	 * Unlike {@link #set} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value with which to replace the last value returned by
	 *		  {@link #nextBigDec} or {@link #previousBigDec}.
	 *		  
	 * @throws UnsupportedOperationException If the {@link #setBigDec} operation
	 *		 is not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of the specified
	 *		 element prevents it from being added to this list.
	 * @throws IllegalStateException If neither {@link #nextBigDec} nor
	 *		 {@link #previousBigDec} have been called, or {@link #remove} or
	 *		 {@link #insertBigDec} have been called after the last call to
	 *		 {@link #nextBigDec} or {@link #previousBigDec}.
	 */
	void setBigDec(BigDecimal value);
	
	/**
	 * Inserts the specified element into the list (optional operation).
	 * The element is inserted immediately before the element that
	 * would be returned by {@link #nextBigDec}, if any, and after the element
	 * that would be returned by {@link #previousBigDec}, if any.  (If the
	 * list contains no elements, the new element becomes the sole element
	 * on the list.)  The new element is inserted before the implicit
	 * cursor: a subsequent call to {@link #nextBigDec} would be unaffected, and a
	 * subsequent call to {@link #previousBigDec} would return the new element.
	 * (This call increases by one the value that would be returned by a
	 * call to {@code nextIndex} or {@code previousIndex}).
	 *
	 * <p>
	 * Unlike {@link #add} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value to insert.
	 * 
	 * @throws UnsupportedOperationException If the {@link #insertBigDec} method is
	 *		 not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of this element
	 *		 prevents it from being added to this list.
	 */
	void insertBigDec(BigDecimal value);
	
	/** {@inheritDoc} */
	@Override
	default BigDecimal next()
	{
		return nextBigDec();
	}

	/** {@inheritDoc} */
	@Override
	default BigDecimal previous()
	{
		return previousBigDec();
	}

	/** {@inheritDoc} */
	@Override
	default void set(BigDecimal e)
	{
		setBigDec(e);
	}

	/** {@inheritDoc} */
	@Override
	default void add(BigDecimal e)
	{
		insertBigDec(e);
	}
}