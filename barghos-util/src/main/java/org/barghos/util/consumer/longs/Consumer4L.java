package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four long input arguments and returns no
 * result. {@link Consumer4L} is expected to operate via side-effects.
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
public interface Consumer4L extends Consumer4<Long,Long,Long,Long>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptLong(long a, long b, long c, long d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4L} performing this operation and the
     * operation after.
     */
    default Consumer4L thenLong(Consumer4L after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptLong(a, b, c, d); after.acceptLong(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4L} performing this operation and the
     * operations after.
     */
	default Consumer4L thenLong(Consumer4L... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptLong(a, b, c, d); after[0].acceptLong(a, b, c, d);};

    	return (a, b, c, d) -> {acceptLong(a, b, c, d); for(Consumer4L consumer : after) consumer.acceptLong(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4L} performing the operation before and this
     * operation.
     */
    default Consumer4L beforeLong(Consumer4L before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptLong(a, b, c, d); acceptLong(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4L} performing the operations before and
     * this operation.
     */
    default Consumer4L beforeLong(Consumer4L... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptLong(a, b, c, d); acceptLong(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4L consumer : before) consumer.acceptLong(a, b, c, d); acceptLong(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4L} performing the operations.
     */
	static Consumer4L sequenceLong(Consumer4L... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(Consumer4L consumer : consumers) consumer.acceptLong(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLong} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a, Long b, Long c, Long d)
    {
    	acceptLong(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4L} performing this operation and the
     * operation after.
     */
    default Consumer4L then(Consumer4<Long,Long,Long,Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4L)
    	{
    		final Consumer4L originalAfter = (Consumer4L)after;
    		
    		return (a, b, c, d) -> {acceptLong(a, b, c, d); originalAfter.acceptLong(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptLong(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4L} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4L then(Consumer4<Long,Long,Long,Long>... after)
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
    		if(after[0] instanceof Consumer4L)
        	{
        		final Consumer4L originalAfter = (Consumer4L)after[0];
        		
        		return (a, b, c, d) -> {acceptLong(a, b, c, d); originalAfter.acceptLong(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptLong(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptLong(a, b, c, d);
			
    		for(Consumer4<Long,Long,Long,Long> consumer : after)
    		{
    			if(consumer instanceof Consumer4L)
    				((Consumer4L)consumer).acceptLong(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4L} performing the operation before and this
     * operation.
     */
    default Consumer4L before(Consumer4<Long,Long,Long,Long> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4L)
    	{
    		final Consumer4L originalBefore = (Consumer4L)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptLong(a, b, c, d); acceptLong(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptLong(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4L} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4L before(Consumer4<Long,Long,Long,Long>... before)
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
    		if(before[0] instanceof Consumer4L)
        	{
        		final Consumer4L originalBefore = (Consumer4L)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptLong(a, b, c, d); acceptLong(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptLong(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Long,Long,Long,Long> consumer : before)
    		{
    			if(consumer instanceof Consumer4L)
    				((Consumer4L)consumer).acceptLong(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptLong(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4L} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4L sequence(Consumer4<Long,Long,Long,Long>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
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
    		if(consumers[0] instanceof Consumer4L)
    			return (Consumer4L) consumers[0];
    		else
    			return (Consumer4L) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Long,Long,Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4L)
    				((Consumer4L)consumer).acceptLong(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
