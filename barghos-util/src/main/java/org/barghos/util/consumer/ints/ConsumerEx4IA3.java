package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four 3-dimensional integer array input
 * arguments and returns no result. Unlike {@link Consumer4IA3} this may throw
 * exceptions. {@link ConsumerEx4IA3} is expected to operate via side-effects.
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
public interface ConsumerEx4IA3 extends ConsumerEx4<int[][][],int[][][],int[][][],int[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptIntArray(int[][][] a, int[][][] b, int[][][] c, int[][][] d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4IA3} performing this operation and the
     * operation after.
     */
    default ConsumerEx4IA3 thenInt(ConsumerEx4IA3 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptIntArray(a, b, c, d); after.acceptIntArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4IA3} performing this operation and the
     * operations after.
     */
	default ConsumerEx4IA3 thenInt(ConsumerEx4IA3... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptIntArray(a, b, c, d); after[0].acceptIntArray(a, b, c, d);};

    	return (a, b, c, d) -> {acceptIntArray(a, b, c, d); for(ConsumerEx4IA3 consumer : after) consumer.acceptIntArray(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4IA3} performing the operation before and
     * this operation.
     */
    default ConsumerEx4IA3 beforeInt(ConsumerEx4IA3 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptIntArray(a, b, c, d); acceptIntArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4IA3} performing the operations before and
     * this operation.
     */
    default ConsumerEx4IA3 beforeInt(ConsumerEx4IA3... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptIntArray(a, b, c, d); acceptIntArray(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4IA3 consumer : before) consumer.acceptIntArray(a, b, c, d); acceptIntArray(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4IA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4IA3} performing the operations.
     */
	static ConsumerEx4IA3 sequenceInt(ConsumerEx4IA3... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(ConsumerEx4IA3 consumer : consumers) consumer.acceptIntArray(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptIntArray} instead.
     */
    @Override
    @Deprecated
    default void accept(int[][][] a, int[][][] b, int[][][] c, int[][][] d) throws Exception
    {
    	acceptIntArray(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4IA3} performing this operation and the
     * operation after.
     */
    default ConsumerEx4IA3 then(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4IA3)
    	{
    		final ConsumerEx4IA3 originalAfter = (ConsumerEx4IA3)after;
    		
    		return (a, b, c, d) -> {acceptIntArray(a, b, c, d); originalAfter.acceptIntArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptIntArray(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4IA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4IA3 then(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]>... after)
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
    		if(after[0] instanceof ConsumerEx4IA3)
        	{
        		final ConsumerEx4IA3 originalAfter = (ConsumerEx4IA3)after[0];
        		
        		return (a, b, c, d) -> {acceptIntArray(a, b, c, d); originalAfter.acceptIntArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptIntArray(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptIntArray(a, b, c, d);
			
    		for(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4IA3)
    				((ConsumerEx4IA3)consumer).acceptIntArray(a, b, c, d);
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
     * @return A new {@link ConsumerEx4IA3} performing the operation before and
     * this operation.
     */
    default ConsumerEx4IA3 before(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4IA3)
    	{
    		final ConsumerEx4IA3 originalBefore = (ConsumerEx4IA3)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptIntArray(a, b, c, d); acceptIntArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptIntArray(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4IA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4IA3 before(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]>... before)
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
    		if(before[0] instanceof ConsumerEx4IA3)
        	{
        		final ConsumerEx4IA3 originalBefore = (ConsumerEx4IA3)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptIntArray(a, b, c, d); acceptIntArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptIntArray(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4IA3)
    				((ConsumerEx4IA3)consumer).acceptIntArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptIntArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4IA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4IA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4IA3 sequence(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerEx4IA3)
    			return (ConsumerEx4IA3) consumers[0];
    		else
    			return (ConsumerEx4IA3) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4IA3)
    				((ConsumerEx4IA3)consumer).acceptIntArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
