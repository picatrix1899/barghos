package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link ConsumerBigiA2}
 * this may throw exceptions. {@link ConsumerExBigiA2} is expected to operate
 * via side-effects.
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
public interface ConsumerExBigiA2 extends ConsumerEx<BigInteger[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigiA2(BigInteger[][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigiA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigiA2 thenBigiA2(ConsumerExBigiA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBigiA2(a); after.acceptBigiA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigiA2} performing the operation before
	 * and this operation.
	 */
	default ConsumerExBigiA2 beforeBigiA2(ConsumerExBigiA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBigiA2(a); acceptBigiA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigiA2} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigiA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigiA2 ofBigiA2(ConsumerExBigiA2... consumers)
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
		
		return (a) -> { for(ConsumerExBigiA2 consumer : consumers) consumer.acceptBigiA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBigiA2(BigInteger[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(BigInteger[][] a) throws Exception
	{
		acceptBigiA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigiA2 then(ConsumerEx<BigInteger[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBigiA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigiA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigiA2 before(ConsumerEx<BigInteger[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigiA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBigiA2} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigiA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigiA2 of(ConsumerEx<BigInteger[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigiA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<BigInteger[][]> consumer : consumers) consumer.accept(a); };
	}
}
