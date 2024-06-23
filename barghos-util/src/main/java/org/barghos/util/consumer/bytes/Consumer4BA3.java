package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 3-dimensional byte array input
 * arguments and returns no result. {@link Consumer4BA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4BA3(byte[][][], byte[][][], byte[][][], byte[][][])}
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
public interface Consumer4BA3 extends Consumer4<byte[][][],byte[][][],byte[][][],byte[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4BA3(byte[][][] a, byte[][][] b, byte[][][] c, byte[][][] d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4BA3} performing this operation and the
	 * operation after.
	 */
	default Consumer4BA3 then4BA3(Consumer4BA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BA3(a, b, c, d); after.accept4BA3(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4BA3} performing the operation before and
	 * this operation.
	 */
	default Consumer4BA3 before4BA3(Consumer4BA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BA3(a, b, c, d); accept4BA3(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4BA3 of4BA3(Consumer4BA3... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4BA3 consumer : consumers) consumer.accept4BA3(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4BA3(byte[][][], byte[][][], byte[][][], byte[][][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[][][] a, byte[][][] b, byte[][][] c, byte[][][] d)
	{
		accept4BA3(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BA3 then(Consumer4<byte[][][],byte[][][],byte[][][],byte[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4BA3(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4BA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4BA3 before(Consumer4<byte[][][],byte[][][],byte[][][],byte[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BA3(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4BA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4BA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer4BA3 of(Consumer4<byte[][][],byte[][][],byte[][][],byte[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4BA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<byte[][][],byte[][][],byte[][][],byte[][][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
