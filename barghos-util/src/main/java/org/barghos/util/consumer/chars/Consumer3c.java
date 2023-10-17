package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three char input arguments and returns no result.
 * {@link Consumer3c} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptChar(char, char, char)}.
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
public interface Consumer3c extends Consumer3<Character,Character,Character>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptChar(char a, char b, char c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3c} performing this operation and the operation after.
     */
    default Consumer3c andThenChar(Consumer3c after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptChar(a, b, c); after.acceptChar(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3c} performing this operation and the operations after.
     */
	default Consumer3c andThenChar(Consumer3c... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptChar(a, b, c); after[0].acceptChar(a, b, c);};

    	return (a, b, c) -> {acceptChar(a, b, c); for(Consumer3c consumer : after) consumer.acceptChar(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3c} performing this operation and the operations after.
     */
	default Consumer3c andThenChar(Iterable<Consumer3c> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptChar(a, b, c); for(Consumer3c consumer : after) consumer.acceptChar(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3c} performing the operation before and this operation.
     */
    default Consumer3c beforeThatChar(Consumer3c before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptChar(a, b, c); acceptChar(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3c} performing the operations before and this operation.
     */
    default Consumer3c beforeThatChar(Consumer3c... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptChar(a, b, c); acceptChar(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3c consumer : before) consumer.acceptChar(a, b, c); acceptChar(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3c} performing the operations before and this operation.
     */
    default Consumer3c beforeThatChar(Iterable<Consumer3c> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3c consumer : before) consumer.acceptChar(a, b, c); acceptChar(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3c} performing the operations.
     */
	static Consumer3c inSequenceChar(Consumer3c... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(Consumer3c consumer : consumers) consumer.acceptChar(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3c} performing the operations.
     */
    static Consumer3c inSequenceChar(Iterable<Consumer3c> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3c consumer : consumers) consumer.acceptChar(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptChar} instead.
     */
    @Override
    @Deprecated
    default void accept(Character a, Character b, Character c)
    {
    	acceptChar(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3c} performing this operation and the operation after.
     */
    default Consumer3c andThen(Consumer3<Character,Character,Character> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3c)
    	{
    		final Consumer3c originalAfter = (Consumer3c)after;
    		
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
     * @return A new {@link Consumer3c} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3c andThen(Consumer3<Character,Character,Character>... after)
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
    		if(after[0] instanceof Consumer3c)
        	{
        		final Consumer3c originalAfter = (Consumer3c)after[0];
        		
        		return (a, b, c) -> {acceptChar(a, b, c); originalAfter.acceptChar(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptChar(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptChar(a, b, c);
			
    		for(Consumer3<Character,Character,Character> consumer : after)
    		{
    			if(consumer instanceof Consumer3c)
    				((Consumer3c)consumer).acceptChar(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3c} performing this operation and the operations after.
     */
	default Consumer3c andThen(Iterable<Consumer3<Character,Character,Character>> after)
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
		return (a, b, c) -> {
			acceptChar(a, b, c);
			
    		for(Consumer3<Character,Character,Character> consumer : after)
    		{
    			if(consumer instanceof Consumer3c)
    				((Consumer3c)consumer).acceptChar(a, b, c);
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
     * @return A new {@link Consumer3c} performing the operation before and this operation.
     */
    default Consumer3c beforeThat(Consumer3<Character,Character,Character> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3c)
    	{
    		final Consumer3c originalBefore = (Consumer3c)before;
    		
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
     * @return A new {@link Consumer3c} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3c beforeThat(Consumer3<Character,Character,Character>... before)
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
    		if(before[0] instanceof Consumer3c)
        	{
        		final Consumer3c originalBefore = (Consumer3c)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptChar(a, b, c); acceptChar(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptChar(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Character,Character,Character> consumer : before)
    		{
    			if(consumer instanceof Consumer3c)
    				((Consumer3c)consumer).acceptChar(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptChar(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3c} performing the operations before and this operation.
     */
    default Consumer3c beforeThat(Iterable<Consumer3<Character,Character,Character>> before)
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
    	return (a, b, c) -> {
    		for(Consumer3<Character,Character,Character> consumer : before)
    		{
    			if(consumer instanceof Consumer3c)
    				((Consumer3c)consumer).acceptChar(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptChar(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3c} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3c inSequence(Consumer3<Character,Character,Character>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer3c)
    			return (Consumer3c) consumers[0];
    		else
    			return (Consumer3c) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Character,Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3c)
    				((Consumer3c)consumer).acceptChar(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3c} performing the operations.
     */
    static Consumer3c inSequence(Iterable<Consumer3<Character,Character,Character>> consumers)
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
    	return (a, b, c) -> {
    		for(Consumer3<Character,Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3c)
    				((Consumer3c)consumer).acceptChar(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
