package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one byte input argument and returns no result.
 * Unlike {@link Consumerb} this may throw Exceptions.
 * {@link ConsumerExb} is expected to operate via side-effects.
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
public interface ConsumerExb extends ConsumerEx<Byte>
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
     * @return A new {@link ConsumerExb} performing this operation and the operation after.
     */
    default ConsumerExb andThenByte(ConsumerExb after)
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
     * @return A new {@link ConsumerExb} performing this operation and the operations after.
     */
	default ConsumerExb andThenByte(ConsumerExb... after)
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

    	return (a) -> {acceptByte(a); for(ConsumerExb consumer : after) consumer.acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExb} performing this operation and the operations after.
     */
	default ConsumerExb andThenByte(Iterable<ConsumerExb> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptByte(a); for(ConsumerExb consumer : after) consumer.acceptByte(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExb} performing the operation before and this operation.
     */
    default ConsumerExb beforeThatByte(ConsumerExb before)
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
     * @return A new {@link ConsumerExb} performing the operations before and this operation.
     */
    default ConsumerExb beforeThatByte(ConsumerExb... before)
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
    	
    	return (a) -> {for(ConsumerExb consumer : before) consumer.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExb} performing the operations before and this operation.
     */
    default ConsumerExb beforeThatByte(Iterable<ConsumerExb> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExb consumer : before) consumer.acceptByte(a); acceptByte(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExb} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExb} performing the operations.
     */
	static ConsumerExb inSequenceByte(ConsumerExb... consumers)
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
    	
    	return (a) -> {for(ConsumerExb consumer : consumers) consumer.acceptByte(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExb} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExb} performing the operations.
     */
    static ConsumerExb inSequenceByte(Iterable<ConsumerExb> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExb consumer : consumers) consumer.acceptByte(a);};
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
     * @return A new {@link ConsumerExb} performing this operation and the operation after.
     */
    default ConsumerExb andThen(ConsumerEx<Byte> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExb)
    	{
    		final ConsumerExb originalAfter = (ConsumerExb)after;
    		
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
     * @return A new {@link ConsumerExb} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExb andThen(ConsumerEx<Byte>... after)
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
    		if(after[0] instanceof ConsumerExb)
        	{
        		final ConsumerExb originalAfter = (ConsumerExb)after[0];
        		
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
			
    		for(ConsumerEx<Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerExb)
    				((ConsumerExb)consumer).acceptByte(a);
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
     * @return A new {@link ConsumerExb} performing this operation and the operations after.
     */
	default ConsumerExb andThen(Iterable<ConsumerEx<Byte>> after)
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
			
    		for(ConsumerEx<Byte> consumer : after)
    		{
    			if(consumer instanceof ConsumerExb)
    				((ConsumerExb)consumer).acceptByte(a);
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
     * @return A new {@link ConsumerExb} performing the operation before and this operation.
     */
    default ConsumerExb beforeThat(ConsumerEx<Byte> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExb)
    	{
    		final ConsumerExb originalBefore = (ConsumerExb)before;
    		
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
     * @return A new {@link ConsumerExb} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExb beforeThat(ConsumerEx<Byte>... before)
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
    		if(before[0] instanceof ConsumerExb)
        	{
        		final ConsumerExb originalBefore = (ConsumerExb)before[0];
        		
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
    		for(ConsumerEx<Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerExb)
    				((ConsumerExb)consumer).acceptByte(a);
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
     * @return A new {@link ConsumerExb} performing the operations before and this operation.
     */
    default ConsumerExb beforeThat(Iterable<ConsumerEx<Byte>> before)
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
    		for(ConsumerEx<Byte> consumer : before)
    		{
    			if(consumer instanceof ConsumerExb)
    				((ConsumerExb)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptByte(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExb} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExb} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExb inSequence(ConsumerEx<Byte>... consumers)
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
    		if(consumers[0] instanceof ConsumerExb)
    			return (ConsumerExb) consumers[0];
    		else
    			return (ConsumerExb) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExb)
    				((ConsumerExb)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExb} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExb} performing the operations.
     */
    static ConsumerExb inSequence(Iterable<ConsumerEx<Byte>> consumers)
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
    		for(ConsumerEx<Byte> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExb)
    				((ConsumerExb)consumer).acceptByte(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
