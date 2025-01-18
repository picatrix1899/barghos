package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four byte input arguments and returns
 * no result. {@link Consumer4B} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptB(byte, byte, byte, byte)}
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
	void acceptB(byte a, byte b, byte c, byte d);
	
	@Override
	default void accept(Byte a, Byte b, Byte c, Byte d)
	{
		acceptB(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4B} performing this operation and the
	 * operation after.
	 */
	default Consumer4B then(Consumer4B after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptB(a, b, c, d); after.acceptB(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4B} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4B then(Consumer4<? super Byte,? super Byte,? super Byte,? super Byte> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptB(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4B} performing the operation before and
	 * this operation.
	 */
	default Consumer4B before(Consumer4B before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptB(a, b, c, d); acceptB(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4B} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4B before(Consumer4<? super Byte,? super Byte,? super Byte,? super Byte> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptB(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4B} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4B of(Consumer4B... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4B consumer : consumers) consumer.acceptB(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4B} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4B} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4B of(Consumer4<? super Byte,? super Byte,? super Byte,? super Byte>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4B) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super Byte,? super Byte,? super Byte,? super Byte> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
