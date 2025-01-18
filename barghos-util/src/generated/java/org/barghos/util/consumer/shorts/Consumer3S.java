package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three short input arguments and
 * returns no result. {@link Consumer3S} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short, short, short)}
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface Consumer3S extends Consumer3<Short,Short,Short>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptS(short a, short b, short c);
	
	@Override
	default void accept(Short a, Short b, Short c)
	{
		acceptS(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3S} performing this operation and the
	 * operation after.
	 */
	default Consumer3S then(Consumer3S after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptS(a, b, c); after.acceptS(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3S} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3S then(Consumer3<? super Short,? super Short,? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptS(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3S} performing the operation before and
	 * this operation.
	 */
	default Consumer3S before(Consumer3S before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptS(a, b, c); acceptS(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3S} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3S before(Consumer3<? super Short,? super Short,? super Short> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptS(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3S} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3S of(Consumer3S... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3S consumer : consumers) consumer.acceptS(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3S} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3S of(Consumer3<? super Short,? super Short,? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3S) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super Short,? super Short,? super Short> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
