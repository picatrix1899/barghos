package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four string input argument and returns no result.
 * Unlike {@link Consumer4str} this may throw Exceptions.
 * {@link ConsumerEx4str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptString(String, String, String, String)}.
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
public interface ConsumerEx4str extends ConsumerEx4<String,String,String,String>
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
    void acceptString(String a, String b, String c, String d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing this operation and the operation after.
     */
    default ConsumerEx4str andThenString(ConsumerEx4str after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptString(a, b, c, d); after.acceptString(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing this operation and the operations after.
     */
	default ConsumerEx4str andThenString(ConsumerEx4str... after)
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
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptString(a, b, c, d); after[0].acceptString(a, b, c, d);};

    	return (a, b, c, d) -> {acceptString(a, b, c, d); for(ConsumerEx4str consumer : after) consumer.acceptString(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing this operation and the operations after.
     */
	default ConsumerEx4str andThenString(Iterable<ConsumerEx4str> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptString(a, b, c, d); for(ConsumerEx4str consumer : after) consumer.acceptString(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing the operation before and this operation.
     */
    default ConsumerEx4str beforeThatString(ConsumerEx4str before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptString(a, b, c, d); acceptString(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing the operations before and this operation.
     */
    default ConsumerEx4str beforeThatString(ConsumerEx4str... before)
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
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptString(a, b, c, d); acceptString(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4str consumer : before) consumer.acceptString(a, b, c, d); acceptString(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing the operations before and this operation.
     */
    default ConsumerEx4str beforeThatString(Iterable<ConsumerEx4str> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4str consumer : before) consumer.acceptString(a, b, c, d); acceptString(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4str} performing the operations.
     */
	static ConsumerEx4str inSequenceString(ConsumerEx4str... consumers)
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
    	
    	return (a, b, c, d) -> {for(ConsumerEx4str consumer : consumers) consumer.acceptString(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4str} performing the operations.
     */
    static ConsumerEx4str inSequenceString(Iterable<ConsumerEx4str> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4str consumer : consumers) consumer.acceptString(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String a, String b, String c, String d) throws Exception
    {
    	acceptString(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing this operation and the operation after.
     */
    default ConsumerEx4str andThen(ConsumerEx4<String,String,String,String> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4str)
    	{
    		final ConsumerEx4str originalAfter = (ConsumerEx4str)after;
    		
    		return (a, b, c, d) -> {acceptString(a, b, c, d); originalAfter.acceptString(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptString(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4str andThen(ConsumerEx4<String,String,String,String>... after)
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
    		if(after[0] instanceof ConsumerEx4str)
        	{
        		final ConsumerEx4str originalAfter = (ConsumerEx4str)after[0];
        		
        		return (a, b, c, d) -> {acceptString(a, b, c, d); originalAfter.acceptString(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptString(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
			acceptString(a, b, c, d);
			
    		for(ConsumerEx4<String,String,String,String> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4str)
    				((ConsumerEx4str)consumer).acceptString(a, b, c, d);
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
     * @return A new {@link ConsumerEx4str} performing this operation and the operations after.
     */
	default ConsumerEx4str andThen(Iterable<ConsumerEx4<String,String,String,String>> after)
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
			acceptString(a, b, c, d);
			
    		for(ConsumerEx4<String,String,String,String> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4str)
    				((ConsumerEx4str)consumer).acceptString(a, b, c, d);
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
     * @return A new {@link ConsumerEx4str} performing the operation before and this operation.
     */
    default ConsumerEx4str beforeThat(ConsumerEx4<String,String,String,String> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4str)
    	{
    		final ConsumerEx4str originalBefore = (ConsumerEx4str)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptString(a, b, c, d); acceptString(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptString(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4str beforeThat(ConsumerEx4<String,String,String,String>... before)
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
    		if(before[0] instanceof ConsumerEx4str)
        	{
        		final ConsumerEx4str originalBefore = (ConsumerEx4str)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptString(a, b, c, d); acceptString(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptString(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<String,String,String,String> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4str)
    				((ConsumerEx4str)consumer).acceptString(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptString(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4str} performing the operations before and this operation.
     */
    default ConsumerEx4str beforeThat(Iterable<ConsumerEx4<String,String,String,String>> before)
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
    		for(ConsumerEx4<String,String,String,String> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4str)
    				((ConsumerEx4str)consumer).acceptString(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptString(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4str} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4str inSequence(ConsumerEx4<String,String,String,String>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx4str)
    			return (ConsumerEx4str) consumers[0];
    		else
    			return (ConsumerEx4str) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<String,String,String,String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4str)
    				((ConsumerEx4str)consumer).acceptString(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4str} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4str} performing the operations.
     */
    static ConsumerEx4str inSequence(Iterable<ConsumerEx4<String,String,String,String>> consumers)
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
    		for(ConsumerEx4<String,String,String,String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4str)
    				((ConsumerEx4str)consumer).acceptString(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
