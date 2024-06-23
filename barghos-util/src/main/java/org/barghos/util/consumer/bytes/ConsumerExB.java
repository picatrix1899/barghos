package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

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
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExB} performing this operation and the
	 * operation after.
	 */
	default ConsumerExB thenB(ConsumerExB after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptB(a); after.acceptB(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExB} performing the operation before and
	 * this operation.
	 */
	default ConsumerExB beforeB(ConsumerExB before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptB(a); acceptB(a); };
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
	static ConsumerExB ofB(ConsumerExB... consumers)
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
		
		return (a) -> { for(ConsumerExB consumer : consumers) consumer.acceptB(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptF(Byte)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Byte a) throws Exception
	{
		acceptB(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExB} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExB then(ConsumerEx<Byte> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptB(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExB} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExB before(ConsumerEx<Byte> before)
	{
		ParameterValidation.pvNotNull("before", before);

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
	static ConsumerExB of(ConsumerEx<Byte>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExB) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<Byte> consumer : consumers) consumer.accept(a); };
	}
}
