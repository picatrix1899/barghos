package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional short array input
 * arguments and returns no result. {@link Consumer3SA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short[], short[], short[])}
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
public interface Consumer3SA extends Consumer3<short[],short[],short[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptS(short[] a, short[] b, short[] c);
	
	@Override
	default void accept(short[] a, short[] b, short[] c)
	{
		acceptS(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3SA} performing this operation and the
	 * operation after.
	 */
	default Consumer3SA then(Consumer3SA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptS(a, b, c); after.acceptS(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3SA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3SA then(Consumer3<? super short[],? super short[],? super short[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptS(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3SA} performing the operation before and
	 * this operation.
	 */
	default Consumer3SA before(Consumer3SA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptS(a, b, c); acceptS(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3SA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3SA before(Consumer3<? super short[],? super short[],? super short[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptS(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3SA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3SA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3SA of(Consumer3SA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3SA consumer : consumers) consumer.acceptS(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3SA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3SA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3SA of(Consumer3<? super short[],? super short[],? super short[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3SA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super short[],? super short[],? super short[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
