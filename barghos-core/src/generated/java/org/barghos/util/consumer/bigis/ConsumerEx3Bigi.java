package org.barghos.util.consumer.bigis;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional BigInteger array input
 * arguments and returns no result. Unlike {@link Consumer3Bigi} this may throw
 * exceptions. {@link ConsumerEx3Bigi} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger, BigInteger, BigInteger)}
 * 
 * @see ConsumerF
 * @see ConsumerExF
 * @see Consumer2F
 * @see ConsumerEx2F
 * @see Consumer3Bigi
 * @see ConsumerEx3Bigi
 * @see Consumer4F
 * @see ConsumerEx4F
 */
@FunctionalInterface
public interface ConsumerEx3Bigi extends ConsumerEx3<BigInteger,BigInteger,BigInteger>
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
	void acceptBigi(BigInteger a, BigInteger b, BigInteger c) throws Exception;
	
	@Override
	default void accept(BigInteger a, BigInteger b, BigInteger c) throws Exception
	{
		acceptBigi(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3Bigi} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3Bigi then(ConsumerEx3Bigi after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptBigi(a, b, c); after.acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3Bigi then(ConsumerEx3<? super BigInteger,? super BigInteger,? super BigInteger> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptBigi(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3Bigi} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3Bigi before(ConsumerEx3Bigi before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptBigi(a, b, c); acceptBigi(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3Bigi before(ConsumerEx3<? super BigInteger,? super BigInteger,? super BigInteger> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptBigi(a, b, c); };
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
	default Consumer3Bigi handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptBigi(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3Bigi ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptBigi(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3Bigi onEx(ConsumerEx3Bigi consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBigi(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptBigi(a, b, c);
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
	default ConsumerEx3Bigi onEx(ConsumerEx3<? super BigInteger,? super BigInteger,? super BigInteger> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBigi(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3Bigi onEx(Consumer3Bigi consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBigi(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptBigi(a, b, c);
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
	default Consumer3Bigi onEx(Consumer3<? super BigInteger,? super BigInteger,? super BigInteger> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptBigi(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3Bigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3Bigi of(ConsumerEx3Bigi... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3Bigi consumer : consumers) consumer.acceptBigi(a, b, c); };
	}

	/**
	 * Composes a new {@link ConsumerEx3Bigi} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3Bigi} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3Bigi of(ConsumerEx3<? super BigInteger,? super BigInteger,? super BigInteger>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3Bigi) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super BigInteger,? super BigInteger,? super BigInteger> consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3Bigi of(Consumer3Bigi... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3Bigi) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3Bigi consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3Bigi of(Consumer3<? super BigInteger,? super BigInteger,? super BigInteger>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3Bigi) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super BigInteger,? super BigInteger,? super BigInteger> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
