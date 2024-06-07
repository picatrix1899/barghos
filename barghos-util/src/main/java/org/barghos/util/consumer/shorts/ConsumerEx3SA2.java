package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three 2-dimensional short array input
 * arguments and returns no result. Unlike {@link Consumer3SA2} this may throw
 * exceptions. {@link ConsumerEx3SA2} is expected to operate via side-effects.
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
public interface ConsumerEx3SA2 extends ConsumerEx3<short[][],short[][],short[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptShortArray(short[][] a, short[][] b, short[][] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3SA2} performing this operation and the
     * operation after.
     */
    default ConsumerEx3SA2 thenShort(ConsumerEx3SA2 after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptShortArray(a, b, c); after.acceptShortArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3SA2} performing this operation and the
     * operations after.
     */
	default ConsumerEx3SA2 thenShort(ConsumerEx3SA2... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptShortArray(a, b, c); after[0].acceptShortArray(a, b, c);};

    	return (a, b, c) -> {acceptShortArray(a, b, c); for(ConsumerEx3SA2 consumer : after) consumer.acceptShortArray(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3SA2} performing the operation before and
     * this operation.
     */
    default ConsumerEx3SA2 beforeShort(ConsumerEx3SA2 before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptShortArray(a, b, c); acceptShortArray(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3SA2} performing the operations before and
     * this operation.
     */
    default ConsumerEx3SA2 beforeShort(ConsumerEx3SA2... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptShortArray(a, b, c); acceptShortArray(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3SA2 consumer : before) consumer.acceptShortArray(a, b, c); acceptShortArray(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3SA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3SA2} performing the operations.
     */
	static ConsumerEx3SA2 sequenceShort(ConsumerEx3SA2... consumers)
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
    	
    	return (a, b, c) -> {for(ConsumerEx3SA2 consumer : consumers) consumer.acceptShortArray(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShortArray} instead.
     */
    @Override
    @Deprecated
    default void accept(short[][] a, short[][] b, short[][] c) throws Exception
    {
    	acceptShortArray(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3SA2} performing this operation and the
     * operation after.
     */
    default ConsumerEx3SA2 then(ConsumerEx3<short[][],short[][],short[][]> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3SA2)
    	{
    		final ConsumerEx3SA2 originalAfter = (ConsumerEx3SA2)after;
    		
    		return (a, b, c) -> {acceptShortArray(a, b, c); originalAfter.acceptShortArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptShortArray(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3SA2} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3SA2 then(ConsumerEx3<short[][],short[][],short[][]>... after)
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
    		if(after[0] instanceof ConsumerEx3SA2)
        	{
        		final ConsumerEx3SA2 originalAfter = (ConsumerEx3SA2)after[0];
        		
        		return (a, b, c) -> {acceptShortArray(a, b, c); originalAfter.acceptShortArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptShortArray(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptShortArray(a, b, c);
			
    		for(ConsumerEx3<short[][],short[][],short[][]> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3SA2)
    				((ConsumerEx3SA2)consumer).acceptShortArray(a, b, c);
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
     * @return A new {@link ConsumerEx3SA2} performing the operation before and
     * this operation.
     */
    default ConsumerEx3SA2 before(ConsumerEx3<short[][],short[][],short[][]> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3SA2)
    	{
    		final ConsumerEx3SA2 originalBefore = (ConsumerEx3SA2)before;
    		
    		return (a, b, c) -> {originalBefore.acceptShortArray(a, b, c); acceptShortArray(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptShortArray(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3SA2} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3SA2 before(ConsumerEx3<short[][],short[][],short[][]>... before)
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
    		if(before[0] instanceof ConsumerEx3SA2)
        	{
        		final ConsumerEx3SA2 originalBefore = (ConsumerEx3SA2)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptShortArray(a, b, c); acceptShortArray(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptShortArray(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<short[][],short[][],short[][]> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3SA2)
    				((ConsumerEx3SA2)consumer).acceptShortArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptShortArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3SA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3SA2} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3SA2 sequence(ConsumerEx3<short[][],short[][],short[][]>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx3SA2)
    			return (ConsumerEx3SA2) consumers[0];
    		else
    			return (ConsumerEx3SA2) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<short[][],short[][],short[][]> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3SA2)
    				((ConsumerEx3SA2)consumer).acceptShortArray(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
