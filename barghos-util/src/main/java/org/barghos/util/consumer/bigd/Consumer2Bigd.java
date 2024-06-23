package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two {@link BigDecimal} input arguments
 * and returns no result. {@link Consumer2Bigd} is expected to operate via
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
public interface Consumer2Bigd extends Consumer2<BigDecimal,BigDecimal>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2Bigd(BigDecimal a, BigDecimal b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2Bigd} performing this operation and the
	 * operation after.
	 */
	default Consumer2Bigd then2Bigd(Consumer2Bigd after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2Bigd(a, b); after.accept2Bigd(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operation before and
	 * this operation.
	 */
	default Consumer2Bigd before2Bigd(Consumer2Bigd before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2Bigd(a, b); accept2Bigd(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bigd of2Bigd(Consumer2Bigd... consumers)
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
		
		return (a, b) -> { for(Consumer2Bigd consumer : consumers) consumer.accept2Bigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bigd then(Consumer2<BigDecimal,BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Bigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bigd then(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2Bigd(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bigd before(Consumer2<BigDecimal,BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2Bigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bigd before(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2Bigd(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer2Bigd of(Consumer2<BigDecimal,BigDecimal>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2Bigd) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<BigDecimal,BigDecimal> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2Bigd(BigDecimal, BigDecimal)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal a, BigDecimal b)
	{
		accept2Bigd(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2Bigd andThen(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> after)
	{
		return then(after);
	}
}
