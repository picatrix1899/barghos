package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional int array input
 * arguments and returns no result. Unlike {@link Consumer4IA} this may throw
 * exceptions. {@link ConsumerEx4IA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4IA(int[], int[], int[], int[])}
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
public interface ConsumerEx4IA extends ConsumerEx4<int[],int[],int[],int[]>
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
	void accept4IA(int[] a, int[] b, int[] c, int[] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4IA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4IA then4IA(ConsumerEx4IA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4IA(a, b, c, d); after.accept4IA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4IA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4IA before4IA(ConsumerEx4IA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4IA(a, b, c, d); accept4IA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4IA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4IA of4IA(ConsumerEx4IA... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4IA consumer : consumers) consumer.accept4IA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4IA(int[], int[], int[], int[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[] a, int[] b, int[] c, int[] d) throws Exception
	{
		accept4IA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4IA then(ConsumerEx4<int[],int[],int[],int[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4IA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4IA before(ConsumerEx4<int[],int[],int[],int[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4IA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4IA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4IA of(ConsumerEx4<int[],int[],int[],int[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4IA) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<int[],int[],int[],int[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
