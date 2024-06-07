package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three double input arguments and returns
 * no result. {@link Consumer3D} is expected to operate via side-effects.
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
public interface Consumer3D extends Consumer3<Double,Double,Double>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptDouble(double a, double b, double c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3D} performing this operation and the
     * operation after.
     */
    default Consumer3D thenDouble(Consumer3D after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptDouble(a, b, c); after.acceptDouble(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3D} performing this operation and the
     * operations after.
     */
	default Consumer3D thenDouble(Consumer3D... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptDouble(a, b, c); after[0].acceptDouble(a, b, c);};

    	return (a, b, c) -> {acceptDouble(a, b, c); for(Consumer3D consumer : after) consumer.acceptDouble(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3D} performing the operation before and this
     * operation.
     */
    default Consumer3D beforeDouble(Consumer3D before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptDouble(a, b, c); acceptDouble(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3D} performing the operations before and
     * this operation.
     */
    default Consumer3D beforeDouble(Consumer3D... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptDouble(a, b, c); acceptDouble(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3D consumer : before) consumer.acceptDouble(a, b, c); acceptDouble(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3D} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3D} performing the operations.
     */
	static Consumer3D sequenceDouble(Consumer3D... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3D consumer : consumers) consumer.acceptDouble(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptDouble} instead.
     */
    @Override
    @Deprecated
    default void accept(Double a, Double b, Double c)
    {
    	acceptDouble(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3D} performing this operation and the
     * operation after.
     */
    default Consumer3D then(Consumer3<Double,Double,Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3D)
    	{
    		final Consumer3D originalAfter = (Consumer3D)after;
    		
    		return (a, b, c) -> {acceptDouble(a, b, c); originalAfter.acceptDouble(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptDouble(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3D} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3D then(Consumer3<Double,Double,Double>... after)
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
    		if(after[0] instanceof Consumer3D)
        	{
        		final Consumer3D originalAfter = (Consumer3D)after[0];
        		
        		return (a, b, c) -> {acceptDouble(a, b, c); originalAfter.acceptDouble(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptDouble(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptDouble(a, b, c);
			
    		for(Consumer3<Double,Double,Double> consumer : after)
    		{
    			if(consumer instanceof Consumer3D)
    				((Consumer3D)consumer).acceptDouble(a, b, c);
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
     * @return A new {@link Consumer3D} performing the operation before and this
     * operation.
     */
    default Consumer3D before(Consumer3<Double,Double,Double> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3D)
    	{
    		final Consumer3D originalBefore = (Consumer3D)before;
    		
    		return (a, b, c) -> {originalBefore.acceptDouble(a, b, c); acceptDouble(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptDouble(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3D} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3D before(Consumer3<Double,Double,Double>... before)
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
    		if(before[0] instanceof Consumer3D)
        	{
        		final Consumer3D originalBefore = (Consumer3D)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptDouble(a, b, c); acceptDouble(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptDouble(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Double,Double,Double> consumer : before)
    		{
    			if(consumer instanceof Consumer3D)
    				((Consumer3D)consumer).acceptDouble(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptDouble(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3D} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3D} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3D sequence(Consumer3<Double,Double,Double>... consumers)
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
    		if(consumers[0] instanceof Consumer3D)
    			return (Consumer3D) consumers[0];
    		else
    			return (Consumer3D) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Double,Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3D)
    				((Consumer3D)consumer).acceptDouble(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
