package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validation;

/**
 * Represents an operation that accepts one double input argument and returns no
 * result. Unlike {@link ConsumerD} this may throw Exceptions.
 * {@link ConsumerExD} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptDouble}.
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
public interface ConsumerExD extends ConsumerEx<Double>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptDouble(double a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExD} performing this operation and the
     * operation after.
     */
    default ConsumerExD thenDouble(ConsumerExD after)
    {
    	Validation.validateNotNull("after", after);
    	
    	return (a) -> {acceptDouble(a); after.acceptDouble(a);};
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExD} performing this operation and the
     * operations after.
     */
	default ConsumerExD thenDouble(ConsumerExD... after)
    {
		Validation.validateNotNull("after", after);
		Validation.validateEntriesNotNull("after", after);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(after.length == 0) return this;
    	
    	if(after.length == 1) return (a) -> {acceptDouble(a); after[0].acceptDouble(a);};

    	return (a) -> {acceptDouble(a); for(ConsumerExD consumer : after) consumer.acceptDouble(a);};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExD} performing the operation before and
     * this operation.
     */
    default ConsumerExD beforeDouble(ConsumerExD before)
    {
    	Validation.validateNotNull("before", before);
    	
    	return (a) -> {before.acceptDouble(a); acceptDouble(a);};
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExD} performing the operations before and
     * this operation.
     */
    default ConsumerExD beforeDouble(ConsumerExD... before)
    {
    	Validation.validateNotNull("before", before);
    	Validation.validateEntriesNotNull("before", before);
    	
    	/*
    	 * If no operations are passed return this operation.
    	 */
    	if(before.length == 0) return this;
    	
    	if(before.length == 1) return (a) -> {before[0].acceptDouble(a); acceptDouble(a);};
    	
    	return (a) -> {for(ConsumerExD consumer : before) consumer.acceptDouble(a); acceptDouble(a);};
    }
    
    /**
     * Composes a new {@link ConsumerExD} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExD} performing the operations.
     */
	static ConsumerExD sequenceDouble(ConsumerExD... consumers)
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
    	
    	return (a) -> {for(ConsumerExD consumer : consumers) consumer.acceptDouble(a);};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link acceptDouble} instead.
     */
    @Override
    @Deprecated
    default void accept(Double a) throws Exception
    {
    	acceptDouble(a);
    }
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExD} performing this operation and the
     * operation after.
     */
    default ConsumerExD then(ConsumerEx<Double> after)
    {
    	Validation.validateNotNull("after", after);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(after instanceof ConsumerExD)
    	{
    		final ConsumerExD originalAfter = (ConsumerExD)after;
    		
    		return (a) -> {acceptDouble(a); originalAfter.acceptDouble(a);};
    	}
    	else
    	{
    		return (a) -> {acceptDouble(a); after.accept(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence after this operation.
     * 
     * @param after The operations to perform after this operation.
     * 
     * @return A new {@link ConsumerExD} performing this operation and the
     * operations after.
     */
    @SuppressWarnings("unchecked")
	default ConsumerExD then(ConsumerEx<Double>... after)
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
    		if(after[0] instanceof ConsumerExD)
        	{
        		final ConsumerExD originalAfter = (ConsumerExD)after[0];
        		
        		return (a) -> {acceptDouble(a); originalAfter.acceptDouble(a);};
        	}
        	else
        	{
        		return (a) -> {acceptDouble(a); after[0].accept(a);};
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
			
    		for(ConsumerEx<Double> consumer : after)
    		{
    			if(consumer instanceof ConsumerExD)
    				((ConsumerExD)consumer).acceptDouble(a);
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
     * @return A new {@link ConsumerExD} performing the operation before and
     * this operation.
     */
    default ConsumerExD before(ConsumerEx<Double> before)
    {
    	Validation.validateNotNull("before", before);
    	
    	/*
		 * If the passed operation is an instance of the desired type use it as
		 * the desired type to avoid boxing.
		 */
    	if(before instanceof ConsumerExD)
    	{
    		final ConsumerExD originalBefore = (ConsumerExD)before;
    		
    		return (a) -> {originalBefore.acceptDouble(a); acceptDouble(a);};
    	}
    	else
    	{
    		return (a) -> {before.accept(a); acceptDouble(a);};
    	}
    }
    
    /**
     * Performs the given operations in sequence before this operation.
     * 
     * @param before The operations to perform before this operation.
     * 
     * @return A new {@link ConsumerExD} performing the operations before and
     * this operation.
     */
    @SuppressWarnings("unchecked")
    default ConsumerExD before(ConsumerEx<Double>... before)
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
    		if(before[0] instanceof ConsumerExD)
        	{
        		final ConsumerExD originalBefore = (ConsumerExD)before[0];
        		
        		return (a) -> {originalBefore.acceptDouble(a); acceptDouble(a);};
        	}
        	else
        	{
        		return (a) -> {before[0].accept(a); acceptDouble(a);};
        	}
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Double> consumer : before)
    		{
    			if(consumer instanceof ConsumerExD)
    				((ConsumerExD)consumer).acceptDouble(a);
    			else
    				consumer.accept(a);
    		}
    		
    		acceptDouble(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExD} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExD} performing the operations.
     */
    @SuppressWarnings("unchecked")
	static ConsumerExD sequence(ConsumerEx<Double>... consumers)
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
    		if(consumers[0] instanceof ConsumerExD)
    			return (ConsumerExD) consumers[0];
    		else
    			return (ConsumerExD) consumers[0]::accept;
    	}
    	
    	/*
    	 * If multiple operations were passed it is not possible to optimize
    	 * while composing the new operation anymore. The optimization had to be
    	 * postponed to execution of the composite operation. The optimization
    	 * prevents unnecessary auto-boxing if possible.
    	 */
    	return (a) -> {
    		for(ConsumerEx<Double> consumer : consumers)
    		{
    			if(consumer instanceof ConsumerExD)
    				((ConsumerExD)consumer).acceptDouble(a);
    			else
    				consumer.accept(a);
    		}
    	};
    }
}
