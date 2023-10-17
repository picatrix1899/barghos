package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one byte input argument and returns no result.
 * {@link Consumerb} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptByte(byte)}.
 * 
 * @see Consumerb
 * @see ConsumerExb
 * @see Consumer2b
 * @see ConsumerEx2b
 * @see Consumer3b
 * @see ConsumerEx3b
 * @see Consumer4b
 * @see ConsumerEx4b
 */
@FunctionalInterface
public interface Consumerb extends Consumer<Byte>
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
     * @return A new {@link Consumerb} performing this operation and the operation after.
     */
    default Consumerb andThenByte(Consumerb after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptByte(a); after.acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerb} performing this operation and the operations after.
     */
	default Consumerb andThenByte(Consumerb... after)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptByte(a); after[0].acceptByte(a);};

    	return (a) -> {acceptByte(a); for(Consumerb consumer : after) consumer.acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerb} performing this operation and the operations after.
     */
	default Consumerb andThenByte(Iterable<Consumerb> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptByte(a); for(Consumerb consumer : after) consumer.acceptByte(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumerb} performing the operation before and this operation.
     */
    default Consumerb beforeThatByte(Consumerb before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerb} performing the operations before and this operation.
     */
    default Consumerb beforeThatByte(Consumerb... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptByte(a); acceptByte(a);};
    	
    	return (a) -> {for(Consumerb consumer : before) consumer.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerb} performing the operations before and this operation.
     */
    default Consumerb beforeThatByte(Iterable<Consumerb> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(Consumerb consumer : before) consumer.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Composes a new {@link Consumerb} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerb} performing the operations.
     */
	static Consumerb inSequenceByte(Consumerb... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(Consumerb consumer : consumers) consumer.acceptByte(a);};
    }
    
    /**
     * Composes a new {@link Consumerb} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerb} performing the operations.
     */
    static Consumerb inSequenceByte(Iterable<Consumerb> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(Consumerb consumer : consumers) consumer.acceptByte(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptByte} instead.
     */
    @Override
    @Deprecated
    default void accept(Byte a)
    {
    	acceptByte(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerb} performing this operation and the operation after.
     */
    default Consumerb andThen(Consumer<Byte> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumerb)
    	{
    		final Consumerb originalAfter = (Consumerb)after;
    		
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
     * @return A new {@link Consumerb} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumerb andThen(Consumer<Byte>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof Consumerb)
        	{
        		final Consumerb originalAfter = (Consumerb)after[0];
        		
        		return (a) -> {acceptByte(a); originalAfter.acceptByte(a);};
        	}
        	else
        	{
        		return (a) -> {acceptByte(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptByte(a);
			
    		for(Consumer<Byte> consumer : after)
    		{
    			if(consumer instanceof Consumerb)
    				((Consumerb)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerb} performing this operation and the operations after.
     */
	default Consumerb andThen(Iterable<Consumer<Byte>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
		/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
		return (a) -> {
			acceptByte(a);
			
    		for(Consumer<Byte> consumer : after)
    		{
    			if(consumer instanceof Consumerb)
    				((Consumerb)consumer).acceptByte(a);
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
     * @return A new {@link Consumerb} performing the operation before and this operation.
     */
    default Consumerb beforeThat(Consumer<Byte> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumerb)
    	{
    		final Consumerb originalBefore = (Consumerb)before;
    		
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
     * @return A new {@link Consumerb} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumerb beforeThat(Consumer<Byte>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
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
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof Consumerb)
        	{
        		final Consumerb originalBefore = (Consumerb)before[0];
        		
        		return (a) -> {originalBefore.acceptByte(a); acceptByte(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptByte(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Byte> consumer : before)
    		{
    			if(consumer instanceof Consumerb)
    				((Consumerb)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptByte(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerb} performing the operations before and this operation.
     */
    default Consumerb beforeThat(Iterable<Consumer<Byte>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Byte> consumer : before)
    		{
    			if(consumer instanceof Consumerb)
    				((Consumerb)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptByte(a);
    	};
    }
    
    /**
     * Composes a new {@link Consumerb} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerb} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumerb inSequence(Consumer<Byte>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumerb)
    			return (Consumerb) consumers[0];
    		else
    			return (Consumerb) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Byte> consumer : consumers)
    		{
    			if(consumer instanceof Consumerb)
    				((Consumerb)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumerb} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerb} performing the operations.
     */
    static Consumerb inSequence(Iterable<Consumer<Byte>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<Byte> consumer : consumers)
    		{
    			if(consumer instanceof Consumerb)
    				((Consumerb)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumerb andThen(java.util.function.Consumer<? super Byte> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptByte(a); after.accept(a);};
    }
}
