package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional short array input
 * arguments and returns no result. {@link Consumer2SA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short[], short[])}
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
public interface Consumer2SA extends Consumer2<short[],short[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptS(short[] a, short[] b);
	
	@Override
	default void accept(short[] a, short[] b)
	{
		acceptS(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2SA} performing this operation and the
	 * operation after.
	 */
	default Consumer2SA then(Consumer2SA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptS(a, b); after.acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2SA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2SA then(Consumer2<? super short[],? super short[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptS(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2SA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2SA then(java.util.function.BiConsumer<? super short[],? super short[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptS(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2SA andThen(java.util.function.BiConsumer<? super short[],? super short[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptS(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2SA} performing the operation before and
	 * this operation.
	 */
	default Consumer2SA before(Consumer2SA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptS(a, b); acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2SA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2SA before(Consumer2<? super short[],? super short[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2SA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2SA before(java.util.function.BiConsumer<? super short[],? super short[]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptS(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2SA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2SA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2SA of(Consumer2SA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2SA consumer : consumers) consumer.acceptS(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2SA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2SA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2SA of(Consumer2<? super short[],? super short[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2SA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super short[],? super short[]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2SA of(java.util.function.BiConsumer<? super short[],? super short[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2SA)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super short[],? super short[]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
