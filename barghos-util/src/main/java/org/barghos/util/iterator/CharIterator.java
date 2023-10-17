package org.barghos.util.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.barghostest.util.collection.core.consumer.CharMonoConsumer;
import org.barghostest.util.collection.core.util.Validation;

/**
 * An iterator over a character collection that can work with the primitive values instead of
 * boxed ones. For more details see {@link Iterator}.
 */
public interface CharIterator
{
	/**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    boolean hasNext();
	
	/**
     * Returns the next value in the iteration.
     *
     * @return The next value in the iteration.
     * 
     * @throws NoSuchElementException If the iteration has no more values.
     */
	char next();
	
	/**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation). This method can be called
     * only once per call to {@link #next}.
     * 
     * <p>
     * The behavior of an iterator is unspecified if the underlying collection
     * is modified while the iteration is in progress in any way other than by
     * calling this method, unless an overriding class has specified a
     * concurrent modification policy.
     * 
     * <p>
     * The behavior of an iterator is unspecified if this method is called
     * after a call to the {@link #forEachRemaining} method.
     *
     * @implSpec
     * The default implementation throws an instance of
     * {@link UnsupportedOperationException} and performs no other action.
     *
     * @throws UnsupportedOperationException If the {@link #remove}
     *         operation is not supported by this iterator.
     *
     * @throws IllegalStateException If the {@link #next} method has not
     *         yet been called, or the {@link #remove} method has already
     *         been called after the last call to the {@link #next}.
     *         method.
     */
    default void remove()
    {
        throw new UnsupportedOperationException("remove");
    }
	
	/**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception.  Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     * 
     * <p>
     * The behavior of an iterator is unspecified if the action modifies the
     * collection in any way (even by calling the {@link #remove} method
     * or other mutator methods of {@link CharIterator} subtypes),
     * unless an overriding class has specified a concurrent modification policy.
     * 
     * <p>
     * Subsequent behavior of an iterator is unspecified if the action throws an
     * exception.
     *
     * <p>
     * Unlike {@link #forEachRemaining} this works with primitive values instead of the boxed ones.
     *
     * @implSpec
     * The default implementation behaves as if:
     * 
     * <pre>{@code
     *     while (hasNext())
     *         action.accept(next());
     * }</pre>
     *
     * @param action The action to be performed for each value.
     * 
     * @throws NullPointerException If the specified action is null.
     */
	default void forEachRemaining(CharMonoConsumer action)
	{
		Validation.validateNotNull(action);
        
        while (hasNext())
            action.accept(next());
	}
}