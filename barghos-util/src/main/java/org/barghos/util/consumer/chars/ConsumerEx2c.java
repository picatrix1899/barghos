package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two char input argument and returns no result.
 * Unlike {@link Consumer2c} this may throw Exceptions.
 * {@link ConsumerEx2c} is expected to operate via side-effects.
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
public interface ConsumerEx2c extends ConsumerEx2<Character,Character>
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
     * @return A new {@link ConsumerEx2c} performing this operation and the operation after.
     */
    default ConsumerEx2c andThenChar(ConsumerEx2c after)
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
     * @return A new {@link ConsumerEx2c} performing this operation and the operations after.
     */
	default ConsumerEx2c andThenChar(ConsumerEx2c... after)
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

    	return (a, b) -> {acceptChar(a, b); for(ConsumerEx2c consumer : after) consumer.acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2c} performing this operation and the operations after.
     */
	default ConsumerEx2c andThenChar(Iterable<ConsumerEx2c> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptChar(a, b); for(ConsumerEx2c consumer : after) consumer.acceptChar(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2c} performing the operation before and this operation.
     */
    default ConsumerEx2c beforeThatChar(ConsumerEx2c before)
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
     * @return A new {@link ConsumerEx2c} performing the operations before and this operation.
     */
    default ConsumerEx2c beforeThatChar(ConsumerEx2c... before)
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
    	
    	return (a, b) -> {for(ConsumerEx2c consumer : before) consumer.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2c} performing the operations before and this operation.
     */
    default ConsumerEx2c beforeThatChar(Iterable<ConsumerEx2c> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2c consumer : before) consumer.acceptChar(a, b); acceptChar(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2c} performing the operations.
     */
	static ConsumerEx2c inSequenceChar(ConsumerEx2c... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2c consumer : consumers) consumer.acceptChar(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2c} performing the operations.
     */
    static ConsumerEx2c inSequenceChar(Iterable<ConsumerEx2c> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2c consumer : consumers) consumer.acceptChar(a, b);};
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
     * @return A new {@link ConsumerEx2c} performing this operation and the operation after.
     */
    default ConsumerEx2c andThen(ConsumerEx2<Character,Character> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2c)
    	{
    		final ConsumerEx2c originalAfter = (ConsumerEx2c)after;
    		
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
     * @return A new {@link ConsumerEx2c} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2c andThen(ConsumerEx2<Character,Character>... after)
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
    		if(after[0] instanceof ConsumerEx2c)
        	{
        		final ConsumerEx2c originalAfter = (ConsumerEx2c)after[0];
        		
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
			
    		for(ConsumerEx2<Character,Character> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2c)
    				((ConsumerEx2c)consumer).acceptChar(a, b);
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
     * @return A new {@link ConsumerEx2c} performing this operation and the operations after.
     */
	default ConsumerEx2c andThen(Iterable<ConsumerEx2<Character,Character>> after)
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
			
    		for(ConsumerEx2<Character,Character> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2c)
    				((ConsumerEx2c)consumer).acceptChar(a, b);
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
     * @return A new {@link ConsumerEx2c} performing the operation before and this operation.
     */
    default ConsumerEx2c beforeThat(ConsumerEx2<Character,Character> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2c)
    	{
    		final ConsumerEx2c originalBefore = (ConsumerEx2c)before;
    		
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
     * @return A new {@link ConsumerEx2c} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2c beforeThat(ConsumerEx2<Character,Character>... before)
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
    		if(before[0] instanceof ConsumerEx2c)
        	{
        		final ConsumerEx2c originalBefore = (ConsumerEx2c)before[0];
        		
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
    		for(ConsumerEx2<Character,Character> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2c)
    				((ConsumerEx2c)consumer).acceptChar(a, b);
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
     * @return A new {@link ConsumerEx2c} performing the operations before and this operation.
     */
    default ConsumerEx2c beforeThat(Iterable<ConsumerEx2<Character,Character>> before)
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
    		for(ConsumerEx2<Character,Character> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2c)
    				((ConsumerEx2c)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptChar(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2c} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2c inSequence(ConsumerEx2<Character,Character>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2c)
    			return (ConsumerEx2c) consumers[0];
    		else
    			return (ConsumerEx2c) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2c)
    				((ConsumerEx2c)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2c} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2c} performing the operations.
     */
    static ConsumerEx2c inSequence(Iterable<ConsumerEx2<Character,Character>> consumers)
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
    		for(ConsumerEx2<Character,Character> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2c)
    				((ConsumerEx2c)consumer).acceptChar(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
