package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three {@link BigDecimal} input arguments and returns no result.
 * {@link Consumer3bigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBigDec(BigDecimal, BigDecimal, BigDecimal)}.
 * 
 * @see Consumerbigd
 * @see ConsumerExbigd
 * @see Consumer2bigd
 * @see ConsumerEx2bigd
 * @see Consumer3bigd
 * @see ConsumerEx3bigd
 * @see Consumer4bigd
 * @see ConsumerEx4bigd
 */
@FunctionalInterface
public interface Consumer3bigd extends Consumer3<BigDecimal,BigDecimal,BigDecimal>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptBigDec(BigDecimal a, BigDecimal b, BigDecimal c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3bigd} performing this operation and the operation after.
     */
    default Consumer3bigd andThenBigDec(Consumer3bigd after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c) -> {acceptBigDec(a, b, c); after.acceptBigDec(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3bigd} performing this operation and the operations after.
     */
	default Consumer3bigd andThenBigDec(Consumer3bigd... after)
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
    	
    	if(after.length == 1) return (a, b, c) -> {acceptBigDec(a, b, c); after[0].acceptBigDec(a, b, c);};

    	return (a, b, c) -> {acceptBigDec(a, b, c); for(Consumer3bigd consumer : after) consumer.acceptBigDec(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3bigd} performing this operation and the operations after.
     */
	default Consumer3bigd andThenBigDec(Iterable<Consumer3bigd> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c) -> {acceptBigDec(a, b, c); for(Consumer3bigd consumer : after) consumer.acceptBigDec(a, b, c);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3bigd} performing the operation before and this operation.
     */
    default Consumer3bigd beforeThatBigDec(Consumer3bigd before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {before.acceptBigDec(a, b, c); acceptBigDec(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bigd} performing the operations before and this operation.
     */
    default Consumer3bigd beforeThatBigDec(Consumer3bigd... before)
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
    	
    	if(before.length == 1) return (a, b, c) -> {before[0].acceptBigDec(a, b, c); acceptBigDec(a, b, c);};
    	
    	return (a, b, c) -> {for(Consumer3bigd consumer : before) consumer.acceptBigDec(a, b, c); acceptBigDec(a, b, c);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bigd} performing the operations before and this operation.
     */
    default Consumer3bigd beforeThatBigDec(Iterable<Consumer3bigd> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c) -> {for(Consumer3bigd consumer : before) consumer.acceptBigDec(a, b, c); acceptBigDec(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bigd} performing the operations.
     */
	static Consumer3bigd inSequenceBigDec(Consumer3bigd... consumers)
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
    	
    	return (a, b, c) -> {for(Consumer3bigd consumer : consumers) consumer.acceptBigDec(a, b, c);};
    }
    
    /**
     * Composes a new {@link Consumer3bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bigd} performing the operations.
     */
    static Consumer3bigd inSequenceBigDec(Iterable<Consumer3bigd> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c) -> {for(Consumer3bigd consumer : consumers) consumer.acceptBigDec(a, b, c);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigDec} instead.
     */
    @Override
    @Deprecated
    default void accept(BigDecimal a, BigDecimal b, BigDecimal c)
    {
    	acceptBigDec(a, b, c);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3bigd} performing this operation and the operation after.
     */
    default Consumer3bigd andThen(Consumer3<BigDecimal,BigDecimal,BigDecimal> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer3bigd)
    	{
    		final Consumer3bigd originalAfter = (Consumer3bigd)after;
    		
    		return (a, b, c) -> {acceptBigDec(a, b, c); originalAfter.acceptBigDec(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {acceptBigDec(a, b, c); after.accept(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3bigd} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer3bigd andThen(Consumer3<BigDecimal,BigDecimal,BigDecimal>... after)
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
    		if(after[0] instanceof Consumer3bigd)
        	{
        		final Consumer3bigd originalAfter = (Consumer3bigd)after[0];
        		
        		return (a, b, c) -> {acceptBigDec(a, b, c); originalAfter.acceptBigDec(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {acceptBigDec(a, b, c); after[0].accept(a, b, c);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
			acceptBigDec(a, b, c);
			
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : after)
    		{
    			if(consumer instanceof Consumer3bigd)
    				((Consumer3bigd)consumer).acceptBigDec(a, b, c);
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
     * @return A new {@link Consumer3bigd} performing this operation and the operations after.
     */
	default Consumer3bigd andThen(Iterable<Consumer3<BigDecimal,BigDecimal,BigDecimal>> after)
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
			acceptBigDec(a, b, c);
			
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : after)
    		{
    			if(consumer instanceof Consumer3bigd)
    				((Consumer3bigd)consumer).acceptBigDec(a, b, c);
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
     * @return A new {@link Consumer3bigd} performing the operation before and this operation.
     */
    default Consumer3bigd beforeThat(Consumer3<BigDecimal,BigDecimal,BigDecimal> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer3bigd)
    	{
    		final Consumer3bigd originalBefore = (Consumer3bigd)before;
    		
    		return (a, b, c) -> {originalBefore.acceptBigDec(a, b, c); acceptBigDec(a, b, c);};
    	}
    	else
    	{
    		return (a, b, c) -> {before.accept(a, b, c); acceptBigDec(a, b, c);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bigd} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer3bigd beforeThat(Consumer3<BigDecimal,BigDecimal,BigDecimal>... before)
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
    		if(before[0] instanceof Consumer3bigd)
        	{
        		final Consumer3bigd originalBefore = (Consumer3bigd)before[0];
        		
        		return (a, b, c) -> {originalBefore.acceptBigDec(a, b, c); acceptBigDec(a, b, c);};
        	}
        	else
        	{
        		return (a, b, c) -> {before[0].accept(a, b, c); acceptBigDec(a, b, c);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : before)
    		{
    			if(consumer instanceof Consumer3bigd)
    				((Consumer3bigd)consumer).acceptBigDec(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3bigd} performing the operations before and this operation.
     */
    default Consumer3bigd beforeThat(Iterable<Consumer3<BigDecimal,BigDecimal,BigDecimal>> before)
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
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : before)
    		{
    			if(consumer instanceof Consumer3bigd)
    				((Consumer3bigd)consumer).acceptBigDec(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    		
    		acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3bigd inSequence(Consumer3<BigDecimal,BigDecimal,BigDecimal>... consumers)
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
    		if(consumers[0] instanceof Consumer3bigd)
    			return (Consumer3bigd) consumers[0];
    		else
    			return (Consumer3bigd) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c) -> {
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3bigd)
    				((Consumer3bigd)consumer).acceptBigDec(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer3bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3bigd} performing the operations.
     */
    static Consumer3bigd inSequence(Iterable<Consumer3<BigDecimal,BigDecimal,BigDecimal>> consumers)
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
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof Consumer3bigd)
    				((Consumer3bigd)consumer).acceptBigDec(a, b, c);
    			else
    				consumer.accept(a, b, c);
    		}
    	};
    }
}
