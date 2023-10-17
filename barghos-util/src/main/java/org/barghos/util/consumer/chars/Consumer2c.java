package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two char input arguments and returns no result.
 * {@link Consumer2c} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptChar(char, char)}.
 * 
 * @see Consumerc
 * @see ConsumerExc
 * @see Consumer2c
 * @see ConsumerEx2c
 * @see Consumer3c
 * @see ConsumerEx3c
 * @see Consumer4c
 * @see ConsumerEx4c
 */
@FunctionalInterface
public interface Consumer2c extends Consumer2<Character,Character>
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
     * @return A new {@link Consumer2c} performing this operation and the operation after.
     */
    default Consumer2c andThenChar(Consumer2c after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptChar(a, b); after.acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2c} performing this operation and the operations after.
     */
	default Consumer2c andThenChar(Consumer2c... after)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptChar(a, b); after[0].acceptChar(a, b);};

    	return (a, b) -> {acceptChar(a, b); for(Consumer2c consumer : after) consumer.acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2c} performing this operation and the operations after.
     */
	default Consumer2c andThenChar(Iterable<Consumer2c> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptChar(a, b); for(Consumer2c consumer : after) consumer.acceptChar(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2c} performing the operation before and this operation.
     */
    default Consumer2c beforeThatChar(Consumer2c before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2c} performing the operations before and this operation.
     */
    default Consumer2c beforeThatChar(Consumer2c... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptChar(a, b); acceptChar(a, b);};
    	
    	return (a, b) -> {for(Consumer2c consumer : before) consumer.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2c} performing the operations before and this operation.
     */
    default Consumer2c beforeThatChar(Iterable<Consumer2c> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2c consumer : before) consumer.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2c} performing the operations.
     */
	static Consumer2c inSequenceChar(Consumer2c... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(Consumer2c consumer : consumers) consumer.acceptChar(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2c} performing the operations.
     */
    static Consumer2c inSequenceChar(Iterable<Consumer2c> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2c consumer : consumers) consumer.acceptChar(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptChar} instead.
     */
    @Override
    @Deprecated
    default void accept(Character a, Character b)
    {
    	acceptChar(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2c} performing this operation and the operation after.
     */
    default Consumer2c andThen(Consumer2<Character,Character> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2c)
    	{
    		final Consumer2c originalAfter = (Consumer2c)after;
    		
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
     * @return A new {@link Consumer2c} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2c andThen(Consumer2<Character,Character>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
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
    		if(after[0] instanceof Consumer2c)
        	{
        		final Consumer2c originalAfter = (Consumer2c)after[0];
        		
        		return (a, b) -> {acceptChar(a, b); originalAfter.acceptChar(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptChar(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptChar(a, b);
			
    		for(Consumer2<Character,Character> consumer : after)
    		{
    			if(consumer instanceof Consumer2c)
    				((Consumer2c)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2c} performing this operation and the operations after.
     */
	default Consumer2c andThen(Iterable<Consumer2<Character,Character>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
		/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
		return (a, b) -> {
			acceptChar(a, b);
			
    		for(Consumer2<Character,Character> consumer : after)
    		{
    			if(consumer instanceof Consumer2c)
    				((Consumer2c)consumer).acceptChar(a, b);
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
     * @return A new {@link Consumer2c} performing the operation before and this operation.
     */
    default Consumer2c beforeThat(Consumer2<Character,Character> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2c)
    	{
    		final Consumer2c originalBefore = (Consumer2c)before;
    		
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
     * @return A new {@link Consumer2c} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2c beforeThat(Consumer2<Character,Character>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
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
    		if(before[0] instanceof Consumer2c)
        	{
        		final Consumer2c originalBefore = (Consumer2c)before[0];
        		
        		return (a, b) -> {originalBefore.acceptChar(a, b); acceptChar(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptChar(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Character,Character> consumer : before)
    		{
    			if(consumer instanceof Consumer2c)
    				((Consumer2c)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptChar(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2c} performing the operations before and this operation.
     */
    default Consumer2c beforeThat(Iterable<Consumer2<Character,Character>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Character,Character> consumer : before)
    		{
    			if(consumer instanceof Consumer2c)
    				((Consumer2c)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptChar(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2c} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2c inSequence(Consumer2<Character,Character>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer2c)
    			return (Consumer2c) consumers[0];
    		else
    			return (Consumer2c) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2c)
    				((Consumer2c)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2c} performing the operations.
     */
    static Consumer2c inSequence(Iterable<Consumer2<Character,Character>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2c)
    				((Consumer2c)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2c andThen(java.util.function.BiConsumer<? super Character,? super Character> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptChar(a, b); after.accept(a, b);};
    }
}
