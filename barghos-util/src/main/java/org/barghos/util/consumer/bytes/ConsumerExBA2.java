package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional byte array input
 * arguments and returns no result. Unlike {@link ConsumerBA2} this may throw
 * exceptions. {@link ConsumerExBA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBA2(byte[][])}
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
public interface ConsumerExBA2 extends ConsumerEx<byte[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBA2(byte[][] a) throws Exception;
	
	@Override
	default void accept(byte[][] a) throws Exception
	{
		acceptBA2(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBA2 then(ConsumerExBA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBA2(a); after.acceptBA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBA2 then(ConsumerEx<? super byte[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBA2(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBA2 before(ConsumerExBA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBA2(a); acceptBA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBA2 before(ConsumerEx<? super byte[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBA2 of(ConsumerExBA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExBA2 consumer : consumers) consumer.acceptBA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBA2 of(ConsumerEx<? super byte[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super byte[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
