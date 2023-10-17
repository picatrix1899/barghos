package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three boolean input argument and returns no result.
 * Unlike {@link Consumer3bo} this may throw Exceptions.
 * {@link ConsumerEx3bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBool(boolean, boolean, boolean)}.
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
public interface ConsumerEx3bo extends ConsumerEx3<Boolean,Boolean,Boolean>
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
    void acceptBool(boolean a, boolean b, boolean c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing this operation and the operation after.
     */
    default ConsumerEx3bo andThenBool(ConsumerEx3bo after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptBool(a, b, c); after.acceptBool(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing this operation and the operations after.
     */
	default ConsumerEx3bo andThenBool(ConsumerEx3bo... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptBool(a, b, c); after[0].acceptBool(a, b, c);};

    	return (a, b, c) -> {acceptBool(a, b, c); for(ConsumerEx3bo consumer : after) consumer.acceptBool(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing this operation and the operations after.
     */
	default ConsumerEx3bo andThenBool(Iterable<ConsumerEx3bo> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptBool(a, b, c); for(ConsumerEx3bo consumer : after) consumer.acceptBool(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operation before and this operation.
     */
    default ConsumerEx3bo beforeThatBool(ConsumerEx3bo before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptBool(a, b, c); acceptBool(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operations before and this operation.
     */
    default ConsumerEx3bo beforeThatBool(ConsumerEx3bo... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptBool(a, b, c); acceptBool(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3bo consumer : before) consumer.acceptBool(a, b, c); acceptBool(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operations before and this operation.
     */
    default ConsumerEx3bo beforeThatBool(Iterable<ConsumerEx3bo> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(ConsumerEx3bo consumer : before) consumer.acceptBool(a, b, c); acceptBool(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operations.
     */
	static ConsumerEx3bo inSequenceBool(ConsumerEx3bo... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3bo consumer : consumers) consumer.acceptBool(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operations.
     */
    static ConsumerEx3bo inSequenceBool(Iterable<ConsumerEx3bo> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(ConsumerEx3bo consumer : consumers) consumer.acceptBool(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a, Boolean b, Boolean c) throws Exception
    {
    	acceptBool(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing this operation and the operation after.
     */
    default ConsumerEx3bo andThen(ConsumerEx3<Boolean,Boolean,Boolean> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3bo)
    	{
    		final ConsumerEx3bo originalAfter = (ConsumerEx3bo)after;
    		
    		return (a, b, c) -> {acceptBool(a, b, c); originalAfter.acceptBool(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptBool(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3bo andThen(ConsumerEx3<Boolean,Boolean,Boolean>... after)
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
    		if(after[0] instanceof ConsumerEx3bo)
        	{
        		final ConsumerEx3bo originalAfter = (ConsumerEx3bo)after[0];
        		
        		return (a, b, c) -> {acceptBool(a, b, c); originalAfter.acceptBool(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptBool(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptBool(a, b, c);
			
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3bo)
    				((ConsumerEx3bo)consumer).acceptBool(a, b, c);
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
     * @return A new {@link ConsumerEx3bo} performing this operation and the operations after.
     */
	default ConsumerEx3bo andThen(Iterable<ConsumerEx3<Boolean,Boolean,Boolean>> after)
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
			acceptBool(a, b, c);
			
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3bo)
    				((ConsumerEx3bo)consumer).acceptBool(a, b, c);
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
     * @return A new {@link ConsumerEx3bo} performing the operation before and this operation.
     */
    default ConsumerEx3bo beforeThat(ConsumerEx3<Boolean,Boolean,Boolean> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3bo)
    	{
    		final ConsumerEx3bo originalBefore = (ConsumerEx3bo)before;
    		
    		return (a, b, c) -> {originalBefore.acceptBool(a, b, c); acceptBool(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptBool(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3bo beforeThat(ConsumerEx3<Boolean,Boolean,Boolean>... before)
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
    		if(before[0] instanceof ConsumerEx3bo)
        	{
        		final ConsumerEx3bo originalBefore = (ConsumerEx3bo)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptBool(a, b, c); acceptBool(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptBool(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3bo)
    				((ConsumerEx3bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptBool(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operations before and this operation.
     */
    default ConsumerEx3bo beforeThat(Iterable<ConsumerEx3<Boolean,Boolean,Boolean>> before)
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
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3bo)
    				((ConsumerEx3bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptBool(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3bo inSequence(ConsumerEx3<Boolean,Boolean,Boolean>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3bo)
    			return (ConsumerEx3bo) consumers[0];
    		else
    			return (ConsumerEx3bo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3bo)
    				((ConsumerEx3bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3bo} performing the operations.
     */
    static ConsumerEx3bo inSequence(Iterable<ConsumerEx3<Boolean,Boolean,Boolean>> consumers)
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
    		for(ConsumerEx3<Boolean,Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3bo)
    				((ConsumerEx3bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
