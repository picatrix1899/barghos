package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 2-dimensional object array input
 * arguments and returns no result. {@link Consumer2OA2} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2OA2(Object[][], Object[][])}
 * 
 * @see ConsumerOA2
 * @see ConsumerExOA2
 * @see Consumer2OA2
 * @see ConsumerEx2OA2
 * @see Consumer3OA2
 * @see ConsumerEx3OA2
 * @see Consumer4OA2
 * @see ConsumerEx4OA2
 */
@FunctionalInterface
public interface Consumer2OA2 extends Consumer2<Object[][],Object[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void accept2OA2(Object[][] a, Object[][] b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2OA2} performing this operation and the
	 * operation after.
	 */
	default Consumer2OA2 then2OA2(Consumer2OA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2OA2(a, b); after.accept2OA2(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2OA2} performing the operation before and
	 * this operation.
	 */
	default Consumer2OA2 before2OA2(Consumer2OA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2OA2(a, b); accept2OA2(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2OA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2OA2 of2OA2(Consumer2OA2... consumers)
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
		
		return (a, b) -> { for(Consumer2OA2 consumer : consumers) consumer.accept2OA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2OA2 then(Consumer2<Object[][],Object[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2OA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2OA2 then(java.util.function.BiConsumer<? super Object[][],? super Object[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2OA2(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2OA2 before(Consumer2<Object[][],Object[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2OA2(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2OA2 before(java.util.function.BiConsumer<? super Object[][],? super Object[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2OA2(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2OA2} performing the operations.
	 */
	@SafeVarargs
	static Consumer2OA2 of(Consumer2<Object[][],Object[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return (Consumer2OA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<Object[][],Object[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2OA2(Object[][], Object[][])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object[][] a, Object[][] b)
	{
		accept2OA2(a, b);
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2OA2 andThen(java.util.function.BiConsumer<? super Object[][],? super Object[][]> after)
	{
		return then(after);
	}
}
