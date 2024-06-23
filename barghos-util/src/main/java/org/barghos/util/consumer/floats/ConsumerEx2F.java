package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional float array input
 * arguments and returns no result. Unlike {@link Consumer2F} this may throw
 * exceptions. {@link ConsumerEx2F} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2F(float, float)}
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
public interface ConsumerEx2F extends ConsumerEx2<Float,Float>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2F(float a, float b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2F} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2F then2F(ConsumerEx2F after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2F(a, b); after.accept2F(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2F} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2F before2F(ConsumerEx2F before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2F(a, b); accept2F(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2F} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2F of2F(ConsumerEx2F... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2F consumer : consumers) consumer.accept2F(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2F(float, float)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Float a, Float b) throws Exception
	{
		accept2F(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2F} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2F then(ConsumerEx2<Float,Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2F(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2F} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2F before(ConsumerEx2<Float,Float> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2F(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2F} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2F} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2F of(ConsumerEx2<Float,Float>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2F) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<Float,Float> consumer : consumers) consumer.accept(a, b); };
	}
}
