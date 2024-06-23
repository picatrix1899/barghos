package org.barghos.util.consumer;

import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result. {@link Consumer2} is expected to operate via side-effects.
 *
 * * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept(Object, Object)}
 *
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * 
 * @see Consumer
 * @see ConsumerEx
 * @see Consumer2
 * @see ConsumerEx2
 * @see Consumer3
 * @see ConsumerEx3
 * @see Consumer4
 * @see ConsumerEx4
 */
@FunctionalInterface
public interface Consumer2<A,B> extends java.util.function.BiConsumer<A,B>
{
	/**
	 * Performs the operation on the given argument.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	@Override
	void accept(A a, B b);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2} performing this operation and the
	 * operation after.
	 */
	default Consumer2<A,B> then(Consumer2<A,B> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2} performing this operation and the
	 * operation after.
	 */
	default Consumer2<A,B> then(java.util.function.BiConsumer<? super A,? super B> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> { accept(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2} performing the operation before and this
	 * operation.
	 */
	default Consumer2<A,B> before(Consumer2<A,B> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2} performing the operation before and this
	 * operation.
	 */
	default Consumer2<A,B> before(java.util.function.BiConsumer<? super A,? super B> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept(a, b); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.BiConsumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer2<A,B> andThen(java.util.function.BiConsumer<? super A,? super B> after)
	{
		return then(after);
	}
	
	/**
	 * Composes a new {@link Consumer2} performing the given operations in
	 * sequence.
	 * 
	 * @param <A> The type of the first argument to the operation.
	 * @param <B> The type of the second argument to the operation.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2} performing the operations.
	 */
	@SuppressWarnings("unchecked")
	static <A,B> Consumer2<A,B> of(Consumer2<A,B>... consumers)
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
		
		return (a, b) -> { for(Consumer2<A,B> consumer : consumers)consumer.accept(a, b); };
	}
}
