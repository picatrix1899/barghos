package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 2-dimensional byte array input
 * arguments and returns no result. {@link Consumer2BA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BA2(byte[][], byte[][])}
 * 
 * @see ConsumerBA2
 * @see ConsumerExBA2
 * @see Consumer2BA2
 * @see ConsumerEx2BA2
 * @see Consumer3BA2
 * @see ConsumerEx3BA2
 * @see Consumer4BA2
 * @see ConsumerEx4BA2
 */
@FunctionalInterface
public interface Consumer2BA2 extends Consumer2<byte[][],byte[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2BA2(byte[][] a, byte[][] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2BA2 then2BA2(Consumer2BA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BA2(a, b); after.accept2BA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2BA2 before2BA2(Consumer2BA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BA2(a, b); accept2BA2(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BA2 of2BA2(Consumer2BA2... consumers)
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
		
		return (a, b) -> { for(Consumer2BA2 consumer : consumers) consumer.accept2BA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BA2 then(Consumer2<byte[][],byte[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BA2 then(java.util.function.BiConsumer<? super byte[][],? super byte[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BA2 before(Consumer2<byte[][],byte[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BA2 before(java.util.function.BiConsumer<? super byte[][],? super byte[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BA2(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BA2 of(Consumer2<byte[][],byte[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return (Consumer2BA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<byte[][],byte[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2BA2(byte[][], byte[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[][] a, byte[][] b)
	{
		accept2BA2(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2BA2 andThen(java.util.function.BiConsumer<? super byte[][],? super byte[][]> after)
	{
		return then(after);
	}
}
