package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three byte input arguments and returns
 * no result. {@link Consumer3B} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3B(byte, byte, byte)}
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
public interface Consumer3B extends Consumer3<Byte,Byte,Byte>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3B(byte a, byte b, byte c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3B} performing this operation and the
	 * operation after.
	 */
	default Consumer3B then3B(Consumer3B after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3B(a, b, c); after.accept3B(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3B} performing the operation before and this
	 * operation.
	 */
	default Consumer3B before3B(Consumer3B before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3B(a, b, c); accept3B(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3B} performing the operations.
	 */
	@SafeVarargs
	static Consumer3B of3B(Consumer3B... consumers)
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
		
		return (a, b, c) -> { for(Consumer3B consumer : consumers) consumer.accept3B(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3B(byte, byte, byte)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Byte a, Byte b, Byte c)
	{
		accept3B(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3B} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3B then(Consumer3<Byte,Byte,Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3B(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3B} performing the operation before and this
	 * operation.
	 */
	@Override
	default Consumer3B before(Consumer3<Byte,Byte,Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3B(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3B} performing the operations.
	 */
	@SafeVarargs
	static Consumer3B of(Consumer3<Byte,Byte,Byte>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3B) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<Byte,Byte,Byte> consumer : consumers) consumer.accept(a, b, c); };
	}
}
