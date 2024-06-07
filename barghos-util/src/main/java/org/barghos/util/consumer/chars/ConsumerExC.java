package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one char input argument and returns no
 * result. Unlike {@link ConsumerC} this may throw exceptions.
 * {@link ConsumerExC} is expected to operate via side-effects.
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
public interface ConsumerExC extends ConsumerEx<Character>
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
     * @return A new {@link ConsumerExC} performing this operation and the
     * operation after.
     */
    default ConsumerExC thenChar(ConsumerExC after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptChar(a); after.acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExC} performing this operation and the
     * operations after.
     */
	default ConsumerExC thenChar(ConsumerExC... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptChar(a); after[0].acceptChar(a);};

    	return (a) -> {acceptChar(a); for(ConsumerExC consumer : after) consumer.acceptChar(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExC} performing the operation before and
     * this operation.
     */
    default ConsumerExC beforeChar(ConsumerExC before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExC} performing the operations before and
     * this operation.
     */
    default ConsumerExC beforeChar(ConsumerExC... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptChar(a); acceptChar(a);};
    	
    	return (a) -> {for(ConsumerExC consumer : before) consumer.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExC} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExC} performing the operations.
     */
	static ConsumerExC sequenceChar(ConsumerExC... consumers)
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
    	
    	return (a) -> {for(ConsumerExC consumer : consumers) consumer.acceptChar(a);};
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
     * @return A new {@link ConsumerExC} performing this operation and the
     * operation after.
     */
    default ConsumerExC then(ConsumerEx<Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExC)
    	{
    		final ConsumerExC originalAfter = (ConsumerExC)after;
    		
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
     * @return A new {@link ConsumerExC} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExC then(ConsumerEx<Character>... after)
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
    		if(after[0] instanceof ConsumerExC)
        	{
        		final ConsumerExC originalAfter = (ConsumerExC)after[0];
        		
        		return (a) -> {acceptChar(a); originalAfter.acceptChar(a);};
        	}
        	else
        	{
        		return (a) -> {acceptChar(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptChar(a);
			
    		for(ConsumerEx<Character> consumer : after)
    		{
    			if(consumer instanceof ConsumerExC)
    				((ConsumerExC)consumer).acceptChar(a);
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
     * @return A new {@link ConsumerExC} performing the operation before and
     * this operation.
     */
    default ConsumerExC before(ConsumerEx<Character> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExC)
    	{
    		final ConsumerExC originalBefore = (ConsumerExC)before;
    		
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
     * @return A new {@link ConsumerExC} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExC before(ConsumerEx<Character>... before)
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
    		if(before[0] instanceof ConsumerExC)
        	{
        		final ConsumerExC originalBefore = (ConsumerExC)before[0];
        		
        		return (a) -> {originalBefore.acceptChar(a); acceptChar(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptChar(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Character> consumer : before)
    		{
    			if(consumer instanceof ConsumerExC)
    				((ConsumerExC)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptChar(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExC} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExC} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExC sequence(ConsumerEx<Character>... consumers)
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
    		if(consumers[0] instanceof ConsumerExC)
    			return (ConsumerExC) consumers[0];
    		else
    			return (ConsumerExC) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Character> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExC)
    				((ConsumerExC)consumer).acceptChar(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
