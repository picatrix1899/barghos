package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 1-dimensional integer array input
 * arguments and returns no result. {@link Consumer2IA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptIntArray}.
 * 
 * @see ConsumerIA
 * @see ConsumerExIA
 * @see Consumer2IA
 * @see ConsumerEx2IA
 * @see Consumer3IA
 * @see ConsumerEx3IA
 * @see Consumer4IA
 * @see ConsumerEx4IA
 */
@FunctionalInterface
public interface Consumer2IA extends Consumer2<int[],int[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptIntArray(int[] a, int[] b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2IA} performing this operation and the
     * operation after.
     */
    default Consumer2IA thenInt(Consumer2IA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptIntArray(a, b); after.acceptIntArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2IA} performing this operation and the
     * operations after.
     */
	default Consumer2IA thenInt(Consumer2IA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptIntArray(a, b); after[0].acceptIntArray(a, b);};

    	return (a, b) -> {acceptIntArray(a, b); for(Consumer2IA consumer : after) consumer.acceptIntArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2IA} performing the operation before and this
     * operation.
     */
    default Consumer2IA beforeInt(Consumer2IA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptIntArray(a, b); acceptIntArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2IA} performing the operations before and
     * this operation.
     */
    default Consumer2IA beforeInt(Consumer2IA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptIntArray(a, b); acceptIntArray(a, b);};
    	
    	return (a, b) -> {for(Consumer2IA consumer : before) consumer.acceptIntArray(a, b); acceptIntArray(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2IA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2IA} performing the operations.
     */
	static Consumer2IA sequenceInt(Consumer2IA... consumers)
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
    	
    	return (a, b) -> {for(Consumer2IA consumer : consumers) consumer.acceptIntArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptIntArray} instead.
     */
    @Override
    @Deprecated
    default void accept(int[] a, int[] b)
    {
    	acceptIntArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2IA} performing this operation and the
     * operation after.
     */
    default Consumer2IA then(Consumer2<int[],int[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2IA)
    	{
    		final Consumer2IA originalAfter = (Consumer2IA)after;
    		
    		return (a, b) -> {acceptIntArray(a, b); originalAfter.acceptIntArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptIntArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2IA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2IA then(Consumer2<int[],int[]>... after)
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
    		if(after[0] instanceof Consumer2IA)
        	{
        		final Consumer2IA originalAfter = (Consumer2IA)after[0];
        		
        		return (a, b) -> {acceptIntArray(a, b); originalAfter.acceptIntArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptIntArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptIntArray(a, b);
			
    		for(Consumer2<int[],int[]> consumer : after)
    		{
    			if(consumer instanceof Consumer2IA)
    				((Consumer2IA)consumer).acceptIntArray(a, b);
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
     * @return A new {@link Consumer2IA} performing the operation before and this
     * operation.
     */
    default Consumer2IA before(Consumer2<int[],int[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2IA)
    	{
    		final Consumer2IA originalBefore = (Consumer2IA)before;
    		
    		return (a, b) -> {originalBefore.acceptIntArray(a, b); acceptIntArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptIntArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2IA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2IA before(Consumer2<int[],int[]>... before)
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
    		if(before[0] instanceof Consumer2IA)
        	{
        		final Consumer2IA originalBefore = (Consumer2IA)before[0];
        		
        		return (a, b) -> {originalBefore.acceptIntArray(a, b); acceptIntArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptIntArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<int[],int[]> consumer : before)
    		{
    			if(consumer instanceof Consumer2IA)
    				((Consumer2IA)consumer).acceptIntArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptIntArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2IA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2IA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2IA sequence(Consumer2<int[],int[]>... consumers)
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
    		if(consumers[0] instanceof Consumer2IA)
    			return (Consumer2IA) consumers[0];
    		else
    			return (Consumer2IA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<int[],int[]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2IA)
    				((Consumer2IA)consumer).acceptIntArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2IA andThen(java.util.function.BiConsumer<? super int[],? super int[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptIntArray(a, b); after.accept(a, b);};
    }
}
