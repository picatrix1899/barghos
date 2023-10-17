package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three {@link BigInteger} input arguments and returns no result.
 * {@link Consumer3bigi} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBigInt(BigInteger, BigInteger, BigInteger)}.
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
public interface Consumer3bigi extends Consumer3<BigInteger,BigInteger,BigInteger>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptBigInt(BigInteger a, BigInteger b, BigInteger c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3bigi} performing this operation and the operation after.
     */
    default Consumer3bigi andThenBigInt(Consumer3bigi after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptBigInt(a, b, c); after.acceptBigInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3bigi} performing this operation and the operations after.
     */
	default Consumer3bigi andThenBigInt(Consumer3bigi... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptBigInt(a, b, c); after[0].acceptBigInt(a, b, c);};

    	return (a, b, c) -> {acceptBigInt(a, b, c); for(Consumer3bigi consumer : after) consumer.acceptBigInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3bigi} performing this operation and the operations after.
     */
	default Consumer3bigi andThenBigInt(Iterable<Consumer3bigi> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptBigInt(a, b, c); for(Consumer3bigi consumer : after) consumer.acceptBigInt(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3bigi} performing the operation before and this operation.
     */
    default Consumer3bigi beforeThatBigInt(Consumer3bigi before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptBigInt(a, b, c); acceptBigInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bigi} performing the operations before and this operation.
     */
    default Consumer3bigi beforeThatBigInt(Consumer3bigi... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptBigInt(a, b, c); acceptBigInt(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3bigi consumer : before) consumer.acceptBigInt(a, b, c); acceptBigInt(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bigi} performing the operations before and this operation.
     */
    default Consumer3bigi beforeThatBigInt(Iterable<Consumer3bigi> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3bigi consumer : before) consumer.acceptBigInt(a, b, c); acceptBigInt(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3bigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bigi} performing the operations.
     */
	static Consumer3bigi inSequenceBigInt(Consumer3bigi... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3bigi consumer : consumers) consumer.acceptBigInt(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3bigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bigi} performing the operations.
     */
    static Consumer3bigi inSequenceBigInt(Iterable<Consumer3bigi> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3bigi consumer : consumers) consumer.acceptBigInt(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigInt} instead.
     */
    @Override
    @Deprecated
    default void accept(BigInteger a, BigInteger b, BigInteger c)
    {
    	acceptBigInt(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3bigi} performing this operation and the operation after.
     */
    default Consumer3bigi andThen(Consumer3<BigInteger,BigInteger,BigInteger> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3bigi)
    	{
    		final Consumer3bigi originalAfter = (Consumer3bigi)after;
    		
    		return (a, b, c) -> {acceptBigInt(a, b, c); originalAfter.acceptBigInt(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptBigInt(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3bigi} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3bigi andThen(Consumer3<BigInteger,BigInteger,BigInteger>... after)
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
    		if(after[0] instanceof Consumer3bigi)
        	{
        		final Consumer3bigi originalAfter = (Consumer3bigi)after[0];
        		
        		return (a, b, c) -> {acceptBigInt(a, b, c); originalAfter.acceptBigInt(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptBigInt(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptBigInt(a, b, c);
			
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : after)
    		{
    			if(consumer instanceof Consumer3bigi)
    				((Consumer3bigi)consumer).acceptBigInt(a, b, c);
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
     * @return A new {@link Consumer3bigi} performing this operation and the operations after.
     */
	default Consumer3bigi andThen(Iterable<Consumer3<BigInteger,BigInteger,BigInteger>> after)
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
			acceptBigInt(a, b, c);
			
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : after)
    		{
    			if(consumer instanceof Consumer3bigi)
    				((Consumer3bigi)consumer).acceptBigInt(a, b, c);
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
     * @return A new {@link Consumer3bigi} performing the operation before and this operation.
     */
    default Consumer3bigi beforeThat(Consumer3<BigInteger,BigInteger,BigInteger> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3bigi)
    	{
    		final Consumer3bigi originalBefore = (Consumer3bigi)before;
    		
    		return (a, b, c) -> {originalBefore.acceptBigInt(a, b, c); acceptBigInt(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptBigInt(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bigi} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3bigi beforeThat(Consumer3<BigInteger,BigInteger,BigInteger>... before)
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
    		if(before[0] instanceof Consumer3bigi)
        	{
        		final Consumer3bigi originalBefore = (Consumer3bigi)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptBigInt(a, b, c); acceptBigInt(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptBigInt(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : before)
    		{
    			if(consumer instanceof Consumer3bigi)
    				((Consumer3bigi)consumer).acceptBigInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptBigInt(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bigi} performing the operations before and this operation.
     */
    default Consumer3bigi beforeThat(Iterable<Consumer3<BigInteger,BigInteger,BigInteger>> before)
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
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : before)
    		{
    			if(consumer instanceof Consumer3bigi)
    				((Consumer3bigi)consumer).acceptBigInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptBigInt(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3bigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3bigi inSequence(Consumer3<BigInteger,BigInteger,BigInteger>... consumers)
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
    		if(consumers[0] instanceof Consumer3bigi)
    			return (Consumer3bigi) consumers[0];
    		else
    			return (Consumer3bigi) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3bigi)
    				((Consumer3bigi)consumer).acceptBigInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3bigi} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bigi} performing the operations.
     */
    static Consumer3bigi inSequence(Iterable<Consumer3<BigInteger,BigInteger,BigInteger>> consumers)
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
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3bigi)
    				((Consumer3bigi)consumer).acceptBigInt(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
