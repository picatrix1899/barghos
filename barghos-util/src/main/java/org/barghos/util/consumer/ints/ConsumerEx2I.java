package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two integer input arguments and returns
 * no result. Unlike {@link Consumer2I} this may throw exceptions.
 * {@link ConsumerEx2I} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptInt}.
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
public interface ConsumerEx2I extends ConsumerEx2<Integer,Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptInt(int a, int b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2I} performing this operation and the
     * operation after.
     */
    default ConsumerEx2I thenInt(ConsumerEx2I after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptInt(a, b); after.acceptInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2I} performing this operation and the
     * operations after.
     */
	default ConsumerEx2I thenInt(ConsumerEx2I... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptInt(a, b); after[0].acceptInt(a, b);};

    	return (a, b) -> {acceptInt(a, b); for(ConsumerEx2I consumer : after) consumer.acceptInt(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2I} performing the operation before and
     * this operation.
     */
    default ConsumerEx2I beforeInt(ConsumerEx2I before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptInt(a, b); acceptInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2I} performing the operations before and
     * this operation.
     */
    default ConsumerEx2I beforeInt(ConsumerEx2I... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptInt(a, b); acceptInt(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2I consumer : before) consumer.acceptInt(a, b); acceptInt(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2I} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2I} performing the operations.
     */
	static ConsumerEx2I sequenceInt(ConsumerEx2I... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2I consumer : consumers) consumer.acceptInt(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptInt} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a, Integer b) throws Exception
    {
    	acceptInt(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2I} performing this operation and the
     * operation after.
     */
    default ConsumerEx2I then(ConsumerEx2<Integer,Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2I)
    	{
    		final ConsumerEx2I originalAfter = (ConsumerEx2I)after;
    		
    		return (a, b) -> {acceptInt(a, b); originalAfter.acceptInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptInt(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2I} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2I then(ConsumerEx2<Integer,Integer>... after)
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
    		if(after[0] instanceof ConsumerEx2I)
        	{
        		final ConsumerEx2I originalAfter = (ConsumerEx2I)after[0];
        		
        		return (a, b) -> {acceptInt(a, b); originalAfter.acceptInt(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptInt(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptInt(a, b);
			
    		for(ConsumerEx2<Integer,Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2I)
    				((ConsumerEx2I)consumer).acceptInt(a, b);
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
     * @return A new {@link ConsumerEx2I} performing the operation before and
     * this operation.
     */
    default ConsumerEx2I before(ConsumerEx2<Integer,Integer> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2I)
    	{
    		final ConsumerEx2I originalBefore = (ConsumerEx2I)before;
    		
    		return (a, b) -> {originalBefore.acceptInt(a, b); acceptInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptInt(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2I} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2I before(ConsumerEx2<Integer,Integer>... before)
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
    		if(before[0] instanceof ConsumerEx2I)
        	{
        		final ConsumerEx2I originalBefore = (ConsumerEx2I)before[0];
        		
        		return (a, b) -> {originalBefore.acceptInt(a, b); acceptInt(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptInt(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Integer,Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2I)
    				((ConsumerEx2I)consumer).acceptInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptInt(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2I} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2I} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2I sequence(ConsumerEx2<Integer,Integer>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2I)
    			return (ConsumerEx2I) consumers[0];
    		else
    			return (ConsumerEx2I) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Integer,Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2I)
    				((ConsumerEx2I)consumer).acceptInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
