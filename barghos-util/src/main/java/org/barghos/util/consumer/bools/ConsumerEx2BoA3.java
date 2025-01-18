package org.barghos.util.consumer.bools;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.util.consumer.bigi.Consumer2Bigi;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 3-dimensional boolean array input
 * arguments and returns no result. Unlike {@link Consumer2BoA3} this may throw
 * exceptions. {@link ConsumerEx2BoA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean[][][], boolean[][][])}.
 * 
 * @see ConsumerBoA3
 * @see ConsumerExBoA3
 * @see Consumer2BoA3
 * @see ConsumerEx2BoA3
 * @see Consumer3BoA3
 * @see ConsumerEx3BoA3
 * @see Consumer4BoA3
 * @see ConsumerEx4BoA3
 */
@FunctionalInterface
public interface ConsumerEx2BoA3 extends ConsumerEx2<boolean[][][],boolean[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptBo(boolean[][][] a, boolean[][][] b) throws Exception;

	@Override
	default void accept(boolean[][][] a, boolean[][][] b) throws Exception
	{
		acceptBo(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2BoA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2BoA3 then(ConsumerEx2BoA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptBo(a, b); after.acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BoA3 then(ConsumerEx2<? super boolean[][][],? super boolean[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BoA3 then(java.util.function.BiConsumer<? super boolean[][][],? super boolean[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptBo(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2BoA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2BoA3 before(ConsumerEx2BoA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptBo(a, b); acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2BoA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2BoA3 before(ConsumerEx2<? super boolean[][][],? super boolean[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptBo(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerEx2BoA3 before(java.util.function.BiConsumer<? super boolean[][][],? super boolean[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptBo(a, b); };
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
	default Consumer2BoA3 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b) -> {
			try
			{
				acceptBo(a, b);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer2BoA3 ignoreEx()
	{
		return (a, b) -> {
			try
			{
				acceptBo(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx2BoA3 onEx(ConsumerEx2BoA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBo(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptBo(a, b);
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
	default ConsumerEx2BoA3 onEx(ConsumerEx2<? super boolean[][][],? super boolean[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBo(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	default Consumer2BoA3 onEx(Consumer2BoA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBo(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptBo(a, b);
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
	default Consumer2BoA3 onEx(Consumer2<? super boolean[][][], ? super boolean[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBo(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	@Override
	default Consumer2BoA3 onEx(java.util.function.BiConsumer<? super boolean[][][],? super boolean[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptBo(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx2BoA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BoA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2BoA3 of(ConsumerEx2BoA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2BoA3 consumer : consumers) consumer.acceptBo(a, b); };
	}

	/**
	 * Composes a new {@link ConsumerEx2BoA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2BoA3} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2BoA3 of(ConsumerEx2<? super boolean[][][],? super boolean[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BoA3) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super boolean[][][],? super boolean[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2BoA3 of(Consumer2BoA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BoA3) consumers[0]::accept;

		return (a, b) -> { for(Consumer2BoA3 consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2BoA3 of(Consumer2<? super boolean[][][],? super boolean[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BoA3) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super boolean[][][],? super boolean[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2BoA3 of(java.util.function.BiConsumer<? super boolean[][][],? super boolean[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2BoA3) consumers[0]::accept;

		return (a, b) -> { for(java.util.function.BiConsumer<? super boolean[][][],? super boolean[][][]> consumer : consumers) consumer.accept(a, b); };
	}
	
}
