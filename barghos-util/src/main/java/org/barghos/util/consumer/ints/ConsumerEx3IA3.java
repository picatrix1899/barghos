package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 3-dimensional integer array input
 * arguments and returns no result. Unlike {@link Consumer3IA3} this may throw
 * exceptions. {@link ConsumerEx3IA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptIntArray}.
 * 
 * @see ConsumerIA3
 * @see ConsumerExIA3
 * @see Consumer2IA3
 * @see ConsumerEx2IA3
 * @see Consumer3IA3
 * @see ConsumerEx3IA3
 * @see Consumer4IA3
 * @see ConsumerEx4IA3
 */
@FunctionalInterface
public interface ConsumerEx3IA3 extends ConsumerEx3<int[][][],int[][][],int[][][]>
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
    void acceptIntArray(int[][][] a, int[][][] b, int[][][] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3IA3} performing this operation and the
     * operation after.
     */
    default ConsumerEx3IA3 thenInt(ConsumerEx3IA3 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptIntArray(a, b, c); after.acceptIntArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3IA3} performing this operation and the
     * operations after.
     */
	default ConsumerEx3IA3 thenInt(ConsumerEx3IA3... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptIntArray(a, b, c); after[0].acceptIntArray(a, b, c);};

    	return (a, b, c) -> {acceptIntArray(a, b, c); for(ConsumerEx3IA3 consumer : after) consumer.acceptIntArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3IA3} performing the operation before and
     * this operation.
     */
    default ConsumerEx3IA3 beforeInt(ConsumerEx3IA3 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3IA3} performing the operations before and
     * this operation.
     */
    default ConsumerEx3IA3 beforeInt(ConsumerEx3IA3... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3IA3 consumer : before) consumer.acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3IA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3IA3} performing the operations.
     */
	static ConsumerEx3IA3 sequenceInt(ConsumerEx3IA3... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3IA3 consumer : consumers) consumer.acceptIntArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptIntArray} instead.
     */
    @Override
    @Deprecated
    default void accept(int[][][] a, int[][][] b, int[][][] c) throws Exception
    {
    	acceptIntArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3IA3} performing this operation and the
     * operation after.
     */
    default ConsumerEx3IA3 then(ConsumerEx3<int[][][],int[][][],int[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3IA3)
    	{
    		final ConsumerEx3IA3 originalAfter = (ConsumerEx3IA3)after;
    		
    		return (a, b, c) -> {acceptIntArray(a, b, c); originalAfter.acceptIntArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptIntArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3IA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3IA3 then(ConsumerEx3<int[][][],int[][][],int[][][]>... after)
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
    		if(after[0] instanceof ConsumerEx3IA3)
        	{
        		final ConsumerEx3IA3 originalAfter = (ConsumerEx3IA3)after[0];
        		
        		return (a, b, c) -> {acceptIntArray(a, b, c); originalAfter.acceptIntArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptIntArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptIntArray(a, b, c);
			
    		for(ConsumerEx3<int[][][],int[][][],int[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3IA3)
    				((ConsumerEx3IA3)consumer).acceptIntArray(a, b, c);
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
     * @return A new {@link ConsumerEx3IA3} performing the operation before and
     * this operation.
     */
    default ConsumerEx3IA3 before(ConsumerEx3<int[][][],int[][][],int[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3IA3)
    	{
    		final ConsumerEx3IA3 originalBefore = (ConsumerEx3IA3)before;
    		
    		return (a, b, c) -> {originalBefore.acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptIntArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3IA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3IA3 before(ConsumerEx3<int[][][],int[][][],int[][][]>... before)
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
    		if(before[0] instanceof ConsumerEx3IA3)
        	{
        		final ConsumerEx3IA3 originalBefore = (ConsumerEx3IA3)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptIntArray(a, b, c); acceptIntArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptIntArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<int[][][],int[][][],int[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3IA3)
    				((ConsumerEx3IA3)consumer).acceptIntArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptIntArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3IA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3IA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3IA3 sequence(ConsumerEx3<int[][][],int[][][],int[][][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3IA3)
    			return (ConsumerEx3IA3) consumers[0];
    		else
    			return (ConsumerEx3IA3) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<int[][][],int[][][],int[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3IA3)
    				((ConsumerEx3IA3)consumer).acceptIntArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
