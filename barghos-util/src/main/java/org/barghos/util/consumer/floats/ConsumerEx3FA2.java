package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 2-dimensional float array input
 * arguments and returns no result. Unlike {@link Consumer3FA2} this may throw
 * exceptions. {@link ConsumerEx3FA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloat2DArray(float[][], float[][], float[][])}.
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
public interface ConsumerEx3FA2 extends ConsumerEx3<float[][],float[][],float[][]>
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
    void acceptFloat2DArray(float[][] a, float[][] b, float[][] c) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerEx3FA2} performing this operation and the
     * operation after.
     */
    default ConsumerEx3FA2 thenFloat2DArray(ConsumerEx3FA2 after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a, b, c) -> {
    		acceptFloat2DArray(a, b, c);
    		
    		after.acceptFloat2DArray(a, b, c);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerEx3FA2} performing the operation before and
     * this operation.
     */
    default ConsumerEx3FA2 beforeFloat2DArray(ConsumerEx3FA2 before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a, b, c) -> {
    		before.acceptFloat2DArray(a, b, c);
    		
    		acceptFloat2DArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3FA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3FA2} performing the operations.
     */
    @SafeVarargs
    static ConsumerEx3FA2 of(ConsumerEx3FA2... consumers)
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
    		for(ConsumerEx3FA2 consumer : consumers)
    		{
    			consumer.acceptFloat2DArray(a, b, c);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use {@link #acceptFloat2DArray(float[][], float[][], float[][])} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(float[][] a, float[][] b, float[][] c) throws Exception
    {
    	acceptFloat2DArray(a, b, c);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx3FA2} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx3FA2 then(ConsumerEx3<float[][],float[][],float[][]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a, b, c) -> {
    		acceptFloat2DArray(a, b, c);
    		
    		after.accept(a, b, c);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerEx3FA2} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerEx3FA2 before(ConsumerEx3<float[][],float[][],float[][]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a, b, c) -> {
    		before.accept(a, b, c);
    		
    		acceptFloat2DArray(a, b, c);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerEx3FA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerEx3FA2} performing the operations.
     */
    @SafeVarargs
	static ConsumerEx3FA2 of(ConsumerEx3<float[][],float[][],float[][]>... consumers)
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
    		return (ConsumerEx3FA2) consumers[0]::accept;
    	}

    	return (a, b, c) -> {
    		for(ConsumerEx3<float[][],float[][],float[][]> consumer : consumers)
    		{
    			consumer.accept(a, b, c);
    		}
    	};
    }
}
