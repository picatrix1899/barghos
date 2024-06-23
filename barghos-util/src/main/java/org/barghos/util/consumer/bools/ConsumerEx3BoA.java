package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional boolean array input
 * arguments and returns no result. Unlike {@link Consumer3BoA} this may throw
 * exceptions. {@link ConsumerEx3BoA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3BoA(boolean[], boolean[], boolean[])}
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
public interface ConsumerEx3BoA extends ConsumerEx3<boolean[],boolean[],boolean[]>
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
	void accept3BoA(boolean[] a, boolean[] b, boolean[] c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BoA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BoA then3BoA(ConsumerEx3BoA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3BoA(a, b, c); after.accept3BoA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BoA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3BoA before3BoA(ConsumerEx3BoA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3BoA(a, b, c); accept3BoA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BoA of3BoA(ConsumerEx3BoA... consumers)
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
		
		return (a, b, c) -> { for(ConsumerEx3BoA consumer : consumers) consumer.accept3BoA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3BoA(boolean[], boolean[], boolean[])}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(boolean[] a, boolean[] b, boolean[] c) throws Exception
	{
		accept3BoA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BoA then(ConsumerEx3<boolean[],boolean[],boolean[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3BoA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BoA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BoA before(ConsumerEx3<boolean[],boolean[],boolean[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3BoA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BoA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BoA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BoA of(ConsumerEx3<boolean[],boolean[],boolean[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BoA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<boolean[],boolean[],boolean[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
