package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three {@link BigDecimal} input arguments
 * and returns no result. Unlike {@link Consumer3Bigd} this may throw
 * exceptions. {@link ConsumerEx3Bigd} is expected to operate via side-effects.
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
public interface ConsumerEx3Bigd extends ConsumerEx3<BigDecimal,BigDecimal,BigDecimal>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBigDec(BigDecimal a, BigDecimal b, BigDecimal c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3Bigd} performing this operation and the
     * operation after.
     */
    default ConsumerEx3Bigd thenBigDec(ConsumerEx3Bigd after)
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
     * @return A new {@link ConsumerEx3Bigd} performing this operation and the
     * operations after.
     */
	default ConsumerEx3Bigd thenBigDec(ConsumerEx3Bigd... after)
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
    		
    		for(ConsumerEx3Bigd consumer : after)
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
     * @return A new {@link ConsumerEx3Bigd} performing the operation before and
     * this operation.
     */
    default ConsumerEx3Bigd beforeBigDec(ConsumerEx3Bigd before)
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
     * @return A new {@link ConsumerEx3Bigd} performing the operations before
     * and this operation.
     */
    default ConsumerEx3Bigd beforeBigDec(ConsumerEx3Bigd... before)
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
    		for(ConsumerEx3Bigd consumer : before)
    		{
    			consumer.acceptBigDec(a, b, c);
    		}
    		
    		acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3Bigd} performing the operations.
     */
	static ConsumerEx3Bigd sequenceBigDec(ConsumerEx3Bigd... consumers)
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
    		for(ConsumerEx3Bigd consumer : consumers)
    		{
    			consumer.acceptBigDec(a, b, c);
    		}
    	};
    }
    
	/*
     * =====================================
     * org.barghos.util.consumer.ConsumerEx3
     * =====================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #acceptBigDec(BigDecimal, BigDecimal, BigDecimal)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigDecimal a, BigDecimal b, BigDecimal c) throws Exception
    {
    	acceptBigDec(a, b, c);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx3Bigd} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx3Bigd thenGeneric(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal> after)
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
     * @return A new {@link ConsumerEx3Bigd} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerEx3Bigd thenGeneric(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal>... after)
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
			
    		for(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal> consumer : after)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx3Bigd} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerEx3Bigd beforeGeneric(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal> before)
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
     * @return A new {@link ConsumerEx3Bigd} performing the operations before
     * and this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerEx3Bigd beforeGeneric(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal>... before)
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
    		for(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal> consumer : before)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    		
    		acceptBigDec(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3Bigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3Bigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx3Bigd sequenceGeneric(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal>... consumers)
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
    		return (ConsumerEx3Bigd) consumers[0]::acceptGeneric;
    	}

    	return (a, b, c) -> {
    		for(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    	};
    }
}
