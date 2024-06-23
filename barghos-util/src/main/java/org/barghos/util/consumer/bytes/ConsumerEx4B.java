package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer4B} this may throw
 * exceptions. {@link ConsumerEx4B} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4B(byte, byte, byte, byte)}
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
public interface ConsumerEx4B extends ConsumerEx4<Byte,Byte,Byte,Byte>
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
	void accept4B(byte a, byte b, byte c, byte d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4B} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4B then4B(ConsumerEx4B after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4B(a, b, c, d); after.accept4B(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4B} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4B before4B(ConsumerEx4B before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4B(a, b, c, d); accept4B(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4B} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4B of4B(ConsumerEx4B... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4B consumer : consumers) consumer.accept4B(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4B(byte, byte, byte, byte)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Byte a, Byte b, Byte c, Byte d) throws Exception
	{
		accept4B(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4B} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4B then(ConsumerEx4<Byte,Byte,Byte,Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4B(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4B} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4B before(ConsumerEx4<Byte,Byte,Byte,Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4B(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4B} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4B of(ConsumerEx4<Byte,Byte,Byte,Byte>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4B) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<Byte,Byte,Byte,Byte> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
