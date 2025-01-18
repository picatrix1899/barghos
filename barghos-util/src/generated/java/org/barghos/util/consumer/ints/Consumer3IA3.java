package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 3-dimensional int array input
 * arguments and returns no result. {@link Consumer3IA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int[][][], int[][][], int[][][])}
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
public interface Consumer3IA3 extends Consumer3<int[][][],int[][][],int[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptI(int[][][] a, int[][][] b, int[][][] c);
	
	@Override
	default void accept(int[][][] a, int[][][] b, int[][][] c)
	{
		acceptI(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3IA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3IA3 then(Consumer3IA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptI(a, b, c); after.acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3IA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3IA3 then(Consumer3<? super int[][][],? super int[][][],? super int[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptI(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3IA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3IA3 before(Consumer3IA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptI(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3IA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3IA3 before(Consumer3<? super int[][][],? super int[][][],? super int[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3IA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3IA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3IA3 of(Consumer3IA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3IA3 consumer : consumers) consumer.acceptI(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3IA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3IA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3IA3 of(Consumer3<? super int[][][],? super int[][][],? super int[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3IA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super int[][][],? super int[][][],? super int[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
