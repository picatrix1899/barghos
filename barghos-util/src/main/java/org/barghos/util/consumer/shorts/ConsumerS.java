package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one short input argument and returns no
 * result. {@link ConsumerS} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShort(short)}.
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface ConsumerS extends Consumer<Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptShort(short a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerS} performing this operation and the
     * operation after.
     */
    default ConsumerS thenShort(ConsumerS after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptShort(a); after.acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerS} performing this operation and the
     * operations after.
     */
	default ConsumerS thenShort(ConsumerS... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptShort(a); after[0].acceptShort(a);};

    	return (a) -> {acceptShort(a); for(ConsumerS consumer : after) consumer.acceptShort(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerS} performing the operation before and this
     * operation.
     */
    default ConsumerS beforeShort(ConsumerS before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerS} performing the operations before and this
     * operation.
     */
    default ConsumerS beforeShort(ConsumerS... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptShort(a); acceptShort(a);};
    	
    	return (a) -> {for(ConsumerS consumer : before) consumer.acceptShort(a); acceptShort(a);};
    }
    
    /**
     * Composes a new {@link ConsumerS} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerS} performing the operations.
     */
	static ConsumerS sequenceShort(ConsumerS... consumers)
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
    	
    	return (a) -> {for(ConsumerS consumer : consumers) consumer.acceptShort(a);};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptShort(short)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Short a)
    {
    	acceptShort(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerS} performing this operation and the
     * operation after.
     */
    default ConsumerS thenGeneric(Consumer<Short> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerS)
    	{
    		final ConsumerS originalAfter = (ConsumerS)after;
    		
    		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {acceptShort(a); after.acceptGeneric(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerS} performing this operation and the
     * operation after.
     */
    default ConsumerS thenGeneric(java.util.function.Consumer<? super Short> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerS)
    	{
    		final ConsumerS originalAfter = (ConsumerS)after;
    		
    		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {acceptShort(a); after.accept(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerS} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerS thenGeneric(Consumer<Short>... after)
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
    		if(after[0] instanceof ConsumerS)
        	{
        		final ConsumerS originalAfter = (ConsumerS)after[0];
        		
        		return (a) -> {acceptShort(a); originalAfter.acceptShort(a);};
        	}
        	else
        	{
        		return (a) -> {acceptShort(a); after[0].acceptGeneric(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptShort(a);
			
    		for(Consumer<Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerS)
    				((ConsumerS)consumer).acceptShort(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerS} performing the operation before and this
     * operation.
     */
    default ConsumerS beforeGeneric(Consumer<Short> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerS)
    	{
    		final ConsumerS originalBefore = (ConsumerS)before;
    		
    		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {before.acceptGeneric(a); acceptShort(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerS} performing the operation before and this
     * operation.
     */
    default ConsumerS beforeGeneric(java.util.function.Consumer<? super Short> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerS)
    	{
    		final ConsumerS originalBefore = (ConsumerS)before;
    		
    		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptShort(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerS} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerS beforeGeneric(Consumer<Short>... before)
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
    		if(before[0] instanceof ConsumerS)
        	{
        		final ConsumerS originalBefore = (ConsumerS)before[0];
        		
        		return (a) -> {originalBefore.acceptShort(a); acceptShort(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].acceptGeneric(a); acceptShort(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerS)
    				((ConsumerS)consumer).acceptShort(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    		
    		acceptShort(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerS} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerS} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerS sequenceGeneric(Consumer<Short>... consumers)
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
    		if(consumers[0] instanceof ConsumerS)
    			return (ConsumerS) consumers[0];
    		else
    			return (ConsumerS) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerS)
    				((ConsumerS)consumer).acceptShort(a);
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
     * @deprecated Use {@link #acceptShort(short)} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a)
    {
    	acceptShort(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerS andThen(java.util.function.Consumer<? super Short> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptShort(a); after.accept(a);};
    }
}
