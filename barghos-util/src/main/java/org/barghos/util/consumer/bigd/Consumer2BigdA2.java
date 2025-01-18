package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 2-dimensional {@link BigDecimal}
 * array input arguments and returns no result. {@link Consumer2BigdA2} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BigdA2(BigDecimal[][], BigDecimal[][])}
 * 
 * @see ConsumerBigdA2
 * @see ConsumerExBigdA2
 * @see Consumer2BigdA2
 * @see ConsumerEx2BigdA2
 * @see Consumer3BigdA2
 * @see ConsumerEx3BigdA2
 * @see Consumer4BigdA2
 * @see ConsumerEx4BigdA2
 */
@FunctionalInterface
public interface Consumer2BigdA2 extends Consumer2<BigDecimal[][],BigDecimal[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptBigd(BigDecimal[][] a, BigDecimal[][] b);
	
	@Override
	default void accept(BigDecimal[][] a, BigDecimal[][] b)
	{
		acceptBigd(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BigdA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2BigdA2 then(Consumer2BigdA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA2 then(Consumer2<? super BigDecimal[][],? super BigDecimal[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA2 then(java.util.function.BiConsumer<? super BigDecimal[][],? super BigDecimal[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2BigdA2 andThen(java.util.function.BiConsumer<? super BigDecimal[][],? super BigDecimal[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BigdA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2BigdA2 before(Consumer2BigdA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigd(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA2 before(Consumer2<? super BigDecimal[][],? super BigDecimal[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA2 before(java.util.function.BiConsumer<? super BigDecimal[][],? super BigDecimal[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigdA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigdA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BigdA2 of(Consumer2BigdA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2BigdA2 consumer : consumers) consumer.acceptBigd(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigdA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigdA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BigdA2 of(Consumer2<? super BigDecimal[][],? super BigDecimal[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return (Consumer2BigdA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super BigDecimal[][],? super BigDecimal[][]> consumer : consumers) consumer.accept(a, b); };
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
	static Consumer2BigdA2 of(java.util.function.BiConsumer<? super BigDecimal[][],? super BigDecimal[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BigdA2)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super BigDecimal[][],? super BigDecimal[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
