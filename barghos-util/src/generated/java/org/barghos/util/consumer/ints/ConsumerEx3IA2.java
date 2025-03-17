package org.barghos.util.consumer.ints;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional int array input
 * arguments and returns no result. Unlike {@link Consumer3IA2} this may throw
 * exceptions. {@link ConsumerEx3IA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptI(int[][], int[][], int[][])}
 * 
 * @see ConsumerIA2
 * @see ConsumerExIA2
 * @see Consumer2IA2
 * @see ConsumerEx2IA2
 * @see Consumer3IA2
 * @see ConsumerEx3IA2
 * @see Consumer4IA2
 * @see ConsumerEx4IA2
 */
@FunctionalInterface
public interface ConsumerEx3IA2 extends ConsumerEx3<int[][],int[][],int[][]>
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
	void acceptI(int[][] a, int[][] b, int[][] c) throws Exception;

	@Override
	default void accept(int[][] a, int[][] b, int[][] c) throws Exception
	{
		acceptI(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3IA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3IA2 then(ConsumerEx3IA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptI(a, b, c); after.acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3IA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3IA2 then(ConsumerEx3<? super int[][],? super int[][],? super int[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptI(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3IA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3IA2 before(ConsumerEx3IA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptI(a, b, c); acceptI(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3IA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3IA2 before(ConsumerEx3<? super int[][],? super int[][],? super int[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptI(a, b, c); };
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
	default Consumer3IA2 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptI(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3IA2 ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptI(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3IA2 onEx(ConsumerEx3IA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptI(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptI(a, b, c);
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
	default ConsumerEx3IA2 onEx(ConsumerEx3<? super int[][],? super int[][],? super int[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptI(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3IA2 onEx(Consumer3IA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptI(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptI(a, b, c);
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
	default Consumer3IA2 onEx(Consumer3<? super int[][],? super int[][],? super int[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptI(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3IA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3IA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3IA2 of(ConsumerEx3IA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3IA2 consumer : consumers) consumer.acceptI(a, b, c); };
	}

	/**
	 * Composes a new {@link ConsumerEx3IA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3IA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3IA2 of(ConsumerEx3<? super int[][],? super int[][],? super int[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3IA2) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super int[][],? super int[][],? super int[][]> consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3IA2 of(Consumer3IA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3IA2) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3IA2 consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3IA2 of(Consumer3<? super int[][],? super int[][],? super int[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3IA2) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super int[][],? super int[][],? super int[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
