package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three string input argument and returns no result.
 * Unlike {@link Consumer3str} this may throw Exceptions.
 * {@link ConsumerEx3str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptString(String, String, String)}.
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
public interface ConsumerEx3str extends ConsumerEx3<String,String,String>
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
    void acceptString(String a, String b, String c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing this operation and the operation after.
     */
    default ConsumerEx3str andThenString(ConsumerEx3str after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptString(a, b, c); after.acceptString(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing this operation and the operations after.
     */
	default ConsumerEx3str andThenString(ConsumerEx3str... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptString(a, b, c); after[0].acceptString(a, b, c);};

    	return (a, b, c) -> {acceptString(a, b, c); for(ConsumerEx3str consumer : after) consumer.acceptString(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing this operation and the operations after.
     */
	default ConsumerEx3str andThenString(Iterable<ConsumerEx3str> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptString(a, b, c); for(ConsumerEx3str consumer : after) consumer.acceptString(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing the operation before and this operation.
     */
    default ConsumerEx3str beforeThatString(ConsumerEx3str before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptString(a, b, c); acceptString(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing the operations before and this operation.
     */
    default ConsumerEx3str beforeThatString(ConsumerEx3str... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptString(a, b, c); acceptString(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3str consumer : before) consumer.acceptString(a, b, c); acceptString(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing the operations before and this operation.
     */
    default ConsumerEx3str beforeThatString(Iterable<ConsumerEx3str> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(ConsumerEx3str consumer : before) consumer.acceptString(a, b, c); acceptString(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3str} performing the operations.
     */
	static ConsumerEx3str inSequenceString(ConsumerEx3str... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3str consumer : consumers) consumer.acceptString(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3str} performing the operations.
     */
    static ConsumerEx3str inSequenceString(Iterable<ConsumerEx3str> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(ConsumerEx3str consumer : consumers) consumer.acceptString(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String a, String b, String c) throws Exception
    {
    	acceptString(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing this operation and the operation after.
     */
    default ConsumerEx3str andThen(ConsumerEx3<String,String,String> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3str)
    	{
    		final ConsumerEx3str originalAfter = (ConsumerEx3str)after;
    		
    		return (a, b, c) -> {acceptString(a, b, c); originalAfter.acceptString(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptString(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3str andThen(ConsumerEx3<String,String,String>... after)
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
    		if(after[0] instanceof ConsumerEx3str)
        	{
        		final ConsumerEx3str originalAfter = (ConsumerEx3str)after[0];
        		
        		return (a, b, c) -> {acceptString(a, b, c); originalAfter.acceptString(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptString(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptString(a, b, c);
			
    		for(ConsumerEx3<String,String,String> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3str)
    				((ConsumerEx3str)consumer).acceptString(a, b, c);
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
     * @return A new {@link ConsumerEx3str} performing this operation and the operations after.
     */
	default ConsumerEx3str andThen(Iterable<ConsumerEx3<String,String,String>> after)
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
			acceptString(a, b, c);
			
    		for(ConsumerEx3<String,String,String> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3str)
    				((ConsumerEx3str)consumer).acceptString(a, b, c);
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
     * @return A new {@link ConsumerEx3str} performing the operation before and this operation.
     */
    default ConsumerEx3str beforeThat(ConsumerEx3<String,String,String> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3str)
    	{
    		final ConsumerEx3str originalBefore = (ConsumerEx3str)before;
    		
    		return (a, b, c) -> {originalBefore.acceptString(a, b, c); acceptString(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptString(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3str beforeThat(ConsumerEx3<String,String,String>... before)
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
    		if(before[0] instanceof ConsumerEx3str)
        	{
        		final ConsumerEx3str originalBefore = (ConsumerEx3str)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptString(a, b, c); acceptString(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptString(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<String,String,String> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3str)
    				((ConsumerEx3str)consumer).acceptString(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptString(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3str} performing the operations before and this operation.
     */
    default ConsumerEx3str beforeThat(Iterable<ConsumerEx3<String,String,String>> before)
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
    		for(ConsumerEx3<String,String,String> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3str)
    				((ConsumerEx3str)consumer).acceptString(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptString(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3str} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3str inSequence(ConsumerEx3<String,String,String>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3str)
    			return (ConsumerEx3str) consumers[0];
    		else
    			return (ConsumerEx3str) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<String,String,String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3str)
    				((ConsumerEx3str)consumer).acceptString(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3str} performing the operations.
     */
    static ConsumerEx3str inSequence(Iterable<ConsumerEx3<String,String,String>> consumers)
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
    		for(ConsumerEx3<String,String,String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3str)
    				((ConsumerEx3str)consumer).acceptString(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
