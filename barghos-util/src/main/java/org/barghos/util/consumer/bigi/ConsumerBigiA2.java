package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional {@link BigInteger}
 * array input argument and returns no result. {@link ConsumerBigiA2} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigiA2(BigInteger[][])}
 * 
 * @see ConsumerBigiA2
 * @see ConsumerExBigiA2
 * @see Consumer2BigiA2
 * @see ConsumerEx2BigiA2
 * @see Consumer3BigiA2
 * @see ConsumerEx3BigiA2
 * @see Consumer4BigiA2
 * @see ConsumerEx4BigiA2
 */
@FunctionalInterface
public interface ConsumerBigiA2 extends Consumer<BigInteger[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigiA2(BigInteger[][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigiA2 thenBigiA2(ConsumerBigiA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigiA2(a); after.acceptBigiA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigiA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigiA2 beforeBigiA2(ConsumerBigiA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigiA2(a); acceptBigiA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA2 ofBigiA2(ConsumerBigiA2... consumers)
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
		
		return (a) -> { for(ConsumerBigiA2 consumer : consumers) consumer.acceptBigiA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigiA2(BigInteger[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[][] a)
	{
		acceptBigiA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA2 then(Consumer<BigInteger[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigiA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA2 then(java.util.function.Consumer<? super BigInteger[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigiA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA2 before(Consumer<BigInteger[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigiA2(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA2 before(java.util.function.Consumer<? super BigInteger[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigiA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigiA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA2 of(Consumer<BigInteger[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigiA2) consumers[0]::accept;

		return (a) -> { for(Consumer<BigInteger[][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBigiA2 andThen(java.util.function.Consumer<? super BigInteger[][]> after)
	{
		return then(after);
	}
}
