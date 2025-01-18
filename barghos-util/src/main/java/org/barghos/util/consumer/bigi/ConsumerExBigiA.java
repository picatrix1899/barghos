package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 1-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link ConsumerBigiA}
 * this may throw exceptions. {@link ConsumerExBigiA} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[])}
 * 
 * @see ConsumerBigiA
 * @see ConsumerExBigiA
 * @see Consumer2BigiA
 * @see ConsumerEx2BigiA
 * @see Consumer3BigiA
 * @see ConsumerEx3BigiA
 * @see Consumer4BigiA
 * @see ConsumerEx4BigiA
 */
@FunctionalInterface
public interface ConsumerExBigiA extends ConsumerEx<BigInteger[]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigi(BigInteger[] a) throws Exception;
	
	@Override
	default void accept(BigInteger[] a) throws Exception
	{
		acceptBigi(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExBigiA} performing this operation and the
	 * operation after.
	 */
	default ConsumerExBigiA then(ConsumerExBigiA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigi(a); after.acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigiA then(ConsumerEx<? super BigInteger[]> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigiA then(java.util.function.Consumer<? super BigInteger[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptBigi(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExBigiA} performing the operation before and
	 * this operation.
	 */
	default ConsumerExBigiA before(ConsumerExBigiA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptBigi(a); acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExBigiA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExBigiA before(ConsumerEx<? super BigInteger[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerExBigiA before(java.util.function.Consumer<? super BigInteger[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptBigi(a); };
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
	default ConsumerBigiA handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a) -> {
			try
			{
				acceptBigi(a);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default ConsumerBigiA ignoreEx()
	{
		return (a) -> {
			try
			{
				acceptBigi(a);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerExBigiA onEx(ConsumerExBigiA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigi(a);
			}
			catch(Exception e)
			{
				consumer.acceptBigi(a);
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
	default ConsumerExBigiA onEx(ConsumerEx<? super BigInteger[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigi(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	default ConsumerBigiA onEx(ConsumerBigiA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigi(a);
			}
			catch(Exception e)
			{
				consumer.acceptBigi(a);
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
	default ConsumerBigiA onEx(Consumer<? super BigInteger[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigi(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	@Override
	default ConsumerBigiA onEx(java.util.function.Consumer<? super BigInteger[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptBigi(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerExBigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigiA of(ConsumerExBigiA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExBigiA consumer : consumers) consumer.acceptBigi(a); };
	}

	/**
	 * Composes a new {@link ConsumerExBigiA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExBigiA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExBigiA of(ConsumerEx<? super BigInteger[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};
 
		if(consumers.length == 1) return (ConsumerExBigiA) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super BigInteger[]> consumer : consumers) consumer.accept(a); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	static ConsumerExBigiA of(ConsumerBigiA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigiA) consumers[0]::accept;

		return (a) -> { for(ConsumerBigiA consumer : consumers) consumer.accept(a); };
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
	static ConsumerExBigiA of(Consumer<? super BigInteger[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigiA) consumers[0]::accept;

		return (a) -> { for(Consumer<? super BigInteger[]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExBigiA of(java.util.function.Consumer<? super BigInteger[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a) -> {};

		if(consumers.length == 1) return (ConsumerExBigiA) consumers[0]::accept;

		return (a) -> { for(java.util.function.Consumer<? super BigInteger[]> consumer : consumers) consumer.accept(a); };
	}
	
}
