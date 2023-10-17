package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one char input argument and returns no result.
 * Unlike {@link Consumerc} this may throw Exceptions.
 * {@link ConsumerExc} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptChar(char)}.
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
public interface ConsumerExc extends ConsumerEx<Character>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptChar(char a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExc} performing this operation and the operation after.
     */
    default ConsumerExc andThenChar(ConsumerExc after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptChar(a); after.acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExc} performing this operation and the operations after.
     */
	default ConsumerExc andThenChar(ConsumerExc... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptChar(a); after[0].acceptChar(a);};

    	return (a) -> {acceptChar(a); for(ConsumerExc consumer : after) consumer.acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExc} performing this operation and the operations after.
     */
	default ConsumerExc andThenChar(Iterable<ConsumerExc> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptChar(a); for(ConsumerExc consumer : after) consumer.acceptChar(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExc} performing the operation before and this operation.
     */
    default ConsumerExc beforeThatChar(ConsumerExc before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExc} performing the operations before and this operation.
     */
    default ConsumerExc beforeThatChar(ConsumerExc... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptChar(a); acceptChar(a);};
    	
    	return (a) -> {for(ConsumerExc consumer : before) consumer.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExc} performing the operations before and this operation.
     */
    default ConsumerExc beforeThatChar(Iterable<ConsumerExc> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExc consumer : before) consumer.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExc} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExc} performing the operations.
     */
	static ConsumerExc inSequenceChar(ConsumerExc... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerExc consumer : consumers) consumer.acceptChar(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExc} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExc} performing the operations.
     */
    static ConsumerExc inSequenceChar(Iterable<ConsumerExc> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExc consumer : consumers) consumer.acceptChar(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptChar} instead.
     */
    @Override
    @Deprecated
    default void accept(Character a) throws Exception
    {
    	acceptChar(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExc} performing this operation and the operation after.
     */
    default ConsumerExc andThen(ConsumerEx<Character> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExc)
    	{
    		final ConsumerExc originalAfter = (ConsumerExc)after;
    		
    		return (a) -> {acceptChar(a); originalAfter.acceptChar(a);};
    	}
    	else
    	{
    		return (a) -> {acceptChar(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExc} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExc andThen(ConsumerEx<Character>... after)
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
    		if(after[0] instanceof ConsumerExc)
        	{
        		final ConsumerExc originalAfter = (ConsumerExc)after[0];
        		
        		return (a) -> {acceptChar(a); originalAfter.acceptChar(a);};
        	}
        	else
        	{
        		return (a) -> {acceptChar(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptChar(a);
			
    		for(ConsumerEx<Character> consumer : after)
    		{
    			if(consumer instanceof ConsumerExc)
    				((ConsumerExc)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExc} performing this operation and the operations after.
     */
	default ConsumerExc andThen(Iterable<ConsumerEx<Character>> after)
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
		return (a) -> {
			acceptChar(a);
			
    		for(ConsumerEx<Character> consumer : after)
    		{
    			if(consumer instanceof ConsumerExc)
    				((ConsumerExc)consumer).acceptChar(a);
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
     * @return A new {@link ConsumerExc} performing the operation before and this operation.
     */
    default ConsumerExc beforeThat(ConsumerEx<Character> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExc)
    	{
    		final ConsumerExc originalBefore = (ConsumerExc)before;
    		
    		return (a) -> {originalBefore.acceptChar(a); acceptChar(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptChar(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExc} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExc beforeThat(ConsumerEx<Character>... before)
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
    		if(before[0] instanceof ConsumerExc)
        	{
        		final ConsumerExc originalBefore = (ConsumerExc)before[0];
        		
        		return (a) -> {originalBefore.acceptChar(a); acceptChar(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptChar(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Character> consumer : before)
    		{
    			if(consumer instanceof ConsumerExc)
    				((ConsumerExc)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptChar(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExc} performing the operations before and this operation.
     */
    default ConsumerExc beforeThat(Iterable<ConsumerEx<Character>> before)
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
    	return (a) -> {
    		for(ConsumerEx<Character> consumer : before)
    		{
    			if(consumer instanceof ConsumerExc)
    				((ConsumerExc)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptChar(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExc} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExc} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExc inSequence(ConsumerEx<Character>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerExc)
    			return (ConsumerExc) consumers[0];
    		else
    			return (ConsumerExc) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Character> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExc)
    				((ConsumerExc)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExc} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExc} performing the operations.
     */
    static ConsumerExc inSequence(Iterable<ConsumerEx<Character>> consumers)
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
    	return (a) -> {
    		for(ConsumerEx<Character> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExc)
    				((ConsumerExc)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
