package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 3-dimensional string array input
 * arguments and returns no result. Unlike {@link Consumer3StrA3} this may throw
 * exceptions. {@link ConsumerEx3StrA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptStringArray}.
 * 
 * @see ConsumerStrA3
 * @see ConsumerExStrA3
 * @see Consumer2StrA3
 * @see ConsumerEx2StrA3
 * @see Consumer3StrA3
 * @see ConsumerEx3StrA3
 * @see Consumer4StrA3
 * @see ConsumerEx4StrA3
 */
@FunctionalInterface
public interface ConsumerEx3StrA3 extends ConsumerEx3<String[][][],String[][][],String[][][]>
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
    void acceptStringArray(String[][][] a, String[][][] b, String[][][] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing this operation and the
     * operation after.
     */
    default ConsumerEx3StrA3 thenString(ConsumerEx3StrA3 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptStringArray(a, b, c); after.acceptStringArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing this operation and the
     * operations after.
     */
	default ConsumerEx3StrA3 thenString(ConsumerEx3StrA3... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptStringArray(a, b, c); after[0].acceptStringArray(a, b, c);};

    	return (a, b, c) -> {acceptStringArray(a, b, c); for(ConsumerEx3StrA3 consumer : after) consumer.acceptStringArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing the operation before and
     * this operation.
     */
    default ConsumerEx3StrA3 beforeString(ConsumerEx3StrA3 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptStringArray(a, b, c); acceptStringArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing the operations before and
     * this operation.
     */
    default ConsumerEx3StrA3 beforeString(ConsumerEx3StrA3... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptStringArray(a, b, c); acceptStringArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3StrA3 consumer : before) consumer.acceptStringArray(a, b, c); acceptStringArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3StrA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing the operations.
     */
	static ConsumerEx3StrA3 sequenceString(ConsumerEx3StrA3... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(ConsumerEx3StrA3 consumer : consumers) consumer.acceptStringArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptStringArray} instead.
     */
    @Override
    @Deprecated
    default void accept(String[][][] a, String[][][] b, String[][][] c) throws Exception
    {
    	acceptStringArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing this operation and the
     * operation after.
     */
    default ConsumerEx3StrA3 then(ConsumerEx3<String[][][],String[][][],String[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3StrA3)
    	{
    		final ConsumerEx3StrA3 originalAfter = (ConsumerEx3StrA3)after;
    		
    		return (a, b, c) -> {acceptStringArray(a, b, c); originalAfter.acceptStringArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptStringArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3StrA3 then(ConsumerEx3<String[][][],String[][][],String[][][]>... after)
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
    		if(after[0] instanceof ConsumerEx3StrA3)
        	{
        		final ConsumerEx3StrA3 originalAfter = (ConsumerEx3StrA3)after[0];
        		
        		return (a, b, c) -> {acceptStringArray(a, b, c); originalAfter.acceptStringArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptStringArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptStringArray(a, b, c);
			
    		for(ConsumerEx3<String[][][],String[][][],String[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3StrA3)
    				((ConsumerEx3StrA3)consumer).acceptStringArray(a, b, c);
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
     * @return A new {@link ConsumerEx3StrA3} performing the operation before and
     * this operation.
     */
    default ConsumerEx3StrA3 before(ConsumerEx3<String[][][],String[][][],String[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3StrA3)
    	{
    		final ConsumerEx3StrA3 originalBefore = (ConsumerEx3StrA3)before;
    		
    		return (a, b, c) -> {originalBefore.acceptStringArray(a, b, c); acceptStringArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptStringArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3StrA3 before(ConsumerEx3<String[][][],String[][][],String[][][]>... before)
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
    		if(before[0] instanceof ConsumerEx3StrA3)
        	{
        		final ConsumerEx3StrA3 originalBefore = (ConsumerEx3StrA3)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptStringArray(a, b, c); acceptStringArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptStringArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<String[][][],String[][][],String[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3StrA3)
    				((ConsumerEx3StrA3)consumer).acceptStringArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptStringArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3StrA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3StrA3 sequence(ConsumerEx3<String[][][],String[][][],String[][][]>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerEx3StrA3)
    			return (ConsumerEx3StrA3) consumers[0];
    		else
    			return (ConsumerEx3StrA3) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<String[][][],String[][][],String[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3StrA3)
    				((ConsumerEx3StrA3)consumer).acceptStringArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Adds exception handling to the consumer and thus converts it into a
     * {@link Consumer3StrA3}.
     * 
     * @param handler The exception handler called in case of an exception.
     * 
     * @return A new {@link Consumer3StrA3} performing the operations and
     * exception handling.
     */
    default Consumer3StrA3 handled(ExceptionHandler handler)
    {
    	Validation.validateNotNull("handler", handler);
    	
    	return (a, b, c) -> {
    		try
    		{
    			acceptStringArray(a, b, c);
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
     * again a {@link ConsumerEx3StrA3} relaying the exceptions of the passed
     * consumer.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link ConsumerEx3StrA3} performing the operations.
     */
    default ConsumerEx3StrA3 onException(ConsumerEx3StrA3 consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b, c) -> {
    		try
    		{
    			acceptStringArray(a, b, c);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptStringArray(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the passed operation in case of an exception in this consumer.
     * As the passed consumer can not throw an exception the returned consumer
     * is a {@link Consumer3StrA3}.
     * 
     * @param consumer The consumer called in case of an exception.
     * 
     * @return A new {@link Consumer3StrA3} performing the operations.
     */
    default Consumer3StrA3 onException(Consumer3StrA3 consumer)
    {
    	Validation.validateNotNull("consumer", consumer);
    	
    	return (a, b, c) -> {
    		try
    		{
    			acceptStringArray(a, b, c);
    		}
    		catch(Exception e)
    		{
    			consumer.acceptStringArray(a, b, c);
    		}
    	};
    }
}
