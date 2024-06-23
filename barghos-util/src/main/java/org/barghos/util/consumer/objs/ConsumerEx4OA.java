package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional object array input
 * arguments and returns no result. Unlike {@link Consumer4OA} this may throw
 * exceptions. {@link ConsumerEx4OA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4OA(Object[], Object[], Object[], Object[])}
 * 
 * @see ConsumerOA
 * @see ConsumerExOA
 * @see Consumer2OA
 * @see ConsumerEx2OA
 * @see Consumer3OA
 * @see ConsumerEx3OA
 * @see Consumer4OA
 * @see ConsumerEx4OA
 */
@FunctionalInterface
public interface ConsumerEx4OA extends ConsumerEx4<Object[],Object[],Object[],Object[]>
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
	void accept4OA(Object[] a, Object[] b, Object[] c, Object[] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4OA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4OA then4OA(ConsumerEx4OA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4OA(a, b, c, d); after.accept4OA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4OA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4OA before4OA(ConsumerEx4OA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4OA(a, b, c, d); accept4OA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4OA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4OA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4OA of4OA(ConsumerEx4OA... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4OA consumer : consumers) consumer.accept4OA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4OA(Object[], Object[], Object[], Object[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object[] a, Object[] b, Object[] c, Object[] d) throws Exception
	{
		accept4OA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4OA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4OA then(ConsumerEx4<Object[],Object[],Object[],Object[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4OA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4OA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4OA before(ConsumerEx4<Object[],Object[],Object[],Object[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4OA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4OA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4OA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4OA of(ConsumerEx4<Object[],Object[],Object[],Object[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4OA) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<Object[],Object[],Object[],Object[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
