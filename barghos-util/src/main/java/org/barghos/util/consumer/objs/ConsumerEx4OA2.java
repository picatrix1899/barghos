package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four 2-dimensional object array input
 * arguments and returns no result. Unlike {@link Consumer4OA2} this may throw
 * exceptions. {@link ConsumerEx4OA2} is expected to operate via side-effects.
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
public interface ConsumerEx4OA2 extends ConsumerEx4<Object[][],Object[][],Object[][],Object[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptObjectArray(Object[][] a, Object[][] b, Object[][] c, Object[][] d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4OA2} performing this operation and the
     * operation after.
     */
    default ConsumerEx4OA2 thenObject(ConsumerEx4OA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptObjectArray(a, b, c, d); after.acceptObjectArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4OA2} performing this operation and the
     * operations after.
     */
	default ConsumerEx4OA2 thenObject(ConsumerEx4OA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptObjectArray(a, b, c, d); after[0].acceptObjectArray(a, b, c, d);};

    	return (a, b, c, d) -> {acceptObjectArray(a, b, c, d); for(ConsumerEx4OA2 consumer : after) consumer.acceptObjectArray(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4OA2} performing the operation before and
     * this operation.
     */
    default ConsumerEx4OA2 beforeObject(ConsumerEx4OA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptObjectArray(a, b, c, d); acceptObjectArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4OA2} performing the operations before and
     * this operation.
     */
    default ConsumerEx4OA2 beforeObject(ConsumerEx4OA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptObjectArray(a, b, c, d); acceptObjectArray(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4OA2 consumer : before) consumer.acceptObjectArray(a, b, c, d); acceptObjectArray(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4OA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4OA2} performing the operations.
     */
	static ConsumerEx4OA2 sequenceObject(ConsumerEx4OA2... consumers)
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
    	
    	return (a, b, c, d) -> {for(ConsumerEx4OA2 consumer : consumers) consumer.acceptObjectArray(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObjectArray} instead.
     */
    @Override
    @Deprecated
    default void accept(Object[][] a, Object[][] b, Object[][] c, Object[][] d) throws Exception
    {
    	acceptObjectArray(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4OA2} performing this operation and the
     * operation after.
     */
    default ConsumerEx4OA2 then(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4OA2)
    	{
    		final ConsumerEx4OA2 originalAfter = (ConsumerEx4OA2)after;
    		
    		return (a, b, c, d) -> {acceptObjectArray(a, b, c, d); originalAfter.acceptObjectArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptObjectArray(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4OA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4OA2 then(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]>... after)
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
    		if(after[0] instanceof ConsumerEx4OA2)
        	{
        		final ConsumerEx4OA2 originalAfter = (ConsumerEx4OA2)after[0];
        		
        		return (a, b, c, d) -> {acceptObjectArray(a, b, c, d); originalAfter.acceptObjectArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptObjectArray(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptObjectArray(a, b, c, d);
			
    		for(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4OA2)
    				((ConsumerEx4OA2)consumer).acceptObjectArray(a, b, c, d);
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
     * @return A new {@link ConsumerEx4OA2} performing the operation before and
     * this operation.
     */
    default ConsumerEx4OA2 before(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4OA2)
    	{
    		final ConsumerEx4OA2 originalBefore = (ConsumerEx4OA2)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptObjectArray(a, b, c, d); acceptObjectArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptObjectArray(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4OA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4OA2 before(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]>... before)
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
    		if(before[0] instanceof ConsumerEx4OA2)
        	{
        		final ConsumerEx4OA2 originalBefore = (ConsumerEx4OA2)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptObjectArray(a, b, c, d); acceptObjectArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptObjectArray(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4OA2)
    				((ConsumerEx4OA2)consumer).acceptObjectArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptObjectArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4OA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4OA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4OA2 sequence(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx4OA2)
    			return (ConsumerEx4OA2) consumers[0];
    		else
    			return (ConsumerEx4OA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4OA2)
    				((ConsumerEx4OA2)consumer).acceptObjectArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
