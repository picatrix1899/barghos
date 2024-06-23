package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional int array input
 * argument and returns no result. {@link ConsumerIA} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptIA(int[])}
 * 
 * @see ConsumerIA
 * @see ConsumerExIA
 * @see Consumer2IA
 * @see ConsumerEx2IA
 * @see Consumer3IA
 * @see ConsumerEx3IA
 * @see Consumer4IA
 * @see ConsumerEx4IA
 */
@FunctionalInterface
public interface ConsumerIA extends Consumer<int[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptIA(int[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerIA} performing this operation and the
	 * operation after.
	 */
	default ConsumerIA thenIA(ConsumerIA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptIA(a); after.acceptIA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerIA} performing the operation before and this
	 * operation.
	 */
	default ConsumerIA beforeIA(ConsumerIA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptIA(a); acceptIA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerIA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerIA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerIA ofIA(ConsumerIA... consumers)
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
		
		return (a) -> { for(ConsumerIA consumer : consumers) consumer.acceptIA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptIA(int[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[] a)
	{
		acceptIA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA then(Consumer<int[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptIA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerIA then(java.util.function.Consumer<? super int[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptIA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerIA before(Consumer<int[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptIA(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerIA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerIA before(java.util.function.Consumer<? super int[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptIA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerIA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerIA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerIA of(Consumer<int[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerIA) consumers[0]::accept;

		return (a) -> { for(Consumer<int[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerIA andThen(java.util.function.Consumer<? super int[]> after)
	{
		return then(after);
	}
}
