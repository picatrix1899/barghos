package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three float input argument and returns no result.
 * Unlike {@link Consumer3f} this may throw Exceptions.
 * {@link ConsumerEx3f} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptFloat(float, float, float)}.
 * 
 * @see Consumerf
 * @see ConsumerExf
 * @see Consumer2f
 * @see ConsumerEx2f
 * @see Consumer3f
 * @see ConsumerEx3f
 * @see Consumer4f
 * @see ConsumerEx4f
 */
@FunctionalInterface
public interface ConsumerEx3f extends ConsumerEx3<Float,Float,Float>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptFloat(float a, float b, float c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing this operation and the operation after.
     */
    default ConsumerEx3f andThenFloat(ConsumerEx3f after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptFloat(a, b, c); after.acceptFloat(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing this operation and the operations after.
     */
	default ConsumerEx3f andThenFloat(ConsumerEx3f... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptFloat(a, b, c); after[0].acceptFloat(a, b, c);};

    	return (a, b, c) -> {acceptFloat(a, b, c); for(ConsumerEx3f consumer : after) consumer.acceptFloat(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing this operation and the operations after.
     */
	default ConsumerEx3f andThenFloat(Iterable<ConsumerEx3f> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptFloat(a, b, c); for(ConsumerEx3f consumer : after) consumer.acceptFloat(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing the operation before and this operation.
     */
    default ConsumerEx3f beforeThatFloat(ConsumerEx3f before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptFloat(a, b, c); acceptFloat(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing the operations before and this operation.
     */
    default ConsumerEx3f beforeThatFloat(ConsumerEx3f... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptFloat(a, b, c); acceptFloat(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3f consumer : before) consumer.acceptFloat(a, b, c); acceptFloat(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing the operations before and this operation.
     */
    default ConsumerEx3f beforeThatFloat(Iterable<ConsumerEx3f> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(ConsumerEx3f consumer : before) consumer.acceptFloat(a, b, c); acceptFloat(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3f} performing the operations.
     */
	static ConsumerEx3f inSequenceFloat(ConsumerEx3f... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3f consumer : consumers) consumer.acceptFloat(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3f} performing the operations.
     */
    static ConsumerEx3f inSequenceFloat(Iterable<ConsumerEx3f> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(ConsumerEx3f consumer : consumers) consumer.acceptFloat(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptFloat} instead.
     */
    @Override
    @Deprecated
    default void accept(Float a, Float b, Float c) throws Exception
    {
    	acceptFloat(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing this operation and the operation after.
     */
    default ConsumerEx3f andThen(ConsumerEx3<Float,Float,Float> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3f)
    	{
    		final ConsumerEx3f originalAfter = (ConsumerEx3f)after;
    		
    		return (a, b, c) -> {acceptFloat(a, b, c); originalAfter.acceptFloat(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptFloat(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3f andThen(ConsumerEx3<Float,Float,Float>... after)
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
    		if(after[0] instanceof ConsumerEx3f)
        	{
        		final ConsumerEx3f originalAfter = (ConsumerEx3f)after[0];
        		
        		return (a, b, c) -> {acceptFloat(a, b, c); originalAfter.acceptFloat(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptFloat(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptFloat(a, b, c);
			
    		for(ConsumerEx3<Float,Float,Float> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3f)
    				((ConsumerEx3f)consumer).acceptFloat(a, b, c);
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
     * @return A new {@link ConsumerEx3f} performing this operation and the operations after.
     */
	default ConsumerEx3f andThen(Iterable<ConsumerEx3<Float,Float,Float>> after)
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
			acceptFloat(a, b, c);
			
    		for(ConsumerEx3<Float,Float,Float> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3f)
    				((ConsumerEx3f)consumer).acceptFloat(a, b, c);
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
     * @return A new {@link ConsumerEx3f} performing the operation before and this operation.
     */
    default ConsumerEx3f beforeThat(ConsumerEx3<Float,Float,Float> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3f)
    	{
    		final ConsumerEx3f originalBefore = (ConsumerEx3f)before;
    		
    		return (a, b, c) -> {originalBefore.acceptFloat(a, b, c); acceptFloat(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptFloat(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3f beforeThat(ConsumerEx3<Float,Float,Float>... before)
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
    		if(before[0] instanceof ConsumerEx3f)
        	{
        		final ConsumerEx3f originalBefore = (ConsumerEx3f)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptFloat(a, b, c); acceptFloat(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptFloat(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Float,Float,Float> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3f)
    				((ConsumerEx3f)consumer).acceptFloat(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptFloat(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3f} performing the operations before and this operation.
     */
    default ConsumerEx3f beforeThat(Iterable<ConsumerEx3<Float,Float,Float>> before)
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
    		for(ConsumerEx3<Float,Float,Float> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3f)
    				((ConsumerEx3f)consumer).acceptFloat(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptFloat(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3f} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3f inSequence(ConsumerEx3<Float,Float,Float>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3f)
    			return (ConsumerEx3f) consumers[0];
    		else
    			return (ConsumerEx3f) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Float,Float,Float> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3f)
    				((ConsumerEx3f)consumer).acceptFloat(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3f} performing the operations.
     */
    static ConsumerEx3f inSequence(Iterable<ConsumerEx3<Float,Float,Float>> consumers)
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
    		for(ConsumerEx3<Float,Float,Float> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3f)
    				((ConsumerEx3f)consumer).acceptFloat(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
