package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two BigDecimal input arguments and returns
 * no result. {@link Consumer2Bigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigd(BigDecimal, BigDecimal)}
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
	void acceptBigd(BigDecimal a, BigDecimal b);
	
	@Override
	default void accept(BigDecimal a, BigDecimal b)
	{
		acceptBigd(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2Bigd} performing this operation and the
	 * operation after.
	 */
	default Consumer2Bigd then(Consumer2Bigd after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2Bigd then(Consumer2<? super BigDecimal,? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
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
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2Bigd andThen(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operation before and
	 * this operation.
	 */
	default Consumer2Bigd before(Consumer2Bigd before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigd(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2Bigd before(Consumer2<? super BigDecimal,? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
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
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
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
	static Consumer2Bigd of(Consumer2Bigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2Bigd consumer : consumers) consumer.acceptBigd(a, b); };
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
	static Consumer2Bigd of(Consumer2<? super BigDecimal,? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2Bigd) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super BigDecimal,? super BigDecimal> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2Bigd of(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (Consumer2Bigd)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> consumer : consumers) consumer.accept(a, b); };
	}
	
}
