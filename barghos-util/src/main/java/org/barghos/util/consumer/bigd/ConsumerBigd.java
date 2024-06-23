package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one {@link BigDecimal} input argument
 * and returns no result. {@link ConsumerBigd} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigd(BigDecimal)}
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
public interface ConsumerBigd extends Consumer<BigDecimal>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigd(BigDecimal a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigd thenBigd(ConsumerBigd after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.acceptBigd(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigd beforeBigd(ConsumerBigd before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigd(a); acceptBigd(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigd ofBigd(ConsumerBigd... consumers)
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
		
		return (a) -> { for(ConsumerBigd consumer : consumers) consumer.acceptBigd(a); };
	}

	/**
	 * @deprecated Use {@link #acceptBigd(BigDecimal)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal a)
	{
		acceptBigd(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigd then(Consumer<BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigd then(java.util.function.Consumer<? super BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigd} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigd before(Consumer<BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigd} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigd before(java.util.function.Consumer<? super BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigd of(Consumer<BigDecimal>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigd) consumers[0]::accept;

		return (a) -> { for(Consumer<BigDecimal> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBigd andThen(java.util.function.Consumer<? super BigDecimal> after)
	{
		return then(after);
	}
}
