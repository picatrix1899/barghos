package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 2-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link Consumer2BigiA2}
 * this may throw exceptions. {@link ConsumerEx2BigiA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BigiA2(BigInteger[][], BigInteger[][])}
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
public interface ConsumerEx2BigiA2 extends ConsumerEx2<BigInteger[][],BigInteger[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2BigiA2(BigInteger[][] a, BigInteger[][] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigiA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BigiA2 then2BigiA2(ConsumerEx2BigiA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BigiA2(a, b); after.accept2BigiA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigiA2} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx2BigiA2 before2BigiA2(ConsumerEx2BigiA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BigiA2(a, b); accept2BigiA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BigiA2} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BigiA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BigiA2 of2BigiA2(ConsumerEx2BigiA2... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2BigiA2 consumer : consumers) consumer.accept2BigiA2(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2BigiA2(BigInteger[][], BigInteger[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[][] a, BigInteger[][] b) throws Exception
	{
		accept2BigiA2(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigiA2 then(ConsumerEx2<BigInteger[][],BigInteger[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BigiA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigiA2 before(ConsumerEx2<BigInteger[][],BigInteger[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BigiA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BigiA2} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BigiA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BigiA2 of(ConsumerEx2<BigInteger[][],BigInteger[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigiA2) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<BigInteger[][],BigInteger[][]> consumer : consumers) consumer.accept(a, b); };
	}
}
