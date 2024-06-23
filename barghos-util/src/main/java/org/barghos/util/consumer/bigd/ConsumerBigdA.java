package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

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
	void acceptBigdA(BigDecimal[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigdA} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigdA thenBigdA(ConsumerBigdA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigdA(a); after.acceptBigdA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigdA} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigdA beforeBigdA(ConsumerBigdA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigdA(a); acceptBigdA(a); };
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
	static ConsumerBigdA ofBigdA(ConsumerBigdA... consumers)
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
		
		return (a) -> { for(ConsumerBigdA consumer : consumers) consumer.acceptBigdA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptBigdA(BigDecimal[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigDecimal[] a)
	{
		acceptBigdA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigdA then(Consumer<BigDecimal[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigdA(a); after.accept(a); };
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
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigdA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigdA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigdA before(Consumer<BigDecimal[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigdA(a); };
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
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigdA(a); };
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
	static ConsumerBigdA of(Consumer<BigDecimal[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigdA) consumers[0]::accept;

		return (a) -> { for(Consumer<BigDecimal[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBigdA andThen(java.util.function.Consumer<? super BigDecimal[]> after)
	{
		return then(after);
	}
}
