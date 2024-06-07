package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts four {@link BigInteger} input arguments
 * and returns no result. Unlike {@link Consumer4Bigi} this may throw
 * exceptions. {@link ConsumerEx4Bigi} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBigInt(BigInteger, BigInteger, BigInteger, BigInteger)}.
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
public interface ConsumerEx4Bigi extends ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger>
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
    void acceptBigInt(BigInteger a, BigInteger b, BigInteger c, BigInteger d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4Bigi} performing this operation and the
     * operation after.
     */
    default ConsumerEx4Bigi thenBigInt(ConsumerEx4Bigi after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b, c, d) -> {
    		acceptBigInt(a, b, c, d);
    		
    		after.acceptBigInt(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4Bigi} performing this operation and the
     * operations after.
     */
	default ConsumerEx4Bigi thenBigInt(ConsumerEx4Bigi... after)
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
    			acceptBigInt(a, b, c, d);
    			
    			after[0].acceptBigInt(a, b, c, d);
    		};
    	}

    	return (a, b, c, d) -> {
    		acceptBigInt(a, b, c, d);
    		
    		for(ConsumerEx4Bigi consumer : after)
    		{
    			consumer.acceptBigInt(a, b, c, d);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4Bigi} performing the operation before and
     * this operation.
     */
    default ConsumerEx4Bigi beforeBigInt(ConsumerEx4Bigi before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {
    		before.acceptBigInt(a, b, c, d);
    		
    		acceptBigInt(a, b, c, d);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4Bigi} performing the operations before
     * and this operation.
     */
    default ConsumerEx4Bigi beforeBigInt(ConsumerEx4Bigi... before)
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
    			before[0].acceptBigInt(a, b, c, d);
    			
    			acceptBigInt(a, b, c, d);
    		};
    	}
    	
    	return (a, b, c, d) -> {
    		for(ConsumerEx4Bigi consumer : before)
    		{
    			consumer.acceptBigInt(a, b, c, d);
    		}
    		
    		acceptBigInt(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4Bigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4Bigi} performing the operations.
     */
	static ConsumerEx4Bigi sequenceBigInt(ConsumerEx4Bigi... consumers)
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
    		for(ConsumerEx4Bigi consumer : consumers)
    		{
    			consumer.acceptBigInt(a, b, c, d);
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
     * @deprecated Use {@link #acceptBigInt(BigInteger, BigInteger, BigInteger, BigInteger)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigInteger a, BigInteger b, BigInteger c, BigInteger d) throws Exception
    {
    	acceptBigInt(a, b, c, d);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx4Bigi} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx4Bigi thenGeneric(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a, b, c, d) -> {
    		acceptBigInt(a, b, c, d);
    		
    		after.acceptGeneric(a, b, c, d);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx4Bigi} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerEx4Bigi thenGeneric(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger>... after)
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
        		acceptBigInt(a, b, c, d);
        		
        		after[0].acceptGeneric(a, b, c, d);
        	};
    	}

    	return (a, b, c, d) -> {
			acceptBigInt(a, b, c, d);
			
    		for(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger> consumer : after)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx4Bigi} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerEx4Bigi beforeGeneric(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b, c, d) -> {
    		before.acceptGeneric(a, b, c, d);
    		
    		acceptBigInt(a, b, c, d);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx4Bigi} performing the operations before
     * and this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerEx4Bigi beforeGeneric(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger>... before)
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
        		
        		acceptBigInt(a, b, c, d);
        	};
    	}

    	return (a, b, c, d) -> {
    		for(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger> consumer : before)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    		
    		acceptBigInt(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4Bigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4Bigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx4Bigi sequenceGeneric(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger>... consumers)
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
    		return (ConsumerEx4Bigi) consumers[0]::acceptGeneric;
    	}

    	return (a, b, c, d) -> {
    		for(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b, c, d);
    		}
    	};
    }
}
