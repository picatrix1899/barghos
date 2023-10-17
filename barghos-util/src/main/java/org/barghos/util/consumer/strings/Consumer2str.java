package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two string input arguments and returns no result.
 * {@link Consumer2str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptString(String, String)}.
 * 
 * @see Consumerstr
 * @see ConsumerExstr
 * @see Consumer2str
 * @see ConsumerEx2str
 * @see Consumer3str
 * @see ConsumerEx3str
 * @see Consumer4str
 * @see ConsumerEx4str
 */
@FunctionalInterface
public interface Consumer2str extends Consumer2<String,String>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptString(String a, String b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2str} performing this operation and the operation after.
     */
    default Consumer2str andThenString(Consumer2str after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptString(a, b); after.acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2str} performing this operation and the operations after.
     */
	default Consumer2str andThenString(Consumer2str... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptString(a, b); after[0].acceptString(a, b);};

    	return (a, b) -> {acceptString(a, b); for(Consumer2str consumer : after) consumer.acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2str} performing this operation and the operations after.
     */
	default Consumer2str andThenString(Iterable<Consumer2str> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptString(a, b); for(Consumer2str consumer : after) consumer.acceptString(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2str} performing the operation before and this operation.
     */
    default Consumer2str beforeThatString(Consumer2str before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2str} performing the operations before and this operation.
     */
    default Consumer2str beforeThatString(Consumer2str... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptString(a, b); acceptString(a, b);};
    	
    	return (a, b) -> {for(Consumer2str consumer : before) consumer.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2str} performing the operations before and this operation.
     */
    default Consumer2str beforeThatString(Iterable<Consumer2str> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2str consumer : before) consumer.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2str} performing the operations.
     */
	static Consumer2str inSequenceString(Consumer2str... consumers)
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
    	
    	return (a, b) -> {for(Consumer2str consumer : consumers) consumer.acceptString(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2str} performing the operations.
     */
    static Consumer2str inSequenceString(Iterable<Consumer2str> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2str consumer : consumers) consumer.acceptString(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String a, String b)
    {
    	acceptString(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2str} performing this operation and the operation after.
     */
    default Consumer2str andThen(Consumer2<String,String> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2str)
    	{
    		final Consumer2str originalAfter = (Consumer2str)after;
    		
    		return (a, b) -> {acceptString(a, b); originalAfter.acceptString(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptString(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2str} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2str andThen(Consumer2<String,String>... after)
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
    		if(after[0] instanceof Consumer2str)
        	{
        		final Consumer2str originalAfter = (Consumer2str)after[0];
        		
        		return (a, b) -> {acceptString(a, b); originalAfter.acceptString(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptString(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptString(a, b);
			
    		for(Consumer2<String,String> consumer : after)
    		{
    			if(consumer instanceof Consumer2str)
    				((Consumer2str)consumer).acceptString(a, b);
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
     * @return A new {@link Consumer2str} performing this operation and the operations after.
     */
	default Consumer2str andThen(Iterable<Consumer2<String,String>> after)
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
			acceptString(a, b);
			
    		for(Consumer2<String,String> consumer : after)
    		{
    			if(consumer instanceof Consumer2str)
    				((Consumer2str)consumer).acceptString(a, b);
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
     * @return A new {@link Consumer2str} performing the operation before and this operation.
     */
    default Consumer2str beforeThat(Consumer2<String,String> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2str)
    	{
    		final Consumer2str originalBefore = (Consumer2str)before;
    		
    		return (a, b) -> {originalBefore.acceptString(a, b); acceptString(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptString(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2str} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2str beforeThat(Consumer2<String,String>... before)
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
    		if(before[0] instanceof Consumer2str)
        	{
        		final Consumer2str originalBefore = (Consumer2str)before[0];
        		
        		return (a, b) -> {originalBefore.acceptString(a, b); acceptString(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptString(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<String,String> consumer : before)
    		{
    			if(consumer instanceof Consumer2str)
    				((Consumer2str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptString(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2str} performing the operations before and this operation.
     */
    default Consumer2str beforeThat(Iterable<Consumer2<String,String>> before)
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
    		for(Consumer2<String,String> consumer : before)
    		{
    			if(consumer instanceof Consumer2str)
    				((Consumer2str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptString(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2str} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2str inSequence(Consumer2<String,String>... consumers)
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
    		if(consumers[0] instanceof Consumer2str)
    			return (Consumer2str) consumers[0];
    		else
    			return (Consumer2str) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<String,String> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2str)
    				((Consumer2str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2str} performing the operations.
     */
    static Consumer2str inSequence(Iterable<Consumer2<String,String>> consumers)
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
    		for(Consumer2<String,String> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2str)
    				((Consumer2str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2str andThen(java.util.function.BiConsumer<? super String,? super String> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptString(a, b); after.accept(a, b);};
    }
}
