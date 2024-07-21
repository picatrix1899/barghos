package org.barghos.util.function;

import org.barghos.validation.ParameterValidation;

/**
 * Represents a function that accepts two arguments and returns a result.
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
public interface Function2<A,B,T> extends java.util.function.BiFunction<A,B,T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * 
	 * @return The result of the function.
	 */
	T apply(A a, B b);
	
	/**
	 * <p>
	 * Returns a composed function that first applies this function to
	 * its input, then applies the given function to the result of this function
	 * and finally returns the result of the given function.
	 * 
	 * <p>
	 * If evaluation of either function throws an exception, it is relayed to
	 * the caller of the composed function.
	 *
	 * @param <FT>
	 * The return type of the of the given function and of the return type of
	 * the returned composed function.
	 * 
	 * @param after The function to apply after this function is applied.
	 * 
	 * @return A composed function that first applies this function and then
	 * applies the given function to the result.
	 */
	default <FT> Function2<A,B,FT> then(Function<T,FT> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> after.apply(apply(a, b));
	}
	
	/**
	 * <p>
	 * Returns a composed function that first applies this function to
	 * its input, then applies the given function to the result of this function
	 * and finally returns the result of the given function.
	 * 
	 * <p>
	 * If evaluation of either function throws an exception, it is relayed to
	 * the caller of the composed function.
	 *
	 * @param <FT>
	 * The return type of the of the given function and of the return type of
	 * the returned composed function.
	 * 
	 * @param after The function to apply after this function is applied.
	 * 
	 * @return A composed function that first applies this function and then
	 * applies the given function to the result.
	 */
	default <FT> Function2<A,B,FT> then(java.util.function.Function<? super T,? extends FT> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b) -> after.apply(apply(a, b));
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #thenGeneric(Function)} instead.
	 */
	@Override
	@Deprecated
	default <FT> Function2<A,B,FT> andThen(java.util.function.Function<? super T,? extends FT> after)
	{
		return then(after);
	}
}
