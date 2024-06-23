package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

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
	void acceptBigdA2(BigDecimal[][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigdA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigdA2 thenBigdA2(ConsumerBigdA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigdA2(a); after.acceptBigdA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigdA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigdA2 beforeBigdA2(ConsumerBigdA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigdA2(a); acceptBigdA2(a); };
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
	static ConsumerBigdA2 ofBigdA2(ConsumerBigdA2... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerBigdA2 consumer : consumers) consumer.acceptBigdA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigdA2(BigDecimal[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[][] a)
	{
		acceptBigdA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA2 then(Consumer<BigDecimal[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigdA2(a); after.accept(a); };
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
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigdA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA2 before(Consumer<BigDecimal[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigdA2(a); };
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
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigdA2(a); };
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
	static ConsumerBigdA2 of(Consumer<BigDecimal[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigdA2) consumers[0]::accept;

		return (a) -> { for(Consumer<BigDecimal[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBigdA2 andThen(java.util.function.Consumer<? super BigDecimal[][]> after)
	{
		return then(after);
	}
}
