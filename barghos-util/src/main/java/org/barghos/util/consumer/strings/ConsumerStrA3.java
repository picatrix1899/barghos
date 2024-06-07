package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 3-dimensional string array input
 * argument and returns no result. {@link ConsumerStrA3} is expected to operate
 * via side-effects.
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
public interface ConsumerStrA3 extends Consumer<String[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptStringArray(String[][][] a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerStrA3} performing this operation and the
     * operation after.
     */
    default ConsumerStrA3 thenString(ConsumerStrA3 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptStringArray(a); after.acceptStringArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerStrA3} performing this operation and the
     * operations after.
     */
	default ConsumerStrA3 thenString(ConsumerStrA3... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptStringArray(a); after[0].acceptStringArray(a);};

    	return (a) -> {acceptStringArray(a); for(ConsumerStrA3 consumer : after) consumer.acceptStringArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerStrA3} performing the operation before and
     * this operation.
     */
    default ConsumerStrA3 beforeString(ConsumerStrA3 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptStringArray(a); acceptStringArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerStrA3} performing the operations before and
     * this operation.
     */
    default ConsumerStrA3 beforeString(ConsumerStrA3... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptStringArray(a); acceptStringArray(a);};
    	
    	return (a) -> {for(ConsumerStrA3 consumer : before) consumer.acceptStringArray(a); acceptStringArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerStrA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerStrA3} performing the operations.
     */
	static ConsumerStrA3 sequenceString(ConsumerStrA3... consumers)
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
    	
    	return (a) -> {for(ConsumerStrA3 consumer : consumers) consumer.acceptStringArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptString} instead.
     */
    @Override
    @Deprecated
    default void accept(String[][][] a)
    {
    	acceptStringArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerStrA3} performing this operation and the
     * operation after.
     */
    default ConsumerStrA3 then(Consumer<String[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerStrA3)
    	{
    		final ConsumerStrA3 originalAfter = (ConsumerStrA3)after;
    		
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
     * @return A new {@link ConsumerStrA3} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerStrA3 then(Consumer<String[][][]>... after)
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
    		if(after[0] instanceof ConsumerStrA3)
        	{
        		final ConsumerStrA3 originalAfter = (ConsumerStrA3)after[0];
        		
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
			
    		for(Consumer<String[][][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerStrA3)
    				((ConsumerStrA3)consumer).acceptStringArray(a);
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
     * @return A new {@link ConsumerStrA3} performing the operation before and
     * this operation.
     */
    default ConsumerStrA3 before(Consumer<String[][][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerStrA3)
    	{
    		final ConsumerStrA3 originalBefore = (ConsumerStrA3)before;
    		
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
     * @return A new {@link ConsumerStrA3} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerStrA3 before(Consumer<String[][][]>... before)
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
    		if(before[0] instanceof ConsumerStrA3)
        	{
        		final ConsumerStrA3 originalBefore = (ConsumerStrA3)before[0];
        		
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
    		for(Consumer<String[][][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerStrA3)
    				((ConsumerStrA3)consumer).acceptStringArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptStringArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerStrA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerStrA3} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerStrA3 sequence(Consumer<String[][][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerStrA3)
    			return (ConsumerStrA3) consumers[0];
    		else
    			return (ConsumerStrA3) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<String[][][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerStrA3)
    				((ConsumerStrA3)consumer).acceptStringArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default ConsumerStrA3 andThen(java.util.function.Consumer<? super String[][][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptStringArray(a); after.accept(a);};
    }
}
