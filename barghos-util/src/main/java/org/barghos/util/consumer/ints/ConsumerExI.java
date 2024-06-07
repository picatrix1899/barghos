package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one integer input argument and returns
 * no result. Unlike {@link ConsumerI} this may throw Exceptions.
 * {@link ConsumerExI} is expected to operate via side-effects.
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
public interface ConsumerExI extends ConsumerEx<Integer>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptInt(int a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExI} performing this operation and the
     * operation after.
     */
    default ConsumerExI thenInt(ConsumerExI after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptInt(a); after.acceptInt(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExI} performing this operation and the
     * operations after.
     */
	default ConsumerExI thenInt(ConsumerExI... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptInt(a); after[0].acceptInt(a);};

    	return (a) -> {acceptInt(a); for(ConsumerExI consumer : after) consumer.acceptInt(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExI} performing the operation before and
     * this operation.
     */
    default ConsumerExI beforeInt(ConsumerExI before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptInt(a); acceptInt(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExI} performing the operations before and
     * this operation.
     */
    default ConsumerExI beforeInt(ConsumerExI... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptInt(a); acceptInt(a);};
    	
    	return (a) -> {for(ConsumerExI consumer : before) consumer.acceptInt(a); acceptInt(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExI} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExI} performing the operations.
     */
	static ConsumerExI sequenceInt(ConsumerExI... consumers)
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
    	
    	return (a) -> {for(ConsumerExI consumer : consumers) consumer.acceptInt(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptInt} instead.
     */
    @Override
    @Deprecated
    default void accept(Integer a) throws Exception
    {
    	acceptInt(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExI} performing this operation and the
     * operation after.
     */
    default ConsumerExI then(ConsumerEx<Integer> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExI)
    	{
    		final ConsumerExI originalAfter = (ConsumerExI)after;
    		
    		return (a) -> {acceptInt(a); originalAfter.acceptInt(a);};
    	}
    	else
    	{
    		return (a) -> {acceptInt(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExI} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExI then(ConsumerEx<Integer>... after)
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
    		if(after[0] instanceof ConsumerExI)
        	{
        		final ConsumerExI originalAfter = (ConsumerExI)after[0];
        		
        		return (a) -> {acceptInt(a); originalAfter.acceptInt(a);};
        	}
        	else
        	{
        		return (a) -> {acceptInt(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptInt(a);
			
    		for(ConsumerEx<Integer> consumer : after)
    		{
    			if(consumer instanceof ConsumerExI)
    				((ConsumerExI)consumer).acceptInt(a);
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
     * @return A new {@link ConsumerExI} performing the operation before and
     * this operation.
     */
    default ConsumerExI before(ConsumerEx<Integer> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExI)
    	{
    		final ConsumerExI originalBefore = (ConsumerExI)before;
    		
    		return (a) -> {originalBefore.acceptInt(a); acceptInt(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptInt(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExI} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExI before(ConsumerEx<Integer>... before)
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
    		if(before[0] instanceof ConsumerExI)
        	{
        		final ConsumerExI originalBefore = (ConsumerExI)before[0];
        		
        		return (a) -> {originalBefore.acceptInt(a); acceptInt(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptInt(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Integer> consumer : before)
    		{
    			if(consumer instanceof ConsumerExI)
    				((ConsumerExI)consumer).acceptInt(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptInt(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExI} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExI} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExI sequence(ConsumerEx<Integer>... consumers)
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
    		if(consumers[0] instanceof ConsumerExI)
    			return (ConsumerExI) consumers[0];
    		else
    			return (ConsumerExI) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Integer> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExI)
    				((ConsumerExI)consumer).acceptInt(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
