package org.barghos.util.consumer.shorts;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two short input arguments and returns
 * no result. {@link Consumer2S} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptS(short, short)}
 * 
 * @see ConsumerS
 * @see ConsumerExS
 * @see Consumer2S
 * @see ConsumerEx2S
 * @see Consumer3S
 * @see ConsumerEx3S
 * @see Consumer4S
 * @see ConsumerEx4S
 */
@FunctionalInterface
public interface Consumer2S extends Consumer2<Short,Short>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptS(short a, short b);
	
	@Override
	default void accept(Short a, Short b)
	{
		acceptS(a, b);
	}
}
