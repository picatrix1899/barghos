package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts three {@link BigInteger} input arguments 
 * and returns no result. {@link Consumer3Bigi} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBigInt(BigInteger, BigInteger, BigInteger)}.
 * 
 * @see ConsumerBigi
 * @see ConsumerExBigi
 * @see Consumer2Bigi
 * @see ConsumerEx2Bigi
 * @see Consumer3Bigi
 * @see ConsumerEx3Bigi
 * @see Consumer4Bigi
 * @see ConsumerEx4Bigi
 */
@FunctionalInterface
public interface Consumer3Bigi extends Consumer3<BigInteger,BigInteger,BigInteger>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptBigInt(BigInteger a, BigInteger b, BigInteger c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3Bigi} performing this operation and the
     * operation after.
     */
    default Consumer3Bigi thenBigInt(Consumer3Bigi after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c) -> {
    		acceptBigInt(a, b, c);
    		
    		after.acceptBigInt(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer3Bigi} performing this operation and the
     * operations after.
     */
	default Consumer3Bigi thenBigInt(Consumer3Bigi... after)
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
    			acceptBigInt(a, b, c);
    			
    			after[0].acceptBigInt(a, b, c);
    		};
    	}

    	return (a, b, c) -> {
    		acceptBigInt(a, b, c);
    		
    		for(Consumer3Bigi consumer : after)
    		{
    			consumer.acceptBigInt(a, b, c);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3Bigi} performing the operation before and
     * this operation.
     */
    default Consumer3Bigi beforeBigInt(Consumer3Bigi before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c) -> {
    		before.acceptBigInt(a, b, c);
    		
    		acceptBigInt(a, b, c);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer3Bigi} performing the operations before and
     * this operation.
     */
    default Consumer3Bigi beforeBigInt(Consumer3Bigi... before)
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
    			before[0].acceptBigInt(a, b, c);
    			
    			acceptBigInt(a, b, c);
    		};
    	}
    	
    	return (a, b, c) -> {
    		for(Consumer3Bigi consumer : before)
    		{
    			consumer.acceptBigInt(a, b, c);
    		}
    		
    		acceptBigInt(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3Bigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3Bigi} performing the operations.
     */
	static Consumer3Bigi sequenceBigInt(Consumer3Bigi... consumers)
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
    		for(Consumer3Bigi consumer : consumers)
    		{
    			consumer.acceptBigInt(a, b, c);
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
     * Use {@link #acceptBigInt(BigInteger, BigInteger, BigInteger)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigInteger a, BigInteger b, BigInteger c)
    {
    	acceptBigInt(a, b, c);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3Bigi} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer3Bigi thenGeneric(Consumer3<BigInteger,BigInteger,BigInteger> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a, b, c) -> {
    		acceptBigInt(a, b, c);
    		
    		after.acceptGeneric(a, b, c);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3Bigi} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default Consumer3Bigi thenGeneric(Consumer3<BigInteger,BigInteger,BigInteger>... after)
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
        		acceptBigInt(a, b, c);
        		
        		after[0].acceptGeneric(a, b, c);
        	};
    	}

    	return (a, b, c) -> {
			acceptBigInt(a, b, c);
			
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : after)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3Bigi} performing the operation before and
     * this operation.
     */
    @Override
    default Consumer3Bigi beforeGeneric(Consumer3<BigInteger,BigInteger,BigInteger> before)
    {
    	Validation.validateNotNull("before", before);

    	return (a, b, c) -> {
    		before.acceptGeneric(a, b, c);
    		
    		acceptBigInt(a, b, c);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3Bigi} performing the operations before and
     * this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default Consumer3Bigi beforeGeneric(Consumer3<BigInteger,BigInteger,BigInteger>... before)
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
        		
        		acceptBigInt(a, b, c);
        	};
    	}

    	return (a, b, c) -> {
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : before)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    		
    		acceptBigInt(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3Bigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3Bigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer3Bigi sequenceGeneric(Consumer3<BigInteger,BigInteger,BigInteger>... consumers)
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
    		return (Consumer3Bigi) consumers[0]::acceptGeneric;
    	}

    	return (a, b, c) -> {
    		for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b, c);
    		}
    	};
    }
}
