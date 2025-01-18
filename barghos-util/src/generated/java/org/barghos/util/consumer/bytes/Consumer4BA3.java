package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 3-dimensional byte array input
 * arguments and returns no result. {@link Consumer4BA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptB(byte[][][], byte[][][], byte[][][], byte[][][])}
 * 
 * @see ConsumerBA3
 * @see ConsumerExBA3
 * @see Consumer2BA3
 * @see ConsumerEx2BA3
 * @see Consumer3BA3
 * @see ConsumerEx3BA3
 * @see Consumer4BA3
 * @see ConsumerEx4BA3
 */
@FunctionalInterface
public interface Consumer4BA3 extends Consumer4<byte[][][],byte[][][],byte[][][],byte[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptB(byte[][][] a, byte[][][] b, byte[][][] c, byte[][][] d);
	
	@Override
	default void accept(byte[][][] a, byte[][][] b, byte[][][] c, byte[][][] d)
	{
		acceptB(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4BA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4BA3 then(Consumer4BA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptB(a, b, c, d); after.acceptB(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BA3 then(Consumer4<? super byte[][][],? super byte[][][],? super byte[][][],? super byte[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptB(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4BA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4BA3 before(Consumer4BA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptB(a, b, c, d); acceptB(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BA3 before(Consumer4<? super byte[][][],? super byte[][][],? super byte[][][],? super byte[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptB(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4BA3 of(Consumer4BA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4BA3 consumer : consumers) consumer.acceptB(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4BA3 of(Consumer4<? super byte[][][],? super byte[][][],? super byte[][][],? super byte[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4BA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super byte[][][],? super byte[][][],? super byte[][][],? super byte[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
