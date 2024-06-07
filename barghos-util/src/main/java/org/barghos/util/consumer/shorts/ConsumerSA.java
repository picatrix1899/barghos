package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 1-dimensional short array input
 * argument and returns no result. {@link ConsumerSA} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShortArray}.
 * 
 * @see ConsumerSA
 * @see ConsumerExSA
 * @see Consumer2SA
 * @see ConsumerEx2SA
 * @see Consumer3SA
 * @see ConsumerEx3SA
 * @see Consumer4SA
 * @see ConsumerEx4SA
 */
@FunctionalInterface
public interface ConsumerSA extends Consumer<short[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptShortArray(short[] a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerSA} performing this operation and the
     * operation after.
     */
    default ConsumerSA thenShort(ConsumerSA after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptShortArray(a); after.acceptShortArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerSA} performing this operation and the
     * operations after.
     */
	default ConsumerSA thenShort(ConsumerSA... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptShortArray(a); after[0].acceptShortArray(a);};

    	return (a) -> {acceptShortArray(a); for(ConsumerSA consumer : after) consumer.acceptShortArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerSA} performing the operation before and this
     * operation.
     */
    default ConsumerSA beforeShort(ConsumerSA before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptShortArray(a); acceptShortArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerSA} performing the operations before and this
     * operation.
     */
    default ConsumerSA beforeShort(ConsumerSA... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptShortArray(a); acceptShortArray(a);};
    	
    	return (a) -> {for(ConsumerSA consumer : before) consumer.acceptShortArray(a); acceptShortArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerSA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerSA} performing the operations.
     */
	static ConsumerSA sequenceShort(ConsumerSA... consumers)
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
    	
    	return (a) -> {for(ConsumerSA consumer : consumers) consumer.acceptShortArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShortArray} instead.
     */
    @Override
    @Deprecated
    default void accept(short[] a)
    {
    	acceptShortArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerSA} performing this operation and the
     * operation after.
     */
    default ConsumerSA then(Consumer<short[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerSA)
    	{
    		final ConsumerSA originalAfter = (ConsumerSA)after;
    		
    		return (a) -> {acceptShortArray(a); originalAfter.acceptShortArray(a);};
    	}
    	else
    	{
    		return (a) -> {acceptShortArray(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerSA} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerSA then(Consumer<short[]>... after)
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
    		if(after[0] instanceof ConsumerSA)
        	{
        		final ConsumerSA originalAfter = (ConsumerSA)after[0];
        		
        		return (a) -> {acceptShortArray(a); originalAfter.acceptShortArray(a);};
        	}
        	else
        	{
        		return (a) -> {acceptShortArray(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptShortArray(a);
			
    		for(Consumer<short[]> consumer : after)
    		{
    			if(consumer instanceof ConsumerSA)
    				((ConsumerSA)consumer).acceptShortArray(a);
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
     * @return A new {@link ConsumerSA} performing the operation before and this
     * operation.
     */
    default ConsumerSA before(Consumer<short[]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerSA)
    	{
    		final ConsumerSA originalBefore = (ConsumerSA)before;
    		
    		return (a) -> {originalBefore.acceptShortArray(a); acceptShortArray(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptShortArray(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerSA} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerSA before(Consumer<short[]>... before)
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
    		if(before[0] instanceof ConsumerSA)
        	{
        		final ConsumerSA originalBefore = (ConsumerSA)before[0];
        		
        		return (a) -> {originalBefore.acceptShortArray(a); acceptShortArray(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptShortArray(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<short[]> consumer : before)
    		{
    			if(consumer instanceof ConsumerSA)
    				((ConsumerSA)consumer).acceptShortArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptShortArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerSA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerSA} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerSA sequence(Consumer<short[]>... consumers)
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
    		if(consumers[0] instanceof ConsumerSA)
    			return (ConsumerSA) consumers[0];
    		else
    			return (ConsumerSA) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<short[]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerSA)
    				((ConsumerSA)consumer).acceptShortArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default ConsumerSA andThen(java.util.function.Consumer<? super short[]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptShortArray(a); after.accept(a);};
    }
}
