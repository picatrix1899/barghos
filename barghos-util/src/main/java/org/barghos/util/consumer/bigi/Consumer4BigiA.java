package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. {@link Consumer4BigiA} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4BigiA(BigInteger[], BigInteger[], BigInteger[], BigInteger[])}
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
public interface Consumer4BigiA extends Consumer4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4BigiA(BigInteger[] a, BigInteger[] b, BigInteger[] c, BigInteger[] d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4BigiA} performing this operation and the
	 * operation after.
	 */
	default Consumer4BigiA then4BigiA(Consumer4BigiA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BigiA(a, b, c, d); after.accept4BigiA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4BigiA} performing the operation before and
	 * this operation.
	 */
	default Consumer4BigiA before4BigiA(Consumer4BigiA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BigiA(a, b, c, d); accept4BigiA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BigiA} performing the operations.
	 */
	@SafeVarargs
	static Consumer4BigiA of4BigiA(Consumer4BigiA... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4BigiA consumer : consumers) consumer.accept4BigiA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4BigiA(BigInteger[], BigInteger[], BigInteger[], BigInteger[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[] a, BigInteger[] b, BigInteger[] c, BigInteger[] d)
	{
		accept4BigiA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigiA then(Consumer4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BigiA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigiA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4BigiA before(Consumer4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BigiA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BigiA} performing the operations.
	 */
	@SafeVarargs
	static Consumer4BigiA of(Consumer4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4BigiA) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
