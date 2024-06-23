package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link Consumer3BigiA}
 * this may throw exceptions. {@link ConsumerEx3BigiA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BigiA(BigInteger[], BigInteger[], BigInteger[])}
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
public interface ConsumerEx3BigiA extends ConsumerEx3<BigInteger[],BigInteger[],BigInteger[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept3BigiA(BigInteger[] a, BigInteger[] b, BigInteger[] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BigiA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BigiA then3BigiA(ConsumerEx3BigiA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BigiA(a, b, c); after.accept3BigiA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BigiA} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx3BigiA before3BigiA(ConsumerEx3BigiA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BigiA(a, b, c); accept3BigiA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BigiA} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BigiA of3BigiA(ConsumerEx3BigiA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3BigiA consumer : consumers) consumer.accept3BigiA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3BigiA(BigInteger[], BigInteger[], BigInteger[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[] a, BigInteger[] b, BigInteger[] c) throws Exception
	{
		accept3BigiA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BigiA then(ConsumerEx3<BigInteger[],BigInteger[],BigInteger[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BigiA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BigiA before(ConsumerEx3<BigInteger[],BigInteger[],BigInteger[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BigiA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BigiA} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BigiA of(ConsumerEx3<BigInteger[],BigInteger[],BigInteger[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BigiA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<BigInteger[],BigInteger[],BigInteger[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
