package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two short input arguments and returns no result.
 * {@link Consumer2s} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptShort(short, short)}.
 * 
 * @see Consumers
 * @see ConsumerExs
 * @see Consumer2s
 * @see ConsumerEx2s
 * @see Consumer3s
 * @see ConsumerEx3s
 * @see Consumer4s
 * @see ConsumerEx4s
 */
@FunctionalInterface
public interface Consumer2s extends Consumer2<Short,Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptShort(short a, short b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2s} performing this operation and the operation after.
     */
    default Consumer2s andThenShort(Consumer2s after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptShort(a, b); after.acceptShort(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2s} performing this operation and the operations after.
     */
	default Consumer2s andThenShort(Consumer2s... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptShort(a, b); after[0].acceptShort(a, b);};

    	return (a, b) -> {acceptShort(a, b); for(Consumer2s consumer : after) consumer.acceptShort(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2s} performing this operation and the operations after.
     */
	default Consumer2s andThenShort(Iterable<Consumer2s> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptShort(a, b); for(Consumer2s consumer : after) consumer.acceptShort(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2s} performing the operation before and this operation.
     */
    default Consumer2s beforeThatShort(Consumer2s before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptShort(a, b); acceptShort(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2s} performing the operations before and this operation.
     */
    default Consumer2s beforeThatShort(Consumer2s... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptShort(a, b); acceptShort(a, b);};
    	
    	return (a, b) -> {for(Consumer2s consumer : before) consumer.acceptShort(a, b); acceptShort(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2s} performing the operations before and this operation.
     */
    default Consumer2s beforeThatShort(Iterable<Consumer2s> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2s consumer : before) consumer.acceptShort(a, b); acceptShort(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2s} performing the operations.
     */
	static Consumer2s inSequenceShort(Consumer2s... consumers)
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
    	
    	return (a, b) -> {for(Consumer2s consumer : consumers) consumer.acceptShort(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2s} performing the operations.
     */
    static Consumer2s inSequenceShort(Iterable<Consumer2s> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2s consumer : consumers) consumer.acceptShort(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a, Short b)
    {
    	acceptShort(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2s} performing this operation and the operation after.
     */
    default Consumer2s andThen(Consumer2<Short,Short> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2s)
    	{
    		final Consumer2s originalAfter = (Consumer2s)after;
    		
    		return (a, b) -> {acceptShort(a, b); originalAfter.acceptShort(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptShort(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2s} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2s andThen(Consumer2<Short,Short>... after)
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
    		if(after[0] instanceof Consumer2s)
        	{
        		final Consumer2s originalAfter = (Consumer2s)after[0];
        		
        		return (a, b) -> {acceptShort(a, b); originalAfter.acceptShort(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptShort(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptShort(a, b);
			
    		for(Consumer2<Short,Short> consumer : after)
    		{
    			if(consumer instanceof Consumer2s)
    				((Consumer2s)consumer).acceptShort(a, b);
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
     * @return A new {@link Consumer2s} performing this operation and the operations after.
     */
	default Consumer2s andThen(Iterable<Consumer2<Short,Short>> after)
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
			acceptShort(a, b);
			
    		for(Consumer2<Short,Short> consumer : after)
    		{
    			if(consumer instanceof Consumer2s)
    				((Consumer2s)consumer).acceptShort(a, b);
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
     * @return A new {@link Consumer2s} performing the operation before and this operation.
     */
    default Consumer2s beforeThat(Consumer2<Short,Short> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2s)
    	{
    		final Consumer2s originalBefore = (Consumer2s)before;
    		
    		return (a, b) -> {originalBefore.acceptShort(a, b); acceptShort(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptShort(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2s} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2s beforeThat(Consumer2<Short,Short>... before)
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
    		if(before[0] instanceof Consumer2s)
        	{
        		final Consumer2s originalBefore = (Consumer2s)before[0];
        		
        		return (a, b) -> {originalBefore.acceptShort(a, b); acceptShort(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptShort(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Short,Short> consumer : before)
    		{
    			if(consumer instanceof Consumer2s)
    				((Consumer2s)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptShort(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2s} performing the operations before and this operation.
     */
    default Consumer2s beforeThat(Iterable<Consumer2<Short,Short>> before)
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
    		for(Consumer2<Short,Short> consumer : before)
    		{
    			if(consumer instanceof Consumer2s)
    				((Consumer2s)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptShort(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2s} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2s inSequence(Consumer2<Short,Short>... consumers)
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
    		if(consumers[0] instanceof Consumer2s)
    			return (Consumer2s) consumers[0];
    		else
    			return (Consumer2s) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2s)
    				((Consumer2s)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2s} performing the operations.
     */
    static Consumer2s inSequence(Iterable<Consumer2<Short,Short>> consumers)
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
    		for(Consumer2<Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2s)
    				((Consumer2s)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2s andThen(java.util.function.BiConsumer<? super Short,? super Short> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptShort(a, b); after.accept(a, b);};
    }
}
