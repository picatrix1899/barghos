package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four 1-dimensional boolean array input
 * arguments and returns no result. Unlike {@link Consumer4BoA} this may throw
 * exceptions. {@link ConsumerEx4BoA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4BoA(boolean[], boolean[], boolean[], boolean[])}
 * 
 * @see ConsumerBoA
 * @see ConsumerExBoA
 * @see Consumer2BoA
 * @see ConsumerEx2BoA
 * @see Consumer3BoA
 * @see ConsumerEx3BoA
 * @see Consumer4BoA
 * @see ConsumerEx4BoA
 */
@FunctionalInterface
public interface ConsumerEx4BoA extends ConsumerEx4<boolean[],boolean[],boolean[],boolean[]>
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
	void accept4BoA(boolean[] a, boolean[] b, boolean[] c, boolean[] d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4BoA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4BoA then4BoA(ConsumerEx4BoA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4BoA(a, b, c, d); after.accept4BoA(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4BoA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4BoA before4BoA(ConsumerEx4BoA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4BoA(a, b, c, d); accept4BoA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BoA of4BoA(ConsumerEx4BoA... consumers)
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
		
		return (a, b, c, d) -> { for(ConsumerEx4BoA consumer : consumers) consumer.accept4BoA(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4BoA(boolean[], boolean[], boolean[], boolean[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[] a, boolean[] b, boolean[] c, boolean[] d) throws Exception
	{
		accept4BoA(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BoA then(ConsumerEx4<boolean[],boolean[],boolean[],boolean[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c, d) -> { accept4BoA(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4BoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4BoA before(ConsumerEx4<boolean[],boolean[],boolean[],boolean[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4BoA(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx4BoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4BoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4BoA of(ConsumerEx4<boolean[],boolean[],boolean[],boolean[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4BoA) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<boolean[],boolean[],boolean[],boolean[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
