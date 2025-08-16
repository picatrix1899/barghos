package org.barghos.util.consumer.chars;

import org.barghos.util.consumer.Consumer2;
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
}
