package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer2Bigd}
 * this may throw exceptions. {@link ConsumerEx2Bigd} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2Bigd(BigDecimal, BigDecimal)}
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
public interface ConsumerEx2Bigd extends ConsumerEx2<BigDecimal,BigDecimal>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigd(BigDecimal a, BigDecimal b) throws Exception;
	
	@Override
	default void accept(BigDecimal a, BigDecimal b) throws Exception
	{
		acceptBigd(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2Bigd then(ConsumerEx2Bigd after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2Bigd then(ConsumerEx2<? super BigDecimal,? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2Bigd then(Consumer2Bigd after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.acceptBigd(a, b); };
	}
	
	@Override
	default ConsumerEx2Bigd then(Consumer2<? super BigDecimal,? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	@Override
	default ConsumerEx2Bigd then(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2Bigd before(ConsumerEx2Bigd before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigd(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2Bigd before(ConsumerEx2<? super BigDecimal,? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2Bigd before(Consumer2Bigd before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigd(a, b); acceptBigd(a, b); };
	}
	
	@Override
	default ConsumerEx2Bigd before(Consumer2<? super BigDecimal,? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
	}
	
	@Override
	default ConsumerEx2Bigd before(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
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
	default Consumer2Bigd handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b) -> {
			try
			{
				acceptBigd(a, b);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer2Bigd ignoreEx()
	{
		return (a, b) -> {
			try
			{
				acceptBigd(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx2Bigd onEx(ConsumerEx2Bigd consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigd(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptBigd(a, b);
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
	default ConsumerEx2Bigd onEx(ConsumerEx2<? super BigDecimal,? super BigDecimal> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigd(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	default Consumer2Bigd onEx(Consumer2Bigd consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigd(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptBigd(a, b);
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
	default Consumer2Bigd onEx(Consumer2<? super BigDecimal, ? super BigDecimal> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigd(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	@Override
	default Consumer2Bigd onEx(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigd(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
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
	static ConsumerEx2Bigd of(ConsumerEx2Bigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2Bigd consumer : consumers) consumer.acceptBigd(a, b); };
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
	static ConsumerEx2Bigd of(ConsumerEx2<? super BigDecimal,? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2Bigd) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super BigDecimal,? super BigDecimal> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	static ConsumerEx2Bigd of(Consumer2Bigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2Bigd) consumers[0]::accept;

		return (a, b) -> { for(Consumer2Bigd consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2Bigd of(Consumer2<? super BigDecimal,? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2Bigd) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super BigDecimal,? super BigDecimal> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2Bigd of(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2Bigd) consumers[0]::accept;

		return (a, b) -> { for(java.util.function.BiConsumer<? super BigDecimal,? super BigDecimal> consumer : consumers) consumer.accept(a, b); };
	}
	
}
