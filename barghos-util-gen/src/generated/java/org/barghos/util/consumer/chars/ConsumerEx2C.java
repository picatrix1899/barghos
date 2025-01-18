package templates.consumer;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.ConsumerEx2;
import org.barghos.validation.ExceptionHandler;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two 1-dimensional char array input
 * arguments and returns no result. Unlike {@link Consumer2C} this may throw
 * exceptions. {@link ConsumerEx2C} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char, char)}
 * 
 * @see ConsumerC
 * @see ConsumerExC
 * @see Consumer2C
 * @see ConsumerEx2C
 * @see Consumer3C
 * @see ConsumerEx3C
 * @see Consumer4C
 * @see ConsumerEx4C
 */
@FunctionalInterface
public interface ConsumerEx2C extends ConsumerEx2<Character,Character>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	void acceptC(char a, char b) throws Exception;
	
	@Override
	default void accept(Character a, Character b) throws Exception
	{
		acceptC(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link ConsumerEx2C} performing this operation and the
	 * operation after.
	 */
	default ConsumerEx2C then(ConsumerEx2C after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptC(a, b); after.acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2C} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2C then(ConsumerEx2<? super Character,? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2C then(java.util.function.BiConsumer<? super Character,? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link ConsumerEx2C} performing the operation before and
	 * this operation.
	 */
	default ConsumerEx2C before(ConsumerEx2C before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptC(a, b); acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link ConsumerEx2C} performing this operation and the
	 * operation after.
	 */
	@Override
	default ConsumerEx2C before(ConsumerEx2<? super Character,? super Character> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2Bigi} performing the operation before and
	 * this operation.
	 */
	@Override
	default ConsumerEx2C before(java.util.function.BiConsumer<? super Character,? super Character> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptC(a, b); };
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
	default Consumer2C handleEx(ExceptionHandler handler)
	{
		Validate.Arg.checkNotNull("handler", handler);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				handler.handle(e);
			}
		};
	}
	
	@Override
	default Consumer2C ignoreEx()
	{
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e) { }
		};
	}
	
	default ConsumerEx2C onEx(ConsumerEx2C consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptC(a, b);
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
	default ConsumerEx2C onEx(ConsumerEx2<? super Character,? super Character> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	default Consumer2C onEx(Consumer2C consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.acceptC(a, b);
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
	default Consumer2C onEx(Consumer2<? super Character, ? super Character> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	@Override
	default Consumer2C onEx(java.util.function.BiConsumer<? super Character,? super Character> consumer)
	{
		Validate.Arg.checkNotNull("consumer", consumer);
		
		return (a, b) -> {
			try
			{
				acceptC(a, b);
			}
			catch(Exception e)
			{
				consumer.accept(a, b);
			}
		};
	}
	
	/**
	 * Composes a new {@link ConsumerEx2C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2C} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2C of(ConsumerEx2C... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(ConsumerEx2C consumer : consumers) consumer.acceptC(a, b); };
	}
	
	/**
	 * Composes a new {@link ConsumerEx2C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link ConsumerEx2C} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static ConsumerEx2C of(ConsumerEx2<? super Character,? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2C) consumers[0]::accept;

		return (a, b) -> { for(ConsumerEx2<? super Character,? super Character> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2C of(Consumer2C... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2C) consumers[0]::accept;

		return (a, b) -> { for(Consumer2C consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2C of(Consumer2<? super Character,? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2C) consumers[0]::accept;

		return (a, b) -> { for(Consumer2<? super Character,? super Character> consumer : consumers) consumer.accept(a, b); };
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
	static ConsumerEx2C of(java.util.function.BiConsumer<? super Character,? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (ConsumerEx2C) consumers[0]::accept;

		return (a, b) -> { for(java.util.function.BiConsumer<? super Character,? super Character> consumer : consumers) consumer.accept(a, b); };
	}
	
}
