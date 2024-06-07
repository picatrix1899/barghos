package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two {@link BigInteger} input arguments
 * and returns no result. Unlike {@link Consumer2Bigi} this may throw
 * exceptions. {@link ConsumerEx2Bigi} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBigInt(BigInteger, BigInteger)}.
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
public interface ConsumerEx2Bigi extends ConsumerEx2<BigInteger,BigInteger>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBigInt(BigInteger a, BigInteger b) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2Bigi} performing this operation and the
     * operation after.
     */
    default ConsumerEx2Bigi thenBigInt(ConsumerEx2Bigi after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {
    		acceptBigInt(a, b);
    		
    		after.acceptBigInt(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerEx2Bigi} performing this operation and the
     * operations after.
     */
	default ConsumerEx2Bigi thenBigInt(ConsumerEx2Bigi... after)
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
    			acceptBigInt(a, b);
    			
    			after[0].acceptBigInt(a, b);
    		};
    	}

    	return (a, b) -> {
    		acceptBigInt(a, b);
    		
    		for(ConsumerEx2Bigi consumer : after)
    		{
    			consumer.acceptBigInt(a, b);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Bigi} performing the operation before and
     * this operation.
     */
    default ConsumerEx2Bigi beforeBigInt(ConsumerEx2Bigi before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {
    		before.acceptBigInt(a, b);
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerEx2Bigi} performing the operations before
     * and this operation.
     */
    default ConsumerEx2Bigi beforeBigInt(ConsumerEx2Bigi... before)
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
    			before[0].acceptBigInt(a, b);
    			
    			acceptBigInt(a, b);
    		};
    	}
    	
    	return (a, b) -> {
    		for(ConsumerEx2Bigi consumer : before)
    		{
    			consumer.acceptBigInt(a, b);
    		}
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2Bigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2Bigi} performing the operations.
     */
	static ConsumerEx2Bigi sequenceBigInt(ConsumerEx2Bigi... consumers)
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
    		for(ConsumerEx2Bigi consumer : consumers)
    		{
    			consumer.acceptBigInt(a, b);
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
     * @deprecated Use {@link #acceptBigInt(BigInteger, BigInteger)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigInteger a, BigInteger b) throws Exception
    {
    	acceptBigInt(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx2Bigi} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx2Bigi thenGeneric(ConsumerEx2<BigInteger,BigInteger> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a, b) -> {
    		acceptBigInt(a, b);
    		
    		after.acceptGeneric(a, b);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx2Bigi} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerEx2Bigi thenGeneric(ConsumerEx2<BigInteger,BigInteger>... after)
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
        		acceptBigInt(a, b);
        		
        		after[0].acceptGeneric(a, b);
        	};
    	}

    	return (a, b) -> {
			acceptBigInt(a, b);
			
    		for(ConsumerEx2<BigInteger,BigInteger> consumer : after)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx2Bigi} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerEx2Bigi beforeGeneric(ConsumerEx2<BigInteger,BigInteger> before)
    {
    	Validation.validateNotNull("before", before);

    	return (a, b) -> {
    		before.acceptGeneric(a, b);
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx2Bigi} performing the operations before
     * and this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerEx2Bigi beforeGeneric(ConsumerEx2<BigInteger,BigInteger>... before)
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

        		acceptBigInt(a, b);
        	};
    	}

    	return (a, b) -> {
    		for(ConsumerEx2<BigInteger,BigInteger> consumer : before)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx2Bigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx2Bigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerEx2Bigi sequenceGeneric(ConsumerEx2<BigInteger,BigInteger>... consumers)
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
    		return (ConsumerEx2Bigi) consumers[0]::acceptGeneric;
    	}

    	return (a, b) -> {
    		for(ConsumerEx2<BigInteger,BigInteger> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    	};
    }
}
