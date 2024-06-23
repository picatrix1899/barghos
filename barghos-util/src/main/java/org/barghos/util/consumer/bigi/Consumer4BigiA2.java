package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

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
 * {@link #accept4BigiA2(BigInteger[][], BigInteger[][], BigInteger[][], BigInteger[][])}
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
	void accept4BigiA2(BigInteger[][] a, BigInteger[][] b, BigInteger[][] c, BigInteger[][] d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4BigiA2} performing this operation and the
	 * operation after.
	 */
	default Consumer4BigiA2 then4BigiA2(Consumer4BigiA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BigiA2(a, b, c, d); after.accept4BigiA2(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4BigiA2} performing the operation before and
	 * this operation.
	 */
	default Consumer4BigiA2 before4BigiA2(Consumer4BigiA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BigiA2(a, b, c, d); accept4BigiA2(a, b, c, d); };
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
	static Consumer4BigiA2 of4BigiA2(Consumer4BigiA2... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4BigiA2 consumer : consumers) consumer.accept4BigiA2(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4BigiA2(BigInteger[][], BigInteger[][], BigInteger[][], BigInteger[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[][] a, BigInteger[][] b, BigInteger[][] c, BigInteger[][] d)
	{
		accept4BigiA2(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigiA2 then(Consumer4<BigInteger[][],BigInteger[][],BigInteger[][],BigInteger[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4BigiA2(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigiA2 before(Consumer4<BigInteger[][],BigInteger[][],BigInteger[][],BigInteger[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BigiA2(a, b, c, d); };
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
	static Consumer4BigiA2 of(Consumer4<BigInteger[][],BigInteger[][],BigInteger[][],BigInteger[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4BigiA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<BigInteger[][],BigInteger[][],BigInteger[][],BigInteger[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
