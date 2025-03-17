package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional String array input
 * arguments and returns no result. Unlike {@link Consumer3StrA} this may throw
 * exceptions. {@link ConsumerEx3StrA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String[], String[], String[])}
 * 
 * @see ConsumerStrA
 * @see ConsumerExStrA
 * @see Consumer2StrA
 * @see ConsumerEx2StrA
 * @see Consumer3StrA
 * @see ConsumerEx3StrA
 * @see Consumer4StrA
 * @see ConsumerEx4StrA
 */
@FunctionalInterface
public interface ConsumerEx3StrA extends ConsumerEx3<String[],String[],String[]>
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
	void acceptStr(String[] a, String[] b, String[] c) throws Exception;

	@Override
	default void accept(String[] a, String[] b, String[] c) throws Exception
	{
		acceptStr(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3StrA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3StrA then3StrA(ConsumerEx3StrA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptStr(a, b, c); after.acceptStr(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3StrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3StrA then(ConsumerEx3<? super String[],? super String[],? super String[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptStr(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3StrA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3StrA before3StrA(ConsumerEx3StrA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptStr(a, b, c); acceptStr(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3StrA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3StrA before(ConsumerEx3<? super String[],? super String[],? super String[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptStr(a, b, c); };
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
	@Override
	default Consumer3StrA handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptStr(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3StrA ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptStr(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3StrA onEx(ConsumerEx3StrA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptStr(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptStr(a, b, c);
			}
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
	@Override
	default ConsumerEx3StrA onEx(ConsumerEx3<? super String[],? super String[],? super String[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptStr(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3StrA onEx(Consumer3StrA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptStr(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptStr(a, b, c);
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
	@Override
	default Consumer3StrA onEx(Consumer3<? super String[],? super String[],? super String[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptStr(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3StrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3StrA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3StrA of3StrA(ConsumerEx3StrA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3StrA consumer : consumers) consumer.acceptStr(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3StrA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3StrA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3StrA of(ConsumerEx3<? super String[],? super String[],? super String[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3StrA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super String[],? super String[],? super String[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3StrA of(Consumer3StrA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3StrA) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3StrA consumer : consumers) consumer.accept(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3StrA of(Consumer3<? super String[],? super String[],? super String[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3StrA) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super String[],? super String[],? super String[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
