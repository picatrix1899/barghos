package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two double input argument and returns no result.
 * Unlike {@link Consumer2d} this may throw Exceptions.
 * {@link ConsumerEx2d} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptDouble(double, double)}.
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
public interface ConsumerEx2d extends ConsumerEx2<Double,Double>
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
     * @return A new {@link ConsumerEx2d} performing this operation and the operation after.
     */
    default ConsumerEx2d andThenDouble(ConsumerEx2d after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptDouble(a, b); after.acceptDouble(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2d} performing this operation and the operations after.
     */
	default ConsumerEx2d andThenDouble(ConsumerEx2d... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptDouble(a, b); after[0].acceptDouble(a, b);};

    	return (a, b) -> {acceptDouble(a, b); for(ConsumerEx2d consumer : after) consumer.acceptDouble(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2d} performing this operation and the operations after.
     */
	default ConsumerEx2d andThenDouble(Iterable<ConsumerEx2d> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptDouble(a, b); for(ConsumerEx2d consumer : after) consumer.acceptDouble(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2d} performing the operation before and this operation.
     */
    default ConsumerEx2d beforeThatDouble(ConsumerEx2d before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptDouble(a, b); acceptDouble(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2d} performing the operations before and this operation.
     */
    default ConsumerEx2d beforeThatDouble(ConsumerEx2d... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptDouble(a, b); acceptDouble(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2d consumer : before) consumer.acceptDouble(a, b); acceptDouble(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2d} performing the operations before and this operation.
     */
    default ConsumerEx2d beforeThatDouble(Iterable<ConsumerEx2d> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2d consumer : before) consumer.acceptDouble(a, b); acceptDouble(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2d} performing the operations.
     */
	static ConsumerEx2d inSequenceDouble(ConsumerEx2d... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(ConsumerEx2d consumer : consumers) consumer.acceptDouble(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2d} performing the operations.
     */
    static ConsumerEx2d inSequenceDouble(Iterable<ConsumerEx2d> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2d consumer : consumers) consumer.acceptDouble(a, b);};
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
     * @return A new {@link ConsumerEx2d} performing this operation and the operation after.
     */
    default ConsumerEx2d andThen(ConsumerEx2<Double,Double> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2d)
    	{
    		final ConsumerEx2d originalAfter = (ConsumerEx2d)after;
    		
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
     * @return A new {@link ConsumerEx2d} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2d andThen(ConsumerEx2<Double,Double>... after)
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
    		if(after[0] instanceof ConsumerEx2d)
        	{
        		final ConsumerEx2d originalAfter = (ConsumerEx2d)after[0];
        		
        		return (a, b) -> {acceptDouble(a, b); originalAfter.acceptDouble(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptDouble(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptDouble(a, b);
			
    		for(ConsumerEx2<Double,Double> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2d)
    				((ConsumerEx2d)consumer).acceptDouble(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2d} performing this operation and the operations after.
     */
	default ConsumerEx2d andThen(Iterable<ConsumerEx2<Double,Double>> after)
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
		return (a, b) -> {
			acceptDouble(a, b);
			
    		for(ConsumerEx2<Double,Double> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2d)
    				((ConsumerEx2d)consumer).acceptDouble(a, b);
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
     * @return A new {@link ConsumerEx2d} performing the operation before and this operation.
     */
    default ConsumerEx2d beforeThat(ConsumerEx2<Double,Double> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2d)
    	{
    		final ConsumerEx2d originalBefore = (ConsumerEx2d)before;
    		
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
     * @return A new {@link ConsumerEx2d} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2d beforeThat(ConsumerEx2<Double,Double>... before)
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
    		if(before[0] instanceof ConsumerEx2d)
        	{
        		final ConsumerEx2d originalBefore = (ConsumerEx2d)before[0];
        		
        		return (a, b) -> {originalBefore.acceptDouble(a, b); acceptDouble(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptDouble(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Double,Double> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2d)
    				((ConsumerEx2d)consumer).acceptDouble(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptDouble(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2d} performing the operations before and this operation.
     */
    default ConsumerEx2d beforeThat(Iterable<ConsumerEx2<Double,Double>> before)
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
    	return (a, b) -> {
    		for(ConsumerEx2<Double,Double> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2d)
    				((ConsumerEx2d)consumer).acceptDouble(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptDouble(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2d} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2d inSequence(ConsumerEx2<Double,Double>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerEx2d)
    			return (ConsumerEx2d) consumers[0];
    		else
    			return (ConsumerEx2d) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2d)
    				((ConsumerEx2d)consumer).acceptDouble(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2d} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2d} performing the operations.
     */
    static ConsumerEx2d inSequence(Iterable<ConsumerEx2<Double,Double>> consumers)
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
    	return (a, b) -> {
    		for(ConsumerEx2<Double,Double> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2d)
    				((ConsumerEx2d)consumer).acceptDouble(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
