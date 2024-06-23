package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 3-dimensional int array input
 * arguments and returns no result. {@link Consumer3IA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3IA3(int[][][], int[][][], int[][][])}
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
public interface Consumer3IA3 extends Consumer3<int[][][],int[][][],int[][][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3IA3(int[][][] a, int[][][] b, int[][][] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3IA3} performing this operation and the
	 * operation after.
	 */
	default Consumer3IA3 then3IA3(Consumer3IA3 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3IA3(a, b, c); after.accept3IA3(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3IA3} performing the operation before and
	 * this operation.
	 */
	default Consumer3IA3 before3IA3(Consumer3IA3 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3IA3(a, b, c); accept3IA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3IA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3IA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer3IA3 of3IA3(Consumer3IA3... consumers)
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
		
		return (a, b, c) -> { for(Consumer3IA3 consumer : consumers) consumer.accept3IA3(a, b, c); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept3IA3(int[][][], int[][][], int[][][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[][][] a, int[][][] b, int[][][] c)
	{
		accept3IA3(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3IA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3IA3 then(Consumer3<int[][][],int[][][],int[][][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3IA3(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3IA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3IA3 before(Consumer3<int[][][],int[][][],int[][][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3IA3(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3IA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3IA3} performing the operations.
	 */
	@SafeVarargs
	static Consumer3IA3 of(Consumer3<int[][][],int[][][],int[][][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3IA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<int[][][],int[][][],int[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
