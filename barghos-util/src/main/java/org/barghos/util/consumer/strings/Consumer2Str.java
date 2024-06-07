package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two string input arguments and returns
 * no result. {@link Consumer2Str} is expected to operate via side-effects.
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
public interface Consumer2Str extends Consumer2<String,String>
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
     * @return A new {@link Consumer2Str} performing this operation and the
     * operation after.
     */
    default Consumer2Str thenString(Consumer2Str after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptString(a, b); after.acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2Str} performing this operation and the
     * operations after.
     */
	default Consumer2Str thenString(Consumer2Str... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptString(a, b); after[0].acceptString(a, b);};

    	return (a, b) -> {acceptString(a, b); for(Consumer2Str consumer : after) consumer.acceptString(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2Str} performing the operation before and
     * this operation.
     */
    default Consumer2Str beforeString(Consumer2Str before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2Str} performing the operations before and
     * this operation.
     */
    default Consumer2Str beforeString(Consumer2Str... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptString(a, b); acceptString(a, b);};
    	
    	return (a, b) -> {for(Consumer2Str consumer : before) consumer.acceptString(a, b); acceptString(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2Str} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2Str} performing the operations.
     */
	static Consumer2Str sequenceString(Consumer2Str... consumers)
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
    	
    	return (a, b) -> {for(Consumer2Str consumer : consumers) consumer.acceptString(a, b);};
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
     * @return A new {@link Consumer2Str} performing this operation and the
     * operation after.
     */
    default Consumer2Str then(Consumer2<String,String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2Str)
    	{
    		final Consumer2Str originalAfter = (Consumer2Str)after;
    		
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
     * @return A new {@link Consumer2Str} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2Str then(Consumer2<String,String>... after)
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
    		if(after[0] instanceof Consumer2Str)
        	{
        		final Consumer2Str originalAfter = (Consumer2Str)after[0];
        		
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
			
    		for(Consumer2<String,String> consumer : after)
    		{
    			if(consumer instanceof Consumer2Str)
    				((Consumer2Str)consumer).acceptString(a, b);
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
     * @return A new {@link Consumer2Str} performing the operation before and
     * this operation.
     */
    default Consumer2Str before(Consumer2<String,String> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2Str)
    	{
    		final Consumer2Str originalBefore = (Consumer2Str)before;
    		
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
     * @return A new {@link Consumer2Str} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2Str before(Consumer2<String,String>... before)
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
    		if(before[0] instanceof Consumer2Str)
        	{
        		final Consumer2Str originalBefore = (Consumer2Str)before[0];
        		
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
    		for(Consumer2<String,String> consumer : before)
    		{
    			if(consumer instanceof Consumer2Str)
    				((Consumer2Str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptString(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2Str} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2Str} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2Str sequence(Consumer2<String,String>... consumers)
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
    		if(consumers[0] instanceof Consumer2Str)
    			return (Consumer2Str) consumers[0];
    		else
    			return (Consumer2Str) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<String,String> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2Str)
    				((Consumer2Str)consumer).acceptString(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2Str andThen(java.util.function.BiConsumer<? super String,? super String> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptString(a, b); after.accept(a, b);};
    }
}
