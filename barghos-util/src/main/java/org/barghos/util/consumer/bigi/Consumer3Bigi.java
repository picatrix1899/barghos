package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three {@link BigInteger} input arguments
 * and returns no result. {@link Consumer3Bigi} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3Bigi(BigInteger, BigInteger, BigInteger)}
 * 
 * @see ConsumerBigi
 * @see ConsumerExBigi
 * @see Consumer2Bigi
 * @see ConsumerEx2Bigi
 * @see Consumer3Bigi
 * @see ConsumerEx3Bigi
 * @see Consumer4Bigi
 * @see ConsumerEx4Bigi
 */
@FunctionalInterface
public interface Consumer3Bigi extends Consumer3<BigInteger,BigInteger,BigInteger>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3Bigi(BigInteger a, BigInteger b, BigInteger c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3Bigi} performing this operation and the
	 * operation after.
	 */
	default Consumer3Bigi then3Bigi(Consumer3Bigi after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3Bigi(a, b, c); after.accept3Bigi(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3Bigi} performing the operation before and
	 * this operation.
	 */
	default Consumer3Bigi before3Bigi(Consumer3Bigi before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3Bigi(a, b, c); accept3Bigi(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Bigi} performing the operations.
	 */
	@SafeVarargs
	static Consumer3Bigi of3Bigi(Consumer3Bigi... consumers)
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
		
		return (a, b, c) -> { for(Consumer3Bigi consumer : consumers) consumer.accept3Bigi(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3Bigi(BigInteger, BigInteger, BigInteger)}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger a, BigInteger b, BigInteger c)
	{
		accept3Bigi(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3Bigi then(Consumer3<BigInteger,BigInteger,BigInteger> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3Bigi(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3Bigi before(Consumer3<BigInteger,BigInteger,BigInteger> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3Bigi(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Bigi} performing the operations.
	 */
	@SafeVarargs
	static Consumer3Bigi of(Consumer3<BigInteger,BigInteger,BigInteger>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3Bigi) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<BigInteger,BigInteger,BigInteger> consumer : consumers) consumer.accept(a, b, c); };
	}
}
