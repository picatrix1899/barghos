package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two boolean input arguments and returns
 * no result. Unlike {@link Consumer2Bo} this may throw exceptions.
 * {@link ConsumerEx2Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBool}.
 * 
 * @see ConsumerBo
 * @see ConsumerExBo
 * @see Consumer2Bo
 * @see ConsumerEx2Bo
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4Bo
 * @see ConsumerEx4Bo
 */
@FunctionalInterface
public interface ConsumerEx2Bo extends ConsumerEx2<Boolean,Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBool(boolean a, boolean b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2Bo} performing this operation and the
     * operation after.
     */
    default ConsumerEx2Bo thenBool(ConsumerEx2Bo after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptBool(a, b); after.acceptBool(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2Bo} performing this operation and the
     * operations after.
     */
	default ConsumerEx2Bo thenBool(ConsumerEx2Bo... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptBool(a, b); after[0].acceptBool(a, b);};

    	return (a, b) -> {acceptBool(a, b); for(ConsumerEx2Bo consumer : after) consumer.acceptBool(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Bo} performing the operation before and
     * this operation.
     */
    default ConsumerEx2Bo beforeBool(ConsumerEx2Bo before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptBool(a, b); acceptBool(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Bo} performing the operations before and
     * this operation.
     */
    default ConsumerEx2Bo beforeBool(ConsumerEx2Bo... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptBool(a, b); acceptBool(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2Bo consumer : before) consumer.acceptBool(a, b); acceptBool(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2Bo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2Bo} performing the operations.
     */
	static ConsumerEx2Bo sequenceBool(ConsumerEx2Bo... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2Bo consumer : consumers) consumer.acceptBool(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a, Boolean b) throws Exception
    {
    	acceptBool(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2Bo} performing this operation and the
     * operation after.
     */
    default ConsumerEx2Bo then(ConsumerEx2<Boolean,Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2Bo)
    	{
    		final ConsumerEx2Bo originalAfter = (ConsumerEx2Bo)after;
    		
    		return (a, b) -> {acceptBool(a, b); originalAfter.acceptBool(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptBool(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2Bo} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2Bo then(ConsumerEx2<Boolean,Boolean>... after)
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
    		if(after[0] instanceof ConsumerEx2Bo)
        	{
        		final ConsumerEx2Bo originalAfter = (ConsumerEx2Bo)after[0];
        		
        		return (a, b) -> {acceptBool(a, b); originalAfter.acceptBool(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptBool(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptBool(a, b);
			
    		for(ConsumerEx2<Boolean,Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2Bo)
    				((ConsumerEx2Bo)consumer).acceptBool(a, b);
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
     * @return A new {@link ConsumerEx2Bo} performing the operation before and
     * this operation.
     */
    default ConsumerEx2Bo before(ConsumerEx2<Boolean,Boolean> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2Bo)
    	{
    		final ConsumerEx2Bo originalBefore = (ConsumerEx2Bo)before;
    		
    		return (a, b) -> {originalBefore.acceptBool(a, b); acceptBool(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptBool(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Bo} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2Bo before(ConsumerEx2<Boolean,Boolean>... before)
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
    		if(before[0] instanceof ConsumerEx2Bo)
        	{
        		final ConsumerEx2Bo originalBefore = (ConsumerEx2Bo)before[0];
        		
        		return (a, b) -> {originalBefore.acceptBool(a, b); acceptBool(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptBool(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Boolean,Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2Bo)
    				((ConsumerEx2Bo)consumer).acceptBool(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptBool(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2Bo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2Bo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2Bo sequence(ConsumerEx2<Boolean,Boolean>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2Bo)
    			return (ConsumerEx2Bo) consumers[0];
    		else
    			return (ConsumerEx2Bo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Boolean,Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2Bo)
    				((ConsumerEx2Bo)consumer).acceptBool(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
