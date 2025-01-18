package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 2-dimensional {@link BigInteger}
 * array input arguments and returns no result. {@link Consumer4BigiA2} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[][], BigInteger[][], BigInteger[][], BigInteger[][])}
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
public interface Consumer4BigiA2 extends Consumer4<BigInteger[][],BigInteger[][],BigInteger[][],BigInteger[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptBigi(BigInteger[][] a, BigInteger[][] b, BigInteger[][] c, BigInteger[][] d);
	
	@Override
	default void accept(BigInteger[][] a, BigInteger[][] b, BigInteger[][] c, BigInteger[][] d)
	{
		acceptBigi(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4BigiA2} performing this operation and the
	 * operation after.
	 */
	default Consumer4BigiA2 then(Consumer4BigiA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigi(a, b, c, d); after.acceptBigi(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigiA2 then(Consumer4<? super BigInteger[][],? super BigInteger[][],? super BigInteger[][],? super BigInteger[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptBigi(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4BigiA2} performing the operation before and
	 * this operation.
	 */
	default Consumer4BigiA2 before(Consumer4BigiA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBigi(a, b, c, d); acceptBigi(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigiA2 before(Consumer4<? super BigInteger[][],? super BigInteger[][],? super BigInteger[][],? super BigInteger[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBigi(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BigiA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer4BigiA2 of(Consumer4BigiA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4BigiA2 consumer : consumers) consumer.acceptBigi(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BigiA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer4BigiA2 of(Consumer4<? super BigInteger[][],? super BigInteger[][],? super BigInteger[][],? super BigInteger[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4BigiA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super BigInteger[][],? super BigInteger[][],? super BigInteger[][],? super BigInteger[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
