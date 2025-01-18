package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 3-dimensional long array input
 * arguments and returns no result. {@link Consumer3LA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long[][][], long[][][], long[][][])}
 * 
 * @see ConsumerLA3
 * @see ConsumerExLA3
 * @see Consumer2LA3
 * @see ConsumerEx2LA3
 * @see Consumer3LA3
 * @see ConsumerEx3LA3
 * @see Consumer4LA3
 * @see ConsumerEx4LA3
 */
@FunctionalInterface
public interface Consumer3LA3 extends Consumer3<long[][][],long[][][],long[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptL(long[][][] a, long[][][] b, long[][][] c);
	
	@Override
	default void accept(long[][][] a, long[][][] b, long[][][] c)
	{
		acceptL(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3LA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3LA3 then(Consumer3LA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptL(a, b, c); after.acceptL(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3LA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3LA3 then(Consumer3<? super long[][][],? super long[][][],? super long[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptL(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3LA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3LA3 before(Consumer3LA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptL(a, b, c); acceptL(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3LA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3LA3 before(Consumer3<? super long[][][],? super long[][][],? super long[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptL(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3LA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3LA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3LA3 of(Consumer3LA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3LA3 consumer : consumers) consumer.acceptL(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3LA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3LA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3LA3 of(Consumer3<? super long[][][],? super long[][][],? super long[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3LA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super long[][][],? super long[][][],? super long[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
