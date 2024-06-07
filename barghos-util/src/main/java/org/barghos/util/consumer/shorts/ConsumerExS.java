package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one short input arguments and returns no
 * result. Unlike {@link ConsumerS} this may throw exceptions.
 * {@link ConsumerExS} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShort}.
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface ConsumerExS extends ConsumerEx<Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptShort(short a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExS} performing this operation and the
     * operation after.
     */
    default ConsumerExS thenShort(ConsumerExS after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptShort(a); after.acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExS} performing this operation and the
     * operations after.
     */
	default ConsumerExS thenShort(ConsumerExS... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptShort(a); after[0].acceptShort(a);};

    	return (a) -> {acceptShort(a); for(ConsumerExS consumer : after) consumer.acceptShort(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExS} performing the operation before and
     * this operation.
     */
    default ConsumerExS beforeShort(ConsumerExS before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExS} performing the operations before and
     * this operation.
     */
    default ConsumerExS beforeShort(ConsumerExS... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptShort(a); acceptShort(a);};
    	
    	return (a) -> {for(ConsumerExS consumer : before) consumer.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExS} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExS} performing the operations.
     */
	static ConsumerExS sequenceShort(ConsumerExS... consumers)
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
    	
    	return (a) -> {for(ConsumerExS consumer : consumers) consumer.acceptShort(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a) throws Exception
    {
    	acceptShort(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExS} performing this operation and the
     * operation after.
     */
    default ConsumerExS then(ConsumerEx<Short> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExS)
    	{
    		final ConsumerExS originalAfter = (ConsumerExS)after;
    		
    		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {acceptShort(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExS} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExS then(ConsumerEx<Short>... after)
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
    		if(after[0] instanceof ConsumerExS)
        	{
        		final ConsumerExS originalAfter = (ConsumerExS)after[0];
        		
        		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
        	}
        	else
        	{
        		return (a) -> {acceptShort(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptShort(a);
			
    		for(ConsumerEx<Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerExS)
    				((ConsumerExS)consumer).acceptShort(a);
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
     * @return A new {@link ConsumerExS} performing the operation before and
     * this operation.
     */
    default ConsumerExS before(ConsumerEx<Short> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExS)
    	{
    		final ConsumerExS originalBefore = (ConsumerExS)before;
    		
    		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptShort(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExS} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExS before(ConsumerEx<Short>... before)
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
    		if(before[0] instanceof ConsumerExS)
        	{
        		final ConsumerExS originalBefore = (ConsumerExS)before[0];
        		
        		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptShort(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerExS)
    				((ConsumerExS)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptShort(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExS} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExS} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExS sequence(ConsumerEx<Short>... consumers)
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
    		if(consumers[0] instanceof ConsumerExS)
    			return (ConsumerExS) consumers[0];
    		else
    			return (ConsumerExS) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExS)
    				((ConsumerExS)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
