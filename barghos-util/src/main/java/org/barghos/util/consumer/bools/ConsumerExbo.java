package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one boolean input argument and returns no result.
 * Unlike {@link Consumerbo} this may throw Exceptions.
 * {@link ConsumerExbo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBool(boolean)}.
 * 
 * @see Consumerbo
 * @see ConsumerExbo
 * @see Consumer2bo
 * @see ConsumerEx2bo
 * @see Consumer3bo
 * @see ConsumerEx3bo
 * @see Consumer4bo
 * @see ConsumerEx4bo
 */
@FunctionalInterface
public interface ConsumerExbo extends ConsumerEx<Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBool(boolean a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExbo} performing this operation and the operation after.
     */
    default ConsumerExbo andThenBool(ConsumerExbo after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptBool(a); after.acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbo} performing this operation and the operations after.
     */
	default ConsumerExbo andThenBool(ConsumerExbo... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptBool(a); after[0].acceptBool(a);};

    	return (a) -> {acceptBool(a); for(ConsumerExbo consumer : after) consumer.acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbo} performing this operation and the operations after.
     */
	default ConsumerExbo andThenBool(Iterable<ConsumerExbo> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptBool(a); for(ConsumerExbo consumer : after) consumer.acceptBool(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExbo} performing the operation before and this operation.
     */
    default ConsumerExbo beforeThatBool(ConsumerExbo before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbo} performing the operations before and this operation.
     */
    default ConsumerExbo beforeThatBool(ConsumerExbo... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptBool(a); acceptBool(a);};
    	
    	return (a) -> {for(ConsumerExbo consumer : before) consumer.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbo} performing the operations before and this operation.
     */
    default ConsumerExbo beforeThatBool(Iterable<ConsumerExbo> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExbo consumer : before) consumer.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExbo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbo} performing the operations.
     */
	static ConsumerExbo inSequenceBool(ConsumerExbo... consumers)
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
    	
    	return (a) -> {for(ConsumerExbo consumer : consumers) consumer.acceptBool(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExbo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbo} performing the operations.
     */
    static ConsumerExbo inSequenceBool(Iterable<ConsumerExbo> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExbo consumer : consumers) consumer.acceptBool(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a) throws Exception
    {
    	acceptBool(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExbo} performing this operation and the operation after.
     */
    default ConsumerExbo andThen(ConsumerEx<Boolean> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExbo)
    	{
    		final ConsumerExbo originalAfter = (ConsumerExbo)after;
    		
    		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {acceptBool(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbo} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExbo andThen(ConsumerEx<Boolean>... after)
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
    		if(after[0] instanceof ConsumerExbo)
        	{
        		final ConsumerExbo originalAfter = (ConsumerExbo)after[0];
        		
        		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
        	}
        	else
        	{
        		return (a) -> {acceptBool(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptBool(a);
			
    		for(ConsumerEx<Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerExbo)
    				((ConsumerExbo)consumer).acceptBool(a);
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
     * @return A new {@link ConsumerExbo} performing this operation and the operations after.
     */
	default ConsumerExbo andThen(Iterable<ConsumerEx<Boolean>> after)
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
			acceptBool(a);
			
    		for(ConsumerEx<Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerExbo)
    				((ConsumerExbo)consumer).acceptBool(a);
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
     * @return A new {@link ConsumerExbo} performing the operation before and this operation.
     */
    default ConsumerExbo beforeThat(ConsumerEx<Boolean> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExbo)
    	{
    		final ConsumerExbo originalBefore = (ConsumerExbo)before;
    		
    		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptBool(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbo} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExbo beforeThat(ConsumerEx<Boolean>... before)
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
    		if(before[0] instanceof ConsumerExbo)
        	{
        		final ConsumerExbo originalBefore = (ConsumerExbo)before[0];
        		
        		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptBool(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerExbo)
    				((ConsumerExbo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBool(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbo} performing the operations before and this operation.
     */
    default ConsumerExbo beforeThat(Iterable<ConsumerEx<Boolean>> before)
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
    		for(ConsumerEx<Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerExbo)
    				((ConsumerExbo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBool(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExbo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExbo inSequence(ConsumerEx<Boolean>... consumers)
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
    		if(consumers[0] instanceof ConsumerExbo)
    			return (ConsumerExbo) consumers[0];
    		else
    			return (ConsumerExbo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExbo)
    				((ConsumerExbo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExbo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbo} performing the operations.
     */
    static ConsumerExbo inSequence(Iterable<ConsumerEx<Boolean>> consumers)
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
    		for(ConsumerEx<Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExbo)
    				((ConsumerExbo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
