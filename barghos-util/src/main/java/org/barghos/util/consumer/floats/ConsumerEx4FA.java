package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional float array input
 * arguments and returns no result. Unlike {@link Consumer4FA} this may throw
 * exceptions. {@link ConsumerEx4FA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloatArray(float[], float[], float[], float[])}.
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
public interface ConsumerEx4FA extends ConsumerEx4<float[],float[],float[],float[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptFloatArray(float[] a, float[] b, float[] c, float[] d) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx4FA} performing this operation and the
     * operation after.
     */
    default ConsumerEx4FA thenFloatArray(ConsumerEx4FA after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a, b, c, d) -> {
    		acceptFloatArray(a, b, c, d);
    		
    		after.acceptFloatArray(a, b, c, d);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx4FA} performing the operation before and
     * this operation.
     */
    default ConsumerEx4FA beforeFloatArray(ConsumerEx4FA before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a, b, c, d) -> {
    		before.acceptFloatArray(a, b, c, d);
    		
    		acceptFloatArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4FA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4FA} performing the operations.
     */
    @SafeVarargs
    static ConsumerEx4FA of(ConsumerEx4FA... consumers)
    {
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b, c, d) -> {};
    	}
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1)
    	{
    		return consumers[0];
    	}
    	
    	return (a, b, c, d) -> {
    		for(ConsumerEx4FA consumer : consumers)
    		{
    			consumer.acceptFloatArray(a, b, c, d);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use {@link #acceptFloatArray(float[], float[], float[], float[])}
     * instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(float[] a, float[] b, float[] c, float[] d) throws Exception
    {
    	acceptFloatArray(a, b, c, d);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx4FA} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx4FA then(ConsumerEx4<float[],float[],float[],float[]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a, b, c, d) -> {
    		acceptFloatArray(a, b, c, d);
    		
    		after.accept(a, b, c, d);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx4FA} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx4FA before(ConsumerEx4<float[],float[],float[],float[]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a, b, c, d) -> {
    		before.accept(a, b, c, d);
    		
    		acceptFloatArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx4FA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx4FA} performing the operations.
     */
    @SafeVarargs
	static ConsumerEx4FA of(ConsumerEx4<float[],float[],float[],float[]>... consumers)
    {
    	ParameterValidation.pvNotNull("consumers", consumers);
    	ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b, c, d) -> {};
    	}

    	if(consumers.length == 1)
    	{
    		return (ConsumerEx4FA) consumers[0]::accept;
    	}

    	return (a, b, c, d) -> {
    		for(ConsumerEx4<float[],float[],float[],float[]> consumer : consumers)
    		{
    			consumer.accept(a, b, c, d);
    		}
    	};
    }
}
