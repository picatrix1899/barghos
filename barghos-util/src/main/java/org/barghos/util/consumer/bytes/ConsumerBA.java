package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional byte array input
 * argument and returns no result. {@link ConsumerBA} is expected to operate via
 * side-effects.
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
public interface ConsumerBA extends Consumer<byte[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptBA(byte[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerBA} performing this operation and the
	 * operation after.
	 */
	default ConsumerBA thenBA(ConsumerBA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptBA(a); after.acceptBA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerBA} performing the operation before and this
	 * operation.
	 */
	default ConsumerBA beforeBA(ConsumerBA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptBA(a); acceptBA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA ofBA(ConsumerBA... consumers)
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
		
		return (a) -> { for(ConsumerBA consumer : consumers) consumer.acceptBA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptBA(byte[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(byte[] a)
	{
		acceptBA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA then(Consumer<byte[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerBA then(java.util.function.Consumer<? super byte[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptBA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerBA before(Consumer<byte[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerBA before(java.util.function.Consumer<? super byte[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptBA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerBA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerBA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerBA of(Consumer<byte[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerBA) consumers[0]::accept;

		return (a) -> { for(Consumer<byte[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerBA andThen(java.util.function.Consumer<? super byte[]> after)
	{
		return then(after);
	}
}
