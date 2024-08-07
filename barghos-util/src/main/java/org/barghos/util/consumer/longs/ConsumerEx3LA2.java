package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 2-dimensional long array input
 * arguments and returns no result. Unlike {@link Consumer3LA2} this may throw
 * exceptions. {@link ConsumerEx3LA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3LA2(long[][], long[][], long[][])}
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
public interface ConsumerEx3LA2 extends ConsumerEx3<long[][],long[][],long[][]>
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
	void accept3LA2(long[][] a, long[][] b, long[][] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3LA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3LA2 then3LA2(ConsumerEx3LA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3LA2(a, b, c); after.accept3LA2(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3LA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3LA2 before2LA2(ConsumerEx3LA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3LA2(a, b, c); accept3LA2(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3LA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3LA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3LA2 of3LA2(ConsumerEx3LA2... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3LA2 consumer : consumers) consumer.accept3LA2(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3LA2(long[][], long[][], long[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[][] a, long[][] b, long[][] c) throws Exception
	{
		accept3LA2(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3LA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3LA2 then(ConsumerEx3<long[][],long[][],long[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3LA2(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3LA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3LA2 before(ConsumerEx3<long[][],long[][],long[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3LA2(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3LA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3LA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3LA2 of(ConsumerEx3<long[][],long[][],long[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3LA2) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<long[][],long[][],long[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
