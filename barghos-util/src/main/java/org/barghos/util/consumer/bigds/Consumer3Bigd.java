package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three {@link BigDecimal} input arguments
 * and returns no result. {@link Consumer3Bigd} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBigDec(BigDecimal, BigDecimal, BigDecimal)}.
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
public interface Consumer3Bigd extends Consumer3<BigDecimal,BigDecimal,BigDecimal>
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
     * @return A new {@link Consumer3Bigd} performing this operation and the
     * operation after.
     */
    default Consumer3Bigd thenBigDec(Consumer3Bigd after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {
    		acceptBigDec(a, b, c);
    		
    		after.acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3Bigd} performing this operation and the
     * operations after.
     */
	default Consumer3Bigd thenBigDec(Consumer3Bigd... after)
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
    		return (a, b, c) -> {
    			acceptBigDec(a, b, c);
    			
    			after[0].acceptBigDec(a, b, c);
    		};
    	}

    	return (a, b, c) -> {
    		acceptBigDec(a, b, c);
    		
    		for(Consumer3Bigd consumer : after)
    		{
    			consumer.acceptBigDec(a, b, c);
    		}
    	};
    }
	
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3Bigd} performing the operation before and
     * this operation.
     */
    default Consumer3Bigd beforeBigDec(Consumer3Bigd before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {
    		before.acceptBigDec(a, b, c);
    		
    		acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3Bigd} performing the operations before and
     * this operation.
     */
    default Consumer3Bigd beforeBigDec(Consumer3Bigd... before)
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
    		return (a, b, c) -> {
    			before[0].acceptBigDec(a, b, c);
    			
    			acceptBigDec(a, b, c);
    		};
    	}
    	
    	return (a, b, c) -> {
    		for(Consumer3Bigd consumer : before)
    		{
    			consumer.acceptBigDec(a, b, c);
    		}
    		
    		acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3Bigd} performing the operations.
     */
	static Consumer3Bigd sequenceBigDec(Consumer3Bigd... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b, c) -> {};
    	}
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1)
    	{
    		return consumers[0];
    	}
    	
    	return (a, b, c) -> {
    		for(Consumer3Bigd consumer : consumers)
    		{
    			consumer.acceptBigDec(a, b, c);
    		}
    	};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer3
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #acceptBigDec(BigDecimal, BigDecimal, BigDecimal)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigDecimal a, BigDecimal b, BigDecimal c)
    {
    	acceptBigDec(a, b, c);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3Bigd} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer3Bigd thenGeneric(Consumer3<BigDecimal,BigDecimal,BigDecimal> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a, b, c) -> {
    		acceptBigDec(a, b, c);
    		
    		after.acceptGeneric(a, b, c);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3Bigd} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default Consumer3Bigd thenGeneric(Consumer3<BigDecimal,BigDecimal,BigDecimal>... after)
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
    		return (a, b, c) -> {
    			acceptBigDec(a, b, c);
    			
    			after[0].acceptGeneric(a, b, c);
    		};
    	}

    	return (a, b, c) -> {
    		acceptBigDec(a, b, c);
    		
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : after)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3Bigd} performing the operation before and
     * this operation.
     */
    @Override
    default Consumer3Bigd beforeGeneric(Consumer3<BigDecimal,BigDecimal,BigDecimal> before)
    {
    	Validation.validateNotNull("before", before);

    	return (a, b, c) -> {
    		before.acceptGeneric(a, b, c);
    		
    		acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3Bigd} performing the operations before and
     * this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default Consumer3Bigd beforeGeneric(Consumer3<BigDecimal,BigDecimal,BigDecimal>... before)
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
    		return (a, b, c) -> {
    			before[0].acceptGeneric(a, b, c);
    			
    			acceptBigDec(a, b, c);
    		};
    	}

    	return (a, b, c) -> {
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : before)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    		
    		acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3Bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3Bigd sequenceGeneric(Consumer3<BigDecimal,BigDecimal,BigDecimal>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b, c) -> {};
    	}

    	if(consumers.length == 1)
    	{
    		return (Consumer3Bigd) consumers[0]::acceptGeneric;
    	}

    	return (a, b, c) -> {
    		for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    	};
    }
}
