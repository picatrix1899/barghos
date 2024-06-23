package org.barghos.util.iterator;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * An iterator for object lists that allows the programmer
 * to traverse the list in either direction, modify
 * the list during iteration, and obtain the iterator's
 * current position in the list. For more details see
 * {@link ListIterator}.
 * 
 * <p>
 * The {@link ObjectListIterator} works with the primitive values instead of
 * boxed ones.
 */
public interface ObjectListIterator extends ListIterator<Object>, ObjectIterator
{
	/**
	 * Returns the previous element in the list and moves the cursor
	 * position backwards.  This method may be called repeatedly to
	 * iterate through the list backwards, or intermixed with calls to
	 * {@link #nextObject} to go back and forth. (Note that alternating calls
	 * to {@link #nextObject} and {@link #previousObject} will return the same
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
	Object previousObject();
	
	/**
	 * Replaces the last element returned by {@link #nextObject} or
	 * {@link #previousObject} with the specified element (optional operation).
	 * This call can be made only if neither {@link #remove} nor {@link
	 * #insertObject} have been called after the last call to {@link #nextObject} or
	 * {@link #previousObject}.
	 * 
	 * <p>
	 * Unlike {@link #set} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value with which to replace the last value returned by
	 *		  {@link #nextObject} or {@link #previousObject}.
	 *		  
	 * @throws UnsupportedOperationException If the {@link #setObject} operation
	 *		 is not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of the specified
	 *		 element prevents it from being added to this list.
	 * @throws IllegalStateException If neither {@link #nextObject} nor
	 *		 {@link #previousObject} have been called, or {@link #remove} or
	 *		 {@link #insertObject} have been called after the last call to
	 *		 {@link #nextObject} or {@link #previousObject}.
	 */
	void setObject(Object value);
	
	/**
	 * Inserts the specified element into the list (optional operation).
	 * The element is inserted immediately before the element that
	 * would be returned by {@link #nextObject}, if any, and after the element
	 * that would be returned by {@link #previousObject}, if any.  (If the
	 * list contains no elements, the new element becomes the sole element
	 * on the list.)  The new element is inserted before the implicit
	 * cursor: a subsequent call to {@link #nextObject} would be unaffected, and a
	 * subsequent call to {@link #previousObject} would return the new element.
	 * (This call increases by one the value that would be returned by a
	 * call to {@code nextIndex} or {@code previousIndex}).
	 *
	 * <p>
	 * Unlike {@link #add} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value to insert.
	 * 
	 * @throws UnsupportedOperationException If the {@link #insertObject} method is
	 *		 not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of this element
	 *		 prevents it from being added to this list.
	 */
	void insertObject(Object value);
	
	/** {@inheritDoc} */
	@Override
	default Object next()
	{
		return nextObject();
	}

	/** {@inheritDoc} */
	@Override
	default Object previous()
	{
		return previousObject();
	}

	/** {@inheritDoc} */
	@Override
	default void set(Object e)
	{
		setObject(e);
	}

	/** {@inheritDoc} */
	@Override
	default void add(Object e)
	{
		insertObject(e);
	}
}