package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional boolean array input
 * arguments and returns no result. {@link Consumer3BoA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[][], boolean[][], boolean[][])}
 * 
 * @see ConsumerBoA2
 * @see ConsumerExBoA2
 * @see Consumer2BoA2
 * @see ConsumerEx2BoA2
 * @see Consumer3BoA2
 * @see ConsumerEx3BoA2
 * @see Consumer4BoA2
 * @see ConsumerEx4BoA2
 */
@FunctionalInterface
public interface Consumer3BoA2 extends Consumer3<boolean[][],boolean[][],boolean[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptBo(boolean[][] a, boolean[][] b, boolean[][] c);
	
	@Override
	default void accept(boolean[][] a, boolean[][] b, boolean[][] c)
	{
		acceptBo(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BoA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3BoA2 then(Consumer3BoA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBo(a, b, c); after.acceptBo(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BoA2 then(Consumer3<? super boolean[][],? super boolean[][],? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBo(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BoA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3BoA2 before(Consumer3BoA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBo(a, b, c); acceptBo(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BoA2 before(Consumer3<? super boolean[][],? super boolean[][],? super boolean[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBo(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BoA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BoA2 of(Consumer3BoA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BoA2 consumer : consumers) consumer.acceptBo(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BoA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BoA2 of(Consumer3<? super boolean[][],? super boolean[][],? super boolean[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};
		
		if(consumers.length == 1) return (Consumer3BoA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super boolean[][],? super boolean[][],? super boolean[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
