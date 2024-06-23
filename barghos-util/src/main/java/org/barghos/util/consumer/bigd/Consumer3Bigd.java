package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three {@link BigDecimal} input arguments
 * and returns no result. {@link Consumer3Bigd} is expected to operate via
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
public interface Consumer3Bigd extends Consumer3<BigDecimal,BigDecimal,BigDecimal>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3Bigd(BigDecimal a, BigDecimal b, BigDecimal c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3Bigd} performing this operation and the
	 * operation after.
	 */
	default Consumer3Bigd then3Bigd(Consumer3Bigd after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3Bigd(a, b, c); after.accept3Bigd(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3Bigd} performing the operation before and
	 * this operation.
	 */
	default Consumer3Bigd before3Bigd(Consumer3Bigd before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3Bigd(a, b, c); accept3Bigd(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer3Bigd of3Bigd(Consumer3Bigd... consumers)
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
		
		return (a, b, c) -> { for(Consumer3Bigd consumer : consumers) consumer.accept3Bigd(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3Bigd(BigDecimal, BigDecimal, BigDecimal)}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal a, BigDecimal b, BigDecimal c)
	{
		accept3Bigd(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3Bigd then(Consumer3<BigDecimal,BigDecimal,BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3Bigd(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3Bigd} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3Bigd before(Consumer3<BigDecimal,BigDecimal,BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3Bigd(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer3Bigd of(Consumer3<BigDecimal,BigDecimal,BigDecimal>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3Bigd) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<BigDecimal,BigDecimal,BigDecimal> consumer : consumers) consumer.accept(a, b, c); };
	}
}
