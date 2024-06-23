package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional int array input
 * arguments and returns no result. {@link Consumer2IA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2IA(int[], int[])}
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
public interface Consumer2IA extends Consumer2<int[],int[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2IA(int[] a, int[] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2IA} performing this operation and the
	 * operation after.
	 */
	default Consumer2IA then2IA(Consumer2IA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2IA(a, b); after.accept2IA(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2IA} performing the operation before and
	 * this operation.
	 */
	default Consumer2IA before2IA(Consumer2IA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2IA(a, b); accept2IA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2IA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2IA of2IA(Consumer2IA... consumers)
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
		
		return (a, b) -> { for(Consumer2IA consumer : consumers) consumer.accept2IA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2IA then(Consumer2<int[],int[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2IA(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2IA then(java.util.function.BiConsumer<? super int[],? super int[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2IA(a, b); after.accept(a, b); };
	}
	
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2IA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2IA before(Consumer2<int[],int[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2IA(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2IA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2IA before(java.util.function.BiConsumer<? super int[],? super int[]> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept2IA(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2IA} performing the operations.
	 */
	@SafeVarargs
	static Consumer2IA of(Consumer2<int[],int[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2IA) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<int[],int[]> consumer : consumers) consumer.accept(a, b); };
	}

	/**
	 * @deprecated Use {@link #accept2IA(int[], int[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(int[] a, int[] b)
	{
		accept2IA(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2IA andThen(java.util.function.BiConsumer<? super int[],? super int[]> after)
	{
		return then(after);
	}
}
