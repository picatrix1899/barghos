package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two 1-dimensional int array input
 * arguments and returns no result. Unlike {@link Consumer2I} this may throw
 * exceptions. {@link ConsumerEx2I} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2I(int, int)}
 * 
 * @see ConsumerF
 * @see ConsumerExF
 * @see Consumer2I
 * @see ConsumerEx2I
 * @see Consumer3F
 * @see ConsumerEx3F
 * @see Consumer4F
 * @see ConsumerEx4F
 */
@FunctionalInterface
public interface ConsumerEx2I extends ConsumerEx2<Integer,Integer>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept2I(int a, int b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2I} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2I then2I(ConsumerEx2I after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept2I(a, b); after.accept2I(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2I} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2I before2I(ConsumerEx2I before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept2I(a, b); accept2I(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2I} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2I of2I(ConsumerEx2I... consumers)
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
		
		return (a, b) -> { for(ConsumerEx2I consumer : consumers) consumer.accept2I(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #accept2I(int, int)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Integer a, Integer b) throws Exception
	{
		accept2I(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2I} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2I then(ConsumerEx2<Integer,Integer> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b) -> { accept2I(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2I} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2I before(ConsumerEx2<Integer,Integer> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b) -> { before.accept(a, b); accept2I(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2I} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2I of(ConsumerEx2<Integer,Integer>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2I) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<Integer,Integer> consumer : consumers) consumer.accept(a, b); };
	}
}
