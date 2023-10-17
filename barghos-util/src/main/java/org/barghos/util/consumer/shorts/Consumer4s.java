package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four short input arguments and returns no result.
 * {@link Consumer4s} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptShort(short, short, short, short)}.
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
public interface Consumer4s extends Consumer4<Short,Short,Short,Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptShort(short a, short b, short c, short d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4s} performing this operation and the operation after.
     */
    default Consumer4s andThenShort(Consumer4s after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptShort(a, b, c, d); after.acceptShort(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4s} performing this operation and the operations after.
     */
	default Consumer4s andThenShort(Consumer4s... after)
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
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptShort(a, b, c, d); after[0].acceptShort(a, b, c, d);};

    	return (a, b, c, d) -> {acceptShort(a, b, c, d); for(Consumer4s consumer : after) consumer.acceptShort(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4s} performing this operation and the operations after.
     */
	default Consumer4s andThenShort(Iterable<Consumer4s> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptShort(a, b, c, d); for(Consumer4s consumer : after) consumer.acceptShort(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4s} performing the operation before and this operation.
     */
    default Consumer4s beforeThatShort(Consumer4s before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4s} performing the operations before and this operation.
     */
    default Consumer4s beforeThatShort(Consumer4s... before)
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
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4s consumer : before) consumer.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4s} performing the operations before and this operation.
     */
    default Consumer4s beforeThatShort(Iterable<Consumer4s> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(Consumer4s consumer : before) consumer.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4s} performing the operations.
     */
	static Consumer4s inSequenceShort(Consumer4s... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(Consumer4s consumer : consumers) consumer.acceptShort(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4s} performing the operations.
     */
    static Consumer4s inSequenceShort(Iterable<Consumer4s> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(Consumer4s consumer : consumers) consumer.acceptShort(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a, Short b, Short c, Short d)
    {
    	acceptShort(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4s} performing this operation and the operation after.
     */
    default Consumer4s andThen(Consumer4<Short,Short,Short,Short> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4s)
    	{
    		final Consumer4s originalAfter = (Consumer4s)after;
    		
    		return (a, b, c, d) -> {acceptShort(a, b, c, d); originalAfter.acceptShort(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptShort(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4s} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4s andThen(Consumer4<Short,Short,Short,Short>... after)
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
    		if(after[0] instanceof Consumer4s)
        	{
        		final Consumer4s originalAfter = (Consumer4s)after[0];
        		
        		return (a, b, c, d) -> {acceptShort(a, b, c, d); originalAfter.acceptShort(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptShort(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
			acceptShort(a, b, c, d);
			
    		for(Consumer4<Short,Short,Short,Short> consumer : after)
    		{
    			if(consumer instanceof Consumer4s)
    				((Consumer4s)consumer).acceptShort(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4s} performing this operation and the operations after.
     */
	default Consumer4s andThen(Iterable<Consumer4<Short,Short,Short,Short>> after)
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
		return (a, b, c, d) -> {
			acceptShort(a, b, c, d);
			
    		for(Consumer4<Short,Short,Short,Short> consumer : after)
    		{
    			if(consumer instanceof Consumer4s)
    				((Consumer4s)consumer).acceptShort(a, b, c, d);
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
     * @return A new {@link Consumer4s} performing the operation before and this operation.
     */
    default Consumer4s beforeThat(Consumer4<Short,Short,Short,Short> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4s)
    	{
    		final Consumer4s originalBefore = (Consumer4s)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptShort(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4s} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4s beforeThat(Consumer4<Short,Short,Short,Short>... before)
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
    		if(before[0] instanceof Consumer4s)
        	{
        		final Consumer4s originalBefore = (Consumer4s)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptShort(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Short,Short,Short,Short> consumer : before)
    		{
    			if(consumer instanceof Consumer4s)
    				((Consumer4s)consumer).acceptShort(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptShort(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4s} performing the operations before and this operation.
     */
    default Consumer4s beforeThat(Iterable<Consumer4<Short,Short,Short,Short>> before)
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
    	return (a, b, c, d) -> {
    		for(Consumer4<Short,Short,Short,Short> consumer : before)
    		{
    			if(consumer instanceof Consumer4s)
    				((Consumer4s)consumer).acceptShort(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptShort(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4s} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4s inSequence(Consumer4<Short,Short,Short,Short>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer4s)
    			return (Consumer4s) consumers[0];
    		else
    			return (Consumer4s) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Short,Short,Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4s)
    				((Consumer4s)consumer).acceptShort(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer4s} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4s} performing the operations.
     */
    static Consumer4s inSequence(Iterable<Consumer4<Short,Short,Short,Short>> consumers)
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
    	return (a, b, c, d) -> {
    		for(Consumer4<Short,Short,Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4s)
    				((Consumer4s)consumer).acceptShort(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
