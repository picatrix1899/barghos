package org.barghos.util.consumer.objs;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional Object array input
 * arguments and returns no result. Unlike {@link ConsumerO} this may throw
 * exceptions. {@link ConsumerExO} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptO(Object)}
 * 
 * @see ConsumerO
 * @see ConsumerExO
 * @see Consumer2O
 * @see ConsumerEx2O
 * @see Consumer3O
 * @see ConsumerEx3O
 * @see Consumer4O
 * @see ConsumerEx4O
 */
@FunctionalInterface
public interface ConsumerExO extends ConsumerEx<Object>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptO(Object a) throws Exception;

	@Override
	default void accept(Object a) throws Exception
	{
		acceptO(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExO} performing this operation and the
	 * operation after.
	 */
	default ConsumerExO then(ConsumerExO after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptO(a); after.acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExO} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExO then(ConsumerEx<? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExO then(java.util.function.Consumer<? super Object> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptO(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExO} performing the operation before and
	 * this operation.
	 */
	default ConsumerExO before(ConsumerExO before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptO(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExO} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExO before(ConsumerEx<? super Object> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerExO before(java.util.function.Consumer<? super Object> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptO(a); };
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
	default ConsumerO handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a) -> {
			try
			{
				acceptO(a);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default ConsumerO ignoreEx()
	{
		return (a) -> {
			try
			{
				acceptO(a);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerExO onEx(ConsumerExO consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptO(a);
			}
			catch(Exception e)
			{
				consumer.acceptO(a);
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
	default ConsumerExO onEx(ConsumerEx<? super Object> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptO(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	default ConsumerO onEx(ConsumerO consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptO(a);
			}
			catch(Exception e)
			{
				consumer.acceptO(a);
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
	default ConsumerO onEx(Consumer<? super Object> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptO(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	@Override
	default ConsumerO onEx(java.util.function.Consumer<? super Object> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptO(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerExO} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExO} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExO of(ConsumerExO... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExO consumer : consumers) consumer.acceptO(a); };
	}

	/**
	 * Composes a new {@link ConsumerExO} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExO} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExO of(ConsumerEx<? super Object>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExO) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super Object> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExO of(ConsumerO... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExO) consumers[0]::accept;

		return (a) -> { for(ConsumerO consumer : consumers) consumer.accept(a); };
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
	static ConsumerExO of(Consumer<? super Object>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExO) consumers[0]::accept;

		return (a) -> { for(Consumer<? super Object> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExO of(java.util.function.Consumer<? super Object>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExO) consumers[0]::accept;

		return (a) -> { for(java.util.function.Consumer<? super Object> consumer : consumers) consumer.accept(a); };
	}
	
}
