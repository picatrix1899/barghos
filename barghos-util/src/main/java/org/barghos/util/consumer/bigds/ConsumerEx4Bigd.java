package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four {@link BigDecimal} input arguments
 * and returns no result. Unlike {@link Consumer4Bigd} this may throw
 * exceptions. {@link ConsumerEx4Bigd} is expected to operate via side-effects.
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
public interface ConsumerEx4Bigd extends ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>
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
     * @return A new {@link ConsumerEx4Bigd} performing this operation and the
     * operation after.
     */
    default ConsumerEx4Bigd thenBigDec(ConsumerEx4Bigd after)
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
     * @return A new {@link ConsumerEx4Bigd} performing this operation and the
     * operations after.
     */
	default ConsumerEx4Bigd thenBigDec(ConsumerEx4Bigd... after)
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
    		
    		for(ConsumerEx4Bigd consumer : after)
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
     * @return A new {@link ConsumerEx4Bigd} performing the operation before and
     * this operation.
     */
    default ConsumerEx4Bigd beforeBigDec(ConsumerEx4Bigd before)
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
     * @return A new {@link ConsumerEx4Bigd} performing the operations before
     * and this operation.
     */
    default ConsumerEx4Bigd beforeBigDec(ConsumerEx4Bigd... before)
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
    		for(ConsumerEx4Bigd consumer : before)
    		{
    			consumer.acceptBigDec(a, b, c, d);
    		}
    		
    		acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4Bigd} performing the operations.
     */
	static ConsumerEx4Bigd sequenceBigDec(ConsumerEx4Bigd... consumers)
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
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1)
    	{
    		return consumers[0];
    	}
    	
    	return (a, b, c, d) -> {
    		for(ConsumerEx4Bigd consumer : consumers)
    		{
    			consumer.acceptBigDec(a, b, c, d);
    		}
    	};
    }
    
	/*
     * =====================================
     * org.barghos.util.consumer.ConsumerEx4
     * =====================================
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
    default void acceptGeneric(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d) throws Exception
    {
    	acceptBigDec(a, b, c, d);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx4Bigd} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx4Bigd thenGeneric(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> after)
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
     * @return A new {@link ConsumerEx4Bigd} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerEx4Bigd thenGeneric(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... after)
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
        		
        		after[0].acceptGeneric(a, b, c, d);
        	};
    	}

    	return (a, b, c, d) -> {
			acceptBigDec(a, b, c, d);
			
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : after)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx4Bigd} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerEx4Bigd beforeGeneric(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> before)
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
     * @return A new {@link ConsumerEx4Bigd} performing the operations before
     * and this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerEx4Bigd beforeGeneric(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... before)
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
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : before)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    		
    		acceptBigDec(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4Bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4Bigd sequenceGeneric(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... consumers)
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
    		return (ConsumerEx4Bigd) consumers[0]::acceptGeneric;
    	}

    	return (a, b, c, d) -> {
    		for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    	};
    }
}
