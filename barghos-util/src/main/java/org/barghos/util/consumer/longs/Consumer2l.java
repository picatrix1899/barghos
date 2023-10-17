package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two long input arguments and returns no result.
 * {@link Consumer2l} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptLong(long, long)}.
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
public interface Consumer2l extends Consumer2<Long,Long>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptLong(long a, long b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2l} performing this operation and the operation after.
     */
    default Consumer2l andThenLong(Consumer2l after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptLong(a, b); after.acceptLong(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2l} performing this operation and the operations after.
     */
	default Consumer2l andThenLong(Consumer2l... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptLong(a, b); after[0].acceptLong(a, b);};

    	return (a, b) -> {acceptLong(a, b); for(Consumer2l consumer : after) consumer.acceptLong(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2l} performing this operation and the operations after.
     */
	default Consumer2l andThenLong(Iterable<Consumer2l> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptLong(a, b); for(Consumer2l consumer : after) consumer.acceptLong(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2l} performing the operation before and this operation.
     */
    default Consumer2l beforeThatLong(Consumer2l before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptLong(a, b); acceptLong(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2l} performing the operations before and this operation.
     */
    default Consumer2l beforeThatLong(Consumer2l... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptLong(a, b); acceptLong(a, b);};
    	
    	return (a, b) -> {for(Consumer2l consumer : before) consumer.acceptLong(a, b); acceptLong(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2l} performing the operations before and this operation.
     */
    default Consumer2l beforeThatLong(Iterable<Consumer2l> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2l consumer : before) consumer.acceptLong(a, b); acceptLong(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2l} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2l} performing the operations.
     */
	static Consumer2l inSequenceLong(Consumer2l... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(Consumer2l consumer : consumers) consumer.acceptLong(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2l} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2l} performing the operations.
     */
    static Consumer2l inSequenceLong(Iterable<Consumer2l> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2l consumer : consumers) consumer.acceptLong(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLong} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a, Long b)
    {
    	acceptLong(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2l} performing this operation and the operation after.
     */
    default Consumer2l andThen(Consumer2<Long,Long> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2l)
    	{
    		final Consumer2l originalAfter = (Consumer2l)after;
    		
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
     * @return A new {@link Consumer2l} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2l andThen(Consumer2<Long,Long>... after)
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
    		if(after[0] instanceof Consumer2l)
        	{
        		final Consumer2l originalAfter = (Consumer2l)after[0];
        		
        		return (a, b) -> {acceptLong(a, b); originalAfter.acceptLong(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptLong(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptLong(a, b);
			
    		for(Consumer2<Long,Long> consumer : after)
    		{
    			if(consumer instanceof Consumer2l)
    				((Consumer2l)consumer).acceptLong(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2l} performing this operation and the operations after.
     */
	default Consumer2l andThen(Iterable<Consumer2<Long,Long>> after)
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
		return (a, b) -> {
			acceptLong(a, b);
			
    		for(Consumer2<Long,Long> consumer : after)
    		{
    			if(consumer instanceof Consumer2l)
    				((Consumer2l)consumer).acceptLong(a, b);
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
     * @return A new {@link Consumer2l} performing the operation before and this operation.
     */
    default Consumer2l beforeThat(Consumer2<Long,Long> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2l)
    	{
    		final Consumer2l originalBefore = (Consumer2l)before;
    		
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
     * @return A new {@link Consumer2l} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2l beforeThat(Consumer2<Long,Long>... before)
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
    		if(before[0] instanceof Consumer2l)
        	{
        		final Consumer2l originalBefore = (Consumer2l)before[0];
        		
        		return (a, b) -> {originalBefore.acceptLong(a, b); acceptLong(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptLong(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Long,Long> consumer : before)
    		{
    			if(consumer instanceof Consumer2l)
    				((Consumer2l)consumer).acceptLong(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptLong(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2l} performing the operations before and this operation.
     */
    default Consumer2l beforeThat(Iterable<Consumer2<Long,Long>> before)
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
    	return (a, b) -> {
    		for(Consumer2<Long,Long> consumer : before)
    		{
    			if(consumer instanceof Consumer2l)
    				((Consumer2l)consumer).acceptLong(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptLong(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2l} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2l} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2l inSequence(Consumer2<Long,Long>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer2l)
    			return (Consumer2l) consumers[0];
    		else
    			return (Consumer2l) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2l)
    				((Consumer2l)consumer).acceptLong(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2l} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2l} performing the operations.
     */
    static Consumer2l inSequence(Iterable<Consumer2<Long,Long>> consumers)
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
    	return (a, b) -> {
    		for(Consumer2<Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2l)
    				((Consumer2l)consumer).acceptLong(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2l andThen(java.util.function.BiConsumer<? super Long,? super Long> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptLong(a, b); after.accept(a, b);};
    }
}
