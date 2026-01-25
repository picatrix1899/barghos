package org.barghos.util.consumer.longs;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two long input arguments and returns
 * no result. {@link Consumer2L} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptL(long, long)}
 * 
 * @see ConsumerL
 * @see ConsumerExL
 * @see Consumer2L
 * @see ConsumerEx2L
 * @see Consumer3L
 * @see ConsumerEx3L
 * @see Consumer4L
 * @see ConsumerEx4L
 */
@FunctionalInterface
public interface Consumer2L extends Consumer2<Long,Long>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptL(long a, long b);
	
	@Override
	default void accept(Long a, Long b)
	{
		acceptL(a, b);
	}
}
