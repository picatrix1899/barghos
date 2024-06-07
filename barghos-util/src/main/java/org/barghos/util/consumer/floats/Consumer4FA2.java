package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 2-dimensional float array input
 * arguments and returns no result. {@link Consumer4FA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloat2DArray(float[][], float[][], float[][], float[][])}.
 * 
 * @see ConsumerFA2
 * @see ConsumerExFA2
 * @see Consumer2FA2
 * @see ConsumerEx2FA2
 * @see Consumer3FA2
 * @see ConsumerEx3FA2
 * @see Consumer4FA2
 * @see ConsumerEx4FA2
 */
@FunctionalInterface
public interface Consumer4FA2 extends Consumer4<float[][],float[][],float[][],float[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     * @param c The third input argument.
     * @param d The fourth input argument.
     */
    void acceptFloat2DArray(float[][] a, float[][] b, float[][] c, float[][] d);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer4FA2} performing this operation and the
     * operation after.
     */
    default Consumer4FA2 thenFloat2DArray(Consumer4FA2 after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a, b, c, d) -> {
    		acceptFloat2DArray(a, b, c, d);
    		
    		after.acceptFloat2DArray(a, b, c, d);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer4FA2} performing the operation before and this
     * operation.
     */
    default Consumer4FA2 beforeFloat2DArray(Consumer4FA2 before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a, b, c, d) -> {
    		before.acceptFloat2DArray(a, b, c, d);
    		
    		acceptFloat2DArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4FA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4FA2} performing the operations.
     */
    @SafeVarargs
    static Consumer4FA2 of(Consumer4FA2... consumers)
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
    		for(Consumer4FA2 consumer : consumers)
    		{
    			consumer.acceptFloat2DArray(a, b, c, d);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use
     * {@link #acceptFloat2DArray(float[][], float[][], float[][], float[][])}
     * instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(float[][] a, float[][] b, float[][] c, float[][] d)
    {
    	acceptFloat2DArray(a, b, c, d);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer4FA2} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer4FA2 then(Consumer4<float[][],float[][],float[][],float[][]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a, b, c, d) -> {
    		acceptFloat2DArray(a, b, c, d);
    		
    		after.accept(a, b, c, d);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer4FA2} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer4FA2 before(Consumer4<float[][],float[][],float[][],float[][]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a, b, c, d) -> {
    		before.accept(a, b, c, d);
    		
    		acceptFloat2DArray(a, b, c, d);
    	};
    }
    
    /**
     * Composes a new {@link Consumer4FA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer4FA2} performing the operations.
     */
    @SafeVarargs
	static Consumer4FA2 of(Consumer4<float[][],float[][],float[][],float[][]>... consumers)
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
    		return (Consumer4FA2) consumers[0]::accept;
    	}

    	return (a, b, c, d) -> {
    		for(Consumer4<float[][],float[][],float[][],float[][]> consumer : consumers)
    		{
    			consumer.accept(a, b, c, d);
    		}
    	};
    }
}
