package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 2-dimensional object array input
 * argument and returns no result. Unlike {@link ConsumerOA2} this may throw
 * exceptions. {@link ConsumerExOA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptObjectArray}.
 * 
 * @see ConsumerOA2
 * @see ConsumerExOA2
 * @see Consumer2OA2
 * @see ConsumerEx2OA2
 * @see Consumer3OA2
 * @see ConsumerEx3OA2
 * @see Consumer4OA2
 * @see ConsumerEx4OA2
 */
@FunctionalInterface
public interface ConsumerExOA2 extends ConsumerEx<Object[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptObjectArray(Object[][] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExOA2} performing this operation and the
     * operation after.
     */
    default ConsumerExOA2 thenObject(ConsumerExOA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptObjectArray(a); after.acceptObjectArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExOA2} performing this operation and the
     * operations after.
     */
	default ConsumerExOA2 thenObject(ConsumerExOA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptObjectArray(a); after[0].acceptObjectArray(a);};

    	return (a) -> {acceptObjectArray(a); for(ConsumerExOA2 consumer : after) consumer.acceptObjectArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExOA2} performing the operation before and
     * this operation.
     */
    default ConsumerExOA2 beforeObject(ConsumerExOA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptObjectArray(a); acceptObjectArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExOA2} performing the operations before and
     * this operation.
     */
    default ConsumerExOA2 beforeObject(ConsumerExOA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptObjectArray(a); acceptObjectArray(a);};
    	
    	return (a) -> {for(ConsumerExOA2 consumer : before) consumer.acceptObjectArray(a); acceptObjectArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExOA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExOA2} performing the operations.
     */
	static ConsumerExOA2 sequenceObject(ConsumerExOA2... consumers)
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
    	
    	return (a) -> {for(ConsumerExOA2 consumer : consumers) consumer.acceptObjectArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObjectArray} instead.
     */
    @Override
    @Deprecated
    default void accept(Object[][] a) throws Exception
    {
    	acceptObjectArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExOA2} performing this operation and the
     * operation after.
     */
    default ConsumerExOA2 then(ConsumerEx<Object[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExOA2)
    	{
    		final ConsumerExOA2 originalAfter = (ConsumerExOA2)after;
    		
    		return (a) -> {acceptObjectArray(a); originalAfter.acceptObjectArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptObjectArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExOA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExOA2 then(ConsumerEx<Object[][]>... after)
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
    		if(after[0] instanceof ConsumerExOA2)
        	{
        		final ConsumerExOA2 originalAfter = (ConsumerExOA2)after[0];
        		
        		return (a) -> {acceptObjectArray(a); originalAfter.acceptObjectArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptObjectArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptObjectArray(a);
			
    		for(ConsumerEx<Object[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExOA2)
    				((ConsumerExOA2)consumer).acceptObjectArray(a);
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
     * @return A new {@link ConsumerExOA2} performing the operation before and
     * this operation.
     */
    default ConsumerExOA2 before(ConsumerEx<Object[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExOA2)
    	{
    		final ConsumerExOA2 originalBefore = (ConsumerExOA2)before;
    		
    		return (a) -> {originalBefore.acceptObjectArray(a); acceptObjectArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptObjectArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExOA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExOA2 before(ConsumerEx<Object[][]>... before)
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
    		if(before[0] instanceof ConsumerExOA2)
        	{
        		final ConsumerExOA2 originalBefore = (ConsumerExOA2)before[0];
        		
        		return (a) -> {originalBefore.acceptObjectArray(a); acceptObjectArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptObjectArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Object[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExOA2)
    				((ConsumerExOA2)consumer).acceptObjectArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptObjectArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExOA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExOA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExOA2 sequence(ConsumerEx<Object[][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerExOA2)
    			return (ConsumerExOA2) consumers[0];
    		else
    			return (ConsumerExOA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Object[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExOA2)
    				((ConsumerExOA2)consumer).acceptObjectArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
