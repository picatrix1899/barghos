package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link ConsumerBigiA}
 * this may throw exceptions. {@link ConsumerExBigiA} is expected to operate via
 * side-effects.
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
public interface ConsumerExBigiA extends ConsumerEx<BigInteger[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigiA(BigInteger[] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigiA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigiA thenBigiA(ConsumerExBigiA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigiA(a); after.acceptBigiA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigiA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBigiA beforeBigiA(ConsumerExBigiA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigiA(a); acceptBigiA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigiA ofBigiA(ConsumerExBigiA... consumers)
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
		
		return (a) -> { for(ConsumerExBigiA consumer : consumers) consumer.acceptBigiA(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigiA(BigInteger[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[] a) throws Exception
	{
		acceptBigiA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigiA then(ConsumerEx<BigInteger[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigiA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigiA before(ConsumerEx<BigInteger[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigiA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigiA of(ConsumerEx<BigInteger[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExBigiA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<BigInteger[]> consumer : consumers) consumer.accept(a); };
	}
}
