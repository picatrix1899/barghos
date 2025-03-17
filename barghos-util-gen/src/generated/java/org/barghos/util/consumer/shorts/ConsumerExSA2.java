package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 2-dimensional short array input
 * arguments and returns no result. Unlike {@link ConsumerSA2} this may throw
 * exceptions. {@link ConsumerExSA2} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short[][])}
 * 
 * @see ConsumerSA2
 * @see ConsumerExSA2
 * @see Consumer2SA2
 * @see ConsumerEx2SA2
 * @see Consumer3SA2
 * @see ConsumerEx3SA2
 * @see Consumer4SA2
 * @see ConsumerEx4SA2
 */
@FunctionalInterface
public interface ConsumerExSA2 extends ConsumerEx<short[][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptS(short[][] a) throws Exception;

	@Override
	default void accept(short[][] a) throws Exception
	{
		acceptS(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExSA2} performing this operation and the
	 * operation after.
	 */
	default ConsumerExSA2 then(ConsumerExSA2 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptS(a); after.acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExSA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExSA2 then(ConsumerEx<? super short[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExSA2 then(java.util.function.Consumer<? super short[][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptS(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExSA2} performing the operation before and
	 * this operation.
	 */
	default ConsumerExSA2 before(ConsumerExSA2 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptS(a); acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExSA2} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExSA2 before(ConsumerEx<? super short[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerExSA2 before(java.util.function.Consumer<? super short[][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptS(a); };
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
	default ConsumerSA2 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a) -> {
			try
			{
				acceptS(a);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default ConsumerSA2 ignoreEx()
	{
		return (a) -> {
			try
			{
				acceptS(a);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerExSA2 onEx(ConsumerExSA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptS(a);
			}
			catch(Exception e)
			{
				consumer.acceptS(a);
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
	default ConsumerExSA2 onEx(ConsumerEx<? super short[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptS(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	default ConsumerSA2 onEx(ConsumerSA2 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptS(a);
			}
			catch(Exception e)
			{
				consumer.acceptS(a);
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
	default ConsumerSA2 onEx(Consumer<? super short[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptS(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	@Override
	default ConsumerSA2 onEx(java.util.function.Consumer<? super short[][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptS(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerExSA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExSA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExSA2 of(ConsumerExSA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExSA2 consumer : consumers) consumer.acceptS(a); };
	}

	/**
	 * Composes a new {@link ConsumerExSA2} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExSA2} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExSA2 of(ConsumerEx<? super short[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExSA2) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super short[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExSA2 of(ConsumerSA2... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExSA2) consumers[0]::accept;

		return (a) -> { for(ConsumerSA2 consumer : consumers) consumer.accept(a); };
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
	static ConsumerExSA2 of(Consumer<? super short[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExSA2) consumers[0]::accept;

		return (a) -> { for(Consumer<? super short[][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExSA2 of(java.util.function.Consumer<? super short[][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExSA2) consumers[0]::accept;

		return (a) -> { for(java.util.function.Consumer<? super short[][]> consumer : consumers) consumer.accept(a); };
	}
	
}
