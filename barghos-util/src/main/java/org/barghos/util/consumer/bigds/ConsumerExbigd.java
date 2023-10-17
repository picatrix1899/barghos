package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one {@link BigDecimal} input argument and returns no result.
 * Unlike {@link Consumerbigd} this may throw Exceptions.
 * {@link ConsumerExbigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBigDec(BigDecimal)}.
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
public interface ConsumerExbigd extends ConsumerEx<BigDecimal>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBigDec(BigDecimal a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing this operation and the operation after.
     */
    default ConsumerExbigd andThenBigDec(ConsumerExbigd after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptBigDec(a); after.acceptBigDec(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing this operation and the operations after.
     */
	default ConsumerExbigd andThenBigDec(ConsumerExbigd... after)
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
    	
    	if(after.length == 1) return (a) -> {acceptBigDec(a); after[0].acceptBigDec(a);};

    	return (a) -> {acceptBigDec(a); for(ConsumerExbigd consumer : after) consumer.acceptBigDec(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing this operation and the operations after.
     */
	default ConsumerExbigd andThenBigDec(Iterable<ConsumerExbigd> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptBigDec(a); for(ConsumerExbigd consumer : after) consumer.acceptBigDec(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing the operation before and this operation.
     */
    default ConsumerExbigd beforeThatBigDec(ConsumerExbigd before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptBigDec(a); acceptBigDec(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing the operations before and this operation.
     */
    default ConsumerExbigd beforeThatBigDec(ConsumerExbigd... before)
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
    	
    	if(before.length == 1) return (a) -> {before[0].acceptBigDec(a); acceptBigDec(a);};
    	
    	return (a) -> {for(ConsumerExbigd consumer : before) consumer.acceptBigDec(a); acceptBigDec(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing the operations before and this operation.
     */
    default ConsumerExbigd beforeThatBigDec(Iterable<ConsumerExbigd> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(ConsumerExbigd consumer : before) consumer.acceptBigDec(a); acceptBigDec(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExbigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbigd} performing the operations.
     */
	static ConsumerExbigd inSequenceBigDec(ConsumerExbigd... consumers)
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
    	
    	return (a) -> {for(ConsumerExbigd consumer : consumers) consumer.acceptBigDec(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExbigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbigd} performing the operations.
     */
    static ConsumerExbigd inSequenceBigDec(Iterable<ConsumerExbigd> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(ConsumerExbigd consumer : consumers) consumer.acceptBigDec(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigDec} instead.
     */
    @Override
    @Deprecated
    default void accept(BigDecimal a) throws Exception
    {
    	acceptBigDec(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing this operation and the operation after.
     */
    default ConsumerExbigd andThen(ConsumerEx<BigDecimal> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExbigd)
    	{
    		final ConsumerExbigd originalAfter = (ConsumerExbigd)after;
    		
    		return (a) -> {acceptBigDec(a); originalAfter.acceptBigDec(a);};
    	}
    	else
    	{
    		return (a) -> {acceptBigDec(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExbigd andThen(ConsumerEx<BigDecimal>... after)
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
    		if(after[0] instanceof ConsumerExbigd)
        	{
        		final ConsumerExbigd originalAfter = (ConsumerExbigd)after[0];
        		
        		return (a) -> {acceptBigDec(a); originalAfter.acceptBigDec(a);};
        	}
        	else
        	{
        		return (a) -> {acceptBigDec(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptBigDec(a);
			
    		for(ConsumerEx<BigDecimal> consumer : after)
    		{
    			if(consumer instanceof ConsumerExbigd)
    				((ConsumerExbigd)consumer).acceptBigDec(a);
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
     * @return A new {@link ConsumerExbigd} performing this operation and the operations after.
     */
	default ConsumerExbigd andThen(Iterable<ConsumerEx<BigDecimal>> after)
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
			acceptBigDec(a);
			
    		for(ConsumerEx<BigDecimal> consumer : after)
    		{
    			if(consumer instanceof ConsumerExbigd)
    				((ConsumerExbigd)consumer).acceptBigDec(a);
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
     * @return A new {@link ConsumerExbigd} performing the operation before and this operation.
     */
    default ConsumerExbigd beforeThat(ConsumerEx<BigDecimal> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExbigd)
    	{
    		final ConsumerExbigd originalBefore = (ConsumerExbigd)before;
    		
    		return (a) -> {originalBefore.acceptBigDec(a); acceptBigDec(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptBigDec(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExbigd beforeThat(ConsumerEx<BigDecimal>... before)
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
    		if(before[0] instanceof ConsumerExbigd)
        	{
        		final ConsumerExbigd originalBefore = (ConsumerExbigd)before[0];
        		
        		return (a) -> {originalBefore.acceptBigDec(a); acceptBigDec(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptBigDec(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<BigDecimal> consumer : before)
    		{
    			if(consumer instanceof ConsumerExbigd)
    				((ConsumerExbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExbigd} performing the operations before and this operation.
     */
    default ConsumerExbigd beforeThat(Iterable<ConsumerEx<BigDecimal>> before)
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
    		for(ConsumerEx<BigDecimal> consumer : before)
    		{
    			if(consumer instanceof ConsumerExbigd)
    				((ConsumerExbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExbigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExbigd inSequence(ConsumerEx<BigDecimal>... consumers)
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
    		if(consumers[0] instanceof ConsumerExbigd)
    			return (ConsumerExbigd) consumers[0];
    		else
    			return (ConsumerExbigd) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExbigd)
    				((ConsumerExbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExbigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExbigd} performing the operations.
     */
    static ConsumerExbigd inSequence(Iterable<ConsumerEx<BigDecimal>> consumers)
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
    		for(ConsumerEx<BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExbigd)
    				((ConsumerExbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
