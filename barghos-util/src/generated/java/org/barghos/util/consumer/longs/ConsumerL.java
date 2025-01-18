package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one long input argument and returns no
 * result. {@link ConsumerL} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long)}
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
public interface ConsumerL extends Consumer<Long>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptL(long a);
	
	@Override
	default void accept(Long a)
	{
		acceptL(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerL} performing this operation and the
	 * operation after.
	 */
	default ConsumerL then(ConsumerL after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptL(a); after.acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerL} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerL then(Consumer<? super Long> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerL} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerL then(java.util.function.Consumer<? super Long> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	@Override
	default ConsumerL andThen(java.util.function.Consumer<? super Long> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptL(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerL} performing the operation before and this
	 * operation.
	 */
	default ConsumerL before(ConsumerL before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptL(a); acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerL} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerL before(Consumer<? super Long> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptL(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerL} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerL before(java.util.function.Consumer<? super Long> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptL(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerL} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerL} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerL of(ConsumerL... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerL consumer : consumers) consumer.acceptL(a); };
	}

	/**
	 * Composes a new {@link ConsumerL} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerL} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerL of(Consumer<? super Long>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerL) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Long> consumer : consumers) consumer.accept(a); };
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
	static ConsumerL of(java.util.function.Consumer<? super Long>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerL)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super Long> consumer : consumers) consumer.accept(a); };
	}
	
}
