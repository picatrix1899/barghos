package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three integer input argument and returns no result.
 * Unlike {@link Consumer3i} this may throw Exceptions.
 * {@link ConsumerEx3i} is expected to operate via side-effects.
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
public interface ConsumerEx3i extends ConsumerEx3<Integer,Integer,Integer>
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
    void acceptInt(int a, int b, int c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3i} performing this operation and the operation after.
     */
    default ConsumerEx3i andThenInt(ConsumerEx3i after)
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
     * @return A new {@link ConsumerEx3i} performing this operation and the operations after.
     */
	default ConsumerEx3i andThenInt(ConsumerEx3i... after)
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

    	return (a, b, c) -> {acceptInt(a, b, c); for(ConsumerEx3i consumer : after) consumer.acceptInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3i} performing this operation and the operations after.
     */
	default ConsumerEx3i andThenInt(Iterable<ConsumerEx3i> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptInt(a, b, c); for(ConsumerEx3i consumer : after) consumer.acceptInt(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3i} performing the operation before and this operation.
     */
    default ConsumerEx3i beforeThatInt(ConsumerEx3i before)
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
     * @return A new {@link ConsumerEx3i} performing the operations before and this operation.
     */
    default ConsumerEx3i beforeThatInt(ConsumerEx3i... before)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3i consumer : before) consumer.acceptInt(a, b, c); acceptInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3i} performing the operations before and this operation.
     */
    default ConsumerEx3i beforeThatInt(Iterable<ConsumerEx3i> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(ConsumerEx3i consumer : before) consumer.acceptInt(a, b, c); acceptInt(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3i} performing the operations.
     */
	static ConsumerEx3i inSequenceInt(ConsumerEx3i... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3i consumer : consumers) consumer.acceptInt(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3i} performing the operations.
     */
    static ConsumerEx3i inSequenceInt(Iterable<ConsumerEx3i> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(ConsumerEx3i consumer : consumers) consumer.acceptInt(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptInt} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a, Integer b, Integer c) throws Exception
    {
    	acceptInt(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3i} performing this operation and the operation after.
     */
    default ConsumerEx3i andThen(ConsumerEx3<Integer,Integer,Integer> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3i)
    	{
    		final ConsumerEx3i originalAfter = (ConsumerEx3i)after;
    		
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
     * @return A new {@link ConsumerEx3i} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3i andThen(ConsumerEx3<Integer,Integer,Integer>... after)
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
    		if(after[0] instanceof ConsumerEx3i)
        	{
        		final ConsumerEx3i originalAfter = (ConsumerEx3i)after[0];
        		
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
			
    		for(ConsumerEx3<Integer,Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3i)
    				((ConsumerEx3i)consumer).acceptInt(a, b, c);
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
     * @return A new {@link ConsumerEx3i} performing this operation and the operations after.
     */
	default ConsumerEx3i andThen(Iterable<ConsumerEx3<Integer,Integer,Integer>> after)
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
			
    		for(ConsumerEx3<Integer,Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3i)
    				((ConsumerEx3i)consumer).acceptInt(a, b, c);
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
     * @return A new {@link ConsumerEx3i} performing the operation before and this operation.
     */
    default ConsumerEx3i beforeThat(ConsumerEx3<Integer,Integer,Integer> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3i)
    	{
    		final ConsumerEx3i originalBefore = (ConsumerEx3i)before;
    		
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
     * @return A new {@link ConsumerEx3i} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3i beforeThat(ConsumerEx3<Integer,Integer,Integer>... before)
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
    		if(before[0] instanceof ConsumerEx3i)
        	{
        		final ConsumerEx3i originalBefore = (ConsumerEx3i)before[0];
        		
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
    		for(ConsumerEx3<Integer,Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3i)
    				((ConsumerEx3i)consumer).acceptInt(a, b, c);
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
     * @return A new {@link ConsumerEx3i} performing the operations before and this operation.
     */
    default ConsumerEx3i beforeThat(Iterable<ConsumerEx3<Integer,Integer,Integer>> before)
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
    		for(ConsumerEx3<Integer,Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3i)
    				((ConsumerEx3i)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptInt(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3i} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3i inSequence(ConsumerEx3<Integer,Integer,Integer>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3i)
    			return (ConsumerEx3i) consumers[0];
    		else
    			return (ConsumerEx3i) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Integer,Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3i)
    				((ConsumerEx3i)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3i} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3i} performing the operations.
     */
    static ConsumerEx3i inSequence(Iterable<ConsumerEx3<Integer,Integer,Integer>> consumers)
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
    		for(ConsumerEx3<Integer,Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3i)
    				((ConsumerEx3i)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
