package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two char input arguments and returns no
 * result. {@link Consumer2C} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptChar(char, char)}.
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
public interface Consumer2C extends Consumer2<Character,Character>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptChar(char a, char b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2C} performing this operation and the
     * operation after.
     */
    default Consumer2C thenChar(Consumer2C after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptChar(a, b); after.acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2C} performing this operation and the
     * operations after.
     */
	default Consumer2C thenChar(Consumer2C... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptChar(a, b); after[0].acceptChar(a, b);};

    	return (a, b) -> {acceptChar(a, b); for(Consumer2C consumer : after) consumer.acceptChar(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2C} performing the operation before and this
     * operation.
     */
    default Consumer2C beforeChar(Consumer2C before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2C} performing the operations before and
     * this operation.
     */
    default Consumer2C beforeChar(Consumer2C... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptChar(a, b); acceptChar(a, b);};
    	
    	return (a, b) -> {for(Consumer2C consumer : before) consumer.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2C} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2C} performing the operations.
     */
	static Consumer2C sequenceChar(Consumer2C... consumers)
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
    	
    	return (a, b) -> {for(Consumer2C consumer : consumers) consumer.acceptChar(a, b);};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer2
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptChar(char, char)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Character a, Character b)
    {
    	acceptChar(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2C} performing this operation and the
     * operation after.
     */
    default Consumer2C thenGeneric(Consumer2<Character,Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2C)
    	{
    		final Consumer2C originalAfter = (Consumer2C)after;
    		
    		return (a, b) -> {acceptChar(a, b); originalAfter.acceptChar(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptChar(a, b); after.acceptGeneric(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2C} performing this operation and the
     * operation after.
     */
    default Consumer2C thenGeneric(java.util.function.BiConsumer<? super Character,? super Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2C)
    	{
    		final Consumer2C originalAfter = (Consumer2C)after;
    		
    		return (a, b) -> {acceptChar(a, b); originalAfter.acceptChar(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptChar(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2C} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2C thenGeneric(Consumer2<Character,Character>... after)
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
    		if(after[0] instanceof Consumer2C)
        	{
        		final Consumer2C originalAfter = (Consumer2C)after[0];
        		
        		return (a, b) -> {acceptChar(a, b); originalAfter.acceptChar(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptChar(a, b); after[0].acceptGeneric(a, b);};
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
			
    		for(Consumer2<Character,Character> consumer : after)
    		{
    			if(consumer instanceof Consumer2C)
    				((Consumer2C)consumer).acceptChar(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2C} performing the operation before and this
     * operation.
     */
    default Consumer2C beforeGeneric(Consumer2<Character,Character> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2C)
    	{
    		final Consumer2C originalBefore = (Consumer2C)before;
    		
    		return (a, b) -> {originalBefore.acceptChar(a, b); acceptChar(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.acceptGeneric(a, b); acceptChar(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2C} performing the operation before and this
     * operation.
     */
    default Consumer2C beforeGeneric(java.util.function.BiConsumer<? super Character,? super Character> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2C)
    	{
    		final Consumer2C originalBefore = (Consumer2C)before;
    		
    		return (a, b) -> {originalBefore.acceptChar(a, b); acceptChar(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptChar(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2C} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2C beforeGeneric(Consumer2<Character,Character>... before)
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
    		if(before[0] instanceof Consumer2C)
        	{
        		final Consumer2C originalBefore = (Consumer2C)before[0];
        		
        		return (a, b) -> {originalBefore.acceptChar(a, b); acceptChar(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].acceptGeneric(a, b); acceptChar(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Character,Character> consumer : before)
    		{
    			if(consumer instanceof Consumer2C)
    				((Consumer2C)consumer).acceptChar(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    		
    		acceptChar(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2C} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2C} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2C sequenceGeneric(Consumer2<Character,Character>... consumers)
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
    		if(consumers[0] instanceof Consumer2C)
    			return (Consumer2C) consumers[0];
    		else
    			return (Consumer2C) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2C)
    				((Consumer2C)consumer).acceptChar(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
    /*
     * =============================
     * java.util.function.BiConsumer
     * =============================
     */
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptChar(char, char)} instead.
     */
    @Override
    @Deprecated
    default void accept(Character a, Character b)
    {
    	acceptChar(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.BiConsumer)} instead.
     */
    @Override
    @Deprecated
    default Consumer2C andThen(java.util.function.BiConsumer<? super Character,? super Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptChar(a, b); after.accept(a, b);};
    }
}
