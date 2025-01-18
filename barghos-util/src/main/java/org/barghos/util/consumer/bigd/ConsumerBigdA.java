package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional {@link BigDecimal}
 * array input argument and returns no result. {@link ConsumerBigdA} is expected
 * to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigdA(BigDecimal[])}
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
public interface ConsumerBigdA extends Consumer<BigDecimal[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigd(BigDecimal[] a);
	
	@Override
	default void accept(BigDecimal[] a)
	{
		acceptBigd(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigdA} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigdA then(ConsumerBigdA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA then(Consumer<? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA then(java.util.function.Consumer<? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	@Override
	default ConsumerBigdA andThen(java.util.function.Consumer<? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigdA} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigdA before(ConsumerBigdA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBigd(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigdA before(Consumer<? super BigDecimal[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigdA before(java.util.function.Consumer<? super BigDecimal[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigdA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigdA of(ConsumerBigdA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBigdA consumer : consumers) consumer.acceptBigd(a); };
	}

	/**
	 * Composes a new {@link ConsumerBigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigdA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigdA of(Consumer<? super BigDecimal[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigdA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super BigDecimal[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerBigdA of(java.util.function.Consumer<? super BigDecimal[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigdA)consumers[0]::accept;
		
		return (a) -> { for(java.util.function.Consumer<? super BigDecimal[]> consumer : consumers) consumer.accept(a); };
	}
	
}
