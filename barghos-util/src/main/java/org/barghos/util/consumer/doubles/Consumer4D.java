package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four double input arguments and returns
 * no result. {@link Consumer4D} is expected to operate via side-effects.
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
public interface Consumer4D extends Consumer4<Double,Double,Double,Double>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptDouble(double a, double b, double c, double d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4D} performing this operation and the
     * operation after.
     */
    default Consumer4D thenDouble(Consumer4D after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptDouble(a, b, c, d); after.acceptDouble(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4D} performing this operation and the
     * operations after.
     */
	default Consumer4D thenDouble(Consumer4D... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptDouble(a, b, c, d); after[0].acceptDouble(a, b, c, d);};

    	return (a, b, c, d) -> {acceptDouble(a, b, c, d); for(Consumer4D consumer : after) consumer.acceptDouble(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4D} performing the operation before and this
     * operation.
     */
    default Consumer4D beforeDouble(Consumer4D before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4D} performing the operations before and
     * this operation.
     */
    default Consumer4D beforeDouble(Consumer4D... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4D consumer : before) consumer.acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4D} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4D} performing the operations.
     */
	static Consumer4D sequenceDouble(Consumer4D... consumers)
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
    	
    	return (a, b, c, d) -> {for(Consumer4D consumer : consumers) consumer.acceptDouble(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptDouble} instead.
     */
    @Override
    @Deprecated
    default void accept(Double a, Double b, Double c, Double d)
    {
    	acceptDouble(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4D} performing this operation and the
     * operation after.
     */
    default Consumer4D then(Consumer4<Double,Double,Double,Double> after)
    {
		Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4D)
    	{
    		final Consumer4D originalAfter = (Consumer4D)after;
    		
    		return (a, b, c, d) -> {acceptDouble(a, b, c, d); originalAfter.acceptDouble(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptDouble(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4D} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4D then(Consumer4<Double,Double,Double,Double>... after)
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
    		if(after[0] instanceof Consumer4D)
        	{
        		final Consumer4D originalAfter = (Consumer4D)after[0];
        		
        		return (a, b, c, d) -> {acceptDouble(a, b, c, d); originalAfter.acceptDouble(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptDouble(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptDouble(a, b, c, d);
			
    		for(Consumer4<Double,Double,Double,Double> consumer : after)
    		{
    			if(consumer instanceof Consumer4D)
    				((Consumer4D)consumer).acceptDouble(a, b, c, d);
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
     * @return A new {@link Consumer4D} performing the operation before and this
     * operation.
     */
    default Consumer4D before(Consumer4<Double,Double,Double,Double> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4D)
    	{
    		final Consumer4D originalBefore = (Consumer4D)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptDouble(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4D} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4D before(Consumer4<Double,Double,Double,Double>... before)
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
    		if(before[0] instanceof Consumer4D)
        	{
        		final Consumer4D originalBefore = (Consumer4D)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptDouble(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Double,Double,Double,Double> consumer : before)
    		{
    			if(consumer instanceof Consumer4D)
    				((Consumer4D)consumer).acceptDouble(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptDouble(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4D} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4D} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4D sequence(Consumer4<Double,Double,Double,Double>... consumers)
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
    		if(consumers[0] instanceof Consumer4D)
    			return (Consumer4D) consumers[0];
    		else
    			return (Consumer4D) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Double,Double,Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4D)
    				((Consumer4D)consumer).acceptDouble(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
