package org.barghos.util.consumer;

import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one input argument and returns no
 * result. Unlike {@link Consumer} this may throw exceptions. {@link ConsumerEx}
 * is expected to operate via side-effects.
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
public interface ConsumerEx<A>
{
	/**
	 * Performs the operation on the given argument.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void accept(A a) throws Exception;
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx<A> then(ConsumerEx<? super A> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { accept(a); after.accept(a); };
	}
	
	default ConsumerEx<A> then(Consumer<? super A> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { accept(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx} performing the operation before and this
	 * operation.
	 */
	default ConsumerEx<A> before(ConsumerEx<? super A> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.accept(a); accept(a); };
	}
	
	default ConsumerEx<A> before(Consumer<? super A> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.accept(a); accept(a); };
	}
	
	/**
	 * Adds exception handling to the consumer and thus converts it into a
	 * {@link Consumer}.
	 * 
	 * @param handler The exception handler called in case of an exception.
	 * 
	 * @return A new {@link Consumer} performing the operations and exception
	 * handling.
	 */
	default Consumer<A> handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a) -> {
			try
			{
				accept(a);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	default Consumer<A> ignoreEx()
	{
		return (a) -> {
			try
			{
				accept(a);
			}
			catch(Exception e) { }
		};
	}
	
	/**
	 * Performs the passed operation in case of an exception in this consumer.
	 * As the passed consumer may throw an exception the returned consumer is
	 * again a {@link ConsumerEx} relaying the exceptions of the passed
	 * consumer.
	 * 
	 * @param consumer The consumer called in case of an exception.
	 * 
	 * @return A new {@link ConsumerEx} performing the operations.
	 */
	default ConsumerEx<A> onEx(ConsumerEx<? super A> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				accept(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	/**
	 * Performs the passed operation in case of an exception in this consumer.
	 * As the passed consumer can not throw an exception the returned consumer
	 * is a {@link Consumer}.
	 * 
	 * @param consumer The consumer called in case of an exception.
	 * 
	 * @return A new {@link Consumer} performing the operations.
	 */
	default Consumer<A> onEx(Consumer<? super A> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				accept(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx} performing the given operations in
	 * sequence.
	 * 
	 * @param <A> The type of the first argument to the operation.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx} performing the operations.
	 */
	@SuppressWarnings("unchecked")
	@SafeVarargs
	static <A> ConsumerEx<A> of(ConsumerEx<? super A>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};
		
		if(consumers.length == 1) return (ConsumerEx<A>)consumers[0];
		
		return (a) -> { for(ConsumerEx<? super A> consumer : consumers) consumer.accept(a); };
	}
}
