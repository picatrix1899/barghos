package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three byte input argument and returns no result.
 * Unlike {@link Consumer3b} this may throw Exceptions.
 * {@link ConsumerEx3b} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptByte(byte, byte, byte)}.
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
public interface ConsumerEx3b extends ConsumerEx3<Byte,Byte,Byte>
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
    void acceptByte(byte a, byte b, byte c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing this operation and the operation after.
     */
    default ConsumerEx3b andThenByte(ConsumerEx3b after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptByte(a, b, c); after.acceptByte(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing this operation and the operations after.
     */
	default ConsumerEx3b andThenByte(ConsumerEx3b... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptByte(a, b, c); after[0].acceptByte(a, b, c);};

    	return (a, b, c) -> {acceptByte(a, b, c); for(ConsumerEx3b consumer : after) consumer.acceptByte(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing this operation and the operations after.
     */
	default ConsumerEx3b andThenByte(Iterable<ConsumerEx3b> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptByte(a, b, c); for(ConsumerEx3b consumer : after) consumer.acceptByte(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing the operation before and this operation.
     */
    default ConsumerEx3b beforeThatByte(ConsumerEx3b before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptByte(a, b, c); acceptByte(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing the operations before and this operation.
     */
    default ConsumerEx3b beforeThatByte(ConsumerEx3b... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptByte(a, b, c); acceptByte(a, b, c);};
    	
    	return (a, b, c) -> {for(ConsumerEx3b consumer : before) consumer.acceptByte(a, b, c); acceptByte(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing the operations before and this operation.
     */
    default ConsumerEx3b beforeThatByte(Iterable<ConsumerEx3b> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(ConsumerEx3b consumer : before) consumer.acceptByte(a, b, c); acceptByte(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3b} performing the operations.
     */
	static ConsumerEx3b inSequenceByte(ConsumerEx3b... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b, c) -> {for(ConsumerEx3b consumer : consumers) consumer.acceptByte(a, b, c);};
    }
    
    /**
     * Composes a new {@link ConsumerEx3b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3b} performing the operations.
     */
    static ConsumerEx3b inSequenceByte(Iterable<ConsumerEx3b> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(ConsumerEx3b consumer : consumers) consumer.acceptByte(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptByte} instead.
     */
    @Override
    @Deprecated
    default void accept(Byte a, Byte b, Byte c) throws Exception
    {
    	acceptByte(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing this operation and the operation after.
     */
    default ConsumerEx3b andThen(ConsumerEx3<Byte,Byte,Byte> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx3b)
    	{
    		final ConsumerEx3b originalAfter = (ConsumerEx3b)after;
    		
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
     * @return A new {@link ConsumerEx3b} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx3b andThen(ConsumerEx3<Byte,Byte,Byte>... after)
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
    		if(after[0] instanceof ConsumerEx3b)
        	{
        		final ConsumerEx3b originalAfter = (ConsumerEx3b)after[0];
        		
        		return (a, b, c) -> {acceptByte(a, b, c); originalAfter.acceptByte(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptByte(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptByte(a, b, c);
			
    		for(ConsumerEx3<Byte,Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3b)
    				((ConsumerEx3b)consumer).acceptByte(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing this operation and the operations after.
     */
	default ConsumerEx3b andThen(Iterable<ConsumerEx3<Byte,Byte,Byte>> after)
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
		return (a, b, c) -> {
			acceptByte(a, b, c);
			
    		for(ConsumerEx3<Byte,Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx3b)
    				((ConsumerEx3b)consumer).acceptByte(a, b, c);
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
     * @return A new {@link ConsumerEx3b} performing the operation before and this operation.
     */
    default ConsumerEx3b beforeThat(ConsumerEx3<Byte,Byte,Byte> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx3b)
    	{
    		final ConsumerEx3b originalBefore = (ConsumerEx3b)before;
    		
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
     * @return A new {@link ConsumerEx3b} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx3b beforeThat(ConsumerEx3<Byte,Byte,Byte>... before)
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
    		if(before[0] instanceof ConsumerEx3b)
        	{
        		final ConsumerEx3b originalBefore = (ConsumerEx3b)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptByte(a, b, c); acceptByte(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptByte(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Byte,Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3b)
    				((ConsumerEx3b)consumer).acceptByte(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptByte(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3b} performing the operations before and this operation.
     */
    default ConsumerEx3b beforeThat(Iterable<ConsumerEx3<Byte,Byte,Byte>> before)
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
    	return (a, b, c) -> {
    		for(ConsumerEx3<Byte,Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx3b)
    				((ConsumerEx3b)consumer).acceptByte(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptByte(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3b} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3b inSequence(ConsumerEx3<Byte,Byte,Byte>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b, c) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerEx3b)
    			return (ConsumerEx3b) consumers[0];
    		else
    			return (ConsumerEx3b) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(ConsumerEx3<Byte,Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3b)
    				((ConsumerEx3b)consumer).acceptByte(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3b} performing the operations.
     */
    static ConsumerEx3b inSequence(Iterable<ConsumerEx3<Byte,Byte,Byte>> consumers)
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
    	return (a, b, c) -> {
    		for(ConsumerEx3<Byte,Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx3b)
    				((ConsumerEx3b)consumer).acceptByte(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
