package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 2-dimensional long array input
 * arguments and returns no result. {@link Consumer4LA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long[][], long[][], long[][], long[][])}
 * 
 * @see ConsumerLA2
 * @see ConsumerExLA2
 * @see Consumer2LA2
 * @see ConsumerEx2LA2
 * @see Consumer3LA2
 * @see ConsumerEx3LA2
 * @see Consumer4LA2
 * @see ConsumerEx4LA2
 */
@FunctionalInterface
public interface Consumer4LA2 extends Consumer4<long[][],long[][],long[][],long[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptL(long[][] a, long[][] b, long[][] c, long[][] d);
	
	@Override
	default void accept(long[][] a, long[][] b, long[][] c, long[][] d)
	{
		acceptL(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4LA2} performing this operation and the
	 * operation after.
	 */
	default Consumer4LA2 then(Consumer4LA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptL(a, b, c, d); after.acceptL(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4LA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4LA2 then(Consumer4<? super long[][],? super long[][],? super long[][],? super long[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptL(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4LA2} performing the operation before and
	 * this operation.
	 */
	default Consumer4LA2 before(Consumer4LA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptL(a, b, c, d); acceptL(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4LA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4LA2 before(Consumer4<? super long[][],? super long[][],? super long[][],? super long[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptL(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4LA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4LA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4LA2 of(Consumer4LA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4LA2 consumer : consumers) consumer.acceptL(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4LA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4LA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4LA2 of(Consumer4<? super long[][],? super long[][],? super long[][],? super long[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4LA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super long[][],? super long[][],? super long[][],? super long[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
