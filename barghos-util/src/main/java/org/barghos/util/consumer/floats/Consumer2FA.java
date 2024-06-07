package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional float array input
 * arguments and returns no result. {@link Consumer2FA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloatArray(float[], float[])}.
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
public interface Consumer2FA extends Consumer2<float[],float[]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * @param b The second input argument.
     */
    void acceptFloatArray(float[] a, float[] b);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link Consumer2FA} performing this operation and the
     * operation after.
     */
    default Consumer2FA thenFloatArray(Consumer2FA after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a, b) -> {
    		acceptFloatArray(a, b);
    		
    		after.acceptFloatArray(a, b);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link Consumer2FA} performing the operation before and
     * this operation.
     */
    default Consumer2FA beforeFloatArray(Consumer2FA before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a, b) -> {
    		before.acceptFloatArray(a, b);
    		
    		acceptFloatArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2FA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2FA} performing the operations.
     */
	@SafeVarargs
    static Consumer2FA of(Consumer2FA... consumers)
    {
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b) -> {};
    	}
    	
    	/*
    	 * If exactly one operation is passed return the operation.
    	 */
    	if(consumers.length == 1)
    	{
    		return consumers[0];
    	}
    	
    	return (a, b) -> {
    		for(Consumer2FA consumer : consumers)
    		{
    			consumer.acceptFloatArray(a, b);
    		}
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2FA} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer2FA then(Consumer2<float[],float[]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a, b) -> {
    		acceptFloatArray(a, b);
    		
    		after.accept(a, b);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2FA} performing this operation and the
     * operation after.
     */
    @Override
    default Consumer2FA then(java.util.function.BiConsumer<? super float[],? super float[]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a, b) -> {
    		acceptFloatArray(a, b);
    		
    		after.accept(a, b);
    	};
    }
    
    
	/**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2FA} performing the operation before and
     * this operation.
     */
    @Override
    default Consumer2FA before(Consumer2<float[],float[]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a, b) -> {
    		before.accept(a, b);
    		
    		acceptFloatArray(a, b);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link Consumer2FA} performing the operation before and
     * this operation.
     */
    @Override
    default Consumer2FA before(java.util.function.BiConsumer<? super float[],? super float[]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a, b) -> {
    		before.accept(a, b);
    		
    		acceptFloatArray(a, b);
    	};
    }
    
    /**
     * Composes a new {@link Consumer2FA} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link Consumer2FA} performing the operations.
     */
	@SafeVarargs
    static Consumer2FA of(Consumer2<float[],float[]>... consumers)
    {
    	ParameterValidation.pvNotNull("consumers", consumers);
    	ParameterValidation.pvEntriesNotNull("consumers", consumers);
    	
    	/*
    	 * If no operations are passed return empty operation.
    	 */
    	if(consumers.length == 0)
    	{
    		return (a, b) -> {};
    	}

    	if(consumers.length == 1)
    	{
    		return (Consumer2FA) consumers[0]::accept;
    	}
    	
    	return (a, b) -> {
    		for(Consumer2<float[],float[]> consumer : consumers)
    		{
    			consumer.accept(a, b);
    		}
    	};
    }

	/**
     * @deprecated
     * Use {@link #acceptFloatArray(float[], float[])} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(float[] a, float[] b)
    {
    	acceptFloatArray(a, b);
    }
    
    /**
     * @deprecated
     * Use {@link #then(java.util.function.BiConsumer)} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default Consumer2FA andThen(java.util.function.BiConsumer<? super float[],? super float[]> after)
    {
    	return then(after);
    }
}
