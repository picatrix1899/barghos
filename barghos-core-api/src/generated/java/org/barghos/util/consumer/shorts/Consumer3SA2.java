package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional short array input
 * arguments and returns no result. {@link Consumer3SA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short[][], short[][], short[][])}
 * 
 * @see ConsumerSA2
 * @see ConsumerExSA2
 * @see Consumer2SA2
 * @see ConsumerEx2SA2
 * @see Consumer3SA2
 * @see ConsumerEx3SA2
 * @see Consumer4SA2
 * @see ConsumerEx4SA2
 */
@FunctionalInterface
public interface Consumer3SA2 extends Consumer3<short[][],short[][],short[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptS(short[][] a, short[][] b, short[][] c);
	
	@Override
	default void accept(short[][] a, short[][] b, short[][] c)
	{
		acceptS(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3SA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3SA2 then(Consumer3SA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptS(a, b, c); after.acceptS(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3SA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3SA2 then(Consumer3<? super short[][],? super short[][],? super short[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptS(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3SA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3SA2 before(Consumer3SA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptS(a, b, c); acceptS(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3SA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3SA2 before(Consumer3<? super short[][],? super short[][],? super short[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptS(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3SA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3SA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3SA2 of(Consumer3SA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3SA2 consumer : consumers) consumer.acceptS(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3SA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3SA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3SA2 of(Consumer3<? super short[][],? super short[][],? super short[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};
		
		if(consumers.length == 1) return (Consumer3SA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super short[][],? super short[][],? super short[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
