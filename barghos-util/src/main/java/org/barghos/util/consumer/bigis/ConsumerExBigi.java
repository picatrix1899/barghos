package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one {@link BigInteger} input argument
 * and returns no result. Unlike {@link ConsumerBigi} this may throw exceptions.
 * {@link ConsumerExBigi} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBigInt(BigInteger)}.
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
public interface ConsumerExBigi extends ConsumerEx<BigInteger>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptBigInt(BigInteger a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExBigi} performing this operation and the
     * operation after.
     */
    default ConsumerExBigi thenBigInt(ConsumerExBigi after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {
    		acceptBigInt(a);
    		
    		after.acceptBigInt(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExBigi} performing this operation and the
     * operations after.
     */
	default ConsumerExBigi thenBigInt(ConsumerExBigi... after)
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
    		return (a) -> {
    			acceptBigInt(a);
    			
    			after[0].acceptBigInt(a);
    		};
    	}

    	return (a) -> {
    		acceptBigInt(a);
    		
    		for(ConsumerExBigi consumer : after)
    		{
    			consumer.acceptBigInt(a);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExBigi} performing the operation before and
     * this operation.
     */
    default ConsumerExBigi beforeBigInt(ConsumerExBigi before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {
    		before.acceptBigInt(a);
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExBigi} performing the operations before and
     * this operation.
     */
    default ConsumerExBigi beforeBigInt(ConsumerExBigi... before)
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
    		return (a) -> {
    			before[0].acceptBigInt(a);
    			
    			acceptBigInt(a);
    		};
    	}
    	
    	return (a) -> {
    		for(ConsumerExBigi consumer : before)
    		{
    			consumer.acceptBigInt(a);
    		}
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExBigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExBigi} performing the operations.
     */
	static ConsumerExBigi sequenceBigInt(ConsumerExBigi... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a) -> {};
    	}
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1)
    	{
    		return consumers[0];
    	}
    	
    	return (a) -> {
    		for(ConsumerExBigi consumer : consumers)
    		{
    			consumer.acceptBigInt(a);
    		}
    	};
    }
    
	/*
     * ====================================
     * org.barghos.util.consumer.ConsumerEx
     * ====================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptBigInt(BigInteger)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigInteger a) throws Exception
    {
    	acceptBigInt(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExBigi} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerExBigi thenGeneric(ConsumerEx<BigInteger> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a) -> {
    		acceptBigInt(a);
    		
    		after.acceptGeneric(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExBigi} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerExBigi thenGeneric(ConsumerEx<BigInteger>... after)
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
    		return (a) -> {
    			acceptBigInt(a);
    			
    			after[0].acceptGeneric(a);
    		};
    	}

    	return (a) -> {
			acceptBigInt(a);
			
    		for(ConsumerEx<BigInteger> consumer : after)
    		{
    			consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExBigi} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerExBigi beforeGeneric(ConsumerEx<BigInteger> before)
    {
    	Validation.validateNotNull("before", before);

    	return (a) -> {
    		before.acceptGeneric(a);
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExBigi} performing the operations before and
     * this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerExBigi beforeGeneric(ConsumerEx<BigInteger>... before)
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
        	return (a) -> {
        		before[0].acceptGeneric(a);
        		
        		acceptBigInt(a);
        	};
    	}

    	return (a) -> {
    		for(ConsumerEx<BigInteger> consumer : before)
    		{
    			consumer.acceptGeneric(a);
    		}
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExBigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExBigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExBigi sequenceGeneric(ConsumerEx<BigInteger>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a) -> {};
    	}

    	if(consumers.length == 1)
    	{
    		return (ConsumerExBigi) consumers[0]::acceptGeneric;
    	}

    	return (a) -> {
    		for(ConsumerEx<BigInteger> consumer : consumers)
    		{
    			consumer.acceptGeneric(a);
    		}
    	};
    }
}
