package org.barghos.util.iterator;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * An iterator for double lists that allows the programmer
 * to traverse the list in either direction, modify
 * the list during iteration, and obtain the iterator's
 * current position in the list. For more details see
 * {@link ListIterator}.
 * 
 * <p>
 * The {@link DoubleListIterator} works with the primitive values instead of
 * boxed ones.
 */
public interface DoubleListIterator extends ListIterator<Double>, DoubleIterator
{
	/**
	 * Returns the previous element in the list and moves the cursor
	 * position backwards.  This method may be called repeatedly to
	 * iterate through the list backwards, or intermixed with calls to
	 * {@link #nextDouble} to go back and forth. (Note that alternating calls
	 * to {@link #nextDouble} and {@link #previousDouble} will return the same
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
	double previousDouble();
	
	/**
	 * Replaces the last element returned by {@link #nextDouble} or
	 * {@link #previousDouble} with the specified element (optional operation).
	 * This call can be made only if neither {@link #remove} nor {@link
	 * #insertDouble} have been called after the last call to {@link #nextDouble} or
	 * {@link #previousDouble}.
	 * 
	 * <p>
	 * Unlike {@link #set} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value with which to replace the last value returned by
	 *		  {@link #nextDouble} or {@link #previousDouble}.
	 *		  
	 * @throws UnsupportedOperationException If the {@link #setDouble} operation
	 *		 is not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of the specified
	 *		 element prevents it from being added to this list.
	 * @throws IllegalStateException If neither {@link #nextDouble} nor
	 *		 {@link #previousDouble} have been called, or {@link #remove} or
	 *		 {@link #insertDouble} have been called after the last call to
	 *		 {@link #nextDouble} or {@link #previousDouble}.
	 */
	void setDouble(double value);
	
	/**
	 * Inserts the specified element into the list (optional operation).
	 * The element is inserted immediately before the element that
	 * would be returned by {@link #nextDouble}, if any, and after the element
	 * that would be returned by {@link #previousDouble}, if any.  (If the
	 * list contains no elements, the new element becomes the sole element
	 * on the list.)  The new element is inserted before the implicit
	 * cursor: a subsequent call to {@link #nextDouble} would be unaffected, and a
	 * subsequent call to {@link #previousDouble} would return the new element.
	 * (This call increases by one the value that would be returned by a
	 * call to {@code nextIndex} or {@code previousIndex}).
	 *
	 * <p>
	 * Unlike {@link #add} this uses the primitive value instead of the boxed ones.
	 *
	 * @param value The value to insert.
	 * 
	 * @throws UnsupportedOperationException If the {@link #insertDouble} method is
	 *		 not supported by this list iterator.
	 * @throws IllegalArgumentException If some aspect of this element
	 *		 prevents it from being added to this list.
	 */
	void insertDouble(double value);
	
	/** {@inheritDoc} */
	@Override
	default Double next()
	{
		return nextDouble();
	}

	/** {@inheritDoc} */
	@Override
	default Double previous()
	{
		return previousDouble();
	}

	/** {@inheritDoc} */
	@Override
	default void set(Double e)
	{
		setDouble(e);
	}

	/** {@inheritDoc} */
	@Override
	default void add(Double e)
	{
		insertDouble(e);
	}
}