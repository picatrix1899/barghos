package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one float input arguments and returns no
 * result. Unlike {@link ConsumerF} this may throw exceptions.
 * {@link ConsumerExF} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface whose functional method is
 * {@link #acceptFloat(float)}.
 * 
 * @see ConsumerF
 * @see ConsumerExF
 * @see Consumer2F
 * @see ConsumerEx2F
 * @see Consumer3F
 * @see ConsumerEx3F
 * @see Consumer4F
 * @see ConsumerEx4F
 */
@FunctionalInterface
public interface ConsumerExF extends ConsumerEx<Float>
{
	/**
     * Performs the operation on the given arguments.
     *
     * @param a The first input argument.
     * 
     * @throws Exception May throw an exception during operation.
     */
    void acceptFloat(float a) throws Exception;
    
    /**
     * Performs the given operation after this operation.
     * 
     * @param after The operation to perform after this operation.
     * 
     * @return A new {@link ConsumerExF} performing this operation and the
     * operation after.
     */
    default ConsumerExF thenFloat(ConsumerExF after)
    {
    	ParameterValidation.pvNotNull("after", after);
    	
    	return (a) -> {
    		acceptFloat(a);
    		
    		after.acceptFloat(a);
    	};
    }
    
	/**
     * Performs the given operation before this operation.
     * 
     * @param before The operation to perform before this operation.
     * 
     * @return A new {@link ConsumerExF} performing the operation before and
     * this operation.
     */
    default ConsumerExF beforeFloat(ConsumerExF before)
    {
    	ParameterValidation.pvNotNull("before", before);
    	
    	return (a) -> {
    		before.acceptFloat(a);
    		
    		acceptFloat(a);
    	};
    }
    
    /**
     * Composes a new {@link ConsumerExF} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExF} performing the operations.
     */
    @SafeVarargs
    static ConsumerExF of(ConsumerExF... consumers)
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
    		for(ConsumerExF consumer : consumers)
    		{
    			consumer.acceptFloat(a);
    		}
    	};
    }
    
    /**
     * @deprecated
     * Use {@link #acceptFloat(float)} instead.
     */
    @Override
    @Deprecated(since = "1.0", forRemoval = false)
    default void accept(Float a) throws Exception
    {
    	acceptFloat(a);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExF} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerExF then(ConsumerEx<Float> after)
    {
    	ParameterValidation.pvNotNull("after", after);

    	return (a) -> {
    		acceptFloat(a);
    		
    		after.accept(a);
    	};
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return A new {@link ConsumerExF} performing this operation and the
     * operation after.
     */
    @Override
    default ConsumerExF before(ConsumerEx<Float> before)
    {
    	ParameterValidation.pvNotNull("before", before);

		return (a) -> {
			before.accept(a);
			
			acceptFloat(a);
		};
    }
    
    /**
     * Composes a new {@link ConsumerExF} performing the given operations in
     * sequence.
     * 
     * @param consumers The operations to perform.
     * 
     * @return A new {@link ConsumerExF} performing the operations.
     */
    @SafeVarargs
	static ConsumerExF of(ConsumerEx<Float>... consumers)
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
    		return (ConsumerExF) consumers[0]::accept;
    	}

    	return (a) -> {
    		for(ConsumerEx<Float> consumer : consumers)
    		{
    			consumer.accept(a);
    		}
    	};
    }
}
