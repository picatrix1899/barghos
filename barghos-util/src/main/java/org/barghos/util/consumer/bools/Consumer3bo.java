package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three boolean input arguments and returns no result.
 * {@link Consumer3bo} is expected to operate via side-effects.
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
public interface Consumer3bo extends Consumer3<Boolean,Boolean,Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptBool(boolean a, boolean b, boolean c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3bo} performing this operation and the operation after.
     */
    default Consumer3bo andThenBool(Consumer3bo after)
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
     * @return A new {@link Consumer3bo} performing this operation and the operations after.
     */
	default Consumer3bo andThenBool(Consumer3bo... after)
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

    	return (a, b, c) -> {acceptBool(a, b, c); for(Consumer3bo consumer : after) consumer.acceptBool(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3bo} performing this operation and the operations after.
     */
	default Consumer3bo andThenBool(Iterable<Consumer3bo> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptBool(a, b, c); for(Consumer3bo consumer : after) consumer.acceptBool(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3bo} performing the operation before and this operation.
     */
    default Consumer3bo beforeThatBool(Consumer3bo before)
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
     * @return A new {@link Consumer3bo} performing the operations before and this operation.
     */
    default Consumer3bo beforeThatBool(Consumer3bo... before)
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
    	
    	return (a, b, c) -> {for(Consumer3bo consumer : before) consumer.acceptBool(a, b, c); acceptBool(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bo} performing the operations before and this operation.
     */
    default Consumer3bo beforeThatBool(Iterable<Consumer3bo> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3bo consumer : before) consumer.acceptBool(a, b, c); acceptBool(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bo} performing the operations.
     */
	static Consumer3bo inSequenceBool(Consumer3bo... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3bo consumer : consumers) consumer.acceptBool(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bo} performing the operations.
     */
    static Consumer3bo inSequenceBool(Iterable<Consumer3bo> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3bo consumer : consumers) consumer.acceptBool(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a, Boolean b, Boolean c)
    {
    	acceptBool(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3bo} performing this operation and the operation after.
     */
    default Consumer3bo andThen(Consumer3<Boolean,Boolean,Boolean> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3bo)
    	{
    		final Consumer3bo originalAfter = (Consumer3bo)after;
    		
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
     * @return A new {@link Consumer3bo} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3bo andThen(Consumer3<Boolean,Boolean,Boolean>... after)
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
    		if(after[0] instanceof Consumer3bo)
        	{
        		final Consumer3bo originalAfter = (Consumer3bo)after[0];
        		
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
			
    		for(Consumer3<Boolean,Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof Consumer3bo)
    				((Consumer3bo)consumer).acceptBool(a, b, c);
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
     * @return A new {@link Consumer3bo} performing this operation and the operations after.
     */
	default Consumer3bo andThen(Iterable<Consumer3<Boolean,Boolean,Boolean>> after)
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
			
    		for(Consumer3<Boolean,Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof Consumer3bo)
    				((Consumer3bo)consumer).acceptBool(a, b, c);
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
     * @return A new {@link Consumer3bo} performing the operation before and this operation.
     */
    default Consumer3bo beforeThat(Consumer3<Boolean,Boolean,Boolean> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3bo)
    	{
    		final Consumer3bo originalBefore = (Consumer3bo)before;
    		
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
     * @return A new {@link Consumer3bo} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3bo beforeThat(Consumer3<Boolean,Boolean,Boolean>... before)
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
    		if(before[0] instanceof Consumer3bo)
        	{
        		final Consumer3bo originalBefore = (Consumer3bo)before[0];
        		
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
    		for(Consumer3<Boolean,Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof Consumer3bo)
    				((Consumer3bo)consumer).acceptBool(a, b, c);
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
     * @return A new {@link Consumer3bo} performing the operations before and this operation.
     */
    default Consumer3bo beforeThat(Iterable<Consumer3<Boolean,Boolean,Boolean>> before)
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
    		for(Consumer3<Boolean,Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof Consumer3bo)
    				((Consumer3bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptBool(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3bo inSequence(Consumer3<Boolean,Boolean,Boolean>... consumers)
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
    		if(consumers[0] instanceof Consumer3bo)
    			return (Consumer3bo) consumers[0];
    		else
    			return (Consumer3bo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Boolean,Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3bo)
    				((Consumer3bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bo} performing the operations.
     */
    static Consumer3bo inSequence(Iterable<Consumer3<Boolean,Boolean,Boolean>> consumers)
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
    		for(Consumer3<Boolean,Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3bo)
    				((Consumer3bo)consumer).acceptBool(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
