package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four short input arguments and returns
 * no result. {@link Consumer4S} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short, short, short, short)}
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
public interface Consumer4S extends Consumer4<Short,Short,Short,Short>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptS(short a, short b, short c, short d);
	
	@Override
	default void accept(Short a, Short b, Short c, Short d)
	{
		acceptS(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4S} performing this operation and the
	 * operation after.
	 */
	default Consumer4S then(Consumer4S after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptS(a, b, c, d); after.acceptS(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4S} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4S then(Consumer4<? super Short,? super Short,? super Short,? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptS(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4S} performing the operation before and
	 * this operation.
	 */
	default Consumer4S before(Consumer4S before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptS(a, b, c, d); acceptS(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4S} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4S before(Consumer4<? super Short,? super Short,? super Short,? super Short> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptS(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4S} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4S of(Consumer4S... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4S consumer : consumers) consumer.acceptS(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4S} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4S of(Consumer4<? super Short,? super Short,? super Short,? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (Consumer4S) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super Short,? super Short,? super Short,? super Short> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
