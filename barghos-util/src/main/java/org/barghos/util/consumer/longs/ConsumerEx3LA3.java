package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 3-dimensional long array input
 * arguments and returns no result. Unlike {@link Consumer3LA3} this may throw
 * exceptions. {@link ConsumerEx3LA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptLongArray}.
 * 
 * @see ConsumerLA3
 * @see ConsumerExLA3
 * @see Consumer2LA3
 * @see ConsumerEx2LA3
 * @see Consumer3LA3
 * @see ConsumerEx3LA3
 * @see Consumer4LA3
 * @see ConsumerEx4LA3
 */
@FunctionalInterface
public interface ConsumerEx3LA3 extends ConsumerEx3<long[][][],long[][][],long[][][]>
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
    void acceptLongArray(long[][][] a, long[][][] b, long[][][] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3LA3} performing this operation and the
     * operation after.
     */
    default ConsumerEx3LA3 thenLong(ConsumerEx3LA3 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptLongArray(a, b, c); after.acceptLongArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3LA3} performing this operation and the
     * operations after.
     */
	default ConsumerEx3LA3 thenLong(ConsumerEx3LA3... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptLongArray(a, b, c); after[0].acceptLongArray(a, b, c);};

    	return (a, b, c) -> {acceptLongArray(a, b, c); for(ConsumerEx3LA3 consumer : after) consumer.acceptLongArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3LA3} performing the operation before and
     * this operation.
     */
    default ConsumerEx3LA3 beforeLong(ConsumerEx3LA3 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptLongArray(a, b, c); acceptLongArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3LA3} performing the operations before and
     * this operation.
     */
    default ConsumerEx3LA3 beforeLong(ConsumerEx3LA3... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptLongArray(a, b, c); acceptLongArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3LA3 consumer : before) consumer.acceptLongArray(a, b, c); acceptLongArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3LA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3LA3} performing the operations.
     */
	static ConsumerEx3LA3 sequenceLong(ConsumerEx3LA3... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3LA3 consumer : consumers) consumer.acceptLongArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLongArray} instead.
     */
    @Override
    @Deprecated
    default void accept(long[][][] a, long[][][] b, long[][][] c) throws Exception
    {
    	acceptLongArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3LA3} performing this operation and the
     * operation after.
     */
    default ConsumerEx3LA3 then(ConsumerEx3<long[][][],long[][][],long[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3LA3)
    	{
    		final ConsumerEx3LA3 originalAfter = (ConsumerEx3LA3)after;
    		
    		return (a, b, c) -> {acceptLongArray(a, b, c); originalAfter.acceptLongArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptLongArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3LA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3LA3 then(ConsumerEx3<long[][][],long[][][],long[][][]>... after)
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
    		if(after[0] instanceof ConsumerEx3LA3)
        	{
        		final ConsumerEx3LA3 originalAfter = (ConsumerEx3LA3)after[0];
        		
        		return (a, b, c) -> {acceptLongArray(a, b, c); originalAfter.acceptLongArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptLongArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptLongArray(a, b, c);
			
    		for(ConsumerEx3<long[][][],long[][][],long[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3LA3)
    				((ConsumerEx3LA3)consumer).acceptLongArray(a, b, c);
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
     * @return A new {@link ConsumerEx3LA3} performing the operation before and
     * this operation.
     */
    default ConsumerEx3LA3 before(ConsumerEx3<long[][][],long[][][],long[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3LA3)
    	{
    		final ConsumerEx3LA3 originalBefore = (ConsumerEx3LA3)before;
    		
    		return (a, b, c) -> {originalBefore.acceptLongArray(a, b, c); acceptLongArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptLongArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3LA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3LA3 before(ConsumerEx3<long[][][],long[][][],long[][][]>... before)
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
    		if(before[0] instanceof ConsumerEx3LA3)
        	{
        		final ConsumerEx3LA3 originalBefore = (ConsumerEx3LA3)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptLongArray(a, b, c); acceptLongArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptLongArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<long[][][],long[][][],long[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3LA3)
    				((ConsumerEx3LA3)consumer).acceptLongArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptLongArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3LA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3LA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3LA3 sequence(ConsumerEx3<long[][][],long[][][],long[][][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3LA3)
    			return (ConsumerEx3LA3) consumers[0];
    		else
    			return (ConsumerEx3LA3) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<long[][][],long[][][],long[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3LA3)
    				((ConsumerEx3LA3)consumer).acceptLongArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
