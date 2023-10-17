package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one integer input argument and returns no result.
 * Unlike {@link Consumeri} this may throw Exceptions.
 * {@link ConsumerExi} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptInt(int)}.
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
public interface ConsumerExi extends ConsumerEx<Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptInt(int a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExi} performing this operation and the operation after.
     */
    default ConsumerExi andThenInt(ConsumerExi after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptInt(a); after.acceptInt(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExi} performing this operation and the operations after.
     */
	default ConsumerExi andThenInt(ConsumerExi... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptInt(a); after[0].acceptInt(a);};

    	return (a) -> {acceptInt(a); for(ConsumerExi consumer : after) consumer.acceptInt(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExi} performing this operation and the operations after.
     */
	default ConsumerExi andThenInt(Iterable<ConsumerExi> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptInt(a); for(ConsumerExi consumer : after) consumer.acceptInt(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExi} performing the operation before and this operation.
     */
    default ConsumerExi beforeThatInt(ConsumerExi before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptInt(a); acceptInt(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExi} performing the operations before and this operation.
     */
    default ConsumerExi beforeThatInt(ConsumerExi... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptInt(a); acceptInt(a);};
    	
    	return (a) -> {for(ConsumerExi consumer : before) consumer.acceptInt(a); acceptInt(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExi} performing the operations before and this operation.
     */
    default ConsumerExi beforeThatInt(Iterable<ConsumerExi> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExi consumer : before) consumer.acceptInt(a); acceptInt(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExi} performing the operations.
     */
	static ConsumerExi inSequenceInt(ConsumerExi... consumers)
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
    	
    	return (a) -> {for(ConsumerExi consumer : consumers) consumer.acceptInt(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExi} performing the operations.
     */
    static ConsumerExi inSequenceInt(Iterable<ConsumerExi> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExi consumer : consumers) consumer.acceptInt(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptInt} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a) throws Exception
    {
    	acceptInt(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExi} performing this operation and the operation after.
     */
    default ConsumerExi andThen(ConsumerEx<Integer> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExi)
    	{
    		final ConsumerExi originalAfter = (ConsumerExi)after;
    		
    		return (a) -> {acceptInt(a); originalAfter.acceptInt(a);};
    	}
    	else
    	{
    		return (a) -> {acceptInt(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExi} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExi andThen(ConsumerEx<Integer>... after)
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
    		if(after[0] instanceof ConsumerExi)
        	{
        		final ConsumerExi originalAfter = (ConsumerExi)after[0];
        		
        		return (a) -> {acceptInt(a); originalAfter.acceptInt(a);};
        	}
        	else
        	{
        		return (a) -> {acceptInt(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptInt(a);
			
    		for(ConsumerEx<Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerExi)
    				((ConsumerExi)consumer).acceptInt(a);
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
     * @return A new {@link ConsumerExi} performing this operation and the operations after.
     */
	default ConsumerExi andThen(Iterable<ConsumerEx<Integer>> after)
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
			acceptInt(a);
			
    		for(ConsumerEx<Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerExi)
    				((ConsumerExi)consumer).acceptInt(a);
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
     * @return A new {@link ConsumerExi} performing the operation before and this operation.
     */
    default ConsumerExi beforeThat(ConsumerEx<Integer> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExi)
    	{
    		final ConsumerExi originalBefore = (ConsumerExi)before;
    		
    		return (a) -> {originalBefore.acceptInt(a); acceptInt(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptInt(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExi} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExi beforeThat(ConsumerEx<Integer>... before)
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
    		if(before[0] instanceof ConsumerExi)
        	{
        		final ConsumerExi originalBefore = (ConsumerExi)before[0];
        		
        		return (a) -> {originalBefore.acceptInt(a); acceptInt(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptInt(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerExi)
    				((ConsumerExi)consumer).acceptInt(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptInt(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExi} performing the operations before and this operation.
     */
    default ConsumerExi beforeThat(Iterable<ConsumerEx<Integer>> before)
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
    		for(ConsumerEx<Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerExi)
    				((ConsumerExi)consumer).acceptInt(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptInt(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExi inSequence(ConsumerEx<Integer>... consumers)
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
    		if(consumers[0] instanceof ConsumerExi)
    			return (ConsumerExi) consumers[0];
    		else
    			return (ConsumerExi) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExi)
    				((ConsumerExi)consumer).acceptInt(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExi} performing the operations.
     */
    static ConsumerExi inSequence(Iterable<ConsumerEx<Integer>> consumers)
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
    		for(ConsumerEx<Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExi)
    				((ConsumerExi)consumer).acceptInt(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
