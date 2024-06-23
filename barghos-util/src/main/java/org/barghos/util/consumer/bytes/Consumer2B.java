package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two byte input arguments and returns no
 * result. {@link Consumer2B} is expected to operate via side-effects.
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
public interface Consumer2B extends Consumer2<Byte,Byte>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2B(byte a, byte b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2B} performing this operation and the
	 * operation after.
	 */
	default Consumer2B then2B(Consumer2B after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2B(a, b); after.accept2B(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2B} performing the operation before and
	 * this operation.
	 */
	default Consumer2B before2B(Consumer2B before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2B(a, b); accept2B(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2B} performing the operations.
	 */
	@SafeVarargs
	static Consumer2B of2B(Consumer2B... consumers)
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
		
		return (a, b) -> { for(Consumer2B consumer : consumers) consumer.accept2B(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2B} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2B then(Consumer2<Byte,Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2B(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2B} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2B then(java.util.function.BiConsumer<? super Byte,? super Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2B(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2B} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2B before(Consumer2<Byte,Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2B(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2B} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2B before(java.util.function.BiConsumer<? super Byte,? super Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2B(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2B} performing the operations.
	 */
	@SafeVarargs
	static Consumer2B of(Consumer2<Byte,Byte>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2B) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<Byte,Byte> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2B(byte, byte)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Byte a, Byte b)
	{
		accept2B(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2B andThen(java.util.function.BiConsumer<? super Byte,? super Byte> after)
	{
		return then(after);
	}
}
