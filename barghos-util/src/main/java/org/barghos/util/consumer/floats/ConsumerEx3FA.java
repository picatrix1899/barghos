package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional float array input
 * arguments and returns no result. Unlike {@link Consumer3FA} this may throw
 * exceptions. {@link ConsumerEx3FA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloatArray(float[], float[], float[])}.
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
public interface ConsumerEx3FA extends ConsumerEx3<float[],float[],float[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptFloatArray(float[] a, float[] b, float[] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3FA} performing this operation and the
     * operation after.
     */
    default ConsumerEx3FA thenFloatArray(ConsumerEx3FA after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a, b, c) -> {
    		acceptFloatArray(a, b, c);
    		
    		after.acceptFloatArray(a, b, c);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3FA} performing the operation before and
     * this operation.
     */
    default ConsumerEx3FA beforeFloatArray(ConsumerEx3FA before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a, b, c) -> {
    		before.acceptFloatArray(a, b, c);
    		acceptFloatArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3FA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3FA} performing the operations.
     */
    @SafeVarargs
    static ConsumerEx3FA of(ConsumerEx3FA... consumers)
    {
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b, c) -> {};
    	}
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1)
    	{
    		return consumers[0];
    	}
    	
    	return (a, b, c) -> {
    		for(ConsumerEx3FA consumer : consumers)
    		{
    			consumer.acceptFloatArray(a, b, c);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use {@link #acceptFloatArray(float[], float[], float[])} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(float[] a, float[] b, float[] c) throws Exception
    {
    	acceptFloatArray(a, b, c);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx3FA} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx3FA then(ConsumerEx3<float[],float[],float[]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a, b, c) -> {
    		acceptFloatArray(a, b, c);
    		
    		after.accept(a, b, c);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx3FA} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx3FA before(ConsumerEx3<float[],float[],float[]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a, b, c) -> {
    		before.accept(a, b, c);
    		
    		acceptFloatArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3FA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3FA} performing the operations.
     */
    @SafeVarargs
	static ConsumerEx3FA of(ConsumerEx3<float[],float[],float[]>... consumers)
    {
    	ParameterValidation.pvNotNull("consumers", consumers);
    	ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b, c) -> {};
    	}

    	if(consumers.length == 1)
    	{
    		return (ConsumerEx3FA) consumers[0]::accept;
    	}

    	return (a, b, c) -> {
    		for(ConsumerEx3<float[],float[],float[]> consumer : consumers)
    		{
    			consumer.accept(a, b, c);
    		}
    	};
    }
}
