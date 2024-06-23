package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional long array input
 * arguments and returns no result. Unlike {@link Consumer2LA} this may throw
 * exceptions. {@link ConsumerEx2LA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2LA(long[], long[])}
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
public interface ConsumerEx2LA extends ConsumerEx2<long[],long[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2LA(long[] a, long[] b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2LA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2LA then2LA(ConsumerEx2LA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2LA(a, b); after.accept2LA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2LA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2LA before2LA(ConsumerEx2LA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2LA(a, b); accept2LA(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2LA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2LA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2LA of2LA(ConsumerEx2LA... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2LA consumer : consumers) consumer.accept2LA(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2LA(long[], long[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(long[] a, long[] b) throws Exception
	{
		accept2LA(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2LA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2LA then(ConsumerEx2<long[],long[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2LA(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2LA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2LA before(ConsumerEx2<long[],long[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2LA(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2LA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2LA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2LA of(ConsumerEx2<long[],long[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2LA) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<long[],long[]> consumer : consumers) consumer.accept(a, b); };
	}
}
