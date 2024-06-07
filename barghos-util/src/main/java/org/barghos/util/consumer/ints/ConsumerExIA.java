package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 1-dimensional integer array input
 * argument and returns no result. Unlike {@link ConsumerIA} this may throw
 * Exceptions. {@link ConsumerExIA} is expected to operate via side-effects.
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
public interface ConsumerExIA extends ConsumerEx<int[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptIntArray(int[] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExIA} performing this operation and the
     * operation after.
     */
    default ConsumerExIA thenInt(ConsumerExIA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptIntArray(a); after.acceptIntArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExIA} performing this operation and the
     * operations after.
     */
	default ConsumerExIA thenInt(ConsumerExIA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptIntArray(a); after[0].acceptIntArray(a);};

    	return (a) -> {acceptIntArray(a); for(ConsumerExIA consumer : after) consumer.acceptIntArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExIA} performing the operation before and
     * this operation.
     */
    default ConsumerExIA beforeInt(ConsumerExIA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptIntArray(a); acceptIntArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExIA} performing the operations before and
     * this operation.
     */
    default ConsumerExIA beforeInt(ConsumerExIA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptIntArray(a); acceptIntArray(a);};
    	
    	return (a) -> {for(ConsumerExIA consumer : before) consumer.acceptIntArray(a); acceptIntArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExIA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExIA} performing the operations.
     */
	static ConsumerExIA sequenceInt(ConsumerExIA... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerExIA consumer : consumers) consumer.acceptIntArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptIntArray} instead.
     */
    @Override
    @Deprecated
    default void accept(int[] a) throws Exception
    {
    	acceptIntArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExIA} performing this operation and the
     * operation after.
     */
    default ConsumerExIA then(ConsumerEx<int[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExIA)
    	{
    		final ConsumerExIA originalAfter = (ConsumerExIA)after;
    		
    		return (a) -> {acceptIntArray(a); originalAfter.acceptIntArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptIntArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExIA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExIA then(ConsumerEx<int[]>... after)
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
    		if(after[0] instanceof ConsumerExIA)
        	{
        		final ConsumerExIA originalAfter = (ConsumerExIA)after[0];
        		
        		return (a) -> {acceptIntArray(a); originalAfter.acceptIntArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptIntArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptIntArray(a);
			
    		for(ConsumerEx<int[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExIA)
    				((ConsumerExIA)consumer).acceptIntArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExIA} performing the operation before and
     * this operation.
     */
    default ConsumerExIA before(ConsumerEx<int[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExIA)
    	{
    		final ConsumerExIA originalBefore = (ConsumerExIA)before;
    		
    		return (a) -> {originalBefore.acceptIntArray(a); acceptIntArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptIntArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExIA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExIA before(ConsumerEx<int[]>... before)
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
    		if(before[0] instanceof ConsumerExIA)
        	{
        		final ConsumerExIA originalBefore = (ConsumerExIA)before[0];
        		
        		return (a) -> {originalBefore.acceptIntArray(a); acceptIntArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptIntArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<int[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExIA)
    				((ConsumerExIA)consumer).acceptIntArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptIntArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExIA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExIA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExIA sequence(ConsumerEx<int[]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerExIA)
    			return (ConsumerExIA) consumers[0];
    		else
    			return (ConsumerExIA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<int[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExIA)
    				((ConsumerExIA)consumer).acceptIntArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
