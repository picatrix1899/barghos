package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two char input arguments and returns no
 * result. Unlike {@link Consumer2C} this may throw exceptions.
 * {@link ConsumerEx2C} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptChar}.
 * 
 * @see ConsumerC
 * @see ConsumerExC
 * @see Consumer2C
 * @see ConsumerEx2C
 * @see Consumer3C
 * @see ConsumerEx3C
 * @see Consumer4C
 * @see ConsumerEx4C
 */
@FunctionalInterface
public interface ConsumerEx2C extends ConsumerEx2<Character,Character>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptChar(char a, char b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2C} performing this operation and the
     * operation after.
     */
    default ConsumerEx2C thenChar(ConsumerEx2C after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptChar(a, b); after.acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2C} performing this operation and the
     * operations after.
     */
	default ConsumerEx2C thenChar(ConsumerEx2C... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptChar(a, b); after[0].acceptChar(a, b);};

    	return (a, b) -> {acceptChar(a, b); for(ConsumerEx2C consumer : after) consumer.acceptChar(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2C} performing the operation before and
     * this operation.
     */
    default ConsumerEx2C beforeChar(ConsumerEx2C before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2C} performing the operations before and
     * this operation.
     */
    default ConsumerEx2C beforeChar(ConsumerEx2C... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptChar(a, b); acceptChar(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2C consumer : before) consumer.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2C} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2C} performing the operations.
     */
	static ConsumerEx2C sequenceChar(ConsumerEx2C... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2C consumer : consumers) consumer.acceptChar(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptChar} instead.
     */
    @Override
    @Deprecated
    default void accept(Character a, Character b) throws Exception
    {
    	acceptChar(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2C} performing this operation and the
     * operation after.
     */
    default ConsumerEx2C then(ConsumerEx2<Character,Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2C)
    	{
    		final ConsumerEx2C originalAfter = (ConsumerEx2C)after;
    		
    		return (a, b) -> {acceptChar(a, b); originalAfter.acceptChar(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptChar(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2C} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2C then(ConsumerEx2<Character,Character>... after)
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
    		if(after[0] instanceof ConsumerEx2C)
        	{
        		final ConsumerEx2C originalAfter = (ConsumerEx2C)after[0];
        		
        		return (a, b) -> {acceptChar(a, b); originalAfter.acceptChar(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptChar(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptChar(a, b);
			
    		for(ConsumerEx2<Character,Character> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2C)
    				((ConsumerEx2C)consumer).acceptChar(a, b);
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
     * @return A new {@link ConsumerEx2C} performing the operation before and
     * this operation.
     */
    default ConsumerEx2C before(ConsumerEx2<Character,Character> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2C)
    	{
    		final ConsumerEx2C originalBefore = (ConsumerEx2C)before;
    		
    		return (a, b) -> {originalBefore.acceptChar(a, b); acceptChar(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptChar(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2C} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2C before(ConsumerEx2<Character,Character>... before)
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
    		if(before[0] instanceof ConsumerEx2C)
        	{
        		final ConsumerEx2C originalBefore = (ConsumerEx2C)before[0];
        		
        		return (a, b) -> {originalBefore.acceptChar(a, b); acceptChar(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptChar(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Character,Character> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2C)
    				((ConsumerEx2C)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptChar(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2C} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2C} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2C sequence(ConsumerEx2<Character,Character>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2C)
    			return (ConsumerEx2C) consumers[0];
    		else
    			return (ConsumerEx2C) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2C)
    				((ConsumerEx2C)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
