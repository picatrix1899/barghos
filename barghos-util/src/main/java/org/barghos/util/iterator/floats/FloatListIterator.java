package org.barghos.util.iterator.floats;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * An iterator for float lists that allows the programmer
 * to traverse the list in either direction, modify
 * the list during iteration, and obtain the iterator's
 * current position in the list. For more details see
 * {@link ListIterator}.
 * 
 * <p>
 * The {@link FloatListIterator} works with the primitive values instead of
 * boxed ones.
 */
public interface FloatListIterator extends ListIterator<Float>, FloatIterator
{
	/**
	 * Returns the previous element in the list and moves the cursor
	 * position backwards.  This method may be called repeatedly to
	 * iterate through the list backwards, or intermixed with calls to
	 * {@link #nextFloat} to go back and forth. (Note that alternating calls
	 * to {@link #nextFloat} and {@link #previousFloat} will return the same
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
	float previousFloat();
	
	/**
	 * Replaces the last element returned by {@link #nextFloat} or
	 * {@link #previousFloat} with the specified element (optional operation).
	 * This call can be made only if neither {@link #remove} nor {@link
	 * #insertFloat} have been called after the last call to {@link #nextFloat} or
	 * {@link #previousFloat}.
	 * 
	 * <p>
	 * Unlike {@link #set} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value with which to replace the last value returned by
	 *		  {@link #nextFloat} or {@link #previousFloat}.
	 *		  
	 * @throws UnsupportedOperationException If the {@link #setFloat} operation
	 *		 is not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of the specified
	 *		 element prevents it from being added to this list.
	 * @throws IllegalStateException If neither {@link #nextFloat} nor
	 *		 {@link #previousFloat} have been called, or {@link #remove} or
	 *		 {@link #insertFloat} have been called after the last call to
	 *		 {@link #nextFloat} or {@link #previousFloat}.
	 */
	void setFloat(float value);
	
	/**
	 * Inserts the specified element into the list (optional operation).
	 * The element is inserted immediately before the element that
	 * would be returned by {@link #nextFloat}, if any, and after the element
	 * that would be returned by {@link #previousFloat}, if any.  (If the
	 * list contains no elements, the new element becomes the sole element
	 * on the list.)  The new element is inserted before the implicit
	 * cursor: a subsequent call to {@link #nextFloat} would be unaffected, and a
	 * subsequent call to {@link #previousFloat} would return the new element.
	 * (This call increases by one the value that would be returned by a
	 * call to {@code nextIndex} or {@code previousIndex}).
	 *
	 * <p>
	 * Unlike {@link #add} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value to insert.
	 * 
	 * @throws UnsupportedOperationException If the {@link #insertFloat} method is
	 *		 not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of this element
	 *		 prevents it from being added to this list.
	 */
	void insertFloat(float value);
	
	/** {@inheritDoc} */
	@Override
	default Float next()
	{
		return nextFloat();
	}

	/** {@inheritDoc} */
	@Override
	default Float previous()
	{
		return previousFloat();
	}

	/** {@inheritDoc} */
	@Override
	default void set(Float e)
	{
		setFloat(e);
	}

	/** {@inheritDoc} */
	@Override
	default void add(Float e)
	{
		insertFloat(e);
	}
}