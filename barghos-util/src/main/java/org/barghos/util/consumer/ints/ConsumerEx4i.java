package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four integer input argument and returns no result.
 * Unlike {@link Consumer4i} this may throw Exceptions.
 * {@link ConsumerEx4i} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptFloat(int, int, int, int)}.
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
public interface ConsumerEx4i extends ConsumerEx4<Integer,Integer,Integer,Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptFloat(int a, int b, int c, int d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4i} performing this operation and the operation after.
     */
    default ConsumerEx4i andThenFloat(ConsumerEx4i after)
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
     * @return A new {@link ConsumerEx4i} performing this operation and the operations after.
     */
	default ConsumerEx4i andThenFloat(ConsumerEx4i... after)
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

    	return (a, b, c, d) -> {acceptFloat(a, b, c, d); for(ConsumerEx4i consumer : after) consumer.acceptFloat(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4i} performing this operation and the operations after.
     */
	default ConsumerEx4i andThenFloat(Iterable<ConsumerEx4i> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptFloat(a, b, c, d); for(ConsumerEx4i consumer : after) consumer.acceptFloat(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4i} performing the operation before and this operation.
     */
    default ConsumerEx4i beforeThatFloat(ConsumerEx4i before)
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
     * @return A new {@link ConsumerEx4i} performing the operations before and this operation.
     */
    default ConsumerEx4i beforeThatFloat(ConsumerEx4i... before)
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
    	
    	return (a, b, c, d) -> {for(ConsumerEx4i consumer : before) consumer.acceptFloat(a, b, c, d); acceptFloat(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4i} performing the operations before and this operation.
     */
    default ConsumerEx4i beforeThatFloat(Iterable<ConsumerEx4i> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4i consumer : before) consumer.acceptFloat(a, b, c, d); acceptFloat(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4i} performing the operations.
     */
	static ConsumerEx4i inSequenceFloat(ConsumerEx4i... consumers)
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
    	
    	return (a, b, c, d) -> {for(ConsumerEx4i consumer : consumers) consumer.acceptFloat(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4i} performing the operations.
     */
    static ConsumerEx4i inSequenceFloat(Iterable<ConsumerEx4i> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4i consumer : consumers) consumer.acceptFloat(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptFloat} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a, Integer b, Integer c, Integer d) throws Exception
    {
    	acceptFloat(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4i} performing this operation and the operation after.
     */
    default ConsumerEx4i andThen(ConsumerEx4<Integer,Integer,Integer,Integer> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4i)
    	{
    		final ConsumerEx4i originalAfter = (ConsumerEx4i)after;
    		
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
     * @return A new {@link ConsumerEx4i} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4i andThen(ConsumerEx4<Integer,Integer,Integer,Integer>... after)
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
    		if(after[0] instanceof ConsumerEx4i)
        	{
        		final ConsumerEx4i originalAfter = (ConsumerEx4i)after[0];
        		
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
			
    		for(ConsumerEx4<Integer,Integer,Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4i)
    				((ConsumerEx4i)consumer).acceptFloat(a, b, c, d);
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
     * @return A new {@link ConsumerEx4i} performing this operation and the operations after.
     */
	default ConsumerEx4i andThen(Iterable<ConsumerEx4<Integer,Integer,Integer,Integer>> after)
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
			
    		for(ConsumerEx4<Integer,Integer,Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4i)
    				((ConsumerEx4i)consumer).acceptFloat(a, b, c, d);
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
     * @return A new {@link ConsumerEx4i} performing the operation before and this operation.
     */
    default ConsumerEx4i beforeThat(ConsumerEx4<Integer,Integer,Integer,Integer> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4i)
    	{
    		final ConsumerEx4i originalBefore = (ConsumerEx4i)before;
    		
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
     * @return A new {@link ConsumerEx4i} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4i beforeThat(ConsumerEx4<Integer,Integer,Integer,Integer>... before)
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
    		if(before[0] instanceof ConsumerEx4i)
        	{
        		final ConsumerEx4i originalBefore = (ConsumerEx4i)before[0];
        		
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
    		for(ConsumerEx4<Integer,Integer,Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4i)
    				((ConsumerEx4i)consumer).acceptFloat(a, b, c, d);
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
     * @return A new {@link ConsumerEx4i} performing the operations before and this operation.
     */
    default ConsumerEx4i beforeThat(Iterable<ConsumerEx4<Integer,Integer,Integer,Integer>> before)
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
    		for(ConsumerEx4<Integer,Integer,Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4i)
    				((ConsumerEx4i)consumer).acceptFloat(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptFloat(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4i} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4i inSequence(ConsumerEx4<Integer,Integer,Integer,Integer>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx4i)
    			return (ConsumerEx4i) consumers[0];
    		else
    			return (ConsumerEx4i) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Integer,Integer,Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4i)
    				((ConsumerEx4i)consumer).acceptFloat(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4i} performing the operations.
     */
    static ConsumerEx4i inSequence(Iterable<ConsumerEx4<Integer,Integer,Integer,Integer>> consumers)
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
    		for(ConsumerEx4<Integer,Integer,Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4i)
    				((ConsumerEx4i)consumer).acceptFloat(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
