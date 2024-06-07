package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 2-dimensional object array input
 * arguments and returns no result. Unlike {@link Consumer2OA2} this may throw
 * exceptions. {@link ConsumerEx2OA2} is expected to operate via side-effects.
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
public interface ConsumerEx2OA2 extends ConsumerEx2<Object[][],Object[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptObjectArray(Object[][] a, Object[][] b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2OA2} performing this operation and the
     * operation after.
     */
    default ConsumerEx2OA2 thenObject(ConsumerEx2OA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptObjectArray(a, b); after.acceptObjectArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2OA2} performing this operation and the
     * operations after.
     */
	default ConsumerEx2OA2 thenObject(ConsumerEx2OA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptObjectArray(a, b); after[0].acceptObjectArray(a, b);};

    	return (a, b) -> {acceptObjectArray(a, b); for(ConsumerEx2OA2 consumer : after) consumer.acceptObjectArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2OA2} performing the operation before and
     * this operation.
     */
    default ConsumerEx2OA2 beforeObject(ConsumerEx2OA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptObjectArray(a, b); acceptObjectArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2OA2} performing the operations before and
     * this operation.
     */
    default ConsumerEx2OA2 beforeObject(ConsumerEx2OA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptObjectArray(a, b); acceptObjectArray(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2OA2 consumer : before) consumer.acceptObjectArray(a, b); acceptObjectArray(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2OA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2OA2} performing the operations.
     */
	static ConsumerEx2OA2 sequenceObject(ConsumerEx2OA2... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2OA2 consumer : consumers) consumer.acceptObjectArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObjectArray} instead.
     */
    @Override
    @Deprecated
    default void accept(Object[][] a, Object[][] b) throws Exception
    {
    	acceptObjectArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2OA2} performing this operation and the
     * operation after.
     */
    default ConsumerEx2OA2 then(ConsumerEx2<Object[][],Object[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2OA2)
    	{
    		final ConsumerEx2OA2 originalAfter = (ConsumerEx2OA2)after;
    		
    		return (a, b) -> {acceptObjectArray(a, b); originalAfter.acceptObjectArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptObjectArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2OA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2OA2 then(ConsumerEx2<Object[][],Object[][]>... after)
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
    		if(after[0] instanceof ConsumerEx2OA2)
        	{
        		final ConsumerEx2OA2 originalAfter = (ConsumerEx2OA2)after[0];
        		
        		return (a, b) -> {acceptObjectArray(a, b); originalAfter.acceptObjectArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptObjectArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptObjectArray(a, b);
			
    		for(ConsumerEx2<Object[][],Object[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2OA2)
    				((ConsumerEx2OA2)consumer).acceptObjectArray(a, b);
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
     * @return A new {@link ConsumerEx2OA2} performing the operation before and
     * this operation.
     */
    default ConsumerEx2OA2 before(ConsumerEx2<Object[][],Object[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2OA2)
    	{
    		final ConsumerEx2OA2 originalBefore = (ConsumerEx2OA2)before;
    		
    		return (a, b) -> {originalBefore.acceptObjectArray(a, b); acceptObjectArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptObjectArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2OA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2OA2 before(ConsumerEx2<Object[][],Object[][]>... before)
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
    		if(before[0] instanceof ConsumerEx2OA2)
        	{
        		final ConsumerEx2OA2 originalBefore = (ConsumerEx2OA2)before[0];
        		
        		return (a, b) -> {originalBefore.acceptObjectArray(a, b); acceptObjectArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptObjectArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Object[][],Object[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2OA2)
    				((ConsumerEx2OA2)consumer).acceptObjectArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptObjectArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2OA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2OA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2OA2 sequence(ConsumerEx2<Object[][],Object[][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2OA2)
    			return (ConsumerEx2OA2) consumers[0];
    		else
    			return (ConsumerEx2OA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Object[][],Object[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2OA2)
    				((ConsumerEx2OA2)consumer).acceptObjectArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
