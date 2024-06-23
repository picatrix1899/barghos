package org.barghos.util.consumer.floats;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional float array input
 * arguments and returns no result. Unlike {@link ConsumerF} this may throw
 * exceptions. {@link ConsumerExF} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptF(float)}
 * 
 * @see ConsumerF
 * @see ConsumerExF
 * @see Consumer2F
 * @see ConsumerEx2F
 * @see Consumer3F
 * @see ConsumerEx3F
 * @see Consumer4F
 * @see ConsumerEx4F
 */
@FunctionalInterface
public interface ConsumerExF extends ConsumerEx<Float>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptF(float a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExF} performing this operation and the
	 * operation after.
	 */
	default ConsumerExF thenF(ConsumerExF after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptF(a); after.acceptF(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExF} performing the operation before and
	 * this operation.
	 */
	default ConsumerExF beforeF(ConsumerExF before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptF(a); acceptF(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExF} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExF} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExF ofF(ConsumerExF... consumers)
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
		
		return (a) -> { for(ConsumerExF consumer : consumers) consumer.acceptF(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptF(Float)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Float a) throws Exception
	{
		acceptF(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExF} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExF then(ConsumerEx<Float> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptF(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExF} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExF before(ConsumerEx<Float> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptF(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExF} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExF} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExF of(ConsumerEx<Float>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExF) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Float> consumer : consumers) consumer.accept(a); };
	}
}
