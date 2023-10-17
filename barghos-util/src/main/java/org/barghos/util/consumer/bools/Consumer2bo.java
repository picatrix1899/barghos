package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two boolean input arguments and returns no result.
 * {@link Consumer2bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBool(boolean, boolean)}.
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
public interface Consumer2bo extends Consumer2<Boolean,Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptBool(boolean a, boolean b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2bo} performing this operation and the operation after.
     */
    default Consumer2bo andThenBool(Consumer2bo after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptBool(a, b); after.acceptBool(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bo} performing this operation and the operations after.
     */
	default Consumer2bo andThenBool(Consumer2bo... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptBool(a, b); after[0].acceptBool(a, b);};

    	return (a, b) -> {acceptBool(a, b); for(Consumer2bo consumer : after) consumer.acceptBool(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bo} performing this operation and the operations after.
     */
	default Consumer2bo andThenBool(Iterable<Consumer2bo> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptBool(a, b); for(Consumer2bo consumer : after) consumer.acceptBool(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2bo} performing the operation before and this operation.
     */
    default Consumer2bo beforeThatBool(Consumer2bo before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptBool(a, b); acceptBool(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bo} performing the operations before and this operation.
     */
    default Consumer2bo beforeThatBool(Consumer2bo... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptBool(a, b); acceptBool(a, b);};
    	
    	return (a, b) -> {for(Consumer2bo consumer : before) consumer.acceptBool(a, b); acceptBool(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bo} performing the operations before and this operation.
     */
    default Consumer2bo beforeThatBool(Iterable<Consumer2bo> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2bo consumer : before) consumer.acceptBool(a, b); acceptBool(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bo} performing the operations.
     */
	static Consumer2bo inSequenceBool(Consumer2bo... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(Consumer2bo consumer : consumers) consumer.acceptBool(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bo} performing the operations.
     */
    static Consumer2bo inSequenceBool(Iterable<Consumer2bo> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2bo consumer : consumers) consumer.acceptBool(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a, Boolean b)
    {
    	acceptBool(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2bo} performing this operation and the operation after.
     */
    default Consumer2bo andThen(Consumer2<Boolean,Boolean> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2bo)
    	{
    		final Consumer2bo originalAfter = (Consumer2bo)after;
    		
    		return (a, b) -> {acceptBool(a, b); originalAfter.acceptBool(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptBool(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bo} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2bo andThen(Consumer2<Boolean,Boolean>... after)
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
    		if(after[0] instanceof Consumer2bo)
        	{
        		final Consumer2bo originalAfter = (Consumer2bo)after[0];
        		
        		return (a, b) -> {acceptBool(a, b); originalAfter.acceptBool(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptBool(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptBool(a, b);
			
    		for(Consumer2<Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof Consumer2bo)
    				((Consumer2bo)consumer).acceptBool(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bo} performing this operation and the operations after.
     */
	default Consumer2bo andThen(Iterable<Consumer2<Boolean,Boolean>> after)
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
		return (a, b) -> {
			acceptBool(a, b);
			
    		for(Consumer2<Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof Consumer2bo)
    				((Consumer2bo)consumer).acceptBool(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2bo} performing the operation before and this operation.
     */
    default Consumer2bo beforeThat(Consumer2<Boolean,Boolean> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2bo)
    	{
    		final Consumer2bo originalBefore = (Consumer2bo)before;
    		
    		return (a, b) -> {originalBefore.acceptBool(a, b); acceptBool(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptBool(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bo} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2bo beforeThat(Consumer2<Boolean,Boolean>... before)
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
    		if(before[0] instanceof Consumer2bo)
        	{
        		final Consumer2bo originalBefore = (Consumer2bo)before[0];
        		
        		return (a, b) -> {originalBefore.acceptBool(a, b); acceptBool(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptBool(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof Consumer2bo)
    				((Consumer2bo)consumer).acceptBool(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptBool(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bo} performing the operations before and this operation.
     */
    default Consumer2bo beforeThat(Iterable<Consumer2<Boolean,Boolean>> before)
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
    	return (a, b) -> {
    		for(Consumer2<Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof Consumer2bo)
    				((Consumer2bo)consumer).acceptBool(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptBool(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2bo inSequence(Consumer2<Boolean,Boolean>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer2bo)
    			return (Consumer2bo) consumers[0];
    		else
    			return (Consumer2bo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2bo)
    				((Consumer2bo)consumer).acceptBool(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2bo} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bo} performing the operations.
     */
    static Consumer2bo inSequence(Iterable<Consumer2<Boolean,Boolean>> consumers)
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
    	return (a, b) -> {
    		for(Consumer2<Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2bo)
    				((Consumer2bo)consumer).acceptBool(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2bo andThen(java.util.function.BiConsumer<? super Boolean,? super Boolean> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptBool(a, b); after.accept(a, b);};
    }
}
