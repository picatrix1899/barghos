package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts four boolean input arguments and returns
 * no result. {@link Consumer4Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept4Bo(boolean, boolean, boolean, boolean)}
 * 
 * @see ConsumerBo
 * @see ConsumerExBo
 * @see Consumer2Bo
 * @see ConsumerEx2Bo
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4Bo
 * @see ConsumerEx4Bo
 */
@FunctionalInterface
public interface Consumer4Bo extends Consumer4<Boolean,Boolean,Boolean,Boolean>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept4Bo(boolean a, boolean b, boolean c, boolean d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4Bo} performing this operation and the
	 * operation after.
	 */
	default Consumer4Bo then4Bo(Consumer4Bo after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4Bo(a, b, c, d); after.accept4Bo(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4Bo} performing the operation before and
	 * this operation.
	 */
	default Consumer4Bo before4Bo(Consumer4Bo before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept4Bo(a, b, c, d); accept4Bo(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Bo} performing the operations.
	 */
	@SafeVarargs
	static Consumer4Bo of4Bo(Consumer4Bo... consumers)
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
		
		return (a, b, c, d) -> { for(Consumer4Bo consumer : consumers) consumer.accept4Bo(a, b, c, d); };
	}
	
	/**
	 * @deprecated Use {@link #accept4Bo(boolean, boolean, boolean, boolean)}
	 * instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default void accept(Boolean a, Boolean b, Boolean c, Boolean d)
	{
		accept4Bo(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4Bo then(Consumer4<Boolean,Boolean,Boolean,Boolean> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> { accept4Bo(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4Bo} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4Bo before(Consumer4<Boolean,Boolean,Boolean,Boolean> before)
	{
		ParameterValidation.pvNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); accept4Bo(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4Bo} performing the operations.
	 */
	@SafeVarargs
	static Consumer4Bo of(Consumer4<Boolean,Boolean,Boolean,Boolean>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4Bo) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<Boolean,Boolean,Boolean,Boolean> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
