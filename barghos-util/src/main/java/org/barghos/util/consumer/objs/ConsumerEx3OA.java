package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional object array input
 * arguments and returns no result. Unlike {@link Consumer3OA} this may throw
 * exceptions. {@link ConsumerEx3OA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3OA(Object[], Object[], Object[])}
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
public interface ConsumerEx3OA extends ConsumerEx3<Object[],Object[],Object[]>
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
	void accept3OA(Object[] a, Object[] b, Object[] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3OA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3OA then3OA(ConsumerEx3OA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3OA(a, b, c); after.accept3OA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3OA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3OA before3OA(ConsumerEx3OA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3OA(a, b, c); accept3OA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3OA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3OA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3OA of3OA(ConsumerEx3OA... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3OA consumer : consumers) consumer.accept3OA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3OA(Object[], Object[], Object[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Object[] a, Object[] b, Object[] c) throws Exception
	{
		accept3OA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3OA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3OA then(ConsumerEx3<Object[],Object[],Object[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3OA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3OA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3OA before(ConsumerEx3<Object[],Object[],Object[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3OA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3OA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3OA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3OA of(ConsumerEx3<Object[],Object[],Object[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3OA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<Object[],Object[],Object[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
