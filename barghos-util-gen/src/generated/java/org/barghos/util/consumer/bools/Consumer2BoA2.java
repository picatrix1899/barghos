package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 2-dimensional boolean array input
 * arguments and returns no result. {@link Consumer2BoA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[][], boolean[][])}
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
public interface Consumer2BoA2 extends Consumer2<boolean[][],boolean[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptBo(boolean[][] a, boolean[][] b);
	
	@Override
	default void accept(boolean[][] a, boolean[][] b)
	{
		acceptBo(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2BoA2 then(Consumer2BoA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBo(a, b); after.acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA2 then(Consumer2<? super boolean[][],? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA2 then(java.util.function.BiConsumer<? super boolean[][],? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2BoA2 andThen(java.util.function.BiConsumer<? super boolean[][],? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BoA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2BoA2 before(Consumer2BoA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBo(a, b); acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA2 before(Consumer2<? super boolean[][],? super boolean[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA2 before(java.util.function.BiConsumer<? super boolean[][],? super boolean[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBo(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BoA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BoA2 of(Consumer2BoA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2BoA2 consumer : consumers) consumer.acceptBo(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BoA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BoA2 of(Consumer2<? super boolean[][],? super boolean[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};
		
		if(consumers.length == 1) return (Consumer2BoA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super boolean[][],? super boolean[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BoA2 of(java.util.function.BiConsumer<? super boolean[][],? super boolean[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2BoA2)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super boolean[][],? super boolean[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
