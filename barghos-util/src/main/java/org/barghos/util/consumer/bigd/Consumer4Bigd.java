package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four {@link BigDecimal} input arguments
 * and returns no result. {@link Consumer4Bigd} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4Bigd(BigDecimal, BigDecimal, BigDecimal, BigDecimal)}
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
public interface Consumer4Bigd extends Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4Bigd(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4Bigd} performing this operation and the
	 * operation after.
	 */
	default Consumer4Bigd then4Bigd(Consumer4Bigd after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4Bigd(a, b, c, d); after.accept4Bigd(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4Bigd} performing the operation before and
	 * this operation.
	 */
	default Consumer4Bigd before4Bigd(Consumer4Bigd before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4Bigd(a, b, c, d); accept4Bigd(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer4Bigd of4Bigd(Consumer4Bigd... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4Bigd consumer : consumers) consumer.accept4Bigd(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4Bigd(BigDecimal, BigDecimal, BigDecimal, BigDecimal)}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d)
	{
		accept4Bigd(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4Bigd then(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4Bigd(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bigd} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4Bigd before(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4Bigd(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer4Bigd of(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4Bigd) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
