package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional byte array input
 * arguments and returns no result. {@link Consumer3BA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptB(byte[], byte[], byte[])}
 * 
 * @see ConsumerBA
 * @see ConsumerExBA
 * @see Consumer2BA
 * @see ConsumerEx2BA
 * @see Consumer3BA
 * @see ConsumerEx3BA
 * @see Consumer4BA
 * @see ConsumerEx4BA
 */
@FunctionalInterface
public interface Consumer3BA extends Consumer3<byte[],byte[],byte[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptB(byte[] a, byte[] b, byte[] c);
	
	@Override
	default void accept(byte[] a, byte[] b, byte[] c)
	{
		acceptB(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BA} performing this operation and the
	 * operation after.
	 */
	default Consumer3BA then(Consumer3BA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptB(a, b, c); after.acceptB(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BA then(Consumer3<? super byte[],? super byte[],? super byte[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptB(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BA} performing the operation before and
	 * this operation.
	 */
	default Consumer3BA before(Consumer3BA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptB(a, b, c); acceptB(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3BA before(Consumer3<? super byte[],? super byte[],? super byte[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptB(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BA of(Consumer3BA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BA consumer : consumers) consumer.acceptB(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BA of(Consumer3<? super byte[],? super byte[],? super byte[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (Consumer3BA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super byte[],? super byte[],? super byte[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
