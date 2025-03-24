package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result. Unlike {@link Consumer2} this may throw exceptions.
 *  {@link ConsumerEx2} is expected to operate via side-effects.
 *
 * <p>
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
public interface ConsumerEx2<A,B>
{
	/**
	 * Performs the operation on the given argument.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept(A a, B b) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2<A,B> then(ConsumerEx2<? super A,? super B> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { accept(a, b); after.accept(a, b); };
	}
	
	default ConsumerEx2<A,B> then(Consumer2<? super A,? super B> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { accept(a, b); after.accept(a, b); };
	}
	
	default ConsumerEx2<A,B> then(java.util.function.BiConsumer<? super A,? super B> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { accept(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2<A,B> before(ConsumerEx2<? super A,? super B> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept(a, b); };
	}
	
	default ConsumerEx2<A,B> before(Consumer2<? super A,? super B> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept(a, b); };
	}
	
	default ConsumerEx2<A,B> before(java.util.function.BiConsumer<? super A,? super B> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); accept(a, b); };
	}
	
	/**
	 * Adds exception handling to the consumer and thus converts it into a
	 * {@link Consumer2}.
	 * 
	 * @param handler The exception handler called in case of an exception.
	 * 
	 * @return A new {@link Consumer2} performing the operations and exception
	 * handling.
	 */
	default Consumer2<A,B> handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b) -> {
			try
			{
				accept(a, b);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	default Consumer2<A,B> ignoreEx()
	{
		return (a, b) -> {
			try
			{
				accept(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	/**
	 * Performs the passed operation in case of an exception in this consumer.
	 * As the passed consumer may throw an exception the returned consumer is
	 * again a {@link ConsumerEx2} relaying the exceptions of the passed
	 * consumer.
	 * 
	 * @param consumer The consumer called in case of an exception.
	 * 
	 * @return A new {@link ConsumerEx2} performing the operations.
	 */
	default ConsumerEx2<A,B> onEx(ConsumerEx2<? super A,? super B> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				accept(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	/**
	 * Performs the passed operation in case of an exception in this consumer.
	 * As the passed consumer can not throw an exception the returned consumer
	 * is a {@link Consumer2}.
	 * 
	 * @param consumer The consumer called in case of an exception.
	 * 
	 * @return A new {@link Consumer2} performing the operations.
	 */
	default Consumer2<A,B> onEx(Consumer2<? super A,? super B> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				accept(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	default Consumer2<A,B> onEx(java.util.function.BiConsumer<? super A,? super B> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				accept(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx2} performing the given operations in
	 * sequence.
	 * 
	 * @param <A> The type of the first argument to the operation.
	 * @param <B> The type of the second argument to the operation.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2} performing the operations.
	 */
	@SuppressWarnings("unchecked")
	@SafeVarargs
	static <A,B> ConsumerEx2<A,B> of(ConsumerEx2<? super A,? super B>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};
		
		if(consumers.length == 1) return (ConsumerEx2<A,B>)consumers[0];
		
		return (a, b) -> { for(ConsumerEx2<? super A, ? super B> consumer : consumers) consumer.accept(a, b); };
	}
}
