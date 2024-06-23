package org.barghos.util.function;

import org.barghos.validation.Validation;

/**
 * Represents a function that accepts two arguments and returns a result.
 * Unlike {@link Function2} this may throw Exceptions.
 * 
 * <p>
 * This is a functional interface
 * whose functional method is {@link #apply(Object, Object)}.
 * 
 * @param <A> The type of the first parameter.
 * @param <B> The type of the second parameter.
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
public interface FunctionEx2<A,B,T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * 
	 * @return The result of the function.
	 * 
	 * @throws Exception May throw an exception during operation.
	 */
	T apply(A a, B b) throws Exception;
	
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
	default <V> FunctionEx2<A,B,V> andThen(Function<T,V> after)
	{
		Validation.validateNotNull(after);
		
		return (a, b) -> after.apply(apply(a, b));
	}
}
