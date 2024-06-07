package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two object input arguments and returns
 * no result. Unlike {@link Consumer2O} this may throw exceptions.
 * {@link ConsumerEx2O} is expected to operate via side-effects.
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
public interface ConsumerEx2O extends ConsumerEx2<Object,Object>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptObject(Object a, Object b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2O} performing this operation and the
     * operation after.
     */
    default ConsumerEx2O thenObject(ConsumerEx2O after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptObject(a, b); after.acceptObject(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2O} performing this operation and the
     * operations after.
     */
	default ConsumerEx2O thenObject(ConsumerEx2O... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptObject(a, b); after[0].acceptObject(a, b);};

    	return (a, b) -> {acceptObject(a, b); for(ConsumerEx2O consumer : after) consumer.acceptObject(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2O} performing the operation before and
     * this operation.
     */
    default ConsumerEx2O beforeObject(ConsumerEx2O before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptObject(a, b); acceptObject(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2O} performing the operations before and
     * this operation.
     */
    default ConsumerEx2O beforeObject(ConsumerEx2O... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptObject(a, b); acceptObject(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2O consumer : before) consumer.acceptObject(a, b); acceptObject(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2O} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2O} performing the operations.
     */
	static ConsumerEx2O sequenceObject(ConsumerEx2O... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2O consumer : consumers) consumer.acceptObject(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObject} instead.
     */
    @Override
    @Deprecated
    default void accept(Object a, Object b) throws Exception
    {
    	acceptObject(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2O} performing this operation and the
     * operation after.
     */
    default ConsumerEx2O then(ConsumerEx2<Object,Object> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2O)
    	{
    		final ConsumerEx2O originalAfter = (ConsumerEx2O)after;
    		
    		return (a, b) -> {acceptObject(a, b); originalAfter.acceptObject(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptObject(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2O} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2O then(ConsumerEx2<Object,Object>... after)
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
    		if(after[0] instanceof ConsumerEx2O)
        	{
        		final ConsumerEx2O originalAfter = (ConsumerEx2O)after[0];
        		
        		return (a, b) -> {acceptObject(a, b); originalAfter.acceptObject(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptObject(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptObject(a, b);
			
    		for(ConsumerEx2<Object,Object> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2O)
    				((ConsumerEx2O)consumer).acceptObject(a, b);
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
     * @return A new {@link ConsumerEx2O} performing the operation before and
     * this operation.
     */
    default ConsumerEx2O before(ConsumerEx2<Object,Object> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2O)
    	{
    		final ConsumerEx2O originalBefore = (ConsumerEx2O)before;
    		
    		return (a, b) -> {originalBefore.acceptObject(a, b); acceptObject(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptObject(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2O} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2O before(ConsumerEx2<Object,Object>... before)
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
    		if(before[0] instanceof ConsumerEx2O)
        	{
        		final ConsumerEx2O originalBefore = (ConsumerEx2O)before[0];
        		
        		return (a, b) -> {originalBefore.acceptObject(a, b); acceptObject(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptObject(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Object,Object> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2O)
    				((ConsumerEx2O)consumer).acceptObject(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptObject(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2O} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2O} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2O sequence(ConsumerEx2<Object,Object>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2O)
    			return (ConsumerEx2O) consumers[0];
    		else
    			return (ConsumerEx2O) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Object,Object> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2O)
    				((ConsumerEx2O)consumer).acceptObject(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
