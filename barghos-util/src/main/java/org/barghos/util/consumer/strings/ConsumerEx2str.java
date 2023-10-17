package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two string input argument and returns no result.
 * Unlike {@link Consumer2str} this may throw Exceptions.
 * {@link ConsumerEx2str} is expected to operate via side-effects.
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
public interface ConsumerEx2str extends ConsumerEx2<String,String>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptString(String a, String b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2str} performing this operation and the operation after.
     */
    default ConsumerEx2str andThenString(ConsumerEx2str after)
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
     * @return A new {@link ConsumerEx2str} performing this operation and the operations after.
     */
	default ConsumerEx2str andThenString(ConsumerEx2str... after)
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

    	return (a, b) -> {acceptString(a, b); for(ConsumerEx2str consumer : after) consumer.acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2str} performing this operation and the operations after.
     */
	default ConsumerEx2str andThenString(Iterable<ConsumerEx2str> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptString(a, b); for(ConsumerEx2str consumer : after) consumer.acceptString(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2str} performing the operation before and this operation.
     */
    default ConsumerEx2str beforeThatString(ConsumerEx2str before)
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
     * @return A new {@link ConsumerEx2str} performing the operations before and this operation.
     */
    default ConsumerEx2str beforeThatString(ConsumerEx2str... before)
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
    	
    	return (a, b) -> {for(ConsumerEx2str consumer : before) consumer.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2str} performing the operations before and this operation.
     */
    default ConsumerEx2str beforeThatString(Iterable<ConsumerEx2str> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2str consumer : before) consumer.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2str} performing the operations.
     */
	static ConsumerEx2str inSequenceString(ConsumerEx2str... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2str consumer : consumers) consumer.acceptString(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2str} performing the operations.
     */
    static ConsumerEx2str inSequenceString(Iterable<ConsumerEx2str> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2str consumer : consumers) consumer.acceptString(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String a, String b) throws Exception
    {
    	acceptString(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2str} performing this operation and the operation after.
     */
    default ConsumerEx2str andThen(ConsumerEx2<String,String> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2str)
    	{
    		final ConsumerEx2str originalAfter = (ConsumerEx2str)after;
    		
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
     * @return A new {@link ConsumerEx2str} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2str andThen(ConsumerEx2<String,String>... after)
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
    		if(after[0] instanceof ConsumerEx2str)
        	{
        		final ConsumerEx2str originalAfter = (ConsumerEx2str)after[0];
        		
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
			
    		for(ConsumerEx2<String,String> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2str)
    				((ConsumerEx2str)consumer).acceptString(a, b);
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
     * @return A new {@link ConsumerEx2str} performing this operation and the operations after.
     */
	default ConsumerEx2str andThen(Iterable<ConsumerEx2<String,String>> after)
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
			
    		for(ConsumerEx2<String,String> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2str)
    				((ConsumerEx2str)consumer).acceptString(a, b);
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
     * @return A new {@link ConsumerEx2str} performing the operation before and this operation.
     */
    default ConsumerEx2str beforeThat(ConsumerEx2<String,String> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2str)
    	{
    		final ConsumerEx2str originalBefore = (ConsumerEx2str)before;
    		
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
     * @return A new {@link ConsumerEx2str} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2str beforeThat(ConsumerEx2<String,String>... before)
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
    		if(before[0] instanceof ConsumerEx2str)
        	{
        		final ConsumerEx2str originalBefore = (ConsumerEx2str)before[0];
        		
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
    		for(ConsumerEx2<String,String> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2str)
    				((ConsumerEx2str)consumer).acceptString(a, b);
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
     * @return A new {@link ConsumerEx2str} performing the operations before and this operation.
     */
    default ConsumerEx2str beforeThat(Iterable<ConsumerEx2<String,String>> before)
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
    		for(ConsumerEx2<String,String> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2str)
    				((ConsumerEx2str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptString(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2str} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2str inSequence(ConsumerEx2<String,String>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2str)
    			return (ConsumerEx2str) consumers[0];
    		else
    			return (ConsumerEx2str) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<String,String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2str)
    				((ConsumerEx2str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2str} performing the operations.
     */
    static ConsumerEx2str inSequence(Iterable<ConsumerEx2<String,String>> consumers)
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
    		for(ConsumerEx2<String,String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2str)
    				((ConsumerEx2str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
