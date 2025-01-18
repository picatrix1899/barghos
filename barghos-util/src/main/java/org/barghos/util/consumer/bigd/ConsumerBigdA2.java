package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional {@link BigDecimal}
 * array input argument and returns no result. {@link ConsumerBigdA2} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigdA2(BigDecimal[][])}
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
public interface ConsumerBigdA2 extends Consumer<BigDecimal[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigd(BigDecimal[][] a);
	
	@Override
	default void accept(BigDecimal[][] a)
	{
		acceptBigd(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigdA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigdA2 then(ConsumerBigdA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA2 then(Consumer<? super BigDecimal[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA2 then(java.util.function.Consumer<? super BigDecimal[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBigdA2 andThen(java.util.function.Consumer<? super BigDecimal[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigdA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigdA2 before(ConsumerBigdA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBigd(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA2 before(Consumer<? super BigDecimal[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA2 before(java.util.function.Consumer<? super BigDecimal[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigdA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigdA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigdA2 of(ConsumerBigdA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBigdA2 consumer : consumers) consumer.acceptBigd(a); };
	}

	/**
	 * Composes a new {@link ConsumerBigdA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigdA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigdA2 of(Consumer<? super BigDecimal[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigdA2) consumers[0]::accept;

		return (a) -> { for(Consumer<? super BigDecimal[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBigdA2 of(java.util.function.Consumer<? super BigDecimal[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigdA2)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super BigDecimal[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
