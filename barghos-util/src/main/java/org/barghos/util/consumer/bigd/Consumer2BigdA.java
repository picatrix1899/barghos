package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. {@link Consumer2BigdA} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BigdA(BigDecimal[], BigDecimal[])}
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
	void accept2BigdA(BigDecimal[] a, BigDecimal[] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BigdA} performing this operation and the
	 * operation after.
	 */
	default Consumer2BigdA then2BigdA(Consumer2BigdA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BigdA(a, b); after.accept2BigdA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operation before and
	 * this operation.
	 */
	default Consumer2BigdA before2BigdA(Consumer2BigdA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BigdA(a, b); accept2BigdA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BigdA of2BigdA(Consumer2BigdA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2BigdA consumer : consumers) consumer.accept2BigdA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA then(Consumer2<BigDecimal[],BigDecimal[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BigdA(a, b); after.accept(a, b); };
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
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BigdA(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BigdA before(Consumer2<BigDecimal[],BigDecimal[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BigdA(a, b); };
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
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2BigdA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigdA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BigdA of(Consumer2<BigDecimal[],BigDecimal[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BigdA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<BigDecimal[],BigDecimal[]> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2BigdA(BigDecimal[], BigDecimal[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[] a, BigDecimal[] b)
	{
		accept2BigdA(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2BigdA andThen(java.util.function.BiConsumer<? super BigDecimal[],? super BigDecimal[]> after)
	{
		return then(after);
	}
}
