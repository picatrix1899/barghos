package templates.consumer;

import org.barghos.util.consumer.Consumer2;
import org.barghos.util.consumer.bigd.Consumer2Bigd;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two char input arguments and returns
 * no result. {@link Consumer2C} is expected to operate via side-effects.
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
public interface Consumer2C extends Consumer2<Character,Character>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptC(char a, char b);
	
	@Override
	default void accept(Character a, Character b)
	{
		acceptC(a, b);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer2C} performing this operation and the
	 * operation after.
	 */
	default Consumer2C then(Consumer2C after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptC(a, b); after.acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2C} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2C then(Consumer2<? super Character,? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2C} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer2C then(java.util.function.BiConsumer<? super Character,? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	@Override
	default Consumer2C andThen(java.util.function.BiConsumer<? super Character,? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b) -> { acceptC(a, b); after.accept(a, b); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer2C} performing the operation before and
	 * this operation.
	 */
	default Consumer2C before(Consumer2C before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.acceptC(a, b); acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2C} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2C before(Consumer2<? super Character,? super Character> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b) -> { before.accept(a, b); acceptC(a, b); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer2C} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer2C before(java.util.function.BiConsumer<? super Character,? super Character> before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b) -> { before.accept(a, b); acceptC(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2C} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2C of(Consumer2C... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b) -> { for(Consumer2C consumer : consumers) consumer.acceptC(a, b); };
	}

	/**
	 * Composes a new {@link Consumer2C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2C} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2C of(Consumer2<? super Character,? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2C) consumers[0]::accept;
		
		return (a, b) -> { for(Consumer2<? super Character,? super Character> consumer : consumers) consumer.accept(a, b); };
	}
	
	/**
	 * Composes a new {@link Consumer2Bigd} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer2Bigd} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer2C of(java.util.function.BiConsumer<? super Character,? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);
		
		if(consumers.length == 0) return (a, b) -> {};

		if(consumers.length == 1) return (Consumer2C)consumers[0]::accept;
		
		return (a, b) -> { for(java.util.function.BiConsumer<? super Character,? super Character> consumer : consumers) consumer.accept(a, b); };
	}
	
}
