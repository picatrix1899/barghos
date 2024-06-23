package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 2-dimensional {@link BigInteger}
 * array input arguments and returns no result. {@link Consumer3BigiA2} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BigiA2(BigInteger[][], BigInteger[][], BigInteger[][])}
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
	void accept3BigiA2(BigInteger[][] a, BigInteger[][] b, BigInteger[][] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BigiA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3BigiA2 then3BigiA2(Consumer3BigiA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BigiA2(a, b, c); after.accept3BigiA2(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BigiA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3BigiA2 before3BigiA2(Consumer3BigiA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BigiA2(a, b, c); accept3BigiA2(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigiA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BigiA2 of3BigiA2(Consumer3BigiA2... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BigiA2 consumer : consumers) consumer.accept3BigiA2(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3BigiA2(BigInteger[][], BigInteger[][], BigInteger[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[][] a, BigInteger[][] b, BigInteger[][] c)
	{
		accept3BigiA2(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA2 then(Consumer3<BigInteger[][],BigInteger[][],BigInteger[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BigiA2(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA2 before(Consumer3<BigInteger[][],BigInteger[][],BigInteger[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BigiA2(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigiA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BigiA2 of(Consumer3<BigInteger[][],BigInteger[][],BigInteger[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};
		
		if(consumers.length == 1) return (Consumer3BigiA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<BigInteger[][],BigInteger[][],BigInteger[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
