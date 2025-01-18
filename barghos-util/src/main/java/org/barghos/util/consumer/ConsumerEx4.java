package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four input arguments and returns no
 * result. Unlike {@link Consumer4} this may throw exceptions.
 * {@link ConsumerEx4} is expected to operate via side-effects.
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
public interface ConsumerEx4<A,B,C,D>
{
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept(A a, B b, C c, D d) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4<A,B,C,D> then(ConsumerEx4<? super A,? super B,? super C,? super D> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { accept(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	default ConsumerEx4<A,B,C,D> then(Consumer4<? super A,? super B,? super C,? super D> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { accept(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4<A,B,C,D> before(ConsumerEx4<? super A,? super B,? super C,? super D> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept(a, b, c, d); accept(a, b, c, d); };
	}
	
	default ConsumerEx4<A,B,C,D> before(Consumer4<? super A,? super B,? super C,? super D> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept(a, b, c, d); accept(a, b, c, d); };
	}
	
	/**
	 * Adds exception handling to the consumer and thus converts it into a
	 * {@link Consumer4}.
	 * 
	 * @param handler The exception handler called in case of an exception.
	 * 
	 * @return A new {@link Consumer4} performing the operations and exception
	 * handling.
	 */
	default Consumer4<A,B,C,D> handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c, d) -> {
			try
			{
				accept(a, b, c, d);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	default Consumer4<A,B,C,D> ignoreEx()
	{
		return (a, b, c, d) -> {
			try
			{
				accept(a, b, c, d);
			}
			catch(Exception e) { }
		};
	}
	
	/**
	 * Performs the passed operation in case of an exception in this consumer.
	 * As the passed consumer may throw an exception the returned consumer is
	 * again a {@link ConsumerEx4} relaying the exceptions of the passed
	 * consumer.
	 * 
	 * @param consumer The consumer called in case of an exception.
	 * 
	 * @return A new {@link ConsumerEx4} performing the operations.
	 */
	default ConsumerEx4<A,B,C,D> onEx(ConsumerEx4<? super A,? super B,? super C,? super D> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				accept(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	/**
	 * Performs the passed operation in case of an exception in this consumer.
	 * As the passed consumer can not throw an exception the returned consumer
	 * is a {@link Consumer4}.
	 * 
	 * @param consumer The consumer called in case of an exception.
	 * 
	 * @return A new {@link Consumer4} performing the operations.
	 */
	default Consumer4<A,B,C,D> onEx(Consumer4<? super A,? super B,? super C,? super D> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				accept(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx4} performing the given
	 * operations in sequence.
	 * 
	 * @param <A> The type of the first argument to the operation.
	 * @param <B> The type of the second argument to the operation.
	 * @param <C> The type of the third argument to the operation.
	 * @param <D> The type of the fourth argument to the operation.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4} performing the operations.
	 */
	@SuppressWarnings("unchecked")
	@SafeVarargs
	static <A,B,C,D> ConsumerEx4<A,B,C,D> of(ConsumerEx4<? super A,? super B,? super C,? super D>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		if(consumers.length == 1) return (ConsumerEx4<A,B,C,D>)consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4<? super A,? super B,? super C,? super D> consumer : consumers) consumer.accept(a, b, c, d); };
	}
}
