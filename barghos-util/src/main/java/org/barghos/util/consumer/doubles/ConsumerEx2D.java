package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two double input arguments and returns
 * no result. Unlike {@link Consumer2D} this may throw exceptions.
 * {@link ConsumerEx2D} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptDouble}.
 * 
 * @see ConsumerD
 * @see ConsumerExD
 * @see Consumer2D
 * @see ConsumerEx2D
 * @see Consumer3D
 * @see ConsumerEx3D
 * @see Consumer4D
 * @see ConsumerEx4D
 */
@FunctionalInterface
public interface ConsumerEx2D extends ConsumerEx2<Double,Double>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptDouble(double a, double b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2D} performing this operation and the
     * operation after.
     */
    default ConsumerEx2D thenDouble(ConsumerEx2D after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptDouble(a, b); after.acceptDouble(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2D} performing this operation and the
     * operations after.
     */
	default ConsumerEx2D thenDouble(ConsumerEx2D... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptDouble(a, b); after[0].acceptDouble(a, b);};

    	return (a, b) -> {acceptDouble(a, b); for(ConsumerEx2D consumer : after) consumer.acceptDouble(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2D} performing the operation before and
     * this operation.
     */
    default ConsumerEx2D beforeDouble(ConsumerEx2D before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptDouble(a, b); acceptDouble(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2D} performing the operations before and
     * this operation.
     */
    default ConsumerEx2D beforeDouble(ConsumerEx2D... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptDouble(a, b); acceptDouble(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2D consumer : before) consumer.acceptDouble(a, b); acceptDouble(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2D} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2D} performing the operations.
     */
	static ConsumerEx2D sequenceDouble(ConsumerEx2D... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2D consumer : consumers) consumer.acceptDouble(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptDouble} instead.
     */
    @Override
    @Deprecated
    default void accept(Double a, Double b) throws Exception
    {
    	acceptDouble(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2D} performing this operation and the
     * operation after.
     */
    default ConsumerEx2D then(ConsumerEx2<Double,Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2D)
    	{
    		final ConsumerEx2D originalAfter = (ConsumerEx2D)after;
    		
    		return (a, b) -> {acceptDouble(a, b); originalAfter.acceptDouble(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptDouble(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2D} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2D then(ConsumerEx2<Double,Double>... after)
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
    		if(after[0] instanceof ConsumerEx2D)
        	{
        		final ConsumerEx2D originalAfter = (ConsumerEx2D)after[0];
        		
        		return (a, b) -> {acceptDouble(a, b); originalAfter.acceptDouble(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptDouble(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptDouble(a, b);
			
    		for(ConsumerEx2<Double,Double> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2D)
    				((ConsumerEx2D)consumer).acceptDouble(a, b);
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
     * @return A new {@link ConsumerEx2D} performing the operation before and
     * this operation.
     */
    default ConsumerEx2D before(ConsumerEx2<Double,Double> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2D)
    	{
    		final ConsumerEx2D originalBefore = (ConsumerEx2D)before;
    		
    		return (a, b) -> {originalBefore.acceptDouble(a, b); acceptDouble(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptDouble(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2D} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2D before(ConsumerEx2<Double,Double>... before)
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
    		if(before[0] instanceof ConsumerEx2D)
        	{
        		final ConsumerEx2D originalBefore = (ConsumerEx2D)before[0];
        		
        		return (a, b) -> {originalBefore.acceptDouble(a, b); acceptDouble(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptDouble(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Double,Double> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2D)
    				((ConsumerEx2D)consumer).acceptDouble(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptDouble(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2D} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2D} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2D sequence(ConsumerEx2<Double,Double>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2D)
    			return (ConsumerEx2D) consumers[0];
    		else
    			return (ConsumerEx2D) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2D)
    				((ConsumerEx2D)consumer).acceptDouble(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
