package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.util.consumer.floats.ConsumerEx2f;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one short input argument and returns no result.
 * Unlike {@link Consumers} this may throw Exceptions.
 * {@link ConsumerExs} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptShort(short)}.
 * 
 * @see Consumers
 * @see ConsumerExs
 * @see Consumer2s
 * @see ConsumerEx2f
 * @see Consumer3s
 * @see ConsumerEx3s
 * @see Consumer4s
 * @see ConsumerEx4s
 */
@FunctionalInterface
public interface ConsumerExs extends ConsumerEx<Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptShort(short a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExs} performing this operation and the operation after.
     */
    default ConsumerExs andThenShort(ConsumerExs after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptShort(a); after.acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExs} performing this operation and the operations after.
     */
	default ConsumerExs andThenShort(ConsumerExs... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptShort(a); after[0].acceptShort(a);};

    	return (a) -> {acceptShort(a); for(ConsumerExs consumer : after) consumer.acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExs} performing this operation and the operations after.
     */
	default ConsumerExs andThenShort(Iterable<ConsumerExs> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptShort(a); for(ConsumerExs consumer : after) consumer.acceptShort(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExs} performing the operation before and this operation.
     */
    default ConsumerExs beforeThatShort(ConsumerExs before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExs} performing the operations before and this operation.
     */
    default ConsumerExs beforeThatShort(ConsumerExs... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptShort(a); acceptShort(a);};
    	
    	return (a) -> {for(ConsumerExs consumer : before) consumer.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExs} performing the operations before and this operation.
     */
    default ConsumerExs beforeThatShort(Iterable<ConsumerExs> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExs consumer : before) consumer.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExs} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExs} performing the operations.
     */
	static ConsumerExs inSequenceShort(ConsumerExs... consumers)
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
    	
    	return (a) -> {for(ConsumerExs consumer : consumers) consumer.acceptShort(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExs} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExs} performing the operations.
     */
    static ConsumerExs inSequenceShort(Iterable<ConsumerExs> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExs consumer : consumers) consumer.acceptShort(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a) throws Exception
    {
    	acceptShort(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExs} performing this operation and the operation after.
     */
    default ConsumerExs andThen(ConsumerEx<Short> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExs)
    	{
    		final ConsumerExs originalAfter = (ConsumerExs)after;
    		
    		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {acceptShort(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExs} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExs andThen(ConsumerEx<Short>... after)
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
    		if(after[0] instanceof ConsumerExs)
        	{
        		final ConsumerExs originalAfter = (ConsumerExs)after[0];
        		
        		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
        	}
        	else
        	{
        		return (a) -> {acceptShort(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptShort(a);
			
    		for(ConsumerEx<Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerExs)
    				((ConsumerExs)consumer).acceptShort(a);
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
     * @return A new {@link ConsumerExs} performing this operation and the operations after.
     */
	default ConsumerExs andThen(Iterable<ConsumerEx<Short>> after)
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
			acceptShort(a);
			
    		for(ConsumerEx<Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerExs)
    				((ConsumerExs)consumer).acceptShort(a);
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
     * @return A new {@link ConsumerExs} performing the operation before and this operation.
     */
    default ConsumerExs beforeThat(ConsumerEx<Short> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExs)
    	{
    		final ConsumerExs originalBefore = (ConsumerExs)before;
    		
    		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptShort(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExs} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExs beforeThat(ConsumerEx<Short>... before)
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
    		if(before[0] instanceof ConsumerExs)
        	{
        		final ConsumerExs originalBefore = (ConsumerExs)before[0];
        		
        		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptShort(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerExs)
    				((ConsumerExs)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptShort(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExs} performing the operations before and this operation.
     */
    default ConsumerExs beforeThat(Iterable<ConsumerEx<Short>> before)
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
    		for(ConsumerEx<Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerExs)
    				((ConsumerExs)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptShort(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExs} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExs} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExs inSequence(ConsumerEx<Short>... consumers)
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
    		if(consumers[0] instanceof ConsumerExs)
    			return (ConsumerExs) consumers[0];
    		else
    			return (ConsumerExs) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExs)
    				((ConsumerExs)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExs} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExs} performing the operations.
     */
    static ConsumerExs inSequence(Iterable<ConsumerEx<Short>> consumers)
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
    		for(ConsumerEx<Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExs)
    				((ConsumerExs)consumer).acceptShort(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
