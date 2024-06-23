package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

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
	void accept2BigdA2(BigDecimal[][] a, BigDecimal[][] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BigdA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2BigdA2 then2BigdA2(Consumer2BigdA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BigdA2(a, b); after.accept2BigdA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BigdA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2BigdA2 before2BigdA2(Consumer2BigdA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BigdA2(a, b); accept2BigdA2(a, b); };
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
	static Consumer2BigdA2 of2BigdA2(Consumer2BigdA2... consumers)
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
		
		return (a, b) -> { for(Consumer2BigdA2 consumer : consumers) consumer.accept2BigdA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA2 then(Consumer2<BigDecimal[][],BigDecimal[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BigdA2(a, b); after.accept(a, b); };
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
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BigdA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigdA2 before(Consumer2<BigDecimal[][],BigDecimal[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BigdA2(a, b); };
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
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BigdA2(a, b); };
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
	static Consumer2BigdA2 of(Consumer2<BigDecimal[][],BigDecimal[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return (Consumer2BigdA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<BigDecimal[][],BigDecimal[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2BigdA2(BigDecimal[][], BigDecimal[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[][] a, BigDecimal[][] b)
	{
		accept2BigdA2(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2BigdA2 andThen(java.util.function.BiConsumer<? super BigDecimal[][],? super BigDecimal[][]> after)
	{
		return then(after);
	}
}
