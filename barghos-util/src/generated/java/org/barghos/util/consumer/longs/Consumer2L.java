package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two long input arguments and returns
 * no result. {@link Consumer2L} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long, long)}
 * 
 * @see ConsumerL
 * @see ConsumerExL
 * @see Consumer2L
 * @see ConsumerEx2L
 * @see Consumer3L
 * @see ConsumerEx3L
 * @see Consumer4L
 * @see ConsumerEx4L
 */
@FunctionalInterface
public interface Consumer2L extends Consumer2<Long,Long>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptL(long a, long b);
	
	@Override
	default void accept(Long a, Long b)
	{
		acceptL(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2L} performing this operation and the
	 * operation after.
	 */
	default Consumer2L then(Consumer2L after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptL(a, b); after.acceptL(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2L} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2L then(Consumer2<? super Long,? super Long> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptL(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2L} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2L then(java.util.function.BiConsumer<? super Long,? super Long> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptL(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2L andThen(java.util.function.BiConsumer<? super Long,? super Long> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptL(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2L} performing the operation before and
	 * this operation.
	 */
	default Consumer2L before(Consumer2L before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptL(a, b); acceptL(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2L} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2L before(Consumer2<? super Long,? super Long> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptL(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2L} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2L before(java.util.function.BiConsumer<? super Long,? super Long> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptL(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2L} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2L} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2L of(Consumer2L... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2L consumer : consumers) consumer.acceptL(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2L} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2L} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2L of(Consumer2<? super Long,? super Long>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2L) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Long,? super Long> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2L of(java.util.function.BiConsumer<? super Long,? super Long>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2L)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Long,? super Long> consumer : consumers) consumer.accept(a, b); };
	}
	
}
