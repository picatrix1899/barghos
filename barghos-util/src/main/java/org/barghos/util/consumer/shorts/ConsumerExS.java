package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional short array input
 * arguments and returns no result. Unlike {@link ConsumerS} this may throw
 * exceptions. {@link ConsumerExS} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short)}
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface ConsumerExS extends ConsumerEx<Short>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptS(short a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExS} performing this operation and the
	 * operation after.
	 */
	default ConsumerExS thenS(ConsumerExS after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptS(a); after.acceptS(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExS} performing the operation before and
	 * this operation.
	 */
	default ConsumerExS beforeS(ConsumerExS before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptS(a); acceptS(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExS} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExS} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExS ofS(ConsumerExS... consumers)
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
		
		return (a) -> { for(ConsumerExS consumer : consumers) consumer.acceptS(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptF(Short)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Short a) throws Exception
	{
		acceptS(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExS} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExS then(ConsumerEx<Short> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExS} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExS before(ConsumerEx<Short> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExS} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExS} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExS of(ConsumerEx<Short>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExS) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Short> consumer : consumers) consumer.accept(a); };
	}
}
