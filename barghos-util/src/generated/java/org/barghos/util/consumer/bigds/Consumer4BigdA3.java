package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 3-dimensional BigDecimal array input
 * arguments and returns no result. {@link Consumer4BigdA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigd(BigDecimal[][][], BigDecimal[][][], BigDecimal[][][], BigDecimal[][][])}
 * 
 * @see ConsumerBigdA3
 * @see ConsumerExBigdA3
 * @see Consumer2BigdA3
 * @see ConsumerEx2BigdA3
 * @see Consumer3BigdA3
 * @see ConsumerEx3BigdA3
 * @see Consumer4BigdA3
 * @see ConsumerEx4BigdA3
 */
@FunctionalInterface
public interface Consumer4BigdA3 extends Consumer4<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptBigd(BigDecimal[][][] a, BigDecimal[][][] b, BigDecimal[][][] c, BigDecimal[][][] d);
	
	@Override
	default void accept(BigDecimal[][][] a, BigDecimal[][][] b, BigDecimal[][][] c, BigDecimal[][][] d)
	{
		acceptBigd(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4BigdA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4BigdA3 then(Consumer4BigdA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigd(a, b, c, d); after.acceptBigd(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigdA3 then(Consumer4<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptBigd(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4BigdA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4BigdA3 before(Consumer4BigdA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBigd(a, b, c, d); acceptBigd(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigdA3 before(Consumer4<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBigd(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BigdA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BigdA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4BigdA3 of(Consumer4BigdA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4BigdA3 consumer : consumers) consumer.acceptBigd(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BigdA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BigdA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4BigdA3 of(Consumer4<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4BigdA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
