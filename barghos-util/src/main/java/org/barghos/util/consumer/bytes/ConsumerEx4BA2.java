package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 2-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer4BA2} this may throw
 * exceptions. {@link ConsumerEx4BA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4BA2(byte[][], byte[][], byte[][], byte[][])}
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
public interface ConsumerEx4BA2 extends ConsumerEx4<byte[][],byte[][],byte[][],byte[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept4BA2(byte[][] a, byte[][] b, byte[][] c, byte[][] d) throws Exception;
	
	@Override
	default void accept(byte[][] a, byte[][] b, byte[][] c, byte[][] d) throws Exception
	{
		accept4BA2(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4BA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4BA2 then(ConsumerEx4BA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BA2(a, b, c, d); after.accept4BA2(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BA2 then(ConsumerEx4<? super byte[][],? super byte[][],? super byte[][],? super byte[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { accept4BA2(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4BA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4BA2 before(ConsumerEx4BA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BA2(a, b, c, d); accept4BA2(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BA2 before(ConsumerEx4<? super byte[][],? super byte[][],? super byte[][],? super byte[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BA2 of(ConsumerEx4BA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4BA2 consumer : consumers) consumer.accept4BA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BA2 of(ConsumerEx4<? super byte[][],? super byte[][],? super byte[][],? super byte[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4BA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<? super byte[][],? super byte[][],? super byte[][],? super byte[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
