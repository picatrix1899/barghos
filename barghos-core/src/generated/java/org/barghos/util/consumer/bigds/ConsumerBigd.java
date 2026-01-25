package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one BigDecimal input argument and returns no
 * result. {@link ConsumerBigd} is expected to operate via side-effects.
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
	
	@Override
	default void accept(BigDecimal a)
	{
		acceptBigd(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigd then(ConsumerBigd after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigd then(Consumer<? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);

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
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBigd andThen(java.util.function.Consumer<? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigd} performing the operation before and this
	 * operation.
	 */
	default ConsumerBigd before(ConsumerBigd before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBigd(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigd} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerBigd before(Consumer<? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigd} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerBigd before(java.util.function.Consumer<? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);

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
	static ConsumerBigd of(ConsumerBigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBigd consumer : consumers) consumer.acceptBigd(a); };
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
	static ConsumerBigd of(Consumer<? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBigd) consumers[0]::accept;

		return (a) -> { for(Consumer<? super BigDecimal> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBigd of(java.util.function.Consumer<? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerBigd)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super BigDecimal> consumer : consumers) consumer.accept(a); };
	}
	
}
