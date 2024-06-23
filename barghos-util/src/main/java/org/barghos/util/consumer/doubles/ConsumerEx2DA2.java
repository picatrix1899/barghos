package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 2-dimensional double array input
 * arguments and returns no result. Unlike {@link Consumer2DA2} this may throw
 * exceptions. {@link ConsumerEx2DA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2DA2(double[][], double[][])}
 * 
 * @see ConsumerDA2
 * @see ConsumerExDA2
 * @see Consumer2DA2
 * @see ConsumerEx2DA2
 * @see Consumer3DA2
 * @see ConsumerEx3DA2
 * @see Consumer4DA2
 * @see ConsumerEx4DA2
 */
@FunctionalInterface
public interface ConsumerEx2DA2 extends ConsumerEx2<double[][],double[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2DA2(double[][] a, double[][] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2DA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2DA2 then2DA2(ConsumerEx2DA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2DA2(a, b); after.accept2DA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2DA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2DA2 before2DA2(ConsumerEx2DA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2DA2(a, b); accept2DA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2DA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2DA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2DA2 of2DA2(ConsumerEx2DA2... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2DA2 consumer : consumers) consumer.accept2DA2(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2DA2(double[][], double[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(double[][] a, double[][] b) throws Exception
	{
		accept2DA2(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2DA2 then(ConsumerEx2<double[][],double[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2DA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2DA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2DA2 before(ConsumerEx2<double[][],double[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2DA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2DA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2DA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2DA2 of(ConsumerEx2<double[][],double[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2DA2) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<double[][],double[][]> consumer : consumers) consumer.accept(a, b); };
	}
}
