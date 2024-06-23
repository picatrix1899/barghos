package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. {@link Consumer2BigiA} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BigiA(BigInteger[], BigInteger[])}
 * 
 * @see ConsumerBigiA
 * @see ConsumerExBigiA
 * @see Consumer2BigiA
 * @see ConsumerEx2BigiA
 * @see Consumer3BigiA
 * @see ConsumerEx3BigiA
 * @see Consumer4BigiA
 * @see ConsumerEx4BigiA
 */
@FunctionalInterface
public interface Consumer2BigiA extends Consumer2<BigInteger[],BigInteger[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2BigiA(BigInteger[] a, BigInteger[] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BigiA} performing this operation and the
	 * operation after.
	 */
	default Consumer2BigiA then2BigiA(Consumer2BigiA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BigiA(a, b); after.accept2BigiA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operation before and
	 * this operation.
	 */
	default Consumer2BigiA before2BigiA(Consumer2BigiA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BigiA(a, b); accept2BigiA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BigiA of2BigiA(Consumer2BigiA... consumers)
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
		
		return (a, b) -> { for(Consumer2BigiA consumer : consumers) consumer.accept2BigiA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigiA then(Consumer2<BigInteger[],BigInteger[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BigiA(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BigiA then(java.util.function.BiConsumer<? super BigInteger[],? super BigInteger[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BigiA(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BigiA before(Consumer2<BigInteger[],BigInteger[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BigiA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BigiA before(java.util.function.BiConsumer<? super BigInteger[],? super BigInteger[]> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2BigiA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BigiA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BigiA of(Consumer2<BigInteger[],BigInteger[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BigiA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<BigInteger[],BigInteger[]> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2BigiA(BigInteger[], BigInteger[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[] a, BigInteger[] b)
	{
		accept2BigiA(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2BigiA andThen(java.util.function.BiConsumer<? super BigInteger[],? super BigInteger[]> after)
	{
		return then(after);
	}
}
