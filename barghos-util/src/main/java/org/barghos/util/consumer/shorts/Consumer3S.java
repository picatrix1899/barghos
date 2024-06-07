package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three short input arguments and returns
 * no result. {@link Consumer3S} is expected to operate via side-effects.
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
public interface Consumer3S extends Consumer3<Short,Short,Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptShort(short a, short b, short c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3S} performing this operation and the
     * operation after.
     */
    default Consumer3S thenShort(Consumer3S after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptShort(a, b, c); after.acceptShort(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3S} performing this operation and the
     * operations after.
     */
	default Consumer3S thenShort(Consumer3S... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptShort(a, b, c); after[0].acceptShort(a, b, c);};

    	return (a, b, c) -> {acceptShort(a, b, c); for(Consumer3S consumer : after) consumer.acceptShort(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3S} performing the operation before and this
     * operation.
     */
    default Consumer3S beforeShort(Consumer3S before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptShort(a, b, c); acceptShort(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3S} performing the operations before and this operation.
     */
    default Consumer3S beforeShort(Consumer3S... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptShort(a, b, c); acceptShort(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3S consumer : before) consumer.acceptShort(a, b, c); acceptShort(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3S} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3S} performing the operations.
     */
	static Consumer3S sequenceShort(Consumer3S... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3S consumer : consumers) consumer.acceptShort(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a, Short b, Short c)
    {
    	acceptShort(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3S} performing this operation and the
     * operation after.
     */
    default Consumer3S then(Consumer3<Short,Short,Short> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3S)
    	{
    		final Consumer3S originalAfter = (Consumer3S)after;
    		
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
     * @return A new {@link Consumer3S} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3S then(Consumer3<Short,Short,Short>... after)
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
    		if(after[0] instanceof Consumer3S)
        	{
        		final Consumer3S originalAfter = (Consumer3S)after[0];
        		
        		return (a, b, c) -> {acceptShort(a, b, c); originalAfter.acceptShort(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptShort(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptShort(a, b, c);
			
    		for(Consumer3<Short,Short,Short> consumer : after)
    		{
    			if(consumer instanceof Consumer3S)
    				((Consumer3S)consumer).acceptShort(a, b, c);
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
     * @return A new {@link Consumer3S} performing the operation before and this
     * operation.
     */
    default Consumer3S before(Consumer3<Short,Short,Short> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3S)
    	{
    		final Consumer3S originalBefore = (Consumer3S)before;
    		
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
     * @return A new {@link Consumer3S} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3S before(Consumer3<Short,Short,Short>... before)
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
    		if(before[0] instanceof Consumer3S)
        	{
        		final Consumer3S originalBefore = (Consumer3S)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptShort(a, b, c); acceptShort(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptShort(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Short,Short,Short> consumer : before)
    		{
    			if(consumer instanceof Consumer3S)
    				((Consumer3S)consumer).acceptShort(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptShort(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3S} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3S} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3S sequence(Consumer3<Short,Short,Short>... consumers)
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
    		if(consumers[0] instanceof Consumer3S)
    			return (Consumer3S) consumers[0];
    		else
    			return (Consumer3S) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Short,Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3S)
    				((Consumer3S)consumer).acceptShort(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
