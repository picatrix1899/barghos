package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three int input arguments and returns
 * no result. {@link Consumer3I} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3I(int, int, int)}
 * 
 * @see ConsumerI
 * @see ConsumerExI
 * @see Consumer2I
 * @see ConsumerEx2I
 * @see Consumer3I
 * @see ConsumerEx3I
 * @see Consumer4I
 * @see ConsumerEx4I
 */
@FunctionalInterface
public interface Consumer3I extends Consumer3<Integer,Integer,Integer>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3I(int a, int b, int c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3I} performing this operation and the
	 * operation after.
	 */
	default Consumer3I then3I(Consumer3I after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3I(a, b, c); after.accept3I(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3I} performing the operation before and this
	 * operation.
	 */
	default Consumer3I before3I(Consumer3I before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3I(a, b, c); accept3I(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3I} performing the operations.
	 */
	@SafeVarargs
	static Consumer3I of3I(Consumer3I... consumers)
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
		
		return (a, b, c) -> { for(Consumer3I consumer : consumers) consumer.accept3I(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3I(int, int, int)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Integer a, Integer b, Integer c)
	{
		accept3I(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3I} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3I then(Consumer3<Integer,Integer,Integer> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3I(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3I} performing the operation before and this
	 * operation.
	 */
	@Override
	default Consumer3I before(Consumer3<Integer,Integer,Integer> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3I(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3I} performing the operations.
	 */
	@SafeVarargs
	static Consumer3I of(Consumer3<Integer,Integer,Integer>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3I) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<Integer,Integer,Integer> consumer : consumers) consumer.accept(a, b, c); };
	}
}
