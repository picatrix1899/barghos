package org.barghos.util.iterator;

import org.barghostest.util.collection.core.consumer.Consumer;
import org.barghostest.util.collection.core.util.Validation;

public interface Iterable<T> extends java.lang.Iterable<T>
{
	/** {@inheritDoc} */
	@Override
    Iterator<T> iterator();

    /**
     * Performs the given action for each element of the {@code Iterable}
     * until all elements have been processed or the action throws an
     * exception.  Actions are performed in the order of iteration, if that
     * order is specified.  Exceptions thrown by the action are relayed to the
     * caller.
     * <p>
     * The behavior of this method is unspecified if the action performs
     * side-effects that modify the underlying source of elements, unless an
     * overriding class has specified a concurrent modification policy.
     *
     * @implSpec
     * <p>The default implementation behaves as if:
     * <pre>{@code
     *     for (T t : this)
     *         action.accept(t);
     * }</pre>
     *
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified action is null
     */
    default void forEach(Consumer<T> action)
    {
    	Validation.validateNotNull(action);
    	
        for (T t : this) {
            action.accept(t);
        }
    }
    
    /** {@inheritDoc} */
	@Override
    default void forEach(java.util.function.Consumer<? super T> action) {
		Validation.validateNotNull(action);
		
        for (T t : this) {
            action.accept(t);
        }
    }
}
