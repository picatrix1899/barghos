package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 2-dimensional boolean array input
 * arguments and returns no result. {@link Consumer4BoA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[][], boolean[][], boolean[][], boolean[][])}
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
public interface Consumer4BoA2 extends Consumer4<boolean[][],boolean[][],boolean[][],boolean[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptBo(boolean[][] a, boolean[][] b, boolean[][] c, boolean[][] d);
	
	@Override
	default void accept(boolean[][] a, boolean[][] b, boolean[][] c, boolean[][] d)
	{
		acceptBo(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4BoA2} performing this operation and the
	 * operation after.
	 */
	default Consumer4BoA2 then(Consumer4BoA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBo(a, b, c, d); after.acceptBo(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BoA2 then(Consumer4<? super boolean[][],? super boolean[][],? super boolean[][],? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptBo(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4BoA2} performing the operation before and
	 * this operation.
	 */
	default Consumer4BoA2 before(Consumer4BoA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBo(a, b, c, d); acceptBo(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BoA2 before(Consumer4<? super boolean[][],? super boolean[][],? super boolean[][],? super boolean[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBo(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BoA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4BoA2 of(Consumer4BoA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4BoA2 consumer : consumers) consumer.acceptBo(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BoA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4BoA2 of(Consumer4<? super boolean[][],? super boolean[][],? super boolean[][],? super boolean[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4BoA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super boolean[][],? super boolean[][],? super boolean[][],? super boolean[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
