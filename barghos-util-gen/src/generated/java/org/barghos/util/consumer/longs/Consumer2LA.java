package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional long array input
 * arguments and returns no result. {@link Consumer2LA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long[], long[])}
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
public interface Consumer2LA extends Consumer2<long[],long[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptL(long[] a, long[] b);
	
	@Override
	default void accept(long[] a, long[] b)
	{
		acceptL(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2LA} performing this operation and the
	 * operation after.
	 */
	default Consumer2LA then(Consumer2LA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptL(a, b); after.acceptL(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2LA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2LA then(Consumer2<? super long[],? super long[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptL(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2LA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2LA then(java.util.function.BiConsumer<? super long[],? super long[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptL(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2LA andThen(java.util.function.BiConsumer<? super long[],? super long[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptL(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2LA} performing the operation before and
	 * this operation.
	 */
	default Consumer2LA before(Consumer2LA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptL(a, b); acceptL(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2LA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2LA before(Consumer2<? super long[],? super long[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptL(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2LA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2LA before(java.util.function.BiConsumer<? super long[],? super long[]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptL(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2LA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2LA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2LA of(Consumer2LA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2LA consumer : consumers) consumer.acceptL(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2LA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2LA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2LA of(Consumer2<? super long[],? super long[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2LA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super long[],? super long[]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2LA of(java.util.function.BiConsumer<? super long[],? super long[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2LA)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super long[],? super long[]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
