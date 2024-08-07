package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two {@link BigInteger} input arguments
 * and returns no result. {@link Consumer2Bigi} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2Bigi(BigInteger, BigInteger)}
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
public interface Consumer2Bigi extends Consumer2<BigInteger,BigInteger>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2Bigi(BigInteger a, BigInteger b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	default Consumer2Bigi then2Bigi(Consumer2Bigi after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2Bigi(a, b); after.accept2Bigi(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	default Consumer2Bigi before2Bigi(Consumer2Bigi before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2Bigi(a, b); accept2Bigi(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bigi of2Bigi(Consumer2Bigi... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2Bigi consumer : consumers) consumer.accept2Bigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bigi then(Consumer2<BigInteger,BigInteger> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Bigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bigi then(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Bigi(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bigi before(Consumer2<BigInteger,BigInteger> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2Bigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bigi before(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2Bigi(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bigi of(Consumer2<BigInteger,BigInteger>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2Bigi) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<BigInteger,BigInteger> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2Bigi(BigInteger, BigInteger)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger a, BigInteger b)
	{
		accept2Bigi(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2Bigi andThen(java.util.function.BiConsumer<? super BigInteger,? super BigInteger> after)
	{
		return then(after);
	}
}
