package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional {@link BigInteger}
 * array input argument and returns no result. {@link ConsumerBigiA} is expected
 * to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigiA(BigInteger[])}
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
public interface ConsumerBigiA extends Consumer<BigInteger[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigiA(BigInteger[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigiA} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigiA thenBigiA(ConsumerBigiA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigiA(a); after.acceptBigiA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigiA} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigiA beforeBigiA(ConsumerBigiA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigiA(a); acceptBigiA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA ofBigiA(ConsumerBigiA... consumers)
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
		
		return (a) -> { for(ConsumerBigiA consumer : consumers) consumer.acceptBigiA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptBigiA(BigInteger[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[] a)
	{
		acceptBigiA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA then(Consumer<BigInteger[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigiA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA then(java.util.function.Consumer<? super BigInteger[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigiA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigiA before(Consumer<BigInteger[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigiA(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerBigiA before(java.util.function.Consumer<? super BigInteger[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigiA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA of(Consumer<BigInteger[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigiA) consumers[0]::accept;

		return (a) -> { for(Consumer<BigInteger[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBigiA andThen(java.util.function.Consumer<? super BigInteger[]> after)
	{
		return then(after);
	}
}
