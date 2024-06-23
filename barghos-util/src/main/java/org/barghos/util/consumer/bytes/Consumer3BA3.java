package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 3-dimensional byte array input
 * arguments and returns no result. {@link Consumer3BA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BA3(byte[][][], byte[][][], byte[][][])}
 * 
 * @see ConsumerBA3
 * @see ConsumerExBA3
 * @see Consumer2BA3
 * @see ConsumerEx2BA3
 * @see Consumer3BA3
 * @see ConsumerEx3BA3
 * @see Consumer4BA3
 * @see ConsumerEx4BA3
 */
@FunctionalInterface
public interface Consumer3BA3 extends Consumer3<byte[][][],byte[][][],byte[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3BA3(byte[][][] a, byte[][][] b, byte[][][] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3BA3 then3BA3(Consumer3BA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BA3(a, b, c); after.accept3BA3(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3BA3 before3BA3(Consumer3BA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BA3(a, b, c); accept3BA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BA3 of3BA3(Consumer3BA3... consumers)
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
		
		return (a, b, c) -> { for(Consumer3BA3 consumer : consumers) consumer.accept3BA3(a, b, c); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept3BA3(byte[][][], byte[][][], byte[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[][][] a, byte[][][] b, byte[][][] c)
	{
		accept3BA3(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BA3 then(Consumer3<byte[][][],byte[][][],byte[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BA3(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BA3 before(Consumer3<byte[][][],byte[][][],byte[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BA3 of(Consumer3<byte[][][],byte[][][],byte[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3BA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<byte[][][],byte[][][],byte[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
