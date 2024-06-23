package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four short input arguments and returns
 * no result. {@link Consumer4S} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4S(short, short, short, short)}
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface Consumer4S extends Consumer4<Short,Short,Short,Short>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4S(short a, short b, short c, short d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4S} performing this operation and the
	 * operation after.
	 */
	default Consumer4S then4S(Consumer4S after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4S(a, b, c, d); after.accept4S(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4S} performing the operation before and this
	 * operation.
	 */
	default Consumer4S before4S(Consumer4S before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4S(a, b, c, d); accept4S(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4S} performing the operations.
	 */
	@SafeVarargs
	static Consumer4S of4S(Consumer4S... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4S consumer : consumers) consumer.accept4S(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4S(short, short, short, short)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Short a, Short b, Short c, Short d)
	{
		accept4S(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4S} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4S then(Consumer4<Short,Short,Short,Short> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4S(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4S} performing the operation before and this
	 * operation.
	 */
	@Override
	default Consumer4S before(Consumer4<Short,Short,Short,Short> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4S(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4S} performing the operations.
	 */
	@SafeVarargs
	static Consumer4S of(Consumer4<Short,Short,Short,Short>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4S) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<Short,Short,Short,Short> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
