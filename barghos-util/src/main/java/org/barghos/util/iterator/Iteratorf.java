package org.barghos.util.iterator;

import java.util.NoSuchElementException;

import org.barghostest.util.collection.core.consumer.Consumer;
import org.barghostest.util.collection.core.consumer.Consumerf;
import org.barghostest.util.collection.core.util.Validation;

/**
 * An iterator over a float collection that can work with the primitive values instead of
 * boxed ones. For more details see {@link Iterator}.
 */
public interface Iteratorf extends Iterator<Float>
{
	/**
     * Returns the next element in the iteration.
     *
     * @return The next element in the iteration.
     *
     * @throws NoSuchElementException If the iteration has no more elements.
     */
    float nextFloat();

	/**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception.  Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     * 
     * <p>
     * The behavior of an iterator is unspecified if the action modifies the
     * collection in any way (even by calling the {@link #remove} method
     * or other mutator methods of {@link FloatIterator} subtypes),
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
	default void forEachRemaining(Consumerf action)
	{
		Validation.validateNotNull(action);
        
        while (hasNext())
            action.acceptFloat(nextFloat());
	}
	
	/**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link nextFloat} instead.
     */
	@Override
    @Deprecated
	default Float next()
	{
		return nextFloat();
	}
	
	/** {@inheritDoc} */
	@Override
	default void forEachRemaining(Consumer<Float> action)
	{
		Validation.validateNotNull(action);
        
        while (hasNext())
            action.accept(nextFloat());
	}
	
	/** {@inheritDoc} */
	@Override
	default int skip(int n)
	{
		if (n < 0) throw new IllegalArgumentException("Argument must be nonnegative: " + n);
		
		int i = 0;
		
		while (i <= n && hasNext())
		{
			nextFloat();
			
			i++;
		}
		
		return i;
	}
	
	/** {@inheritDoc} */
	@Override
	default void forEachRemaining(java.util.function.Consumer<? super Float> action)
	{
		Validation.validateNotNull(action);
    	
        while (hasNext())
            action.accept(nextFloat());
    }
}