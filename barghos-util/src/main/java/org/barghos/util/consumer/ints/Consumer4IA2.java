package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 2-dimensional int array input
 * arguments and returns no result. {@link Consumer4IA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4IA2(int[][], int[][], int[][], int[][])}
 * 
 * @see ConsumerIA2
 * @see ConsumerExIA2
 * @see Consumer2IA2
 * @see ConsumerEx2IA2
 * @see Consumer3IA2
 * @see ConsumerEx3IA2
 * @see Consumer4IA2
 * @see ConsumerEx4IA2
 */
@FunctionalInterface
public interface Consumer4IA2 extends Consumer4<int[][],int[][],int[][],int[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4IA2(int[][] a, int[][] b, int[][] c, int[][] d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4IA2} performing this operation and the
	 * operation after.
	 */
	default Consumer4IA2 then4IA2(Consumer4IA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4IA2(a, b, c, d); after.accept4IA2(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4IA2} performing the operation before and
	 * this operation.
	 */
	default Consumer4IA2 before4IA2(Consumer4IA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4IA2(a, b, c, d); accept4IA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4IA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4IA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer4IA2 of4IA2(Consumer4IA2... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4IA2 consumer : consumers) consumer.accept4IA2(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4IA2(int[][], int[][], int[][], int[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[][] a, int[][] b, int[][] c, int[][] d)
	{
		accept4IA2(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4IA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4IA2 then(Consumer4<int[][],int[][],int[][],int[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4IA2(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4IA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4IA2 before(Consumer4<int[][],int[][],int[][],int[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4IA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4IA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4IA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer4IA2 of(Consumer4<int[][],int[][],int[][],int[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4IA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<int[][],int[][],int[][],int[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
