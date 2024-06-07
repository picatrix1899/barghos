package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 1-dimensional short array input
 * arguments and returns no result. Unlike {@link Consumer2SA} this may throw
 * exceptions. {@link ConsumerEx2SA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShortArray}.
 * 
 * @see ConsumerSA
 * @see ConsumerExSA
 * @see Consumer2SA
 * @see ConsumerEx2SA
 * @see Consumer3SA
 * @see ConsumerEx3SA
 * @see Consumer4SA
 * @see ConsumerEx4SA
 */
@FunctionalInterface
public interface ConsumerEx2SA extends ConsumerEx2<short[],short[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptShortArray(short[] a, short[] b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2SA} performing this operation and the
     * operation after.
     */
    default ConsumerEx2SA thenShort(ConsumerEx2SA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptShortArray(a, b); after.acceptShortArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2SA} performing this operation and the
     * operations after.
     */
	default ConsumerEx2SA thenShort(ConsumerEx2SA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptShortArray(a, b); after[0].acceptShortArray(a, b);};

    	return (a, b) -> {acceptShortArray(a, b); for(ConsumerEx2SA consumer : after) consumer.acceptShortArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2SA} performing the operation before and
     * this operation.
     */
    default ConsumerEx2SA beforeShort(ConsumerEx2SA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptShortArray(a, b); acceptShortArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2SA} performing the operations before and
     * this operation.
     */
    default ConsumerEx2SA beforeShort(ConsumerEx2SA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptShortArray(a, b); acceptShortArray(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2SA consumer : before) consumer.acceptShortArray(a, b); acceptShortArray(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2SA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2SA} performing the operations.
     */
	static ConsumerEx2SA sequenceShort(ConsumerEx2SA... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2SA consumer : consumers) consumer.acceptShortArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShortArray} instead.
     */
    @Override
    @Deprecated
    default void accept(short[] a, short[] b) throws Exception
    {
    	acceptShortArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2SA} performing this operation and the
     * operation after.
     */
    default ConsumerEx2SA then(ConsumerEx2<short[],short[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2SA)
    	{
    		final ConsumerEx2SA originalAfter = (ConsumerEx2SA)after;
    		
    		return (a, b) -> {acceptShortArray(a, b); originalAfter.acceptShortArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptShortArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2SA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2SA then(ConsumerEx2<short[],short[]>... after)
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
    		if(after[0] instanceof ConsumerEx2SA)
        	{
        		final ConsumerEx2SA originalAfter = (ConsumerEx2SA)after[0];
        		
        		return (a, b) -> {acceptShortArray(a, b); originalAfter.acceptShortArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptShortArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptShortArray(a, b);
			
    		for(ConsumerEx2<short[],short[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2SA)
    				((ConsumerEx2SA)consumer).acceptShortArray(a, b);
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
     * @return A new {@link ConsumerEx2SA} performing the operation before and
     * this operation.
     */
    default ConsumerEx2SA before(ConsumerEx2<short[],short[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2SA)
    	{
    		final ConsumerEx2SA originalBefore = (ConsumerEx2SA)before;
    		
    		return (a, b) -> {originalBefore.acceptShortArray(a, b); acceptShortArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptShortArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2SA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2SA before(ConsumerEx2<short[],short[]>... before)
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
    		if(before[0] instanceof ConsumerEx2SA)
        	{
        		final ConsumerEx2SA originalBefore = (ConsumerEx2SA)before[0];
        		
        		return (a, b) -> {originalBefore.acceptShortArray(a, b); acceptShortArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptShortArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<short[],short[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2SA)
    				((ConsumerEx2SA)consumer).acceptShortArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptShortArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2SA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2SA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2SA sequence(ConsumerEx2<short[],short[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2SA)
    			return (ConsumerEx2SA) consumers[0];
    		else
    			return (ConsumerEx2SA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<short[],short[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2SA)
    				((ConsumerEx2SA)consumer).acceptShortArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
