package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three integer input arguments and returns no result.
 * {@link Consumer3i} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptInt(int, int, int)}.
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
public interface Consumer3i extends Consumer3<Integer,Integer,Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptInt(int a, int b, int c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3i} performing this operation and the operation after.
     */
    default Consumer3i andThenInt(Consumer3i after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptInt(a, b, c); after.acceptInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3i} performing this operation and the operations after.
     */
	default Consumer3i andThenInt(Consumer3i... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptInt(a, b, c); after[0].acceptInt(a, b, c);};

    	return (a, b, c) -> {acceptInt(a, b, c); for(Consumer3i consumer : after) consumer.acceptInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3i} performing this operation and the operations after.
     */
	default Consumer3i andThenInt(Iterable<Consumer3i> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptInt(a, b, c); for(Consumer3i consumer : after) consumer.acceptInt(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3i} performing the operation before and this operation.
     */
    default Consumer3i beforeThatInt(Consumer3i before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptInt(a, b, c); acceptInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3i} performing the operations before and this operation.
     */
    default Consumer3i beforeThatInt(Consumer3i... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptInt(a, b, c); acceptInt(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3i consumer : before) consumer.acceptInt(a, b, c); acceptInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3i} performing the operations before and this operation.
     */
    default Consumer3i beforeThatInt(Iterable<Consumer3i> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3i consumer : before) consumer.acceptInt(a, b, c); acceptInt(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3i} performing the operations.
     */
	static Consumer3i inSequenceInt(Consumer3i... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3i consumer : consumers) consumer.acceptInt(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3i} performing the operations.
     */
    static Consumer3i inSequenceInt(Iterable<Consumer3i> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3i consumer : consumers) consumer.acceptInt(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptInt} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a, Integer b, Integer c)
    {
    	acceptInt(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3i} performing this operation and the operation after.
     */
    default Consumer3i andThen(Consumer3<Integer,Integer,Integer> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3i)
    	{
    		final Consumer3i originalAfter = (Consumer3i)after;
    		
    		return (a, b, c) -> {acceptInt(a, b, c); originalAfter.acceptInt(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptInt(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3i} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3i andThen(Consumer3<Integer,Integer,Integer>... after)
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
    		if(after[0] instanceof Consumer3i)
        	{
        		final Consumer3i originalAfter = (Consumer3i)after[0];
        		
        		return (a, b, c) -> {acceptInt(a, b, c); originalAfter.acceptInt(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptInt(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptInt(a, b, c);
			
    		for(Consumer3<Integer,Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof Consumer3i)
    				((Consumer3i)consumer).acceptInt(a, b, c);
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
     * @return A new {@link Consumer3i} performing this operation and the operations after.
     */
	default Consumer3i andThen(Iterable<Consumer3<Integer,Integer,Integer>> after)
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
			acceptInt(a, b, c);
			
    		for(Consumer3<Integer,Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof Consumer3i)
    				((Consumer3i)consumer).acceptInt(a, b, c);
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
     * @return A new {@link Consumer3i} performing the operation before and this operation.
     */
    default Consumer3i beforeThat(Consumer3<Integer,Integer,Integer> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3i)
    	{
    		final Consumer3i originalBefore = (Consumer3i)before;
    		
    		return (a, b, c) -> {originalBefore.acceptInt(a, b, c); acceptInt(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptInt(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3i} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3i beforeThat(Consumer3<Integer,Integer,Integer>... before)
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
    		if(before[0] instanceof Consumer3i)
        	{
        		final Consumer3i originalBefore = (Consumer3i)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptInt(a, b, c); acceptInt(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptInt(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Integer,Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof Consumer3i)
    				((Consumer3i)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptInt(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3i} performing the operations before and this operation.
     */
    default Consumer3i beforeThat(Iterable<Consumer3<Integer,Integer,Integer>> before)
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
    		for(Consumer3<Integer,Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof Consumer3i)
    				((Consumer3i)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptInt(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3i} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3i inSequence(Consumer3<Integer,Integer,Integer>... consumers)
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
    		if(consumers[0] instanceof Consumer3i)
    			return (Consumer3i) consumers[0];
    		else
    			return (Consumer3i) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Integer,Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3i)
    				((Consumer3i)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3i} performing the operations.
     */
    static Consumer3i inSequence(Iterable<Consumer3<Integer,Integer,Integer>> consumers)
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
    		for(Consumer3<Integer,Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3i)
    				((Consumer3i)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
