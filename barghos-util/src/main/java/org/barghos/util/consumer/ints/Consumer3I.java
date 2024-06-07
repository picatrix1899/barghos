package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three integer input arguments and
 * returns no result. {@link Consumer3I} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is {@link #acceptInt}.
 * 
 * @see ConsumerI
 * @see ConsumerExI
 * @see Consumer2I
 * @see ConsumerEx2I
 * @see Consumer3I
 * @see ConsumerEx3I
 * @see Consumer4I
 * @see ConsumerEx4I
 */
@FunctionalInterface
public interface Consumer3I extends Consumer3<Integer,Integer,Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptInt(int a, int b, int c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3I} performing this operation and the
     * operation after.
     */
    default Consumer3I thenInt(Consumer3I after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptInt(a, b, c); after.acceptInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3I} performing this operation and the
     * operations after.
     */
	default Consumer3I thenInt(Consumer3I... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptInt(a, b, c); after[0].acceptInt(a, b, c);};

    	return (a, b, c) -> {acceptInt(a, b, c); for(Consumer3I consumer : after) consumer.acceptInt(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3I} performing the operation before and this
     * operation.
     */
    default Consumer3I beforeInt(Consumer3I before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptInt(a, b, c); acceptInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3I} performing the operations before and
     * this operation.
     */
    default Consumer3I beforeInt(Consumer3I... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptInt(a, b, c); acceptInt(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3I consumer : before) consumer.acceptInt(a, b, c); acceptInt(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3I} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3I} performing the operations.
     */
	static Consumer3I sequenceInt(Consumer3I... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3I consumer : consumers) consumer.acceptInt(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptInt} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a, Integer b, Integer c)
    {
    	acceptInt(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3I} performing this operation and the
     * operation after.
     */
    default Consumer3I then(Consumer3<Integer,Integer,Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3I)
    	{
    		final Consumer3I originalAfter = (Consumer3I)after;
    		
    		return (a, b, c) -> {acceptInt(a, b, c); originalAfter.acceptInt(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptInt(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3I} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3I then(Consumer3<Integer,Integer,Integer>... after)
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
    		if(after[0] instanceof Consumer3I)
        	{
        		final Consumer3I originalAfter = (Consumer3I)after[0];
        		
        		return (a, b, c) -> {acceptInt(a, b, c); originalAfter.acceptInt(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptInt(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptInt(a, b, c);
			
    		for(Consumer3<Integer,Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof Consumer3I)
    				((Consumer3I)consumer).acceptInt(a, b, c);
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
     * @return A new {@link Consumer3I} performing the operation before and this
     * operation.
     */
    default Consumer3I before(Consumer3<Integer,Integer,Integer> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3I)
    	{
    		final Consumer3I originalBefore = (Consumer3I)before;
    		
    		return (a, b, c) -> {originalBefore.acceptInt(a, b, c); acceptInt(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptInt(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3I} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3I before(Consumer3<Integer,Integer,Integer>... before)
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
    		if(before[0] instanceof Consumer3I)
        	{
        		final Consumer3I originalBefore = (Consumer3I)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptInt(a, b, c); acceptInt(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptInt(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Integer,Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof Consumer3I)
    				((Consumer3I)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptInt(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3I} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3I} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3I sequence(Consumer3<Integer,Integer,Integer>... consumers)
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
    		if(consumers[0] instanceof Consumer3I)
    			return (Consumer3I) consumers[0];
    		else
    			return (Consumer3I) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Integer,Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3I)
    				((Consumer3I)consumer).acceptInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
