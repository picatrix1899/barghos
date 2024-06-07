package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 1-dimensional short array input
 * arguments and returns no result. {@link Consumer2SA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShortArray}.
 * 
 * @see ConsumerSA
 * @see ConsumerExSA
 * @see Consumer2SA
 * @see ConsumerEx2SA
 * @see Consumer3SA
 * @see ConsumerEx3SA
 * @see Consumer4SA
 * @see ConsumerEx4SA
 */
@FunctionalInterface
public interface Consumer2SA extends Consumer2<short[],short[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptShortArray(short[] a, short[] b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2SA} performing this operation and the
     * operation after.
     */
    default Consumer2SA andThenShort(Consumer2SA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptShortArray(a, b); after.acceptShortArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2SA} performing this operation and the
     * operations after.
     */
	default Consumer2SA andThenShort(Consumer2SA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptShortArray(a, b); after[0].acceptShortArray(a, b);};

    	return (a, b) -> {acceptShortArray(a, b); for(Consumer2SA consumer : after) consumer.acceptShortArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2SA} performing the operation before and this
     * operation.
     */
    default Consumer2SA beforeThatShort(Consumer2SA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptShortArray(a, b); acceptShortArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2SA} performing the operations before and
     * this operation.
     */
    default Consumer2SA beforeThatShort(Consumer2SA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptShortArray(a, b); acceptShortArray(a, b);};
    	
    	return (a, b) -> {for(Consumer2SA consumer : before) consumer.acceptShortArray(a, b); acceptShortArray(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2SA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2SA} performing the operations.
     */
	static Consumer2SA inSequenceShort(Consumer2SA... consumers)
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
    	
    	return (a, b) -> {for(Consumer2SA consumer : consumers) consumer.acceptShortArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShortArray} instead.
     */
    @Override
    @Deprecated
    default void accept(short[] a, short[] b)
    {
    	acceptShortArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2SA} performing this operation and the
     * operation after.
     */
    default Consumer2SA andThen(Consumer2<short[],short[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2SA)
    	{
    		final Consumer2SA originalAfter = (Consumer2SA)after;
    		
    		return (a, b) -> {acceptShortArray(a, b); originalAfter.acceptShortArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptShortArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2SA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2SA andThen(Consumer2<short[],short[]>... after)
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
    		if(after[0] instanceof Consumer2SA)
        	{
        		final Consumer2SA originalAfter = (Consumer2SA)after[0];
        		
        		return (a, b) -> {acceptShortArray(a, b); originalAfter.acceptShortArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptShortArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptShortArray(a, b);
			
    		for(Consumer2<short[],short[]> consumer : after)
    		{
    			if(consumer instanceof Consumer2SA)
    				((Consumer2SA)consumer).acceptShortArray(a, b);
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
     * @return A new {@link Consumer2SA} performing the operation before and
     * this operation.
     */
    default Consumer2SA beforeThat(Consumer2<short[],short[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2SA)
    	{
    		final Consumer2SA originalBefore = (Consumer2SA)before;
    		
    		return (a, b) -> {originalBefore.acceptShortArray(a, b); acceptShortArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptShortArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2SA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2SA beforeThat(Consumer2<short[],short[]>... before)
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
    		if(before[0] instanceof Consumer2SA)
        	{
        		final Consumer2SA originalBefore = (Consumer2SA)before[0];
        		
        		return (a, b) -> {originalBefore.acceptShortArray(a, b); acceptShortArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptShortArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<short[],short[]> consumer : before)
    		{
    			if(consumer instanceof Consumer2SA)
    				((Consumer2SA)consumer).acceptShortArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptShortArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2SA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2SA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2SA inSequence(Consumer2<short[],short[]>... consumers)
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
    		if(consumers[0] instanceof Consumer2SA)
    			return (Consumer2SA) consumers[0];
    		else
    			return (Consumer2SA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<short[],short[]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2SA)
    				((Consumer2SA)consumer).acceptShortArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2SA andThen(java.util.function.BiConsumer<? super short[],? super short[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptShortArray(a, b); after.accept(a, b);};
    }
}
