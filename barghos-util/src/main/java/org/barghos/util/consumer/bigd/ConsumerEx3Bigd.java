package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer3Bigd}
 * this may throw exceptions. {@link ConsumerEx3Bigd} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3Bigd(BigDecimal, BigDecimal, BigDecimal)}
 * 
 * @see ConsumerBigd
 * @see ConsumerExBigd
 * @see Consumer2Bigd
 * @see ConsumerEx2Bigd
 * @see Consumer3Bigd
 * @see ConsumerEx3Bigd
 * @see Consumer4Bigd
 * @see ConsumerEx4Bigd
 */
@FunctionalInterface
public interface ConsumerEx3Bigd extends ConsumerEx3<BigDecimal,BigDecimal,BigDecimal>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept3Bigd(BigDecimal a, BigDecimal b, BigDecimal c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3Bigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3Bigd then3Bigd(ConsumerEx3Bigd after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3Bigd(a, b, c); after.accept3Bigd(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3Bigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3Bigd before3Bigd(ConsumerEx3Bigd before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3Bigd(a, b, c); accept3Bigd(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3Bigd of3Bigd(ConsumerEx3Bigd... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3Bigd consumer : consumers) consumer.accept3Bigd(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3Bigd(BigDecimal, BigDecimal, BigDecimal)}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal a, BigDecimal b, BigDecimal c) throws Exception
	{
		accept3Bigd(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3Bigd then(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3Bigd(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3Bigd before(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3Bigd(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3Bigd of(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3Bigd) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<BigDecimal,BigDecimal,BigDecimal> consumer : consumers) consumer.accept(a, b, c); };
	}
}
