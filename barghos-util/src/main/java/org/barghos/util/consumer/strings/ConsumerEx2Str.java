package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx2;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two string input arguments and returns
 * no result. Unlike {@link Consumer2str} this may throw exceptions.
 * {@link ConsumerEx2Str} is expected to operate via side-effects.
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
public interface ConsumerEx2Str extends ConsumerEx2<String,String>
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
     * @return A new {@link ConsumerEx2Str} performing this operation and the
     * operation after.
     */
    default ConsumerEx2Str thenString(ConsumerEx2Str after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptString(a, b); after.acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2Str} performing this operation and the
     * operations after.
     */
	default ConsumerEx2Str thenString(ConsumerEx2Str... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptString(a, b); after[0].acceptString(a, b);};

    	return (a, b) -> {acceptString(a, b); for(ConsumerEx2Str consumer : after) consumer.acceptString(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Str} performing the operation before and
     * this operation.
     */
    default ConsumerEx2Str beforeString(ConsumerEx2Str before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Str} performing the operations before and
     * this operation.
     */
    default ConsumerEx2Str beforeString(ConsumerEx2Str... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptString(a, b); acceptString(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2Str consumer : before) consumer.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2Str} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2Str} performing the operations.
     */
	static ConsumerEx2Str sequenceString(ConsumerEx2Str... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(ConsumerEx2Str consumer : consumers) consumer.acceptString(a, b);};
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
     * @return A new {@link ConsumerEx2Str} performing this operation and the
     * operation after.
     */
    default ConsumerEx2Str then(ConsumerEx2<String,String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2Str)
    	{
    		final ConsumerEx2Str originalAfter = (ConsumerEx2Str)after;
    		
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
     * @return A new {@link ConsumerEx2Str} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2Str then(ConsumerEx2<String,String>... after)
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
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof ConsumerEx2Str)
        	{
        		final ConsumerEx2Str originalAfter = (ConsumerEx2Str)after[0];
        		
        		return (a, b) -> {acceptString(a, b); originalAfter.acceptString(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptString(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptString(a, b);
			
    		for(ConsumerEx2<String,String> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2Str)
    				((ConsumerEx2Str)consumer).acceptString(a, b);
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
     * @return A new {@link ConsumerEx2Str} performing the operation before and
     * this operation.
     */
    default ConsumerEx2Str before(ConsumerEx2<String,String> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2Str)
    	{
    		final ConsumerEx2Str originalBefore = (ConsumerEx2Str)before;
    		
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
     * @return A new {@link ConsumerEx2Str} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2Str before(ConsumerEx2<String,String>... before)
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
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof ConsumerEx2Str)
        	{
        		final ConsumerEx2Str originalBefore = (ConsumerEx2Str)before[0];
        		
        		return (a, b) -> {originalBefore.acceptString(a, b); acceptString(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptString(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<String,String> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2Str)
    				((ConsumerEx2Str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptString(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2Str} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2Str} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2Str sequence(ConsumerEx2<String,String>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerEx2Str)
    			return (ConsumerEx2Str) consumers[0];
    		else
    			return (ConsumerEx2Str) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<String,String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2Str)
    				((ConsumerEx2Str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link Consumer2Str}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link Consumer2Str} performing the operations and
     * exception handling.
     */
    default Consumer2Str handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptString(a, b);
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
     * again a {@link ConsumerEx2Str} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerEx2Str} performing the operations.
     */
    default ConsumerEx2Str onException(ConsumerEx2Str consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptString(a, b);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptString(a, b);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link Consumer2Str}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link Consumer2Str} performing the operations.
     */
    default Consumer2Str onException(Consumer2Str consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptString(a, b);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptString(a, b);
    		}
    	};
    }
}
