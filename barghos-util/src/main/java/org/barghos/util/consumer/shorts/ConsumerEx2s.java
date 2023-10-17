package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two short input argument and returns no result.
 * Unlike {@link Consumer2s} this may throw Exceptions.
 * {@link ConsumerEx2s} is expected to operate via side-effects.
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
public interface ConsumerEx2s extends ConsumerEx2<Short,Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptShort(short a, short b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2s} performing this operation and the operation after.
     */
    default ConsumerEx2s andThenShort(ConsumerEx2s after)
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
     * @return A new {@link ConsumerEx2s} performing this operation and the operations after.
     */
	default ConsumerEx2s andThenShort(ConsumerEx2s... after)
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

    	return (a, b) -> {acceptShort(a, b); for(ConsumerEx2s consumer : after) consumer.acceptShort(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2s} performing this operation and the operations after.
     */
	default ConsumerEx2s andThenShort(Iterable<ConsumerEx2s> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptShort(a, b); for(ConsumerEx2s consumer : after) consumer.acceptShort(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2s} performing the operation before and this operation.
     */
    default ConsumerEx2s beforeThatShort(ConsumerEx2s before)
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
     * @return A new {@link ConsumerEx2s} performing the operations before and this operation.
     */
    default ConsumerEx2s beforeThatShort(ConsumerEx2s... before)
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
    	
    	return (a, b) -> {for(ConsumerEx2s consumer : before) consumer.acceptShort(a, b); acceptShort(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2s} performing the operations before and this operation.
     */
    default ConsumerEx2s beforeThatShort(Iterable<ConsumerEx2s> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2s consumer : before) consumer.acceptShort(a, b); acceptShort(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2s} performing the operations.
     */
	static ConsumerEx2s inSequenceShort(ConsumerEx2s... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2s consumer : consumers) consumer.acceptShort(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2s} performing the operations.
     */
    static ConsumerEx2s inSequenceShort(Iterable<ConsumerEx2s> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2s consumer : consumers) consumer.acceptShort(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a, Short b) throws Exception
    {
    	acceptShort(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2s} performing this operation and the operation after.
     */
    default ConsumerEx2s andThen(ConsumerEx2<Short,Short> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2s)
    	{
    		final ConsumerEx2s originalAfter = (ConsumerEx2s)after;
    		
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
     * @return A new {@link ConsumerEx2s} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2s andThen(ConsumerEx2<Short,Short>... after)
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
    		if(after[0] instanceof ConsumerEx2s)
        	{
        		final ConsumerEx2s originalAfter = (ConsumerEx2s)after[0];
        		
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
			
    		for(ConsumerEx2<Short,Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2s)
    				((ConsumerEx2s)consumer).acceptShort(a, b);
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
     * @return A new {@link ConsumerEx2s} performing this operation and the operations after.
     */
	default ConsumerEx2s andThen(Iterable<ConsumerEx2<Short,Short>> after)
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
			
    		for(ConsumerEx2<Short,Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2s)
    				((ConsumerEx2s)consumer).acceptShort(a, b);
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
     * @return A new {@link ConsumerEx2s} performing the operation before and this operation.
     */
    default ConsumerEx2s beforeThat(ConsumerEx2<Short,Short> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2s)
    	{
    		final ConsumerEx2s originalBefore = (ConsumerEx2s)before;
    		
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
     * @return A new {@link ConsumerEx2s} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2s beforeThat(ConsumerEx2<Short,Short>... before)
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
    		if(before[0] instanceof ConsumerEx2s)
        	{
        		final ConsumerEx2s originalBefore = (ConsumerEx2s)before[0];
        		
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
    		for(ConsumerEx2<Short,Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2s)
    				((ConsumerEx2s)consumer).acceptShort(a, b);
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
     * @return A new {@link ConsumerEx2s} performing the operations before and this operation.
     */
    default ConsumerEx2s beforeThat(Iterable<ConsumerEx2<Short,Short>> before)
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
    		for(ConsumerEx2<Short,Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2s)
    				((ConsumerEx2s)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptShort(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2s} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2s inSequence(ConsumerEx2<Short,Short>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2s)
    			return (ConsumerEx2s) consumers[0];
    		else
    			return (ConsumerEx2s) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2s)
    				((ConsumerEx2s)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2s} performing the operations.
     */
    static ConsumerEx2s inSequence(Iterable<ConsumerEx2<Short,Short>> consumers)
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
    		for(ConsumerEx2<Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2s)
    				((ConsumerEx2s)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
