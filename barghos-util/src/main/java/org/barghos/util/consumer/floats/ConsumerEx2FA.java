package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional float array input
 * arguments and returns no result. Unlike {@link Consumer2FA} this may throw
 * exceptions. {@link ConsumerEx2FA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2FA(float[], float[])}
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
public interface ConsumerEx2FA extends ConsumerEx2<float[],float[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2FA(float[] a, float[] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2FA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2FA then2FA(ConsumerEx2FA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2FA(a, b); after.accept2FA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2FA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2FA before2FA(ConsumerEx2FA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2FA(a, b); accept2FA(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2FA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2FA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2FA of2FA(ConsumerEx2FA... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2FA consumer : consumers) consumer.accept2FA(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2FA(float[], float[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(float[] a, float[] b) throws Exception
	{
		accept2FA(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2FA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2FA then(ConsumerEx2<float[],float[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2FA(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2FA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2FA before(ConsumerEx2<float[],float[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2FA(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2FA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2FA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2FA of(ConsumerEx2<float[],float[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2FA) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<float[],float[]> consumer : consumers) consumer.accept(a, b); };
	}
}
