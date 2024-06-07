package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four byte input arguments and returns no
 * result. {@link Consumer4B} is expected to operate via side-effects.
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
public interface Consumer4B extends Consumer4<Byte,Byte,Byte,Byte>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptByte(byte a, byte b, byte c, byte d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4B} performing this operation and the
     * operation after.
     */
    default Consumer4B thenByte(Consumer4B after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {acceptByte(a, b, c, d); after.acceptByte(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4B} performing this operation and the
     * operations after.
     */
	default Consumer4B thenByte(Consumer4B... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptByte(a, b, c, d); after[0].acceptByte(a, b, c, d);};

    	return (a, b, c, d) -> {acceptByte(a, b, c, d); for(Consumer4B consumer : after) consumer.acceptByte(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4B} performing the operation before and this
     * operation.
     */
    default Consumer4B beforeByte(Consumer4B before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {before.acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4B} performing the operations before and
     * this operation.
     */
    default Consumer4B beforeByte(Consumer4B... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4B consumer : before) consumer.acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4B} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4B} performing the operations.
     */
	static Consumer4B sequenceByte(Consumer4B... consumers)
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
    	
    	return (a, b, c, d) -> {for(Consumer4B consumer : consumers) consumer.acceptByte(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptByte} instead.
     */
    @Override
    @Deprecated
    default void accept(Byte a, Byte b, Byte c, Byte d)
    {
    	acceptByte(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4B} performing this operation and the
     * operation after.
     */
    default Consumer4B then(Consumer4<Byte,Byte,Byte,Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4B)
    	{
    		final Consumer4B originalAfter = (Consumer4B)after;
    		
    		return (a, b, c, d) -> {acceptByte(a, b, c, d); originalAfter.acceptByte(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptByte(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4B} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4B then(Consumer4<Byte,Byte,Byte,Byte>... after)
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
    		if(after[0] instanceof Consumer4B)
        	{
        		final Consumer4B originalAfter = (Consumer4B)after[0];
        		
        		return (a, b, c, d) -> {acceptByte(a, b, c, d); originalAfter.acceptByte(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptByte(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
			acceptByte(a, b, c, d);
			
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof Consumer4B)
    				((Consumer4B)consumer).acceptByte(a, b, c, d);
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
     * @return A new {@link Consumer4B} performing the operation before and this
     * operation.
     */
    default Consumer4B before(Consumer4<Byte,Byte,Byte,Byte> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4B)
    	{
    		final Consumer4B originalBefore = (Consumer4B)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptByte(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4B} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4B before(Consumer4<Byte,Byte,Byte,Byte>... before)
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
    		if(before[0] instanceof Consumer4B)
        	{
        		final Consumer4B originalBefore = (Consumer4B)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptByte(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof Consumer4B)
    				((Consumer4B)consumer).acceptByte(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptByte(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4B} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4B} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4B sequence(Consumer4<Byte,Byte,Byte,Byte>... consumers)
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
    		if(consumers[0] instanceof Consumer4B)
    			return (Consumer4B) consumers[0];
    		else
    			return (Consumer4B) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4B)
    				((Consumer4B)consumer).acceptByte(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
