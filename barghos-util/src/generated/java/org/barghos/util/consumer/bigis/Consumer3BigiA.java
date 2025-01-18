package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional BigInteger array input
 * arguments and returns no result. {@link Consumer3BigiA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[], BigInteger[], BigInteger[])}
 * 
 * @see ConsumerBigiA
 * @see ConsumerExBigiA
 * @see Consumer2BigiA
 * @see ConsumerEx2BigiA
 * @see Consumer3BigiA
 * @see ConsumerEx3BigiA
 * @see Consumer4BigiA
 * @see ConsumerEx4BigiA
 */
@FunctionalInterface
public interface Consumer3BigiA extends Consumer3<BigInteger[],BigInteger[],BigInteger[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptBigi(BigInteger[] a, BigInteger[] b, BigInteger[] c);
	
	@Override
	default void accept(BigInteger[] a, BigInteger[] b, BigInteger[] c)
	{
		acceptBigi(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BigiA} performing this operation and the
	 * operation after.
	 */
	default Consumer3BigiA then(Consumer3BigiA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigi(a, b, c); after.acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA then(Consumer3<? super BigInteger[],? super BigInteger[],? super BigInteger[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBigi(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BigiA} performing the operation before and
	 * this operation.
	 */
	default Consumer3BigiA before(Consumer3BigiA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBigi(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3BigiA before(Consumer3<? super BigInteger[],? super BigInteger[],? super BigInteger[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigiA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3BigiA of(Consumer3BigiA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BigiA consumer : consumers) consumer.acceptBigi(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3BigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigiA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3BigiA of(Consumer3<? super BigInteger[],? super BigInteger[],? super BigInteger[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3BigiA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super BigInteger[],? super BigInteger[],? super BigInteger[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
