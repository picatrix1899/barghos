package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one {@link BigInteger} input argument
 * and returns no result. {@link ConsumerBigi} is expected to operate via
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
public interface ConsumerBigi extends Consumer<BigInteger>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigi(BigInteger a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigi thenBigi(ConsumerBigi after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigi(a); after.acceptBigi(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigi beforeBigi(ConsumerBigi before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigi(a); acceptBigi(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigi ofBigi(ConsumerBigi... consumers)
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
		
		return (a) -> { for(ConsumerBigi consumer : consumers) consumer.acceptBigi(a); };
	}

	/**
	 * @deprecated Use {@link #acceptBigi(BigInteger)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger a)
	{
		acceptBigi(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigi then(Consumer<BigInteger> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigi then(java.util.function.Consumer<? super BigInteger> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigi before(Consumer<BigInteger> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigi before(java.util.function.Consumer<? super BigInteger> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigi of(Consumer<BigInteger>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigi) consumers[0]::accept;

		return (a) -> { for(Consumer<BigInteger> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBigi andThen(java.util.function.Consumer<? super BigInteger> after)
	{
		return then(after);
	}
}
