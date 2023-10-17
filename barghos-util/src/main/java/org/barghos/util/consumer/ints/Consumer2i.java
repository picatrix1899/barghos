package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two integer input arguments and returns no result.
 * {@link Consumer2i} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptInt(int, int)}.
 * 
 * @see Consumeri
 * @see ConsumerExi
 * @see Consumer2i
 * @see ConsumerEx2i
 * @see Consumer3i
 * @see ConsumerEx3i
 * @see Consumer4i
 * @see ConsumerEx4i
 */
@FunctionalInterface
public interface Consumer2i extends Consumer2<Integer,Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptInt(int a, int b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2i} performing this operation and the operation after.
     */
    default Consumer2i andThenInt(Consumer2i after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptInt(a, b); after.acceptInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2i} performing this operation and the operations after.
     */
	default Consumer2i andThenInt(Consumer2i... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptInt(a, b); after[0].acceptInt(a, b);};

    	return (a, b) -> {acceptInt(a, b); for(Consumer2i consumer : after) consumer.acceptInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2i} performing this operation and the operations after.
     */
	default Consumer2i andThenInt(Iterable<Consumer2i> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptInt(a, b); for(Consumer2i consumer : after) consumer.acceptInt(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2i} performing the operation before and this operation.
     */
    default Consumer2i beforeThatInt(Consumer2i before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptInt(a, b); acceptInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2i} performing the operations before and this operation.
     */
    default Consumer2i beforeThatInt(Consumer2i... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptInt(a, b); acceptInt(a, b);};
    	
    	return (a, b) -> {for(Consumer2i consumer : before) consumer.acceptInt(a, b); acceptInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2i} performing the operations before and this operation.
     */
    default Consumer2i beforeThatInt(Iterable<Consumer2i> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2i consumer : before) consumer.acceptInt(a, b); acceptInt(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2i} performing the operations.
     */
	static Consumer2i inSequenceInt(Consumer2i... consumers)
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
    	
    	return (a, b) -> {for(Consumer2i consumer : consumers) consumer.acceptInt(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2i} performing the operations.
     */
    static Consumer2i inSequenceInt(Iterable<Consumer2i> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2i consumer : consumers) consumer.acceptInt(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptInt} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a, Integer b)
    {
    	acceptInt(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2i} performing this operation and the operation after.
     */
    default Consumer2i andThen(Consumer2<Integer,Integer> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2i)
    	{
    		final Consumer2i originalAfter = (Consumer2i)after;
    		
    		return (a, b) -> {acceptInt(a, b); originalAfter.acceptInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptInt(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2i} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2i andThen(Consumer2<Integer,Integer>... after)
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
    		if(after[0] instanceof Consumer2i)
        	{
        		final Consumer2i originalAfter = (Consumer2i)after[0];
        		
        		return (a, b) -> {acceptInt(a, b); originalAfter.acceptInt(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptInt(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptInt(a, b);
			
    		for(Consumer2<Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof Consumer2i)
    				((Consumer2i)consumer).acceptInt(a, b);
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
     * @return A new {@link Consumer2i} performing this operation and the operations after.
     */
	default Consumer2i andThen(Iterable<Consumer2<Integer,Integer>> after)
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
			acceptInt(a, b);
			
    		for(Consumer2<Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof Consumer2i)
    				((Consumer2i)consumer).acceptInt(a, b);
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
     * @return A new {@link Consumer2i} performing the operation before and this operation.
     */
    default Consumer2i beforeThat(Consumer2<Integer,Integer> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2i)
    	{
    		final Consumer2i originalBefore = (Consumer2i)before;
    		
    		return (a, b) -> {originalBefore.acceptInt(a, b); acceptInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptInt(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2i} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2i beforeThat(Consumer2<Integer,Integer>... before)
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
    		if(before[0] instanceof Consumer2i)
        	{
        		final Consumer2i originalBefore = (Consumer2i)before[0];
        		
        		return (a, b) -> {originalBefore.acceptInt(a, b); acceptInt(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptInt(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof Consumer2i)
    				((Consumer2i)consumer).acceptInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptInt(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2i} performing the operations before and this operation.
     */
    default Consumer2i beforeThat(Iterable<Consumer2<Integer,Integer>> before)
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
    		for(Consumer2<Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof Consumer2i)
    				((Consumer2i)consumer).acceptInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptInt(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2i} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2i inSequence(Consumer2<Integer,Integer>... consumers)
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
    		if(consumers[0] instanceof Consumer2i)
    			return (Consumer2i) consumers[0];
    		else
    			return (Consumer2i) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2i)
    				((Consumer2i)consumer).acceptInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2i} performing the operations.
     */
    static Consumer2i inSequence(Iterable<Consumer2<Integer,Integer>> consumers)
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
    		for(Consumer2<Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2i)
    				((Consumer2i)consumer).acceptInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2i andThen(java.util.function.BiConsumer<? super Integer,? super Integer> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptInt(a, b); after.accept(a, b);};
    }
}
