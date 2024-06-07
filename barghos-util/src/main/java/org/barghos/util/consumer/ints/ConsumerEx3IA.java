package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 1-dimensional integer array input
 * arguments and returns no result. Unlike {@link Consumer3IA} this may throw
 * exceptions. {@link ConsumerEx3IA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptIntArray}.
 * 
 * @see ConsumerIA
 * @see ConsumerExIA
 * @see Consumer2IA
 * @see ConsumerEx2IA
 * @see Consumer3IA
 * @see ConsumerEx3IA
 * @see Consumer4IA
 * @see ConsumerEx4IA
 */
@FunctionalInterface
public interface ConsumerEx3IA extends ConsumerEx3<int[],int[],int[]>
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
    void acceptIntArray(int[] a, int[] b, int[] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3IA} performing this operation and the
     * operation after.
     */
    default ConsumerEx3IA thenInt(ConsumerEx3IA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptIntArray(a, b, c); after.acceptIntArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3IA} performing this operation and the
     * operations after.
     */
	default ConsumerEx3IA thenInt(ConsumerEx3IA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptIntArray(a, b, c); after[0].acceptIntArray(a, b, c);};

    	return (a, b, c) -> {acceptIntArray(a, b, c); for(ConsumerEx3IA consumer : after) consumer.acceptIntArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3IA} performing the operation before and
     * this operation.
     */
    default ConsumerEx3IA beforeInt(ConsumerEx3IA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3IA} performing the operations before and
     * this operation.
     */
    default ConsumerEx3IA beforeInt(ConsumerEx3IA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3IA consumer : before) consumer.acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3IA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3IA} performing the operations.
     */
	static ConsumerEx3IA sequenceInt(ConsumerEx3IA... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3IA consumer : consumers) consumer.acceptIntArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptIntArray} instead.
     */
    @Override
    @Deprecated
    default void accept(int[] a, int[] b, int[] c) throws Exception
    {
    	acceptIntArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3IA} performing this operation and the
     * operation after.
     */
    default ConsumerEx3IA then(ConsumerEx3<int[],int[],int[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3IA)
    	{
    		final ConsumerEx3IA originalAfter = (ConsumerEx3IA)after;
    		
    		return (a, b, c) -> {acceptIntArray(a, b, c); originalAfter.acceptIntArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptIntArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3IA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3IA then(ConsumerEx3<int[],int[],int[]>... after)
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
    		if(after[0] instanceof ConsumerEx3IA)
        	{
        		final ConsumerEx3IA originalAfter = (ConsumerEx3IA)after[0];
        		
        		return (a, b, c) -> {acceptIntArray(a, b, c); originalAfter.acceptIntArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptIntArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptIntArray(a, b, c);
			
    		for(ConsumerEx3<int[],int[],int[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3IA)
    				((ConsumerEx3IA)consumer).acceptIntArray(a, b, c);
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
     * @return A new {@link ConsumerEx3IA} performing the operation before and
     * this operation.
     */
    default ConsumerEx3IA before(ConsumerEx3<int[],int[],int[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3IA)
    	{
    		final ConsumerEx3IA originalBefore = (ConsumerEx3IA)before;
    		
    		return (a, b, c) -> {originalBefore.acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptIntArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3IA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3IA before(ConsumerEx3<int[],int[],int[]>... before)
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
    		if(before[0] instanceof ConsumerEx3IA)
        	{
        		final ConsumerEx3IA originalBefore = (ConsumerEx3IA)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptIntArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<int[],int[],int[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3IA)
    				((ConsumerEx3IA)consumer).acceptIntArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptIntArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3IA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3IA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3IA sequence(ConsumerEx3<int[],int[],int[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3IA)
    			return (ConsumerEx3IA) consumers[0];
    		else
    			return (ConsumerEx3IA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<int[],int[],int[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3IA)
    				((ConsumerEx3IA)consumer).acceptIntArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
