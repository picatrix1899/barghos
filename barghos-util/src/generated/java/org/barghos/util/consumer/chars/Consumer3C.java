package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer3;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts three char input arguments and
 * returns no result. {@link Consumer3C} is expected to operate via
 * side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptC(char, char, char)}
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
public interface Consumer3C extends Consumer3<Character,Character,Character>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 * @param c The third input argument.
	 */
	void acceptC(char a, char b, char c);
	
	@Override
	default void accept(Character a, Character b, Character c)
	{
		acceptC(a, b, c);
	}
	
	/**
	 * Performs the given operation after this operation.
	 * 
	 * @param after The operation to perform after this operation.
	 * 
	 * @return A new {@link Consumer3C} performing this operation and the
	 * operation after.
	 */
	default Consumer3C then(Consumer3C after)
	{
		Validate.Arg.checkNotNull("after", after);
		
		return (a, b, c) -> { acceptC(a, b, c); after.acceptC(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3C} performing this operation and the
	 * operation after.
	 */
	@Override
	default Consumer3C then(Consumer3<? super Character,? super Character,? super Character> after)
	{
		Validate.Arg.checkNotNull("after", after);

		return (a, b, c) -> { acceptC(a, b, c); after.accept(a, b, c); };
	}
	
	/**
	 * Performs the given operation before this operation.
	 * 
	 * @param before The operation to perform before this operation.
	 * 
	 * @return A new {@link Consumer3C} performing the operation before and
	 * this operation.
	 */
	default Consumer3C before(Consumer3C before)
	{
		Validate.Arg.checkNotNull("before", before);
		
		return (a, b, c) -> { before.acceptC(a, b, c); acceptC(a, b, c); };
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return A new {@link Consumer3C} performing the operation before and
	 * this operation.
	 */
	@Override
	default Consumer3C before(Consumer3<? super Character,? super Character,? super Character> before)
	{
		Validate.Arg.checkNotNull("before", before);

		return (a, b, c) -> { before.accept(a, b, c); acceptC(a, b, c); };
	}
	
	/**
	 * Composes a new {@link Consumer3C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3C} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3C of(Consumer3C... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return consumers[0];
		
		return (a, b, c) -> { for(Consumer3C consumer : consumers) consumer.acceptC(a, b, c); };
	}

	/**
	 * Composes a new {@link Consumer3C} performing the given operations in
	 * sequence.
	 * 
	 * @param consumers The operations to perform.
	 * 
	 * @return A new {@link Consumer3C} performing the operations.
	 */
	@SuppressWarnings("unused")
	@SafeVarargs
	static Consumer3C of(Consumer3<? super Character,? super Character,? super Character>... consumers)
	{
		Validate.Arg.checkNotNull("consumers", consumers);
		Validate.Arg.checkEntriesNotNull("consumers", consumers);

		if(consumers.length == 0) return (a, b, c) -> {};

		if(consumers.length == 1) return (Consumer3C) consumers[0]::accept;
		
		return (a, b, c) -> { for(Consumer3<? super Character,? super Character,? super Character> consumer : consumers) consumer.accept(a, b, c); };
	}
	
}
