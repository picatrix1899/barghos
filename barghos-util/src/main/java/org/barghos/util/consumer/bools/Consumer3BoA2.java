package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 2-dimensional boolean array input
 * arguments and returns no result. {@link Consumer3BoA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BoA2(boolean[][], boolean[][], boolean[][])}
 * 
 * @see ConsumerBoA2
 * @see ConsumerExBoA2
 * @see Consumer2BoA2
 * @see ConsumerEx2BoA2
 * @see Consumer3BoA2
 * @see ConsumerEx3BoA2
 * @see Consumer4BoA2
 * @see ConsumerEx4BoA2
 */
@FunctionalInterface
public interface Consumer3BoA2 extends Consumer3<boolean[][],boolean[][],boolean[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3BoA2(boolean[][] a, boolean[][] b, boolean[][] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3BoA2} performing this operation and the
	 * operation after.
	 */
	default Consumer3BoA2 then3BoA2(Consumer3BoA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BoA2(a, b, c); after.accept3BoA2(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3BoA2} performing the operation before and
	 * this operation.
	 */
	default Consumer3BoA2 before3BoA2(Consumer3BoA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BoA2(a, b, c); accept3BoA2(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BoA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BoA2 of3BoA2(Consumer3BoA2... consumers)
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
		
		return (a, b, c) -> { for(Consumer3BoA2 consumer : consumers) consumer.accept3BoA2(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3BoA2(boolean[][], boolean[][], boolean[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[][] a, boolean[][] b, boolean[][] c)
	{
		accept3BoA2(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BoA2 then(Consumer3<boolean[][],boolean[][],boolean[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BoA2(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3BoA2 before(Consumer3<boolean[][],boolean[][],boolean[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BoA2(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3BoA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer3BoA2 of(Consumer3<boolean[][],boolean[][],boolean[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};
		
		if(consumers.length == 1) return (Consumer3BoA2) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<boolean[][],boolean[][],boolean[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
