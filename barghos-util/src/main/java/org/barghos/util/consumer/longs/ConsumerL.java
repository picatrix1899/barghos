package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one long input argument and returns no
 * result. {@link ConsumerL} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptLong(long)}.
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
public interface ConsumerL extends Consumer<Long>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptLong(long a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerL} performing this operation and the
     * operation after.
     */
    default ConsumerL thenLong(ConsumerL after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptLong(a); after.acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerL} performing this operation and the
     * operations after.
     */
	default ConsumerL thenLong(ConsumerL... after)
    {
		Validation.validateNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptLong(a); after[0].acceptLong(a);};

    	return (a) -> {acceptLong(a); for(ConsumerL consumer : after) consumer.acceptLong(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerL} performing the operation before and this
     * operation.
     */
    default ConsumerL beforeLong(ConsumerL before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptLong(a); acceptLong(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerL} performing the operations before and this
     * operation.
     */
    default ConsumerL beforeLong(ConsumerL... before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptLong(a); acceptLong(a);};
    	
    	return (a) -> {for(ConsumerL consumer : before) consumer.acceptLong(a); acceptLong(a);};
    }
    
    /**
     * Composes a new {@link ConsumerL} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerL} performing the operations.
     */
	static ConsumerL sequenceLong(ConsumerL... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerL consumer : consumers) consumer.acceptLong(a);};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptLong(long)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Long a)
    {
    	acceptLong(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerL} performing this operation and the
     * operation after.
     */
    default ConsumerL thenGeneric(Consumer<Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerL)
    	{
    		final ConsumerL originalAfter = (ConsumerL)after;
    		
    		return (a) -> {acceptLong(a); originalAfter.acceptLong(a);};
    	}
    	else
    	{
    		return (a) -> {acceptLong(a); after.acceptGeneric(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerL} performing this operation and the
     * operation after.
     */
    default ConsumerL thenGeneric(java.util.function.Consumer<? super Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerL)
    	{
    		final ConsumerL originalAfter = (ConsumerL)after;
    		
    		return (a) -> {acceptLong(a); originalAfter.acceptLong(a);};
    	}
    	else
    	{
    		return (a) -> {acceptLong(a); after.accept(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerL} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerL thenGeneric(Consumer<Long>... after)
    {
    	Validation.validateNotNull("after", after);
    	
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
    		if(after[0] instanceof ConsumerL)
        	{
        		final ConsumerL originalAfter = (ConsumerL)after[0];
        		
        		return (a) -> {acceptLong(a); originalAfter.acceptLong(a);};
        	}
        	else
        	{
        		return (a) -> {acceptLong(a); after[0].acceptGeneric(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptLong(a);
			
    		for(Consumer<Long> consumer : after)
    		{
    			if(consumer instanceof ConsumerL)
    				((ConsumerL)consumer).acceptLong(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerL} performing the operation before and this
     * operation.
     */
    default ConsumerL beforeGeneric(Consumer<Long> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerL)
    	{
    		final ConsumerL originalBefore = (ConsumerL)before;
    		
    		return (a) -> {originalBefore.acceptLong(a); acceptLong(a);};
    	}
    	else
    	{
    		return (a) -> {before.acceptGeneric(a); acceptLong(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerL} performing the operation before and this
     * operation.
     */
    default ConsumerL beforeGeneric(java.util.function.Consumer<? super Long> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerL)
    	{
    		final ConsumerL originalBefore = (ConsumerL)before;
    		
    		return (a) -> {originalBefore.acceptLong(a); acceptLong(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptLong(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerL} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerL beforeGeneric(Consumer<Long>... before)
    {
    	Validation.validateNotNull("before", before);
    	
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
    		if(before[0] instanceof ConsumerL)
        	{
        		final ConsumerL originalBefore = (ConsumerL)before[0];
        		
        		return (a) -> {originalBefore.acceptLong(a); acceptLong(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].acceptGeneric(a); acceptLong(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Long> consumer : before)
    		{
    			if(consumer instanceof ConsumerL)
    				((ConsumerL)consumer).acceptLong(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    		
    		acceptLong(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerL} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerL} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerL sequenceGeneric(Consumer<Long>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
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
    		if(consumers[0] instanceof ConsumerL)
    			return (ConsumerL) consumers[0];
    		else
    			return (ConsumerL) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Long> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerL)
    				((ConsumerL)consumer).acceptLong(a);
    			else
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
     * @deprecated Use {@link #acceptLong(long)} instead.
     */
    @Override
    @Deprecated
    default void accept(Long a)
    {
    	acceptLong(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerL andThen(java.util.function.Consumer<? super Long> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptLong(a); after.accept(a);};
    }
}
