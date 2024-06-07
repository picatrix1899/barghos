package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two 2-dimensional string array input
 * arguments and returns no result. {@link Consumer2StrA2} is expected to operate
 * via side-effects.
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
public interface Consumer2StrA2 extends Consumer2<String[][],String[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptStringArray(String[][] a, String[][] b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2StrA2} performing this operation and the
     * operation after.
     */
    default Consumer2StrA2 thenString(Consumer2StrA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptStringArray(a, b); after.acceptStringArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2StrA2} performing this operation and the
     * operations after.
     */
	default Consumer2StrA2 thenString(Consumer2StrA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptStringArray(a, b); after[0].acceptStringArray(a, b);};

    	return (a, b) -> {acceptStringArray(a, b); for(Consumer2StrA2 consumer : after) consumer.acceptStringArray(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2StrA2} performing the operation before and
     * this operation.
     */
    default Consumer2StrA2 beforeString(Consumer2StrA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptStringArray(a, b); acceptStringArray(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2StrA2} performing the operations before and
     * this operation.
     */
    default Consumer2StrA2 beforeString(Consumer2StrA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptStringArray(a, b); acceptStringArray(a, b);};
    	
    	return (a, b) -> {for(Consumer2StrA2 consumer : before) consumer.acceptStringArray(a, b); acceptStringArray(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2StrA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2StrA2} performing the operations.
     */
	static Consumer2StrA2 sequenceString(Consumer2StrA2... consumers)
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
    	
    	return (a, b) -> {for(Consumer2StrA2 consumer : consumers) consumer.acceptStringArray(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String[][] a, String[][] b)
    {
    	acceptStringArray(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2StrA2} performing this operation and the
     * operation after.
     */
    default Consumer2StrA2 then(Consumer2<String[][],String[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2StrA2)
    	{
    		final Consumer2StrA2 originalAfter = (Consumer2StrA2)after;
    		
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
     * @return A new {@link Consumer2StrA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2StrA2 then(Consumer2<String[][],String[][]>... after)
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
    		if(after[0] instanceof Consumer2StrA2)
        	{
        		final Consumer2StrA2 originalAfter = (Consumer2StrA2)after[0];
        		
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
			
    		for(Consumer2<String[][],String[][]> consumer : after)
    		{
    			if(consumer instanceof Consumer2StrA2)
    				((Consumer2StrA2)consumer).acceptStringArray(a, b);
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
     * @return A new {@link Consumer2StrA2} performing the operation before and
     * this operation.
     */
    default Consumer2StrA2 before(Consumer2<String[][],String[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2StrA2)
    	{
    		final Consumer2StrA2 originalBefore = (Consumer2StrA2)before;
    		
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
     * @return A new {@link Consumer2StrA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2StrA2 before(Consumer2<String[][],String[][]>... before)
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
    		if(before[0] instanceof Consumer2StrA2)
        	{
        		final Consumer2StrA2 originalBefore = (Consumer2StrA2)before[0];
        		
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
    		for(Consumer2<String[][],String[][]> consumer : before)
    		{
    			if(consumer instanceof Consumer2StrA2)
    				((Consumer2StrA2)consumer).acceptStringArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptStringArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2StrA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2StrA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2StrA2 sequence(Consumer2<String[][],String[][]>... consumers)
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
    		if(consumers[0] instanceof Consumer2StrA2)
    			return (Consumer2StrA2) consumers[0];
    		else
    			return (Consumer2StrA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<String[][],String[][]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2StrA2)
    				((Consumer2StrA2)consumer).acceptStringArray(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2StrA2 andThen(java.util.function.BiConsumer<? super String[][],? super String[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptStringArray(a, b); after.accept(a, b);};
    }
}
