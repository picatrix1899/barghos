package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional float array input
 * argument and returns no result. {@link ConsumerFA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloat2DArray(float[][])}.
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
public interface ConsumerFA2 extends Consumer<float[][]>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     */
    void acceptFloat2DArray(float[][] a);
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerFA2} performing this operation and the
     * operation after.
     */
    default ConsumerFA2 thenFloat2DArray(ConsumerFA2 after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a) -> {
    		acceptFloat2DArray(a);
    		
    		after.acceptFloat2DArray(a);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerFA2} performing the operation before and this
     * operation.
     */
    default ConsumerFA2 beforeFloat2DArray(ConsumerFA2 before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a) -> {
    		before.acceptFloat2DArray(a);
    		
    		acceptFloat2DArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerFA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerFA2} performing the operations.
     */
    @SafeVarargs
    static ConsumerFA2 of(ConsumerFA2... consumers)
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
    		for(ConsumerFA2 consumer : consumers)
    		{
    			consumer.acceptFloat2DArray(a);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use {@link #acceptFloat2DArray(float[][])} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(float[][] a)
    {
    	acceptFloat2DArray(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerFA2} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerFA2 then(Consumer<float[][]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a) -> {
    		acceptFloat2DArray(a);
    		
    		after.accept(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerFA2} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerFA2 then(java.util.function.Consumer<? super float[][]> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a) -> {
    		acceptFloat2DArray(a);
    		
    		after.accept(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerFA2} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerFA2 before(Consumer<float[][]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a) -> {
    		before.accept(a);
    		
    		acceptFloat2DArray(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerFA2} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerFA2 before(java.util.function.Consumer<? super float[][]> before)
    {
    	ParameterValidation.pvNotNull("before", before);

    	return (a) -> {
    		before.accept(a);
    		
    		acceptFloat2DArray(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerFA2} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerFA2} performing the operations.
     */
    @SafeVarargs
	static ConsumerFA2 of(Consumer<float[][]>... consumers)
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
    		return (ConsumerFA2) consumers[0]::accept;
    	}

    	return (a) -> {
    		for(Consumer<float[][]> consumer : consumers)
    		{
    			consumer.accept(a);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use {@link #then(java.util.function.Consumer)} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default ConsumerFA2 andThen(java.util.function.Consumer<? super float[][]> after)
    {
    	return then(after);
    }
}
