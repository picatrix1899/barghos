package org.barghos.util.consumer.bigi;

import java.math.BigInteger;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 3-dimensional {@link BigInteger}
 * array input arguments and returns no result. Unlike {@link Consumer2BigiA3}
 * this may throw exceptions. {@link ConsumerEx2BigiA3} is expected to operate
 * via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBigi(BigInteger[][][], BigInteger[][][])}.
 * 
 * @see ConsumerBigiA3
 * @see ConsumerExBigiA3
 * @see Consumer2BigiA3
 * @see ConsumerEx2BigiA3
 * @see Consumer3BigiA3
 * @see ConsumerEx3BigiA3
 * @see Consumer4BigiA3
 * @see ConsumerEx4BigiA3
 */
@FunctionalInterface
public interface ConsumerEx2BigiA3 extends ConsumerEx2<BigInteger[][][],BigInteger[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBigi(BigInteger[][][] a, BigInteger[][][] b) throws Exception;
	
	@Override
	default void accept(BigInteger[][][] a, BigInteger[][][] b) throws Exception
	{
		acceptBigi(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BigiA3 then(ConsumerEx2BigiA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBigi(a, b); after.acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigiA3 then(ConsumerEx2<? super BigInteger[][][],? super BigInteger[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigiA3 then(java.util.function.BiConsumer<? super BigInteger[][][],? super BigInteger[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBigi(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing the operation before
	 * and this operation.
	 */
	default ConsumerEx2BigiA3 before(ConsumerEx2BigiA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBigi(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BigiA3 before(ConsumerEx2<? super BigInteger[][][],? super BigInteger[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBigi(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerEx2BigiA3 before(java.util.function.BiConsumer<? super BigInteger[][][],? super BigInteger[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBigi(a, b); };
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
	default Consumer2BigiA3 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b) -> {
			try
			{
				acceptBigi(a, b);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer2BigiA3 ignoreEx()
	{
		return (a, b) -> {
			try
			{
				acceptBigi(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx2BigiA3 onEx(ConsumerEx2BigiA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigi(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptBigi(a, b);
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
	default ConsumerEx2BigiA3 onEx(ConsumerEx2<? super BigInteger[][][],? super BigInteger[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigi(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	default Consumer2BigiA3 onEx(Consumer2BigiA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigi(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptBigi(a, b);
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
	default Consumer2BigiA3 onEx(Consumer2<? super BigInteger[][][], ? super BigInteger[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigi(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	@Override
	default Consumer2BigiA3 onEx(java.util.function.BiConsumer<? super BigInteger[][][],? super BigInteger[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBigi(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BigiA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BigiA3 of(ConsumerEx2BigiA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};
		
		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2BigiA3 consumer : consumers) consumer.acceptBigi(a, b); };
	}

	/**
	 * Composes a new {@link ConsumerEx2BigiA3} performing the given operations
	 * in sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BigiA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx2BigiA3 of(ConsumerEx2<? super BigInteger[][][],? super BigInteger[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigiA3) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super BigInteger[][][],? super BigInteger[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	static ConsumerEx2BigiA3 of(Consumer2BigiA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigiA3) consumers[0]::accept;

		return (a, b) -> { for(Consumer2BigiA3 consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2BigiA3 of(Consumer2<? super BigInteger[][][],? super BigInteger[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigiA3) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super BigInteger[][][],? super BigInteger[][][]> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2BigiA3 of(java.util.function.BiConsumer<? super BigInteger[][][],? super BigInteger[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BigiA3) consumers[0]::accept;

		return (a, b) -> { for(java.util.function.BiConsumer<? super BigInteger[][][],? super BigInteger[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
