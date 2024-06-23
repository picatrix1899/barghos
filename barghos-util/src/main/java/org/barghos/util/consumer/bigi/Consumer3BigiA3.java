package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 3-dimensional {@link BigInteger}
 * array input arguments and returns no result. {@link Consumer3BigiA3} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BigiA3(BigInteger[][][], BigInteger[][][], BigInteger[][][])}
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
	void accept3BigiA3(BigInteger[][][] a, BigInteger[][][] b, BigInteger[][][] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BigiA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3BigiA3 then3BigiA3(Consumer3BigiA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BigiA3(a, b, c); after.accept3BigiA3(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BigiA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3BigiA3 before3BigiA3(Consumer3BigiA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BigiA3(a, b, c); accept3BigiA3(a, b, c); };
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
	static Consumer3BigiA3 of3BigiA3(Consumer3BigiA3... consumers)
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
		
		return (a, b, c) -> { for(Consumer3BigiA3 consumer : consumers) consumer.accept3BigiA3(a, b, c); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept3BigiA3(BigInteger[][][], BigInteger[][][], BigInteger[][][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[][][] a, BigInteger[][][] b, BigInteger[][][] c)
	{
		accept3BigiA3(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA3 then(Consumer3<BigInteger[][][],BigInteger[][][],BigInteger[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BigiA3(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigiA3 before(Consumer3<BigInteger[][][],BigInteger[][][],BigInteger[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BigiA3(a, b, c); };
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
	static Consumer3BigiA3 of(Consumer3<BigInteger[][][],BigInteger[][][],BigInteger[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3BigiA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<BigInteger[][][],BigInteger[][][],BigInteger[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
