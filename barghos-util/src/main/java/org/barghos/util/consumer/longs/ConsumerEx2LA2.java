package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 2-dimensional long array input
 * arguments and returns no result. Unlike {@link Consumer2LA2} this may throw
 * exceptions. {@link ConsumerEx2LA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2LA2(long[][], long[][])}
 * 
 * @see ConsumerLA2
 * @see ConsumerExLA2
 * @see Consumer2LA2
 * @see ConsumerEx2LA2
 * @see Consumer3LA2
 * @see ConsumerEx3LA2
 * @see Consumer4LA2
 * @see ConsumerEx4LA2
 */
@FunctionalInterface
public interface ConsumerEx2LA2 extends ConsumerEx2<long[][],long[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2LA2(long[][] a, long[][] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2LA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2LA2 then2LA2(ConsumerEx2LA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2LA2(a, b); after.accept2LA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2LA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2LA2 before2LA2(ConsumerEx2LA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2LA2(a, b); accept2LA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2LA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2LA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2LA2 of2LA2(ConsumerEx2LA2... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2LA2 consumer : consumers) consumer.accept2LA2(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2LA2(long[][], long[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[][] a, long[][] b) throws Exception
	{
		accept2LA2(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2LA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2LA2 then(ConsumerEx2<long[][],long[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2LA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2LA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2LA2 before(ConsumerEx2<long[][],long[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2LA2(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2LA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2LA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2LA2 of(ConsumerEx2<long[][],long[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2LA2) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<long[][],long[][]> consumer : consumers) consumer.accept(a, b); };
	}
}
