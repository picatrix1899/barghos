package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one 2-dimensional short array input
 * argument and returns no result. {@link ConsumerSA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShortArray}.
 * 
 * @see ConsumerSA2
 * @see ConsumerExSA2
 * @see Consumer2SA2
 * @see ConsumerEx2SA2
 * @see Consumer3SA2
 * @see ConsumerEx3SA2
 * @see Consumer4SA2
 * @see ConsumerEx4SA2
 */
@FunctionalInterface
public interface ConsumerSA2 extends Consumer<short[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptShortArray(short[][] a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerSA2} performing this operation and the
     * operation after.
     */
    default ConsumerSA2 thenShort(ConsumerSA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptShortArray(a); after.acceptShortArray(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerSA2} performing this operation and the
     * operations after.
     */
	default ConsumerSA2 thenShort(ConsumerSA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptShortArray(a); after[0].acceptShortArray(a);};

    	return (a) -> {acceptShortArray(a); for(ConsumerSA2 consumer : after) consumer.acceptShortArray(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerSA2} performing the operation before and this
     * operation.
     */
    default ConsumerSA2 beforeShort(ConsumerSA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptShortArray(a); acceptShortArray(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerSA2} performing the operations before and this
     * operation.
     */
    default ConsumerSA2 beforeShort(ConsumerSA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptShortArray(a); acceptShortArray(a);};
    	
    	return (a) -> {for(ConsumerSA2 consumer : before) consumer.acceptShortArray(a); acceptShortArray(a);};
    }
    
    /**
     * Composes a new {@link ConsumerSA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerSA2} performing the operations.
     */
	static ConsumerSA2 sequenceShort(ConsumerSA2... consumers)
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
    	
    	return (a) -> {for(ConsumerSA2 consumer : consumers) consumer.acceptShortArray(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShortArray} instead.
     */
    @Override
    @Deprecated
    default void accept(short[][] a)
    {
    	acceptShortArray(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerSA2} performing this operation and the
     * operation after.
     */
    default ConsumerSA2 then(Consumer<short[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerSA2)
    	{
    		final ConsumerSA2 originalAfter = (ConsumerSA2)after;
    		
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
     * @return A new {@link ConsumerSA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerSA2 then(Consumer<short[][]>... after)
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
    		if(after[0] instanceof ConsumerSA2)
        	{
        		final ConsumerSA2 originalAfter = (ConsumerSA2)after[0];
        		
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
			
    		for(Consumer<short[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerSA2)
    				((ConsumerSA2)consumer).acceptShortArray(a);
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
     * @return A new {@link ConsumerSA2} performing the operation before and this
     * operation.
     */
    default ConsumerSA2 before(Consumer<short[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerSA2)
    	{
    		final ConsumerSA2 originalBefore = (ConsumerSA2)before;
    		
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
     * @return A new {@link ConsumerSA2} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerSA2 before(Consumer<short[][]>... before)
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
    		if(before[0] instanceof ConsumerSA2)
        	{
        		final ConsumerSA2 originalBefore = (ConsumerSA2)before[0];
        		
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
    		for(Consumer<short[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerSA2)
    				((ConsumerSA2)consumer).acceptShortArray(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptShortArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerSA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerSA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerSA2 sequence(Consumer<short[][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerSA2)
    			return (ConsumerSA2) consumers[0];
    		else
    			return (ConsumerSA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<short[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerSA2)
    				((ConsumerSA2)consumer).acceptShortArray(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default ConsumerSA2 andThen(java.util.function.Consumer<? super short[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptShortArray(a); after.accept(a);};
    }
}
