package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer;
import org.barghos.util.consumer.ConsumerEx;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts one 3-dimensional double array input
 * arguments and returns no result. Unlike {@link ConsumerDA3} this may throw
 * exceptions. {@link ConsumerExDA3} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double[][][])}
 * 
 * @see ConsumerDA3
 * @see ConsumerExDA3
 * @see Consumer2DA3
 * @see ConsumerEx2DA3
 * @see Consumer3DA3
 * @see ConsumerEx3DA3
 * @see Consumer4DA3
 * @see ConsumerEx4DA3
 */
@FunctionalInterface
public interface ConsumerExDA3 extends ConsumerEx<double[][][]>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptD(double[][][] a) throws Exception;

	@Override
	default void accept(double[][][] a) throws Exception
	{
		acceptD(a);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerExDA3} performing this operation and the
	 * operation after.
	 */
	default ConsumerExDA3 then(ConsumerExDA3 after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a) -> { acceptD(a); after.acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExDA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA3 then(ConsumerEx<? super double[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptD(a); after.accept(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA3 then(java.util.function.Consumer<? super double[][][]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a) -> { acceptD(a); after.accept(a); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerExDA3} performing the operation before and
	 * this operation.
	 */
	default ConsumerExDA3 before(ConsumerExDA3 before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a) -> { before.acceptD(a); acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerExDA3} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerExDA3 before(ConsumerEx<? super double[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptD(a); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerBigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerExDA3 before(java.util.function.Consumer<? super double[][][]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a) -> { before.accept(a); acceptD(a); };
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
	default ConsumerDA3 handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a) -> {
			try
			{
				acceptD(a);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default ConsumerDA3 ignoreEx()
	{
		return (a) -> {
			try
			{
				acceptD(a);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerExDA3 onEx(ConsumerExDA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptD(a);
			}
			catch(Exception e)
			{
				consumer.acceptD(a);
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
	default ConsumerExDA3 onEx(ConsumerEx<? super double[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptD(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	default ConsumerDA3 onEx(ConsumerDA3 consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptD(a);
			}
			catch(Exception e)
			{
				consumer.acceptD(a);
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
	default ConsumerDA3 onEx(Consumer<? super double[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptD(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	@Override
	default ConsumerDA3 onEx(java.util.function.Consumer<? super double[][][]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a) -> {
			try
			{
				acceptD(a);
			}
			catch(Exception e)
			{
				consumer.accept(a);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerExDA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExDA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExDA3 of(ConsumerExDA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a) -> { for(ConsumerExDA3 consumer : consumers) consumer.acceptD(a); };
	}

	/**
	 * Composes a new {@link ConsumerExDA3} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerExDA3} performing the operations.
	 */
	@SafeVarargs
	static ConsumerExDA3 of(ConsumerEx<? super double[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExDA3) consumers[0]::accept;

		return (a) -> { for(ConsumerEx<? super double[][][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExDA3 of(ConsumerDA3... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExDA3) consumers[0]::accept;

		return (a) -> { for(ConsumerDA3 consumer : consumers) consumer.accept(a); };
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
	static ConsumerExDA3 of(Consumer<? super double[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExDA3) consumers[0]::accept;

		return (a) -> { for(Consumer<? super double[][][]> consumer : consumers) consumer.accept(a); };
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
	static ConsumerExDA3 of(java.util.function.Consumer<? super double[][][]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_) -> {};

		if(consumers.length == 1) return (ConsumerExDA3) consumers[0]::accept;

		return (a) -> { for(java.util.function.Consumer<? super double[][][]> consumer : consumers) consumer.accept(a); };
	}
	
}
