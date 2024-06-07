package org.barghos.util.iterator;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an object that supports iterating over its entries. This interface
 * marks possible targets for 'for-each-loops'.
 * 
 * @param <T> The type of returned elements.
 */
@FunctionalInterface
public interface Iterable<T> extends java.lang.Iterable<T>
{
	/** {@inheritDoc} */
	@Override
    Iterator<T> iterator();

    /**
     * Performs the given action for each element of the {@link Iterable}
     * until all elements have been processed or the action throws an
     * exception. Actions are performed in the order of iteration, if that
     * order is specified.
     * 
     * <p>
     * The behavior of this method is unspecified if the action performs
     * side-effects that modify the underlying source of elements, unless an
     * overriding class has specified a concurrent modification policy.
     *
     * @param action The action to be performed for each element.
     */
    default void forEach(Consumer<T> action)
    {
    	ParameterValidation.pvNotNull("action", action);
    	
        for (T t : this)
        {
            action.accept(t);
        }
    }
    
    /** {@inheritDoc} */
	@Override
    default void forEach(java.util.function.Consumer<? super T> action)
	{
		ParameterValidation.pvNotNull("action", action);
		
        for (T t : this)
        {
            action.accept(t);
        }
    }
}
