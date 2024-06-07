package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four object input arguments and returns
 * no result. {@link Consumer4O} is expected to operate via side-effects.
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
public interface Consumer4O extends Consumer4<Object,Object,Object,Object>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptObject(Object a, Object b, Object c, Object d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4O} performing this operation and the
     * operation after.
     */
    default Consumer4O thenObject(Consumer4O after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptObject(a, b, c, d); after.acceptObject(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4O} performing this operation and the
     * operations after.
     */
	default Consumer4O thenObject(Consumer4O... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptObject(a, b, c, d); after[0].acceptObject(a, b, c, d);};

    	return (a, b, c, d) -> {acceptObject(a, b, c, d); for(Consumer4O consumer : after) consumer.acceptObject(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4O} performing the operation before and this
     * operation.
     */
    default Consumer4O beforeObject(Consumer4O before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4O} performing the operations before and
     * this operation.
     */
    default Consumer4O beforeObject(Consumer4O... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4O consumer : before) consumer.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4O} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4O} performing the operations.
     */
	static Consumer4O sequenceObject(Consumer4O... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(Consumer4O consumer : consumers) consumer.acceptObject(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObject} instead.
     */
    @Override
    @Deprecated
    default void accept(Object a, Object b, Object c, Object d)
    {
    	acceptObject(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4O} performing this operation and the
     * operation after.
     */
    default Consumer4O then(Consumer4<Object,Object,Object,Object> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4O)
    	{
    		final Consumer4O originalAfter = (Consumer4O)after;
    		
    		return (a, b, c, d) -> {acceptObject(a, b, c, d); originalAfter.acceptObject(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptObject(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4O} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4O then(Consumer4<Object,Object,Object,Object>... after)
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
    		if(after[0] instanceof Consumer4O)
        	{
        		final Consumer4O originalAfter = (Consumer4O)after[0];
        		
        		return (a, b, c, d) -> {acceptObject(a, b, c, d); originalAfter.acceptObject(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptObject(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptObject(a, b, c, d);
			
    		for(Consumer4<Object,Object,Object,Object> consumer : after)
    		{
    			if(consumer instanceof Consumer4O)
    				((Consumer4O)consumer).acceptObject(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4O} performing the operation before and this
     * operation.
     */
    default Consumer4O before(Consumer4<Object,Object,Object,Object> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4O)
    	{
    		final Consumer4O originalBefore = (Consumer4O)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptObject(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4O} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4O before(Consumer4<Object,Object,Object,Object>... before)
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
    		if(before[0] instanceof Consumer4O)
        	{
        		final Consumer4O originalBefore = (Consumer4O)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptObject(a, b, c, d); acceptObject(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptObject(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Object,Object,Object,Object> consumer : before)
    		{
    			if(consumer instanceof Consumer4O)
    				((Consumer4O)consumer).acceptObject(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptObject(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4O} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4O} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4O sequence(Consumer4<Object,Object,Object,Object>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
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
    		if(consumers[0] instanceof Consumer4O)
    			return (Consumer4O) consumers[0];
    		else
    			return (Consumer4O) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Object,Object,Object,Object> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4O)
    				((Consumer4O)consumer).acceptObject(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
