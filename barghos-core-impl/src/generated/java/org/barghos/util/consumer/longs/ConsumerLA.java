package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional long array input
 * argument and returns no result. {@link ConsumerLA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long[])}
 * 
 * @see ConsumerLA
 * @see ConsumerExLA
 * @see Consumer2LA
 * @see ConsumerEx2LA
 * @see Consumer3LA
 * @see ConsumerEx3LA
 * @see Consumer4LA
 * @see ConsumerEx4LA
 */
@FunctionalInterface
public interface ConsumerLA extends Consumer<long[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptL(long[] a);
	
	@Override
	default void accept(long[] a)
	{
		acceptL(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerLA} performing this operation and the
	 * operation after.
	 */
	default ConsumerLA then(ConsumerLA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptL(a); after.acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA then(Consumer<? super long[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA then(java.util.function.Consumer<? super long[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	@Override
	default ConsumerLA andThen(java.util.function.Consumer<? super long[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerLA} performing the operation before and
	 * this operation.
	 */
	default ConsumerLA before(ConsumerLA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptL(a); acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerLA before(Consumer<? super long[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerLA before(java.util.function.Consumer<? super long[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptL(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerLA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerLA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerLA of(ConsumerLA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerLA consumer : consumers) consumer.acceptL(a); };
	}

	/**
	 * Composes a new {@link ConsumerLA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerLA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerLA of(Consumer<? super long[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerLA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super long[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerLA of(java.util.function.Consumer<? super long[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerLA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super long[]> consumer : consumers) consumer.accept(a); };
	}
	
}
