package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one byte input argument and returns no
 * result. {@link ConsumerB} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptByte(byte)}.
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
public interface ConsumerB extends Consumer<Byte>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptByte(byte a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerB} performing this operation and the
     * operation after.
     */
    default ConsumerB thenByte(ConsumerB after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptByte(a); after.acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerB} performing this operation and the
     * operations after.
     */
	default ConsumerB thenByte(ConsumerB... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptByte(a); after[0].acceptByte(a);};

    	return (a) -> {acceptByte(a); for(ConsumerB consumer : after) consumer.acceptByte(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerB} performing the operation before and this
     * operation.
     */
    default ConsumerB beforeByte(ConsumerB before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerB} performing the operations before and this
     * operation.
     */
    default ConsumerB beforeByte(ConsumerB... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptByte(a); acceptByte(a);};
    	
    	return (a) -> {for(ConsumerB consumer : before) consumer.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Composes a new {@link ConsumerB} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerB} performing the operations.
     */
	static ConsumerB sequenceByte(ConsumerB... consumers)
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
    	
    	return (a) -> {for(ConsumerB consumer : consumers) consumer.acceptByte(a);};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptByte(byte)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Byte a)
    {
    	acceptByte(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerB} performing this operation and the
     * operation after.
     */
    default ConsumerB thenGeneric(Consumer<Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerB)
    	{
    		final ConsumerB originalAfter = (ConsumerB)after;
    		
    		return (a) -> {acceptByte(a); originalAfter.acceptByte(a);};
    	}
    	else
    	{
    		return (a) -> {acceptByte(a); after.acceptGeneric(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerB} performing this operation and the
     * operation after.
     */
    default ConsumerB thenGeneric(java.util.function.Consumer<? super Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerB)
    	{
    		final ConsumerB originalAfter = (ConsumerB)after;
    		
    		return (a) -> {acceptByte(a); originalAfter.acceptByte(a);};
    	}
    	else
    	{
    		return (a) -> {acceptByte(a); after.accept(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerB} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerB thenGeneric(Consumer<Byte>... after)
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
    		if(after[0] instanceof ConsumerB)
        	{
        		final ConsumerB originalAfter = (ConsumerB)after[0];
        		
        		return (a) -> {acceptByte(a); originalAfter.acceptByte(a);};
        	}
        	else
        	{
        		return (a) -> {acceptByte(a); after[0].acceptGeneric(a);};
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
			
    		for(Consumer<Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerB)
    				((ConsumerB)consumer).acceptByte(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerB} performing the operation before and this
     * operation.
     */
    default ConsumerB beforeGeneric(Consumer<Byte> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerB)
    	{
    		final ConsumerB originalBefore = (ConsumerB)before;
    		
    		return (a) -> {originalBefore.acceptByte(a); acceptByte(a);};
    	}
    	else
    	{
    		return (a) -> {before.acceptGeneric(a); acceptByte(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerB} performing the operation before and this
     * operation.
     */
    default ConsumerB beforeGeneric(java.util.function.Consumer<? super Byte> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerB)
    	{
    		final ConsumerB originalBefore = (ConsumerB)before;
    		
    		return (a) -> {originalBefore.acceptByte(a); acceptByte(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptByte(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerB} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerB beforeGeneric(Consumer<Byte>... before)
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
    		if(before[0] instanceof ConsumerB)
        	{
        		final ConsumerB originalBefore = (ConsumerB)before[0];
        		
        		return (a) -> {originalBefore.acceptByte(a); acceptByte(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].acceptGeneric(a); acceptByte(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerB)
    				((ConsumerB)consumer).acceptByte(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    		
    		acceptByte(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerB} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerB} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerB sequenceGeneric(Consumer<Byte>... consumers)
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
    		if(consumers[0] instanceof ConsumerB)
    			return (ConsumerB) consumers[0];
    		else
    			return (ConsumerB) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerB)
    				((ConsumerB)consumer).acceptByte(a);
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
     * @deprecated Use {@link #acceptByte(byte)} instead.
     */
    @Override
    @Deprecated
    default void accept(Byte a)
    {
    	acceptByte(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerB andThen(java.util.function.Consumer<? super Byte> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptByte(a); after.accept(a);};
    }
}
