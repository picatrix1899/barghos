package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 2-dimensional object array input
 * arguments and returns no result. Unlike {@link Consumer4OA2} this may throw
 * exceptions. {@link ConsumerEx4OA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4OA2(Object[][], Object[][], Object[][], Object[][])}
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
public interface ConsumerEx4OA2 extends ConsumerEx4<Object[][],Object[][],Object[][],Object[][]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept4OA2(Object[][] a, Object[][] b, Object[][] c, Object[][] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4OA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4OA2 then4OA2(ConsumerEx4OA2 after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4OA2(a, b, c, d); after.accept4OA2(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4OA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4OA2 before4OA2(ConsumerEx4OA2 before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4OA2(a, b, c, d); accept4OA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4OA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4OA2 of4OA2(ConsumerEx4OA2... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4OA2 consumer : consumers) consumer.accept4OA2(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use
	 * {@link #accept4OA2(Object[][], Object[][], Object[][], Object[][])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object[][] a, Object[][] b, Object[][] c, Object[][] d) throws Exception
	{
		accept4OA2(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4OA2 then(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4OA2(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4OA2 before(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4OA2(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4OA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4OA2 of(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4OA2) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<Object[][],Object[][],Object[][],Object[][]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
