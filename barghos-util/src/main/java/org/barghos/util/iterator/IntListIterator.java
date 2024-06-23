package org.barghos.util.iterator;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * An iterator for integer lists that allows the programmer
 * to traverse the list in either direction, modify
 * the list during iteration, and obtain the iterator's
 * current position in the list. For more details see
 * {@link ListIterator}.
 * 
 * <p>
 * The {@link IntListIterator} works with the primitive values instead of
 * boxed ones.
 */
public interface IntListIterator extends ListIterator<Integer>, IntIterator
{
	/**
	 * Returns the previous element in the list and moves the cursor
	 * position backwards.  This method may be called repeatedly to
	 * iterate through the list backwards, or intermixed with calls to
	 * {@link #nextInt} to go back and forth. (Note that alternating calls
	 * to {@link #nextInt} and {@link #previousInt} will return the same
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
	int previousInt();
	
	/**
	 * Replaces the last element returned by {@link #nextInt} or
	 * {@link #previousInt} with the specified element (optional operation).
	 * This call can be made only if neither {@link #remove} nor {@link
	 * #insertInt} have been called after the last call to {@link #nextInt} or
	 * {@link #previousInt}.
	 * 
	 * <p>
	 * Unlike {@link #set} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value with which to replace the last value returned by
	 *		  {@link #nextInt} or {@link #previousInt}.
	 *		  
	 * @throws UnsupportedOperationException If the {@link #setInt} operation
	 *		 is not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of the specified
	 *		 element prevents it from being added to this list.
	 * @throws IllegalStateException If neither {@link #nextInt} nor
	 *		 {@link #previousInt} have been called, or {@link #remove} or
	 *		 {@link #insertInt} have been called after the last call to
	 *		 {@link #nextInt} or {@link #previousInt}.
	 */
	void setInt(int value);
	
	/**
	 * Inserts the specified element into the list (optional operation).
	 * The element is inserted immediately before the element that
	 * would be returned by {@link #nextInt}, if any, and after the element
	 * that would be returned by {@link #previousInt}, if any.  (If the
	 * list contains no elements, the new element becomes the sole element
	 * on the list.)  The new element is inserted before the implicit
	 * cursor: a subsequent call to {@link #nextInt} would be unaffected, and a
	 * subsequent call to {@link #previousInt} would return the new element.
	 * (This call increases by one the value that would be returned by a
	 * call to {@code nextIndex} or {@code previousIndex}).
	 *
	 * <p>
	 * Unlike {@link #add} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value to insert.
	 * 
	 * @throws UnsupportedOperationException If the {@link #insertInt} method is
	 *		 not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of this element
	 *		 prevents it from being added to this list.
	 */
	void insertInt(int value);
	
	/** {@inheritDoc} */
	@Override
	default Integer next()
	{
		return nextInt();
	}

	/** {@inheritDoc} */
	@Override
	default Integer previous()
	{
		return previousInt();
	}

	/** {@inheritDoc} */
	@Override
	default void set(Integer e)
	{
		setInt(e);
	}

	/** {@inheritDoc} */
	@Override
	default void add(Integer e)
	{
		insertInt(e);
	}
}