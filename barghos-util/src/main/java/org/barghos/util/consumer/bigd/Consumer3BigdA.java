package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

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
	void accept3BigdA(BigDecimal[] a, BigDecimal[] b, BigDecimal[] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BigdA} performing this operation and the
	 * operation after.
	 */
	default Consumer3BigdA then3BigdA(Consumer3BigdA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BigdA(a, b, c); after.accept3BigdA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BigdA} performing the operation before and
	 * this operation.
	 */
	default Consumer3BigdA before3BigdA(Consumer3BigdA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BigdA(a, b, c); accept3BigdA(a, b, c); };
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
	static Consumer3BigdA of3BigdA(Consumer3BigdA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3BigdA consumer : consumers) consumer.accept3BigdA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3BigdA(BigDecimal[], BigDecimal[], BigDecimal[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[] a, BigDecimal[] b, BigDecimal[] c)
	{
		accept3BigdA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BigdA then(Consumer3<BigDecimal[],BigDecimal[],BigDecimal[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BigdA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BigdA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3BigdA before(Consumer3<BigDecimal[],BigDecimal[],BigDecimal[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BigdA(a, b, c); };
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
	static Consumer3BigdA of(Consumer3<BigDecimal[],BigDecimal[],BigDecimal[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3BigdA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<BigDecimal[],BigDecimal[],BigDecimal[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
