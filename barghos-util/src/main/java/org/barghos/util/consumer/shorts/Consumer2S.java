package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two short input arguments and returns no
 * result. {@link Consumer2S} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShort}.
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface Consumer2S extends Consumer2<Short,Short>
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
     * @return A new {@link Consumer2S} performing this operation and the
     * operation after.
     */
    default Consumer2S andThenShort(Consumer2S after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptShort(a, b); after.acceptShort(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2S} performing this operation and the
     * operations after.
     */
	default Consumer2S andThenShort(Consumer2S... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptShort(a, b); after[0].acceptShort(a, b);};

    	return (a, b) -> {acceptShort(a, b); for(Consumer2S consumer : after) consumer.acceptShort(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2S} performing the operation before and this
     * operation.
     */
    default Consumer2S beforeThatShort(Consumer2S before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptShort(a, b); acceptShort(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2S} performing the operations before and
     * this operation.
     */
    default Consumer2S beforeThatShort(Consumer2S... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptShort(a, b); acceptShort(a, b);};
    	
    	return (a, b) -> {for(Consumer2S consumer : before) consumer.acceptShort(a, b); acceptShort(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2S} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2S} performing the operations.
     */
	static Consumer2S inSequenceShort(Consumer2S... consumers)
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
    	
    	return (a, b) -> {for(Consumer2S consumer : consumers) consumer.acceptShort(a, b);};
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
     * @return A new {@link Consumer2S} performing this operation and the
     * operation after.
     */
    default Consumer2S andThen(Consumer2<Short,Short> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2S)
    	{
    		final Consumer2S originalAfter = (Consumer2S)after;
    		
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
     * @return A new {@link Consumer2S} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2S andThen(Consumer2<Short,Short>... after)
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
    		if(after[0] instanceof Consumer2S)
        	{
        		final Consumer2S originalAfter = (Consumer2S)after[0];
        		
        		return (a, b) -> {acceptShort(a, b); originalAfter.acceptShort(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptShort(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptShort(a, b);
			
    		for(Consumer2<Short,Short> consumer : after)
    		{
    			if(consumer instanceof Consumer2S)
    				((Consumer2S)consumer).acceptShort(a, b);
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
     * @return A new {@link Consumer2S} performing the operation before and
     * this operation.
     */
    default Consumer2S beforeThat(Consumer2<Short,Short> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2S)
    	{
    		final Consumer2S originalBefore = (Consumer2S)before;
    		
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
     * @return A new {@link Consumer2S} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2S beforeThat(Consumer2<Short,Short>... before)
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
    		if(before[0] instanceof Consumer2S)
        	{
        		final Consumer2S originalBefore = (Consumer2S)before[0];
        		
        		return (a, b) -> {originalBefore.acceptShort(a, b); acceptShort(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptShort(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Short,Short> consumer : before)
    		{
    			if(consumer instanceof Consumer2S)
    				((Consumer2S)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptShort(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2S} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2S} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2S inSequence(Consumer2<Short,Short>... consumers)
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
    		if(consumers[0] instanceof Consumer2S)
    			return (Consumer2S) consumers[0];
    		else
    			return (Consumer2S) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2S)
    				((Consumer2S)consumer).acceptShort(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2S andThen(java.util.function.BiConsumer<? super Short,? super Short> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptShort(a, b); after.accept(a, b);};
    }
}
