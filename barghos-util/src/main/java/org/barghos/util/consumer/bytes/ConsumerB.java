package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one byte input argument and returns no
 * result. {@link ConsumerB} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptB(byte)}
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
public interface ConsumerB extends Consumer<Byte>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptB(byte a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerB} performing this operation and the
	 * operation after.
	 */
	default ConsumerB thenB(ConsumerB after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptB(a); after.acceptB(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerB} performing the operation before and this
	 * operation.
	 */
	default ConsumerB beforeB(ConsumerB before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptB(a); acceptB(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerB} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerB} performing the operations.
	 */
	@SafeVarargs
	static ConsumerB ofB(ConsumerB... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerB consumer : consumers) consumer.acceptB(a); };
	}

	/**
	 * @deprecated Use {@link #acceptF(byte)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Byte a)
	{
		acceptB(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerB} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerB then(Consumer<Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptB(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerB} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerB then(java.util.function.Consumer<? super Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptB(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerB} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerB before(Consumer<Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptB(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerB} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerB before(java.util.function.Consumer<? super Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptB(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerB} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerB} performing the operations.
	 */
	@SafeVarargs
	static ConsumerB of(Consumer<Byte>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerB) consumers[0]::accept;

		return (a) -> { for(Consumer<Byte> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerB andThen(java.util.function.Consumer<? super Byte> after)
	{
		return then(after);
	}
}
