package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 1-dimensional object array input
 * arguments and returns no result. {@link Consumer2OA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptObjectArray}.
 * 
 * @see ConsumerOA
 * @see ConsumerExOA
 * @see Consumer2OA
 * @see ConsumerEx2OA
 * @see Consumer3OA
 * @see ConsumerEx3OA
 * @see Consumer4OA
 * @see ConsumerEx4OA
 */
@FunctionalInterface
public interface Consumer2OA extends Consumer2<Object[],Object[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptObjectArray(Object[] a, Object[] b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2OA} performing this operation and the
     * operation after.
     */
    default Consumer2OA thenObject(Consumer2OA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptObjectArray(a, b); after.acceptObjectArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2OA} performing this operation and the
     * operations after.
     */
	default Consumer2OA thenObject(Consumer2OA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptObjectArray(a, b); after[0].acceptObjectArray(a, b);};

    	return (a, b) -> {acceptObjectArray(a, b); for(Consumer2OA consumer : after) consumer.acceptObjectArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2OA} performing the operation before and this
     * operation.
     */
    default Consumer2OA beforeObject(Consumer2OA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptObjectArray(a, b); acceptObjectArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2OA} performing the operations before and
     * this operation.
     */
    default Consumer2OA beforeObject(Consumer2OA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptObjectArray(a, b); acceptObjectArray(a, b);};
    	
    	return (a, b) -> {for(Consumer2OA consumer : before) consumer.acceptObjectArray(a, b); acceptObjectArray(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2OA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2OA} performing the operations.
     */
	static Consumer2OA sequenceObject(Consumer2OA... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(Consumer2OA consumer : consumers) consumer.acceptObjectArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObjectArray} instead.
     */
    @Override
    @Deprecated
    default void accept(Object[] a, Object[] b)
    {
    	acceptObjectArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2OA} performing this operation and the
     * operation after.
     */
    default Consumer2OA then(Consumer2<Object[],Object[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2OA)
    	{
    		final Consumer2OA originalAfter = (Consumer2OA)after;
    		
    		return (a, b) -> {acceptObjectArray(a, b); originalAfter.acceptObjectArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptObjectArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2OA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2OA then(Consumer2<Object[],Object[]>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	/*
    	 * If exactly one operation is passed try to optimize.
    	 */
    	if(after.length == 1)
    	{
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof Consumer2OA)
        	{
        		final Consumer2OA originalAfter = (Consumer2OA)after[0];
        		
        		return (a, b) -> {acceptObjectArray(a, b); originalAfter.acceptObjectArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptObjectArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptObjectArray(a, b);
			
    		for(Consumer2<Object[],Object[]> consumer : after)
    		{
    			if(consumer instanceof Consumer2OA)
    				((Consumer2OA)consumer).acceptObjectArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2OA} performing the operation before and this
     * operation.
     */
    default Consumer2OA before(Consumer2<Object[],Object[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2OA)
    	{
    		final Consumer2OA originalBefore = (Consumer2OA)before;
    		
    		return (a, b) -> {originalBefore.acceptObjectArray(a, b); acceptObjectArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptObjectArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2OA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2OA before(Consumer2<Object[],Object[]>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	/*
    	 * If exactly one operation is passed try to optimize.
    	 */
    	if(before.length == 1)
    	{
    		/*
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof Consumer2OA)
        	{
        		final Consumer2OA originalBefore = (Consumer2OA)before[0];
        		
        		return (a, b) -> {originalBefore.acceptObjectArray(a, b); acceptObjectArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptObjectArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Object[],Object[]> consumer : before)
    		{
    			if(consumer instanceof Consumer2OA)
    				((Consumer2OA)consumer).acceptObjectArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptObjectArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2OA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2OA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2OA sequence(Consumer2<Object[],Object[]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly
    	 * without wrapping. Otherwise wrap the original operation in an
    	 * operation of the desired type. The optimization prevents unnecessary
    	 * auto-boxing if possible and also unnecessary creation of a new
    	 * operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer2OA)
    			return (Consumer2OA) consumers[0];
    		else
    			return (Consumer2OA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Object[],Object[]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2OA)
    				((Consumer2OA)consumer).acceptObjectArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2OA andThen(java.util.function.BiConsumer<? super Object[],? super Object[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptObjectArray(a, b); after.accept(a, b);};
    }
}
