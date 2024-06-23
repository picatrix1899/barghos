package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional double array input
 * arguments and returns no result. {@link Consumer3DA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3DA(double[], double[], double[])}
 * 
 * @see ConsumerDA
 * @see ConsumerExDA
 * @see Consumer2DA
 * @see ConsumerEx2DA
 * @see Consumer3DA
 * @see ConsumerEx3DA
 * @see Consumer4DA
 * @see ConsumerEx4DA
 */
@FunctionalInterface
public interface Consumer3DA extends Consumer3<double[],double[],double[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3DA(double[] a, double[] b, double[] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3DA} performing this operation and the
	 * operation after.
	 */
	default Consumer3DA then3DA(Consumer3DA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3DA(a, b, c); after.accept3DA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3DA} performing the operation before and
	 * this operation.
	 */
	default Consumer3DA before3DA(Consumer3DA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3DA(a, b, c); accept3DA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3DA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3DA of3DA(Consumer3DA... consumers)
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
		
		return (a, b, c) -> { for(Consumer3DA consumer : consumers) consumer.accept3DA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3DA(double[], double[], double[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[] a, double[] b, double[] c)
	{
		accept3DA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3DA then(Consumer3<double[],double[],double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3DA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3DA} performing the operation before and this
	 * operation.
	 */
	@Override
	default Consumer3DA before(Consumer3<double[],double[],double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3DA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3DA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3DA of(Consumer3<double[],double[],double[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3DA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<double[],double[],double[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
