package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one {@link BigDecimal} input argument
 * and returns no result. {@link ConsumerBigd} is expected to operate via
 * side-effects.
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
public interface ConsumerBigd extends Consumer<BigDecimal>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptBigDec(BigDecimal a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerBigd} performing this operation and the
     * operation after.
     */
    default ConsumerBigd thenBigDec(ConsumerBigd after)
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
     * @return A new {@link ConsumerBigd} performing this operation and the
     * operations after.
     */
	default ConsumerBigd thenBigDec(ConsumerBigd... after)
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
    		
    		for(ConsumerBigd consumer : after)
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
     * @return A new {@link ConsumerBigd} performing the operation before and
     * this operation.
     */
    default ConsumerBigd beforeBigDec(ConsumerBigd before)
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
     * @return A new {@link ConsumerBigd} performing the operations before and
     * this operation.
     */
    default ConsumerBigd beforeBigDec(ConsumerBigd... before)
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
    			before[0].acceptBigDec(a);
    			
    			acceptBigDec(a);
    		};
    	}
    	
    	return (a) -> {
    		for(ConsumerBigd consumer : before)
    		{
    			consumer.acceptBigDec(a);
    		}
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerBigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerBigd} performing the operations.
     */
	static ConsumerBigd sequenceBigDec(ConsumerBigd... consumers)
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
    		for(ConsumerBigd consumer : consumers)
    		{
    			consumer.acceptBigDec(a);
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
     * @deprecated Use {@link #acceptBigDec(BigDecimal)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(BigDecimal a)
    {
    	acceptBigDec(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBigd} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerBigd thenGeneric(Consumer<BigDecimal> after)
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
     * @return A new {@link ConsumerBigd} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerBigd thenGeneric(java.util.function.Consumer<? super BigDecimal> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {
    		acceptBigDec(a);
    		
    		after.accept(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBigd} performing this operation and the
     * operations after.
     */
    @Override
    @SuppressWarnings("unchecked")
	default ConsumerBigd thenGeneric(Consumer<BigDecimal>... after)
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
    		
    		for(Consumer<BigDecimal> consumer : after)
    		{
    			consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBigd} performing the operation before and
     * this operation.
     */
    @Override
    default ConsumerBigd beforeGeneric(Consumer<BigDecimal> before)
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
     * @return A new {@link ConsumerBigd} performing the operation before and
     * this operation.
     */
	@Override
	default ConsumerBigd beforeGeneric(java.util.function.Consumer<? super BigDecimal> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {
    		before.accept(a);
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerBigd} performing the operations before and
     * this operation.
     */
    @Override
    @SuppressWarnings("unchecked")
    default ConsumerBigd beforeGeneric(Consumer<BigDecimal>... before)
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
    		for(Consumer<BigDecimal> consumer : before)
    		{
    			consumer.acceptGeneric(a);
    		}
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerBigd} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerBigd} performing the operations.
     */
    @SuppressWarnings({"unchecked"})
	static ConsumerBigd sequenceGeneric(Consumer<BigDecimal>... consumers)
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
    		return (ConsumerBigd) consumers[0]::acceptGeneric;
    	}
    	
    	return (a) -> {
    		for(Consumer<BigDecimal> consumer : consumers)
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
     * @deprecated Use {@link #acceptBigDec(BigDecimal)} instead.
     */
    @Override
    @Deprecated
    default void accept(BigDecimal a)
    {
    	acceptBigDec(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerBigd andThen(java.util.function.Consumer<? super BigDecimal> after)
    {
    	return thenGeneric(after);
    }
}
