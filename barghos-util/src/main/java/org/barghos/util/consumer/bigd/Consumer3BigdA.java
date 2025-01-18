package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. {@link Consumer3BigdA} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BigdA(BigDecimal[], BigDecimal[], BigDecimal[])}
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
public interface Consumer3BigdA extends Consumer3<BigDecimal[],BigDecimal[],BigDecimal[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptBigd(BigDecimal[] a, BigDecimal[] b, BigDecimal[] c);
	
	@Override
	default void accept(BigDecimal[] a, BigDecimal[] b, BigDecimal[] c)
	{
		acceptBigd(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BigdA} performing this operation and the
	 * operation after.
	 */
	default Consumer3BigdA then(Consumer3BigdA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigd(a, b, c); after.acceptBigd(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigdA then(Consumer3<? super BigDecimal[],? super BigDecimal[],? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBigd(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BigdA} performing the operation before and
	 * this operation.
	 */
	default Consumer3BigdA before(Consumer3BigdA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBigd(a, b, c); acceptBigd(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigdA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3BigdA before(Consumer3<? super BigDecimal[],? super BigDecimal[],? super BigDecimal[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBigd(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigdA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BigdA of(Consumer3BigdA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BigdA consumer : consumers) consumer.acceptBigd(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3BigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BigdA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BigdA of(Consumer3<? super BigDecimal[],? super BigDecimal[],? super BigDecimal[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3BigdA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super BigDecimal[],? super BigDecimal[],? super BigDecimal[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
