package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional short array input
 * argument and returns no result. {@link ConsumerSA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short[])}
 * 
 * @see ConsumerSA
 * @see ConsumerExSA
 * @see Consumer2SA
 * @see ConsumerEx2SA
 * @see Consumer3SA
 * @see ConsumerEx3SA
 * @see Consumer4SA
 * @see ConsumerEx4SA
 */
@FunctionalInterface
public interface ConsumerSA extends Consumer<short[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptS(short[] a);
	
	@Override
	default void accept(short[] a)
	{
		acceptS(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerSA} performing this operation and the
	 * operation after.
	 */
	default ConsumerSA then(ConsumerSA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptS(a); after.acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerSA then(Consumer<? super short[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerSA then(java.util.function.Consumer<? super short[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	@Override
	default ConsumerSA andThen(java.util.function.Consumer<? super short[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerSA} performing the operation before and
	 * this operation.
	 */
	default ConsumerSA before(ConsumerSA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptS(a); acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerSA before(Consumer<? super short[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerSA before(java.util.function.Consumer<? super short[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerSA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerSA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerSA of(ConsumerSA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerSA consumer : consumers) consumer.acceptS(a); };
	}

	/**
	 * Composes a new {@link ConsumerSA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerSA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerSA of(Consumer<? super short[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerSA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super short[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerSA of(java.util.function.Consumer<? super short[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerSA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super short[]> consumer : consumers) consumer.accept(a); };
	}
	
}
