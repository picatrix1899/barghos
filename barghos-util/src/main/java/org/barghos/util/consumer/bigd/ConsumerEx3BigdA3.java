package org.barghos.util.consumer.bigd;

import java.math.BigDecimal;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 3-dimensional {@link BigDecimal}
 * array input arguments and returns no result. Unlike {@link Consumer3BigdA3}
 * this may throw exceptions. {@link ConsumerEx3BigdA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigd(BigDecimal[][][], BigDecimal[][][], BigDecimal[][][])}
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
public interface ConsumerEx3BigdA3 extends ConsumerEx3<BigDecimal[][][],BigDecimal[][][],BigDecimal[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigd(BigDecimal[][][] a, BigDecimal[][][] b, BigDecimal[][][] c) throws Exception;
	
	@Override
	default void accept(BigDecimal[][][] a, BigDecimal[][][] b, BigDecimal[][][] c) throws Exception
	{
		acceptBigd(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BigdA3 then(ConsumerEx3BigdA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigd(a, b, c); after.acceptBigd(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BigdA3 then(ConsumerEx3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBigd(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3BigdA3 then(Consumer3BigdA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigd(a, b, c); after.acceptBigd(a, b, c); };
	}
	
	@Override
	default ConsumerEx3BigdA3 then(Consumer3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigd(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx3BigdA3 before(ConsumerEx3BigdA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBigd(a, b, c); acceptBigd(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3BigdA3 before(ConsumerEx3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBigd(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx3BigdA3 before(Consumer3BigdA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBigd(a, b, c); acceptBigd(a, b, c); };
	}
	
	@Override
	default ConsumerEx3BigdA3 before(Consumer3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.accept(a, b, c); acceptBigd(a, b, c); };
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
	default Consumer3BigdA3 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptBigd(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3BigdA3 ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptBigd(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3BigdA3 onEx(ConsumerEx3BigdA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBigd(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptBigd(a, b, c);
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
	default ConsumerEx3BigdA3 onEx(ConsumerEx3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBigd(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3BigdA3 onEx(Consumer3BigdA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBigd(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptBigd(a, b, c);
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
	default Consumer3BigdA3 onEx(Consumer3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBigd(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3BigdA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BigdA3 of(ConsumerEx3BigdA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3BigdA3 consumer : consumers) consumer.acceptBigd(a, b, c); };
	}

	/**
	 * Composes a new {@link ConsumerEx3BigdA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3BigdA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3BigdA3 of(ConsumerEx3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BigdA3) consumers[0]::accept;
		
		return (a, b, c) -> { for(ConsumerEx3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	static ConsumerEx3BigdA3 of(Consumer3BigdA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BigdA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3BigdA3 consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3BigdA3 of(Consumer3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (ConsumerEx3BigdA3) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super BigDecimal[][][],? super BigDecimal[][][],? super BigDecimal[][][]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
