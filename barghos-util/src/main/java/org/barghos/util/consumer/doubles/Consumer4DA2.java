package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 2-dimensional double array input
 * arguments and returns no result. {@link Consumer4DA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4DA2(double[][], double[][], double[][], double[][])}
 * 
 * @see ConsumerDA2
 * @see ConsumerExDA2
 * @see Consumer2DA2
 * @see ConsumerEx2DA2
 * @see Consumer3DA2
 * @see ConsumerEx3DA2
 * @see Consumer4DA2
 * @see ConsumerEx4DA2
 */
@FunctionalInterface
public interface Consumer4DA2 extends Consumer4<double[][],double[][],double[][],double[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4DA2(double[][] a, double[][] b, double[][] c, double[][] d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4DA2} performing this operation and the
	 * operation after.
	 */
	default Consumer4DA2 then4DA2(Consumer4DA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4DA2(a, b, c, d); after.accept4DA2(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4DA2} performing the operation before and
	 * this operation.
	 */
	default Consumer4DA2 before4DA2(Consumer4DA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4DA2(a, b, c, d); accept4DA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4DA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4DA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer4DA2 of4DA2(Consumer4DA2... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4DA2 consumer : consumers) consumer.accept4DA2(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4DA2(double[][], double[][], double[][], double[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[][] a, double[][] b, double[][] c, double[][] d)
	{
		accept4DA2(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4DA2 then(Consumer4<double[][],double[][],double[][],double[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4DA2(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4DA2 before(Consumer4<double[][],double[][],double[][],double[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4DA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4DA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4DA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer4DA2 of(Consumer4<double[][],double[][],double[][],double[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4DA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<double[][],double[][],double[][],double[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
