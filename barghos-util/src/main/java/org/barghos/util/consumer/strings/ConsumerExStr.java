package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one string input argument and returns
 * no result. Unlike {@link ConsumerStr} this may throw exceptions.
 * {@link ConsumerExStr} is expected to operate via side-effects.
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
public interface ConsumerExStr extends ConsumerEx<String>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptString(String a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExStr} performing this operation and the
     * operation after.
     */
    default ConsumerExStr thenString(ConsumerExStr after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptString(a); after.acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExStr} performing this operation and the
     * operations after.
     */
	default ConsumerExStr thenString(ConsumerExStr... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptString(a); after[0].acceptString(a);};

    	return (a) -> {acceptString(a); for(ConsumerExStr consumer : after) consumer.acceptString(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExStr} performing the operation before and
     * this operation.
     */
    default ConsumerExStr beforeString(ConsumerExStr before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptString(a); acceptString(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExStr} performing the operations before and
     * this operation.
     */
    default ConsumerExStr beforeString(ConsumerExStr... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptString(a); acceptString(a);};
    	
    	return (a) -> {for(ConsumerExStr consumer : before) consumer.acceptString(a); acceptString(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExStr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExStr} performing the operations.
     */
	static ConsumerExStr sequenceString(ConsumerExStr... consumers)
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
    	
    	return (a) -> {for(ConsumerExStr consumer : consumers) consumer.acceptString(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String a) throws Exception
    {
    	acceptString(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExStr} performing this operation and the
     * operation after.
     */
    default ConsumerExStr then(ConsumerEx<String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExStr)
    	{
    		final ConsumerExStr originalAfter = (ConsumerExStr)after;
    		
    		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
    	}
    	else
    	{
    		return (a) -> {acceptString(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExStr} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExStr then(ConsumerEx<String>... after)
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
    		if(after[0] instanceof ConsumerExStr)
        	{
        		final ConsumerExStr originalAfter = (ConsumerExStr)after[0];
        		
        		return (a) -> {acceptString(a); originalAfter.acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {acceptString(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptString(a);
			
    		for(ConsumerEx<String> consumer : after)
    		{
    			if(consumer instanceof ConsumerExStr)
    				((ConsumerExStr)consumer).acceptString(a);
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
     * @return A new {@link ConsumerExStr} performing the operation before and
     * this operation.
     */
    default ConsumerExStr before(ConsumerEx<String> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExStr)
    	{
    		final ConsumerExStr originalBefore = (ConsumerExStr)before;
    		
    		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptString(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExStr} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExStr before(ConsumerEx<String>... before)
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
    		if(before[0] instanceof ConsumerExStr)
        	{
        		final ConsumerExStr originalBefore = (ConsumerExStr)before[0];
        		
        		return (a) -> {originalBefore.acceptString(a); acceptString(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptString(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<String> consumer : before)
    		{
    			if(consumer instanceof ConsumerExStr)
    				((ConsumerExStr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptString(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExStr} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExStr} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExStr sequence(ConsumerEx<String>... consumers)
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
    		if(consumers[0] instanceof ConsumerExStr)
    			return (ConsumerExStr) consumers[0];
    		else
    			return (ConsumerExStr) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<String> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExStr)
    				((ConsumerExStr)consumer).acceptString(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link ConsumerStr}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link ConsumerStr} performing the operations and
     * exception handling.
     */
    default ConsumerStr handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
    	return (a) -> {
    		try
    		{
    			acceptString(a);
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
     * again a {@link ConsumerExStr} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerExStr} performing the operations.
     */
    default ConsumerExStr onException(ConsumerExStr consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a) -> {
    		try
    		{
    			acceptString(a);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptString(a);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link ConsumerStr}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerStr} performing the operations.
     */
    default ConsumerStr onException(ConsumerStr consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a) -> {
    		try
    		{
    			acceptString(a);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptString(a);
    		}
    	};
    }
}
