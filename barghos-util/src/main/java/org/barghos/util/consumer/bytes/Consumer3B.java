package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three byte input arguments and returns
 * no result. {@link Consumer3B} is expected to operate via side-effects.
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
public interface Consumer3B extends Consumer3<Byte,Byte,Byte>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptByte(byte a, byte b, byte c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3B} performing this operation and the
     * operation after.
     */
    default Consumer3B thenByte(Consumer3B after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {acceptByte(a, b, c); after.acceptByte(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3B} performing this operation and the
     * operations after.
     */
	default Consumer3B thenByte(Consumer3B... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c) -> {acceptByte(a, b, c); after[0].acceptByte(a, b, c);};

    	return (a, b, c) -> {acceptByte(a, b, c); for(Consumer3B consumer : after) consumer.acceptByte(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3B} performing the operation before and this
     * operation.
     */
    default Consumer3B beforeByte(Consumer3B before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {before.acceptByte(a, b, c); acceptByte(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3B} performing the operations before and
     * this operation.
     */
    default Consumer3B beforeByte(Consumer3B... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptByte(a, b, c); acceptByte(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3B consumer : before) consumer.acceptByte(a, b, c); acceptByte(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3B} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3B} performing the operations.
     */
	static Consumer3B sequenceByte(Consumer3B... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3B consumer : consumers) consumer.acceptByte(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptByte} instead.
     */
    @Override
    @Deprecated
    default void accept(Byte a, Byte b, Byte c)
    {
    	acceptByte(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3B} performing this operation and the
     * operation after.
     */
    default Consumer3B then(Consumer3<Byte,Byte,Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3B)
    	{
    		final Consumer3B originalAfter = (Consumer3B)after;
    		
    		return (a, b, c) -> {acceptByte(a, b, c); originalAfter.acceptByte(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptByte(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3B} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3B then(Consumer3<Byte,Byte,Byte>... after)
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
    		if(after[0] instanceof Consumer3B)
        	{
        		final Consumer3B originalAfter = (Consumer3B)after[0];
        		
        		return (a, b, c) -> {acceptByte(a, b, c); originalAfter.acceptByte(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptByte(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
			acceptByte(a, b, c);
			
    		for(Consumer3<Byte,Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof Consumer3B)
    				((Consumer3B)consumer).acceptByte(a, b, c);
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
     * @return A new {@link Consumer3B} performing the operation before and this
     * operation.
     */
    default Consumer3B before(Consumer3<Byte,Byte,Byte> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3B)
    	{
    		final Consumer3B originalBefore = (Consumer3B)before;
    		
    		return (a, b, c) -> {originalBefore.acceptByte(a, b, c); acceptByte(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptByte(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3B} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3B before(Consumer3<Byte,Byte,Byte>... before)
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
    		if(before[0] instanceof Consumer3B)
        	{
        		final Consumer3B originalBefore = (Consumer3B)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptByte(a, b, c); acceptByte(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptByte(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Byte,Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof Consumer3B)
    				((Consumer3B)consumer).acceptByte(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptByte(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3B} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3B} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3B sequence(Consumer3<Byte,Byte,Byte>... consumers)
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
    		if(consumers[0] instanceof Consumer3B)
    			return (Consumer3B) consumers[0];
    		else
    			return (Consumer3B) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<Byte,Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3B)
    				((Consumer3B)consumer).acceptByte(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
