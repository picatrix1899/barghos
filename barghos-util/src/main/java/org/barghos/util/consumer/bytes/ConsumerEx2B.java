package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two byte input arguments and returns no
 * result. Unlike {@link Consumer2B} this may throw exceptions.
 * {@link ConsumerEx2B} is expected to operate via side-effects.
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
public interface ConsumerEx2B extends ConsumerEx2<Byte,Byte>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptByte(byte a, byte b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2B} performing this operation and the 
     * operation after.
     */
    default ConsumerEx2B thenByte(ConsumerEx2B after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptByte(a, b); after.acceptByte(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2B} performing this operation and the
     * operations after.
     */
	default ConsumerEx2B thenByte(ConsumerEx2B... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptByte(a, b); after[0].acceptByte(a, b);};

    	return (a, b) -> {acceptByte(a, b); for(ConsumerEx2B consumer : after) consumer.acceptByte(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2B} performing the operation before and
     * this operation.
     */
    default ConsumerEx2B beforeByte(ConsumerEx2B before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptByte(a, b); acceptByte(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2B} performing the operations before and
     * this operation.
     */
    default ConsumerEx2B beforeByte(ConsumerEx2B... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptByte(a, b); acceptByte(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2B consumer : before) consumer.acceptByte(a, b); acceptByte(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2B} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2B} performing the operations.
     */
	static ConsumerEx2B sequenceByte(ConsumerEx2B... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2B consumer : consumers) consumer.acceptByte(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptByte} instead.
     */
    @Override
    @Deprecated
    default void accept(Byte a, Byte b) throws Exception
    {
    	acceptByte(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2B} performing this operation and the operation after.
     */
    default ConsumerEx2B then(ConsumerEx2<Byte,Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2B)
    	{
    		final ConsumerEx2B originalAfter = (ConsumerEx2B)after;
    		
    		return (a, b) -> {acceptByte(a, b); originalAfter.acceptByte(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptByte(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2B} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2B then(ConsumerEx2<Byte,Byte>... after)
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
    		if(after[0] instanceof ConsumerEx2B)
        	{
        		final ConsumerEx2B originalAfter = (ConsumerEx2B)after[0];
        		
        		return (a, b) -> {acceptByte(a, b); originalAfter.acceptByte(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptByte(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptByte(a, b);
			
    		for(ConsumerEx2<Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2B)
    				((ConsumerEx2B)consumer).acceptByte(a, b);
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
     * @return A new {@link ConsumerEx2B} performing the operation before and
     * this operation.
     */
    default ConsumerEx2B before(ConsumerEx2<Byte,Byte> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2B)
    	{
    		final ConsumerEx2B originalBefore = (ConsumerEx2B)before;
    		
    		return (a, b) -> {originalBefore.acceptByte(a, b); acceptByte(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptByte(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2B} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2B before(ConsumerEx2<Byte,Byte>... before)
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
    		if(before[0] instanceof ConsumerEx2B)
        	{
        		final ConsumerEx2B originalBefore = (ConsumerEx2B)before[0];
        		
        		return (a, b) -> {originalBefore.acceptByte(a, b); acceptByte(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptByte(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2B)
    				((ConsumerEx2B)consumer).acceptByte(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptByte(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2B} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2B} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2B sequence(ConsumerEx2<Byte,Byte>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2B)
    			return (ConsumerEx2B) consumers[0];
    		else
    			return (ConsumerEx2B) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2B)
    				((ConsumerEx2B)consumer).acceptByte(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
