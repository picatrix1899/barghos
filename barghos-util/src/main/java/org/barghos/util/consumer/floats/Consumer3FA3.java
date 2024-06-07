package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 3-dimensional float array input
 * arguments and returns no result. {@link Consumer3FA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloat3DArray(float[][][], float[][][], float[][][])}.
 * 
 * @see ConsumerFA3
 * @see ConsumerExFA3
 * @see Consumer2FA3
 * @see ConsumerEx2FA3
 * @see Consumer3FA3
 * @see ConsumerEx3FA3
 * @see Consumer4FA3
 * @see ConsumerEx4FA3
 */
@FunctionalInterface
public interface Consumer3FA3 extends Consumer3<float[][][],float[][][],float[][][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     */
    void acceptFloat3DArray(float[][][] a, float[][][] b, float[][][] c);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer3FA3} performing this operation and the
     * operation after.
     */
    default Consumer3FA3 thenFloat3DArray(Consumer3FA3 after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a, b, c) -> {
    		acceptFloat3DArray(a, b, c);
    		
    		after.acceptFloat3DArray(a, b, c);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer3FA3} performing the operation before and this
     * operation.
     */
    default Consumer3FA3 beforeFloat3DArray(Consumer3FA3 before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a, b, c) -> {
    		before.acceptFloat3DArray(a, b, c);
    		
    		acceptFloat3DArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3FA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3FA3} performing the operations.
     */
    @SafeVarargs
    static Consumer3FA3 of(Consumer3FA3... consumers)
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
    		for(Consumer3FA3 consumer : consumers)
    		{
    			consumer.acceptFloat3DArray(a, b, c);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use {@link #acceptFloat3DArray(float[][][], float[][][], float[][][])}
     * instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(float[][][] a, float[][][] b, float[][][] c)
    {
    	acceptFloat3DArray(a, b, c);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3FA3} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer3FA3 then(Consumer3<float[][][],float[][][],float[][][]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a, b, c) -> {
    		acceptFloat3DArray(a, b, c);
    		
    		after.accept(a, b, c);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer3FA3} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer3FA3 before(Consumer3<float[][][],float[][][],float[][][]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a, b, c) -> {
    		before.accept(a, b, c);
    		
    		acceptFloat3DArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link Consumer3FA3} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer3FA3} performing the operations.
     */
    @SafeVarargs
	static Consumer3FA3 of(Consumer3<float[][][],float[][][],float[][][]>... consumers)
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
    		return (Consumer3FA3) consumers[0]::accept;
    	}

    	return (a, b, c) -> {
    		for(Consumer3<float[][][],float[][][],float[][][]> consumer : consumers)
    		{
    			consumer.accept(a, b, c);
    		}
    	};
    }
}
