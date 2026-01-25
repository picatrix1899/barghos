package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional byte array input
 * arguments and returns no result. {@link Consumer3BA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptB(byte[][], byte[][], byte[][])}
 * 
 * @see ConsumerBA2
 * @see ConsumerExBA2
 * @see Consumer2BA2
 * @see ConsumerEx2BA2
 * @see Consumer3BA2
 * @see ConsumerEx3BA2
 * @see Consumer4BA2
 * @see ConsumerEx4BA2
 */
@FunctionalInterface
public interface Consumer3BA2 extends Consumer3<byte[][],byte[][],byte[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptB(byte[][] a, byte[][] b, byte[][] c);
	
	@Override
	default void accept(byte[][] a, byte[][] b, byte[][] c)
	{
		acceptB(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3BA2 then(Consumer3BA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptB(a, b, c); after.acceptB(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BA2 then(Consumer3<? super byte[][],? super byte[][],? super byte[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptB(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3BA2 before(Consumer3BA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptB(a, b, c); acceptB(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BA2 before(Consumer3<? super byte[][],? super byte[][],? super byte[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptB(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BA2 of(Consumer3BA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BA2 consumer : consumers) consumer.acceptB(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BA2 of(Consumer3<? super byte[][],? super byte[][],? super byte[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};
		
		if(consumers.length == 1) return (Consumer3BA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super byte[][],? super byte[][],? super byte[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
