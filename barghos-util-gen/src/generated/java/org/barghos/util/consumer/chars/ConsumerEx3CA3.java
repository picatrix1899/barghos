package templates.consumer;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 3-dimensional char array input
 * arguments and returns no result. Unlike {@link Consumer3CA3} this may throw
 * exceptions. {@link ConsumerEx3CA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[][][], char[][][], char[][][])}
 * 
 * @see ConsumerCA3
 * @see ConsumerExCA3
 * @see Consumer2CA3
 * @see ConsumerEx2CA3
 * @see Consumer3CA3
 * @see ConsumerEx3CA3
 * @see Consumer4CA3
 * @see ConsumerEx4CA3
 */
@FunctionalInterface
public interface ConsumerEx3CA3 extends ConsumerEx3<char[][][],char[][][],char[][][]>
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
	void acceptC(char[][][] a, char[][][] b, char[][][] c) throws Exception;

	@Override
	default void accept(char[][][] a, char[][][] b, char[][][] c) throws Exception
	{
		acceptC(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3CA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3CA3 then(ConsumerEx3CA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptC(a, b, c); after.acceptC(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3CA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3CA3 then(ConsumerEx3<? super char[][][],? super char[][][],? super char[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptC(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3CA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3CA3 before(ConsumerEx3CA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptC(a, b, c); acceptC(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3CA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3CA3 before(ConsumerEx3<? super char[][][],? super char[][][],? super char[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptC(a, b, c); };
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
	default Consumer3CA3 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptC(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3CA3 ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptC(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3CA3 onEx(ConsumerEx3CA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptC(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptC(a, b, c);
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
	default ConsumerEx3CA3 onEx(ConsumerEx3<? super char[][][],? super char[][][],? super char[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptC(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3CA3 onEx(Consumer3CA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptC(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptC(a, b, c);
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
	default Consumer3CA3 onEx(Consumer3<? super char[][][],? super char[][][],? super char[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptC(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3CA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3CA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx3CA3 of(ConsumerEx3CA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3CA3 consumer : consumers) consumer.acceptC(a, b, c); };
	}

	/**
	 * Composes a new {@link ConsumerEx3CA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3CA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx3CA3 of(ConsumerEx3<? super char[][][],? super char[][][],? super char[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3CA3) consumers[0]::accept;
		
		return (a, b, c) -> { for(ConsumerEx3<? super char[][][],? super char[][][],? super char[][][]> consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3CA3 of(Consumer3CA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3CA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3CA3 consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3CA3 of(Consumer3<? super char[][][],? super char[][][],? super char[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3CA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super char[][][],? super char[][][],? super char[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
