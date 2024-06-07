package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 2-dimensional long array input
 * argument and returns no result. Unlike {@link ConsumerLA2} this may throw
 * exceptions. {@link ConsumerExLA2} is expected to operate via side-effects.
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
public interface ConsumerExLA2 extends ConsumerEx<long[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptLongArray(long[][] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExLA2} performing this operation and the
     * operation after.
     */
    default ConsumerExLA2 thenLong(ConsumerExLA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptLongArray(a); after.acceptLongArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExLA2} performing this operation and the
     * operations after.
     */
	default ConsumerExLA2 thenLong(ConsumerExLA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptLongArray(a); after[0].acceptLongArray(a);};

    	return (a) -> {acceptLongArray(a); for(ConsumerExLA2 consumer : after) consumer.acceptLongArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExLA2} performing the operation before and
     * this operation.
     */
    default ConsumerExLA2 beforeLong(ConsumerExLA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptLongArray(a); acceptLongArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExLA2} performing the operations before and
     * this operation.
     */
    default ConsumerExLA2 beforeLong(ConsumerExLA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptLongArray(a); acceptLongArray(a);};
    	
    	return (a) -> {for(ConsumerExLA2 consumer : before) consumer.acceptLongArray(a); acceptLongArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExLA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExLA2} performing the operations.
     */
	static ConsumerExLA2 sequenceLong(ConsumerExLA2... consumers)
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
    	
    	return (a) -> {for(ConsumerExLA2 consumer : consumers) consumer.acceptLongArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLongArray} instead.
     */
    @Override
    @Deprecated
    default void accept(long[][] a) throws Exception
    {
    	acceptLongArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExLA2} performing this operation and the
     * operation after.
     */
    default ConsumerExLA2 then(ConsumerEx<long[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExLA2)
    	{
    		final ConsumerExLA2 originalAfter = (ConsumerExLA2)after;
    		
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
     * @return A new {@link ConsumerExLA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExLA2 then(ConsumerEx<long[][]>... after)
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
    		if(after[0] instanceof ConsumerExLA2)
        	{
        		final ConsumerExLA2 originalAfter = (ConsumerExLA2)after[0];
        		
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
			
    		for(ConsumerEx<long[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExLA2)
    				((ConsumerExLA2)consumer).acceptLongArray(a);
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
     * @return A new {@link ConsumerExLA2} performing the operation before and
     * this operation.
     */
    default ConsumerExLA2 before(ConsumerEx<long[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExLA2)
    	{
    		final ConsumerExLA2 originalBefore = (ConsumerExLA2)before;
    		
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
     * @return A new {@link ConsumerExLA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExLA2 before(ConsumerEx<long[][]>... before)
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
    		if(before[0] instanceof ConsumerExLA2)
        	{
        		final ConsumerExLA2 originalBefore = (ConsumerExLA2)before[0];
        		
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
    		for(ConsumerEx<long[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExLA2)
    				((ConsumerExLA2)consumer).acceptLongArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptLongArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExLA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExLA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExLA2 sequence(ConsumerEx<long[][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerExLA2)
    			return (ConsumerExLA2) consumers[0];
    		else
    			return (ConsumerExLA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<long[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExLA2)
    				((ConsumerExLA2)consumer).acceptLongArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
