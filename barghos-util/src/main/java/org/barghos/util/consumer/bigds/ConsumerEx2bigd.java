package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two {@link BigDecimal} input argument and returns no result.
 * Unlike {@link Consumer2bigd} this may throw Exceptions.
 * {@link ConsumerEx2bigd} is expected to operate via side-effects.
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
public interface ConsumerEx2bigd extends ConsumerEx2<BigDecimal,BigDecimal>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBigDec(BigDecimal a, BigDecimal b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2bigd} performing this operation and the operation after.
     */
    default ConsumerEx2bigd andThenBigDec(ConsumerEx2bigd after)
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
     * @return A new {@link ConsumerEx2bigd} performing this operation and the operations after.
     */
	default ConsumerEx2bigd andThenBigDec(ConsumerEx2bigd... after)
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

    	return (a, b) -> {acceptBigDec(a, b); for(ConsumerEx2bigd consumer : after) consumer.acceptBigDec(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2bigd} performing this operation and the operations after.
     */
	default ConsumerEx2bigd andThenBigDec(Iterable<ConsumerEx2bigd> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b) -> {acceptBigDec(a, b); for(ConsumerEx2bigd consumer : after) consumer.acceptBigDec(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2bigd} performing the operation before and this operation.
     */
    default ConsumerEx2bigd beforeThatBigDec(ConsumerEx2bigd before)
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
     * @return A new {@link ConsumerEx2bigd} performing the operations before and this operation.
     */
    default ConsumerEx2bigd beforeThatBigDec(ConsumerEx2bigd... before)
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
    	
    	return (a, b) -> {for(ConsumerEx2bigd consumer : before) consumer.acceptBigDec(a, b); acceptBigDec(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2bigd} performing the operations before and this operation.
     */
    default ConsumerEx2bigd beforeThatBigDec(Iterable<ConsumerEx2bigd> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b) -> {for(ConsumerEx2bigd consumer : before) consumer.acceptBigDec(a, b); acceptBigDec(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2bigd} performing the operations.
     */
	static ConsumerEx2bigd inSequenceBigDec(ConsumerEx2bigd... consumers)
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
    	
    	return (a, b) -> {for(ConsumerEx2bigd consumer : consumers) consumer.acceptBigDec(a, b);};
    }
    
    /**
     * Composes a new {@link ConsumerEx2bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2bigd} performing the operations.
     */
    static ConsumerEx2bigd inSequenceBigDec(Iterable<ConsumerEx2bigd> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b) -> {for(ConsumerEx2bigd consumer : consumers) consumer.acceptBigDec(a, b);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigDec} instead.
     */
    @Override
    @Deprecated
    default void accept(BigDecimal a, BigDecimal b) throws Exception
    {
    	acceptBigDec(a, b);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2bigd} performing this operation and the operation after.
     */
    default ConsumerEx2bigd andThen(ConsumerEx2<BigDecimal,BigDecimal> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx2bigd)
    	{
    		final ConsumerEx2bigd originalAfter = (ConsumerEx2bigd)after;
    		
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
     * @return A new {@link ConsumerEx2bigd} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx2bigd andThen(ConsumerEx2<BigDecimal,BigDecimal>... after)
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
    		if(after[0] instanceof ConsumerEx2bigd)
        	{
        		final ConsumerEx2bigd originalAfter = (ConsumerEx2bigd)after[0];
        		
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
			
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2bigd)
    				((ConsumerEx2bigd)consumer).acceptBigDec(a, b);
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
     * @return A new {@link ConsumerEx2bigd} performing this operation and the operations after.
     */
	default ConsumerEx2bigd andThen(Iterable<ConsumerEx2<BigDecimal,BigDecimal>> after)
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
			
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx2bigd)
    				((ConsumerEx2bigd)consumer).acceptBigDec(a, b);
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
     * @return A new {@link ConsumerEx2bigd} performing the operation before and this operation.
     */
    default ConsumerEx2bigd beforeThat(ConsumerEx2<BigDecimal,BigDecimal> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx2bigd)
    	{
    		final ConsumerEx2bigd originalBefore = (ConsumerEx2bigd)before;
    		
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
     * @return A new {@link ConsumerEx2bigd} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx2bigd beforeThat(ConsumerEx2<BigDecimal,BigDecimal>... before)
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
    		if(before[0] instanceof ConsumerEx2bigd)
        	{
        		final ConsumerEx2bigd originalBefore = (ConsumerEx2bigd)before[0];
        		
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
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2bigd)
    				((ConsumerEx2bigd)consumer).acceptBigDec(a, b);
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
     * @return A new {@link ConsumerEx2bigd} performing the operations before and this operation.
     */
    default ConsumerEx2bigd beforeThat(Iterable<ConsumerEx2<BigDecimal,BigDecimal>> before)
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
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx2bigd)
    				((ConsumerEx2bigd)consumer).acceptBigDec(a, b);
    			else
    				consumer.accept(a, b);
    		}
    		
    		acceptBigDec(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2bigd inSequence(ConsumerEx2<BigDecimal,BigDecimal>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx2bigd)
    			return (ConsumerEx2bigd) consumers[0];
    		else
    			return (ConsumerEx2bigd) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b) -> {
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2bigd)
    				((ConsumerEx2bigd)consumer).acceptBigDec(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2bigd} performing the operations.
     */
    static ConsumerEx2bigd inSequence(Iterable<ConsumerEx2<BigDecimal,BigDecimal>> consumers)
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
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx2bigd)
    				((ConsumerEx2bigd)consumer).acceptBigDec(a, b);
    			else
    				consumer.accept(a, b);
    		}
    	};
    }
}
