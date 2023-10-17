package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four {@link BigDecimal} input argument and returns no result.
 * Unlike {@link Consumer4bigd} this may throw Exceptions.
 * {@link ConsumerEx4bigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBigDec(BigDecimal, BigDecimal, BigDecimal, BigDecimal)}.
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
public interface ConsumerEx4bigd extends ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBigDec(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing this operation and the operation after.
     */
    default ConsumerEx4bigd andThenBigDec(ConsumerEx4bigd after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a, b, c, d) -> {acceptBigDec(a, b, c, d); after.acceptBigDec(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing this operation and the operations after.
     */
	default ConsumerEx4bigd andThenBigDec(ConsumerEx4bigd... after)
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
    	
    	if(after.length == 1) return (a, b, c, d) -> {acceptBigDec(a, b, c, d); after[0].acceptBigDec(a, b, c, d);};

    	return (a, b, c, d) -> {acceptBigDec(a, b, c, d); for(ConsumerEx4bigd consumer : after) consumer.acceptBigDec(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing this operation and the operations after.
     */
	default ConsumerEx4bigd andThenBigDec(Iterable<ConsumerEx4bigd> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a, b, c, d) -> {acceptBigDec(a, b, c, d); for(ConsumerEx4bigd consumer : after) consumer.acceptBigDec(a, b, c, d);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operation before and this operation.
     */
    default ConsumerEx4bigd beforeThatBigDec(ConsumerEx4bigd before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {before.acceptBigDec(a, b, c, d); acceptBigDec(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operations before and this operation.
     */
    default ConsumerEx4bigd beforeThatBigDec(ConsumerEx4bigd... before)
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
    	
    	if(before.length == 1) return (a, b, c, d) -> {before[0].acceptBigDec(a, b, c, d); acceptBigDec(a, b, c, d);};
    	
    	return (a, b, c, d) -> {for(ConsumerEx4bigd consumer : before) consumer.acceptBigDec(a, b, c, d); acceptBigDec(a, b, c, d);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operations before and this operation.
     */
    default ConsumerEx4bigd beforeThatBigDec(Iterable<ConsumerEx4bigd> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4bigd consumer : before) consumer.acceptBigDec(a, b, c, d); acceptBigDec(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operations.
     */
	static ConsumerEx4bigd inSequenceBigDec(ConsumerEx4bigd... consumers)
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
    	
    	return (a, b, c, d) -> {for(ConsumerEx4bigd consumer : consumers) consumer.acceptBigDec(a, b, c, d);};
    }
    
    /**
     * Composes a new {@link ConsumerEx4bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operations.
     */
    static ConsumerEx4bigd inSequenceBigDec(Iterable<ConsumerEx4bigd> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a, b, c, d) -> {for(ConsumerEx4bigd consumer : consumers) consumer.acceptBigDec(a, b, c, d);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigDec} instead.
     */
    @Override
    @Deprecated
    default void accept(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d) throws Exception
    {
    	acceptBigDec(a, b, c, d);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing this operation and the operation after.
     */
    default ConsumerEx4bigd andThen(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerEx4bigd)
    	{
    		final ConsumerEx4bigd originalAfter = (ConsumerEx4bigd)after;
    		
    		return (a, b, c, d) -> {acceptBigDec(a, b, c, d); originalAfter.acceptBigDec(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {acceptBigDec(a, b, c, d); after.accept(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerEx4bigd andThen(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... after)
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
    		if(after[0] instanceof ConsumerEx4bigd)
        	{
        		final ConsumerEx4bigd originalAfter = (ConsumerEx4bigd)after[0];
        		
        		return (a, b, c, d) -> {acceptBigDec(a, b, c, d); originalAfter.acceptBigDec(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {acceptBigDec(a, b, c, d); after[0].accept(a, b, c, d);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
			acceptBigDec(a, b, c, d);
			
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4bigd)
    				((ConsumerEx4bigd)consumer).acceptBigDec(a, b, c, d);
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
     * @return A new {@link ConsumerEx4bigd} performing this operation and the operations after.
     */
	default ConsumerEx4bigd andThen(Iterable<ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>> after)
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
			acceptBigDec(a, b, c, d);
			
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : after)
    		{
    			if(consumer instanceof ConsumerEx4bigd)
    				((ConsumerEx4bigd)consumer).acceptBigDec(a, b, c, d);
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
     * @return A new {@link ConsumerEx4bigd} performing the operation before and this operation.
     */
    default ConsumerEx4bigd beforeThat(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerEx4bigd)
    	{
    		final ConsumerEx4bigd originalBefore = (ConsumerEx4bigd)before;
    		
    		return (a, b, c, d) -> {originalBefore.acceptBigDec(a, b, c, d); acceptBigDec(a, b, c, d);};
    	}
    	else
    	{
    		return (a, b, c, d) -> {before.accept(a, b, c, d); acceptBigDec(a, b, c, d);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerEx4bigd beforeThat(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... before)
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
    		if(before[0] instanceof ConsumerEx4bigd)
        	{
        		final ConsumerEx4bigd originalBefore = (ConsumerEx4bigd)before[0];
        		
        		return (a, b, c, d) -> {originalBefore.acceptBigDec(a, b, c, d); acceptBigDec(a, b, c, d);};
        	}
        	else
        	{
        		return (a, b, c, d) -> {before[0].accept(a, b, c, d); acceptBigDec(a, b, c, d);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4bigd)
    				((ConsumerEx4bigd)consumer).acceptBigDec(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operations before and this operation.
     */
    default ConsumerEx4bigd beforeThat(Iterable<ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>> before)
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
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : before)
    		{
    			if(consumer instanceof ConsumerEx4bigd)
    				((ConsumerEx4bigd)consumer).acceptBigDec(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    		
    		acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4bigd inSequence(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... consumers)
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
    		if(consumers[0] instanceof ConsumerEx4bigd)
    			return (ConsumerEx4bigd) consumers[0];
    		else
    			return (ConsumerEx4bigd) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a, b, c, d) -> {
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4bigd)
    				((ConsumerEx4bigd)consumer).acceptBigDec(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4bigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4bigd} performing the operations.
     */
    static ConsumerEx4bigd inSequence(Iterable<ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>> consumers)
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
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerEx4bigd)
    				((ConsumerEx4bigd)consumer).acceptBigDec(a, b, c, d);
    			else
    				consumer.accept(a, b, c, d);
    		}
    	};
    }
}
