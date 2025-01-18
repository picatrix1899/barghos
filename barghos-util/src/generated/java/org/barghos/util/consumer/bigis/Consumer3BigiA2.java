package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional BigInteger array input
 * arguments and returns no result. {@link Consumer3BigiA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[][], BigInteger[][], BigInteger[][])}
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
public interface Consumer3BigiA2 extends Consumer3<BigInteger[][],BigInteger[][],BigInteger[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptBigi(BigInteger[][] a, BigInteger[][] b, BigInteger[][] c);
	
	@Override
	default void accept(BigInteger[][] a, BigInteger[][] b, BigInteger[][] c)
	{
		acceptBigi(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BigiA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3BigiA2 then(Consumer3BigiA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigi(a, b, c); after.acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA2 then(Consumer3<? super BigInteger[][],? super BigInteger[][],? super BigInteger[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBigi(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BigiA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3BigiA2 before(Consumer3BigiA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBigi(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA2 before(Consumer3<? super BigInteger[][],? super BigInteger[][],? super BigInteger[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigiA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3BigiA2 of(Consumer3BigiA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BigiA2 consumer : consumers) consumer.acceptBigi(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3BigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigiA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3BigiA2 of(Consumer3<? super BigInteger[][],? super BigInteger[][],? super BigInteger[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};
		
		if(consumers.length == 1) return (Consumer3BigiA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super BigInteger[][],? super BigInteger[][],? super BigInteger[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
