package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link Consumer4BigiA}
 * this may throw exceptions. {@link ConsumerEx4BigiA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4BigiA(BigInteger[], BigInteger[], BigInteger[], BigInteger[])}
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
public interface ConsumerEx4BigiA extends ConsumerEx4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept4BigiA(BigInteger[] a, BigInteger[] b, BigInteger[] c, BigInteger[] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4BigiA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4BigiA then4BigiA(ConsumerEx4BigiA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BigiA(a, b, c, d); after.accept4BigiA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4BigiA} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx4BigiA before4BigiA(ConsumerEx4BigiA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BigiA(a, b, c, d); accept4BigiA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BigiA} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BigiA of4BigiA(ConsumerEx4BigiA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4BigiA consumer : consumers) consumer.accept4BigiA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4BigiA(BigInteger[], BigInteger[], BigInteger[], BigInteger[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[] a, BigInteger[] b, BigInteger[] c, BigInteger[] d) throws Exception
	{
		accept4BigiA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BigiA then(ConsumerEx4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4BigiA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BigiA before(ConsumerEx4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BigiA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BigiA} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BigiA of(ConsumerEx4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4BigiA) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<BigInteger[],BigInteger[],BigInteger[],BigInteger[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}