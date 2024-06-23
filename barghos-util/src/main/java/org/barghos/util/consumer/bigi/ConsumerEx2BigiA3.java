package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 3-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link Consumer2BigiA3}
 * this may throw exceptions. {@link ConsumerEx2BigiA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BigiA3(BigInteger[][][], BigInteger[][][])}.
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
public interface ConsumerEx2BigiA3 extends ConsumerEx2<BigInteger[][][],BigInteger[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2BigiA3(BigInteger[][][] a, BigInteger[][][] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BigiA3 then2BigiA3(ConsumerEx2BigiA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BigiA3(a, b); after.accept2BigiA3(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx2BigiA3 before2BigiA3(ConsumerEx2BigiA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BigiA3(a, b); accept2BigiA3(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BigiA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BigiA3 of2BigiA3(ConsumerEx2BigiA3... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2BigiA3 consumer : consumers) consumer.accept2BigiA3(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2BigiA3(BigInteger[][][], BigInteger[][][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[][][] a, BigInteger[][][] b) throws Exception
	{
		accept2BigiA3(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigiA3 then(ConsumerEx2<BigInteger[][][],BigInteger[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BigiA3(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigiA3 before(ConsumerEx2<BigInteger[][][],BigInteger[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BigiA3(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BigiA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BigiA3 of(ConsumerEx2<BigInteger[][][],BigInteger[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigiA3) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<BigInteger[][][],BigInteger[][][]> consumer : consumers) consumer.accept(a, b); };
	}
}
