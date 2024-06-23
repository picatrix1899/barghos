package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 2-dimensional boolean array input
 * arguments and returns no result. {@link Consumer2BoA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BoA2(boolean[][], boolean[][])}
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
public interface Consumer2BoA2 extends Consumer2<boolean[][],boolean[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2BoA2(boolean[][] a, boolean[][] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2BoA2 then2BoA2(Consumer2BoA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BoA2(a, b); after.accept2BoA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2BoA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2BoA2 before2BoA2(Consumer2BoA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BoA2(a, b); accept2BoA2(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BoA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BoA2 of2BoA2(Consumer2BoA2... consumers)
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
		
		return (a, b) -> { for(Consumer2BoA2 consumer : consumers) consumer.accept2BoA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA2 then(Consumer2<boolean[][],boolean[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BoA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA2 then(java.util.function.BiConsumer<? super boolean[][],? super boolean[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BoA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA2 before(Consumer2<boolean[][],boolean[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BoA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2BoA2 before(java.util.function.BiConsumer<? super boolean[][],? super boolean[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BoA2(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2BoA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2BoA2 of(Consumer2<boolean[][],boolean[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return (Consumer2BoA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<boolean[][],boolean[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2BoA2(boolean[][], boolean[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[][] a, boolean[][] b)
	{
		accept2BoA2(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2BoA2 andThen(java.util.function.BiConsumer<? super boolean[][],? super boolean[][]> after)
	{
		return then(after);
	}
}
