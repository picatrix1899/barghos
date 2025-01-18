package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 3-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer2BigdA3}
 * this may throw exceptions. {@link ConsumerEx2BigdA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #accept2BigdA3(BigDecimal[][][], BigDecimal[][][])}.
 * 
 * @see ConsumerBigdA3
 * @see ConsumerExBigdA3
 * @see Consumer2BigdA3
 * @see ConsumerEx2BigdA3
 * @see Consumer3BigdA3
 * @see ConsumerEx3BigdA3
 * @see Consumer4BigdA3
 * @see ConsumerEx4BigdA3
 */
@FunctionalInterface
public interface ConsumerEx2BigdA3 extends ConsumerEx2<BigDecimal[][][],BigDecimal[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigd(BigDecimal[][][] a, BigDecimal[][][] b) throws Exception;
	
	@Override
	default void accept(BigDecimal[][][] a, BigDecimal[][][] b) throws Exception
	{
		acceptBigd(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigdA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BigdA3 then(ConsumerEx2BigdA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigdA3 then(ConsumerEx2<? super BigDecimal[][][],? super BigDecimal[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigdA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BigdA3 then(Consumer2BigdA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.acceptBigd(a, b); };
	}
	
	@Override
	default ConsumerEx2BigdA3 then(Consumer2<? super BigDecimal[][][],? super BigDecimal[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	@Override
	default ConsumerEx2BigdA3 then(java.util.function.BiConsumer<? super BigDecimal[][][],? super BigDecimal[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigd(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigdA3} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx2BigdA3 before(ConsumerEx2BigdA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigd(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigdA3 before(ConsumerEx2<? super BigDecimal[][][],? super BigDecimal[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigdA3} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx2BigdA3 before(Consumer2BigdA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigd(a, b); acceptBigd(a, b); };
	}
	
	@Override
	default ConsumerEx2BigdA3 before(Consumer2<? super BigDecimal[][][],? super BigDecimal[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBigd(a, b); };
	}
	
	@Override
	default ConsumerEx2BigdA3 before(java.util.function.BiConsumer<? super BigDecimal[][][],? super BigDecimal[][][]> before)
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
	default Consumer2BigdA3 handleEx(ExceptionHandler handler)
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
	default Consumer2BigdA3 ignoreEx()
	{
		return (a, b) -> {
			try
			{
				acceptBigd(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx2BigdA3 onEx(ConsumerEx2BigdA3 consumer)
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
	default ConsumerEx2BigdA3 onEx(ConsumerEx2<? super BigDecimal[][][],? super BigDecimal[][][]> consumer)
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
	
	default Consumer2BigdA3 onEx(Consumer2BigdA3 consumer)
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
	default Consumer2BigdA3 onEx(Consumer2<? super BigDecimal[][][], ? super BigDecimal[][][]> consumer)
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
	default Consumer2BigdA3 onEx(java.util.function.BiConsumer<? super BigDecimal[][][],? super BigDecimal[][][]> consumer)
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
	 * Composes a new {@link ConsumerEx2BigdA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BigdA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BigdA3 of(ConsumerEx2BigdA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2BigdA3 consumer : consumers) consumer.acceptBigd(a, b); };
	}

	/**
	 * Composes a new {@link ConsumerEx2BigdA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BigdA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BigdA3 of(ConsumerEx2<? super BigDecimal[][][],? super BigDecimal[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigdA3) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super BigDecimal[][][],? super BigDecimal[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	static ConsumerEx2BigdA3 of(Consumer2BigdA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigdA3) consumers[0]::accept;

		return (a, b) -> { for(Consumer2BigdA3 consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2BigdA3 of(Consumer2<? super BigDecimal[][][],? super BigDecimal[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigdA3) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super BigDecimal[][][],? super BigDecimal[][][]> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2BigdA3 of(java.util.function.BiConsumer<? super BigDecimal[][][],? super BigDecimal[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigdA3) consumers[0]::accept;

		return (a, b) -> { for(java.util.function.BiConsumer<? super BigDecimal[][][],? super BigDecimal[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
