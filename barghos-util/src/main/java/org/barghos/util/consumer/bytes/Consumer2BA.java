package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional byte array input
 * arguments and returns no result. {@link Consumer2BA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BA(byte[], byte[])}
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
public interface Consumer2BA extends Consumer2<byte[],byte[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2BA(byte[] a, byte[] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BA} performing this operation and the
	 * operation after.
	 */
	default Consumer2BA then2BA(Consumer2BA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BA(a, b); after.accept2BA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BA} performing the operation before and
	 * this operation.
	 */
	default Consumer2BA before2BA(Consumer2BA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BA(a, b); accept2BA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BA of2BA(Consumer2BA... consumers)
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
		
		return (a, b) -> { for(Consumer2BA consumer : consumers) consumer.accept2BA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BA then(Consumer2<byte[],byte[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BA(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BA then(java.util.function.BiConsumer<? super byte[],? super byte[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BA(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BA before(Consumer2<byte[],byte[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2BA before(java.util.function.BiConsumer<? super byte[],? super byte[]> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2BA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BA of(Consumer2<byte[],byte[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2BA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<byte[],byte[]> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2BA(byte[], byte[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[] a, byte[] b)
	{
		accept2BA(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2BA andThen(java.util.function.BiConsumer<? super byte[],? super byte[]> after)
	{
		return then(after);
	}
}
