package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional float array input
 * arguments and returns no result. {@link Consumer3FA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloat(float[], float[], float[])}.
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
public interface Consumer3FA extends Consumer3<float[],float[],float[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptFloatArray(float[] a, float[] b, float[] c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3FA} performing this operation and the
     * operation after.
     */
    default Consumer3FA thenFloatArray(Consumer3FA after)
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
     * @return A new {@link Consumer3FA} performing the operation before and this
     * operation.
     */
    default Consumer3FA beforeFloatArray(Consumer3FA before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a, b, c) -> {
    		before.acceptFloatArray(a, b, c);
    		
    		acceptFloatArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3FA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3FA} performing the operations.
     */
    @SafeVarargs
    static Consumer3FA of(Consumer3FA... consumers)
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
    		for(Consumer3FA consumer : consumers)
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
    default void accept(float[] a, float[] b, float[] c)
    {
    	acceptFloatArray(a, b, c);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3FA} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer3FA then(Consumer3<float[],float[],float[]> after)
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
     * @return A new {@link Consumer3FA} performing the operation before and this
     * operation.
     */
    @Override
    default Consumer3FA before(Consumer3<float[],float[],float[]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a, b, c) -> {
    		before.accept(a, b, c);
    		
    		acceptFloatArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3FA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3FA} performing the operations.
     */
    @SafeVarargs
	static Consumer3FA of(Consumer3<float[],float[],float[]>... consumers)
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
    		return (Consumer3FA) consumers[0]::accept;
    	}
    	
    	return (a, b, c) -> {
    		for(Consumer3<float[],float[],float[]> consumer : consumers)
    		{
    			consumer.accept(a, b, c);
    		}
    	};
    }
}
