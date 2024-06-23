package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 3-dimensional int array input
 * arguments and returns no result. Unlike {@link Consumer4IA3} this may throw
 * exceptions. {@link ConsumerEx4IA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4IA3(int[][][], int[][][], int[][][], int[][][])}
 * 
 * @see ConsumerIA3
 * @see ConsumerExIA3
 * @see Consumer2IA3
 * @see ConsumerEx2IA3
 * @see Consumer3IA3
 * @see ConsumerEx3IA3
 * @see Consumer4IA3
 * @see ConsumerEx4IA3
 */
@FunctionalInterface
public interface ConsumerEx4IA3 extends ConsumerEx4<int[][][],int[][][],int[][][],int[][][]>
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
	void accept4IA3(int[][][] a, int[][][] b, int[][][] c, int[][][] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4IA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4IA3 then4IA3(ConsumerEx4IA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4IA3(a, b, c, d); after.accept4IA3(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4IA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4IA3 before4IA3(ConsumerEx4IA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4IA3(a, b, c, d); accept4IA3(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4IA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4IA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4IA3 of4IA3(ConsumerEx4IA3... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4IA3 consumer : consumers) consumer.accept4IA3(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4IA3(int[][][], int[][][], int[][][], int[][][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[][][] a, int[][][] b, int[][][] c, int[][][] d) throws Exception
	{
		accept4IA3(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4IA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4IA3 then(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4IA3(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4IA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4IA3 before(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4IA3(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4IA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4IA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4IA3 of(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4IA3) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<int[][][],int[][][],int[][][],int[][][]> consumer : consumers) consumer.accept(a, b, c, d);  };
	}
}
