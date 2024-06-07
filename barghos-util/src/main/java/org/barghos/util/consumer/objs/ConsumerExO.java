package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one object input argument and returns no
 * result. Unlike {@link ConsumerO} this may throw exceptions.
 * {@link ConsumerExO} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptObject}.
 * 
 * @see ConsumerO
 * @see ConsumerExO
 * @see Consumer2O
 * @see ConsumerEx2O
 * @see Consumer3O
 * @see ConsumerEx3O
 * @see Consumer4O
 * @see ConsumerEx4O
 */
@FunctionalInterface
public interface ConsumerExO extends ConsumerEx<Object>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptObject(Object a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExO} performing this operation and the
     * operation after.
     */
    default ConsumerExO thenObject(ConsumerExO after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptObject(a); after.acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExO} performing this operation and the
     * operations after.
     */
	default ConsumerExO thenObject(ConsumerExO... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptObject(a); after[0].acceptObject(a);};

    	return (a) -> {acceptObject(a); for(ConsumerExO consumer : after) consumer.acceptObject(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExO} performing the operation before and
     * this operation.
     */
    default ConsumerExO beforeObject(ConsumerExO before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptObject(a); acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExO} performing the operations before and
     * this operation.
     */
    default ConsumerExO beforeObject(ConsumerExO... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptObject(a); acceptObject(a);};
    	
    	return (a) -> {for(ConsumerExO consumer : before) consumer.acceptObject(a); acceptObject(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExO} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExO} performing the operations.
     */
	static ConsumerExO sequenceObject(ConsumerExO... consumers)
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
    	
    	return (a) -> {for(ConsumerExO consumer : consumers) consumer.acceptObject(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObject} instead.
     */
    @Override
    @Deprecated
    default void accept(Object a) throws Exception
    {
    	acceptObject(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExO} performing this operation and the
     * operation after.
     */
    default ConsumerExO then(ConsumerEx<Object> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExO)
    	{
    		final ConsumerExO originalAfter = (ConsumerExO)after;
    		
    		return (a) -> {acceptObject(a); originalAfter.acceptObject(a);};
    	}
    	else
    	{
    		return (a) -> {acceptObject(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExO} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExO then(ConsumerEx<Object>... after)
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
    		if(after[0] instanceof ConsumerExO)
        	{
        		final ConsumerExO originalAfter = (ConsumerExO)after[0];
        		
        		return (a) -> {acceptObject(a); originalAfter.acceptObject(a);};
        	}
        	else
        	{
        		return (a) -> {acceptObject(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptObject(a);
			
    		for(ConsumerEx<Object> consumer : after)
    		{
    			if(consumer instanceof ConsumerExO)
    				((ConsumerExO)consumer).acceptObject(a);
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
     * @return A new {@link ConsumerExO} performing the operation before and
     * this operation.
     */
    default ConsumerExO before(ConsumerEx<Object> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExO)
    	{
    		final ConsumerExO originalBefore = (ConsumerExO)before;
    		
    		return (a) -> {originalBefore.acceptObject(a); acceptObject(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptObject(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExO} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExO before(ConsumerEx<Object>... before)
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
    		if(before[0] instanceof ConsumerExO)
        	{
        		final ConsumerExO originalBefore = (ConsumerExO)before[0];
        		
        		return (a) -> {originalBefore.acceptObject(a); acceptObject(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptObject(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Object> consumer : before)
    		{
    			if(consumer instanceof ConsumerExO)
    				((ConsumerExO)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptObject(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExO} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExO} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExO sequence(ConsumerEx<Object>... consumers)
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
    		if(consumers[0] instanceof ConsumerExO)
    			return (ConsumerExO) consumers[0];
    		else
    			return (ConsumerExO) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Object> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExO)
    				((ConsumerExO)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
