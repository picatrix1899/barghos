package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts two long input arguments and returns no
 * result. {@link Consumer2L} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptLong(long, long)}.
 * 
 * @see ConsumerL
 * @see ConsumerExL
 * @see Consumer2L
 * @see ConsumerEx2L
 * @see Consumer3L
 * @see ConsumerEx3L
 * @see Consumer4L
 * @see ConsumerEx4L
 */
@FunctionalInterface
public interface Consumer2L extends Consumer2<Long,Long>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptLong(long a, long b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2L} performing this operation and the
     * operation after.
     */
    default Consumer2L thenLong(Consumer2L after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptLong(a, b); after.acceptLong(a, b);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link Consumer2L} performing this operation and the
     * operations after.
     */
	default Consumer2L thenLong(Consumer2L... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a, b) -> {acceptLong(a, b); after[0].acceptLong(a, b);};

    	return (a, b) -> {acceptLong(a, b); for(Consumer2L consumer : after) consumer.acceptLong(a, b);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2L} performing the operation before and this
     * operation.
     */
    default Consumer2L beforeLong(Consumer2L before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a, b) -> {before.acceptLong(a, b); acceptLong(a, b);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link Consumer2L} performing the operations before and
     * this operation.
     */
    default Consumer2L beforeLong(Consumer2L... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a, b) -> {before[0].acceptLong(a, b); acceptLong(a, b);};
    	
    	return (a, b) -> {for(Consumer2L consumer : before) consumer.acceptLong(a, b); acceptLong(a, b);};
    }
    
    /**
     * Composes a new {@link Consumer2L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2L} performing the operations.
     */
	static Consumer2L sequenceLong(Consumer2L... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a, b) -> {for(Consumer2L consumer : consumers) consumer.acceptLong(a, b);};
    }
    
	/*
     * ===================================
     * org.barghos.util.consumer.Consumer2
     * ===================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptLong(long, long)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Long a, Long b)
    {
    	acceptLong(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2L} performing this operation and the
     * operation after.
     */
    default Consumer2L thenGeneric(Consumer2<Long,Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2L)
    	{
    		final Consumer2L originalAfter = (Consumer2L)after;
    		
    		return (a, b) -> {acceptLong(a, b); originalAfter.acceptLong(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptLong(a, b); after.acceptGeneric(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2L} performing this operation and the
     * operation after.
     */
    default Consumer2L thenGeneric(java.util.function.BiConsumer<? super Long,? super Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof Consumer2L)
    	{
    		final Consumer2L originalAfter = (Consumer2L)after;
    		
    		return (a, b) -> {acceptLong(a, b); originalAfter.acceptLong(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {acceptLong(a, b); after.accept(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2L} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default Consumer2L thenGeneric(Consumer2<Long,Long>... after)
    {
    	Validation.validateNotNull("after", after);
    	Validation.validateEntriesNotNull("after", after);
    	
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
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(after[0] instanceof Consumer2L)
        	{
        		final Consumer2L originalAfter = (Consumer2L)after[0];
        		
        		return (a, b) -> {acceptLong(a, b); originalAfter.acceptLong(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {acceptLong(a, b); after[0].acceptGeneric(a, b);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
			acceptLong(a, b);
			
    		for(Consumer2<Long,Long> consumer : after)
    		{
    			if(consumer instanceof Consumer2L)
    				((Consumer2L)consumer).acceptLong(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2L} performing the operation before and this
     * operation.
     */
    default Consumer2L beforeGeneric(Consumer2<Long,Long> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2L)
    	{
    		final Consumer2L originalBefore = (Consumer2L)before;
    		
    		return (a, b) -> {originalBefore.acceptLong(a, b); acceptLong(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.acceptGeneric(a, b); acceptLong(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2L} performing the operation before and this
     * operation.
     */
    default Consumer2L beforeGeneric(java.util.function.BiConsumer<? super Long,? super Long> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof Consumer2L)
    	{
    		final Consumer2L originalBefore = (Consumer2L)before;
    		
    		return (a, b) -> {originalBefore.acceptLong(a, b); acceptLong(a, b);};
    	}
    	else
    	{
    		return (a, b) -> {before.accept(a, b); acceptLong(a, b);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2L} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default Consumer2L beforeGeneric(Consumer2<Long,Long>... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
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
    		 * If the passed operation is an instance of the desired type use it
    		 * as the desired type to avoid boxing.
    		 */
    		if(before[0] instanceof Consumer2L)
        	{
        		final Consumer2L originalBefore = (Consumer2L)before[0];
        		
        		return (a, b) -> {originalBefore.acceptLong(a, b); acceptLong(a, b);};
        	}
        	else
        	{
        		return (a, b) -> {before[0].acceptGeneric(a, b); acceptLong(a, b);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Long,Long> consumer : before)
    		{
    			if(consumer instanceof Consumer2L)
    				((Consumer2L)consumer).acceptLong(a, b);
    			else
    				consumer.acceptGeneric(a, b);
    		}
    		
    		acceptLong(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2L} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2L} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static Consumer2L sequenceGeneric(Consumer2<Long,Long>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a, b) -> {};
    	
    	/*
    	 * If exactly one operation is passed try to optimize. If the operation
    	 * is an instance of the desired type return the operation directly
    	 * without wrapping. Otherwise wrap the original operation in an
    	 * operation of the desired type. The optimization prevents unnecessary
    	 * auto-boxing if possible and also unnecessary creation of a new
    	 * operation.
    	 */
    	if(consumers.length == 1)
    	{
    		if(consumers[0] instanceof Consumer2L)
    			return (Consumer2L) consumers[0];
    		else
    			return (Consumer2L) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a, b) -> {
    		for(Consumer2<Long,Long> consumer : consumers)
    		{
    			if(consumer instanceof Consumer2L)
    				((Consumer2L)consumer).acceptLong(a, b);
    			else
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
     * @deprecated Use {@link #acceptLong(long, long)} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a, Long b)
    {
    	acceptLong(a, b);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.BiConsumer)} instead.
     */
    @Override
    @Deprecated
    default Consumer2L andThen(java.util.function.BiConsumer<? super Long,? super Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a, b) -> {acceptLong(a, b); after.accept(a, b);};
    }
}
