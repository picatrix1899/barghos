package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 2-dimensional float array input
 * arguments and returns no result. Unlike {@link ConsumerFA2} this may throw
 * exceptions. {@link ConsumerExFA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptFA2(float[][])}
 * 
 * @see ConsumerFA2
 * @see ConsumerExFA2
 * @see Consumer2FA2
 * @see ConsumerEx2FA2
 * @see Consumer3FA2
 * @see ConsumerEx3FA2
 * @see Consumer4FA2
 * @see ConsumerEx4FA2
 */
@FunctionalInterface
public interface ConsumerExFA2 extends ConsumerEx<float[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptFA2(float[][] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExFA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExFA2 thenFA2(ConsumerExFA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptFA2(a); after.acceptFA2(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExFA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerExFA2 beforeFA2(ConsumerExFA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptFA2(a); acceptFA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExFA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExFA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExFA2 ofFA2(ConsumerExFA2... consumers)
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
		
		return (a) -> { for(ConsumerExFA2 consumer : consumers) consumer.acceptFA2(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptFA2(float[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(float[][] a) throws Exception
	{
		acceptFA2(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExFA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExFA2 then(ConsumerEx<float[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptFA2(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExFA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExFA2 before(ConsumerEx<float[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptFA2(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExFA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExFA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExFA2 of(ConsumerEx<float[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExFA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<float[][]> consumer : consumers) consumer.accept(a); };
	}
}
