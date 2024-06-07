package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two {@link BigDecimal} input arguments
 * and returns no result. Unlike {@link Consumer2Bigd} this may throw
 * exceptions. {@link ConsumerEx2Bigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBigDec(BigDecimal, BigDecimal)}.
 * 
 * @see ConsumerBigd
 * @see ConsumerExBigd
 * @see Consumer2Bigd
 * @see ConsumerEx2Bigd
 * @see Consumer3Bigd
 * @see ConsumerEx3Bigd
 * @see Consumer4Bigd
 * @see ConsumerEx4Bigd
 */
@FunctionalInterface
public interface ConsumerEx2Bigd extends ConsumerEx2<BigDecimal,BigDecimal>
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
     * @return A new {@link ConsumerEx2Bigd} performing this operation and the
     * operation after.
     */
    default ConsumerEx2Bigd thenBigDec(ConsumerEx2Bigd after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {
    		acceptBigDec(a, b);
    		
    		after.acceptBigDec(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2Bigd} performing this operation and the
     * operations after.
     */
	default ConsumerEx2Bigd thenBigDec(ConsumerEx2Bigd... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0)
    	{
    		return this;
    	}
    	
    	if(after.length == 1)
    	{
    		return (a, b) -> {
    			acceptBigDec(a, b);
    			
    			after[0].acceptBigDec(a, b);
    		};
    	}

    	return (a, b) -> {
    		acceptBigDec(a, b);
    		
    		for(ConsumerEx2Bigd consumer : after)
    		{
    			consumer.acceptBigDec(a, b);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Bigd} performing the operation before and
     * this operation.
     */
    default ConsumerEx2Bigd beforeBigDec(ConsumerEx2Bigd before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {
    		before.acceptBigDec(a, b);
    		
    		acceptBigDec(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Bigd} performing the operations before
     * and this operation.
     */
    default ConsumerEx2Bigd beforeBigDec(ConsumerEx2Bigd... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0)
    	{
    		return this;
    	}
    	
    	if(before.length == 1)
    	{
    		return (a, b) -> {
    			before[0].acceptBigDec(a, b);
    			
    			acceptBigDec(a, b);
    		};
    	}
    	
    	return (a, b) -> {
    		for(ConsumerEx2Bigd consumer : before)
    		{
    			consumer.acceptBigDec(a, b);
    		}
    		
    		acceptBigDec(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2Bigd} performing the operations.
     */
	static ConsumerEx2Bigd sequenceBigDec(ConsumerEx2Bigd... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b) -> {};
    	}
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1)
    	{
    		return consumers[0];
    	}
    	
    	return (a, b) -> {
    		for(ConsumerEx2Bigd consumer : consumers)
    		{
    			consumer.acceptBigDec(a, b);
    		}
    	};
    }
    
	/*
     * =====================================
     * org.barghos.util.consumer.ConsumerEx2
     * =====================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptBigDec(BigDecimal, BigDecimal)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigDecimal a, BigDecimal b) throws Exception
    {
    	acceptBigDec(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx2Bigd} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx2Bigd thenGeneric(ConsumerEx2<BigDecimal,BigDecimal> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a, b) -> {
    		acceptBigDec(a, b);
    		
    		after.acceptGeneric(a, b);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx2Bigd} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerEx2Bigd thenGeneric(ConsumerEx2<BigDecimal,BigDecimal>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;

    	if(after.length == 1)
    	{
        	return (a, b) -> {
        		acceptBigDec(a, b);
        		
        		after[0].acceptGeneric(a, b);
        	};
    	}

    	return (a, b) -> {
			acceptBigDec(a, b);
			
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : after)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx2Bigd} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerEx2Bigd beforeGeneric(ConsumerEx2<BigDecimal,BigDecimal> before)
    {
    	Validation.validateNotNull("before", before);

    	return (a, b) -> {
    		before.acceptGeneric(a, b);
    		
    		acceptBigDec(a, b);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx2Bigd} performing the operations before
     * and this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerEx2Bigd beforeGeneric(ConsumerEx2<BigDecimal,BigDecimal>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0)
    	{
    		return this;
    	}
    	
    	if(before.length == 1)
    	{
        	return (a, b) -> {
        		before[0].acceptGeneric(a, b);
        		
        		acceptBigDec(a, b);
        	};
    	}

    	return (a, b) -> {
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : before)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    		
    		acceptBigDec(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2Bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2Bigd sequenceGeneric(ConsumerEx2<BigDecimal,BigDecimal>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b) -> {};
    	}

    	if(consumers.length == 1)
    	{
    		return (ConsumerEx2Bigd) consumers[0]::acceptGeneric;
    	}

    	return (a, b) -> {
    		for(ConsumerEx2<BigDecimal,BigDecimal> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    	};
    }
}
