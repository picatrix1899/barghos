package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional int array input
 * arguments and returns no result. {@link Consumer3IA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int[][], int[][], int[][])}
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
public interface Consumer3IA2 extends Consumer3<int[][],int[][],int[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptI(int[][] a, int[][] b, int[][] c);
	
	@Override
	default void accept(int[][] a, int[][] b, int[][] c)
	{
		acceptI(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3IA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3IA2 then(Consumer3IA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptI(a, b, c); after.acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3IA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3IA2 then(Consumer3<? super int[][],? super int[][],? super int[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptI(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3IA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3IA2 before(Consumer3IA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptI(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3IA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3IA2 before(Consumer3<? super int[][],? super int[][],? super int[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3IA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3IA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3IA2 of(Consumer3IA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3IA2 consumer : consumers) consumer.acceptI(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3IA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3IA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3IA2 of(Consumer3<? super int[][],? super int[][],? super int[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};
		
		if(consumers.length == 1) return (Consumer3IA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super int[][],? super int[][],? super int[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
