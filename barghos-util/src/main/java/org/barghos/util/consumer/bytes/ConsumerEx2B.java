package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer2B} this may throw
 * exceptions. {@link ConsumerEx2B} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2B(byte, byte)}
 * 
 * @see ConsumerB
 * @see ConsumerExB
 * @see Consumer2B
 * @see ConsumerEx2B
 * @see Consumer3B
 * @see ConsumerEx3B
 * @see Consumer4B
 * @see ConsumerEx4B
 */
@FunctionalInterface
public interface ConsumerEx2B extends ConsumerEx2<Byte,Byte>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2B(byte a, byte b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2B} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2B then2B(ConsumerEx2B after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2B(a, b); after.accept2B(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2B} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2B before2B(ConsumerEx2B before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2B(a, b); accept2B(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2B} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2B of2B(ConsumerEx2B... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2B consumer : consumers) consumer.accept2B(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2B(byte, byte)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Byte a, Byte b) throws Exception
	{
		accept2B(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2B} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2B then(ConsumerEx2<Byte,Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2B(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2B} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2B before(ConsumerEx2<Byte,Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2B(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2B} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2B of(ConsumerEx2<Byte,Byte>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2B) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<Byte,Byte> consumer : consumers) consumer.accept(a, b); };
	}
}
