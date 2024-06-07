package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one byte input argument and returns no
 * result.
 * Unlike {@link ConsumerB} this may throw exceptions.
 * {@link ConsumerExB} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptByte}.
 * 
 * @see ConsumerB
 * @see ConsumerExB
 * @see Consumer2B
 * @see ConsumerEx2B
 * @see Consumer3B
 * @see ConsumerEx3B
 * @see Consumer4B
 * @see ConsumerEx4B
 */
@FunctionalInterface
public interface ConsumerExB extends ConsumerEx<Byte>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptByte(byte a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExB} performing this operation and the
     * operation after.
     */
    default ConsumerExB andThenByte(ConsumerExB after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptByte(a); after.acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExB} performing this operation and the 
     * operations after.
     */
	default ConsumerExB andThenByte(ConsumerExB... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptByte(a); after[0].acceptByte(a);};

    	return (a) -> {acceptByte(a); for(ConsumerExB consumer : after) consumer.acceptByte(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExB} performing the operation before and
     * this operation.
     */
    default ConsumerExB beforeThatByte(ConsumerExB before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExB} performing the operations before and
     * this operation.
     */
    default ConsumerExB beforeThatByte(ConsumerExB... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptByte(a); acceptByte(a);};
    	
    	return (a) -> {for(ConsumerExB consumer : before) consumer.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExB} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExB} performing the operations.
     */
	static ConsumerExB inSequenceByte(ConsumerExB... consumers)
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
    	
    	return (a) -> {for(ConsumerExB consumer : consumers) consumer.acceptByte(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptByte} instead.
     */
    @Override
    @Deprecated
    default void accept(Byte a) throws Exception
    {
    	acceptByte(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExB} performing this operation and the
     * operation after.
     */
    default ConsumerExB andThen(ConsumerEx<Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExB)
    	{
    		final ConsumerExB originalAfter = (ConsumerExB)after;
    		
    		return (a) -> {acceptByte(a); originalAfter.acceptByte(a);};
    	}
    	else
    	{
    		return (a) -> {acceptByte(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExB} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExB andThen(ConsumerEx<Byte>... after)
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
    		if(after[0] instanceof ConsumerExB)
        	{
        		final ConsumerExB originalAfter = (ConsumerExB)after[0];
        		
        		return (a) -> {acceptByte(a); originalAfter.acceptByte(a);};
        	}
        	else
        	{
        		return (a) -> {acceptByte(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptByte(a);
			
    		for(ConsumerEx<Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerExB)
    				((ConsumerExB)consumer).acceptByte(a);
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
     * @return A new {@link ConsumerExB} performing the operation before and
     * this operation.
     */
    default ConsumerExB beforeThat(ConsumerEx<Byte> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExB)
    	{
    		final ConsumerExB originalBefore = (ConsumerExB)before;
    		
    		return (a) -> {originalBefore.acceptByte(a); acceptByte(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptByte(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExB} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExB beforeThat(ConsumerEx<Byte>... before)
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
    		if(before[0] instanceof ConsumerExB)
        	{
        		final ConsumerExB originalBefore = (ConsumerExB)before[0];
        		
        		return (a) -> {originalBefore.acceptByte(a); acceptByte(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptByte(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerExB)
    				((ConsumerExB)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptByte(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExB} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExB} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExB inSequence(ConsumerEx<Byte>... consumers)
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
    		if(consumers[0] instanceof ConsumerExB)
    			return (ConsumerExB) consumers[0];
    		else
    			return (ConsumerExB) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExB)
    				((ConsumerExB)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
