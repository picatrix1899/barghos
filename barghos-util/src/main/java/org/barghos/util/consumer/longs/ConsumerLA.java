package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional long array input
 * argument and returns no result. {@link ConsumerLA} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptLA(long[])}
 * 
 * @see ConsumerLA
 * @see ConsumerExLA
 * @see Consumer2LA
 * @see ConsumerEx2LA
 * @see Consumer3LA
 * @see ConsumerEx3LA
 * @see Consumer4LA
 * @see ConsumerEx4LA
 */
@FunctionalInterface
public interface ConsumerLA extends Consumer<long[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptLA(long[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerLA} performing this operation and the
	 * operation after.
	 */
	default ConsumerLA thenLA(ConsumerLA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptLA(a); after.acceptLA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerLA} performing the operation before and this
	 * operation.
	 */
	default ConsumerLA beforeLA(ConsumerLA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptLA(a); acceptLA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerLA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerLA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerLA ofLA(ConsumerLA... consumers)
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
		
		return (a) -> { for(ConsumerLA consumer : consumers) consumer.acceptLA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptLA(long[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[] a)
	{
		acceptLA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA then(Consumer<long[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptLA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerLA then(java.util.function.Consumer<? super long[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptLA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerLA before(Consumer<long[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptLA(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerLA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerLA before(java.util.function.Consumer<? super long[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptLA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerLA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerLA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerLA of(Consumer<long[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerLA) consumers[0]::accept;

		return (a) -> { for(Consumer<long[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated
	 * 
	 * Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerLA andThen(java.util.function.Consumer<? super long[]> after)
	{
		return then(after);
	}
}
