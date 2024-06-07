package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 1-dimensional object array input
 * arguments and returns no result. Unlike {@link Consumer3OA} this may throw
 * exceptions. {@link ConsumerEx3OA} is expected to operate via side-effects.
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
public interface ConsumerEx3OA extends ConsumerEx3<Object[],Object[],Object[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptObjectArray(Object[] a, Object[] b, Object[] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3OA} performing this operation and the
     * operation after.
     */
    default ConsumerEx3OA thenObject(ConsumerEx3OA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptObjectArray(a, b, c); after.acceptObjectArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3OA} performing this operation and the
     * operations after.
     */
	default ConsumerEx3OA thenObject(ConsumerEx3OA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptObjectArray(a, b, c); after[0].acceptObjectArray(a, b, c);};

    	return (a, b, c) -> {acceptObjectArray(a, b, c); for(ConsumerEx3OA consumer : after) consumer.acceptObjectArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3OA} performing the operation before and
     * this operation.
     */
    default ConsumerEx3OA beforeObject(ConsumerEx3OA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3OA} performing the operations before and
     * this operation.
     */
    default ConsumerEx3OA beforeObject(ConsumerEx3OA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3OA consumer : before) consumer.acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3OA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3OA} performing the operations.
     */
	static ConsumerEx3OA sequenceObject(ConsumerEx3OA... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(ConsumerEx3OA consumer : consumers) consumer.acceptObjectArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObjectArray} instead.
     */
    @Override
    @Deprecated
    default void accept(Object[] a, Object[] b, Object[] c) throws Exception
    {
    	acceptObjectArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3OA} performing this operation and the
     * operation after.
     */
    default ConsumerEx3OA then(ConsumerEx3<Object[],Object[],Object[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3OA)
    	{
    		final ConsumerEx3OA originalAfter = (ConsumerEx3OA)after;
    		
    		return (a, b, c) -> {acceptObjectArray(a, b, c); originalAfter.acceptObjectArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptObjectArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3OA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3OA then(ConsumerEx3<Object[],Object[],Object[]>... after)
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
    		if(after[0] instanceof ConsumerEx3OA)
        	{
        		final ConsumerEx3OA originalAfter = (ConsumerEx3OA)after[0];
        		
        		return (a, b, c) -> {acceptObjectArray(a, b, c); originalAfter.acceptObjectArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptObjectArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptObjectArray(a, b, c);
			
    		for(ConsumerEx3<Object[],Object[],Object[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3OA)
    				((ConsumerEx3OA)consumer).acceptObjectArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3OA} performing the operation before and
     * this operation.
     */
    default ConsumerEx3OA before(ConsumerEx3<Object[],Object[],Object[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3OA)
    	{
    		final ConsumerEx3OA originalBefore = (ConsumerEx3OA)before;
    		
    		return (a, b, c) -> {originalBefore.acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptObjectArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3OA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3OA before(ConsumerEx3<Object[],Object[],Object[]>... before)
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
    		if(before[0] instanceof ConsumerEx3OA)
        	{
        		final ConsumerEx3OA originalBefore = (ConsumerEx3OA)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptObjectArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Object[],Object[],Object[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3OA)
    				((ConsumerEx3OA)consumer).acceptObjectArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptObjectArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3OA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3OA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3OA sequence(ConsumerEx3<Object[],Object[],Object[]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerEx3OA)
    			return (ConsumerEx3OA) consumers[0];
    		else
    			return (ConsumerEx3OA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Object[],Object[],Object[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3OA)
    				((ConsumerEx3OA)consumer).acceptObjectArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
