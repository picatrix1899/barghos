package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 2-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer2BA2} this may throw
 * exceptions. {@link ConsumerEx2BA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BA2(byte[][], byte[][])}
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
public interface ConsumerEx2BA2 extends ConsumerEx2<byte[][],byte[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2BA2(byte[][] a, byte[][] b) throws Exception;
	
	@Override
	default void accept(byte[][] a, byte[][] b) throws Exception
	{
		accept2BA2(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BA2 then(ConsumerEx2BA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { accept2BA2(a, b); after.accept2BA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BA2 then(ConsumerEx2<? super byte[][],? super byte[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { accept2BA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2BA2 before(ConsumerEx2BA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept2BA2(a, b); accept2BA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BA2 before(ConsumerEx2<? super byte[][],? super byte[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BA2 of(ConsumerEx2BA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2BA2 consumer : consumers) consumer.accept2BA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BA2 of(ConsumerEx2<? super byte[][],? super byte[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BA2) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super byte[][],? super byte[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
