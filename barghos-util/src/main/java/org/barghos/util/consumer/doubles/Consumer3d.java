package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three double input arguments and returns no result.
 * {@link Consumer3d} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptDouble(double, double, double)}.
 * 
 * @see Consumerd
 * @see ConsumerExd
 * @see Consumer2d
 * @see ConsumerEx2d
 * @see Consumer3d
 * @see ConsumerEx3d
 * @see Consumer4d
 * @see ConsumerEx4d
 */
@FunctionalInterface
public interface Consumer3d extends Consumer3<Double,Double,Double>
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
     * @return A new {@link Consumer3d} performing this operation and the operation after.
     */
    default Consumer3d andThenDouble(Consumer3d after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptDouble(a, b, c); after.acceptDouble(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3d} performing this operation and the operations after.
     */
	default Consumer3d andThenDouble(Consumer3d... after)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptDouble(a, b, c); after[0].acceptDouble(a, b, c);};

    	return (a, b, c) -> {acceptDouble(a, b, c); for(Consumer3d consumer : after) consumer.acceptDouble(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3d} performing this operation and the operations after.
     */
	default Consumer3d andThenDouble(Iterable<Consumer3d> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptDouble(a, b, c); for(Consumer3d consumer : after) consumer.acceptDouble(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3d} performing the operation before and this operation.
     */
    default Consumer3d beforeThatDouble(Consumer3d before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptDouble(a, b, c); acceptDouble(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3d} performing the operations before and this operation.
     */
    default Consumer3d beforeThatDouble(Consumer3d... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptDouble(a, b, c); acceptDouble(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3d consumer : before) consumer.acceptDouble(a, b, c); acceptDouble(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3d} performing the operations before and this operation.
     */
    default Consumer3d beforeThatDouble(Iterable<Consumer3d> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3d consumer : before) consumer.acceptDouble(a, b, c); acceptDouble(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3d} performing the operations.
     */
	static Consumer3d inSequenceDouble(Consumer3d... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(Consumer3d consumer : consumers) consumer.acceptDouble(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3d} performing the operations.
     */
    static Consumer3d inSequenceDouble(Iterable<Consumer3d> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3d consumer : consumers) consumer.acceptDouble(a, b, c);};
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
     * @return A new {@link Consumer3d} performing this operation and the operation after.
     */
    default Consumer3d andThen(Consumer3<Double,Double,Double> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3d)
    	{
    		final Consumer3d originalAfter = (Consumer3d)after;
    		
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
     * @return A new {@link Consumer3d} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3d andThen(Consumer3<Double,Double,Double>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof Consumer3d)
        	{
        		final Consumer3d originalAfter = (Consumer3d)after[0];
        		
        		return (a, b, c) -> {acceptDouble(a, b, c); originalAfter.acceptDouble(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptDouble(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptDouble(a, b, c);
			
    		for(Consumer3<Double,Double,Double> consumer : after)
    		{
    			if(consumer instanceof Consumer3d)
    				((Consumer3d)consumer).acceptDouble(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3d} performing this operation and the operations after.
     */
	default Consumer3d andThen(Iterable<Consumer3<Double,Double,Double>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
		/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
		return (a, b, c) -> {
			acceptDouble(a, b, c);
			
    		for(Consumer3<Double,Double,Double> consumer : after)
    		{
    			if(consumer instanceof Consumer3d)
    				((Consumer3d)consumer).acceptDouble(a, b, c);
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
     * @return A new {@link Consumer3d} performing the operation before and this operation.
     */
    default Consumer3d beforeThat(Consumer3<Double,Double,Double> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3d)
    	{
    		final Consumer3d originalBefore = (Consumer3d)before;
    		
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
     * @return A new {@link Consumer3d} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3d beforeThat(Consumer3<Double,Double,Double>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof Consumer3d)
        	{
        		final Consumer3d originalBefore = (Consumer3d)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptDouble(a, b, c); acceptDouble(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptDouble(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Double,Double,Double> consumer : before)
    		{
    			if(consumer instanceof Consumer3d)
    				((Consumer3d)consumer).acceptDouble(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptDouble(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3d} performing the operations before and this operation.
     */
    default Consumer3d beforeThat(Iterable<Consumer3<Double,Double,Double>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Double,Double,Double> consumer : before)
    		{
    			if(consumer instanceof Consumer3d)
    				((Consumer3d)consumer).acceptDouble(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptDouble(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3d} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3d inSequence(Consumer3<Double,Double,Double>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer3d)
    			return (Consumer3d) consumers[0];
    		else
    			return (Consumer3d) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Double,Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3d)
    				((Consumer3d)consumer).acceptDouble(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3d} performing the operations.
     */
    static Consumer3d inSequence(Iterable<Consumer3<Double,Double,Double>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Double,Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3d)
    				((Consumer3d)consumer).acceptDouble(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
