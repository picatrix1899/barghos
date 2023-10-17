package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three long input arguments and returns no result.
 * {@link Consumer3l} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptLong(long, long, long)}.
 * 
 * @see Consumerl
 * @see ConsumerExl
 * @see Consumer2l
 * @see ConsumerEx2l
 * @see Consumer3l
 * @see ConsumerEx3l
 * @see Consumer4l
 * @see ConsumerEx4l
 */
@FunctionalInterface
public interface Consumer3l extends Consumer3<Long,Long,Long>
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
     * @return A new {@link Consumer3l} performing this operation and the operation after.
     */
    default Consumer3l andThenLong(Consumer3l after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptLong(a, b, c); after.acceptLong(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3l} performing this operation and the operations after.
     */
	default Consumer3l andThenLong(Consumer3l... after)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptLong(a, b, c); after[0].acceptLong(a, b, c);};

    	return (a, b, c) -> {acceptLong(a, b, c); for(Consumer3l consumer : after) consumer.acceptLong(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3l} performing this operation and the operations after.
     */
	default Consumer3l andThenLong(Iterable<Consumer3l> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptLong(a, b, c); for(Consumer3l consumer : after) consumer.acceptLong(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3l} performing the operation before and this operation.
     */
    default Consumer3l beforeThatLong(Consumer3l before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptLong(a, b, c); acceptLong(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3l} performing the operations before and this operation.
     */
    default Consumer3l beforeThatLong(Consumer3l... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptLong(a, b, c); acceptLong(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3l consumer : before) consumer.acceptLong(a, b, c); acceptLong(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3l} performing the operations before and this operation.
     */
    default Consumer3l beforeThatLong(Iterable<Consumer3l> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3l consumer : before) consumer.acceptLong(a, b, c); acceptLong(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3l} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3l} performing the operations.
     */
	static Consumer3l inSequenceLong(Consumer3l... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(Consumer3l consumer : consumers) consumer.acceptLong(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3l} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3l} performing the operations.
     */
    static Consumer3l inSequenceLong(Iterable<Consumer3l> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3l consumer : consumers) consumer.acceptLong(a, b, c);};
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
     * @return A new {@link Consumer3l} performing this operation and the operation after.
     */
    default Consumer3l andThen(Consumer3<Long,Long,Long> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3l)
    	{
    		final Consumer3l originalAfter = (Consumer3l)after;
    		
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
     * @return A new {@link Consumer3l} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3l andThen(Consumer3<Long,Long,Long>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof Consumer3l)
        	{
        		final Consumer3l originalAfter = (Consumer3l)after[0];
        		
        		return (a, b, c) -> {acceptLong(a, b, c); originalAfter.acceptLong(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptLong(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptLong(a, b, c);
			
    		for(Consumer3<Long,Long,Long> consumer : after)
    		{
    			if(consumer instanceof Consumer3l)
    				((Consumer3l)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3l} performing this operation and the operations after.
     */
	default Consumer3l andThen(Iterable<Consumer3<Long,Long,Long>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
		/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
		return (a, b, c) -> {
			acceptLong(a, b, c);
			
    		for(Consumer3<Long,Long,Long> consumer : after)
    		{
    			if(consumer instanceof Consumer3l)
    				((Consumer3l)consumer).acceptLong(a, b, c);
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
     * @return A new {@link Consumer3l} performing the operation before and this operation.
     */
    default Consumer3l beforeThat(Consumer3<Long,Long,Long> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3l)
    	{
    		final Consumer3l originalBefore = (Consumer3l)before;
    		
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
     * @return A new {@link Consumer3l} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3l beforeThat(Consumer3<Long,Long,Long>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof Consumer3l)
        	{
        		final Consumer3l originalBefore = (Consumer3l)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptLong(a, b, c); acceptLong(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptLong(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Long,Long,Long> consumer : before)
    		{
    			if(consumer instanceof Consumer3l)
    				((Consumer3l)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptLong(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3l} performing the operations before and this operation.
     */
    default Consumer3l beforeThat(Iterable<Consumer3<Long,Long,Long>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Long,Long,Long> consumer : before)
    		{
    			if(consumer instanceof Consumer3l)
    				((Consumer3l)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptLong(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3l} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3l} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3l inSequence(Consumer3<Long,Long,Long>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer3l)
    			return (Consumer3l) consumers[0];
    		else
    			return (Consumer3l) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Long,Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3l)
    				((Consumer3l)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3l} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3l} performing the operations.
     */
    static Consumer3l inSequence(Iterable<Consumer3<Long,Long,Long>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Long,Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3l)
    				((Consumer3l)consumer).acceptLong(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
