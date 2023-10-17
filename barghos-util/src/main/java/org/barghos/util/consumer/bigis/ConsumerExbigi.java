package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one {@link BigInteger} input argument and returns no result.
 * Unlike {@link Consumerbigi} this may throw Exceptions.
 * {@link ConsumerExbigi} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBigInt(BigInteger)}.
 * 
 * @see Consumerbigi
 * @see ConsumerExbigi
 * @see Consumer2bigi
 * @see ConsumerEx2bigi
 * @see Consumer3bigi
 * @see ConsumerEx3bigi
 * @see Consumer4bigi
 * @see ConsumerEx4bigi
 */
@FunctionalInterface
public interface ConsumerExbigi extends ConsumerEx<BigInteger>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBigInt(BigInteger a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing this operation and the operation after.
     */
    default ConsumerExbigi andThenBigInt(ConsumerExbigi after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptBigInt(a); after.acceptBigInt(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing this operation and the operations after.
     */
	default ConsumerExbigi andThenBigInt(ConsumerExbigi... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptBigInt(a); after[0].acceptBigInt(a);};

    	return (a) -> {acceptBigInt(a); for(ConsumerExbigi consumer : after) consumer.acceptBigInt(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing this operation and the operations after.
     */
	default ConsumerExbigi andThenBigInt(Iterable<ConsumerExbigi> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptBigInt(a); for(ConsumerExbigi consumer : after) consumer.acceptBigInt(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing the operation before and this operation.
     */
    default ConsumerExbigi beforeThatBigInt(ConsumerExbigi before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptBigInt(a); acceptBigInt(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing the operations before and this operation.
     */
    default ConsumerExbigi beforeThatBigInt(ConsumerExbigi... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptBigInt(a); acceptBigInt(a);};
    	
    	return (a) -> {for(ConsumerExbigi consumer : before) consumer.acceptBigInt(a); acceptBigInt(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing the operations before and this operation.
     */
    default ConsumerExbigi beforeThatBigInt(Iterable<ConsumerExbigi> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExbigi consumer : before) consumer.acceptBigInt(a); acceptBigInt(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExbigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbigi} performing the operations.
     */
	static ConsumerExbigi inSequenceBigInt(ConsumerExbigi... consumers)
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
    	
    	return (a) -> {for(ConsumerExbigi consumer : consumers) consumer.acceptBigInt(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExbigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbigi} performing the operations.
     */
    static ConsumerExbigi inSequenceBigInt(Iterable<ConsumerExbigi> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExbigi consumer : consumers) consumer.acceptBigInt(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigInt} instead.
     */
    @Override
    @Deprecated
    default void accept(BigInteger a) throws Exception
    {
    	acceptBigInt(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing this operation and the operation after.
     */
    default ConsumerExbigi andThen(ConsumerEx<BigInteger> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExbigi)
    	{
    		final ConsumerExbigi originalAfter = (ConsumerExbigi)after;
    		
    		return (a) -> {acceptBigInt(a); originalAfter.acceptBigInt(a);};
    	}
    	else
    	{
    		return (a) -> {acceptBigInt(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExbigi andThen(ConsumerEx<BigInteger>... after)
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
    		if(after[0] instanceof ConsumerExbigi)
        	{
        		final ConsumerExbigi originalAfter = (ConsumerExbigi)after[0];
        		
        		return (a) -> {acceptBigInt(a); originalAfter.acceptBigInt(a);};
        	}
        	else
        	{
        		return (a) -> {acceptBigInt(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptBigInt(a);
			
    		for(ConsumerEx<BigInteger> consumer : after)
    		{
    			if(consumer instanceof ConsumerExbigi)
    				((ConsumerExbigi)consumer).acceptBigInt(a);
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
     * @return A new {@link ConsumerExbigi} performing this operation and the operations after.
     */
	default ConsumerExbigi andThen(Iterable<ConsumerEx<BigInteger>> after)
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
			acceptBigInt(a);
			
    		for(ConsumerEx<BigInteger> consumer : after)
    		{
    			if(consumer instanceof ConsumerExbigi)
    				((ConsumerExbigi)consumer).acceptBigInt(a);
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
     * @return A new {@link ConsumerExbigi} performing the operation before and this operation.
     */
    default ConsumerExbigi beforeThat(ConsumerEx<BigInteger> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExbigi)
    	{
    		final ConsumerExbigi originalBefore = (ConsumerExbigi)before;
    		
    		return (a) -> {originalBefore.acceptBigInt(a); acceptBigInt(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptBigInt(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExbigi beforeThat(ConsumerEx<BigInteger>... before)
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
    		if(before[0] instanceof ConsumerExbigi)
        	{
        		final ConsumerExbigi originalBefore = (ConsumerExbigi)before[0];
        		
        		return (a) -> {originalBefore.acceptBigInt(a); acceptBigInt(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptBigInt(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<BigInteger> consumer : before)
    		{
    			if(consumer instanceof ConsumerExbigi)
    				((ConsumerExbigi)consumer).acceptBigInt(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigi} performing the operations before and this operation.
     */
    default ConsumerExbigi beforeThat(Iterable<ConsumerEx<BigInteger>> before)
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
    		for(ConsumerEx<BigInteger> consumer : before)
    		{
    			if(consumer instanceof ConsumerExbigi)
    				((ConsumerExbigi)consumer).acceptBigInt(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExbigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExbigi inSequence(ConsumerEx<BigInteger>... consumers)
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
    		if(consumers[0] instanceof ConsumerExbigi)
    			return (ConsumerExbigi) consumers[0];
    		else
    			return (ConsumerExbigi) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<BigInteger> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExbigi)
    				((ConsumerExbigi)consumer).acceptBigInt(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExbigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbigi} performing the operations.
     */
    static ConsumerExbigi inSequence(Iterable<ConsumerEx<BigInteger>> consumers)
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
    		for(ConsumerEx<BigInteger> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExbigi)
    				((ConsumerExbigi)consumer).acceptBigInt(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
