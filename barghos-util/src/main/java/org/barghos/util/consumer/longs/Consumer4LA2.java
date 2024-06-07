package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four 2-dimensional long array input
 * arguments and returns no result. {@link Consumer4LA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptLongArray}.
 * 
 * @see ConsumerLA2
 * @see ConsumerExLA2
 * @see Consumer2LA2
 * @see ConsumerEx2LA2
 * @see Consumer3LA2
 * @see ConsumerEx3LA2
 * @see Consumer4LA2
 * @see ConsumerEx4LA2
 */
@FunctionalInterface
public interface Consumer4LA2 extends Consumer4<long[][],long[][],long[][],long[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptLongArray(long[][] a, long[][] b, long[][] c, long[][] d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4LA2} performing this operation and the
     * operation after.
     */
    default Consumer4LA2 thenLong(Consumer4LA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptLongArray(a, b, c, d); after.acceptLongArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4LA2} performing this operation and the
     * operations after.
     */
	default Consumer4LA2 thenLong(Consumer4LA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptLongArray(a, b, c, d); after[0].acceptLongArray(a, b, c, d);};

    	return (a, b, c, d) -> {acceptLongArray(a, b, c, d); for(Consumer4LA2 consumer : after) consumer.acceptLongArray(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4LA2} performing the operation before and this
     * operation.
     */
    default Consumer4LA2 beforeLong(Consumer4LA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptLongArray(a, b, c, d); acceptLongArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4LA2} performing the operations before and
     * this operation.
     */
    default Consumer4LA2 beforeLong(Consumer4LA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptLongArray(a, b, c, d); acceptLongArray(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4LA2 consumer : before) consumer.acceptLongArray(a, b, c, d); acceptLongArray(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4LA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4LA2} performing the operations.
     */
	static Consumer4LA2 sequenceLong(Consumer4LA2... consumers)
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
    	
    	return (a, b, c, d) -> {for(Consumer4LA2 consumer : consumers) consumer.acceptLongArray(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLongArray} instead.
     */
    @Override
    @Deprecated
    default void accept(long[][] a, long[][] b, long[][] c, long[][] d)
    {
    	acceptLongArray(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4LA2} performing this operation and the
     * operation after.
     */
    default Consumer4LA2 then(Consumer4<long[][],long[][],long[][],long[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4LA2)
    	{
    		final Consumer4LA2 originalAfter = (Consumer4LA2)after;
    		
    		return (a, b, c, d) -> {acceptLongArray(a, b, c, d); originalAfter.acceptLongArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptLongArray(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4LA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4LA2 then(Consumer4<long[][],long[][],long[][],long[][]>... after)
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
    		if(after[0] instanceof Consumer4LA2)
        	{
        		final Consumer4LA2 originalAfter = (Consumer4LA2)after[0];
        		
        		return (a, b, c, d) -> {acceptLongArray(a, b, c, d); originalAfter.acceptLongArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptLongArray(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptLongArray(a, b, c, d);
			
    		for(Consumer4<long[][],long[][],long[][],long[][]> consumer : after)
    		{
    			if(consumer instanceof Consumer4LA2)
    				((Consumer4LA2)consumer).acceptLongArray(a, b, c, d);
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
     * @return A new {@link Consumer4LA2} performing the operation before and this
     * operation.
     */
    default Consumer4LA2 before(Consumer4<long[][],long[][],long[][],long[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4LA2)
    	{
    		final Consumer4LA2 originalBefore = (Consumer4LA2)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptLongArray(a, b, c, d); acceptLongArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptLongArray(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4LA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4LA2 before(Consumer4<long[][],long[][],long[][],long[][]>... before)
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
    		if(before[0] instanceof Consumer4LA2)
        	{
        		final Consumer4LA2 originalBefore = (Consumer4LA2)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptLongArray(a, b, c, d); acceptLongArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptLongArray(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<long[][],long[][],long[][],long[][]> consumer : before)
    		{
    			if(consumer instanceof Consumer4LA2)
    				((Consumer4LA2)consumer).acceptLongArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptLongArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4LA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4LA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4LA2 sequence(Consumer4<long[][],long[][],long[][],long[][]>... consumers)
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
    		if(consumers[0] instanceof Consumer4LA2)
    			return (Consumer4LA2) consumers[0];
    		else
    			return (Consumer4LA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<long[][],long[][],long[][],long[][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4LA2)
    				((Consumer4LA2)consumer).acceptLongArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
