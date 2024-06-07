package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four short input arguments and returns
 * no result. Unlike {@link Consumer4S} this may throw exceptions.
 * {@link ConsumerEx4S} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptShort}.
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
public interface ConsumerEx4S extends ConsumerEx4<Short,Short,Short,Short>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptShort(short a, short b, short c, short d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4S} performing this operation and the
     * operation after.
     */
    default ConsumerEx4S thenShort(ConsumerEx4S after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptShort(a, b, c, d); after.acceptShort(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4S} performing this operation and the
     * operations after.
     */
	default ConsumerEx4S thenShort(ConsumerEx4S... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptShort(a, b, c, d); after[0].acceptShort(a, b, c, d);};

    	return (a, b, c, d) -> {acceptShort(a, b, c, d); for(ConsumerEx4S consumer : after) consumer.acceptShort(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4S} performing the operation before and
     * this operation.
     */
    default ConsumerEx4S beforeShort(ConsumerEx4S before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4S} performing the operations before and
     * this operation.
     */
    default ConsumerEx4S beforeShort(ConsumerEx4S... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4S consumer : before) consumer.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4S} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4S} performing the operations.
     */
	static ConsumerEx4S sequenceShort(ConsumerEx4S... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(ConsumerEx4S consumer : consumers) consumer.acceptShort(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptShort} instead.
     */
    @Override
    @Deprecated
    default void accept(Short a, Short b, Short c, Short d) throws Exception
    {
    	acceptShort(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4S} performing this operation and the
     * operation after.
     */
    default ConsumerEx4S then(ConsumerEx4<Short,Short,Short,Short> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4S)
    	{
    		final ConsumerEx4S originalAfter = (ConsumerEx4S)after;
    		
    		return (a, b, c, d) -> {acceptShort(a, b, c, d); originalAfter.acceptShort(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptShort(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4S} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4S then(ConsumerEx4<Short,Short,Short,Short>... after)
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
    		if(after[0] instanceof ConsumerEx4S)
        	{
        		final ConsumerEx4S originalAfter = (ConsumerEx4S)after[0];
        		
        		return (a, b, c, d) -> {acceptShort(a, b, c, d); originalAfter.acceptShort(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptShort(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptShort(a, b, c, d);
			
    		for(ConsumerEx4<Short,Short,Short,Short> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4S)
    				((ConsumerEx4S)consumer).acceptShort(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4S} performing the operation before and
     * this operation.
     */
    default ConsumerEx4S before(ConsumerEx4<Short,Short,Short,Short> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4S)
    	{
    		final ConsumerEx4S originalBefore = (ConsumerEx4S)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptShort(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4S} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4S before(ConsumerEx4<Short,Short,Short,Short>... before)
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
    		if(before[0] instanceof ConsumerEx4S)
        	{
        		final ConsumerEx4S originalBefore = (ConsumerEx4S)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptShort(a, b, c, d); acceptShort(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptShort(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Short,Short,Short,Short> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4S)
    				((ConsumerEx4S)consumer).acceptShort(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptShort(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4S} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4S} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4S sequence(ConsumerEx4<Short,Short,Short,Short>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerEx4S)
    			return (ConsumerEx4S) consumers[0];
    		else
    			return (ConsumerEx4S) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<Short,Short,Short,Short> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4S)
    				((ConsumerEx4S)consumer).acceptShort(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
