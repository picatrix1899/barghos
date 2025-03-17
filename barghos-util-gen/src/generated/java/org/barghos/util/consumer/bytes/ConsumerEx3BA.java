package org.barghos.util.consumer.bytes;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional byte array input
 * arguments and returns no result. Unlike {@link Consumer3BA} this may throw
 * exceptions. {@link ConsumerEx3BA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptB(byte[], byte[], byte[])}
 * 
 * @see ConsumerBA
 * @see ConsumerExBA
 * @see Consumer2BA
 * @see ConsumerEx2BA
 * @see Consumer3BA
 * @see ConsumerEx3BA
 * @see Consumer4BA
 * @see ConsumerEx4BA
 */
@FunctionalInterface
public interface ConsumerEx3BA extends ConsumerEx3<byte[],byte[],byte[]>
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
	void acceptB(byte[] a, byte[] b, byte[] c) throws Exception;

	@Override
	default void accept(byte[] a, byte[] b, byte[] c) throws Exception
	{
		acceptB(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BA then3BA(ConsumerEx3BA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptB(a, b, c); after.acceptB(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BA then(ConsumerEx3<? super byte[],? super byte[],? super byte[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptB(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3BA before3BA(ConsumerEx3BA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptB(a, b, c); acceptB(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BA before(ConsumerEx3<? super byte[],? super byte[],? super byte[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptB(a, b, c); };
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
	default Consumer3BA handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptB(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3BA ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptB(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3BA onEx(ConsumerEx3BA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptB(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptB(a, b, c);
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
	default ConsumerEx3BA onEx(ConsumerEx3<? super byte[],? super byte[],? super byte[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptB(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3BA onEx(Consumer3BA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptB(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptB(a, b, c);
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
	default Consumer3BA onEx(Consumer3<? super byte[],? super byte[],? super byte[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptB(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BA of3BA(ConsumerEx3BA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3BA consumer : consumers) consumer.acceptB(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BA of(ConsumerEx3<? super byte[],? super byte[],? super byte[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3BA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super byte[],? super byte[],? super byte[]> consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3BA of(Consumer3BA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3BA) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3BA consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3BA of(Consumer3<? super byte[],? super byte[],? super byte[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3BA) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super byte[],? super byte[],? super byte[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
