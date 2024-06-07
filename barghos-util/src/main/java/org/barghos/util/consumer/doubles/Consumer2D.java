package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two double input arguments and returns
 * no result. {@link Consumer2D} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptDouble(double, double)}.
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
public interface Consumer2D extends Consumer2<Double,Double>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptDouble(double a, double b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2D} performing this operation and the
     * operation after.
     */
    default Consumer2D thenDouble(Consumer2D after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptDouble(a, b); after.acceptDouble(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2D} performing this operation and the
     * operations after.
     */
	default Consumer2D thenDouble(Consumer2D... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptDouble(a, b); after[0].acceptDouble(a, b);};

    	return (a, b) -> {acceptDouble(a, b); for(Consumer2D consumer : after) consumer.acceptDouble(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2D} performing the operation before and this
     * operation.
     */
    default Consumer2D beforeDouble(Consumer2D before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptDouble(a, b); acceptDouble(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2D} performing the operations before and
     * this operation.
     */
    default Consumer2D beforeDouble(Consumer2D... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptDouble(a, b); acceptDouble(a, b);};
    	
    	return (a, b) -> {for(Consumer2D consumer : before) consumer.acceptDouble(a, b); acceptDouble(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2D} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2D} performing the operations.
     */
	static Consumer2D sequenceDouble(Consumer2D... consumers)
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
    	
    	return (a, b) -> {for(Consumer2D consumer : consumers) consumer.acceptDouble(a, b);};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer2
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptDouble(double, double)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Double a, Double b)
    {
    	acceptDouble(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2D} performing this operation and the
     * operation after.
     */
    default Consumer2D thenGeneric(Consumer2<Double,Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2D)
    	{
    		final Consumer2D originalAfter = (Consumer2D)after;
    		
    		return (a, b) -> {acceptDouble(a, b); originalAfter.acceptDouble(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptDouble(a, b); after.acceptGeneric(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2D} performing this operation and the
     * operation after.
     */
    default Consumer2D thenGeneric(java.util.function.BiConsumer<? super Double,? super Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2D)
    	{
    		final Consumer2D originalAfter = (Consumer2D)after;
    		
    		return (a, b) -> {acceptDouble(a, b); originalAfter.acceptDouble(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptDouble(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2D} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2D thenGeneric(Consumer2<Double,Double>... after)
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
    		if(after[0] instanceof Consumer2D)
        	{
        		final Consumer2D originalAfter = (Consumer2D)after[0];
        		
        		return (a, b) -> {acceptDouble(a, b); originalAfter.acceptDouble(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptDouble(a, b); after[0].acceptGeneric(a, b);};
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
			
    		for(Consumer2<Double,Double> consumer : after)
    		{
    			if(consumer instanceof Consumer2D)
    				((Consumer2D)consumer).acceptDouble(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2D} performing the operation before and this
     * operation.
     */
    default Consumer2D beforeGeneric(Consumer2<Double,Double> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2D)
    	{
    		final Consumer2D originalBefore = (Consumer2D)before;
    		
    		return (a, b) -> {originalBefore.acceptDouble(a, b); acceptDouble(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.acceptGeneric(a, b); acceptDouble(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2D} performing the operation before and this
     * operation.
     */
    default Consumer2D beforeGeneric(java.util.function.BiConsumer<? super Double,? super Double> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2D)
    	{
    		final Consumer2D originalBefore = (Consumer2D)before;
    		
    		return (a, b) -> {originalBefore.acceptDouble(a, b); acceptDouble(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptDouble(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2D} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2D beforeGeneric(Consumer2<Double,Double>... before)
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
    		if(before[0] instanceof Consumer2D)
        	{
        		final Consumer2D originalBefore = (Consumer2D)before[0];
        		
        		return (a, b) -> {originalBefore.acceptDouble(a, b); acceptDouble(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].acceptGeneric(a, b); acceptDouble(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Double,Double> consumer : before)
    		{
    			if(consumer instanceof Consumer2D)
    				((Consumer2D)consumer).acceptDouble(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    		
    		acceptDouble(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2D} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2D} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2D sequenceGeneric(Consumer2<Double,Double>... consumers)
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
    		if(consumers[0] instanceof Consumer2D)
    			return (Consumer2D) consumers[0];
    		else
    			return (Consumer2D) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2D)
    				((Consumer2D)consumer).acceptDouble(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
    /*
     * =============================
     * java.util.function.BiConsumer
     * =============================
     */
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptDouble(double, double)} instead.
     */
    @Override
    @Deprecated
    default void accept(Double a, Double b)
    {
    	acceptDouble(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.BiConsumer)} instead.
     */
    @Override
    @Deprecated
    default Consumer2D andThen(java.util.function.BiConsumer<? super Double,? super Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptDouble(a, b); after.accept(a, b);};
    }
}
