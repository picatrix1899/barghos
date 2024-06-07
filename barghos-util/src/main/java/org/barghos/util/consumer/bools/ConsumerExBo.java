package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one boolean input argument and returns
 * no result. Unlike {@link ConsumerBo} this may throw exceptions.
 * {@link ConsumerExBo} is expected to operate via side-effects.
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
public interface ConsumerExBo extends ConsumerEx<Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBool(boolean a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExBo} performing this operation and the
     * operation after.
     */
    default ConsumerExBo thenBool(ConsumerExBo after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptBool(a); after.acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExBo} performing this operation and the
     * operations after.
     */
	default ConsumerExBo thenBool(ConsumerExBo... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptBool(a); after[0].acceptBool(a);};

    	return (a) -> {acceptBool(a); for(ConsumerExBo consumer : after) consumer.acceptBool(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExBo} performing the operation before and
     * this operation.
     */
    default ConsumerExBo beforeBool(ConsumerExBo before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExBo} performing the operations before and
     * this operation.
     */
    default ConsumerExBo beforeBool(ConsumerExBo... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptBool(a); acceptBool(a);};
    	
    	return (a) -> {for(ConsumerExBo consumer : before) consumer.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExBo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExBo} performing the operations.
     */
	static ConsumerExBo sequenceBool(ConsumerExBo... consumers)
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
    	
    	return (a) -> {for(ConsumerExBo consumer : consumers) consumer.acceptBool(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBool} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a) throws Exception
    {
    	acceptBool(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExBo} performing this operation and the
     * operation after.
     */
    default ConsumerExBo then(ConsumerEx<Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExBo)
    	{
    		final ConsumerExBo originalAfter = (ConsumerExBo)after;
    		
    		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {acceptBool(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExBo} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExBo then(ConsumerEx<Boolean>... after)
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
    		if(after[0] instanceof ConsumerExBo)
        	{
        		final ConsumerExBo originalAfter = (ConsumerExBo)after[0];
        		
        		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
        	}
        	else
        	{
        		return (a) -> {acceptBool(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptBool(a);
			
    		for(ConsumerEx<Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerExBo)
    				((ConsumerExBo)consumer).acceptBool(a);
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
     * @return A new {@link ConsumerExBo} performing the operation before and
     * this operation.
     */
    default ConsumerExBo before(ConsumerEx<Boolean> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExBo)
    	{
    		final ConsumerExBo originalBefore = (ConsumerExBo)before;
    		
    		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptBool(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExBo} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExBo before(ConsumerEx<Boolean>... before)
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
    		if(before[0] instanceof ConsumerExBo)
        	{
        		final ConsumerExBo originalBefore = (ConsumerExBo)before[0];
        		
        		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptBool(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerExBo)
    				((ConsumerExBo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBool(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExBo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExBo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExBo sequence(ConsumerEx<Boolean>... consumers)
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
    		if(consumers[0] instanceof ConsumerExBo)
    			return (ConsumerExBo) consumers[0];
    		else
    			return (ConsumerExBo) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExBo)
    				((ConsumerExBo)consumer).acceptBool(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
