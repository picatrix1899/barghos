package templates.consumer;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 2-dimensional boolean array input
 * arguments and returns no result. Unlike {@link Consumer3BoA2} this may throw
 * exceptions. {@link ConsumerEx3BoA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[][], boolean[][], boolean[][])}
 * 
 * @see ConsumerBoA2
 * @see ConsumerExBoA2
 * @see Consumer2BoA2
 * @see ConsumerEx2BoA2
 * @see Consumer3BoA2
 * @see ConsumerEx3BoA2
 * @see Consumer4BoA2
 * @see ConsumerEx4BoA2
 */
@FunctionalInterface
public interface ConsumerEx3BoA2 extends ConsumerEx3<boolean[][],boolean[][],boolean[][]>
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
	void acceptBo(boolean[][] a, boolean[][] b, boolean[][] c) throws Exception;

	@Override
	default void accept(boolean[][] a, boolean[][] b, boolean[][] c) throws Exception
	{
		acceptBo(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BoA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BoA2 then(ConsumerEx3BoA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBo(a, b, c); after.acceptBo(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BoA2 then(ConsumerEx3<? super boolean[][],? super boolean[][],? super boolean[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBo(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BoA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3BoA2 before(ConsumerEx3BoA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBo(a, b, c); acceptBo(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BoA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BoA2 before(ConsumerEx3<? super boolean[][],? super boolean[][],? super boolean[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBo(a, b, c); };
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
	default Consumer3BoA2 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptBo(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3BoA2 ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptBo(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3BoA2 onEx(ConsumerEx3BoA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBo(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptBo(a, b, c);
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
	default ConsumerEx3BoA2 onEx(ConsumerEx3<? super boolean[][],? super boolean[][],? super boolean[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBo(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3BoA2 onEx(Consumer3BoA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBo(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptBo(a, b, c);
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
	default Consumer3BoA2 onEx(Consumer3<? super boolean[][],? super boolean[][],? super boolean[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBo(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BoA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx3BoA2 of(ConsumerEx3BoA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3BoA2 consumer : consumers) consumer.acceptBo(a, b, c); };
	}

	/**
	 * Composes a new {@link ConsumerEx3BoA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BoA2} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx3BoA2 of(ConsumerEx3<? super boolean[][],? super boolean[][],? super boolean[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BoA2) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super boolean[][],? super boolean[][],? super boolean[][]> consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3BoA2 of(Consumer3BoA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BoA2) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3BoA2 consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3BoA2 of(Consumer3<? super boolean[][],? super boolean[][],? super boolean[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BoA2) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super boolean[][],? super boolean[][],? super boolean[][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
