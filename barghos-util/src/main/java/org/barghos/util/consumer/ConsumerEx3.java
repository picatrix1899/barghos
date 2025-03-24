package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three input arguments and returns no
 * result. Unlike {@link Consumer3} this may throw exceptions.
 *  {@link ConsumerEx3} is expected to operate via side-effects.
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
public interface ConsumerEx3<A,B,C>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept(A a, B b, C c) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3<A,B,C> then(ConsumerEx3<? super A,? super B,? super C> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { accept(a, b, c); after.accept(a, b, c); };
	}
	
	default ConsumerEx3<A,B,C> then(Consumer3<? super A,? super B,? super C> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { accept(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3<A,B,C> before(ConsumerEx3<? super A,? super B,? super C> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.accept(a, b, c); accept(a, b, c); };
	}
	
	default ConsumerEx3<A,B,C> before(Consumer3<? super A,? super B,? super C> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.accept(a, b, c); accept(a, b, c); };
	}
	
	/**
	 * Adds exception handling to the consumer and thus converts it into a
	 * {@link Consumer3}.
	 * 
	 * @param handler The exception handler called in case of an exception.
	 * 
	 * @return A new {@link Consumer3} performing the operations and exception
	 * handling.
	 */
	default Consumer3<A,B,C> handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				accept(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	default Consumer3<A,B,C> ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				accept(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	/**
	 * Performs the passed operation in case of an exception in this consumer.
	 * As the passed consumer may throw an exception the returned consumer is
	 * again a {@link ConsumerEx3} relaying the exceptions of the passed
	 * consumer.
	 * 
	 * @param consumer The consumer called in case of an exception.
	 * 
	 * @return A new {@link ConsumerEx3} performing the operations.
	 */
	default ConsumerEx3<A,B,C> onEx(ConsumerEx3<? super A,? super B,? super C> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				accept(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Performs the passed operation in case of an exception in this consumer.
	 * As the passed consumer can not throw an exception the returned consumer
	 * is a {@link Consumer3}.
	 * 
	 * @param consumer The consumer called in case of an exception.
	 * 
	 * @return A new {@link Consumer3} performing the operations.
	 */
	default Consumer3<A,B,C> onEx(Consumer3<? super A,? super B,? super C> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				accept(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3} performing the given operations
	 * in sequence.
	 * 
	 * @param <A> The type of the first argument to the operation.
	 * @param <B> The type of the second argument to the operation.
	 * @param <C> The type of the third argument to the operation.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3} performing the operations.
	 */
	@SuppressWarnings("unchecked")
	@SafeVarargs
	static <A,B,C> ConsumerEx3<A,B,C> of(ConsumerEx3<? super A,? super B,? super C>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};
		
		if(consumers.length == 1) return (ConsumerEx3<A,B,C>)consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3<? super A,? super B,? super C> consumer : consumers) consumer.accept(a, b, c); };
	}
}
