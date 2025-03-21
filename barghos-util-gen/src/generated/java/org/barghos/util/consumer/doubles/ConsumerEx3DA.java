package org.barghos.util.consumer.doubles;

import org.barghos.util.consumer.Consumer3;
import org.barghos.util.consumer.ConsumerEx3;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three 1-dimensional double array input
 * arguments and returns no result. Unlike {@link Consumer3DA} this may throw
 * exceptions. {@link ConsumerEx3DA} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptD(double[], double[], double[])}
 * 
 * @see ConsumerDA
 * @see ConsumerExDA
 * @see Consumer2DA
 * @see ConsumerEx2DA
 * @see Consumer3DA
 * @see ConsumerEx3DA
 * @see Consumer4DA
 * @see ConsumerEx4DA
 */
@FunctionalInterface
public interface ConsumerEx3DA extends ConsumerEx3<double[],double[],double[]>
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
	void acceptD(double[] a, double[] b, double[] c) throws Exception;

	@Override
	default void accept(double[] a, double[] b, double[] c) throws Exception
	{
		acceptD(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx3DA} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx3DA then3DA(ConsumerEx3DA after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptD(a, b, c); after.acceptD(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3DA then(ConsumerEx3<? super double[],? super double[],? super double[]> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptD(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx3DA} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx3DA before3DA(ConsumerEx3DA before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptD(a, b, c); acceptD(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx3DA} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx3DA before(ConsumerEx3<? super double[],? super double[],? super double[]> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptD(a, b, c); };
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
	default Consumer3DA handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c) -> {
			try
			{
				acceptD(a, b, c);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer3DA ignoreEx()
	{
		return (a, b, c) -> {
			try
			{
				acceptD(a, b, c);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx3DA onEx(ConsumerEx3DA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptD(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptD(a, b, c);
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
	default ConsumerEx3DA onEx(ConsumerEx3<? super double[],? super double[],? super double[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptD(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	default Consumer3DA onEx(Consumer3DA consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptD(a, b, c);
			}
			catch(Exception e)
			{
				consumer.acceptD(a, b, c);
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
	default Consumer3DA onEx(Consumer3<? super double[],? super double[],? super double[]> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c) -> {
			try
			{
				acceptD(a, b, c);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx3DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3DA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3DA of3DA(ConsumerEx3DA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(ConsumerEx3DA consumer : consumers) consumer.acceptD(a, b, c); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx3DA} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx3DA} performing the operations.
	 */
	@SafeVarargs
	static ConsumerEx3DA of(ConsumerEx3<? super double[],? super double[],? super double[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3DA) consumers[0]::accept;

		return (a, b, c) -> { for(ConsumerEx3<? super double[],? super double[],? super double[]> consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3DA of(Consumer3DA... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3DA) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3DA consumer : consumers) consumer.accept(a, b, c); };
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
	static ConsumerEx3DA of(Consumer3<? super double[],? super double[],? super double[]>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (_, _, _) -> {};

		if(consumers.length == 1) return (ConsumerEx3DA) consumers[0]::accept;

		return (a, b, c) -> { for(Consumer3<? super double[],? super double[],? super double[]> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
