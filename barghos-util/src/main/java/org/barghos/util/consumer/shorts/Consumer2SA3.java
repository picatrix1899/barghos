package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 3-dimensional short array input
 * arguments and returns no result. {@link Consumer2SA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShortArray}.
 * 
 * @see ConsumerSA3
 * @see ConsumerExSA3
 * @see Consumer2SA3
 * @see ConsumerEx2SA3
 * @see Consumer3SA3
 * @see ConsumerEx3SA3
 * @see Consumer4SA3
 * @see ConsumerEx4SA3
 */
@FunctionalInterface
public interface Consumer2SA3 extends Consumer2<short[][][],short[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptShortArray(short[][][] a, short[][][] b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2SA3} performing this operation and the
     * operation after.
     */
    default Consumer2SA3 andThenShort(Consumer2SA3 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptShortArray(a, b); after.acceptShortArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2SA3} performing this operation and the
     * operations after.
     */
	default Consumer2SA3 andThenShort(Consumer2SA3... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptShortArray(a, b); after[0].acceptShortArray(a, b);};

    	return (a, b) -> {acceptShortArray(a, b); for(Consumer2SA3 consumer : after) consumer.acceptShortArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2SA3} performing the operation before and this
     * operation.
     */
    default Consumer2SA3 beforeThatShort(Consumer2SA3 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptShortArray(a, b); acceptShortArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2SA3} performing the operations before and
     * this operation.
     */
    default Consumer2SA3 beforeThatShort(Consumer2SA3... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptShortArray(a, b); acceptShortArray(a, b);};
    	
    	return (a, b) -> {for(Consumer2SA3 consumer : before) consumer.acceptShortArray(a, b); acceptShortArray(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2SA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2SA3} performing the operations.
     */
	static Consumer2SA3 inSequenceShort(Consumer2SA3... consumers)
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
    	
    	return (a, b) -> {for(Consumer2SA3 consumer : consumers) consumer.acceptShortArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShortArray} instead.
     */
    @Override
    @Deprecated
    default void accept(short[][][] a, short[][][] b)
    {
    	acceptShortArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2SA3} performing this operation and the
     * operation after.
     */
    default Consumer2SA3 andThen(Consumer2<short[][][],short[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2SA3)
    	{
    		final Consumer2SA3 originalAfter = (Consumer2SA3)after;
    		
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
     * @return A new {@link Consumer2SA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2SA3 andThen(Consumer2<short[][][],short[][][]>... after)
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
    		if(after[0] instanceof Consumer2SA3)
        	{
        		final Consumer2SA3 originalAfter = (Consumer2SA3)after[0];
        		
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
			
    		for(Consumer2<short[][][],short[][][]> consumer : after)
    		{
    			if(consumer instanceof Consumer2SA3)
    				((Consumer2SA3)consumer).acceptShortArray(a, b);
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
     * @return A new {@link Consumer2SA3} performing the operation before and
     * this operation.
     */
    default Consumer2SA3 beforeThat(Consumer2<short[][][],short[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2SA3)
    	{
    		final Consumer2SA3 originalBefore = (Consumer2SA3)before;
    		
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
     * @return A new {@link Consumer2SA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2SA3 beforeThat(Consumer2<short[][][],short[][][]>... before)
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
    		if(before[0] instanceof Consumer2SA3)
        	{
        		final Consumer2SA3 originalBefore = (Consumer2SA3)before[0];
        		
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
    		for(Consumer2<short[][][],short[][][]> consumer : before)
    		{
    			if(consumer instanceof Consumer2SA3)
    				((Consumer2SA3)consumer).acceptShortArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptShortArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2SA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2SA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2SA3 inSequence(Consumer2<short[][][],short[][][]>... consumers)
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
    		if(consumers[0] instanceof Consumer2SA3)
    			return (Consumer2SA3) consumers[0];
    		else
    			return (Consumer2SA3) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<short[][][],short[][][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2SA3)
    				((Consumer2SA3)consumer).acceptShortArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2SA3 andThen(java.util.function.BiConsumer<? super short[][][],? super short[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptShortArray(a, b); after.accept(a, b);};
    }
}
