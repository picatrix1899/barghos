package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional double array input
 * arguments and returns no result. Unlike {@link Consumer4D} this may throw
 * exceptions. {@link ConsumerEx4D} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4D(double, double, double, double)}
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
public interface ConsumerEx4D extends ConsumerEx4<Double,Double,Double,Double>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept4D(double a, double b, double c, double d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4D} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4D then4D(ConsumerEx4D after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4D(a, b, c, d); after.accept4D(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4D} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4D before4D(ConsumerEx4D before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4D(a, b, c, d); accept4D(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4D} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4D} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4D of4D(ConsumerEx4D... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4D consumer : consumers) consumer.accept4D(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4D(double, double, double, double)}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Double a, Double b, Double c, Double d) throws Exception
	{
		accept4D(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4D} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4D then(ConsumerEx4<Double,Double,Double,Double> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4D(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4D} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4D before(ConsumerEx4<Double,Double,Double,Double> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4D(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4D} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4D} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4D of(ConsumerEx4<Double,Double,Double,Double>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4D) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<Double,Double,Double,Double> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
