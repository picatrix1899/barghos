package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two {@link BigDecimal} input arguments and returns no result.
 * {@link Consumer2bigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBigDec(BigDecimal, BigDecimal)}.
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
public interface Consumer2bigd extends Consumer2<BigDecimal,BigDecimal>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptBigDec(BigDecimal a, BigDecimal b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2bigd} performing this operation and the operation after.
     */
    default Consumer2bigd andThenBigDec(Consumer2bigd after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptBigDec(a, b); after.acceptBigDec(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bigd} performing this operation and the operations after.
     */
	default Consumer2bigd andThenBigDec(Consumer2bigd... after)
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
    	
    	if(after.length == 1) return (a, b) -> {acceptBigDec(a, b); after[0].acceptBigDec(a, b);};

    	return (a, b) -> {acceptBigDec(a, b); for(Consumer2bigd consumer : after) consumer.acceptBigDec(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bigd} performing this operation and the operations after.
     */
	default Consumer2bigd andThenBigDec(Iterable<Consumer2bigd> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptBigDec(a, b); for(Consumer2bigd consumer : after) consumer.acceptBigDec(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2bigd} performing the operation before and this operation.
     */
    default Consumer2bigd beforeThatBigDec(Consumer2bigd before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {before.acceptBigDec(a, b); acceptBigDec(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bigd} performing the operations before and this operation.
     */
    default Consumer2bigd beforeThatBigDec(Consumer2bigd... before)
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
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptBigDec(a, b); acceptBigDec(a, b);};
    	
    	return (a, b) -> {for(Consumer2bigd consumer : before) consumer.acceptBigDec(a, b); acceptBigDec(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bigd} performing the operations before and this operation.
     */
    default Consumer2bigd beforeThatBigDec(Iterable<Consumer2bigd> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(Consumer2bigd consumer : before) consumer.acceptBigDec(a, b); acceptBigDec(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bigd} performing the operations.
     */
	static Consumer2bigd inSequenceBigDec(Consumer2bigd... consumers)
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
    	
    	return (a, b) -> {for(Consumer2bigd consumer : consumers) consumer.acceptBigDec(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bigd} performing the operations.
     */
    static Consumer2bigd inSequenceBigDec(Iterable<Consumer2bigd> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(Consumer2bigd consumer : consumers) consumer.acceptBigDec(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigDec} instead.
     */
    @Override
    @Deprecated
    default void accept(BigDecimal a, BigDecimal b)
    {
    	acceptBigDec(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2bigd} performing this operation and the operation after.
     */
    default Consumer2bigd andThen(Consumer2<BigDecimal,BigDecimal> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2bigd)
    	{
    		final Consumer2bigd originalAfter = (Consumer2bigd)after;
    		
    		return (a, b) -> {acceptBigDec(a, b); originalAfter.acceptBigDec(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptBigDec(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2bigd} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2bigd andThen(Consumer2<BigDecimal,BigDecimal>... after)
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
    		if(after[0] instanceof Consumer2bigd)
        	{
        		final Consumer2bigd originalAfter = (Consumer2bigd)after[0];
        		
        		return (a, b) -> {acceptBigDec(a, b); originalAfter.acceptBigDec(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptBigDec(a, b); after[0].accept(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
			acceptBigDec(a, b);
			
    		for(Consumer2<BigDecimal,BigDecimal> consumer : after)
    		{
    			if(consumer instanceof Consumer2bigd)
    				((Consumer2bigd)consumer).acceptBigDec(a, b);
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
     * @return A new {@link Consumer2bigd} performing this operation and the operations after.
     */
	default Consumer2bigd andThen(Iterable<Consumer2<BigDecimal,BigDecimal>> after)
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
			acceptBigDec(a, b);
			
    		for(Consumer2<BigDecimal,BigDecimal> consumer : after)
    		{
    			if(consumer instanceof Consumer2bigd)
    				((Consumer2bigd)consumer).acceptBigDec(a, b);
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
     * @return A new {@link Consumer2bigd} performing the operation before and this operation.
     */
    default Consumer2bigd beforeThat(Consumer2<BigDecimal,BigDecimal> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2bigd)
    	{
    		final Consumer2bigd originalBefore = (Consumer2bigd)before;
    		
    		return (a, b) -> {originalBefore.acceptBigDec(a, b); acceptBigDec(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptBigDec(a, b);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bigd} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2bigd beforeThat(Consumer2<BigDecimal,BigDecimal>... before)
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
    		if(before[0] instanceof Consumer2bigd)
        	{
        		final Consumer2bigd originalBefore = (Consumer2bigd)before[0];
        		
        		return (a, b) -> {originalBefore.acceptBigDec(a, b); acceptBigDec(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].accept(a, b); acceptBigDec(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<BigDecimal,BigDecimal> consumer : before)
    		{
    			if(consumer instanceof Consumer2bigd)
    				((Consumer2bigd)consumer).acceptBigDec(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptBigDec(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2bigd} performing the operations before and this operation.
     */
    default Consumer2bigd beforeThat(Iterable<Consumer2<BigDecimal,BigDecimal>> before)
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
    		for(Consumer2<BigDecimal,BigDecimal> consumer : before)
    		{
    			if(consumer instanceof Consumer2bigd)
    				((Consumer2bigd)consumer).acceptBigDec(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptBigDec(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2bigd inSequence(Consumer2<BigDecimal,BigDecimal>... consumers)
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
    		if(consumers[0] instanceof Consumer2bigd)
    			return (Consumer2bigd) consumers[0];
    		else
    			return (Consumer2bigd) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<BigDecimal,BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2bigd)
    				((Consumer2bigd)consumer).acceptBigDec(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumer2bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2bigd} performing the operations.
     */
    static Consumer2bigd inSequence(Iterable<Consumer2<BigDecimal,BigDecimal>> consumers)
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
    		for(Consumer2<BigDecimal,BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2bigd)
    				((Consumer2bigd)consumer).acceptBigDec(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /** {@inheritDoc}} */
    @Override
    default Consumer2bigd andThen(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b) -> {acceptBigDec(a, b); after.accept(a, b);};
    }
}
