package templates.consumer;

import org.barghos.util.consumer.Consumer4;
import org.barghos.util.consumer.ConsumerEx4;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four 1-dimensional boolean array input
 * arguments and returns no result. Unlike {@link Consumer4Bo} this may throw
 * exceptions. {@link ConsumerEx4Bo} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptBo(boolean, boolean, boolean, boolean)}
 * 
 * @see ConsumerBo
 * @see ConsumerExBo
 * @see Consumer2Bo
 * @see ConsumerEx2Bo
 * @see Consumer3Bo
 * @see ConsumerEx3Bo
 * @see Consumer4Bo
 * @see ConsumerEx4Bo
 */
@FunctionalInterface
public interface ConsumerEx4Bo extends ConsumerEx4<Booolean,Booolean,Booolean,Booolean>
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
	void acceptBo(boolean a, boolean b, boolean c, boolean d) throws Exception;

	@Override
	default void accept(Booolean a, Booolean b, Booolean c, Booolean d) throws Exception
	{
		acceptBo(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bo} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx4Bo then(ConsumerEx4Bo after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptBo(a, b, c, d); after.acceptBo(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Bo then(ConsumerEx4<? super Booolean,? super Booolean,? super Booolean,? super Booolean> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c, d) -> { acceptBo(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx4Bo} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx4Bo before(ConsumerEx4Bo before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptBo(a, b, c, d); acceptBo(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx4Bo} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx4Bo before(ConsumerEx4<? super Booolean,? super Booolean,? super Booolean,? super Booolean> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptBo(a, b, c, d); };
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
	default Consumer4Bo handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBo(a, b, c, d);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer4Bo ignoreEx()
	{
		return (a, b, c, d) -> {
			try
			{
				acceptBo(a, b, c, d);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx4Bo onEx(ConsumerEx4Bo consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBo(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.acceptBo(a, b, c, d);
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
	default ConsumerEx4Bo onEx(ConsumerEx4<? super Booolean,? super Booolean,? super Booolean,? super Booolean> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBo(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	default Consumer4Bo onEx(Consumer4Bo consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBo(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.acceptBo(a, b, c, d);
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
	default Consumer4Bo onEx(Consumer4<? super Booolean,? super Booolean,? super Booolean,? super Booolean> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b, c, d) -> {
			try
			{
				acceptBo(a, b, c, d);
			}
			catch(Exception e)
			{
				consumer.accept(a, b, c, d);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx4Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Bo} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx4Bo of(ConsumerEx4Bo... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(ConsumerEx4Bo consumer : consumers) consumer.acceptBo(a, b, c, d); };
	}

	/**
	 * Composes a new {@link ConsumerEx4Bo} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx4Bo} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx4Bo of(ConsumerEx4<? super Booolean,? super Booolean,? super Booolean,? super Booolean>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4Bo) consumers[0]::accept;

		return (a, b, c, d) -> { for(ConsumerEx4<? super Booolean,? super Booolean,? super Booolean,? super Booolean> consumer : consumers) consumer.accept(a, b, c, d); };
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
	static ConsumerEx4Bo of(Consumer4Bo... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4Bo) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4Bo consumer : consumers) consumer.accept(a, b, c, d); };
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
	static ConsumerEx4Bo of(Consumer4<? super Booolean,? super Booolean,? super Booolean,? super Booolean>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (ConsumerEx4Bo) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super Booolean,? super Booolean,? super Booolean,? super Booolean> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
