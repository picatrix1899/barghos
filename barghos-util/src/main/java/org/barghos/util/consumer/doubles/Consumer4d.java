package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four double input arguments and returns no result.
 * {@link Consumer4d} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptDouble(double, double, double, double)}.
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
public interface Consumer4d extends Consumer4<Double,Double,Double,Double>
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
     * @return A new {@link Consumer4d} performing this operation and the operation after.
     */
    default Consumer4d andThenDouble(Consumer4d after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptDouble(a, b, c, d); after.acceptDouble(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4d} performing this operation and the operations after.
     */
	default Consumer4d andThenDouble(Consumer4d... after)
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
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptDouble(a, b, c, d); after[0].acceptDouble(a, b, c, d);};

    	return (a, b, c, d) -> {acceptDouble(a, b, c, d); for(Consumer4d consumer : after) consumer.acceptDouble(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4d} performing this operation and the operations after.
     */
	default Consumer4d andThenDouble(Iterable<Consumer4d> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptDouble(a, b, c, d); for(Consumer4d consumer : after) consumer.acceptDouble(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4d} performing the operation before and this operation.
     */
    default Consumer4d beforeThatDouble(Consumer4d before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4d} performing the operations before and this operation.
     */
    default Consumer4d beforeThatDouble(Consumer4d... before)
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
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4d consumer : before) consumer.acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4d} performing the operations before and this operation.
     */
    default Consumer4d beforeThatDouble(Iterable<Consumer4d> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(Consumer4d consumer : before) consumer.acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4d} performing the operations.
     */
	static Consumer4d inSequenceDouble(Consumer4d... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(Consumer4d consumer : consumers) consumer.acceptDouble(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4d} performing the operations.
     */
    static Consumer4d inSequenceDouble(Iterable<Consumer4d> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(Consumer4d consumer : consumers) consumer.acceptDouble(a, b, c, d);};
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
     * @return A new {@link Consumer4d} performing this operation and the operation after.
     */
    default Consumer4d andThen(Consumer4<Double,Double,Double,Double> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4d)
    	{
    		final Consumer4d originalAfter = (Consumer4d)after;
    		
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
     * @return A new {@link Consumer4d} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4d andThen(Consumer4<Double,Double,Double,Double>... after)
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
    		if(after[0] instanceof Consumer4d)
        	{
        		final Consumer4d originalAfter = (Consumer4d)after[0];
        		
        		return (a, b, c, d) -> {acceptDouble(a, b, c, d); originalAfter.acceptDouble(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptDouble(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
			acceptDouble(a, b, c, d);
			
    		for(Consumer4<Double,Double,Double,Double> consumer : after)
    		{
    			if(consumer instanceof Consumer4d)
    				((Consumer4d)consumer).acceptDouble(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4d} performing this operation and the operations after.
     */
	default Consumer4d andThen(Iterable<Consumer4<Double,Double,Double,Double>> after)
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
		return (a, b, c, d) -> {
			acceptDouble(a, b, c, d);
			
    		for(Consumer4<Double,Double,Double,Double> consumer : after)
    		{
    			if(consumer instanceof Consumer4d)
    				((Consumer4d)consumer).acceptDouble(a, b, c, d);
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
     * @return A new {@link Consumer4d} performing the operation before and this operation.
     */
    default Consumer4d beforeThat(Consumer4<Double,Double,Double,Double> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4d)
    	{
    		final Consumer4d originalBefore = (Consumer4d)before;
    		
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
     * @return A new {@link Consumer4d} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4d beforeThat(Consumer4<Double,Double,Double,Double>... before)
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
    		if(before[0] instanceof Consumer4d)
        	{
        		final Consumer4d originalBefore = (Consumer4d)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptDouble(a, b, c, d); acceptDouble(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptDouble(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Double,Double,Double,Double> consumer : before)
    		{
    			if(consumer instanceof Consumer4d)
    				((Consumer4d)consumer).acceptDouble(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptDouble(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4d} performing the operations before and this operation.
     */
    default Consumer4d beforeThat(Iterable<Consumer4<Double,Double,Double,Double>> before)
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
    	return (a, b, c, d) -> {
    		for(Consumer4<Double,Double,Double,Double> consumer : before)
    		{
    			if(consumer instanceof Consumer4d)
    				((Consumer4d)consumer).acceptDouble(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptDouble(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4d} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4d inSequence(Consumer4<Double,Double,Double,Double>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer4d)
    			return (Consumer4d) consumers[0];
    		else
    			return (Consumer4d) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Double,Double,Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4d)
    				((Consumer4d)consumer).acceptDouble(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer4d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4d} performing the operations.
     */
    static Consumer4d inSequence(Iterable<Consumer4<Double,Double,Double,Double>> consumers)
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
    	return (a, b, c, d) -> {
    		for(Consumer4<Double,Double,Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4d)
    				((Consumer4d)consumer).acceptDouble(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
