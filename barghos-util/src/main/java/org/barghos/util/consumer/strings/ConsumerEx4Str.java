package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four string input arguments and returns
 * no result. Unlike {@link Consumer4str} this may throw exceptions.
 * {@link ConsumerEx4Str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptString}.
 * 
 * @see ConsumerStr
 * @see ConsumerExStr
 * @see Consumer2Str
 * @see ConsumerEx2Str
 * @see Consumer3Str
 * @see ConsumerEx3Str
 * @see Consumer4Str
 * @see ConsumerEx4Str
 */
@FunctionalInterface
public interface ConsumerEx4Str extends ConsumerEx4<String,String,String,String>
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
     * @return A new {@link ConsumerEx4Str} performing this operation and the
     * operation after.
     */
    default ConsumerEx4Str thenString(ConsumerEx4Str after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptString(a, b, c, d); after.acceptString(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4Str} performing this operation and the
     * operations after.
     */
	default ConsumerEx4Str thenString(ConsumerEx4Str... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptString(a, b, c, d); after[0].acceptString(a, b, c, d);};

    	return (a, b, c, d) -> {acceptString(a, b, c, d); for(ConsumerEx4Str consumer : after) consumer.acceptString(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4Str} performing the operation before and
     * this operation.
     */
    default ConsumerEx4Str beforeString(ConsumerEx4Str before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptString(a, b, c, d); acceptString(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4Str} performing the operations before and
     * this operation.
     */
    default ConsumerEx4Str beforeString(ConsumerEx4Str... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptString(a, b, c, d); acceptString(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4Str consumer : before) consumer.acceptString(a, b, c, d); acceptString(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4Str} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4Str} performing the operations.
     */
	static ConsumerEx4Str sequenceString(ConsumerEx4Str... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(ConsumerEx4Str consumer : consumers) consumer.acceptString(a, b, c, d);};
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
     * @return A new {@link ConsumerEx4Str} performing this operation and the
     * operation after.
     */
    default ConsumerEx4Str then(ConsumerEx4<String,String,String,String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4Str)
    	{
    		final ConsumerEx4Str originalAfter = (ConsumerEx4Str)after;
    		
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
     * @return A new {@link ConsumerEx4Str} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4Str then(ConsumerEx4<String,String,String,String>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
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
    		if(after[0] instanceof ConsumerEx4Str)
        	{
        		final ConsumerEx4Str originalAfter = (ConsumerEx4Str)after[0];
        		
        		return (a, b, c, d) -> {acceptString(a, b, c, d); originalAfter.acceptString(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptString(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptString(a, b, c, d);
			
    		for(ConsumerEx4<String,String,String,String> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4Str)
    				((ConsumerEx4Str)consumer).acceptString(a, b, c, d);
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
     * @return A new {@link ConsumerEx4Str} performing the operation before and
     * this operation.
     */
    default ConsumerEx4Str before(ConsumerEx4<String,String,String,String> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4Str)
    	{
    		final ConsumerEx4Str originalBefore = (ConsumerEx4Str)before;
    		
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
     * @return A new {@link ConsumerEx4Str} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4Str before(ConsumerEx4<String,String,String,String>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
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
    		if(before[0] instanceof ConsumerEx4Str)
        	{
        		final ConsumerEx4Str originalBefore = (ConsumerEx4Str)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptString(a, b, c, d); acceptString(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptString(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<String,String,String,String> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4Str)
    				((ConsumerEx4Str)consumer).acceptString(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptString(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4Str} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4Str} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4Str sequence(ConsumerEx4<String,String,String,String>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly
    	 * without wrapping. Otherwise wrap the original operation in an
    	 * operation of the desired type. The optimization prevents unnecessary
    	 * auto-boxing if possible and also unnecessary creation of a new
    	 * operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerEx4Str)
    			return (ConsumerEx4Str) consumers[0];
    		else
    			return (ConsumerEx4Str) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<String,String,String,String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4Str)
    				((ConsumerEx4Str)consumer).acceptString(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link Consumer4Str}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link Consumer4Str} performing the operations and
     * exception handling.
     */
    default Consumer4Str handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
    	return (a, b, c, d) -> {
    		try
    		{
    			acceptString(a, b, c, d);
    		}
    		catch(Exception e)
    		{
    			handler.handle(e);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer may throw an exception the returned consumer is
     * again a {@link ConsumerEx4Str} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerEx4Str} performing the operations.
     */
    default ConsumerEx4Str onException(ConsumerEx4Str consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b, c, d) -> {
    		try
    		{
    			acceptString(a, b, c, d);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptString(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link Consumer4Str}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link Consumer4Str} performing the operations.
     */
    default Consumer4Str onException(Consumer4Str consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b, c, d) -> {
    		try
    		{
    			acceptString(a, b, c, d);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptString(a, b, c, d);
    		}
    	};
    }
}
