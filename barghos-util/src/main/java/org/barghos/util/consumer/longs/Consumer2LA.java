package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 1-dimensional long array input
 * arguments and returns no result. {@link Consumer2LA} is expected to operate
 * via side-effects.
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
public interface Consumer2LA extends Consumer2<long[],long[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptLongArray(long[] a, long[] b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2LA} performing this operation and the
     * operation after.
     */
    default Consumer2LA thenLong(Consumer2LA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptLongArray(a, b); after.acceptLongArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2LA} performing this operation and the
     * operations after.
     */
	default Consumer2LA thenLong(Consumer2LA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptLongArray(a, b); after[0].acceptLongArray(a, b);};

    	return (a, b) -> {acceptLongArray(a, b); for(Consumer2LA consumer : after) consumer.acceptLongArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2LA} performing the operation before and this
     * operation.
     */
    default Consumer2LA beforeLong(Consumer2LA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptLongArray(a, b); acceptLongArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2LA} performing the operations before and
     * this operation.
     */
    default Consumer2LA beforeLong(Consumer2LA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptLongArray(a, b); acceptLongArray(a, b);};
    	
    	return (a, b) -> {for(Consumer2LA consumer : before) consumer.acceptLongArray(a, b); acceptLongArray(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2LA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2LA} performing the operations.
     */
	static Consumer2LA sequenceLong(Consumer2LA... consumers)
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
    	
    	return (a, b) -> {for(Consumer2LA consumer : consumers) consumer.acceptLongArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLongArray} instead.
     */
    @Override
    @Deprecated
    default void accept(long[] a, long[] b)
    {
    	acceptLongArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2LA} performing this operation and the
     * operation after.
     */
    default Consumer2LA then(Consumer2<long[],long[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2LA)
    	{
    		final Consumer2LA originalAfter = (Consumer2LA)after;
    		
    		return (a, b) -> {acceptLongArray(a, b); originalAfter.acceptLongArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptLongArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2LA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2LA then(Consumer2<long[],long[]>... after)
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
    		if(after[0] instanceof Consumer2LA)
        	{
        		final Consumer2LA originalAfter = (Consumer2LA)after[0];
        		
        		return (a, b) -> {acceptLongArray(a, b); originalAfter.acceptLongArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptLongArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptLongArray(a, b);
			
    		for(Consumer2<long[],long[]> consumer : after)
    		{
    			if(consumer instanceof Consumer2LA)
    				((Consumer2LA)consumer).acceptLongArray(a, b);
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
     * @return A new {@link Consumer2LA} performing the operation before and this
     * operation.
     */
    default Consumer2LA before(Consumer2<long[],long[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2LA)
    	{
    		final Consumer2LA originalBefore = (Consumer2LA)before;
    		
    		return (a, b) -> {originalBefore.acceptLongArray(a, b); acceptLongArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptLongArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2LA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2LA before(Consumer2<long[],long[]>... before)
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
    		if(before[0] instanceof Consumer2LA)
        	{
        		final Consumer2LA originalBefore = (Consumer2LA)before[0];
        		
        		return (a, b) -> {originalBefore.acceptLongArray(a, b); acceptLongArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptLongArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<long[],long[]> consumer : before)
    		{
    			if(consumer instanceof Consumer2LA)
    				((Consumer2LA)consumer).acceptLongArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptLongArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2LA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2LA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2LA sequence(Consumer2<long[],long[]>... consumers)
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
    		if(consumers[0] instanceof Consumer2LA)
    			return (Consumer2LA) consumers[0];
    		else
    			return (Consumer2LA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<long[],long[]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2LA)
    				((Consumer2LA)consumer).acceptLongArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2LA andThen(java.util.function.BiConsumer<? super long[],? super long[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptLongArray(a, b); after.accept(a, b);};
    }
}
