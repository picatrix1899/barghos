package org.barghos.util.consumer;

import org.barghos.validation.ParameterValidation;

/**
 * Represents an operation that accepts one input argument and returns no
 * result. {@link Consumer} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept(Object)}
 *
 * @param <A> The type of the first argument to the operation.
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
public interface Consumer<A> extends java.util.function.Consumer<A>
{
	/**
	 * Performs the operation on the given argument.
	 *
	 * @param a The first input argument.
	 */
	@Override
	void accept(A a);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer} performing this operation and the
	 * operation after.
	 */
	default Consumer<A> then(Consumer<A> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { accept(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer} performing this operation and the
	 * operation after.
	 */
	default Consumer<A> then(java.util.function.Consumer<? super A> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a) -> { accept(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer} performing the operation before and this
	 * operation.
	 */
	default Consumer<A> before(Consumer<A> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.accept(a); accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer} performing the operation before and this
	 * operation.
	 */
	default Consumer<A> before(java.util.function.Consumer<? super A> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (a) -> { before.accept(a); accept(a); };
	}
	
	/**
	 * @deprecated Use {@link #then(java.util.function.Consumer)} instead.
	 */
	@Override
	@Deprecated(since = "1.0", forRemoval = false)
	default Consumer<A> andThen(java.util.function.Consumer<? super A> after)
	{
		return then(after);
	}
	
	/**
	 * Composes a new {@link Consumer} performing the given operations in
	 * sequence.
	 * 
	 * @param <A> The type of the first argument to the operation.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer} performing the operations.
	 */
	@SafeVarargs
	public static <A> Consumer<A> of(Consumer<A>... consumers)
	{
		ParameterValidation.pvNotNull("consumers", consumers);
		ParameterValidation.pvEntriesNotNull("consumers", consumers);
		
		/*
		 * If no operations are passed return empty operation.
		 */
		if(consumers.length == 0) return (a) -> {};
		
		/*
		 * If exactly one operation is passed return the operation.
		 */
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(Consumer<A> consumer : consumers) consumer.accept(a); };
	}
}
