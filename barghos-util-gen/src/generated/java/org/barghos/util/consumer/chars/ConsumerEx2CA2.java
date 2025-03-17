package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 2-dimensional char array input
 * arguments and returns no result. Unlike {@link Consumer2CA2} this may throw
 * exceptions. {@link ConsumerEx2CA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[][], char[][])}
 * 
 * @see ConsumerCA2
 * @see ConsumerExCA2
 * @see Consumer2CA2
 * @see ConsumerEx2CA2
 * @see Consumer3CA2
 * @see ConsumerEx3CA2
 * @see Consumer4CA2
 * @see ConsumerEx4CA2
 */
@FunctionalInterface
public interface ConsumerEx2CA2 extends ConsumerEx2<char[][],char[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptC(char[][] a, char[][] b) throws Exception;
	
	@Override
	default void accept(char[][] a, char[][] b) throws Exception
	{
		acceptC(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2CA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2CA2 then(ConsumerEx2CA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptC(a, b); after.acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2CA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2CA2 then(ConsumerEx2<? super char[][],? super char[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2CA2 then(java.util.function.BiConsumer<? super char[][],? super char[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2CA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2CA2 before(ConsumerEx2CA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptC(a, b); acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2CA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2CA2 before(ConsumerEx2<? super char[][],? super char[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerEx2CA2 before(java.util.function.BiConsumer<? super char[][],? super char[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptC(a, b); };
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
	default Consumer2CA2 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer2CA2 ignoreEx()
	{
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx2CA2 onEx(ConsumerEx2CA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptC(a, b);
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
	default ConsumerEx2CA2 onEx(ConsumerEx2<? super char[][],? super char[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	default Consumer2CA2 onEx(Consumer2CA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptC(a, b);
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
	default Consumer2CA2 onEx(Consumer2<? super char[][], ? super char[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	@Override
	default Consumer2CA2 onEx(java.util.function.BiConsumer<? super char[][],? super char[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx2CA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2CA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2CA2 of(ConsumerEx2CA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2CA2 consumer : consumers) consumer.acceptC(a, b); };
	}

	/**
	 * Composes a new {@link ConsumerEx2CA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2CA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2CA2 of(ConsumerEx2<? super char[][],? super char[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (ConsumerEx2CA2) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super char[][],? super char[][]> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2CA2 of(Consumer2CA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (ConsumerEx2CA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2CA2 consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2CA2 of(Consumer2<? super char[][],? super char[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (ConsumerEx2CA2) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super char[][],? super char[][]> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2CA2 of(java.util.function.BiConsumer<? super char[][],? super char[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (ConsumerEx2CA2) consumers[0]::accept;

		return (a, b) -> { for(java.util.function.BiConsumer<? super char[][],? super char[][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
