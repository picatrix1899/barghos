package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three long input arguments and returns
 * no result. {@link Consumer3L} is expected to operate via side-effects.
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
public interface Consumer3L extends Consumer3<Long,Long,Long>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptLong(long a, long b, long c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3L} performing this operation and the
     * operation after.
     */
    default Consumer3L thenLong(Consumer3L after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptLong(a, b, c); after.acceptLong(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3L} performing this operation and the
     * operations after.
     */
	default Consumer3L thenLong(Consumer3L... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptLong(a, b, c); after[0].acceptLong(a, b, c);};

    	return (a, b, c) -> {acceptLong(a, b, c); for(Consumer3L consumer : after) consumer.acceptLong(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3L} performing the operation before and this
     * operation.
     */
    default Consumer3L beforeLong(Consumer3L before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptLong(a, b, c); acceptLong(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3L} performing the operations before and
     * this operation.
     */
    default Consumer3L beforeLong(Consumer3L... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptLong(a, b, c); acceptLong(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3L consumer : before) consumer.acceptLong(a, b, c); acceptLong(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3L} performing the operations.
     */
	static Consumer3L sequenceLong(Consumer3L... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3L consumer : consumers) consumer.acceptLong(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLong} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a, Long b, Long c)
    {
    	acceptLong(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3L} performing this operation and the
     * operation after.
     */
    default Consumer3L then(Consumer3<Long,Long,Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3L)
    	{
    		final Consumer3L originalAfter = (Consumer3L)after;
    		
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
     * @return A new {@link Consumer3L} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3L then(Consumer3<Long,Long,Long>... after)
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
    		if(after[0] instanceof Consumer3L)
        	{
        		final Consumer3L originalAfter = (Consumer3L)after[0];
        		
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
			
    		for(Consumer3<Long,Long,Long> consumer : after)
    		{
    			if(consumer instanceof Consumer3L)
    				((Consumer3L)consumer).acceptLong(a, b, c);
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
     * @return A new {@link Consumer3L} performing the operation before and this
     * operation.
     */
    default Consumer3L before(Consumer3<Long,Long,Long> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3L)
    	{
    		final Consumer3L originalBefore = (Consumer3L)before;
    		
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
     * @return A new {@link Consumer3L} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3L before(Consumer3<Long,Long,Long>... before)
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
    		if(before[0] instanceof Consumer3L)
        	{
        		final Consumer3L originalBefore = (Consumer3L)before[0];
        		
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
    		for(Consumer3<Long,Long,Long> consumer : before)
    		{
    			if(consumer instanceof Consumer3L)
    				((Consumer3L)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptLong(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3L} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3L sequence(Consumer3<Long,Long,Long>... consumers)
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
    		if(consumers[0] instanceof Consumer3L)
    			return (Consumer3L) consumers[0];
    		else
    			return (Consumer3L) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Long,Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3L)
    				((Consumer3L)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
