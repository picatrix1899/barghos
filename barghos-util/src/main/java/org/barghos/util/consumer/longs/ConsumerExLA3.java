package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 3-dimensional long array input
 * argument and returns no result. Unlike {@link ConsumerLA3} this may throw
 * exceptions. {@link ConsumerExLA3} is expected to operate via side-effects.
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
public interface ConsumerExLA3 extends ConsumerEx<long[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptLongArray(long[][][] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExLA3} performing this operation and the
     * operation after.
     */
    default ConsumerExLA3 thenLong(ConsumerExLA3 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptLongArray(a); after.acceptLongArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExLA3} performing this operation and the
     * operations after.
     */
	default ConsumerExLA3 thenLong(ConsumerExLA3... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptLongArray(a); after[0].acceptLongArray(a);};

    	return (a) -> {acceptLongArray(a); for(ConsumerExLA3 consumer : after) consumer.acceptLongArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExLA3} performing the operation before and
     * this operation.
     */
    default ConsumerExLA3 beforeLong(ConsumerExLA3 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptLongArray(a); acceptLongArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExLA3} performing the operations before and
     * this operation.
     */
    default ConsumerExLA3 beforeLong(ConsumerExLA3... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptLongArray(a); acceptLongArray(a);};
    	
    	return (a) -> {for(ConsumerExLA3 consumer : before) consumer.acceptLongArray(a); acceptLongArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExLA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExLA3} performing the operations.
     */
	static ConsumerExLA3 sequenceLong(ConsumerExLA3... consumers)
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
    	
    	return (a) -> {for(ConsumerExLA3 consumer : consumers) consumer.acceptLongArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLongArray} instead.
     */
    @Override
    @Deprecated
    default void accept(long[][][] a) throws Exception
    {
    	acceptLongArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExLA3} performing this operation and the
     * operation after.
     */
    default ConsumerExLA3 then(ConsumerEx<long[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExLA3)
    	{
    		final ConsumerExLA3 originalAfter = (ConsumerExLA3)after;
    		
    		return (a) -> {acceptLongArray(a); originalAfter.acceptLongArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptLongArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExLA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExLA3 then(ConsumerEx<long[][][]>... after)
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
    		if(after[0] instanceof ConsumerExLA3)
        	{
        		final ConsumerExLA3 originalAfter = (ConsumerExLA3)after[0];
        		
        		return (a) -> {acceptLongArray(a); originalAfter.acceptLongArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptLongArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptLongArray(a);
			
    		for(ConsumerEx<long[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExLA3)
    				((ConsumerExLA3)consumer).acceptLongArray(a);
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
     * @return A new {@link ConsumerExLA3} performing the operation before and
     * this operation.
     */
    default ConsumerExLA3 before(ConsumerEx<long[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExLA3)
    	{
    		final ConsumerExLA3 originalBefore = (ConsumerExLA3)before;
    		
    		return (a) -> {originalBefore.acceptLongArray(a); acceptLongArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptLongArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExLA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExLA3 before(ConsumerEx<long[][][]>... before)
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
    		if(before[0] instanceof ConsumerExLA3)
        	{
        		final ConsumerExLA3 originalBefore = (ConsumerExLA3)before[0];
        		
        		return (a) -> {originalBefore.acceptLongArray(a); acceptLongArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptLongArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<long[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExLA3)
    				((ConsumerExLA3)consumer).acceptLongArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptLongArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExLA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExLA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExLA3 sequence(ConsumerEx<long[][][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerExLA3)
    			return (ConsumerExLA3) consumers[0];
    		else
    			return (ConsumerExLA3) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<long[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExLA3)
    				((ConsumerExLA3)consumer).acceptLongArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
