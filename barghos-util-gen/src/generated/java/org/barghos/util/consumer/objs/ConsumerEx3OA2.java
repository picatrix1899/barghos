package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional Object array input
 * arguments and returns no result. Unlike {@link Consumer3OA2} this may throw
 * exceptions. {@link ConsumerEx3OA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object[][], Object[][], Object[][])}
 * 
 * @see ConsumerOA2
 * @see ConsumerExOA2
 * @see Consumer2OA2
 * @see ConsumerEx2OA2
 * @see Consumer3OA2
 * @see ConsumerEx3OA2
 * @see Consumer4OA2
 * @see ConsumerEx4OA2
 */
@FunctionalInterface
public interface ConsumerEx3OA2 extends ConsumerEx3<Object[][],Object[][],Object[][]>
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
	void acceptO(Object[][] a, Object[][] b, Object[][] c) throws Exception;

	@Override
	default void accept(Object[][] a, Object[][] b, Object[][] c) throws Exception
	{
		acceptO(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3OA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3OA2 then(ConsumerEx3OA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptO(a, b, c); after.acceptO(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3OA2 then(ConsumerEx3<? super Object[][],? super Object[][],? super Object[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptO(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3OA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3OA2 before(ConsumerEx3OA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptO(a, b, c); acceptO(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3OA2 before(ConsumerEx3<? super Object[][],? super Object[][],? super Object[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptO(a, b, c); };
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
	default Consumer3OA2 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptO(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3OA2 ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptO(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3OA2 onEx(ConsumerEx3OA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptO(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptO(a, b, c);
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
	default ConsumerEx3OA2 onEx(ConsumerEx3<? super Object[][],? super Object[][],? super Object[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptO(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3OA2 onEx(Consumer3OA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptO(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptO(a, b, c);
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
	default Consumer3OA2 onEx(Consumer3<? super Object[][],? super Object[][],? super Object[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptO(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3OA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3OA2 of(ConsumerEx3OA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3OA2 consumer : consumers) consumer.acceptO(a, b, c); };
	}

	/**
	 * Composes a new {@link ConsumerEx3OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3OA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3OA2 of(ConsumerEx3<? super Object[][],? super Object[][],? super Object[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3OA2) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super Object[][],? super Object[][],? super Object[][]> consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3OA2 of(Consumer3OA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3OA2) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3OA2 consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3OA2 of(Consumer3<? super Object[][],? super Object[][],? super Object[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3OA2) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super Object[][],? super Object[][],? super Object[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
