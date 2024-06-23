package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional double array input
 * arguments and returns no result. Unlike {@link Consumer3DA} this may throw
 * exceptions. {@link ConsumerEx3DA} is expected to operate via side-effects.
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
public interface ConsumerEx3DA extends ConsumerEx3<double[],double[],double[]>
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
	void accept3DA(double[] a, double[] b, double[] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3DA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3DA then3DA(ConsumerEx3DA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3DA(a, b, c); after.accept3DA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3DA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3DA before3DA(ConsumerEx3DA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3DA(a, b, c); accept3DA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3DA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3DA of3DA(ConsumerEx3DA... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3DA consumer : consumers) consumer.accept3DA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3DA(double[], double[], double[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[] a, double[] b, double[] c) throws Exception
	{
		accept3DA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3DA then(ConsumerEx3<double[],double[],double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3DA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3DA before(ConsumerEx3<double[],double[],double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3DA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3DA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3DA of(ConsumerEx3<double[],double[],double[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3DA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<double[],double[],double[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
