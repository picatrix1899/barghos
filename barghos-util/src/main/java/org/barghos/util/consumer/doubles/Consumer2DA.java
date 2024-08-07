package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional double array input
 * arguments and returns no result. {@link Consumer2DA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2DA(double[], double[])}
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
public interface Consumer2DA extends Consumer2<double[],double[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2DA(double[] a, double[] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2DA} performing this operation and the
	 * operation after.
	 */
	default Consumer2DA then2DA(Consumer2DA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2DA(a, b); after.accept2DA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2DA} performing the operation before and
	 * this operation.
	 */
	default Consumer2DA before2DA(Consumer2DA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2DA(a, b); accept2DA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2DA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2DA of2DA(Consumer2DA... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2DA consumer : consumers) consumer.accept2DA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2DA then(Consumer2<double[],double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2DA(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2DA then(java.util.function.BiConsumer<? super double[],? super double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2DA(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2DA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2DA before(Consumer2<double[],double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2DA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2DA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2DA before(java.util.function.BiConsumer<? super double[],? super double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2DA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2DA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2DA of(Consumer2<double[],double[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2DA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<double[],double[]> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2DA(double[], double[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[] a, double[] b)
	{
		accept2DA(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2DA andThen(java.util.function.BiConsumer<? super double[],? super double[]> after)
	{
		return then(after);
	}
}
