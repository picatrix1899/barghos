package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link ConsumerBigd} this
 * may throw exceptions. {@link ConsumerExBigd} is expected to operate via
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
public interface ConsumerExBigd extends ConsumerEx<BigDecimal>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigd(BigDecimal a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigd thenBigd(ConsumerExBigd after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.acceptBigd(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBigd beforeBigd(ConsumerExBigd before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigd(a); acceptBigd(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigd ofBigd(ConsumerExBigd... consumers)
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
		
		return (a) -> { for(ConsumerExBigd consumer : consumers) consumer.acceptBigd(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigd(BigDecimal)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal a) throws Exception
	{
		acceptBigd(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigd then(ConsumerEx<BigDecimal> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigd before(ConsumerEx<BigDecimal> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigd of(ConsumerEx<BigDecimal>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigd) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<BigDecimal> consumer : consumers) consumer.accept(a); };
	}
}
