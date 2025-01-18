package org.barghos.util.consumer;

import org.barghos.validation.Validate;

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
	default Consumer<A> then(Consumer<? super A> after)
	{
		Validate.Arg.checkNotNull("after", after);

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
		Validate.Arg.checkNotNull("after", after);
		
		return then(after::accept);
	}
	
	@Override
	default Consumer<A> andThen(java.util.function.Consumer<? super A> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return then(after::accept);
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer} performing the operation before and this
	 * operation.
	 */
	default Consumer<A> before(Consumer<? super A> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
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
		Validate.Arg.checkNotNull("before", before);
		
		return before(before::accept);
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
	@SuppressWarnings("unchecked")
	@SafeVarargs
	public static <A> Consumer<A> of(Consumer<? super A>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};
		
		if(consumers.length == 1) return (Consumer<A>)consumers[0];
		
		return (a) -> { for(Consumer<? super A> consumer : consumers) consumer.accept(a); };
	}
}
