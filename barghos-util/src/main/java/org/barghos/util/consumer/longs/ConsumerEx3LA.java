package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 1-dimensional long array input
 * arguments and returns no result. Unlike {@link Consumer3LA} this may throw
 * exceptions. {@link ConsumerEx3LA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptLongArray}.
 * 
 * @see ConsumerLA
 * @see ConsumerExLA
 * @see Consumer2LA
 * @see ConsumerEx2LA
 * @see Consumer3LA
 * @see ConsumerEx3LA
 * @see Consumer4LA
 * @see ConsumerEx4LA
 */
@FunctionalInterface
public interface ConsumerEx3LA extends ConsumerEx3<long[],long[],long[]>
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
    void acceptLongArray(long[] a, long[] b, long[] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3LA} performing this operation and the
     * operation after.
     */
    default ConsumerEx3LA thenLong(ConsumerEx3LA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptLongArray(a, b, c); after.acceptLongArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3LA} performing this operation and the
     * operations after.
     */
	default ConsumerEx3LA thenLong(ConsumerEx3LA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptLongArray(a, b, c); after[0].acceptLongArray(a, b, c);};

    	return (a, b, c) -> {acceptLongArray(a, b, c); for(ConsumerEx3LA consumer : after) consumer.acceptLongArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3LA} performing the operation before and
     * this operation.
     */
    default ConsumerEx3LA beforeLong(ConsumerEx3LA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptLongArray(a, b, c); acceptLongArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3LA} performing the operations before and
     * this operation.
     */
    default ConsumerEx3LA beforeLong(ConsumerEx3LA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptLongArray(a, b, c); acceptLongArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3LA consumer : before) consumer.acceptLongArray(a, b, c); acceptLongArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3LA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3LA} performing the operations.
     */
	static ConsumerEx3LA sequenceLong(ConsumerEx3LA... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3LA consumer : consumers) consumer.acceptLongArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLongArray} instead.
     */
    @Override
    @Deprecated
    default void accept(long[] a, long[] b, long[] c) throws Exception
    {
    	acceptLongArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3LA} performing this operation and the
     * operation after.
     */
    default ConsumerEx3LA then(ConsumerEx3<long[],long[],long[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3LA)
    	{
    		final ConsumerEx3LA originalAfter = (ConsumerEx3LA)after;
    		
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
     * @return A new {@link ConsumerEx3LA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3LA then(ConsumerEx3<long[],long[],long[]>... after)
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
    		if(after[0] instanceof ConsumerEx3LA)
        	{
        		final ConsumerEx3LA originalAfter = (ConsumerEx3LA)after[0];
        		
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
			
    		for(ConsumerEx3<long[],long[],long[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3LA)
    				((ConsumerEx3LA)consumer).acceptLongArray(a, b, c);
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
     * @return A new {@link ConsumerEx3LA} performing the operation before and
     * this operation.
     */
    default ConsumerEx3LA before(ConsumerEx3<long[],long[],long[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3LA)
    	{
    		final ConsumerEx3LA originalBefore = (ConsumerEx3LA)before;
    		
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
     * @return A new {@link ConsumerEx3LA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3LA before(ConsumerEx3<long[],long[],long[]>... before)
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
    		if(before[0] instanceof ConsumerEx3LA)
        	{
        		final ConsumerEx3LA originalBefore = (ConsumerEx3LA)before[0];
        		
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
    		for(ConsumerEx3<long[],long[],long[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3LA)
    				((ConsumerEx3LA)consumer).acceptLongArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptLongArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3LA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3LA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3LA sequence(ConsumerEx3<long[],long[],long[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3LA)
    			return (ConsumerEx3LA) consumers[0];
    		else
    			return (ConsumerEx3LA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<long[],long[],long[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3LA)
    				((ConsumerEx3LA)consumer).acceptLongArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
