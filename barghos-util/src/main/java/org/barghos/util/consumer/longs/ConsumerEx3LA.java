package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional long array input
 * arguments and returns no result. Unlike {@link Consumer3LA} this may throw
 * exceptions. {@link ConsumerEx3LA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3LA(long[], long[], long[])}
 * 
 * @see ConsumerLA
 * @see ConsumerExLA
 * @see Consumer2LA
 * @see ConsumerEx2LA
 * @see Consumer3LA
 * @see ConsumerEx3LA
 * @see Consumer4LA
 * @see ConsumerEx4LA
 */
@FunctionalInterface
public interface ConsumerEx3LA extends ConsumerEx3<long[],long[],long[]>
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
	void accept3LA(long[] a, long[] b, long[] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3LA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3LA then3LA(ConsumerEx3LA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3LA(a, b, c); after.accept3LA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3LA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3LA before3LA(ConsumerEx3LA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3LA(a, b, c); accept3LA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3LA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3LA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3LA of3LA(ConsumerEx3LA... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3LA consumer : consumers) consumer.accept3LA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3LA(long[], long[], long[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[] a, long[] b, long[] c) throws Exception
	{
		accept3LA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3LA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3LA then(ConsumerEx3<long[],long[],long[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3LA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3LA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3LA before(ConsumerEx3<long[],long[],long[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3LA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3LA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3LA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3LA of(ConsumerEx3<long[],long[],long[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3LA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<long[],long[],long[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
