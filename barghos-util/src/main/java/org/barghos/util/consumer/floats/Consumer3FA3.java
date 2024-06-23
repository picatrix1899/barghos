package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 3-dimensional float array input
 * arguments and returns no result. {@link Consumer3FA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3FA3(float[][][], float[][][], float[][][])}
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
	void accept3FA3(float[][][] a, float[][][] b, float[][][] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3FA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3FA3 then3FA3(Consumer3FA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3FA3(a, b, c); after.accept3FA3(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3FA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3FA3 before3FA3(Consumer3FA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3FA3(a, b, c); accept3FA3(a, b, c); };
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
	static Consumer3FA3 of3FA3(Consumer3FA3... consumers)
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
		
		return (a, b, c) -> { for(Consumer3FA3 consumer : consumers) consumer.accept3FA3(a, b, c); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept3FA3(float[][][], float[][][], float[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(float[][][] a, float[][][] b, float[][][] c)
	{
		accept3FA3(a, b, c);
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

		return (a, b, c) -> { accept3FA3(a, b, c); after.accept(a, b, c); };
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

		return (a, b, c) -> { before.accept(a, b, c); accept3FA3(a, b, c); };
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
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3FA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<float[][][],float[][][],float[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
