package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional float array input
 * arguments and returns no result. Unlike {@link ConsumerFA} this may throw
 * exceptions. {@link ConsumerExFA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloatArray(float[])}.
 * 
 * @see ConsumerFA
 * @see ConsumerExFA
 * @see Consumer2FA
 * @see ConsumerEx2FA
 * @see Consumer3FA
 * @see ConsumerEx3FA
 * @see Consumer4FA
 * @see ConsumerEx4FA
 */
@FunctionalInterface
public interface ConsumerExFA extends ConsumerEx<float[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptFloatArray(float[] a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExFA} performing this operation and the
     * operation after.
     */
    default ConsumerExFA thenFloat(ConsumerExFA after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a) -> {
    		acceptFloatArray(a);
    		
    		after.acceptFloatArray(a);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExFA} performing the operation before and
     * this operation.
     */
    default ConsumerExFA beforeFloat(ConsumerExFA before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a) -> {
    		before.acceptFloatArray(a);
    		
    		acceptFloatArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExFA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExFA} performing the operations.
     */
    @SafeVarargs
    static ConsumerExFA of(ConsumerExFA... consumers)
    {
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
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
    		for(ConsumerExFA consumer : consumers)
    		{
    			consumer.acceptFloatArray(a);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use {@link #acceptFloatArray(float[])} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(float[] a) throws Exception
    {
    	acceptFloatArray(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExFA} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerExFA then(ConsumerEx<float[]> after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a) -> {
    		acceptFloatArray(a);
    		
    		after.accept(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExFA} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerExFA before(ConsumerEx<float[]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a) -> {
    		before.accept(a);
    		
    		acceptFloatArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExFA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExFA} performing the operations.
     */
    @SafeVarargs
	static ConsumerExFA of(ConsumerEx<float[]>... consumers)
    {
    	ParameterValidation.pvNotNull("consumers", consumers);
    	ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a) -> {};
    	}

    	if(consumers.length == 1)
    	{
    		return (ConsumerExFA) consumers[0]::accept;
    	}

    	return (a) -> {
    		for(ConsumerEx<float[]> consumer : consumers)
    		{
    			consumer.accept(a);
    		}
    	};
    }
}
