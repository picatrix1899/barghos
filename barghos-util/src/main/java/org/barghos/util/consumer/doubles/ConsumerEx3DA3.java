package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 3-dimensional double array input
 * arguments and returns no result. Unlike {@link Consumer3DA3} this may throw
 * exceptions. {@link ConsumerEx3DA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3DA3(double[][][], double[][][], double[][][])}
 * 
 * @see ConsumerDA3
 * @see ConsumerExDA3
 * @see Consumer2DA3
 * @see ConsumerEx2DA3
 * @see Consumer3DA3
 * @see ConsumerEx3DA3
 * @see Consumer4DA3
 * @see ConsumerEx4DA3
 */
@FunctionalInterface
public interface ConsumerEx3DA3 extends ConsumerEx3<double[][][],double[][][],double[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept3DA3(double[][][] a, double[][][] b, double[][][] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3DA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3DA3 then3DA3(ConsumerEx3DA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3DA3(a, b, c); after.accept3DA3(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3DA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3DA3 before3DA3(ConsumerEx3DA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3DA3(a, b, c); accept3DA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3DA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3DA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3DA3 of3DA3(ConsumerEx3DA3... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3DA3 consumer : consumers) consumer.accept3DA3(a, b, c); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept3DA3(double[][][], double[][][], double[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[][][] a, double[][][] b, double[][][] c) throws Exception
	{
		accept3DA3(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3DA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3DA3 then(ConsumerEx3<double[][][],double[][][],double[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3DA3(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3DA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3DA3 before(ConsumerEx3<double[][][],double[][][],double[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3DA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3DA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3DA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3DA3 of(ConsumerEx3<double[][][],double[][][],double[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3DA3) consumers[0]::accept;
		
		return (a, b, c) -> { for(ConsumerEx3<double[][][],double[][][],double[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
