package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four {@link BigDecimal} input arguments
 * and returns no result. {@link Consumer4Bigd} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBigDec(BigDecimal, BigDecimal, BigDecimal, BigDecimal)}.
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
public interface Consumer4Bigd extends Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptBigDec(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4Bigd} performing this operation and the
     * operation after.
     */
    default Consumer4Bigd thenBigDec(Consumer4Bigd after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {
    		acceptBigDec(a, b, c, d);
    		
    		after.acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer4Bigd} performing this operation and the
     * operations after.
     */
	default Consumer4Bigd thenBigDec(Consumer4Bigd... after)
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
    		return (a, b, c, d) -> {
    			acceptBigDec(a, b, c, d); 
    			
    			after[0].acceptBigDec(a, b, c, d);
    		};
    	}

    	return (a, b, c, d) -> {
    		acceptBigDec(a, b, c, d);
    		
    		for(Consumer4Bigd consumer : after) 
    		{
    			consumer.acceptBigDec(a, b, c, d);
    		}
    	};
    }

    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4Bigd} performing the operation before and
     * this operation.
     */
    default Consumer4Bigd beforeBigDec(Consumer4Bigd before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {
    		before.acceptBigDec(a, b, c, d);
    		
    		acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer4Bigd} performing the operations before and
     * this operation.
     */
    default Consumer4Bigd beforeBigDec(Consumer4Bigd... before)
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
    		return (a, b, c, d) -> {
    			before[0].acceptBigDec(a, b, c, d);
    			
    			acceptBigDec(a, b, c, d);
    		};
    	}
    	
    	return (a, b, c, d) -> {
    		for(Consumer4Bigd consumer : before)
    		{
    			consumer.acceptBigDec(a, b, c, d);
    		}
    		
    		acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4Bigd} performing the operations.
     */
	static Consumer4Bigd sequenceBigDec(Consumer4Bigd... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b, c, d) -> {};
    	}
    	
    	if(consumers.length == 1)
    	{
    		return consumers[0];
    	}
    	
    	return (a, b, c, d) -> {
    		for(Consumer4Bigd consumer : consumers)
    		{
    			consumer.acceptBigDec(a, b, c, d);
    		}
    	};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer4
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #acceptBigDec(BigDecimal, BigDecimal, BigDecimal, BigDecimal)}
     * instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d)
    {
    	acceptBigDec(a, b, c, d);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer4Bigd} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer4Bigd thenGeneric(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a, b, c, d) -> {
    		acceptBigDec(a, b, c, d);
    		
    		after.acceptGeneric(a, b, c, d);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer4Bigd} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default Consumer4Bigd thenGeneric(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;

    	if(after.length == 1)
    	{
        	return (a, b, c, d) -> {
        		acceptBigDec(a, b, c, d);
        		
        		after[0].acceptGeneric(a, b, c, d);
        	};
    	}

    	return (a, b, c, d) -> {
			acceptBigDec(a, b, c, d);
			
    		for(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : after)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer4Bigd} performing the operation before and
     * this operation.
     */
    @Override
    default Consumer4Bigd beforeGeneric(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {
    		before.acceptGeneric(a, b, c, d);
    		
    		acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer4Bigd} performing the operations before and
     * this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default Consumer4Bigd beforeGeneric(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... before)
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
        	return (a, b, c, d) -> {
        		before[0].acceptGeneric(a, b, c, d);
        		
        		acceptBigDec(a, b, c, d);
        	};
    	}

    	return (a, b, c, d) -> {
    		for(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : before)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    		
    		acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4Bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer4Bigd sequenceGeneric(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b, c, d) -> {};
    	}

    	if(consumers.length == 1)
    	{
    		return (Consumer4Bigd) consumers[0]::acceptGeneric;
    	}

    	return (a, b, c, d) -> {
    		for(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    	};
    }
}
