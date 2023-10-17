package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one char input argument and returns no result.
 * {@link Consumerc} is expected to operate via side-effects.
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
public interface Consumerc extends Consumer<Character>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptChar(char a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerc} performing this operation and the operation after.
     */
    default Consumerc andThenChar(Consumerc after)
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
     * @return A new {@link Consumerc} performing this operation and the operations after.
     */
	default Consumerc andThenChar(Consumerc... after)
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

    	return (a) -> {acceptChar(a); for(Consumerc consumer : after) consumer.acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerc} performing this operation and the operations after.
     */
	default Consumerc andThenChar(Iterable<Consumerc> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptChar(a); for(Consumerc consumer : after) consumer.acceptChar(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumerc} performing the operation before and this operation.
     */
    default Consumerc beforeThatChar(Consumerc before)
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
     * @return A new {@link Consumerc} performing the operations before and this operation.
     */
    default Consumerc beforeThatChar(Consumerc... before)
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
    	
    	return (a) -> {for(Consumerc consumer : before) consumer.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerc} performing the operations before and this operation.
     */
    default Consumerc beforeThatChar(Iterable<Consumerc> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(Consumerc consumer : before) consumer.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Composes a new {@link Consumerc} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerc} performing the operations.
     */
	static Consumerc inSequenceChar(Consumerc... consumers)
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
    	
    	return (a) -> {for(Consumerc consumer : consumers) consumer.acceptChar(a);};
    }
    
    /**
     * Composes a new {@link Consumerc} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerc} performing the operations.
     */
    static Consumerc inSequenceChar(Iterable<Consumerc> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(Consumerc consumer : consumers) consumer.acceptChar(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptChar} instead.
     */
    @Override
    @Deprecated
    default void accept(Character a)
    {
    	acceptChar(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerc} performing this operation and the operation after.
     */
    default Consumerc andThen(Consumer<Character> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumerc)
    	{
    		final Consumerc originalAfter = (Consumerc)after;
    		
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
     * @return A new {@link Consumerc} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumerc andThen(Consumer<Character>... after)
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
    		if(after[0] instanceof Consumerc)
        	{
        		final Consumerc originalAfter = (Consumerc)after[0];
        		
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
			
    		for(Consumer<Character> consumer : after)
    		{
    			if(consumer instanceof Consumerc)
    				((Consumerc)consumer).acceptChar(a);
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
     * @return A new {@link Consumerc} performing this operation and the operations after.
     */
	default Consumerc andThen(Iterable<Consumer<Character>> after)
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
			
    		for(Consumer<Character> consumer : after)
    		{
    			if(consumer instanceof Consumerc)
    				((Consumerc)consumer).acceptChar(a);
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
     * @return A new {@link Consumerc} performing the operation before and this operation.
     */
    default Consumerc beforeThat(Consumer<Character> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumerc)
    	{
    		final Consumerc originalBefore = (Consumerc)before;
    		
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
     * @return A new {@link Consumerc} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumerc beforeThat(Consumer<Character>... before)
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
    		if(before[0] instanceof Consumerc)
        	{
        		final Consumerc originalBefore = (Consumerc)before[0];
        		
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
    		for(Consumer<Character> consumer : before)
    		{
    			if(consumer instanceof Consumerc)
    				((Consumerc)consumer).acceptChar(a);
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
     * @return A new {@link Consumerc} performing the operations before and this operation.
     */
    default Consumerc beforeThat(Iterable<Consumer<Character>> before)
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
    		for(Consumer<Character> consumer : before)
    		{
    			if(consumer instanceof Consumerc)
    				((Consumerc)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptChar(a);
    	};
    }
    
    /**
     * Composes a new {@link Consumerc} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerc} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumerc inSequence(Consumer<Character>... consumers)
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
    		if(consumers[0] instanceof Consumerc)
    			return (Consumerc) consumers[0];
    		else
    			return (Consumerc) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Character> consumer : consumers)
    		{
    			if(consumer instanceof Consumerc)
    				((Consumerc)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumerc} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerc} performing the operations.
     */
    static Consumerc inSequence(Iterable<Consumer<Character>> consumers)
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
    		for(Consumer<Character> consumer : consumers)
    		{
    			if(consumer instanceof Consumerc)
    				((Consumerc)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumerc andThen(java.util.function.Consumer<? super Character> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptChar(a); after.accept(a);};
    }
}
