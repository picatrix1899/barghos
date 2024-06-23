package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link Consumer4Bigi}
 * this may throw exceptions. {@link ConsumerEx4Bigi} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4Bigi(BigInteger, BigInteger, BigInteger, BigInteger)}
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
public interface ConsumerEx4Bigi extends ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept4Bigi(BigInteger a, BigInteger b, BigInteger c, BigInteger d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bigi} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4Bigi then4Bigi(ConsumerEx4Bigi after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4Bigi(a, b, c, d); after.accept4Bigi(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bigi} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4Bigi before4Bigi(ConsumerEx4Bigi before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4Bigi(a, b, c, d); accept4Bigi(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Bigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4Bigi of4Bigi(ConsumerEx4Bigi... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4Bigi consumer : consumers) consumer.accept4Bigi(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4Bigi(BigInteger, BigInteger, BigInteger, BigInteger)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger a, BigInteger b, BigInteger c, BigInteger d) throws Exception
	{
		accept4Bigi(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Bigi then(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4Bigi(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Bigi before(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4Bigi(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Bigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4Bigi of(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4Bigi) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<BigInteger,BigInteger,BigInteger,BigInteger> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
