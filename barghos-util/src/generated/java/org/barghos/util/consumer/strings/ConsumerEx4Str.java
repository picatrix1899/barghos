package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer4;
import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 1-dimensional String array input
 * arguments and returns no result. Unlike {@link Consumer4Str} this may throw
 * exceptions. {@link ConsumerEx4Str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String, String, String, String)}
 * 
 * @see ConsumerStr
 * @see ConsumerExStr
 * @see Consumer2Str
 * @see ConsumerEx2Str
 * @see Consumer3Str
 * @see ConsumerEx3Str
 * @see Consumer4Str
 * @see ConsumerEx4Str
 */
@FunctionalInterface
public interface ConsumerEx4Str extends ConsumerEx4<String,String,String,String>
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
	void acceptStr(String a, String b, String c, String d) throws Exception;

	@Override
	default void accept(String a, String b, String c, String d) throws Exception
	{
		acceptStr(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4Str} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4Str then(ConsumerEx4Str after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptStr(a, b, c, d); after.acceptStr(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Str then(ConsumerEx4<? super String,? super String,? super String,? super String> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptStr(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4Str} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4Str before(ConsumerEx4Str before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptStr(a, b, c, d); acceptStr(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Str} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Str before(ConsumerEx4<? super String,? super String,? super String,? super String> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptStr(a, b, c, d); };
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
	default Consumer4Str handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c, d) -> {
			try
			{
				acceptStr(a, b, c, d);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer4Str ignoreEx()
	{
		return (a, b, c, d) -> {
			try
			{
				acceptStr(a, b, c, d);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx4Str onEx(ConsumerEx4Str consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptStr(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.acceptStr(a, b, c, d);
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
	default ConsumerEx4Str onEx(ConsumerEx4<? super String,? super String,? super String,? super String> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptStr(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	default Consumer4Str onEx(Consumer4Str consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptStr(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.acceptStr(a, b, c, d);
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
	default Consumer4Str onEx(Consumer4<? super String,? super String,? super String,? super String> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptStr(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx4Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Str} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4Str of(ConsumerEx4Str... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4Str consumer : consumers) consumer.acceptStr(a, b, c, d); };
	}

	/**
	 * Composes a new {@link ConsumerEx4Str} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Str} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4Str of(ConsumerEx4<? super String,? super String,? super String,? super String>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx4Str) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<? super String,? super String,? super String,? super String> consumer : consumers) consumer.accept(a, b, c, d); };
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
	static ConsumerEx4Str of(Consumer4Str... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx4Str) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4Str consumer : consumers) consumer.accept(a, b, c, d); };
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
	static ConsumerEx4Str of(Consumer4<? super String,? super String,? super String,? super String>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx4Str) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super String,? super String,? super String,? super String> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
