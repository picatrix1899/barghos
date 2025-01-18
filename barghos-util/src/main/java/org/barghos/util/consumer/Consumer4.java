package org.barghos.util.consumer;

import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four input arguments and returns no
 * result. {@link Consumer4} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept(Object, Object, Object, Object)}
 *
 * @param <A> The type of the first argument to the operation.
 * @param <B> The type of the second argument to the operation.
 * @param <C> The type of the third argument to the operation.
 * @param <D> The type of the fourth argument to the operation.
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
public interface Consumer4<A,B,C,D>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void accept(A a, B b, C c, D d);
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4} performing this operation and the
	 * operation after.
	 */
	default Consumer4<A,B,C,D> then(Consumer4<? super A,? super B,? super C,? super D> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { accept(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4} performing the operation before and this
	 * operation.
	 */
	default Consumer4<A,B,C,D> before(Consumer4<? super A,? super B,? super C,? super D> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept(a, b, c, d); accept(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4} performing the given operations
	 * in sequence.
	 * 
	 * @param <A> The type of the first argument to the operation.
	 * @param <B> The type of the second argument to the operation.
	 * @param <C> The type of the third argument to the operation.
	 * @param <D> The type of the fourth argument to the operation.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4} performing the operations.
	 */
	@SuppressWarnings("unchecked")
	@SafeVarargs
	static <A,B,C,D> Consumer4<A,B,C,D> of(Consumer4<? super A,? super B,? super C,? super D>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		if(consumers.length == 1) return (Consumer4<A,B,C,D>)consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4<? super A,? super B,? super C,? super D> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
