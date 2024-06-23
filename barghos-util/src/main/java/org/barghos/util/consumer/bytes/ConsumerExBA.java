package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional byte array input
 * arguments and returns no result. Unlike {@link ConsumerBA} this may throw
 * exceptions. {@link ConsumerExBA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBA(byte[])}
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
public interface ConsumerExBA extends ConsumerEx<byte[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBA(byte[] a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBA thenBA(ConsumerExBA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBA(a); after.acceptBA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBA beforeBA(ConsumerExBA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBA(a); acceptBA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBA ofBA(ConsumerExBA... consumers)
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
		
		return (a) -> { for(ConsumerExBA consumer : consumers) consumer.acceptBA(a); };
	}
	
	/**
	 * @deprecated Use {@link #acceptBA(byte[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[] a) throws Exception
	{
		acceptBA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBA then(ConsumerEx<byte[]> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBA before(ConsumerEx<byte[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerExBA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBA of(ConsumerEx<byte[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExBA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<byte[]> consumer : consumers) consumer.accept(a); };
	}
}
