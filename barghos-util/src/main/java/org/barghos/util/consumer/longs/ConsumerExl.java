package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one long input argument and returns no result.
 * Unlike {@link Consumerl} this may throw Exceptions.
 * {@link ConsumerExl} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptLong(long)}.
 * 
 * @see Consumerl
 * @see ConsumerExl
 * @see Consumer2l
 * @see ConsumerEx2l
 * @see Consumer3l
 * @see ConsumerEx3l
 * @see Consumer4l
 * @see ConsumerEx4l
 */
@FunctionalInterface
public interface ConsumerExl extends ConsumerEx<Long>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptLong(long a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExl} performing this operation and the operation after.
     */
    default ConsumerExl andThenLong(ConsumerExl after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptLong(a); after.acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExl} performing this operation and the operations after.
     */
	default ConsumerExl andThenLong(ConsumerExl... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptLong(a); after[0].acceptLong(a);};

    	return (a) -> {acceptLong(a); for(ConsumerExl consumer : after) consumer.acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExl} performing this operation and the operations after.
     */
	default ConsumerExl andThenLong(Iterable<ConsumerExl> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptLong(a); for(ConsumerExl consumer : after) consumer.acceptLong(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExl} performing the operation before and this operation.
     */
    default ConsumerExl beforeThatLong(ConsumerExl before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptLong(a); acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExl} performing the operations before and this operation.
     */
    default ConsumerExl beforeThatLong(ConsumerExl... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptLong(a); acceptLong(a);};
    	
    	return (a) -> {for(ConsumerExl consumer : before) consumer.acceptLong(a); acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExl} performing the operations before and this operation.
     */
    default ConsumerExl beforeThatLong(Iterable<ConsumerExl> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExl consumer : before) consumer.acceptLong(a); acceptLong(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExl} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExl} performing the operations.
     */
	static ConsumerExl inSequenceLong(ConsumerExl... consumers)
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
    	
    	return (a) -> {for(ConsumerExl consumer : consumers) consumer.acceptLong(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExl} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExl} performing the operations.
     */
    static ConsumerExl inSequenceLong(Iterable<ConsumerExl> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExl consumer : consumers) consumer.acceptLong(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptLong} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a) throws Exception
    {
    	acceptLong(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExl} performing this operation and the operation after.
     */
    default ConsumerExl andThen(ConsumerEx<Long> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExl)
    	{
    		final ConsumerExl originalAfter = (ConsumerExl)after;
    		
    		return (a) -> {acceptLong(a); originalAfter.acceptLong(a);};
    	}
    	else
    	{
    		return (a) -> {acceptLong(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExl} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExl andThen(ConsumerEx<Long>... after)
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
    		if(after[0] instanceof ConsumerExl)
        	{
        		final ConsumerExl originalAfter = (ConsumerExl)after[0];
        		
        		return (a) -> {acceptLong(a); originalAfter.acceptLong(a);};
        	}
        	else
        	{
        		return (a) -> {acceptLong(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptLong(a);
			
    		for(ConsumerEx<Long> consumer : after)
    		{
    			if(consumer instanceof ConsumerExl)
    				((ConsumerExl)consumer).acceptLong(a);
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
     * @return A new {@link ConsumerExl} performing this operation and the operations after.
     */
	default ConsumerExl andThen(Iterable<ConsumerEx<Long>> after)
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
			acceptLong(a);
			
    		for(ConsumerEx<Long> consumer : after)
    		{
    			if(consumer instanceof ConsumerExl)
    				((ConsumerExl)consumer).acceptLong(a);
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
     * @return A new {@link ConsumerExl} performing the operation before and this operation.
     */
    default ConsumerExl beforeThat(ConsumerEx<Long> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExl)
    	{
    		final ConsumerExl originalBefore = (ConsumerExl)before;
    		
    		return (a) -> {originalBefore.acceptLong(a); acceptLong(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptLong(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExl} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExl beforeThat(ConsumerEx<Long>... before)
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
    		if(before[0] instanceof ConsumerExl)
        	{
        		final ConsumerExl originalBefore = (ConsumerExl)before[0];
        		
        		return (a) -> {originalBefore.acceptLong(a); acceptLong(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptLong(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Long> consumer : before)
    		{
    			if(consumer instanceof ConsumerExl)
    				((ConsumerExl)consumer).acceptLong(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptLong(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExl} performing the operations before and this operation.
     */
    default ConsumerExl beforeThat(Iterable<ConsumerEx<Long>> before)
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
    		for(ConsumerEx<Long> consumer : before)
    		{
    			if(consumer instanceof ConsumerExl)
    				((ConsumerExl)consumer).acceptLong(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptLong(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExl} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExl} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExl inSequence(ConsumerEx<Long>... consumers)
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
    		if(consumers[0] instanceof ConsumerExl)
    			return (ConsumerExl) consumers[0];
    		else
    			return (ConsumerExl) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Long> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExl)
    				((ConsumerExl)consumer).acceptLong(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExl} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExl} performing the operations.
     */
    static ConsumerExl inSequence(Iterable<ConsumerEx<Long>> consumers)
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
    		for(ConsumerEx<Long> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExl)
    				((ConsumerExl)consumer).acceptLong(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
