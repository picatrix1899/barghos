package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer4;
import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 1-dimensional int array input
 * arguments and returns no result. Unlike {@link Consumer4IA} this may throw
 * exceptions. {@link ConsumerEx4IA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int[], int[], int[], int[])}
 * 
 * @see ConsumerIA
 * @see ConsumerExIA
 * @see Consumer2IA
 * @see ConsumerEx2IA
 * @see Consumer3IA
 * @see ConsumerEx3IA
 * @see Consumer4IA
 * @see ConsumerEx4IA
 */
@FunctionalInterface
public interface ConsumerEx4IA extends ConsumerEx4<int[],int[],int[],int[]>
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
	void acceptI(int[] a, int[] b, int[] c, int[] d) throws Exception;

	@Override
	default void accept(int[] a, int[] b, int[] c, int[] d) throws Exception
	{
		acceptI(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4IA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4IA then(ConsumerEx4IA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptI(a, b, c, d); after.acceptI(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4IA then(ConsumerEx4<? super int[],? super int[],? super int[],? super int[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptI(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4IA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4IA before(ConsumerEx4IA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptI(a, b, c, d); acceptI(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4IA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4IA before(ConsumerEx4<? super int[],? super int[],? super int[],? super int[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptI(a, b, c, d); };
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
	default Consumer4IA handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c, d) -> {
			try
			{
				acceptI(a, b, c, d);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer4IA ignoreEx()
	{
		return (a, b, c, d) -> {
			try
			{
				acceptI(a, b, c, d);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx4IA onEx(ConsumerEx4IA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptI(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.acceptI(a, b, c, d);
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
	default ConsumerEx4IA onEx(ConsumerEx4<? super int[],? super int[],? super int[],? super int[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptI(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	default Consumer4IA onEx(Consumer4IA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptI(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.acceptI(a, b, c, d);
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
	default Consumer4IA onEx(Consumer4<? super int[],? super int[],? super int[],? super int[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptI(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx4IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4IA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4IA of(ConsumerEx4IA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4IA consumer : consumers) consumer.acceptI(a, b, c, d); };
	}

	/**
	 * Composes a new {@link ConsumerEx4IA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4IA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4IA of(ConsumerEx4<? super int[],? super int[],? super int[],? super int[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx4IA) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<? super int[],? super int[],? super int[],? super int[]> consumer : consumers) consumer.accept(a, b, c, d); };
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
	static ConsumerEx4IA of(Consumer4IA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx4IA) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4IA consumer : consumers) consumer.accept(a, b, c, d); };
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
	static ConsumerEx4IA of(Consumer4<? super int[],? super int[],? super int[],? super int[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx4IA) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super int[],? super int[],? super int[],? super int[]> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
