package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one boolean input argument and returns
 * no result. {@link ConsumerBo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBool(boolean)}.
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
public interface ConsumerBo extends Consumer<Boolean>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptBool(boolean a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerBo} performing this operation and the
     * operation after.
     */
    default ConsumerBo thenFloat(ConsumerBo after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptBool(a); after.acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerBo} performing this operation and the
     * operations after.
     */
	default ConsumerBo thenFloat(ConsumerBo... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptBool(a); after[0].acceptBool(a);};

    	return (a) -> {acceptBool(a); for(ConsumerBo consumer : after) consumer.acceptBool(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerBo} performing the operation before and this
     * operation.
     */
    default ConsumerBo beforeFloat(ConsumerBo before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerBo} performing the operations before and
     * this operation.
     */
    default ConsumerBo beforeFloat(ConsumerBo... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptBool(a); acceptBool(a);};
    	
    	return (a) -> {for(ConsumerBo consumer : before) consumer.acceptBool(a); acceptBool(a);};
    }
    
    /**
     * Composes a new {@link ConsumerBo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerBo} performing the operations.
     */
	static ConsumerBo sequenceFloat(ConsumerBo... consumers)
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
    	
    	return (a) -> {for(ConsumerBo consumer : consumers) consumer.acceptBool(a);};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptBool(boolean)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Boolean a)
    {
    	acceptBool(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBo} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerBo thenGeneric(Consumer<Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerBo)
    	{
    		final ConsumerBo originalAfter = (ConsumerBo)after;
    		
    		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {acceptBool(a); after.acceptGeneric(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBo} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerBo thenGeneric(java.util.function.Consumer<? super Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerBo)
    	{
    		final ConsumerBo originalAfter = (ConsumerBo)after;
    		
    		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {acceptBool(a); after.accept(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBo} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerBo thenGeneric(Consumer<Boolean>... after)
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
    		if(after[0] instanceof ConsumerBo)
        	{
        		final ConsumerBo originalAfter = (ConsumerBo)after[0];
        		
        		return (a) -> {acceptBool(a); originalAfter.acceptBool(a);};
        	}
        	else
        	{
        		return (a) -> {acceptBool(a); after[0].acceptGeneric(a);};
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
			
    		for(Consumer<Boolean> consumer : after)
    		{
    			if(consumer instanceof ConsumerBo)
    				((ConsumerBo)consumer).acceptBool(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBo} performing the operation before and this
     * operation.
     */
    @Override
    default ConsumerBo beforeGeneric(Consumer<Boolean> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerBo)
    	{
    		final ConsumerBo originalBefore = (ConsumerBo)before;
    		
    		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {before.acceptGeneric(a); acceptBool(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBo} performing the operation before and this
     * operation.
     */
    @Override
    default ConsumerBo beforeGeneric(java.util.function.Consumer<? super Boolean> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerBo)
    	{
    		final ConsumerBo originalBefore = (ConsumerBo)before;
    		
    		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptBool(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBo} performing the operations before and
     * this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerBo beforeGeneric(Consumer<Boolean>... before)
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
    		if(before[0] instanceof ConsumerBo)
        	{
        		final ConsumerBo originalBefore = (ConsumerBo)before[0];
        		
        		return (a) -> {originalBefore.acceptBool(a); acceptBool(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].acceptGeneric(a); acceptBool(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Boolean> consumer : before)
    		{
    			if(consumer instanceof ConsumerBo)
    				((ConsumerBo)consumer).acceptBool(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    		
    		acceptBool(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerBo} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerBo} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerBo sequenceGeneric(Consumer<Boolean>... consumers)
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
    		if(consumers[0] instanceof ConsumerBo)
    			return (ConsumerBo) consumers[0];
    		else
    			return (ConsumerBo) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Boolean> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerBo)
    				((ConsumerBo)consumer).acceptBool(a);
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
     * @deprecated Use {@link #acceptBool(boolean)} instead.
     */
    @Override
    @Deprecated
    default void accept(Boolean a)
    {
    	acceptBool(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerBo andThen(java.util.function.Consumer<? super Boolean> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptBool(a); after.accept(a);};
    }
}
