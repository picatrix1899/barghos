package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four int input arguments and returns
 * no result. {@link Consumer4I} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4I(int, int, int, int)}
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
public interface Consumer4I extends Consumer4<Integer,Integer,Integer,Integer>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4I(int a, int b, int c, int d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4I} performing this operation and the
	 * operation after.
	 */
	default Consumer4I then4I(Consumer4I after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4I(a, b, c, d); after.accept4I(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4I} performing the operation before and this
	 * operation.
	 */
	default Consumer4I before4I(Consumer4I before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4I(a, b, c, d); accept4I(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4I} performing the operations.
	 */
	@SafeVarargs
	static Consumer4I of4I(Consumer4I... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4I consumer : consumers) consumer.accept4I(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4I(int, int, int, int)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Integer a, Integer b, Integer c, Integer d)
	{
		accept4I(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4I} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4I then(Consumer4<Integer,Integer,Integer,Integer> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4I(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4I} performing the operation before and this
	 * operation.
	 */
	@Override
	default Consumer4I before(Consumer4<Integer,Integer,Integer,Integer> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4I(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4I} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4I} performing the operations.
	 */
	@SafeVarargs
	static Consumer4I of(Consumer4<Integer,Integer,Integer,Integer>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4I) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<Integer,Integer,Integer,Integer> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
