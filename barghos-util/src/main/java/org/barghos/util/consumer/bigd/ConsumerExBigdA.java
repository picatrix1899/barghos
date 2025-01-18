package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link ConsumerBigdA}
 * this may throw exceptions. {@link ConsumerExBigdA} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigd(BigDecimal[])}
 * 
 * @see ConsumerBigdA
 * @see ConsumerExBigdA
 * @see Consumer2BigdA
 * @see ConsumerEx2BigdA
 * @see Consumer3BigdA
 * @see ConsumerEx3BigdA
 * @see Consumer4BigdA
 * @see ConsumerEx4BigdA
 */
@FunctionalInterface
public interface ConsumerExBigdA extends ConsumerEx<BigDecimal[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigd(BigDecimal[] a) throws Exception;
	
	@Override
	default void accept(BigDecimal[] a) throws Exception
	{
		acceptBigd(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigdA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigdA then(ConsumerExBigdA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigdA then(ConsumerEx<? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	@Override
	default ConsumerExBigdA then(Consumer<? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	@Override
	default ConsumerExBigdA then(java.util.function.Consumer<? super BigDecimal[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigd(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigdA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBigdA before(ConsumerExBigdA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBigd(a); acceptBigd(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigdA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigdA before(ConsumerEx<? super BigDecimal[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	@Override
	default ConsumerExBigdA before(Consumer<? super BigDecimal[]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.accept(a); acceptBigd(a); };
	}
	
	@Override
	default ConsumerExBigdA before(java.util.function.Consumer<? super BigDecimal[]> before)
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
	default ConsumerBigdA handleEx(ExceptionHandler handler)
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
	default ConsumerBigdA ignoreEx()
	{
		return (a) -> {
			try
			{
				acceptBigd(a);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerExBigdA onEx(ConsumerExBigdA consumer)
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
	default ConsumerExBigdA onEx(ConsumerEx<? super BigDecimal[]> consumer)
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
	
	default ConsumerBigdA onEx(ConsumerBigdA consumer)
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
	default ConsumerBigdA onEx(Consumer<? super BigDecimal[]> consumer)
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
	default ConsumerBigdA onEx(java.util.function.Consumer<? super BigDecimal[]> consumer)
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
	 * Composes a new {@link ConsumerExBigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigdA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigdA of(ConsumerExBigdA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExBigdA consumer : consumers) consumer.acceptBigd(a); };
	}

	/**
	 * Composes a new {@link ConsumerExBigdA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigdA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigdA of(ConsumerEx<? super BigDecimal[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExBigdA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super BigDecimal[]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	static ConsumerExBigdA of(ConsumerBigdA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigdA) consumers[0]::accept;

		return (a) -> { for(ConsumerBigdA consumer : consumers) consumer.accept(a); };
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
	static ConsumerExBigdA of(Consumer<? super BigDecimal[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigdA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super BigDecimal[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExBigdA of(java.util.function.Consumer<? super BigDecimal[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigdA) consumers[0]::accept;

		return (a) -> { for(java.util.function.Consumer<? super BigDecimal[]> consumer : consumers) consumer.accept(a); };
	}
	
}
