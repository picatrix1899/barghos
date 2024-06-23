package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional double array input
 * arguments and returns no result. Unlike {@link Consumer4DA} this may throw
 * exceptions. {@link ConsumerEx4DA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4DA(double[], double[], double[], double[])}
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
public interface ConsumerEx4DA extends ConsumerEx4<double[],double[],double[],double[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept4DA(double[] a, double[] b, double[] c, double[] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4DA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4DA then4DA(ConsumerEx4DA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4DA(a, b, c, d); after.accept4DA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4DA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4DA before4DA(ConsumerEx4DA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4DA(a, b, c, d); accept4DA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4DA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4DA of4DA(ConsumerEx4DA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4DA consumer : consumers) consumer.accept4DA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4DA(double[], double[], double[], double[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[] a, double[] b, double[] c, double[] d) throws Exception
	{
		accept4DA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4DA then(ConsumerEx4<double[],double[],double[],double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4DA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4DA before(ConsumerEx4<double[],double[],double[],double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4DA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4DA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4DA of(ConsumerEx4<double[],double[],double[],double[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4DA) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<double[],double[],double[],double[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
