package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two long input arguments and returns no
 * result. Unlike {@link Consumer2L} this may throw exceptions.
 * {@link ConsumerEx2L} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptLong}.
 * 
 * @see ConsumerL
 * @see ConsumerExL
 * @see Consumer2L
 * @see ConsumerEx2L
 * @see Consumer3L
 * @see ConsumerEx3L
 * @see Consumer4L
 * @see ConsumerEx4L
 */
@FunctionalInterface
public interface ConsumerEx2L extends ConsumerEx2<Long,Long>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptLong(long a, long b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2L} performing this operation and the
     * operation after.
     */
    default ConsumerEx2L thenLong(ConsumerEx2L after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptLong(a, b); after.acceptLong(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2L} performing this operation and the
     * operations after.
     */
	default ConsumerEx2L thenLong(ConsumerEx2L... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptLong(a, b); after[0].acceptLong(a, b);};

    	return (a, b) -> {acceptLong(a, b); for(ConsumerEx2L consumer : after) consumer.acceptLong(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2L} performing the operation before and
     * this operation.
     */
    default ConsumerEx2L beforeLong(ConsumerEx2L before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptLong(a, b); acceptLong(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2L} performing the operations before and
     * this operation.
     */
    default ConsumerEx2L beforeLong(ConsumerEx2L... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptLong(a, b); acceptLong(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2L consumer : before) consumer.acceptLong(a, b); acceptLong(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2L} performing the operations.
     */
	static ConsumerEx2L sequenceLong(ConsumerEx2L... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2L consumer : consumers) consumer.acceptLong(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLong} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a, Long b) throws Exception
    {
    	acceptLong(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2L} performing this operation and the
     * operation after.
     */
    default ConsumerEx2L then(ConsumerEx2<Long,Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2L)
    	{
    		final ConsumerEx2L originalAfter = (ConsumerEx2L)after;
    		
    		return (a, b) -> {acceptLong(a, b); originalAfter.acceptLong(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptLong(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2L} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2L then(ConsumerEx2<Long,Long>... after)
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
    		if(after[0] instanceof ConsumerEx2L)
        	{
        		final ConsumerEx2L originalAfter = (ConsumerEx2L)after[0];
        		
        		return (a, b) -> {acceptLong(a, b); originalAfter.acceptLong(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptLong(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptLong(a, b);
			
    		for(ConsumerEx2<Long,Long> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2L)
    				((ConsumerEx2L)consumer).acceptLong(a, b);
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
     * @return A new {@link ConsumerEx2L} performing the operation before and
     * this operation.
     */
    default ConsumerEx2L before(ConsumerEx2<Long,Long> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2L)
    	{
    		final ConsumerEx2L originalBefore = (ConsumerEx2L)before;
    		
    		return (a, b) -> {originalBefore.acceptLong(a, b); acceptLong(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptLong(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2L} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2L before(ConsumerEx2<Long,Long>... before)
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
    		if(before[0] instanceof ConsumerEx2L)
        	{
        		final ConsumerEx2L originalBefore = (ConsumerEx2L)before[0];
        		
        		return (a, b) -> {originalBefore.acceptLong(a, b); acceptLong(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptLong(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Long,Long> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2L)
    				((ConsumerEx2L)consumer).acceptLong(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptLong(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2L} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2L sequence(ConsumerEx2<Long,Long>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2L)
    			return (ConsumerEx2L) consumers[0];
    		else
    			return (ConsumerEx2L) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2L)
    				((ConsumerEx2L)consumer).acceptLong(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
