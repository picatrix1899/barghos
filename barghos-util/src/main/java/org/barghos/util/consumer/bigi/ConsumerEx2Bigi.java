package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link Consumer2Bigi}
 * this may throw exceptions. {@link ConsumerEx2Bigi} is expected to operate via
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
public interface ConsumerEx2Bigi extends ConsumerEx2<BigInteger,BigInteger>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2Bigi(BigInteger a, BigInteger b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2Bigi} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2Bigi then2Bigi(ConsumerEx2Bigi after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2Bigi(a, b); after.accept2Bigi(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2Bigi} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2Bigi before2Bigi(ConsumerEx2Bigi before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2Bigi(a, b); accept2Bigi(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2Bigi of2Bigi(ConsumerEx2Bigi... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2Bigi consumer : consumers) consumer.accept2Bigi(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2Bigi(BigInteger, BigInteger)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger a, BigInteger b) throws Exception
	{
		accept2Bigi(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2Bigi then(ConsumerEx2<BigInteger,BigInteger> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Bigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2Bigi before(ConsumerEx2<BigInteger,BigInteger> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2Bigi(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2Bigi of(ConsumerEx2<BigInteger,BigInteger>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2Bigi) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<BigInteger,BigInteger> consumer : consumers) consumer.accept(a, b); };
	}
}
