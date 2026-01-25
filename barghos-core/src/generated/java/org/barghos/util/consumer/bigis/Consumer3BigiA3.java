package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 3-dimensional BigInteger array input
 * arguments and returns no result. {@link Consumer3BigiA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[][][], BigInteger[][][], BigInteger[][][])}
 * 
 * @see ConsumerBigiA3
 * @see ConsumerExBigiA3
 * @see Consumer2BigiA3
 * @see ConsumerEx2BigiA3
 * @see Consumer3BigiA3
 * @see ConsumerEx3BigiA3
 * @see Consumer4BigiA3
 * @see ConsumerEx4BigiA3
 */
@FunctionalInterface
public interface Consumer3BigiA3 extends Consumer3<BigInteger[][][],BigInteger[][][],BigInteger[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptBigi(BigInteger[][][] a, BigInteger[][][] b, BigInteger[][][] c);
	
	@Override
	default void accept(BigInteger[][][] a, BigInteger[][][] b, BigInteger[][][] c)
	{
		acceptBigi(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BigiA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3BigiA3 then(Consumer3BigiA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigi(a, b, c); after.acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA3 then(Consumer3<? super BigInteger[][][],? super BigInteger[][][],? super BigInteger[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBigi(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BigiA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3BigiA3 before(Consumer3BigiA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBigi(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA3 before(Consumer3<? super BigInteger[][][],? super BigInteger[][][],? super BigInteger[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BigiA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigiA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BigiA3 of(Consumer3BigiA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BigiA3 consumer : consumers) consumer.acceptBigi(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3BigiA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigiA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BigiA3 of(Consumer3<? super BigInteger[][][],? super BigInteger[][][],? super BigInteger[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (Consumer3BigiA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super BigInteger[][][],? super BigInteger[][][],? super BigInteger[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
