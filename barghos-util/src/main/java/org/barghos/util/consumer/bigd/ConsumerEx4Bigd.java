package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer4;
import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer4Bigd}
 * this may throw exceptions. {@link ConsumerEx4Bigd} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigd(BigDecimal, BigDecimal, BigDecimal, BigDecimal)}
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
public interface ConsumerEx4Bigd extends ConsumerEx4<BigDecimal,BigDecimal,BigDecimal,BigDecimal>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigd(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d) throws Exception;
	
	@Override
	default void accept(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d) throws Exception
	{
		acceptBigd(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4Bigd then(ConsumerEx4Bigd after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigd(a, b, c, d); after.acceptBigd(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Bigd then(ConsumerEx4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptBigd(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4Bigd then(Consumer4Bigd after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigd(a, b, c, d); after.acceptBigd(a, b, c, d); };
	}
	
	@Override
	default ConsumerEx4Bigd then(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBigd(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4Bigd before(ConsumerEx4Bigd before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBigd(a, b, c, d); acceptBigd(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Bigd before(ConsumerEx4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBigd(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4Bigd before(Consumer4Bigd before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBigd(a, b, c, d); acceptBigd(a, b, c, d); };
	}
	
	@Override
	default ConsumerEx4Bigd before(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBigd(a, b, c, d); };
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
	default Consumer4Bigd handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBigd(a, b, c, d);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer4Bigd ignoreEx()
	{
		return (a, b, c, d) -> {
			try
			{
				acceptBigd(a, b, c, d);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx4Bigd onEx(ConsumerEx4Bigd consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBigd(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.acceptBigd(a, b, c, d);
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
	default ConsumerEx4Bigd onEx(ConsumerEx4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBigd(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	default Consumer4Bigd onEx(Consumer4Bigd consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBigd(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.acceptBigd(a, b, c, d);
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
	default Consumer4Bigd onEx(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBigd(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx4Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4Bigd of(ConsumerEx4Bigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4Bigd consumer : consumers) consumer.acceptBigd(a, b, c, d); };
	}

	/**
	 * Composes a new {@link ConsumerEx4Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Bigd} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx4Bigd of(ConsumerEx4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4Bigd) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	static ConsumerEx4Bigd of(Consumer4Bigd... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4Bigd) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4Bigd consumer : consumers) consumer.accept(a, b, c, d); };
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
	static ConsumerEx4Bigd of(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4Bigd) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super BigDecimal,? super BigDecimal,? super BigDecimal,? super BigDecimal> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
