package org.barghos.util.consumer;

import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three input arguments and returns no
 * result. {@link Consumer3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept(Object, Object, Object)}
 *
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * @param <C> The type of the third argument to the operation.
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
public interface Consumer3<A,B,C>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void accept(A a, B b, C c);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3} performing this operation and the
	 * operation after.
	 */
	default Consumer3<A,B,C> then(Consumer3<? super A,? super B,? super C> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { accept(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3} performing the operation before and this
	 * operation.
	 */
	default Consumer3<A,B,C> before(Consumer3<? super A,? super B,? super C> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.accept(a, b, c); accept(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3} performing the given operations in
	 * sequence.
	 * 
	 * @param <A> The type of the first argument to the operation.
	 * @param <B> The type of the second argument to the operation.
	 * @param <C> The type of the third argument to the operation.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3} performing the operations.
	 */
	@SuppressWarnings("unchecked")
	@SafeVarargs
	static <A,B,C> Consumer3<A,B,C> of(Consumer3<? super A,? super B,? super C>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};
		
		if(consumers.length == 1) return (Consumer3<A,B,C>)consumers[0];
		
		return (a, b, c) -> { for(Consumer3<? super A,? super B,? super C> consumer : consumers) consumer.accept(a, b, c); };
	}
}
