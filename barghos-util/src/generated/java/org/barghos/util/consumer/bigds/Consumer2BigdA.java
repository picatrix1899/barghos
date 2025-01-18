package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional BigDecimal array input
 * arguments and returns no result. {@link Consumer2BigdA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigd(BigDecimal[], BigDecimal[])}
 * 
 * @see ConsumerBigdA
 * @see ConsumerExBigdA
 * @see Consumer2BigdA
 * @see ConsumerEx2BigdA
 * @see Consumer3BigdA
 * @see ConsumerEx3BigdA
 * @see Consumer4BigdA
 * @see ConsumerEx4BigdA
 */
@FunctionalInterface
public interface Consumer2BigdA extends Consumer2<BigDecimal[],BigDecimal[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptBigd(BigDecimal[] a, BigDecimal[] b);
	
	@Override
	default void accept(BigDecimal[] a, BigDecimal[] b)
	{
		acceptBigd(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BigdA} performing this operation and the
	 * operation after.
	 */
	default Consumer2BigdA then(Consumer2BigdA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA then(Consumer2<? super BigDecimal[],? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA then(java.util.function.BiConsumer<? super BigDecimal[],? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2BigdA andThen(java.util.function.BiConsumer<? super BigDecimal[],? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operation before and
	 * this operation.
	 */
	default Consumer2BigdA before(Consumer2BigdA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigd(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BigdA before(Consumer2<? super BigDecimal[],? super BigDecimal[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BigdA before(java.util.function.BiConsumer<? super BigDecimal[],? super BigDecimal[]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2BigdA of(Consumer2BigdA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2BigdA consumer : consumers) consumer.acceptBigd(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2BigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2BigdA of(Consumer2<? super BigDecimal[],? super BigDecimal[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BigdA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super BigDecimal[],? super BigDecimal[]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2BigdA of(java.util.function.BiConsumer<? super BigDecimal[],? super BigDecimal[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BigdA)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super BigDecimal[],? super BigDecimal[]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
