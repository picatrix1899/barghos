package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional short array input
 * argument and returns no result. {@link ConsumerSA} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptSA(short[])}
 * 
 * @see ConsumerSA
 * @see ConsumerExSA
 * @see Consumer2SA
 * @see ConsumerEx2SA
 * @see Consumer3SA
 * @see ConsumerEx3SA
 * @see Consumer4SA
 * @see ConsumerEx4SA
 */
@FunctionalInterface
public interface ConsumerSA extends Consumer<short[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptSA(short[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerSA} performing this operation and the
	 * operation after.
	 */
	default ConsumerSA thenSA(ConsumerSA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptSA(a); after.acceptSA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerSA} performing the operation before and this
	 * operation.
	 */
	default ConsumerSA beforeSA(ConsumerSA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptSA(a); acceptSA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerSA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerSA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerSA ofSA(ConsumerSA... consumers)
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
		
		return (a) -> { for(ConsumerSA consumer : consumers) consumer.acceptSA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptSA(short[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(short[] a)
	{
		acceptSA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerSA then(Consumer<short[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptSA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerSA then(java.util.function.Consumer<? super short[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptSA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerSA before(Consumer<short[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptSA(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerSA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerSA before(java.util.function.Consumer<? super short[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptSA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerSA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerSA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerSA of(Consumer<short[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerSA) consumers[0]::accept;

		return (a) -> { for(Consumer<short[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerSA andThen(java.util.function.Consumer<? super short[]> after)
	{
		return then(after);
	}
}
