package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four 1-dimensional string array input
 * arguments and returns no result. {@link Consumer4StrA} is expected to operate
 * via side-effects.
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
public interface Consumer4StrA extends Consumer4<String[],String[],String[],String[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptStringArray(String[] a, String[] b, String[] c, String[] d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4StrA} performing this operation and the
     * operation after.
     */
    default Consumer4StrA thenString(Consumer4StrA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptStringArray(a, b, c, d); after.acceptStringArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4StrA} performing this operation and the
     * operations after.
     */
	default Consumer4StrA thenString(Consumer4StrA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptStringArray(a, b, c, d); after[0].acceptStringArray(a, b, c, d);};

    	return (a, b, c, d) -> {acceptStringArray(a, b, c, d); for(Consumer4StrA consumer : after) consumer.acceptStringArray(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4StrA} performing the operation before and
     * this operation.
     */
    default Consumer4StrA beforeString(Consumer4StrA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptStringArray(a, b, c, d); acceptStringArray(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4StrA} performing the operations before and
     * this operation.
     */
    default Consumer4StrA beforeString(Consumer4StrA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptStringArray(a, b, c, d); acceptStringArray(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4StrA consumer : before) consumer.acceptStringArray(a, b, c, d); acceptStringArray(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4StrA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4StrA} performing the operations.
     */
	static Consumer4StrA sequenceString(Consumer4StrA... consumers)
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
    	
    	return (a, b, c, d) -> {for(Consumer4StrA consumer : consumers) consumer.acceptStringArray(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptStringArray} instead.
     */
    @Override
    @Deprecated
    default void accept(String[] a, String[] b, String[] c, String[] d)
    {
    	acceptStringArray(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4StrA} performing this operation and the
     * operation after.
     */
    default Consumer4StrA then(Consumer4<String[],String[],String[],String[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4StrA)
    	{
    		final Consumer4StrA originalAfter = (Consumer4StrA)after;
    		
    		return (a, b, c, d) -> {acceptStringArray(a, b, c, d); originalAfter.acceptStringArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptStringArray(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4StrA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4StrA then(Consumer4<String[],String[],String[],String[]>... after)
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
    		if(after[0] instanceof Consumer4StrA)
        	{
        		final Consumer4StrA originalAfter = (Consumer4StrA)after[0];
        		
        		return (a, b, c, d) -> {acceptStringArray(a, b, c, d); originalAfter.acceptStringArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptStringArray(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptStringArray(a, b, c, d);
			
    		for(Consumer4<String[],String[],String[],String[]> consumer : after)
    		{
    			if(consumer instanceof Consumer4StrA)
    				((Consumer4StrA)consumer).acceptStringArray(a, b, c, d);
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
     * @return A new {@link Consumer4StrA} performing the operation before and
     * this operation.
     */
    default Consumer4StrA before(Consumer4<String[],String[],String[],String[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4StrA)
    	{
    		final Consumer4StrA originalBefore = (Consumer4StrA)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptStringArray(a, b, c, d); acceptStringArray(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptStringArray(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4StrA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4StrA before(Consumer4<String[],String[],String[],String[]>... before)
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
    		if(before[0] instanceof Consumer4StrA)
        	{
        		final Consumer4StrA originalBefore = (Consumer4StrA)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptStringArray(a, b, c, d); acceptStringArray(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptStringArray(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<String[],String[],String[],String[]> consumer : before)
    		{
    			if(consumer instanceof Consumer4StrA)
    				((Consumer4StrA)consumer).acceptStringArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptStringArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4StrA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4StrA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4StrA sequence(Consumer4<String[],String[],String[],String[]>... consumers)
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
    		if(consumers[0] instanceof Consumer4StrA)
    			return (Consumer4StrA) consumers[0];
    		else
    			return (Consumer4StrA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<String[],String[],String[],String[]> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4StrA)
    				((Consumer4StrA)consumer).acceptStringArray(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
