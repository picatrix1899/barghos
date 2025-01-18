package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer3BA} this may throw
 * exceptions. {@link ConsumerEx3BA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BA(byte[], byte[], byte[])}
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
public interface ConsumerEx3BA extends ConsumerEx3<byte[],byte[],byte[]>
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
	void accept3BA(byte[] a, byte[] b, byte[] c) throws Exception;
	
	@Override
	default void accept(byte[] a, byte[] b, byte[] c) throws Exception
	{
		accept3BA(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BA then(ConsumerEx3BA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { accept3BA(a, b, c); after.accept3BA(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BA then(ConsumerEx3<? super byte[],? super byte[],? super byte[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { accept3BA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3BA before(ConsumerEx3BA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BA(a, b, c); accept3BA(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BA before(ConsumerEx3<? super byte[],? super byte[],? super byte[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BA of(ConsumerEx3BA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3BA consumer : consumers) consumer.accept3BA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BA of(ConsumerEx3<? super byte[],? super byte[],? super byte[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super byte[],? super byte[],? super byte[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
