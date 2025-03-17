package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional char array input
 * arguments and returns no result. Unlike {@link ConsumerCA2} this may throw
 * exceptions. {@link ConsumerExCA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char[][])}
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
public interface ConsumerExCA2 extends ConsumerEx<char[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptC(char[][] a) throws Exception;

	@Override
	default void accept(char[][] a) throws Exception
	{
		acceptC(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExCA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExCA2 then(ConsumerExCA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptC(a); after.acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExCA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExCA2 then(ConsumerEx<? super char[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExCA2 then(java.util.function.Consumer<? super char[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptC(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExCA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerExCA2 before(ConsumerExCA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptC(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExCA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExCA2 before(ConsumerEx<? super char[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerExCA2 before(java.util.function.Consumer<? super char[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptC(a); };
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
	default ConsumerCA2 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a) -> {
			try
			{
				acceptC(a);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default ConsumerCA2 ignoreEx()
	{
		return (a) -> {
			try
			{
				acceptC(a);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerExCA2 onEx(ConsumerExCA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptC(a);
			}
			catch(Exception e)
			{
				consumer.acceptC(a);
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
	default ConsumerExCA2 onEx(ConsumerEx<? super char[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptC(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	default ConsumerCA2 onEx(ConsumerCA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptC(a);
			}
			catch(Exception e)
			{
				consumer.acceptC(a);
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
	default ConsumerCA2 onEx(Consumer<? super char[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptC(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	@Override
	default ConsumerCA2 onEx(java.util.function.Consumer<? super char[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptC(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerExCA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExCA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExCA2 of(ConsumerExCA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExCA2 consumer : consumers) consumer.acceptC(a); };
	}

	/**
	 * Composes a new {@link ConsumerExCA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExCA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExCA2 of(ConsumerEx<? super char[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExCA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super char[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExCA2 of(ConsumerCA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExCA2) consumers[0]::accept;

		return (a) -> { for(ConsumerCA2 consumer : consumers) consumer.accept(a); };
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
	static ConsumerExCA2 of(Consumer<? super char[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExCA2) consumers[0]::accept;

		return (a) -> { for(Consumer<? super char[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExCA2 of(java.util.function.Consumer<? super char[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExCA2) consumers[0]::accept;

		return (a) -> { for(java.util.function.Consumer<? super char[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
