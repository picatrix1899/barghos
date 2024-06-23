package org.barghos.util.iterator;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * An iterator for string lists that allows the programmer
 * to traverse the list in either direction, modify
 * the list during iteration, and obtain the iterator's
 * current position in the list. For more details see
 * {@link ListIterator}.
 * 
 * <p>
 * The {@link StringListIterator} works with the primitive values instead of
 * boxed ones.
 */
public interface StringListIterator extends ListIterator<String>, StringIterator
{
	/**
	 * Returns the previous element in the list and moves the cursor
	 * position backwards.  This method may be called repeatedly to
	 * iterate through the list backwards, or intermixed with calls to
	 * {@link #nextString} to go back and forth. (Note that alternating calls
	 * to {@link #nextString} and {@link #previousString} will return the same
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
	String previousString();
	
	/**
	 * Replaces the last element returned by {@link #nextString} or
	 * {@link #previousString} with the specified element (optional operation).
	 * This call can be made only if neither {@link #remove} nor {@link
	 * #insertString} have been called after the last call to {@link #nextString} or
	 * {@link #previousString}.
	 * 
	 * <p>
	 * Unlike {@link #set} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value with which to replace the last value returned by
	 *		  {@link #nextString} or {@link #previousString}.
	 *		  
	 * @throws UnsupportedOperationException If the {@link #setString} operation
	 *		 is not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of the specified
	 *		 element prevents it from being added to this list.
	 * @throws IllegalStateException If neither {@link #nextString} nor
	 *		 {@link #previousString} have been called, or {@link #remove} or
	 *		 {@link #insertString} have been called after the last call to
	 *		 {@link #nextString} or {@link #previousString}.
	 */
	void setString(String value);
	
	/**
	 * Inserts the specified element into the list (optional operation).
	 * The element is inserted immediately before the element that
	 * would be returned by {@link #nextString}, if any, and after the element
	 * that would be returned by {@link #previousString}, if any.  (If the
	 * list contains no elements, the new element becomes the sole element
	 * on the list.)  The new element is inserted before the implicit
	 * cursor: a subsequent call to {@link #nextString} would be unaffected, and a
	 * subsequent call to {@link #previousString} would return the new element.
	 * (This call increases by one the value that would be returned by a
	 * call to {@code nextIndex} or {@code previousIndex}).
	 *
	 * <p>
	 * Unlike {@link #add} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value to insert.
	 * 
	 * @throws UnsupportedOperationException If the {@link #insertString} method is
	 *		 not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of this element
	 *		 prevents it from being added to this list.
	 */
	void insertString(String value);
	
	/** {@inheritDoc} */
	@Override
	default String next()
	{
		return nextString();
	}

	/** {@inheritDoc} */
	@Override
	default String previous()
	{
		return previousString();
	}

	/** {@inheritDoc} */
	@Override
	default void set(String e)
	{
		setString(e);
	}

	/** {@inheritDoc} */
	@Override
	default void add(String e)
	{
		insertString(e);
	}
}