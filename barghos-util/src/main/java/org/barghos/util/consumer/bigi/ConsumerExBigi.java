package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link ConsumerBigi} this
 * may throw exceptions. {@link ConsumerExBigi} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger)}
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
public interface ConsumerExBigi extends ConsumerEx<BigInteger>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigi(BigInteger a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigi} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigi thenBigi(ConsumerExBigi after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigi(a); after.acceptBigi(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigi} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBigi beforeBigi(ConsumerExBigi before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigi(a); acceptBigi(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigi ofBigi(ConsumerExBigi... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExBigi consumer : consumers) consumer.acceptBigi(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigi(BigInteger)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger a) throws Exception
	{
		acceptBigi(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigi then(ConsumerEx<BigInteger> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigi before(ConsumerEx<BigInteger> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigi of(ConsumerEx<BigInteger>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigi) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<BigInteger> consumer : consumers) consumer.accept(a); };
	}
}
