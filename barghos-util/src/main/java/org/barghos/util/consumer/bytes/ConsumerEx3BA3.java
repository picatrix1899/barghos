package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 3-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer3BA3} this may throw
 * exceptions. {@link ConsumerEx3BA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BA3(byte[][][], byte[][][], byte[][][])}
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
public interface ConsumerEx3BA3 extends ConsumerEx3<byte[][][],byte[][][],byte[][][]>
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
	void accept3BA3(byte[][][] a, byte[][][] b, byte[][][] c) throws Exception;
	
	@Override
	default void accept(byte[][][] a, byte[][][] b, byte[][][] c) throws Exception
	{
		accept3BA3(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BA3 then(ConsumerEx3BA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { accept3BA3(a, b, c); after.accept3BA3(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BA3 then(ConsumerEx3<? super byte[][][],? super byte[][][],? super byte[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { accept3BA3(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3BA3 before(ConsumerEx3BA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BA3(a, b, c); accept3BA3(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BA3 before(ConsumerEx3<? super byte[][][],? super byte[][][],? super byte[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BA3 of(ConsumerEx3BA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3BA3 consumer : consumers) consumer.accept3BA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BA3 of(ConsumerEx3<? super byte[][][],? super byte[][][],? super byte[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BA3) consumers[0]::accept;
		
		return (a, b, c) -> { for(ConsumerEx3<? super byte[][][],? super byte[][][],? super byte[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
