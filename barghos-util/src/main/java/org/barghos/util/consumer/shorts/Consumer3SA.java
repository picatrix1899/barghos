package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts three 1-dimensional short array input
 * arguments and returns no result. {@link Consumer3SA} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept3SA(short[], short[], short[])}
 * 
 * @see ConsumerSA
 * @see ConsumerExSA
 * @see Consumer2SA
 * @see ConsumerEx2SA
 * @see Consumer3SA
 * @see ConsumerEx3SA
 * @see Consumer4SA
 * @see ConsumerEx4SA
 */
@FunctionalInterface
public interface Consumer3SA extends Consumer3<short[],short[],short[]>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept3SA(short[] a, short[] b, short[] c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3SA} performing this operation and the
	 * operation after.
	 */
	default Consumer3SA then3SA(Consumer3SA after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c) -> { accept3SA(a, b, c); after.accept3SA(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3SA} performing the operation before and
	 * this operation.
	 */
	default Consumer3SA before3SA(Consumer3SA before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c) -> { before.accept3SA(a, b, c); accept3SA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3SA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3SA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3SA of3SA(Consumer3SA... consumers)
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
		
		return (a, b, c) -> { for(Consumer3SA consumer : consumers) consumer.accept3SA(a, b, c); };
	}
	
	/**
	 * @deprecated Use {@link #accept3SA(short[], short[], short[])} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(short[] a, short[] b, short[] c)
	{
		accept3SA(a, b, c);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3SA} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3SA then(Consumer3<short[],short[],short[]> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (a, b, c) -> { accept3SA(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3SA} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3SA before(Consumer3<short[],short[],short[]> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); accept3SA(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3SA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3SA} performing the operations.
	 */
	@SafeVarargs
	static Consumer3SA of(Consumer3<short[],short[],short[]>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3SA) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<short[],short[],short[]> consumer : consumers) consumer.accept(a, b, c); };
	}
}
