package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four byte input arguments and returns
 * no result. {@link Consumer4B} is expected to operate via side-effects.
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
public interface Consumer4B extends Consumer4<Byte,Byte,Byte,Byte>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4B(byte a, byte b, byte c, byte d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4B} performing this operation and the
	 * operation after.
	 */
	default Consumer4B then4B(Consumer4B after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4B(a, b, c, d); after.accept4B(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4B} performing the operation before and this
	 * operation.
	 */
	default Consumer4B before4B(Consumer4B before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4B(a, b, c, d); accept4B(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4B} performing the operations.
	 */
	@SafeVarargs
	static Consumer4B of4B(Consumer4B... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4B consumer : consumers) consumer.accept4B(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4B(byte, byte, byte, byte)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Byte a, Byte b, Byte c, Byte d)
	{
		accept4B(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4B} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4B then(Consumer4<Byte,Byte,Byte,Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4B(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4B} performing the operation before and this
	 * operation.
	 */
	@Override
	default Consumer4B before(Consumer4<Byte,Byte,Byte,Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4B(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4B} performing the operations.
	 */
	@SafeVarargs
	static Consumer4B of(Consumer4<Byte,Byte,Byte,Byte>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4B) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<Byte,Byte,Byte,Byte> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
