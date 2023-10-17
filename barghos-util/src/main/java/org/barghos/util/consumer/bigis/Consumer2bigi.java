package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two {@link BigInteger} input arguments and returns no result.
 * {@link Consumer2bigi} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBigInt(BigInteger, BigInteger)}.
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
public interface Consumer2bigi extends Consumer2<BigInteger,BigInteger>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptBigInt(BigInteger a, BigInteger b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2bigi} performing this operation and the operation after.
     */
    default Consumer2bigi andThenBigInt(Consumer2bigi after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptBigInt(a, b); after.acceptBigInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bigi} performing this operation and the operations after.
     */
	default Consumer2bigi andThenBigInt(Consumer2bigi... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptBigInt(a, b); after[0].acceptBigInt(a, b);};

    	return (a, b) -> {acceptBigInt(a, b); for(Consumer2bigi consumer : after) consumer.acceptBigInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bigi} performing this operation and the operations after.
     */
	default Consumer2bigi andThenBigInt(Iterable<Consumer2bigi> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptBigInt(a, b); for(Consumer2bigi consumer : after) consumer.acceptBigInt(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2bigi} performing the operation before and this operation.
     */
    default Consumer2bigi beforeThatBigInt(Consumer2bigi before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptBigInt(a, b); acceptBigInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bigi} performing the operations before and this operation.
     */
    default Consumer2bigi beforeThatBigInt(Consumer2bigi... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptBigInt(a, b); acceptBigInt(a, b);};
    	
    	return (a, b) -> {for(Consumer2bigi consumer : before) consumer.acceptBigInt(a, b); acceptBigInt(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bigi} performing the operations before and this operation.
     */
    default Consumer2bigi beforeThatBigInt(Iterable<Consumer2bigi> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2bigi consumer : before) consumer.acceptBigInt(a, b); acceptBigInt(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2bigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bigi} performing the operations.
     */
	static Consumer2bigi inSequenceBigInt(Consumer2bigi... consumers)
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
    	
    	return (a, b) -> {for(Consumer2bigi consumer : consumers) consumer.acceptBigInt(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2bigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bigi} performing the operations.
     */
    static Consumer2bigi inSequenceBigInt(Iterable<Consumer2bigi> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2bigi consumer : consumers) consumer.acceptBigInt(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigInt} instead.
     */
    @Override
    @Deprecated
    default void accept(BigInteger a, BigInteger b)
    {
    	acceptBigInt(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2bigi} performing this operation and the operation after.
     */
    default Consumer2bigi andThen(Consumer2<BigInteger,BigInteger> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2bigi)
    	{
    		final Consumer2bigi originalAfter = (Consumer2bigi)after;
    		
    		return (a, b) -> {acceptBigInt(a, b); originalAfter.acceptBigInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptBigInt(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bigi} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2bigi andThen(Consumer2<BigInteger,BigInteger>... after)
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
    		if(after[0] instanceof Consumer2bigi)
        	{
        		final Consumer2bigi originalAfter = (Consumer2bigi)after[0];
        		
        		return (a, b) -> {acceptBigInt(a, b); originalAfter.acceptBigInt(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptBigInt(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptBigInt(a, b);
			
    		for(Consumer2<BigInteger,BigInteger> consumer : after)
    		{
    			if(consumer instanceof Consumer2bigi)
    				((Consumer2bigi)consumer).acceptBigInt(a, b);
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
     * @return A new {@link Consumer2bigi} performing this operation and the operations after.
     */
	default Consumer2bigi andThen(Iterable<Consumer2<BigInteger,BigInteger>> after)
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
			acceptBigInt(a, b);
			
    		for(Consumer2<BigInteger,BigInteger> consumer : after)
    		{
    			if(consumer instanceof Consumer2bigi)
    				((Consumer2bigi)consumer).acceptBigInt(a, b);
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
     * @return A new {@link Consumer2bigi} performing the operation before and this operation.
     */
    default Consumer2bigi beforeThat(Consumer2<BigInteger,BigInteger> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2bigi)
    	{
    		final Consumer2bigi originalBefore = (Consumer2bigi)before;
    		
    		return (a, b) -> {originalBefore.acceptBigInt(a, b); acceptBigInt(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptBigInt(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bigi} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2bigi beforeThat(Consumer2<BigInteger,BigInteger>... before)
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
    		if(before[0] instanceof Consumer2bigi)
        	{
        		final Consumer2bigi originalBefore = (Consumer2bigi)before[0];
        		
        		return (a, b) -> {originalBefore.acceptBigInt(a, b); acceptBigInt(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptBigInt(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<BigInteger,BigInteger> consumer : before)
    		{
    			if(consumer instanceof Consumer2bigi)
    				((Consumer2bigi)consumer).acceptBigInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bigi} performing the operations before and this operation.
     */
    default Consumer2bigi beforeThat(Iterable<Consumer2<BigInteger,BigInteger>> before)
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
    		for(Consumer2<BigInteger,BigInteger> consumer : before)
    		{
    			if(consumer instanceof Consumer2bigi)
    				((Consumer2bigi)consumer).acceptBigInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2bigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2bigi inSequence(Consumer2<BigInteger,BigInteger>... consumers)
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
    		if(consumers[0] instanceof Consumer2bigi)
    			return (Consumer2bigi) consumers[0];
    		else
    			return (Consumer2bigi) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<BigInteger,BigInteger> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2bigi)
    				((Consumer2bigi)consumer).acceptBigInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2bigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bigi} performing the operations.
     */
    static Consumer2bigi inSequence(Iterable<Consumer2<BigInteger,BigInteger>> consumers)
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
    		for(Consumer2<BigInteger,BigInteger> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2bigi)
    				((Consumer2bigi)consumer).acceptBigInt(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2bigi andThen(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptBigInt(a, b); after.accept(a, b);};
    }
}
