package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer2Bigd}
 * this may throw exceptions. {@link ConsumerEx2Bigd} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2Bigd(BigDecimal, BigDecimal)}
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
public interface ConsumerEx2Bigd extends ConsumerEx2<BigDecimal,BigDecimal>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2Bigd(BigDecimal a, BigDecimal b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2Bigd then2Bigd(ConsumerEx2Bigd after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2Bigd(a, b); after.accept2Bigd(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2Bigd before2Bigd(ConsumerEx2Bigd before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2Bigd(a, b); accept2Bigd(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2Bigd of2Bigd(ConsumerEx2Bigd... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2Bigd consumer : consumers) consumer.accept2Bigd(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2Bigd(BigDecimal, BigDecimal)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal a, BigDecimal b) throws Exception
	{
		accept2Bigd(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2Bigd then(ConsumerEx2<BigDecimal,BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Bigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2Bigd before(ConsumerEx2<BigDecimal,BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2Bigd(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2Bigd of(ConsumerEx2<BigDecimal,BigDecimal>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2Bigd) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<BigDecimal,BigDecimal> consumer : consumers) consumer.accept(a, b); };
	}
}
