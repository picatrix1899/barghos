package templates.consumer;

import org.barghos.util.consumer.Consumer4;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts four char input arguments and returns
 * no result. {@link Consumer4C} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char, char, char, char)}
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
public interface Consumer4C extends Consumer4<Character,Character,Character,Character>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 * @param d The fourth input argument.
	 */
	void acceptC(char a, char b, char c, char d);
	
	@Override
	default void accept(Character a, Character b, Character c, Character d)
	{
		acceptC(a, b, c, d);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer4C} performing this operation and the
	 * operation after.
	 */
	default Consumer4C then(Consumer4C after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptC(a, b, c, d); after.acceptC(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4C} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer4C then(Consumer4<? super Character,? super Character,? super Character,? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c, d) -> { acceptC(a, b, c, d); after.accept(a, b, c, d); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer4C} performing the operation before and
	 * this operation.
	 */
	default Consumer4C before(Consumer4C before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c, d) -> { before.acceptC(a, b, c, d); acceptC(a, b, c, d); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer4C} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer4C before(Consumer4<? super Character,? super Character,? super Character,? super Character> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c, d) -> { before.accept(a, b, c, d); acceptC(a, b, c, d); };
	}
	
	/**
	 * Composes a new {@link Consumer4C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4C} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4C of(Consumer4C... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c, d) -> { for(Consumer4C consumer : consumers) consumer.acceptC(a, b, c, d); };
	}

	/**
	 * Composes a new {@link Consumer4C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer4C} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer4C of(Consumer4<? super Character,? super Character,? super Character,? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c, d) -> {};

		if(consumers.length == 1) return (Consumer4C) consumers[0]::accept;

		return (a, b, c, d) -> { for(Consumer4<? super Character,? super Character,? super Character,? super Character> consumer : consumers) consumer.accept(a, b, c, d); };
	}
	
}
