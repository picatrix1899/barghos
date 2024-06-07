package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 1-dimensional string array input
 * argument and returns no result. {@link ConsumerStrA} is expected to operate
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
public interface ConsumerStrA extends Consumer<String[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptStringArray(String[] a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerStrA} performing this operation and the
     * operation after.
     */
    default ConsumerStrA thenString(ConsumerStrA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptStringArray(a); after.acceptStringArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerStrA} performing this operation and the
     * operations after.
     */
	default ConsumerStrA thenString(ConsumerStrA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptStringArray(a); after[0].acceptStringArray(a);};

    	return (a) -> {acceptStringArray(a); for(ConsumerStrA consumer : after) consumer.acceptStringArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerStrA} performing the operation before and
     * this operation.
     */
    default ConsumerStrA beforeString(ConsumerStrA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptStringArray(a); acceptStringArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerStrA} performing the operations before and
     * this operation.
     */
    default ConsumerStrA beforeString(ConsumerStrA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptStringArray(a); acceptStringArray(a);};
    	
    	return (a) -> {for(ConsumerStrA consumer : before) consumer.acceptStringArray(a); acceptStringArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerStrA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerStrA} performing the operations.
     */
	static ConsumerStrA sequenceString(ConsumerStrA... consumers)
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
    	
    	return (a) -> {for(ConsumerStrA consumer : consumers) consumer.acceptStringArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String[] a)
    {
    	acceptStringArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerStrA} performing this operation and the
     * operation after.
     */
    default ConsumerStrA then(Consumer<String[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerStrA)
    	{
    		final ConsumerStrA originalAfter = (ConsumerStrA)after;
    		
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
     * @return A new {@link ConsumerStrA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerStrA then(Consumer<String[]>... after)
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
    		if(after[0] instanceof ConsumerStrA)
        	{
        		final ConsumerStrA originalAfter = (ConsumerStrA)after[0];
        		
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
			
    		for(Consumer<String[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerStrA)
    				((ConsumerStrA)consumer).acceptStringArray(a);
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
     * @return A new {@link ConsumerStrA} performing the operation before and
     * this operation.
     */
    default ConsumerStrA before(Consumer<String[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerStrA)
    	{
    		final ConsumerStrA originalBefore = (ConsumerStrA)before;
    		
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
     * @return A new {@link ConsumerStrA} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerStrA before(Consumer<String[]>... before)
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
    		if(before[0] instanceof ConsumerStrA)
        	{
        		final ConsumerStrA originalBefore = (ConsumerStrA)before[0];
        		
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
    		for(Consumer<String[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerStrA)
    				((ConsumerStrA)consumer).acceptStringArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptStringArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerStrA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerStrA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerStrA sequence(Consumer<String[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerStrA)
    			return (ConsumerStrA) consumers[0];
    		else
    			return (ConsumerStrA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerStrA)
    				((ConsumerStrA)consumer).acceptStringArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default ConsumerStrA andThen(java.util.function.Consumer<? super String[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptStringArray(a); after.accept(a);};
    }
}
