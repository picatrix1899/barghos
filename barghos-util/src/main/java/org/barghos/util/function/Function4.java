package org.barghos.util.function;

import org.barghos.validation.ParameterValidation;

/**
 * Represents a function that accepts four arguments and returns a result.
 * 
 * <p>
 * This is a functional interface
 * whose functional method is {@link #apply(Object, Object, Object, Object)}.
 * 
 * @param <A> The type of the first parameter.
 * @param <B> The type of the second parameter.
 * @param <C> The type of the third parameter.
 * @param <D> The type of the fourth parameter.
 * @param <T> The return type.
 * 
 * @see Function
 * @see FunctionEx
 * @see Function2
 * @see FunctionEx2
 * @see Function3
 * @see FunctionEx3
 * @see Function4
 * @see FunctionEx4
 */
@FunctionalInterface
public interface Function4<A,B,C,D,T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * @param c The third parameter.
	 * @param d The fourth parameter.
	 * 
	 * @return The result of the function.
	 */
	T apply(A a, B b, C c, D d);
	
	/**
	 * Returns a composed function that first applies this function to
	 * its input, and then applies the {@code after} function to the result.
	 * If evaluation of either function throws an exception, it is relayed to
	 * the caller of the composed function.
	 *
	 * @param <V> The type of output of the {@code after} function, and of the composed function.
	 * 
	 * @param after The function to apply after this function is applied.
	 * 
	 * @return A composed function that first applies this function and then
	 * applies the {@code after} function.
	 * 
	 * @throws NullPointerException if after is null.
	 */
	default <V> Function4<A,B,C,D,V> andThen(Function<T,V> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> after.apply(apply(a, b, c, d));
	}
}
