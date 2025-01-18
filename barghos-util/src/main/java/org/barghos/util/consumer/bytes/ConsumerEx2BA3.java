package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 3-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer2BA3} this may throw
 * exceptions. {@link ConsumerEx2BA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BA3(byte[][][], byte[][][])}.
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
public interface ConsumerEx2BA3 extends ConsumerEx2<byte[][][],byte[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2BA3(byte[][][] a, byte[][][] b) throws Exception;
	
	@Override
	default void accept(byte[][][] a, byte[][][] b) throws Exception
	{
		accept2BA3(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BA3 then(ConsumerEx2BA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { accept2BA3(a, b); after.accept2BA3(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BA3 then(ConsumerEx2<? super byte[][][],? super byte[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { accept2BA3(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2BA3 before(ConsumerEx2BA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept2BA3(a, b); accept2BA3(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BA3 before(ConsumerEx2<? super byte[][][],? super byte[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BA3(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BA3 of(ConsumerEx2BA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2BA3 consumer : consumers) consumer.accept2BA3(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BA3 of(ConsumerEx2<? super byte[][][],? super byte[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BA3) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super byte[][][],? super byte[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
