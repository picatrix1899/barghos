package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 3-dimensional {@link BigInteger}
 * array input argument and returns no result. {@link ConsumerBigiA3} is
 * expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigiA3(BigInteger[][][])}
 * 
 * @see ConsumerBigiA3
 * @see ConsumerExBigiA3
 * @see Consumer2BigiA3
 * @see ConsumerEx2BigiA3
 * @see Consumer3BigiA3
 * @see ConsumerEx3BigiA3
 * @see Consumer4BigiA3
 * @see ConsumerEx4BigiA3
 */
@FunctionalInterface
public interface ConsumerBigiA3 extends Consumer<BigInteger[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBigiA3(BigInteger[][][] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerBigiA3 thenBigiA3(ConsumerBigiA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigiA3(a); after.acceptBigiA3(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBigiA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerBigiA3 beforeBigiA3(ConsumerBigiA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigiA3(a); acceptBigiA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigiA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA3 ofBigiA3(ConsumerBigiA3... consumers)
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
		
		return (a) -> { for(ConsumerBigiA3 consumer : consumers) consumer.acceptBigiA3(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigiA3(BigInteger[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[][][] a)
	{
		acceptBigiA3(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA3 then(Consumer<BigInteger[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigiA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA3 then(java.util.function.Consumer<? super BigInteger[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigiA3(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA3 before(Consumer<BigInteger[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigiA3(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBigiA3 before(java.util.function.Consumer<? super BigInteger[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigiA3(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBigiA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBigiA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBigiA3 of(Consumer<BigInteger[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBigiA3) consumers[0]::accept;

		return (a) -> { for(Consumer<BigInteger[][][]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBigiA3 andThen(java.util.function.Consumer<? super BigInteger[][][]> after)
	{
		return then(after);
	}
}
