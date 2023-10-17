package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three short input argument and returns no result.
 * Unlike {@link Consumer3s} this may throw Exceptions.
 * {@link ConsumerEx3s} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptShort(short, short, short)}.
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
public interface ConsumerEx3s extends ConsumerEx3<Short,Short,Short>
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
    void acceptShort(short a, short b, short c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing this operation and the operation after.
     */
    default ConsumerEx3s andThenShort(ConsumerEx3s after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptShort(a, b, c); after.acceptShort(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing this operation and the operations after.
     */
	default ConsumerEx3s andThenShort(ConsumerEx3s... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptShort(a, b, c); after[0].acceptShort(a, b, c);};

    	return (a, b, c) -> {acceptShort(a, b, c); for(ConsumerEx3s consumer : after) consumer.acceptShort(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing this operation and the operations after.
     */
	default ConsumerEx3s andThenShort(Iterable<ConsumerEx3s> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptShort(a, b, c); for(ConsumerEx3s consumer : after) consumer.acceptShort(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing the operation before and this operation.
     */
    default ConsumerEx3s beforeThatShort(ConsumerEx3s before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptShort(a, b, c); acceptShort(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing the operations before and this operation.
     */
    default ConsumerEx3s beforeThatShort(ConsumerEx3s... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptShort(a, b, c); acceptShort(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3s consumer : before) consumer.acceptShort(a, b, c); acceptShort(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing the operations before and this operation.
     */
    default ConsumerEx3s beforeThatShort(Iterable<ConsumerEx3s> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(ConsumerEx3s consumer : before) consumer.acceptShort(a, b, c); acceptShort(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3s} performing the operations.
     */
	static ConsumerEx3s inSequenceShort(ConsumerEx3s... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3s consumer : consumers) consumer.acceptShort(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3s} performing the operations.
     */
    static ConsumerEx3s inSequenceShort(Iterable<ConsumerEx3s> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(ConsumerEx3s consumer : consumers) consumer.acceptShort(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a, Short b, Short c) throws Exception
    {
    	acceptShort(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing this operation and the operation after.
     */
    default ConsumerEx3s andThen(ConsumerEx3<Short,Short,Short> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3s)
    	{
    		final ConsumerEx3s originalAfter = (ConsumerEx3s)after;
    		
    		return (a, b, c) -> {acceptShort(a, b, c); originalAfter.acceptShort(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptShort(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3s andThen(ConsumerEx3<Short,Short,Short>... after)
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
    		if(after[0] instanceof ConsumerEx3s)
        	{
        		final ConsumerEx3s originalAfter = (ConsumerEx3s)after[0];
        		
        		return (a, b, c) -> {acceptShort(a, b, c); originalAfter.acceptShort(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptShort(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptShort(a, b, c);
			
    		for(ConsumerEx3<Short,Short,Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3s)
    				((ConsumerEx3s)consumer).acceptShort(a, b, c);
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
     * @return A new {@link ConsumerEx3s} performing this operation and the operations after.
     */
	default ConsumerEx3s andThen(Iterable<ConsumerEx3<Short,Short,Short>> after)
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
			acceptShort(a, b, c);
			
    		for(ConsumerEx3<Short,Short,Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3s)
    				((ConsumerEx3s)consumer).acceptShort(a, b, c);
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
     * @return A new {@link ConsumerEx3s} performing the operation before and this operation.
     */
    default ConsumerEx3s beforeThat(ConsumerEx3<Short,Short,Short> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3s)
    	{
    		final ConsumerEx3s originalBefore = (ConsumerEx3s)before;
    		
    		return (a, b, c) -> {originalBefore.acceptShort(a, b, c); acceptShort(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptShort(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3s beforeThat(ConsumerEx3<Short,Short,Short>... before)
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
    		if(before[0] instanceof ConsumerEx3s)
        	{
        		final ConsumerEx3s originalBefore = (ConsumerEx3s)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptShort(a, b, c); acceptShort(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptShort(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Short,Short,Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3s)
    				((ConsumerEx3s)consumer).acceptShort(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptShort(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3s} performing the operations before and this operation.
     */
    default ConsumerEx3s beforeThat(Iterable<ConsumerEx3<Short,Short,Short>> before)
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
    		for(ConsumerEx3<Short,Short,Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3s)
    				((ConsumerEx3s)consumer).acceptShort(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptShort(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3s} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3s inSequence(ConsumerEx3<Short,Short,Short>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3s)
    			return (ConsumerEx3s) consumers[0];
    		else
    			return (ConsumerEx3s) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Short,Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3s)
    				((ConsumerEx3s)consumer).acceptShort(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3s} performing the operations.
     */
    static ConsumerEx3s inSequence(Iterable<ConsumerEx3<Short,Short,Short>> consumers)
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
    		for(ConsumerEx3<Short,Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3s)
    				((ConsumerEx3s)consumer).acceptShort(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
