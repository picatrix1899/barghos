package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one {@link BigDecimal} input argument and returns no result.
 * {@link Consumerbigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface
 * whose functional method is {@link #acceptBigDec(BigDecimal)}.
 * 
 * @see Consumerbigd
 * @see ConsumerExbigd
 * @see Consumer2bigd
 * @see ConsumerEx2bigd
 * @see Consumer3bigd
 * @see ConsumerEx3bigd
 * @see Consumer4bigd
 * @see ConsumerEx4bigd
 */
@FunctionalInterface
public interface Consumerbigd extends Consumer<BigDecimal>
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
     * @return A new {@link Consumerbigd} performing this operation and the operation after.
     */
    default Consumerbigd andThenBigDec(Consumerbigd after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptBigDec(a); after.acceptBigDec(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerbigd} performing this operation and the operations after.
     */
	default Consumerbigd andThenBigDec(Consumerbigd... after)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptBigDec(a); after[0].acceptBigDec(a);};

    	return (a) -> {acceptBigDec(a); for(Consumerbigd consumer : after) consumer.acceptBigDec(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerbigd} performing this operation and the operations after.
     */
	default Consumerbigd andThenBigDec(Iterable<Consumerbigd> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
    	return (a) -> {acceptBigDec(a); for(Consumerbigd consumer : after) consumer.acceptBigDec(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumerbigd} performing the operation before and this operation.
     */
    default Consumerbigd beforeThatBigDec(Consumerbigd before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {before.acceptBigDec(a); acceptBigDec(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerbigd} performing the operations before and this operation.
     */
    default Consumerbigd beforeThatBigDec(Consumerbigd... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptBigDec(a); acceptBigDec(a);};
    	
    	return (a) -> {for(Consumerbigd consumer : before) consumer.acceptBigDec(a); acceptBigDec(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerbigd} performing the operations before and this operation.
     */
    default Consumerbigd beforeThatBigDec(Iterable<Consumerbigd> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	return (a) -> {for(Consumerbigd consumer : before) consumer.acceptBigDec(a); acceptBigDec(a);};
    }
    
    /**
     * Composes a new {@link Consumerbigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerbigd} performing the operations.
     */
	static Consumerbigd inSequenceBigDec(Consumerbigd... consumers)
    {
		/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(Consumerbigd consumer : consumers) consumer.acceptBigDec(a);};
    }
    
    /**
     * Composes a new {@link Consumerbigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerbigd} performing the operations.
     */
    static Consumerbigd inSequenceBigDec(Iterable<Consumerbigd> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	return (a) -> {for(Consumerbigd consumer : consumers) consumer.acceptBigDec(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptBigDec} instead.
     */
    @Override
    @Deprecated
    default void accept(BigDecimal a)
    {
    	acceptBigDec(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumerbigd} performing this operation and the operation after.
     */
    default Consumerbigd andThen(Consumer<BigDecimal> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(after instanceof Consumerbigd)
    	{
    		final Consumerbigd originalAfter = (Consumerbigd)after;
    		
    		return (a) -> {acceptBigDec(a); originalAfter.acceptBigDec(a);};
    	}
    	else
    	{
    		return (a) -> {acceptBigDec(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerbigd} performing this operation and the operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumerbigd andThen(Consumer<BigDecimal>... after)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	/*
    	 * If exactly one operation is passed try to optimize.
    	 */
    	if(after.length == 1)
    	{
    		/*
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof Consumerbigd)
        	{
        		final Consumerbigd originalAfter = (Consumerbigd)after[0];
        		
        		return (a) -> {acceptBigDec(a); originalAfter.acceptBigDec(a);};
        	}
        	else
        	{
        		return (a) -> {acceptBigDec(a); after[0].accept(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
			acceptBigDec(a);
			
    		for(Consumer<BigDecimal> consumer : after)
    		{
    			if(consumer instanceof Consumerbigd)
    				((Consumerbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumerbigd} performing this operation and the operations after.
     */
	default Consumerbigd andThen(Iterable<Consumer<BigDecimal>> after)
    {
		/*
    	 * The argument must not be null.
    	 */
		Validation.validateNotNull(after);
		
		/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
		return (a) -> {
			acceptBigDec(a);
			
    		for(Consumer<BigDecimal> consumer : after)
    		{
    			if(consumer instanceof Consumerbigd)
    				((Consumerbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumerbigd} performing the operation before and this operation.
     */
    default Consumerbigd beforeThat(Consumer<BigDecimal> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
		 * If the passed operation is an instance of the desired type
		 * use it as the desired type to avoid boxing.
		 */
    	if(before instanceof Consumerbigd)
    	{
    		final Consumerbigd originalBefore = (Consumerbigd)before;
    		
    		return (a) -> {originalBefore.acceptBigDec(a); acceptBigDec(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptBigDec(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerbigd} performing the operations before and this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumerbigd beforeThat(Consumer<BigDecimal>... before)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	/*
    	 * If exactly one operation is passed try to optimize.
    	 */
    	if(before.length == 1)
    	{
    		/*
    		 * If the passed operation is an instance of the desired type
    		 * use it as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof Consumerbigd)
        	{
        		final Consumerbigd originalBefore = (Consumerbigd)before[0];
        		
        		return (a) -> {originalBefore.acceptBigDec(a); acceptBigDec(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptBigDec(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<BigDecimal> consumer : before)
    		{
    			if(consumer instanceof Consumerbigd)
    				((Consumerbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumerbigd} performing the operations before and this operation.
     */
    default Consumerbigd beforeThat(Iterable<Consumer<BigDecimal>> before)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(before);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<BigDecimal> consumer : before)
    		{
    			if(consumer instanceof Consumerbigd)
    				((Consumerbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptBigDec(a);
    	};
    }
    
    /**
     * Composes a new {@link Consumerbigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerbigd} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumerbigd inSequence(Consumer<BigDecimal>... consumers)
    {
    	/*
    	 * The argument array can be empty but must not be null.
    	 * Also no entry must be null.
    	 */
    	Validation.validateAllNotNull(consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly without wrapping.
    	 * Otherwise wrap the original operation in an operation of the desired type.
    	 * The optimization prevents unnecessary auto-boxing if possible and also unnecessary
    	 * creation of a new operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumerbigd)
    			return (Consumerbigd) consumers[0];
    		else
    			return (Consumerbigd) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize while
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof Consumerbigd)
    				((Consumerbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /**
     * Composes a new {@link Consumerbigd} performing the given operations in sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumerbigd} performing the operations.
     */
    static Consumerbigd inSequence(Iterable<Consumer<BigDecimal>> consumers)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(consumers);
    	
    	/*
    	 * As there is no way to determine how many operations were passed
    	 * it is not possible to optimize while composing the new operation
    	 * composing the new operation anymore. The optimization had to be postponed to execution
    	 * of the composite operation. The optimization prevents unnecessary auto-boxing if
    	 * possible.
    	 */
    	return (a) -> {
    		for(Consumer<BigDecimal> consumer : consumers)
    		{
    			if(consumer instanceof Consumerbigd)
    				((Consumerbigd)consumer).acceptBigDec(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
    
    /** {@inheritDoc} */
    @Override
    default Consumerbigd andThen(java.util.function.Consumer<? super BigDecimal> after)
    {
    	/*
    	 * The argument must not be null.
    	 */
    	Validation.validateNotNull(after);
    	
    	return (a) -> {acceptBigDec(a); after.accept(a);};
    }
}
