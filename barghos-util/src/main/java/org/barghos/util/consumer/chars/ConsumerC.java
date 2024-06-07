package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one char input argument and returns no
 * result. {@link ConsumerC} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptChar(char)}.
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
public interface ConsumerC extends Consumer<Character>
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
     * @return A new {@link ConsumerC} performing this operation and the
     * operation after.
     */
    default ConsumerC thenChar(ConsumerC after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptChar(a); after.acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerC} performing this operation and the
     * operations after.
     */
	default ConsumerC thenChar(ConsumerC... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptChar(a); after[0].acceptChar(a);};

    	return (a) -> {acceptChar(a); for(ConsumerC consumer : after) consumer.acceptChar(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerC} performing the operation before and this
     * operation.
     */
    default ConsumerC beforeChar(ConsumerC before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerC} performing the operations before and this
     * operation.
     */
    default ConsumerC beforeChar(ConsumerC... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptChar(a); acceptChar(a);};
    	
    	return (a) -> {for(ConsumerC consumer : before) consumer.acceptChar(a); acceptChar(a);};
    }
    
    /**
     * Composes a new {@link ConsumerC} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerC} performing the operations.
     */
	static ConsumerC sequenceChar(ConsumerC... consumers)
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
    	
    	return (a) -> {for(ConsumerC consumer : consumers) consumer.acceptChar(a);};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptChar(char)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Character a)
    {
    	acceptChar(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerC} performing this operation and the
     * operation after.
     */
    default ConsumerC thenGeneric(Consumer<Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerC)
    	{
    		final ConsumerC originalAfter = (ConsumerC)after;
    		
    		return (a) -> {acceptChar(a); originalAfter.acceptChar(a);};
    	}
    	else
    	{
    		return (a) -> {acceptChar(a); after.acceptGeneric(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerC} performing this operation and the
     * operation after.
     */
    default ConsumerC thenGeneric(java.util.function.Consumer<? super Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerC)
    	{
    		final ConsumerC originalAfter = (ConsumerC)after;
    		
    		return (a) -> {acceptChar(a); originalAfter.acceptChar(a);};
    	}
    	else
    	{
    		return (a) -> {acceptChar(a); after.accept(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerC} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerC thenGeneric(Consumer<Character>... after)
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
    		if(after[0] instanceof ConsumerC)
        	{
        		final ConsumerC originalAfter = (ConsumerC)after[0];
        		
        		return (a) -> {acceptChar(a); originalAfter.acceptChar(a);};
        	}
        	else
        	{
        		return (a) -> {acceptChar(a); after[0].acceptGeneric(a);};
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
			
    		for(Consumer<Character> consumer : after)
    		{
    			if(consumer instanceof ConsumerC)
    				((ConsumerC)consumer).acceptChar(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerC} performing the operation before and this
     * operation.
     */
    default ConsumerC beforeGeneric(Consumer<Character> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerC)
    	{
    		final ConsumerC originalBefore = (ConsumerC)before;
    		
    		return (a) -> {originalBefore.acceptChar(a); acceptChar(a);};
    	}
    	else
    	{
    		return (a) -> {before.acceptGeneric(a); acceptChar(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerC} performing the operation before and this
     * operation.
     */
    default ConsumerC beforeGeneric(java.util.function.Consumer<? super Character> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerC)
    	{
    		final ConsumerC originalBefore = (ConsumerC)before;
    		
    		return (a) -> {originalBefore.acceptChar(a); acceptChar(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptChar(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerC} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerC beforeGeneric(Consumer<Character>... before)
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
    		if(before[0] instanceof ConsumerC)
        	{
        		final ConsumerC originalBefore = (ConsumerC)before[0];
        		
        		return (a) -> {originalBefore.acceptChar(a); acceptChar(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].acceptGeneric(a); acceptChar(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Character> consumer : before)
    		{
    			if(consumer instanceof ConsumerC)
    				((ConsumerC)consumer).acceptChar(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    		
    		acceptChar(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerC} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerC} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerC sequenceGeneric(Consumer<Character>... consumers)
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
    		if(consumers[0] instanceof ConsumerC)
    			return (ConsumerC) consumers[0];
    		else
    			return (ConsumerC) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Character> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerC)
    				((ConsumerC)consumer).acceptChar(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
    /*
     * ===========================
     * java.util.function.Consumer
     * ===========================
     */
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptChar(char)} instead.
     */
    @Override
    @Deprecated
    default void accept(Character a)
    {
    	acceptChar(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerC andThen(java.util.function.Consumer<? super Character> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptChar(a); after.accept(a);};
    }
}
