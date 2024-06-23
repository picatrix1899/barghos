package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 3-dimensional {@link BigDecimal}
 * array input arguments and returns no result. {@link Consumer4BigdA3} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4BigdA3(BigDecimal[][][], BigDecimal[][][], BigDecimal[][][], BigDecimal[][][])}
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
	void accept4BigdA3(BigDecimal[][][] a, BigDecimal[][][] b, BigDecimal[][][] c, BigDecimal[][][] d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4BigdA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4BigdA3 then4BigdA3(Consumer4BigdA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BigdA3(a, b, c, d); after.accept4BigdA3(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4BigdA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4BigdA3 before4BigdA3(Consumer4BigdA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BigdA3(a, b, c, d); accept4BigdA3(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BigdA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BigdA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4BigdA3 of4BigdA3(Consumer4BigdA3... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4BigdA3 consumer : consumers) consumer.accept4BigdA3(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4BigdA3(BigDecimal[][][], BigDecimal[][][], BigDecimal[][][], BigDecimal[][][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[][][] a, BigDecimal[][][] b, BigDecimal[][][] c, BigDecimal[][][] d)
	{
		accept4BigdA3(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigdA3 then(Consumer4<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4BigdA3(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BigdA3 before(Consumer4<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BigdA3(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BigdA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BigdA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4BigdA3 of(Consumer4<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4BigdA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
