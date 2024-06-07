package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three char input arguments and returns
 * no result. Unlike {@link Consumer3C} this may throw exceptions.
 * {@link ConsumerEx3C} is expected to operate via side-effects.
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
public interface ConsumerEx3C extends ConsumerEx3<Character,Character,Character>
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
    void acceptChar(char a, char b, char c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3C} performing this operation and the
     * operation after.
     */
    default ConsumerEx3C thenChar(ConsumerEx3C after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptChar(a, b, c); after.acceptChar(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3C} performing this operation and the
     * operations after.
     */
	default ConsumerEx3C thenChar(ConsumerEx3C... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptChar(a, b, c); after[0].acceptChar(a, b, c);};

    	return (a, b, c) -> {acceptChar(a, b, c); for(ConsumerEx3C consumer : after) consumer.acceptChar(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3C} performing the operation before and
     * this operation.
     */
    default ConsumerEx3C beforeChar(ConsumerEx3C before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptChar(a, b, c); acceptChar(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3C} performing the operations before and
     * this operation.
     */
    default ConsumerEx3C beforeChar(ConsumerEx3C... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptChar(a, b, c); acceptChar(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3C consumer : before) consumer.acceptChar(a, b, c); acceptChar(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3C} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3C} performing the operations.
     */
	static ConsumerEx3C sequenceChar(ConsumerEx3C... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3C consumer : consumers) consumer.acceptChar(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptChar} instead.
     */
    @Override
    @Deprecated
    default void accept(Character a, Character b, Character c) throws Exception
    {
    	acceptChar(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3C} performing this operation and the
     * operation after.
     */
    default ConsumerEx3C then(ConsumerEx3<Character,Character,Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3C)
    	{
    		final ConsumerEx3C originalAfter = (ConsumerEx3C)after;
    		
    		return (a, b, c) -> {acceptChar(a, b, c); originalAfter.acceptChar(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptChar(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3C} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3C then(ConsumerEx3<Character,Character,Character>... after)
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
    		if(after[0] instanceof ConsumerEx3C)
        	{
        		final ConsumerEx3C originalAfter = (ConsumerEx3C)after[0];
        		
        		return (a, b, c) -> {acceptChar(a, b, c); originalAfter.acceptChar(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptChar(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptChar(a, b, c);
			
    		for(ConsumerEx3<Character,Character,Character> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3C)
    				((ConsumerEx3C)consumer).acceptChar(a, b, c);
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
     * @return A new {@link ConsumerEx3C} performing the operation before and
     * this operation.
     */
    default ConsumerEx3C before(ConsumerEx3<Character,Character,Character> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3C)
    	{
    		final ConsumerEx3C originalBefore = (ConsumerEx3C)before;
    		
    		return (a, b, c) -> {originalBefore.acceptChar(a, b, c); acceptChar(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptChar(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3C} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3C before(ConsumerEx3<Character,Character,Character>... before)
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
    		if(before[0] instanceof ConsumerEx3C)
        	{
        		final ConsumerEx3C originalBefore = (ConsumerEx3C)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptChar(a, b, c); acceptChar(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptChar(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Character,Character,Character> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3C)
    				((ConsumerEx3C)consumer).acceptChar(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptChar(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3C} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3C} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3C sequence(ConsumerEx3<Character,Character,Character>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3C)
    			return (ConsumerEx3C) consumers[0];
    		else
    			return (ConsumerEx3C) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Character,Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3C)
    				((ConsumerEx3C)consumer).acceptChar(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
