package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one 1-dimensional double array input
 * argument and returns no result. {@link ConsumerDA} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptDA(double[])}
 * 
 * @see ConsumerDA
 * @see ConsumerExDA
 * @see Consumer2DA
 * @see ConsumerEx2DA
 * @see Consumer3DA
 * @see ConsumerEx3DA
 * @see Consumer4DA
 * @see ConsumerEx4DA
 */
@FunctionalInterface
public interface ConsumerDA extends Consumer<double[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 */
	void acceptDA(double[] a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerDA} performing this operation and the
	 * operation after.
	 */
	default ConsumerDA thenDA(ConsumerDA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { acceptDA(a); after.acceptDA(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerDA} performing the operation before and this
	 * operation.
	 */
	default ConsumerDA beforeDA(ConsumerDA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.acceptDA(a); acceptDA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerDA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerDA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerDA ofDA(ConsumerDA... consumers)
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
		
		return (a) -> { for(ConsumerDA consumer : consumers) consumer.acceptDA(a); };
	}

	/**
	 * @deprecated Use {@link #acceptDA(double[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[] a)
	{
		acceptDA(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerDA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerDA then(Consumer<double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptDA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerDA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerDA then(java.util.function.Consumer<? super double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a) -> { acceptDA(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerDA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerDA before(Consumer<double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptDA(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerDA} performing the operation before and this
	 * operation.
	 */
	@Override
	default ConsumerDA before(java.util.function.Consumer<? super double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a) -> { before.accept(a); acceptDA(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerDA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerDA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerDA of(Consumer<double[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerDA) consumers[0]::accept;

		return (a) -> { for(Consumer<double[]> consumer : consumers) consumer.accept(a); };
	}

	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default ConsumerDA andThen(java.util.function.Consumer<? super double[]> after)
	{
		return then(after);
	}
}
