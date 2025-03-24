package org.barghos.util.consumer;

import org.barghos.validation.Validate;

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
	default Consumer2<A,B> then(Consumer2<? super A,? super B> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
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
		Validate.Arg.checkNotNull("after", after);
		
		return then(after::accept);
	}
	
	@Override
	default Consumer2<A,B> andThen(java.util.function.BiConsumer<? super A,? super B> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return then(after::accept);
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2} performing the operation before and this
	 * operation.
	 */
	default Consumer2<A,B> before(Consumer2<? super A,? super B> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return before(before::accept);
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
		Validate.Arg.checkNotNull("before", before);
		
		return before(before::accept);
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
	@SafeVarargs
	static <A,B> Consumer2<A,B> of(Consumer2<? super A,? super B>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};
		
		if(consumers.length == 1) return (Consumer2<A,B>)consumers[0];
		
		return (a, b) -> { for(Consumer2<? super A,? super B> consumer : consumers)consumer.accept(a, b); };
	}
}
