package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional byte array input
 * argument and returns no result. {@link ConsumerBA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptB(byte[])}
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
public interface ConsumerBA extends Consumer<byte[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptB(byte[] a);
	
	@Override
	default void accept(byte[] a)
	{
		acceptB(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBA} performing this operation and the
	 * operation after.
	 */
	default ConsumerBA then(ConsumerBA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptB(a); after.acceptB(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA then(Consumer<? super byte[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptB(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA then(java.util.function.Consumer<? super byte[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptB(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBA andThen(java.util.function.Consumer<? super byte[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptB(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBA} performing the operation before and
	 * this operation.
	 */
	default ConsumerBA before(ConsumerBA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptB(a); acceptB(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBA before(Consumer<? super byte[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptB(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBA before(java.util.function.Consumer<? super byte[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptB(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA of(ConsumerBA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBA consumer : consumers) consumer.acceptB(a); };
	}

	/**
	 * Composes a new {@link ConsumerBA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA of(Consumer<? super byte[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super byte[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBA of(java.util.function.Consumer<? super byte[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super byte[]> consumer : consumers) consumer.accept(a); };
	}
	
}
