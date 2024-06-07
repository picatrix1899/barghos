package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two {@link BigInteger} input arguments
 * and returns no result. {@link Consumer2Bigi} is expected to operate via
 * side-effects.
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
public interface Consumer2Bigi extends Consumer2<BigInteger,BigInteger>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptBigInt(BigInteger a, BigInteger b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2Bigi} performing this operation and the
     * operation after.
     */
    default Consumer2Bigi thenBigInt(Consumer2Bigi after)
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
     * @return A new {@link Consumer2Bigi} performing this operation and the
     * operations after.
     */
	default Consumer2Bigi thenBigInt(Consumer2Bigi... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateNotNull("after", after);
    	
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
    		
    		for(Consumer2Bigi consumer : after)
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
     * @return A new {@link Consumer2Bigi} performing the operation before and
     * this operation.
     */
    default Consumer2Bigi beforeBigInt(Consumer2Bigi before)
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
     * @return A new {@link Consumer2Bigi} performing the operations before and
     * this operation.
     */
    default Consumer2Bigi beforeBigInt(Consumer2Bigi... before)
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
    		for(Consumer2Bigi consumer : before)
    		{
    			consumer.acceptBigInt(a, b);
    		}
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2Bigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2Bigi} performing the operations.
     */
	static Consumer2Bigi sequenceBigInt(Consumer2Bigi... consumers)
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
    		for(Consumer2Bigi consumer : consumers)
    		{
    			consumer.acceptBigInt(a, b);
    		}
    	};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer2
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptBigInt(BigInteger, BigInteger)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigInteger a, BigInteger b)
    {
    	acceptBigInt(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bigi} performing this operation and the
     * operation after.
     */
    default Consumer2Bigi thenGeneric(Consumer2<BigInteger,BigInteger> after)
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
     * @return A new {@link Consumer2Bigi} performing this operation and the
     * operation after.
     */
    default Consumer2Bigi thenGeneric(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a, b) -> {
    		acceptBigInt(a, b);
    		
    		after.accept(a, b);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bigi} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2Bigi thenGeneric(Consumer2<BigInteger,BigInteger>... after)
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
			
    		for(Consumer2<BigInteger,BigInteger> consumer : after)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bigi} performing the operation before and
     * this operation.
     */
    default Consumer2Bigi beforeGeneric(Consumer2<BigInteger,BigInteger> before)
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
     * @return A new {@link Consumer2Bigi} performing the operation before and
     * this operation.
     */
    default Consumer2Bigi beforeGeneric(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> before)
    {
    	Validation.validateNotNull("before", before);

    	return (a, b) -> {
    		before.accept(a, b);
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2Bigi} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2Bigi beforeGeneric(Consumer2<BigInteger,BigInteger>... before)
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
    		for(Consumer2<BigInteger,BigInteger> consumer : before)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    		
    		acceptBigInt(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2Bigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2Bigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2Bigi sequenceGeneric(Consumer2<BigInteger,BigInteger>... consumers)
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
    		return (Consumer2Bigi) consumers[0]::acceptGeneric;
    	}
    	
    	return (a, b) -> {
    		for(Consumer2<BigInteger,BigInteger> consumer : consumers)
    		{
    			consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
    /*
     * =============================
     * java.util.function.BiConsumer
     * =============================
     */
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptBigInt(BigInteger, BigInteger)} instead.
     */
    @Override
    @Deprecated
    default void accept(BigInteger a, BigInteger b)
    {
    	acceptBigInt(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.BiConsumer)} instead.
     */
    @Override
    @Deprecated
    default Consumer2Bigi andThen(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> after)
    {
    	return thenGeneric(after);
    }
}
