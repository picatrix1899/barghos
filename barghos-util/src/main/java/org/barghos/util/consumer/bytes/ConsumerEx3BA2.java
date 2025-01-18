package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer3BA2} this may throw
 * exceptions. {@link ConsumerEx3BA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BA2(byte[][], byte[][], byte[][])}
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
public interface ConsumerEx3BA2 extends ConsumerEx3<byte[][],byte[][],byte[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept3BA2(byte[][] a, byte[][] b, byte[][] c) throws Exception;
	
	@Override
	default void accept(byte[][] a, byte[][] b, byte[][] c) throws Exception
	{
		accept3BA2(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BA2 then(ConsumerEx3BA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { accept3BA2(a, b, c); after.accept3BA2(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BA2 then(ConsumerEx3<? super byte[][],? super byte[][],? super byte[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { accept3BA2(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3BA2 before(ConsumerEx3BA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BA2(a, b, c); accept3BA2(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BA2 before(ConsumerEx3<? super byte[][],? super byte[][],? super byte[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BA2(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BA2 of(ConsumerEx3BA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3BA2 consumer : consumers) consumer.accept3BA2(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BA2 of(ConsumerEx3<? super byte[][],? super byte[][],? super byte[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BA2) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super byte[][],? super byte[][],? super byte[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
