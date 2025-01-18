package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 3-dimensional int array input
 * arguments and returns no result. {@link Consumer4IA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int[][][], int[][][], int[][][], int[][][])}
 * 
 * @see ConsumerIA3
 * @see ConsumerExIA3
 * @see Consumer2IA3
 * @see ConsumerEx2IA3
 * @see Consumer3IA3
 * @see ConsumerEx3IA3
 * @see Consumer4IA3
 * @see ConsumerEx4IA3
 */
@FunctionalInterface
public interface Consumer4IA3 extends Consumer4<int[][][],int[][][],int[][][],int[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptI(int[][][] a, int[][][] b, int[][][] c, int[][][] d);
	
	@Override
	default void accept(int[][][] a, int[][][] b, int[][][] c, int[][][] d)
	{
		acceptI(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4IA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4IA3 then(Consumer4IA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptI(a, b, c, d); after.acceptI(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4IA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4IA3 then(Consumer4<? super int[][][],? super int[][][],? super int[][][],? super int[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptI(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4IA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4IA3 before(Consumer4IA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptI(a, b, c, d); acceptI(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4IA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4IA3 before(Consumer4<? super int[][][],? super int[][][],? super int[][][],? super int[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptI(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4IA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4IA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4IA3 of(Consumer4IA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4IA3 consumer : consumers) consumer.acceptI(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4IA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4IA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4IA3 of(Consumer4<? super int[][][],? super int[][][],? super int[][][],? super int[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4IA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super int[][][],? super int[][][],? super int[][][],? super int[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
