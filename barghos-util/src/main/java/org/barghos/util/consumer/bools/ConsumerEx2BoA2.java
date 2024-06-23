package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 2-dimensional boolean array input
 * arguments and returns no result. Unlike {@link Consumer2BoA2} this may throw
 * exceptions. {@link ConsumerEx2BoA2} is expected to operate via side-effects.
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
public interface ConsumerEx2BoA2 extends ConsumerEx2<boolean[][],boolean[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2BoA2(boolean[][] a, boolean[][] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BoA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BoA2 then2BoA2(ConsumerEx2BoA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2BoA2(a, b); after.accept2BoA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BoA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2BoA2 before2BoA2(ConsumerEx2BoA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2BoA2(a, b); accept2BoA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BoA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BoA2 of2BoA2(ConsumerEx2BoA2... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2BoA2 consumer : consumers) consumer.accept2BoA2(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2BoA2(boolean[][], boolean[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[][] a, boolean[][] b) throws Exception
	{
		accept2BoA2(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BoA2 then(ConsumerEx2<boolean[][],boolean[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2BoA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BoA2 before(ConsumerEx2<boolean[][],boolean[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2BoA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BoA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BoA2 of(ConsumerEx2<boolean[][],boolean[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BoA2) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<boolean[][],boolean[][]> consumer : consumers) consumer.accept(a, b); };
	}
}
