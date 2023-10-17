package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four boolean input argument and returns no result.
 * Unlike {@link Consumer4bo} this may throw Exceptions.
 * {@link ConsumerEx4bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBool(boolean, boolean, boolean, boolean)}.
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
public interface ConsumerEx4bo extends ConsumerEx4<Boolean,Boolean,Boolean,Boolean>
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
    void acceptBool(boolean a, boolean b, boolean c, boolean d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing this operation and the operation after.
     */
    default ConsumerEx4bo andThenBool(ConsumerEx4bo after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptBool(a, b, c, d); after.acceptBool(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing this operation and the operations after.
     */
	default ConsumerEx4bo andThenBool(ConsumerEx4bo... after)
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
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptBool(a, b, c, d); after[0].acceptBool(a, b, c, d);};

    	return (a, b, c, d) -> {acceptBool(a, b, c, d); for(ConsumerEx4bo consumer : after) consumer.acceptBool(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing this operation and the operations after.
     */
	default ConsumerEx4bo andThenBool(Iterable<ConsumerEx4bo> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptBool(a, b, c, d); for(ConsumerEx4bo consumer : after) consumer.acceptBool(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operation before and this operation.
     */
    default ConsumerEx4bo beforeThatBool(ConsumerEx4bo before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operations before and this operation.
     */
    default ConsumerEx4bo beforeThatBool(ConsumerEx4bo... before)
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
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4bo consumer : before) consumer.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operations before and this operation.
     */
    default ConsumerEx4bo beforeThatBool(Iterable<ConsumerEx4bo> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4bo consumer : before) consumer.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operations.
     */
	static ConsumerEx4bo inSequenceBool(ConsumerEx4bo... consumers)
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
    	
    	return (a, b, c, d) -> {for(ConsumerEx4bo consumer : consumers) consumer.acceptBool(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operations.
     */
    static ConsumerEx4bo inSequenceBool(Iterable<ConsumerEx4bo> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4bo consumer : consumers) consumer.acceptBool(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a, Boolean b, Boolean c, Boolean d) throws Exception
    {
    	acceptBool(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing this operation and the operation after.
     */
    default ConsumerEx4bo andThen(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4bo)
    	{
    		final ConsumerEx4bo originalAfter = (ConsumerEx4bo)after;
    		
    		return (a, b, c, d) -> {acceptBool(a, b, c, d); originalAfter.acceptBool(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptBool(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4bo andThen(ConsumerEx4<Boolean,Boolean,Boolean,Boolean>... after)
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
    		if(after[0] instanceof ConsumerEx4bo)
        	{
        		final ConsumerEx4bo originalAfter = (ConsumerEx4bo)after[0];
        		
        		return (a, b, c, d) -> {acceptBool(a, b, c, d); originalAfter.acceptBool(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptBool(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
			acceptBool(a, b, c, d);
			
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4bo)
    				((ConsumerEx4bo)consumer).acceptBool(a, b, c, d);
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
     * @return A new {@link ConsumerEx4bo} performing this operation and the operations after.
     */
	default ConsumerEx4bo andThen(Iterable<ConsumerEx4<Boolean,Boolean,Boolean,Boolean>> after)
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
			acceptBool(a, b, c, d);
			
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4bo)
    				((ConsumerEx4bo)consumer).acceptBool(a, b, c, d);
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
     * @return A new {@link ConsumerEx4bo} performing the operation before and this operation.
     */
    default ConsumerEx4bo beforeThat(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4bo)
    	{
    		final ConsumerEx4bo originalBefore = (ConsumerEx4bo)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptBool(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4bo beforeThat(ConsumerEx4<Boolean,Boolean,Boolean,Boolean>... before)
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
    		if(before[0] instanceof ConsumerEx4bo)
        	{
        		final ConsumerEx4bo originalBefore = (ConsumerEx4bo)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptBool(a, b, c, d); acceptBool(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptBool(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4bo)
    				((ConsumerEx4bo)consumer).acceptBool(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptBool(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operations before and this operation.
     */
    default ConsumerEx4bo beforeThat(Iterable<ConsumerEx4<Boolean,Boolean,Boolean,Boolean>> before)
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
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4bo)
    				((ConsumerEx4bo)consumer).acceptBool(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptBool(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4bo inSequence(ConsumerEx4<Boolean,Boolean,Boolean,Boolean>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx4bo)
    			return (ConsumerEx4bo) consumers[0];
    		else
    			return (ConsumerEx4bo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4bo)
    				((ConsumerEx4bo)consumer).acceptBool(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4bo} performing the operations.
     */
    static ConsumerEx4bo inSequence(Iterable<ConsumerEx4<Boolean,Boolean,Boolean,Boolean>> consumers)
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
    		for(ConsumerEx4<Boolean,Boolean,Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4bo)
    				((ConsumerEx4bo)consumer).acceptBool(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
