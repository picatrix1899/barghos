package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 3-dimensional object array input
 * argument and returns no result. {@link ConsumerOA3} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptObjectArray}.
 * 
 * @see ConsumerOA3
 * @see ConsumerExOA3
 * @see Consumer2OA3
 * @see ConsumerEx2OA3
 * @see Consumer3OA3
 * @see ConsumerEx3OA3
 * @see Consumer4OA3
 * @see ConsumerEx4OA3
 */
@FunctionalInterface
public interface ConsumerOA3 extends Consumer<Object[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptObjectArray(Object[][][] a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerOA3} performing this operation and the
     * operation after.
     */
    default ConsumerOA3 thenObject(ConsumerOA3 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptObjectArray(a); after.acceptObjectArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerOA3} performing this operation and the
     * operations after.
     */
	default ConsumerOA3 thenObject(ConsumerOA3... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptObjectArray(a); after[0].acceptObjectArray(a);};

    	return (a) -> {acceptObjectArray(a); for(ConsumerOA3 consumer : after) consumer.acceptObjectArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerOA3} performing the operation before and this
     * operation.
     */
    default ConsumerOA3 beforeObject(ConsumerOA3 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptObjectArray(a); acceptObjectArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerOA3} performing the operations before and this
     * operation.
     */
    default ConsumerOA3 beforeObject(ConsumerOA3... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptObjectArray(a); acceptObjectArray(a);};
    	
    	return (a) -> {for(ConsumerOA3 consumer : before) consumer.acceptObjectArray(a); acceptObjectArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerOA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerOA3} performing the operations.
     */
	static ConsumerOA3 sequenceObject(ConsumerOA3... consumers)
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
    	
    	return (a) -> {for(ConsumerOA3 consumer : consumers) consumer.acceptObjectArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObjectArray} instead.
     */
    @Override
    @Deprecated
    default void accept(Object[][][] a)
    {
    	acceptObjectArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerOA3} performing this operation and the
     * operation after.
     */
    default ConsumerOA3 then(Consumer<Object[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerOA3)
    	{
    		final ConsumerOA3 originalAfter = (ConsumerOA3)after;
    		
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
     * @return A new {@link ConsumerOA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerOA3 then(Consumer<Object[][][]>... after)
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
    		if(after[0] instanceof ConsumerOA3)
        	{
        		final ConsumerOA3 originalAfter = (ConsumerOA3)after[0];
        		
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
			
    		for(Consumer<Object[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerOA3)
    				((ConsumerOA3)consumer).acceptObjectArray(a);
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
     * @return A new {@link ConsumerOA3} performing the operation before and this
     * operation.
     */
    default ConsumerOA3 before(Consumer<Object[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerOA3)
    	{
    		final ConsumerOA3 originalBefore = (ConsumerOA3)before;
    		
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
     * @return A new {@link ConsumerOA3} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerOA3 before(Consumer<Object[][][]>... before)
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
    		if(before[0] instanceof ConsumerOA3)
        	{
        		final ConsumerOA3 originalBefore = (ConsumerOA3)before[0];
        		
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
    		for(Consumer<Object[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerOA3)
    				((ConsumerOA3)consumer).acceptObjectArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptObjectArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerOA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerOA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerOA3 sequence(Consumer<Object[][][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerOA3)
    			return (ConsumerOA3) consumers[0];
    		else
    			return (ConsumerOA3) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Object[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerOA3)
    				((ConsumerOA3)consumer).acceptObjectArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default ConsumerOA3 andThen(java.util.function.Consumer<? super Object[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptObjectArray(a); after.accept(a);};
    }
}
