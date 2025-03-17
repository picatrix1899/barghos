package org.barghos.util.consumer.bigds;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional BigDecimal array input
 * arguments and returns no result. Unlike {@link ConsumerBigd} this may throw
 * exceptions. {@link ConsumerExBigd} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigd(BigDecimal)}
 * 
 * @see ConsumerBigd
 * @see ConsumerExBigd
 * @see Consumer2Bigd
 * @see ConsumerEx2Bigd
 * @see Consumer3Bigd
 * @see ConsumerEx3Bigd
 * @see Consumer4Bigd
 * @see ConsumerEx4Bigd
 */
@FunctionalInterface
public interface ConsumerExBigd extends ConsumerEx<BigDecimal>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigd(BigDecimal a) throws Exception;

	@Override
	default void accept(BigDecimal a) throws Exception
	{
		acceptBigd(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigd then(ConsumerExBigd after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigd then(ConsumerEx<? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigd then(java.util.function.Consumer<? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBigd before(ConsumerExBigd before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBigd(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigd before(ConsumerEx<? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerExBigd before(java.util.function.Consumer<? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
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
	default ConsumerBigd handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a) -> {
			try
			{
				acceptBigd(a);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default ConsumerBigd ignoreEx()
	{
		return (a) -> {
			try
			{
				acceptBigd(a);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerExBigd onEx(ConsumerExBigd consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigd(a);
			}
			catch(Exception e)
			{
				consumer.acceptBigd(a);
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
	default ConsumerExBigd onEx(ConsumerEx<? super BigDecimal> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigd(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	default ConsumerBigd onEx(ConsumerBigd consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigd(a);
			}
			catch(Exception e)
			{
				consumer.acceptBigd(a);
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
	default ConsumerBigd onEx(Consumer<? super BigDecimal> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigd(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	@Override
	default ConsumerBigd onEx(java.util.function.Consumer<? super BigDecimal> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigd(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerExBigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigd of(ConsumerExBigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExBigd consumer : consumers) consumer.acceptBigd(a); };
	}

	/**
	 * Composes a new {@link ConsumerExBigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigd of(ConsumerEx<? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExBigd) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super BigDecimal> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExBigd of(ConsumerBigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExBigd) consumers[0]::accept;

		return (a) -> { for(ConsumerBigd consumer : consumers) consumer.accept(a); };
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
	static ConsumerExBigd of(Consumer<? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExBigd) consumers[0]::accept;

		return (a) -> { for(Consumer<? super BigDecimal> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExBigd of(java.util.function.Consumer<? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExBigd) consumers[0]::accept;

		return (a) -> { for(java.util.function.Consumer<? super BigDecimal> consumer : consumers) consumer.accept(a); };
	}
	
}
