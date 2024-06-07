package org.barghos.util.iterator.floats;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.floats.ConsumerF;
import org.barghos.util.iterator.Iterator;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an iterator over a float collection.
 */
public interface IteratorF extends Iterator<Float>
{
	/**
     * Returns the next element in the iteration.
     *
     * @return The next element in the iteration.
     */
    float nextFloat();

    /**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception. Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     * 
     * <p>
     * The behavior of an iterator is unspecified if the action modifies the
     * collection in any way (even by calling the {@link #remove} method
     * or other mutator methods of {@link Iterator} subtypes), unless an
     * overriding class has specified a concurrent modification policy.
     * 
     * <p>
     * Subsequent behavior of an iterator is unspecified if the action throws an
     * exception.
     *
     * @param action The action to be performed for each element.
     */
	default void forEachRemaining(ConsumerF action)
	{
		ParameterValidation.pvNotNull("action", action);

        while (hasNext())
        {
        	action.acceptFloat(nextFloat());
        }
	}
	
	/**
     * @deprecated
     * Use {@link #nextFloat()} instead.
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
		ParameterValidation.pvNotNull("action", action);

        while (hasNext())
        {
        	action.accept(nextFloat());
        }
	}
	
	/** {@inheritDoc} */
	@Override
	default int skip(int n)
	{
		ParameterValidation.pvMin("n", n, 0);
		
		int i = 0;
		
		while (i < n && hasNext())
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
		ParameterValidation.pvNotNull("action", action);
    	
        while (hasNext())
        {
        	action.accept(nextFloat());
        } 
    }
}