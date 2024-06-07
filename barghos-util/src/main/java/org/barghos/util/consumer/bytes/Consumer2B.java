package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two byte input arguments and returns no
 * result. {@link Consumer2B} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptByte(byte, byte)}.
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
public interface Consumer2B extends Consumer2<Byte,Byte>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptByte(byte a, byte b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2B} performing this operation and the
     * operation after.
     */
    default Consumer2B thenByte(Consumer2B after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptByte(a, b); after.acceptByte(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2B} performing this operation and the
     * operations after.
     */
	default Consumer2B thenByte(Consumer2B... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptByte(a, b); after[0].acceptByte(a, b);};

    	return (a, b) -> {acceptByte(a, b); for(Consumer2B consumer : after) consumer.acceptByte(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2B} performing the operation before and this
     * operation.
     */
    default Consumer2B beforeByte(Consumer2B before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptByte(a, b); acceptByte(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2B} performing the operations before and
     * this operation.
     */
    default Consumer2B beforeByte(Consumer2B... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptByte(a, b); acceptByte(a, b);};
    	
    	return (a, b) -> {for(Consumer2B consumer : before) consumer.acceptByte(a, b); acceptByte(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2B} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2B} performing the operations.
     */
	static Consumer2B sequenceByte(Consumer2B... consumers)
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
    	
    	return (a, b) -> {for(Consumer2B consumer : consumers) consumer.acceptByte(a, b);};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer2
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptByte(byte, byte)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Byte a, Byte b)
    {
    	acceptByte(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2B} performing this operation and the
     * operation after.
     */
    default Consumer2B thenGeneric(Consumer2<Byte,Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2B)
    	{
    		final Consumer2B originalAfter = (Consumer2B)after;
    		
    		return (a, b) -> {acceptByte(a, b); originalAfter.acceptByte(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptByte(a, b); after.acceptGeneric(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2B} performing this operation and the
     * operation after.
     */
    default Consumer2B thenGeneric(java.util.function.BiConsumer<? super Byte,? super Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2B)
    	{
    		final Consumer2B originalAfter = (Consumer2B)after;
    		
    		return (a, b) -> {acceptByte(a, b); originalAfter.acceptByte(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptByte(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2B} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2B thenGeneric(Consumer2<Byte,Byte>... after)
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
    		if(after[0] instanceof Consumer2B)
        	{
        		final Consumer2B originalAfter = (Consumer2B)after[0];
        		
        		return (a, b) -> {acceptByte(a, b); originalAfter.acceptByte(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptByte(a, b); after[0].acceptGeneric(a, b);};
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
			
    		for(Consumer2<Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof Consumer2B)
    				((Consumer2B)consumer).acceptByte(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2B} performing the operation before and this
     * operation.
     */
    default Consumer2B beforeGeneric(Consumer2<Byte,Byte> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2B)
    	{
    		final Consumer2B originalBefore = (Consumer2B)before;
    		
    		return (a, b) -> {originalBefore.acceptByte(a, b); acceptByte(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.acceptGeneric(a, b); acceptByte(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2B} performing the operation before and this
     * operation.
     */
    default Consumer2B beforeGeneric(java.util.function.BiConsumer<? super Byte,? super Byte> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2B)
    	{
    		final Consumer2B originalBefore = (Consumer2B)before;
    		
    		return (a, b) -> {originalBefore.acceptByte(a, b); acceptByte(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptByte(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2B} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2B beforeGeneric(Consumer2<Byte,Byte>... before)
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
    		if(before[0] instanceof Consumer2B)
        	{
        		final Consumer2B originalBefore = (Consumer2B)before[0];
        		
        		return (a, b) -> {originalBefore.acceptByte(a, b); acceptByte(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].acceptGeneric(a, b); acceptByte(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof Consumer2B)
    				((Consumer2B)consumer).acceptByte(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    		
    		acceptByte(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2B} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2B} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2B sequenceGeneric(Consumer2<Byte,Byte>... consumers)
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
    		if(consumers[0] instanceof Consumer2B)
    			return (Consumer2B) consumers[0];
    		else
    			return (Consumer2B) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2B)
    				((Consumer2B)consumer).acceptByte(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
    /*
     * =============================
     * java.util.function.BiConsumer
     * =============================
     */
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptByte(byte, byte)} instead.
     */
    @Override
    @Deprecated
    default void accept(Byte a, Byte b)
    {
    	acceptByte(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.BiConsumer)} instead.
     */
    @Override
    @Deprecated
    default Consumer2B andThen(java.util.function.BiConsumer<? super Byte,? super Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptByte(a, b); after.accept(a, b);};
    }
}
