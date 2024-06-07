package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 1-dimensional string array input
 * arguments and returns no result. Unlike {@link Consumer2StrA} this may throw
 * exceptions. {@link ConsumerEx2StrA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptStringArray}.
 * 
 * @see ConsumerStrA
 * @see ConsumerExStrA
 * @see Consumer2StrA
 * @see ConsumerEx2StrA
 * @see Consumer3StrA
 * @see ConsumerEx3StrA
 * @see Consumer4StrA
 * @see ConsumerEx4StrA
 */
@FunctionalInterface
public interface ConsumerEx2StrA extends ConsumerEx2<String[],String[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptStringArray(String[] a, String[] b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2StrA} performing this operation and the
     * operation after.
     */
    default ConsumerEx2StrA thenString(ConsumerEx2StrA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptStringArray(a, b); after.acceptStringArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2StrA} performing this operation and the
     * operations after.
     */
	default ConsumerEx2StrA thenString(ConsumerEx2StrA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptStringArray(a, b); after[0].acceptStringArray(a, b);};

    	return (a, b) -> {acceptStringArray(a, b); for(ConsumerEx2StrA consumer : after) consumer.acceptStringArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2StrA} performing the operation before and
     * this operation.
     */
    default ConsumerEx2StrA beforeString(ConsumerEx2StrA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptStringArray(a, b); acceptStringArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2StrA} performing the operations before and
     * this operation.
     */
    default ConsumerEx2StrA beforeString(ConsumerEx2StrA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptStringArray(a, b); acceptStringArray(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2StrA consumer : before) consumer.acceptStringArray(a, b); acceptStringArray(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2StrA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2StrA} performing the operations.
     */
	static ConsumerEx2StrA sequenceString(ConsumerEx2StrA... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2StrA consumer : consumers) consumer.acceptStringArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptStringArray} instead.
     */
    @Override
    @Deprecated
    default void accept(String[] a, String[] b) throws Exception
    {
    	acceptStringArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2StrA} performing this operation and the
     * operation after.
     */
    default ConsumerEx2StrA then(ConsumerEx2<String[],String[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2StrA)
    	{
    		final ConsumerEx2StrA originalAfter = (ConsumerEx2StrA)after;
    		
    		return (a, b) -> {acceptStringArray(a, b); originalAfter.acceptStringArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptStringArray(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2StrA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2StrA then(ConsumerEx2<String[],String[]>... after)
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
    		if(after[0] instanceof ConsumerEx2StrA)
        	{
        		final ConsumerEx2StrA originalAfter = (ConsumerEx2StrA)after[0];
        		
        		return (a, b) -> {acceptStringArray(a, b); originalAfter.acceptStringArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptStringArray(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptStringArray(a, b);
			
    		for(ConsumerEx2<String[],String[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2StrA)
    				((ConsumerEx2StrA)consumer).acceptStringArray(a, b);
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
     * @return A new {@link ConsumerEx2StrA} performing the operation before and
     * this operation.
     */
    default ConsumerEx2StrA before(ConsumerEx2<String[],String[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2StrA)
    	{
    		final ConsumerEx2StrA originalBefore = (ConsumerEx2StrA)before;
    		
    		return (a, b) -> {originalBefore.acceptStringArray(a, b); acceptStringArray(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptStringArray(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2StrA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2StrA before(ConsumerEx2<String[],String[]>... before)
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
    		if(before[0] instanceof ConsumerEx2StrA)
        	{
        		final ConsumerEx2StrA originalBefore = (ConsumerEx2StrA)before[0];
        		
        		return (a, b) -> {originalBefore.acceptStringArray(a, b); acceptStringArray(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptStringArray(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<String[],String[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2StrA)
    				((ConsumerEx2StrA)consumer).acceptStringArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptStringArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2StrA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2StrA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2StrA sequence(ConsumerEx2<String[],String[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2StrA)
    			return (ConsumerEx2StrA) consumers[0];
    		else
    			return (ConsumerEx2StrA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<String[],String[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2StrA)
    				((ConsumerEx2StrA)consumer).acceptStringArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link Consumer2StrA}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link Consumer2StrA} performing the operations and
     * exception handling.
     */
    default Consumer2StrA handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptStringArray(a, b);
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
     * again a {@link ConsumerEx2StrA} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerEx2StrA} performing the operations.
     */
    default ConsumerEx2StrA onException(ConsumerEx2StrA consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptStringArray(a, b);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptStringArray(a, b);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link Consumer2StrA}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link Consumer2StrA} performing the operations.
     */
    default Consumer2StrA onException(Consumer2StrA consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b) -> {
    		try
    		{
    			acceptStringArray(a, b);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptStringArray(a, b);
    		}
    	};
    }
}
