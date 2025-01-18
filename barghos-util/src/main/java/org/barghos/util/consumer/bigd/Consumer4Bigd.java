package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

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
	void acceptBigd(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d);
	
	@Override
	default void accept(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d)
	{
		acceptBigd(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4Bigd} performing this operation and the
	 * operation after.
	 */
	default Consumer4Bigd then(Consumer4Bigd after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigd(a, b, c, d); after.acceptBigd(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4Bigd then(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigd(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4Bigd} performing the operation before and
	 * this operation.
	 */
	default Consumer4Bigd before(Consumer4Bigd before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBigd(a, b, c, d); acceptBigd(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bigd} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4Bigd before(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBigd(a, b, c, d); };
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
	static Consumer4Bigd of(Consumer4Bigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4Bigd consumer : consumers) consumer.acceptBigd(a, b, c, d); };
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
	static Consumer4Bigd of(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4Bigd) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
