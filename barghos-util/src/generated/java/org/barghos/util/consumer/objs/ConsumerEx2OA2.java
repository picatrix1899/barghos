package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 2-dimensional Object array input
 * arguments and returns no result. Unlike {@link Consumer2OA2} this may throw
 * exceptions. {@link ConsumerEx2OA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object[][], Object[][])}
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
public interface ConsumerEx2OA2 extends ConsumerEx2<Object[][],Object[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptO(Object[][] a, Object[][] b) throws Exception;
	
	@Override
	default void accept(Object[][] a, Object[][] b) throws Exception
	{
		acceptO(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2OA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2OA2 then(ConsumerEx2OA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptO(a, b); after.acceptO(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2OA2 then(ConsumerEx2<? super Object[][],? super Object[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptO(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2OA2 then(java.util.function.BiConsumer<? super Object[][],? super Object[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptO(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2OA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2OA2 before(ConsumerEx2OA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptO(a, b); acceptO(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2OA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2OA2 before(ConsumerEx2<? super Object[][],? super Object[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptO(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerEx2OA2 before(java.util.function.BiConsumer<? super Object[][],? super Object[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptO(a, b); };
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
	default Consumer2OA2 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b) -> {
			try
			{
				acceptO(a, b);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer2OA2 ignoreEx()
	{
		return (a, b) -> {
			try
			{
				acceptO(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx2OA2 onEx(ConsumerEx2OA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptO(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptO(a, b);
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
	default ConsumerEx2OA2 onEx(ConsumerEx2<? super Object[][],? super Object[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptO(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	default Consumer2OA2 onEx(Consumer2OA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptO(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptO(a, b);
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
	default Consumer2OA2 onEx(Consumer2<? super Object[][], ? super Object[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptO(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	@Override
	default Consumer2OA2 onEx(java.util.function.BiConsumer<? super Object[][],? super Object[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptO(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx2OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2OA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2OA2 of(ConsumerEx2OA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2OA2 consumer : consumers) consumer.acceptO(a, b); };
	}

	/**
	 * Composes a new {@link ConsumerEx2OA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2OA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2OA2 of(ConsumerEx2<? super Object[][],? super Object[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2OA2) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super Object[][],? super Object[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2OA2 of(Consumer2OA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2OA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2OA2 consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2OA2 of(Consumer2<? super Object[][],? super Object[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2OA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super Object[][],? super Object[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2OA2 of(java.util.function.BiConsumer<? super Object[][],? super Object[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2OA2) consumers[0]::accept;

		return (a, b) -> { for(java.util.function.BiConsumer<? super Object[][],? super Object[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
