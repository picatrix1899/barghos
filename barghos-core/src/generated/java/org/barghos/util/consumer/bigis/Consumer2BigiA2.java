package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 2-dimensional BigInteger array input
 * arguments and returns no result. {@link Consumer2BigiA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[][], BigInteger[][])}
 * 
 * @see ConsumerBigiA2
 * @see ConsumerExBigiA2
 * @see Consumer2BigiA2
 * @see ConsumerEx2BigiA2
 * @see Consumer3BigiA2
 * @see ConsumerEx3BigiA2
 * @see Consumer4BigiA2
 * @see ConsumerEx4BigiA2
 */
@FunctionalInterface
public interface Consumer2BigiA2 extends Consumer2<BigInteger[][],BigInteger[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptBigi(BigInteger[][] a, BigInteger[][] b);
	
	@Override
	default void accept(BigInteger[][] a, BigInteger[][] b)
	{
		acceptBigi(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BigiA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2BigiA2 then(Consumer2BigiA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigi(a, b); after.acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigiA2 then(Consumer2<? super BigInteger[][],? super BigInteger[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigiA2 then(java.util.function.BiConsumer<? super BigInteger[][],? super BigInteger[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2BigiA2 andThen(java.util.function.BiConsumer<? super BigInteger[][],? super BigInteger[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BigiA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2BigiA2 before(Consumer2BigiA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigi(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigiA2 before(Consumer2<? super BigInteger[][],? super BigInteger[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigiA2 before(java.util.function.BiConsumer<? super BigInteger[][],? super BigInteger[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigiA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BigiA2 of(Consumer2BigiA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2BigiA2 consumer : consumers) consumer.acceptBigi(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2BigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigiA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BigiA2 of(Consumer2<? super BigInteger[][],? super BigInteger[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};
		
		if(consumers.length == 1) return (Consumer2BigiA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super BigInteger[][],? super BigInteger[][]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2BigiA2 of(java.util.function.BiConsumer<? super BigInteger[][],? super BigInteger[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2BigiA2)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super BigInteger[][],? super BigInteger[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
