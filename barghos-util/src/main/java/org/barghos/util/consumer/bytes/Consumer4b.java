package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four byte input arguments and returns no result.
 * {@link Consumer4b} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptByte(byte, byte, byte, byte)}.
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
public interface Consumer4b extends Consumer4<Byte,Byte,Byte,Byte>
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
     * @return A new {@link Consumer4b} performing this operation and the operation after.
     */
    default Consumer4b andThenByte(Consumer4b after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptByte(a, b, c, d); after.acceptByte(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4b} performing this operation and the operations after.
     */
	default Consumer4b andThenByte(Consumer4b... after)
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
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptByte(a, b, c, d); after[0].acceptByte(a, b, c, d);};

    	return (a, b, c, d) -> {acceptByte(a, b, c, d); for(Consumer4b consumer : after) consumer.acceptByte(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4b} performing this operation and the operations after.
     */
	default Consumer4b andThenByte(Iterable<Consumer4b> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptByte(a, b, c, d); for(Consumer4b consumer : after) consumer.acceptByte(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4b} performing the operation before and this operation.
     */
    default Consumer4b beforeThatByte(Consumer4b before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4b} performing the operations before and this operation.
     */
    default Consumer4b beforeThatByte(Consumer4b... before)
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
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(Consumer4b consumer : before) consumer.acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4b} performing the operations before and this operation.
     */
    default Consumer4b beforeThatByte(Iterable<Consumer4b> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(Consumer4b consumer : before) consumer.acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4b} performing the operations.
     */
	static Consumer4b inSequenceByte(Consumer4b... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c, d) -> {for(Consumer4b consumer : consumers) consumer.acceptByte(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link Consumer4b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4b} performing the operations.
     */
    static Consumer4b inSequenceByte(Iterable<Consumer4b> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(Consumer4b consumer : consumers) consumer.acceptByte(a, b, c, d);};
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
     * @return A new {@link Consumer4b} performing this operation and the operation after.
     */
    default Consumer4b andThen(Consumer4<Byte,Byte,Byte,Byte> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer4b)
    	{
    		final Consumer4b originalAfter = (Consumer4b)after;
    		
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
     * @return A new {@link Consumer4b} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer4b andThen(Consumer4<Byte,Byte,Byte,Byte>... after)
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
    		if(after[0] instanceof Consumer4b)
        	{
        		final Consumer4b originalAfter = (Consumer4b)after[0];
        		
        		return (a, b, c, d) -> {acceptByte(a, b, c, d); originalAfter.acceptByte(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptByte(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
			acceptByte(a, b, c, d);
			
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof Consumer4b)
    				((Consumer4b)consumer).acceptByte(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4b} performing this operation and the operations after.
     */
	default Consumer4b andThen(Iterable<Consumer4<Byte,Byte,Byte,Byte>> after)
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
		return (a, b, c, d) -> {
			acceptByte(a, b, c, d);
			
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof Consumer4b)
    				((Consumer4b)consumer).acceptByte(a, b, c, d);
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
     * @return A new {@link Consumer4b} performing the operation before and this operation.
     */
    default Consumer4b beforeThat(Consumer4<Byte,Byte,Byte,Byte> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer4b)
    	{
    		final Consumer4b originalBefore = (Consumer4b)before;
    		
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
     * @return A new {@link Consumer4b} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer4b beforeThat(Consumer4<Byte,Byte,Byte,Byte>... before)
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
    		if(before[0] instanceof Consumer4b)
        	{
        		final Consumer4b originalBefore = (Consumer4b)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptByte(a, b, c, d); acceptByte(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptByte(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof Consumer4b)
    				((Consumer4b)consumer).acceptByte(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptByte(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4b} performing the operations before and this operation.
     */
    default Consumer4b beforeThat(Iterable<Consumer4<Byte,Byte,Byte,Byte>> before)
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
    	return (a, b, c, d) -> {
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof Consumer4b)
    				((Consumer4b)consumer).acceptByte(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptByte(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4b} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4b inSequence(Consumer4<Byte,Byte,Byte,Byte>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c, d) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer4b)
    			return (Consumer4b) consumers[0];
    		else
    			return (Consumer4b) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4b)
    				((Consumer4b)consumer).acceptByte(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer4b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4b} performing the operations.
     */
    static Consumer4b inSequence(Iterable<Consumer4<Byte,Byte,Byte,Byte>> consumers)
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
    	return (a, b, c, d) -> {
    		for(Consumer4<Byte,Byte,Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof Consumer4b)
    				((Consumer4b)consumer).acceptByte(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
