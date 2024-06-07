package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 2-dimensional string array input
 * argument and returns no result. Unlike {@link ConsumerStrA2} this may throw
 * exceptions. {@link ConsumerExStrA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptStringArray}.
 * 
 * @see ConsumerStrA2
 * @see ConsumerExStrA2
 * @see Consumer2StrA2
 * @see ConsumerEx2StrA2
 * @see Consumer3StrA2
 * @see ConsumerEx3StrA2
 * @see Consumer4StrA2
 * @see ConsumerEx4StrA2
 */
@FunctionalInterface
public interface ConsumerExStrA2 extends ConsumerEx<String[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptStringArray(String[][] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExStrA2} performing this operation and the
     * operation after.
     */
    default ConsumerExStrA2 thenString(ConsumerExStrA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptStringArray(a); after.acceptStringArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExStrA2} performing this operation and the
     * operations after.
     */
	default ConsumerExStrA2 thenString(ConsumerExStrA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptStringArray(a); after[0].acceptStringArray(a);};

    	return (a) -> {acceptStringArray(a); for(ConsumerExStrA2 consumer : after) consumer.acceptStringArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExStrA2} performing the operation before and
     * this operation.
     */
    default ConsumerExStrA2 beforeString(ConsumerExStrA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptStringArray(a); acceptStringArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExStrA2} performing the operations before and
     * this operation.
     */
    default ConsumerExStrA2 beforeString(ConsumerExStrA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptStringArray(a); acceptStringArray(a);};
    	
    	return (a) -> {for(ConsumerExStrA2 consumer : before) consumer.acceptStringArray(a); acceptStringArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExStrA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExStrA2} performing the operations.
     */
	static ConsumerExStrA2 sequenceString(ConsumerExStrA2... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerExStrA2 consumer : consumers) consumer.acceptStringArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptStringArray} instead.
     */
    @Override
    @Deprecated
    default void accept(String[][] a) throws Exception
    {
    	acceptStringArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExStrA2} performing this operation and the
     * operation after.
     */
    default ConsumerExStrA2 then(ConsumerEx<String[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExStrA2)
    	{
    		final ConsumerExStrA2 originalAfter = (ConsumerExStrA2)after;
    		
    		return (a) -> {acceptStringArray(a); originalAfter.acceptStringArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptStringArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExStrA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExStrA2 then(ConsumerEx<String[][]>... after)
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
    		if(after[0] instanceof ConsumerExStrA2)
        	{
        		final ConsumerExStrA2 originalAfter = (ConsumerExStrA2)after[0];
        		
        		return (a) -> {acceptStringArray(a); originalAfter.acceptStringArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptStringArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptStringArray(a);
			
    		for(ConsumerEx<String[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerExStrA2)
    				((ConsumerExStrA2)consumer).acceptStringArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExStrA2} performing the operation before and
     * this operation.
     */
    default ConsumerExStrA2 before(ConsumerEx<String[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExStrA2)
    	{
    		final ConsumerExStrA2 originalBefore = (ConsumerExStrA2)before;
    		
    		return (a) -> {originalBefore.acceptStringArray(a); acceptStringArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptStringArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExStrA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExStrA2 before(ConsumerEx<String[][]>... before)
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
    		if(before[0] instanceof ConsumerExStrA2)
        	{
        		final ConsumerExStrA2 originalBefore = (ConsumerExStrA2)before[0];
        		
        		return (a) -> {originalBefore.acceptStringArray(a); acceptStringArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptStringArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<String[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerExStrA2)
    				((ConsumerExStrA2)consumer).acceptStringArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptStringArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExStrA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExStrA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExStrA2 sequence(ConsumerEx<String[][]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerExStrA2)
    			return (ConsumerExStrA2) consumers[0];
    		else
    			return (ConsumerExStrA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<String[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExStrA2)
    				((ConsumerExStrA2)consumer).acceptStringArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link ConsumerStrA2}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link ConsumerStrA2} performing the operations and
     * exception handling.
     */
    default ConsumerStrA2 handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
    	return (a) -> {
    		try
    		{
    			acceptStringArray(a);
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
     * again a {@link ConsumerExStrA2} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerExStrA2} performing the operations.
     */
    default ConsumerExStrA2 onException(ConsumerExStrA2 consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a) -> {
    		try
    		{
    			acceptStringArray(a);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptStringArray(a);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link ConsumerStrA2}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerStrA2} performing the operations.
     */
    default ConsumerStrA2 onException(ConsumerStrA2 consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a) -> {
    		try
    		{
    			acceptStringArray(a);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptStringArray(a);
    		}
    	};
    }
}
