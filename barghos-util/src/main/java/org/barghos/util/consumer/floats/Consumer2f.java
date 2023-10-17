package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two float input arguments and returns no result.
 * {@link Consumer2f} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptFloat(float, float)}.
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
public interface Consumer2f extends Consumer2<Float,Float>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptFloat(float a, float b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2f} performing this operation and the operation after.
     */
    default Consumer2f andThenFloat(Consumer2f after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptFloat(a, b); after.acceptFloat(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2f} performing this operation and the operations after.
     */
	default Consumer2f andThenFloat(Consumer2f... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptFloat(a, b); after[0].acceptFloat(a, b);};

    	return (a, b) -> {acceptFloat(a, b); for(Consumer2f consumer : after) consumer.acceptFloat(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2f} performing this operation and the operations after.
     */
	default Consumer2f andThenFloat(Iterable<Consumer2f> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptFloat(a, b); for(Consumer2f consumer : after) consumer.acceptFloat(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2f} performing the operation before and this operation.
     */
    default Consumer2f beforeThatFloat(Consumer2f before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptFloat(a, b); acceptFloat(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2f} performing the operations before and this operation.
     */
    default Consumer2f beforeThatFloat(Consumer2f... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptFloat(a, b); acceptFloat(a, b);};
    	
    	return (a, b) -> {for(Consumer2f consumer : before) consumer.acceptFloat(a, b); acceptFloat(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2f} performing the operations before and this operation.
     */
    default Consumer2f beforeThatFloat(Iterable<Consumer2f> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2f consumer : before) consumer.acceptFloat(a, b); acceptFloat(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2f} performing the operations.
     */
	static Consumer2f inSequenceFloat(Consumer2f... consumers)
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
    	
    	return (a, b) -> {for(Consumer2f consumer : consumers) consumer.acceptFloat(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2f} performing the operations.
     */
    static Consumer2f inSequenceFloat(Iterable<Consumer2f> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2f consumer : consumers) consumer.acceptFloat(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptFloat} instead.
     */
    @Override
    @Deprecated
    default void accept(Float a, Float b)
    {
    	acceptFloat(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2f} performing this operation and the operation after.
     */
    default Consumer2f andThen(Consumer2<Float,Float> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2f)
    	{
    		final Consumer2f originalAfter = (Consumer2f)after;
    		
    		return (a, b) -> {acceptFloat(a, b); originalAfter.acceptFloat(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptFloat(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2f} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2f andThen(Consumer2<Float,Float>... after)
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
    		if(after[0] instanceof Consumer2f)
        	{
        		final Consumer2f originalAfter = (Consumer2f)after[0];
        		
        		return (a, b) -> {acceptFloat(a, b); originalAfter.acceptFloat(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptFloat(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptFloat(a, b);
			
    		for(Consumer2<Float,Float> consumer : after)
    		{
    			if(consumer instanceof Consumer2f)
    				((Consumer2f)consumer).acceptFloat(a, b);
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
     * @return A new {@link Consumer2f} performing this operation and the operations after.
     */
	default Consumer2f andThen(Iterable<Consumer2<Float,Float>> after)
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
			acceptFloat(a, b);
			
    		for(Consumer2<Float,Float> consumer : after)
    		{
    			if(consumer instanceof Consumer2f)
    				((Consumer2f)consumer).acceptFloat(a, b);
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
     * @return A new {@link Consumer2f} performing the operation before and this operation.
     */
    default Consumer2f beforeThat(Consumer2<Float,Float> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2f)
    	{
    		final Consumer2f originalBefore = (Consumer2f)before;
    		
    		return (a, b) -> {originalBefore.acceptFloat(a, b); acceptFloat(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptFloat(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2f} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2f beforeThat(Consumer2<Float,Float>... before)
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
    		if(before[0] instanceof Consumer2f)
        	{
        		final Consumer2f originalBefore = (Consumer2f)before[0];
        		
        		return (a, b) -> {originalBefore.acceptFloat(a, b); acceptFloat(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptFloat(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Float,Float> consumer : before)
    		{
    			if(consumer instanceof Consumer2f)
    				((Consumer2f)consumer).acceptFloat(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptFloat(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2f} performing the operations before and this operation.
     */
    default Consumer2f beforeThat(Iterable<Consumer2<Float,Float>> before)
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
    		for(Consumer2<Float,Float> consumer : before)
    		{
    			if(consumer instanceof Consumer2f)
    				((Consumer2f)consumer).acceptFloat(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptFloat(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2f} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2f inSequence(Consumer2<Float,Float>... consumers)
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
    		if(consumers[0] instanceof Consumer2f)
    			return (Consumer2f) consumers[0];
    		else
    			return (Consumer2f) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Float,Float> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2f)
    				((Consumer2f)consumer).acceptFloat(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2f} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2f} performing the operations.
     */
    static Consumer2f inSequence(Iterable<Consumer2<Float,Float>> consumers)
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
    		for(Consumer2<Float,Float> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2f)
    				((Consumer2f)consumer).acceptFloat(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2f andThen(java.util.function.BiConsumer<? super Float,? super Float> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptFloat(a, b); after.accept(a, b);};
    }
}
