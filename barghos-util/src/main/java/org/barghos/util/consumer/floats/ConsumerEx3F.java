package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional float array input
 * arguments and returns no result. Unlike {@link Consumer3F} this may throw
 * exceptions. {@link ConsumerEx3F} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3F(float, float, float)}
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
public interface ConsumerEx3F extends ConsumerEx3<Float,Float,Float>
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
	void accept3F(float a, float b, float c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3F} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3F then3F(ConsumerEx3F after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3F(a, b, c); after.accept3F(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3F} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3F before3F(ConsumerEx3F before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3F(a, b, c); accept3F(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3F} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3F of3F(ConsumerEx3F... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3F consumer : consumers) consumer.accept3F(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3F(float, float, float)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Float a, Float b, Float c) throws Exception
	{
		accept3F(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3F} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3F then(ConsumerEx3<Float,Float,Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3F(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3F} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3F before(ConsumerEx3<Float,Float,Float> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3F(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3F} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3F of(ConsumerEx3<Float,Float,Float>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3F) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<Float,Float,Float> consumer : consumers) consumer.accept(a, b, c); };
	}
}
