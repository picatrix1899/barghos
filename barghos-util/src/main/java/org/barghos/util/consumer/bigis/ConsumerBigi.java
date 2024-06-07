package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one {@link BigInteger} input argument
 * and returns no result. {@link ConsumerBigi} is expected to operate via
 * side-effects.
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
public interface ConsumerBigi extends Consumer<BigInteger>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptBigInt(BigInteger a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerBigi} performing this operation and the
     * operation after.
     */
    default ConsumerBigi thenBigInt(ConsumerBigi after)
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
     * @return A new {@link ConsumerBigi} performing this operation and the
     * operations after.
     */
	default ConsumerBigi thenBigInt(ConsumerBigi... after)
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
    		
    		for(ConsumerBigi consumer : after)
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
     * @return A new {@link ConsumerBigi} performing the operation before and
     * this operation.
     */
    default ConsumerBigi beforeBigInt(ConsumerBigi before)
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
     * @return A new {@link ConsumerBigi} performing the operations before and
     * this operation.
     */
    default ConsumerBigi beforeBigInt(ConsumerBigi... before)
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
    		for(ConsumerBigi consumer : before)
    		{
    			consumer.acceptBigInt(a);
    		}
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerBigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerBigi} performing the operations.
     */
	static ConsumerBigi sequenceBigInt(ConsumerBigi... consumers)
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
    		for(ConsumerBigi consumer : consumers)
    		{
    			consumer.acceptBigInt(a);
    		}
    	};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptBigInt(BigInteger)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigInteger a)
    {
    	acceptBigInt(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBigi} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerBigi thenGeneric(Consumer<BigInteger> after)
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
     * @return A new {@link ConsumerBigi} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerBigi thenGeneric(java.util.function.Consumer<? super BigInteger> after)
    {
    	Validation.validateNotNull("after", after);

    	return (a) -> {
    		acceptBigInt(a);
    		
    		after.accept(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBigi} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerBigi thenGeneric(Consumer<BigInteger>... after)
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
			
    		for(Consumer<BigInteger> consumer : after)
    		{
    			consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBigi} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerBigi beforeGeneric(Consumer<BigInteger> before)
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
     * @return A new {@link ConsumerBigi} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerBigi beforeGeneric(java.util.function.Consumer<? super BigInteger> before)
    {
    	Validation.validateNotNull("before", before);

    	return (a) -> {
    		before.accept(a);
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBigi} performing the operations before and
     * this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerBigi beforeGeneric(Consumer<BigInteger>... before)
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
    		for(Consumer<BigInteger> consumer : before)
    		{
    			consumer.acceptGeneric(a);
    		}
    		
    		acceptBigInt(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerBigi} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerBigi} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerBigi sequenceGeneric(Consumer<BigInteger>... consumers)
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
    		return (ConsumerBigi) consumers[0]::acceptGeneric;
    	}

    	return (a) -> {
    		for(Consumer<BigInteger> consumer : consumers)
    		{
    			consumer.acceptGeneric(a);
    		}
    	};
    }
    
    /*
     * ===========================
     * java.util.function.Consumer
     * ===========================
     */
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptBigInt(BigInteger)} instead.
     */
    @Override
    @Deprecated
    default void accept(BigInteger a)
    {
    	acceptBigInt(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerBigi andThen(java.util.function.Consumer<? super BigInteger> after)
    {
    	return thenGeneric(after);
    }
}
