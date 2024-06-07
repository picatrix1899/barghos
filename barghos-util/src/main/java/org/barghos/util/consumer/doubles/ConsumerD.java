package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one double input argument and returns no
 * result. {@link ConsumerD} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptDouble(double)}.
 * 
 * @see ConsumerD
 * @see ConsumerExD
 * @see Consumer2D
 * @see ConsumerEx2D
 * @see Consumer3D
 * @see ConsumerEx3D
 * @see Consumer4D
 * @see ConsumerEx4D
 */
@FunctionalInterface
public interface ConsumerD extends Consumer<Double>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptDouble(double a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerD} performing this operation and the
     * operation after.
     */
    default ConsumerD thenDouble(ConsumerD after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptDouble(a); after.acceptDouble(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerD} performing this operation and the
     * operations after.
     */
	default ConsumerD thenDouble(ConsumerD... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptDouble(a); after[0].acceptDouble(a);};

    	return (a) -> {acceptDouble(a); for(ConsumerD consumer : after) consumer.acceptDouble(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerD} performing the operation before and this
     * operation.
     */
    default ConsumerD beforeDouble(ConsumerD before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptDouble(a); acceptDouble(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerD} performing the operations before and this
     * operation.
     */
    default ConsumerD beforeDouble(ConsumerD... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptDouble(a); acceptDouble(a);};
    	
    	return (a) -> {for(ConsumerD consumer : before) consumer.acceptDouble(a); acceptDouble(a);};
    }
    
    /**
     * Composes a new {@link ConsumerD} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerD} performing the operations.
     */
	static ConsumerD sequenceDouble(ConsumerD... consumers)
    {
		Validation.validateNotNull("consumers", consumers);
		Validation.validateEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0) return (a) -> {};
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1) return consumers[0];
    	
    	return (a) -> {for(ConsumerD consumer : consumers) consumer.acceptDouble(a);};
    }
    
	/*
     * ==================================
     * org.barghos.util.consumer.Consumer
     * ==================================
     */
	
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #acceptDouble(double)} instead.
     */
    @Override
    @Deprecated
    default void acceptGeneric(Double a)
    {
    	acceptDouble(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerD} performing this operation and the
     * operation after.
     */
    default ConsumerD thenGeneric(Consumer<Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerD)
    	{
    		final ConsumerD originalAfter = (ConsumerD)after;
    		
    		return (a) -> {acceptDouble(a); originalAfter.acceptDouble(a);};
    	}
    	else
    	{
    		return (a) -> {acceptDouble(a); after.acceptGeneric(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerD} performing this operation and the
     * operation after.
     */
    default ConsumerD thenGeneric(java.util.function.Consumer<? super Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerD)
    	{
    		final ConsumerD originalAfter = (ConsumerD)after;
    		
    		return (a) -> {acceptDouble(a); originalAfter.acceptDouble(a);};
    	}
    	else
    	{
    		return (a) -> {acceptDouble(a); after.accept(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerD} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerD thenGeneric(Consumer<Double>... after)
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
    		if(after[0] instanceof ConsumerD)
        	{
        		final ConsumerD originalAfter = (ConsumerD)after[0];
        		
        		return (a) -> {acceptDouble(a); originalAfter.acceptDouble(a);};
        	}
        	else
        	{
        		return (a) -> {acceptDouble(a); after[0].acceptGeneric(a);};
        	}
    	}

    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
			acceptDouble(a);
			
    		for(Consumer<Double> consumer : after)
    		{
    			if(consumer instanceof ConsumerD)
    				((ConsumerD)consumer).acceptDouble(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    	};
    }
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerD} performing the operation before and this
     * operation.
     */
    default ConsumerD beforeGeneric(Consumer<Double> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerD)
    	{
    		final ConsumerD originalBefore = (ConsumerD)before;
    		
    		return (a) -> {originalBefore.acceptDouble(a); acceptDouble(a);};
    	}
    	else
    	{
    		return (a) -> {before.acceptGeneric(a); acceptDouble(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerD} performing the operation before and this
     * operation.
     */
    default ConsumerD beforeGeneric(java.util.function.Consumer<? super Double> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerD)
    	{
    		final ConsumerD originalBefore = (ConsumerD)before;
    		
    		return (a) -> {originalBefore.acceptDouble(a); acceptDouble(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptDouble(a);};
    	}
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerD} performing the operations before and this
     * operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerD beforeGeneric(Consumer<Double>... before)
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
    		if(before[0] instanceof ConsumerD)
        	{
        		final ConsumerD originalBefore = (ConsumerD)before[0];
        		
        		return (a) -> {originalBefore.acceptDouble(a); acceptDouble(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].acceptGeneric(a); acceptDouble(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Double> consumer : before)
    		{
    			if(consumer instanceof ConsumerD)
    				((ConsumerD)consumer).acceptDouble(a);
    			else
    				consumer.acceptGeneric(a);
    		}
    		
    		acceptDouble(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerD} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerD} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerD sequenceGeneric(Consumer<Double>... consumers)
    {
    	Validation.validateNotNull("consumers", consumers);
    	Validation.validateEntriesNotNull("consumers", consumers);
    	
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
    		if(consumers[0] instanceof ConsumerD)
    			return (ConsumerD) consumers[0];
    		else
    			return (ConsumerD) consumers[0]::acceptGeneric;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(Consumer<Double> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerD)
    				((ConsumerD)consumer).acceptDouble(a);
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
     * @deprecated Use {@link #acceptDouble(double)} instead.
     */
    @Override
    @Deprecated
    default void accept(Double a)
    {
    	acceptDouble(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated
     * Use {@link #thenGeneric(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated
    default ConsumerD andThen(java.util.function.Consumer<? super Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptDouble(a); after.accept(a);};
    }
}
