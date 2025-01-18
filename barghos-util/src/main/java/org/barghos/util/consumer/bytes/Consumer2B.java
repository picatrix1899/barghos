package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two byte input arguments and returns no
 * result. {@link Consumer2B} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptB(byte, byte)}
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
	void acceptB(byte a, byte b);

	@Override
	default void accept(Byte a, Byte b)
	{
		acceptB(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2B} performing this operation and the
	 * operation after.
	 */
	default Consumer2B then(Consumer2B after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptB(a, b); after.acceptB(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2B} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2B then(Consumer2<? super Byte,? super Byte> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptB(a, b); after.accept(a, b); };
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
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptB(a, b); after.accept(a, b); };
	}

	@Override
	default Consumer2B andThen(java.util.function.BiConsumer<? super Byte,? super Byte> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptB(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2B} performing the operation before and
	 * this operation.
	 */
	default Consumer2B before(Consumer2B before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptB(a, b); acceptB(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2B} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2B before(Consumer2<? super Byte,? super Byte> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptB(a, b); };
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
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptB(a, b); };
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
	static Consumer2B of(Consumer2B... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2B consumer : consumers) consumer.acceptB(a, b); };
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
	static Consumer2B of(Consumer2<? super Byte,? super Byte>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2B) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Byte,? super Byte> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SafeVarargs
	static Consumer2B of(java.util.function.BiConsumer<? super Byte,? super Byte>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2B)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Byte,? super Byte> consumer : consumers) consumer.accept(a, b); };
	}
	
}
