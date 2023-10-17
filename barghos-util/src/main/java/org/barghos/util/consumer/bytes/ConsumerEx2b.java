package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two byte input argument and returns no result.
 * Unlike {@link Consumer2b} this may throw Exceptions.
 * {@link ConsumerEx2b} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptByte(byte, byte)}.
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
public interface ConsumerEx2b extends ConsumerEx2<Byte,Byte>
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
     * @return A new {@link ConsumerEx2b} performing this operation and the operation after.
     */
    default ConsumerEx2b andThenByte(ConsumerEx2b after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptByte(a, b); after.acceptByte(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2b} performing this operation and the operations after.
     */
	default ConsumerEx2b andThenByte(ConsumerEx2b... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptByte(a, b); after[0].acceptByte(a, b);};

    	return (a, b) -> {acceptByte(a, b); for(ConsumerEx2b consumer : after) consumer.acceptByte(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2b} performing this operation and the operations after.
     */
	default ConsumerEx2b andThenByte(Iterable<ConsumerEx2b> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptByte(a, b); for(ConsumerEx2b consumer : after) consumer.acceptByte(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2b} performing the operation before and this operation.
     */
    default ConsumerEx2b beforeThatByte(ConsumerEx2b before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptByte(a, b); acceptByte(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2b} performing the operations before and this operation.
     */
    default ConsumerEx2b beforeThatByte(ConsumerEx2b... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptByte(a, b); acceptByte(a, b);};
    	
    	return (a, b) -> {for(ConsumerEx2b consumer : before) consumer.acceptByte(a, b); acceptByte(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2b} performing the operations before and this operation.
     */
    default ConsumerEx2b beforeThatByte(Iterable<ConsumerEx2b> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2b consumer : before) consumer.acceptByte(a, b); acceptByte(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2b} performing the operations.
     */
	static ConsumerEx2b inSequenceByte(ConsumerEx2b... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(ConsumerEx2b consumer : consumers) consumer.acceptByte(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2b} performing the operations.
     */
    static ConsumerEx2b inSequenceByte(Iterable<ConsumerEx2b> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2b consumer : consumers) consumer.acceptByte(a, b);};
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
     * @return A new {@link ConsumerEx2b} performing this operation and the operation after.
     */
    default ConsumerEx2b andThen(ConsumerEx2<Byte,Byte> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2b)
    	{
    		final ConsumerEx2b originalAfter = (ConsumerEx2b)after;
    		
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
     * @return A new {@link ConsumerEx2b} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2b andThen(ConsumerEx2<Byte,Byte>... after)
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
    		if(after[0] instanceof ConsumerEx2b)
        	{
        		final ConsumerEx2b originalAfter = (ConsumerEx2b)after[0];
        		
        		return (a, b) -> {acceptByte(a, b); originalAfter.acceptByte(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptByte(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptByte(a, b);
			
    		for(ConsumerEx2<Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2b)
    				((ConsumerEx2b)consumer).acceptByte(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2b} performing this operation and the operations after.
     */
	default ConsumerEx2b andThen(Iterable<ConsumerEx2<Byte,Byte>> after)
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
		return (a, b) -> {
			acceptByte(a, b);
			
    		for(ConsumerEx2<Byte,Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2b)
    				((ConsumerEx2b)consumer).acceptByte(a, b);
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
     * @return A new {@link ConsumerEx2b} performing the operation before and this operation.
     */
    default ConsumerEx2b beforeThat(ConsumerEx2<Byte,Byte> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2b)
    	{
    		final ConsumerEx2b originalBefore = (ConsumerEx2b)before;
    		
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
     * @return A new {@link ConsumerEx2b} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2b beforeThat(ConsumerEx2<Byte,Byte>... before)
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
    		if(before[0] instanceof ConsumerEx2b)
        	{
        		final ConsumerEx2b originalBefore = (ConsumerEx2b)before[0];
        		
        		return (a, b) -> {originalBefore.acceptByte(a, b); acceptByte(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptByte(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2b)
    				((ConsumerEx2b)consumer).acceptByte(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptByte(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2b} performing the operations before and this operation.
     */
    default ConsumerEx2b beforeThat(Iterable<ConsumerEx2<Byte,Byte>> before)
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
    	return (a, b) -> {
    		for(ConsumerEx2<Byte,Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2b)
    				((ConsumerEx2b)consumer).acceptByte(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptByte(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2b} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2b inSequence(ConsumerEx2<Byte,Byte>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof ConsumerEx2b)
    			return (ConsumerEx2b) consumers[0];
    		else
    			return (ConsumerEx2b) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2b)
    				((ConsumerEx2b)consumer).acceptByte(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2b} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2b} performing the operations.
     */
    static ConsumerEx2b inSequence(Iterable<ConsumerEx2<Byte,Byte>> consumers)
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
    	return (a, b) -> {
    		for(ConsumerEx2<Byte,Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2b)
    				((ConsumerEx2b)consumer).acceptByte(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
