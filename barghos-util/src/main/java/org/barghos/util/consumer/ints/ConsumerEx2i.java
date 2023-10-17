package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two integer input argument and returns no result.
 * Unlike {@link Consumer2i} this may throw Exceptions.
 * {@link ConsumerEx2i} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptFloat(int, int)}.
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
public interface ConsumerEx2i extends ConsumerEx2<Integer,Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptFloat(int a, int b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2i} performing this operation and the operation after.
     */
    default ConsumerEx2i andThenFloat(ConsumerEx2i after)
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
     * @return A new {@link ConsumerEx2i} performing this operation and the operations after.
     */
	default ConsumerEx2i andThenFloat(ConsumerEx2i... after)
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

    	return (a, b) -> {acceptFloat(a, b); for(ConsumerEx2i consumer : after) consumer.acceptFloat(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2i} performing this operation and the operations after.
     */
	default ConsumerEx2i andThenFloat(Iterable<ConsumerEx2i> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptFloat(a, b); for(ConsumerEx2i consumer : after) consumer.acceptFloat(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2i} performing the operation before and this operation.
     */
    default ConsumerEx2i beforeThatFloat(ConsumerEx2i before)
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
     * @return A new {@link ConsumerEx2i} performing the operations before and this operation.
     */
    default ConsumerEx2i beforeThatFloat(ConsumerEx2i... before)
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
    	
    	return (a, b) -> {for(ConsumerEx2i consumer : before) consumer.acceptFloat(a, b); acceptFloat(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2i} performing the operations before and this operation.
     */
    default ConsumerEx2i beforeThatFloat(Iterable<ConsumerEx2i> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2i consumer : before) consumer.acceptFloat(a, b); acceptFloat(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2i} performing the operations.
     */
	static ConsumerEx2i inSequenceFloat(ConsumerEx2i... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2i consumer : consumers) consumer.acceptFloat(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2i} performing the operations.
     */
    static ConsumerEx2i inSequenceFloat(Iterable<ConsumerEx2i> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2i consumer : consumers) consumer.acceptFloat(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptFloat} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a, Integer b) throws Exception
    {
    	acceptFloat(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2i} performing this operation and the operation after.
     */
    default ConsumerEx2i andThen(ConsumerEx2<Integer,Integer> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2i)
    	{
    		final ConsumerEx2i originalAfter = (ConsumerEx2i)after;
    		
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
     * @return A new {@link ConsumerEx2i} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2i andThen(ConsumerEx2<Integer,Integer>... after)
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
    		if(after[0] instanceof ConsumerEx2i)
        	{
        		final ConsumerEx2i originalAfter = (ConsumerEx2i)after[0];
        		
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
			
    		for(ConsumerEx2<Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2i)
    				((ConsumerEx2i)consumer).acceptFloat(a, b);
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
     * @return A new {@link ConsumerEx2i} performing this operation and the operations after.
     */
	default ConsumerEx2i andThen(Iterable<ConsumerEx2<Integer,Integer>> after)
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
			
    		for(ConsumerEx2<Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2i)
    				((ConsumerEx2i)consumer).acceptFloat(a, b);
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
     * @return A new {@link ConsumerEx2i} performing the operation before and this operation.
     */
    default ConsumerEx2i beforeThat(ConsumerEx2<Integer,Integer> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2i)
    	{
    		final ConsumerEx2i originalBefore = (ConsumerEx2i)before;
    		
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
     * @return A new {@link ConsumerEx2i} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2i beforeThat(ConsumerEx2<Integer,Integer>... before)
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
    		if(before[0] instanceof ConsumerEx2i)
        	{
        		final ConsumerEx2i originalBefore = (ConsumerEx2i)before[0];
        		
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
    		for(ConsumerEx2<Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2i)
    				((ConsumerEx2i)consumer).acceptFloat(a, b);
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
     * @return A new {@link ConsumerEx2i} performing the operations before and this operation.
     */
    default ConsumerEx2i beforeThat(Iterable<ConsumerEx2<Integer,Integer>> before)
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
    		for(ConsumerEx2<Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2i)
    				((ConsumerEx2i)consumer).acceptFloat(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptFloat(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2i} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2i inSequence(ConsumerEx2<Integer,Integer>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2i)
    			return (ConsumerEx2i) consumers[0];
    		else
    			return (ConsumerEx2i) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2i)
    				((ConsumerEx2i)consumer).acceptFloat(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2i} performing the operations.
     */
    static ConsumerEx2i inSequence(Iterable<ConsumerEx2<Integer,Integer>> consumers)
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
    		for(ConsumerEx2<Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2i)
    				((ConsumerEx2i)consumer).acceptFloat(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
