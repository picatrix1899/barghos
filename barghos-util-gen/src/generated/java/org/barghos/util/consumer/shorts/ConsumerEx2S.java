package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional short array input
 * arguments and returns no result. Unlike {@link Consumer2S} this may throw
 * exceptions. {@link ConsumerEx2S} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short, short)}
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface ConsumerEx2S extends ConsumerEx2<Short,Short>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptS(short a, short b) throws Exception;
	
	@Override
	default void accept(Short a, Short b) throws Exception
	{
		acceptS(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2S} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2S then(ConsumerEx2S after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptS(a, b); after.acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2S} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2S then(ConsumerEx2<? super Short,? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptS(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2S then(java.util.function.BiConsumer<? super Short,? super Short> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptS(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2S} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2S before(ConsumerEx2S before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptS(a, b); acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2S} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2S before(ConsumerEx2<? super Short,? super Short> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptS(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerEx2S before(java.util.function.BiConsumer<? super Short,? super Short> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptS(a, b); };
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
	default Consumer2S handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b) -> {
			try
			{
				acceptS(a, b);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer2S ignoreEx()
	{
		return (a, b) -> {
			try
			{
				acceptS(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx2S onEx(ConsumerEx2S consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptS(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptS(a, b);
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
	default ConsumerEx2S onEx(ConsumerEx2<? super Short,? super Short> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptS(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	default Consumer2S onEx(Consumer2S consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptS(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptS(a, b);
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
	default Consumer2S onEx(Consumer2<? super Short, ? super Short> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptS(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	@Override
	default Consumer2S onEx(java.util.function.BiConsumer<? super Short,? super Short> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptS(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx2S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2S} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2S of(ConsumerEx2S... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2S consumer : consumers) consumer.acceptS(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2S} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2S} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2S of(ConsumerEx2<? super Short,? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (ConsumerEx2S) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super Short,? super Short> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2S of(Consumer2S... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (ConsumerEx2S) consumers[0]::accept;

		return (a, b) -> { for(Consumer2S consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2S of(Consumer2<? super Short,? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (ConsumerEx2S) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super Short,? super Short> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2S of(java.util.function.BiConsumer<? super Short,? super Short>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _) -> {};

		if(consumers.length == 1) return (ConsumerEx2S) consumers[0]::accept;

		return (a, b) -> { for(java.util.function.BiConsumer<? super Short,? super Short> consumer : consumers) consumer.accept(a, b); };
	}
	
}
