package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional byte array input
 * arguments and returns no result. {@link Consumer3BA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BA(byte[], byte[], byte[])}
 * 
 * @see ConsumerBA
 * @see ConsumerExBA
 * @see Consumer2BA
 * @see ConsumerEx2BA
 * @see Consumer3BA
 * @see ConsumerEx3BA
 * @see Consumer4BA
 * @see ConsumerEx4BA
 */
@FunctionalInterface
public interface Consumer3BA extends Consumer3<byte[],byte[],byte[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3BA(byte[] a, byte[] b, byte[] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BA} performing this operation and the
	 * operation after.
	 */
	default Consumer3BA then3BA(Consumer3BA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BA(a, b, c); after.accept3BA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BA} performing the operation before and
	 * this operation.
	 */
	default Consumer3BA before3BA(Consumer3BA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BA(a, b, c); accept3BA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BA of3BA(Consumer3BA... consumers)
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
		
		return (a, b, c) -> { for(Consumer3BA consumer : consumers) consumer.accept3BA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3BA(byte[], byte[], byte[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[] a, byte[] b, byte[] c)
	{
		accept3BA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BA then(Consumer3<byte[],byte[],byte[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3BA before(Consumer3<byte[],byte[],byte[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BA of(Consumer3<byte[],byte[],byte[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3BA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<byte[],byte[],byte[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
