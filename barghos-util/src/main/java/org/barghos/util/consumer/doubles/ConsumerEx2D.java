package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional double array input
 * arguments and returns no result. Unlike {@link Consumer2D} this may throw
 * exceptions. {@link ConsumerEx2D} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2D(double, double)}
 * 
 * @see ConsumerD
 * @see ConsumerExD
 * @see Consumer2D
 * @see ConsumerEx2D
 * @see Consumer3D
 * @see ConsumerEx3D
 * @see Consumer4D
 * @see ConsumerEx4D
 */
@FunctionalInterface
public interface ConsumerEx2D extends ConsumerEx2<Double,Double>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2D(double a, double b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2D} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2D then2D(ConsumerEx2D after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2D(a, b); after.accept2D(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2D} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2D before2D(ConsumerEx2D before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2D(a, b); accept2D(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2D} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2D} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2D of2D(ConsumerEx2D... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2D consumer : consumers) consumer.accept2D(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2D(double, double)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Double a, Double b) throws Exception
	{
		accept2D(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2D} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2D then(ConsumerEx2<Double,Double> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2D(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2D} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2D before(ConsumerEx2<Double,Double> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2D(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2D} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2D} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2D of(ConsumerEx2<Double,Double>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2D) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<Double,Double> consumer : consumers) consumer.accept(a, b); };
	}
}
