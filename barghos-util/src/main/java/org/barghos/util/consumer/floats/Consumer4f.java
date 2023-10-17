package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four float input arguments and returns no result.
 * {@link Consumer4f} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptFloat(float, float, float, float)}.
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
public interface Consumer4f extends Consumer4<Float,Float,Float,Float>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptFloat(float a, float b, float c, float d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4f} performing this operation and the operation after.
     */
    default Consumer4f andThenFloat(Consumer4f after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptFloat(a, b, c, d); after.acceptFloat(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4f} performing this operation and the operations after.
     */
	default Consumer4f andThenFloat(Consumer4f... after)
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
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptFloat(a, b, c, d); after[0].acceptFloat(a, b, c, d);};

    	return (a, b, c, d) -> {acceptFloat(a, b, c, d); for(Consumer4f consumer : after) consumer.acceptFloat(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4f} performing this operation and the operations after.
     */
	default Consumer4f andThenFloat(Iterable<Consumer4f> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptFloat(a, b, c, d); for(Consumer4f consumer : after) consumer.acceptFloat(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4f} performing the operation before and this operation.
     */
    default Consumer4f beforeThatFloat(Consumer4f before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptFloat(a, b, c, d); acceptFloat(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4f} performing the operations before and this operation.
     */
    default Consumer4f beforeThatFloat(Consumer4f... before)
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
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptFloat(a, b, c, d); acceptFloat(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4f consumer : before) consumer.acceptFloat(a, b, c, d); acceptFloat(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4f} performing the operations before and this operation.
     */
    default Consumer4f beforeThatFloat(Iterable<Consumer4f> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(Consumer4f consumer : before) consumer.acceptFloat(a, b, c, d); acceptFloat(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4f} performing the operations.
     */
	static Consumer4f inSequenceFloat(Consumer4f... consumers)
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
    	
    	return (a, b, c, d) -> {for(Consumer4f consumer : consumers) consumer.acceptFloat(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4f} performing the operations.
     */
    static Consumer4f inSequenceFloat(Iterable<Consumer4f> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(Consumer4f consumer : consumers) consumer.acceptFloat(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptFloat} instead.
     */
    @Override
    @Deprecated
    default void accept(Float a, Float b, Float c, Float d)
    {
    	acceptFloat(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4f} performing this operation and the operation after.
     */
    default Consumer4f andThen(Consumer4<Float,Float,Float,Float> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4f)
    	{
    		final Consumer4f originalAfter = (Consumer4f)after;
    		
    		return (a, b, c, d) -> {acceptFloat(a, b, c, d); originalAfter.acceptFloat(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptFloat(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4f} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4f andThen(Consumer4<Float,Float,Float,Float>... after)
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
    		if(after[0] instanceof Consumer4f)
        	{
        		final Consumer4f originalAfter = (Consumer4f)after[0];
        		
        		return (a, b, c, d) -> {acceptFloat(a, b, c, d); originalAfter.acceptFloat(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptFloat(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
			acceptFloat(a, b, c, d);
			
    		for(Consumer4<Float,Float,Float,Float> consumer : after)
    		{
    			if(consumer instanceof Consumer4f)
    				((Consumer4f)consumer).acceptFloat(a, b, c, d);
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
     * @return A new {@link Consumer4f} performing this operation and the operations after.
     */
	default Consumer4f andThen(Iterable<Consumer4<Float,Float,Float,Float>> after)
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
			acceptFloat(a, b, c, d);
			
    		for(Consumer4<Float,Float,Float,Float> consumer : after)
    		{
    			if(consumer instanceof Consumer4f)
    				((Consumer4f)consumer).acceptFloat(a, b, c, d);
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
     * @return A new {@link Consumer4f} performing the operation before and this operation.
     */
    default Consumer4f beforeThat(Consumer4<Float,Float,Float,Float> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4f)
    	{
    		final Consumer4f originalBefore = (Consumer4f)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptFloat(a, b, c, d); acceptFloat(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptFloat(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4f} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4f beforeThat(Consumer4<Float,Float,Float,Float>... before)
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
    		if(before[0] instanceof Consumer4f)
        	{
        		final Consumer4f originalBefore = (Consumer4f)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptFloat(a, b, c, d); acceptFloat(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptFloat(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Float,Float,Float,Float> consumer : before)
    		{
    			if(consumer instanceof Consumer4f)
    				((Consumer4f)consumer).acceptFloat(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptFloat(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4f} performing the operations before and this operation.
     */
    default Consumer4f beforeThat(Iterable<Consumer4<Float,Float,Float,Float>> before)
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
    		for(Consumer4<Float,Float,Float,Float> consumer : before)
    		{
    			if(consumer instanceof Consumer4f)
    				((Consumer4f)consumer).acceptFloat(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptFloat(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4f} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4f inSequence(Consumer4<Float,Float,Float,Float>... consumers)
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
    		if(consumers[0] instanceof Consumer4f)
    			return (Consumer4f) consumers[0];
    		else
    			return (Consumer4f) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Float,Float,Float,Float> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4f)
    				((Consumer4f)consumer).acceptFloat(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer4f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4f} performing the operations.
     */
    static Consumer4f inSequence(Iterable<Consumer4<Float,Float,Float,Float>> consumers)
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
    		for(Consumer4<Float,Float,Float,Float> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4f)
    				((Consumer4f)consumer).acceptFloat(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
