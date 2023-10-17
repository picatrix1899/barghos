package org.barghos.util.iterator;

import org.barghostest.util.collection.core.consumer.Consumer;
import org.barghostest.util.collection.core.util.Validation;

/**
 * An iterator over a collection. For more details see {@link Iterator}.
 */
public interface Iterator<T> extends java.util.Iterator<T>
{
    /**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception.  Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     * 
     * <p>
     * The behavior of an iterator is unspecified if the action modifies the
     * collection in any way (even by calling the {@link #remove} method
     * or other mutator methods of {@link Iterator} subtypes),
     * unless an overriding class has specified a concurrent modification policy.
     * 
     * <p>
     * Subsequent behavior of an iterator is unspecified if the action throws an
     * exception.
     *
     * @implSpec
     * The default implementation behaves as if:
     * <pre>{@code
     *     while (hasNext())
     *         action.accept(next());
     * }</pre>
     *
     * @param action The action to be performed for each element.
     * 
     * @throws NullPointerException If the specified action is null.
     */
    default void forEachRemaining(Consumer<T> action)
    {
        Validation.validateNotNull(action);

        while (hasNext())
            action.accept(next());
    }
    
	/**
	 * Tries to skip the given number of elements and returns the actual number of skipped
	 * elements.
	 *
	 * @implSpec
     * The default implementation behaves as if {@link #next()} is repeatedly called
     * until either it was called {@code n} times or if {@link #hasNext()} had become false}.
	 *
	 * @param n The number of elements to skip.
	 * 
	 * @return The number of elements actually skipped.
	 */
	default int skip(int n)
	{
		if (n < 0) throw new IllegalArgumentException("Argument must be nonnegative: " + n);
		
		int i = 0;
		
		while (i <= n && hasNext())
		{
			next();
			
			i++;
		}
		
		return i;
	}
	
	/** {@inheritDoc} */
	@Override
    T next();
	
	/** {@inheritDoc} */
	@Override
	default void forEachRemaining(java.util.function.Consumer<? super T> action)
	{
		Validation.validateNotNull(action);
    	
        while (hasNext())
            action.accept(next());
    }
}
