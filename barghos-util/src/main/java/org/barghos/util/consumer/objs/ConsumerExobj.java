package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one object input argument and returns no result.
 * Unlike {@link Consumerobj} this may throw Exceptions.
 * {@link ConsumerExobj} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptObject(Object)}.
 * 
 * @see Consumerobj
 * @see ConsumerExobj
 * @see Consumer2obj
 * @see ConsumerEx2obj
 * @see Consumer3obj
 * @see ConsumerEx3obj
 * @see Consumer4obj
 * @see ConsumerEx4obj
 */
@FunctionalInterface
public interface ConsumerExobj extends ConsumerEx<Object>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptObject(Object a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExobj} performing this operation and the operation after.
     */
    default ConsumerExobj andThenObject(ConsumerExobj after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptObject(a); after.acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExobj} performing this operation and the operations after.
     */
	default ConsumerExobj andThenObject(ConsumerExobj... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptObject(a); after[0].acceptObject(a);};

    	return (a) -> {acceptObject(a); for(ConsumerExobj consumer : after) consumer.acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExobj} performing this operation and the operations after.
     */
	default ConsumerExobj andThenObject(Iterable<ConsumerExobj> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptObject(a); for(ConsumerExobj consumer : after) consumer.acceptObject(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExobj} performing the operation before and this operation.
     */
    default ConsumerExobj beforeThatObject(ConsumerExobj before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptObject(a); acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExobj} performing the operations before and this operation.
     */
    default ConsumerExobj beforeThatObject(ConsumerExobj... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptObject(a); acceptObject(a);};
    	
    	return (a) -> {for(ConsumerExobj consumer : before) consumer.acceptObject(a); acceptObject(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExobj} performing the operations before and this operation.
     */
    default ConsumerExobj beforeThatObject(Iterable<ConsumerExobj> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExobj consumer : before) consumer.acceptObject(a); acceptObject(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExobj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExobj} performing the operations.
     */
	static ConsumerExobj inSequenceObject(ConsumerExobj... consumers)
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
    	
    	return (a) -> {for(ConsumerExobj consumer : consumers) consumer.acceptObject(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExobj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExobj} performing the operations.
     */
    static ConsumerExobj inSequenceObject(Iterable<ConsumerExobj> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExobj consumer : consumers) consumer.acceptObject(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptObject} instead.
     */
    @Override
    @Deprecated
    default void accept(Object a) throws Exception
    {
    	acceptObject(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExobj} performing this operation and the operation after.
     */
    default ConsumerExobj andThen(ConsumerEx<Object> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExobj)
    	{
    		final ConsumerExobj originalAfter = (ConsumerExobj)after;
    		
    		return (a) -> {acceptObject(a); originalAfter.acceptObject(a);};
    	}
    	else
    	{
    		return (a) -> {acceptObject(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExobj} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExobj andThen(ConsumerEx<Object>... after)
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
    		if(after[0] instanceof ConsumerExobj)
        	{
        		final ConsumerExobj originalAfter = (ConsumerExobj)after[0];
        		
        		return (a) -> {acceptObject(a); originalAfter.acceptObject(a);};
        	}
        	else
        	{
        		return (a) -> {acceptObject(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptObject(a);
			
    		for(ConsumerEx<Object> consumer : after)
    		{
    			if(consumer instanceof ConsumerExobj)
    				((ConsumerExobj)consumer).acceptObject(a);
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
     * @return A new {@link ConsumerExobj} performing this operation and the operations after.
     */
	default ConsumerExobj andThen(Iterable<ConsumerEx<Object>> after)
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
			acceptObject(a);
			
    		for(ConsumerEx<Object> consumer : after)
    		{
    			if(consumer instanceof ConsumerExobj)
    				((ConsumerExobj)consumer).acceptObject(a);
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
     * @return A new {@link ConsumerExobj} performing the operation before and this operation.
     */
    default ConsumerExobj beforeThat(ConsumerEx<Object> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExobj)
    	{
    		final ConsumerExobj originalBefore = (ConsumerExobj)before;
    		
    		return (a) -> {originalBefore.acceptObject(a); acceptObject(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptObject(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExobj} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExobj beforeThat(ConsumerEx<Object>... before)
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
    		if(before[0] instanceof ConsumerExobj)
        	{
        		final ConsumerExobj originalBefore = (ConsumerExobj)before[0];
        		
        		return (a) -> {originalBefore.acceptObject(a); acceptObject(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptObject(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Object> consumer : before)
    		{
    			if(consumer instanceof ConsumerExobj)
    				((ConsumerExobj)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptObject(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExobj} performing the operations before and this operation.
     */
    default ConsumerExobj beforeThat(Iterable<ConsumerEx<Object>> before)
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
    		for(ConsumerEx<Object> consumer : before)
    		{
    			if(consumer instanceof ConsumerExobj)
    				((ConsumerExobj)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptObject(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExobj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExobj} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExobj inSequence(ConsumerEx<Object>... consumers)
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
    		if(consumers[0] instanceof ConsumerExobj)
    			return (ConsumerExobj) consumers[0];
    		else
    			return (ConsumerExobj) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Object> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExobj)
    				((ConsumerExobj)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExobj} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExobj} performing the operations.
     */
    static ConsumerExobj inSequence(Iterable<ConsumerEx<Object>> consumers)
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
    		for(ConsumerEx<Object> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExobj)
    				((ConsumerExobj)consumer).acceptObject(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
