package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three long input arguments and returns
 * no result. Unlike {@link Consumer3L} this may throw exceptions.
 * {@link ConsumerEx3L} is expected to operate via side-effects.
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
public interface ConsumerEx3L extends ConsumerEx3<Long,Long,Long>
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
    void acceptLong(long a, long b, long c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3L} performing this operation and the
     * operation after.
     */
    default ConsumerEx3L thenLong(ConsumerEx3L after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptLong(a, b, c); after.acceptLong(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3L} performing this operation and the
     * operations after.
     */
	default ConsumerEx3L thenLong(ConsumerEx3L... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptLong(a, b, c); after[0].acceptLong(a, b, c);};

    	return (a, b, c) -> {acceptLong(a, b, c); for(ConsumerEx3L consumer : after) consumer.acceptLong(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3L} performing the operation before and
     * this operation.
     */
    default ConsumerEx3L beforeLong(ConsumerEx3L before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptLong(a, b, c); acceptLong(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3L} performing the operations before and
     * this operation.
     */
    default ConsumerEx3L beforeLong(ConsumerEx3L... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptLong(a, b, c); acceptLong(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3L consumer : before) consumer.acceptLong(a, b, c); acceptLong(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3L} performing the operations.
     */
	static ConsumerEx3L sequenceLong(ConsumerEx3L... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3L consumer : consumers) consumer.acceptLong(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLong} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a, Long b, Long c) throws Exception
    {
    	acceptLong(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3L} performing this operation and the
     * operation after.
     */
    default ConsumerEx3L then(ConsumerEx3<Long,Long,Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3L)
    	{
    		final ConsumerEx3L originalAfter = (ConsumerEx3L)after;
    		
    		return (a, b, c) -> {acceptLong(a, b, c); originalAfter.acceptLong(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptLong(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3L} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3L then(ConsumerEx3<Long,Long,Long>... after)
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
    		if(after[0] instanceof ConsumerEx3L)
        	{
        		final ConsumerEx3L originalAfter = (ConsumerEx3L)after[0];
        		
        		return (a, b, c) -> {acceptLong(a, b, c); originalAfter.acceptLong(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptLong(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptLong(a, b, c);
			
    		for(ConsumerEx3<Long,Long,Long> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3L)
    				((ConsumerEx3L)consumer).acceptLong(a, b, c);
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
     * @return A new {@link ConsumerEx3L} performing the operation before and
     * this operation.
     */
    default ConsumerEx3L before(ConsumerEx3<Long,Long,Long> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3L)
    	{
    		final ConsumerEx3L originalBefore = (ConsumerEx3L)before;
    		
    		return (a, b, c) -> {originalBefore.acceptLong(a, b, c); acceptLong(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptLong(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3L} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3L before(ConsumerEx3<Long,Long,Long>... before)
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
    		if(before[0] instanceof ConsumerEx3L)
        	{
        		final ConsumerEx3L originalBefore = (ConsumerEx3L)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptLong(a, b, c); acceptLong(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptLong(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Long,Long,Long> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3L)
    				((ConsumerEx3L)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptLong(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3L} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3L sequence(ConsumerEx3<Long,Long,Long>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3L)
    			return (ConsumerEx3L) consumers[0];
    		else
    			return (ConsumerEx3L) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Long,Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3L)
    				((ConsumerEx3L)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
