package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 1-dimensional integer array input
 * argument and returns no result. {@link ConsumerIA} is expected to operate via
 * side-effects.
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
public interface ConsumerIA extends Consumer<int[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptIntArray(int[] a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerIA} performing this operation and the
     * operation after.
     */
    default ConsumerIA thenInt(ConsumerIA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptIntArray(a); after.acceptIntArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerIA} performing this operation and the
     * operations after.
     */
	default ConsumerIA thenInt(ConsumerIA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptIntArray(a); after[0].acceptIntArray(a);};

    	return (a) -> {acceptIntArray(a); for(ConsumerIA consumer : after) consumer.acceptIntArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerIA} performing the operation before and this
     * operation.
     */
    default ConsumerIA beforeInt(ConsumerIA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptIntArray(a); acceptIntArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerIA} performing the operations before and this
     * operation.
     */
    default ConsumerIA beforeInt(ConsumerIA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptIntArray(a); acceptIntArray(a);};
    	
    	return (a) -> {for(ConsumerIA consumer : before) consumer.acceptIntArray(a); acceptIntArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerIA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerIA} performing the operations.
     */
	static ConsumerIA sequenceInt(ConsumerIA... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerIA consumer : consumers) consumer.acceptIntArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptIntArray} instead.
     */
    @Override
    @Deprecated
    default void accept(int[] a)
    {
    	acceptIntArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerIA} performing this operation and the
     * operation after.
     */
    default ConsumerIA then(Consumer<int[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerIA)
    	{
    		final ConsumerIA originalAfter = (ConsumerIA)after;
    		
    		return (a) -> {acceptIntArray(a); originalAfter.acceptIntArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptIntArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerIA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerIA then(Consumer<int[]>... after)
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
    		if(after[0] instanceof ConsumerIA)
        	{
        		final ConsumerIA originalAfter = (ConsumerIA)after[0];
        		
        		return (a) -> {acceptIntArray(a); originalAfter.acceptIntArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptIntArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptIntArray(a);
			
    		for(Consumer<int[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerIA)
    				((ConsumerIA)consumer).acceptIntArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerIA} performing the operation before and this
     * operation.
     */
    default ConsumerIA before(Consumer<int[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerIA)
    	{
    		final ConsumerIA originalBefore = (ConsumerIA)before;
    		
    		return (a) -> {originalBefore.acceptIntArray(a); acceptIntArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptIntArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerIA} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerIA before(Consumer<int[]>... before)
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
    		if(before[0] instanceof ConsumerIA)
        	{
        		final ConsumerIA originalBefore = (ConsumerIA)before[0];
        		
        		return (a) -> {originalBefore.acceptIntArray(a); acceptIntArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptIntArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<int[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerIA)
    				((ConsumerIA)consumer).acceptIntArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptIntArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerIA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerIA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerIA sequence(Consumer<int[]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerIA)
    			return (ConsumerIA) consumers[0];
    		else
    			return (ConsumerIA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<int[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerIA)
    				((ConsumerIA)consumer).acceptIntArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default ConsumerIA andThen(java.util.function.Consumer<? super int[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptIntArray(a); after.accept(a);};
    }
}
