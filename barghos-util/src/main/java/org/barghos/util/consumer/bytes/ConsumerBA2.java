package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional byte array input
 * argument and returns no result. {@link ConsumerBA2} is expected to operate
 * via side-effects.
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
public interface ConsumerBA2 extends Consumer<byte[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBA2(byte[][] a);
	
	@Override
	default void accept(byte[][] a)
	{
		acceptBA2(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerBA2 then(ConsumerBA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBA2(a); after.acceptBA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA2 then(Consumer<? super byte[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA2 then(java.util.function.Consumer<? super byte[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBA2(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBA2 andThen(java.util.function.Consumer<? super byte[][]> after)
	{
		return then(after);
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerBA2 before(ConsumerBA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBA2(a); acceptBA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA2 before(Consumer<? super byte[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA2 before(java.util.function.Consumer<? super byte[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA2 of(ConsumerBA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBA2 consumer : consumers) consumer.acceptBA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA2 of(Consumer<? super byte[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBA2) consumers[0]::accept;

		return (a) -> { for(Consumer<? super byte[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA2 of(java.util.function.Consumer<? super byte[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBA2)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super byte[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
