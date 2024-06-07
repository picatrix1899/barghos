package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 1-dimensional short array input
 * argument and returns no result. Unlike {@link ConsumerSA} this may throw
 * exceptions. {@link ConsumerExSA} is expected to operate via side-effects.
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
public interface ConsumerExSA extends ConsumerEx<short[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptShortArray(short[] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExSA} performing this operation and the
     * operation after.
     */
    default ConsumerExSA thenShort(ConsumerExSA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptShortArray(a); after.acceptShortArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExSA} performing this operation and the
     * operations after.
     */
	default ConsumerExSA thenShort(ConsumerExSA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptShortArray(a); after[0].acceptShortArray(a);};

    	return (a) -> {acceptShortArray(a); for(ConsumerExSA consumer : after) consumer.acceptShortArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExSA} performing the operation before and
     * this operation.
     */
    default ConsumerExSA beforeShort(ConsumerExSA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptShortArray(a); acceptShortArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExSA} performing the operations before and
     * this operation.
     */
    default ConsumerExSA beforeShort(ConsumerExSA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptShortArray(a); acceptShortArray(a);};
    	
    	return (a) -> {for(ConsumerExSA consumer : before) consumer.acceptShortArray(a); acceptShortArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExSA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExSA} performing the operations.
     */
	static ConsumerExSA sequenceShort(ConsumerExSA... consumers)
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
    	
    	return (a) -> {for(ConsumerExSA consumer : consumers) consumer.acceptShortArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShortArray} instead.
     */
    @Override
    @Deprecated
    default void accept(short[] a) throws Exception
    {
    	acceptShortArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExSA} performing this operation and the
     * operation after.
     */
    default ConsumerExSA then(ConsumerEx<short[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExSA)
    	{
    		final ConsumerExSA originalAfter = (ConsumerExSA)after;
    		
    		return (a) -> {acceptShortArray(a); originalAfter.acceptShortArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptShortArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExSA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExSA then(ConsumerEx<short[]>... after)
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
    		if(after[0] instanceof ConsumerExSA)
        	{
        		final ConsumerExSA originalAfter = (ConsumerExSA)after[0];
        		
        		return (a) -> {acceptShortArray(a); originalAfter.acceptShortArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptShortArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptShortArray(a);
			
    		for(ConsumerEx<short[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExSA)
    				((ConsumerExSA)consumer).acceptShortArray(a);
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
     * @return A new {@link ConsumerExSA} performing the operation before and
     * this operation.
     */
    default ConsumerExSA before(ConsumerEx<short[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExSA)
    	{
    		final ConsumerExSA originalBefore = (ConsumerExSA)before;
    		
    		return (a) -> {originalBefore.acceptShortArray(a); acceptShortArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptShortArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExSA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExSA before(ConsumerEx<short[]>... before)
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
    		if(before[0] instanceof ConsumerExSA)
        	{
        		final ConsumerExSA originalBefore = (ConsumerExSA)before[0];
        		
        		return (a) -> {originalBefore.acceptShortArray(a); acceptShortArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptShortArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<short[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExSA)
    				((ConsumerExSA)consumer).acceptShortArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptShortArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExSA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExSA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExSA sequence(ConsumerEx<short[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerExSA)
    			return (ConsumerExSA) consumers[0];
    		else
    			return (ConsumerExSA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<short[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExSA)
    				((ConsumerExSA)consumer).acceptShortArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
