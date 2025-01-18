package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional long array input
 * arguments and returns no result. {@link Consumer3LA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long[][], long[][], long[][])}
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
public interface Consumer3LA2 extends Consumer3<long[][],long[][],long[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptL(long[][] a, long[][] b, long[][] c);
	
	@Override
	default void accept(long[][] a, long[][] b, long[][] c)
	{
		acceptL(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3LA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3LA2 then(Consumer3LA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptL(a, b, c); after.acceptL(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3LA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3LA2 then(Consumer3<? super long[][],? super long[][],? super long[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptL(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3LA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3LA2 before(Consumer3LA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptL(a, b, c); acceptL(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3LA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3LA2 before(Consumer3<? super long[][],? super long[][],? super long[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptL(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3LA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3LA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3LA2 of(Consumer3LA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3LA2 consumer : consumers) consumer.acceptL(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3LA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3LA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3LA2 of(Consumer3<? super long[][],? super long[][],? super long[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};
		
		if(consumers.length == 1) return (Consumer3LA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super long[][],? super long[][],? super long[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
