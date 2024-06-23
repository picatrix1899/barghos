package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional double array input
 * arguments and returns no result. Unlike {@link Consumer2DA} this may throw
 * exceptions. {@link ConsumerEx2DA} is expected to operate via side-effects.
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
public interface ConsumerEx2DA extends ConsumerEx2<double[],double[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2DA(double[] a, double[] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2DA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2DA then2DA(ConsumerEx2DA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2DA(a, b); after.accept2DA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2DA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2DA before2DA(ConsumerEx2DA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2DA(a, b); accept2DA(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2DA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2DA of2DA(ConsumerEx2DA... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2DA consumer : consumers) consumer.accept2DA(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2DA(double[], double[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[] a, double[] b) throws Exception
	{
		accept2DA(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2DA then(ConsumerEx2<double[],double[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2DA(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2DA before(ConsumerEx2<double[],double[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2DA(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2DA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2DA of(ConsumerEx2<double[],double[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2DA) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<double[],double[]> consumer : consumers) consumer.accept(a, b); };
	}
}
