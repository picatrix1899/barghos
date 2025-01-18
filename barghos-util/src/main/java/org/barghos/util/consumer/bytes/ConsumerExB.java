package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional byte array input
 * arguments and returns no result. Unlike {@link ConsumerB} this may throw
 * exceptions. {@link ConsumerExB} is expected to operate via side-effects.
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
public interface ConsumerExB extends ConsumerEx<Byte>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptB(byte a) throws Exception;
	
	@Override
	default void accept(Byte a) throws Exception
	{
		acceptB(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExB} performing this operation and the
	 * operation after.
	 */
	default ConsumerExB then(ConsumerExB after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptB(a); after.acceptB(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExB} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExB then(ConsumerEx<? super Byte> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptB(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExB} performing the operation before and
	 * this operation.
	 */
	default ConsumerExB before(ConsumerExB before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptB(a); acceptB(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExB} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExB before(ConsumerEx<? super Byte> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptB(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExB} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExB} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExB of(ConsumerExB... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExB consumer : consumers) consumer.acceptB(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExB} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExB} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExB of(ConsumerEx<? super Byte>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExB) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super Byte> consumer : consumers) consumer.accept(a); };
	}
	
}
