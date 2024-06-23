package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer4Bigd}
 * this may throw exceptions. {@link ConsumerEx4Bigd} is expected to operate via
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
public interface ConsumerEx4Bigd extends ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>
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
	void accept4Bigd(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4Bigd then4Bigd(ConsumerEx4Bigd after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4Bigd(a, b, c, d); after.accept4Bigd(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4Bigd before4Bigd(ConsumerEx4Bigd before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4Bigd(a, b, c, d); accept4Bigd(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4Bigd of4Bigd(ConsumerEx4Bigd... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4Bigd consumer : consumers) consumer.accept4Bigd(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4Bigd(BigDecimal, BigDecimal, BigDecimal, BigDecimal)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d) throws Exception
	{
		accept4Bigd(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Bigd then(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4Bigd(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Bigd before(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4Bigd(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4Bigd of(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4Bigd) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
