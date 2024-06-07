package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one {@link BigDecimal} input argument
 * and returns no result. Unlike {@link ConsumerBigd} this may throw
 * exceptions. {@link ConsumerExBigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptBigDec(BigDecimal)}.
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
public interface ConsumerExBigd extends ConsumerEx<BigDecimal>
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
     * @return A new {@link ConsumerExBigd} performing this operation and the
     * operation after.
     */
    default ConsumerExBigd thenBigDec(ConsumerExBigd after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {
    		acceptBigDec(a);
    		
    		after.acceptBigDec(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExBigd} performing this operation and the
     * operations after.
     */
	default ConsumerExBigd thenBigDec(ConsumerExBigd... after)
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
    			acceptBigDec(a);
    			
    			after[0].acceptBigDec(a);
    		};
    	}

    	return (a) -> {
    		acceptBigDec(a);
    		
    		for(ConsumerExBigd consumer : after)
    		{
    			consumer.acceptBigDec(a);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExBigd} performing the operation before and
     * this operation.
     */
    default ConsumerExBigd beforeBigDec(ConsumerExBigd before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {
    		before.acceptBigDec(a);
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExBigd} performing the operations before and
     * this operation.
     */
    default ConsumerExBigd beforeBigDec(ConsumerExBigd... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {
    		before[0].acceptBigDec(a);
    		
    		acceptBigDec(a);
    	};
    	
    	return (a) -> {
    		for(ConsumerExBigd consumer : before)
    		{
    			consumer.acceptBigDec(a);
    		}
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExBigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExBigd} performing the operations.
     */
	static ConsumerExBigd sequenceBigDec(ConsumerExBigd... consumers)
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
    		for(ConsumerExBigd consumer : consumers)
    		{
    			consumer.acceptBigDec(a);
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
     * @deprecated Use {@link #acceptBigDec(BigDecimal)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigDecimal a) throws Exception
    {
    	acceptBigDec(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExBigd} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerExBigd thenGeneric(ConsumerEx<BigDecimal> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {
    		acceptBigDec(a);
    		
    		after.acceptGeneric(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExBigd} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerExBigd thenGeneric(ConsumerEx<BigDecimal>... after)
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
        		acceptBigDec(a);
        		
        		after[0].acceptGeneric(a);
        	};
    	}

    	return (a) -> {
			acceptBigDec(a);
			
    		for(ConsumerEx<BigDecimal> consumer : after)
    		{
    			consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExBigd} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerExBigd beforeGeneric(ConsumerEx<BigDecimal> before)
    {
    	Validation.validateNotNull("before", before);

    	return (a) -> {
    		before.acceptGeneric(a);
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExBigd} performing the operations before and
     * this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerExBigd beforeGeneric(ConsumerEx<BigDecimal>... before)
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
        		
        		acceptBigDec(a);
        	};
    	}

    	return (a) -> {
    		for(ConsumerEx<BigDecimal> consumer : before)
    		{
    			consumer.acceptGeneric(a);
    		}
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExBigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExBigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExBigd sequenceGeneric(ConsumerEx<BigDecimal>... consumers)
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
    		return (ConsumerExBigd) consumers[0]::acceptGeneric;
    	}

    	return (a) -> {
    		for(ConsumerEx<BigDecimal> consumer : consumers)
    		{
    			consumer.acceptGeneric(a);
    		}
    	};
    }
}
