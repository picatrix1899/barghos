package org.barghos.util.consumer.strings;

import org.barghos.util.consumer.Consumer2;
import org.barghos.validation.Validate;

/**
 * Represents an operation that accepts two String input arguments and returns
 * no result. {@link Consumer2Str} is expected to operate via side-effects.
 *
 * <p>
 * This is a functional interface.
 * 
 * <p>
 * Functional Method:
 * {@link #acceptStr(String, String)}
 * 
 * @see ConsumerStr
 * @see ConsumerExStr
 * @see Consumer2Str
 * @see ConsumerEx2Str
 * @see Consumer3Str
 * @see ConsumerEx3Str
 * @see Consumer4Str
 * @see ConsumerEx4Str
 */
@FunctionalInterface
public interface Consumer2Str extends Consumer2<String,String>
{
	
	/**
	 * Performs the operation on the given arguments.
	 *
	 * @param a The first input argument.
	 * @param b The second input argument.
	 */
	void acceptStr(String a, String b);
	
	@Override
	default void accept(String a, String b)
	{
		acceptStr(a, b);
	}
}
