package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 1-dimensional short array input
 * arguments and returns no result. {@link Consumer4SA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short[], short[], short[], short[])}
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
public interface Consumer4SA extends Consumer4<short[],short[],short[],short[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptS(short[] a, short[] b, short[] c, short[] d);
	
	@Override
	default void accept(short[] a, short[] b, short[] c, short[] d)
	{
		acceptS(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4SA} performing this operation and the
	 * operation after.
	 */
	default Consumer4SA then(Consumer4SA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptS(a, b, c, d); after.acceptS(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4SA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4SA then(Consumer4<? super short[],? super short[],? super short[],? super short[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptS(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4SA} performing the operation before and
	 * this operation.
	 */
	default Consumer4SA before(Consumer4SA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptS(a, b, c, d); acceptS(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4SA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4SA before(Consumer4<? super short[],? super short[],? super short[],? super short[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptS(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4SA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4SA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4SA of(Consumer4SA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4SA consumer : consumers) consumer.acceptS(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4SA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4SA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4SA of(Consumer4<? super short[],? super short[],? super short[],? super short[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (Consumer4SA) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super short[],? super short[],? super short[],? super short[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
