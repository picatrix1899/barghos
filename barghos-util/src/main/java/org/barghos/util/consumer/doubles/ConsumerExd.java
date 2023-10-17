package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one double input argument and returns no result.
 * Unlike {@link Consumerd} this may throw Exceptions.
 * {@link ConsumerExd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptDouble(double)}.
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
public interface ConsumerExd extends ConsumerEx<Double>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptDouble(double a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExd} performing this operation and the operation after.
     */
    default ConsumerExd andThenDouble(ConsumerExd after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptDouble(a); after.acceptDouble(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExd} performing this operation and the operations after.
     */
	default ConsumerExd andThenDouble(ConsumerExd... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptDouble(a); after[0].acceptDouble(a);};

    	return (a) -> {acceptDouble(a); for(ConsumerExd consumer : after) consumer.acceptDouble(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExd} performing this operation and the operations after.
     */
	default ConsumerExd andThenDouble(Iterable<ConsumerExd> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptDouble(a); for(ConsumerExd consumer : after) consumer.acceptDouble(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExd} performing the operation before and this operation.
     */
    default ConsumerExd beforeThatDouble(ConsumerExd before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptDouble(a); acceptDouble(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExd} performing the operations before and this operation.
     */
    default ConsumerExd beforeThatDouble(ConsumerExd... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptDouble(a); acceptDouble(a);};
    	
    	return (a) -> {for(ConsumerExd consumer : before) consumer.acceptDouble(a); acceptDouble(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExd} performing the operations before and this operation.
     */
    default ConsumerExd beforeThatDouble(Iterable<ConsumerExd> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExd consumer : before) consumer.acceptDouble(a); acceptDouble(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExd} performing the operations.
     */
	static ConsumerExd inSequenceDouble(ConsumerExd... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerExd consumer : consumers) consumer.acceptDouble(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExd} performing the operations.
     */
    static ConsumerExd inSequenceDouble(Iterable<ConsumerExd> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExd consumer : consumers) consumer.acceptDouble(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptDouble} instead.
     */
    @Override
    @Deprecated
    default void accept(Double a) throws Exception
    {
    	acceptDouble(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExd} performing this operation and the operation after.
     */
    default ConsumerExd andThen(ConsumerEx<Double> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExd)
    	{
    		final ConsumerExd originalAfter = (ConsumerExd)after;
    		
    		return (a) -> {acceptDouble(a); originalAfter.acceptDouble(a);};
    	}
    	else
    	{
    		return (a) -> {acceptDouble(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExd} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExd andThen(ConsumerEx<Double>... after)
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
    		if(after[0] instanceof ConsumerExd)
        	{
        		final ConsumerExd originalAfter = (ConsumerExd)after[0];
        		
        		return (a) -> {acceptDouble(a); originalAfter.acceptDouble(a);};
        	}
        	else
        	{
        		return (a) -> {acceptDouble(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptDouble(a);
			
    		for(ConsumerEx<Double> consumer : after)
    		{
    			if(consumer instanceof ConsumerExd)
    				((ConsumerExd)consumer).acceptDouble(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExd} performing this operation and the operations after.
     */
	default ConsumerExd andThen(Iterable<ConsumerEx<Double>> after)
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
		return (a) -> {
			acceptDouble(a);
			
    		for(ConsumerEx<Double> consumer : after)
    		{
    			if(consumer instanceof ConsumerExd)
    				((ConsumerExd)consumer).acceptDouble(a);
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
     * @return A new {@link ConsumerExd} performing the operation before and this operation.
     */
    default ConsumerExd beforeThat(ConsumerEx<Double> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExd)
    	{
    		final ConsumerExd originalBefore = (ConsumerExd)before;
    		
    		return (a) -> {originalBefore.acceptDouble(a); acceptDouble(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptDouble(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExd} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExd beforeThat(ConsumerEx<Double>... before)
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
    		if(before[0] instanceof ConsumerExd)
        	{
        		final ConsumerExd originalBefore = (ConsumerExd)before[0];
        		
        		return (a) -> {originalBefore.acceptDouble(a); acceptDouble(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptDouble(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Double> consumer : before)
    		{
    			if(consumer instanceof ConsumerExd)
    				((ConsumerExd)consumer).acceptDouble(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptDouble(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExd} performing the operations before and this operation.
     */
    default ConsumerExd beforeThat(Iterable<ConsumerEx<Double>> before)
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
    	return (a) -> {
    		for(ConsumerEx<Double> consumer : before)
    		{
    			if(consumer instanceof ConsumerExd)
    				((ConsumerExd)consumer).acceptDouble(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptDouble(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExd inSequence(ConsumerEx<Double>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerExd)
    			return (ConsumerExd) consumers[0];
    		else
    			return (ConsumerExd) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Double> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExd)
    				((ConsumerExd)consumer).acceptDouble(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExd} performing the operations.
     */
    static ConsumerExd inSequence(Iterable<ConsumerEx<Double>> consumers)
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
    	return (a) -> {
    		for(ConsumerEx<Double> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExd)
    				((ConsumerExd)consumer).acceptDouble(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
