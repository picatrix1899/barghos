package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 2-dimensional object array input
 * arguments and returns no result. {@link Consumer3OA2} is expected to operate
 * via side-effects.
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
public interface Consumer3OA2 extends Consumer3<Object[][],Object[][],Object[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptObjectArray(Object[][] a, Object[][] b, Object[][] c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3OA2} performing this operation and the
     * operation after.
     */
    default Consumer3OA2 thenObject(Consumer3OA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptObjectArray(a, b, c); after.acceptObjectArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3OA2} performing this operation and the
     * operations after.
     */
	default Consumer3OA2 thenObject(Consumer3OA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptObjectArray(a, b, c); after[0].acceptObjectArray(a, b, c);};

    	return (a, b, c) -> {acceptObjectArray(a, b, c); for(Consumer3OA2 consumer : after) consumer.acceptObjectArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3OA2} performing the operation before and this
     * operation.
     */
    default Consumer3OA2 beforeObject(Consumer3OA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3OA2} performing the operations before and
     * this operation.
     */
    default Consumer3OA2 beforeObject(Consumer3OA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3OA2 consumer : before) consumer.acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3OA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3OA2} performing the operations.
     */
	static Consumer3OA2 sequenceObject(Consumer3OA2... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(Consumer3OA2 consumer : consumers) consumer.acceptObjectArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObjectArray} instead.
     */
    @Override
    @Deprecated
    default void accept(Object[][] a, Object[][] b, Object[][] c)
    {
    	acceptObjectArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3OA2} performing this operation and the
     * operation after.
     */
    default Consumer3OA2 then(Consumer3<Object[][],Object[][],Object[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3OA2)
    	{
    		final Consumer3OA2 originalAfter = (Consumer3OA2)after;
    		
    		return (a, b, c) -> {acceptObjectArray(a, b, c); originalAfter.acceptObjectArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptObjectArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3OA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3OA2 then(Consumer3<Object[][],Object[][],Object[][]>... after)
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
    		if(after[0] instanceof Consumer3OA2)
        	{
        		final Consumer3OA2 originalAfter = (Consumer3OA2)after[0];
        		
        		return (a, b, c) -> {acceptObjectArray(a, b, c); originalAfter.acceptObjectArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptObjectArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptObjectArray(a, b, c);
			
    		for(Consumer3<Object[][],Object[][],Object[][]> consumer : after)
    		{
    			if(consumer instanceof Consumer3OA2)
    				((Consumer3OA2)consumer).acceptObjectArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3OA2} performing the operation before and this
     * operation.
     */
    default Consumer3OA2 before(Consumer3<Object[][],Object[][],Object[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3OA2)
    	{
    		final Consumer3OA2 originalBefore = (Consumer3OA2)before;
    		
    		return (a, b, c) -> {originalBefore.acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptObjectArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3OA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3OA2 before(Consumer3<Object[][],Object[][],Object[][]>... before)
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
    		if(before[0] instanceof Consumer3OA2)
        	{
        		final Consumer3OA2 originalBefore = (Consumer3OA2)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptObjectArray(a, b, c); acceptObjectArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptObjectArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Object[][],Object[][],Object[][]> consumer : before)
    		{
    			if(consumer instanceof Consumer3OA2)
    				((Consumer3OA2)consumer).acceptObjectArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptObjectArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3OA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3OA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3OA2 sequence(Consumer3<Object[][],Object[][],Object[][]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
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
    		if(consumers[0] instanceof Consumer3OA2)
    			return (Consumer3OA2) consumers[0];
    		else
    			return (Consumer3OA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Object[][],Object[][],Object[][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3OA2)
    				((Consumer3OA2)consumer).acceptObjectArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
