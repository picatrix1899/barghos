package org.barghos.util.function;

import org.barghos.validation.ParameterValidation;

/**
 * Represents a function that accepts one argument and returns a result.
 * 
 * <p>
 * This is a functional interface
 * whose functional function is {@link #apply(Object)}.
 * 
 * @param <A> The type of the first parameter.
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
public interface Function<A,T> extends java.util.function.Function<A,T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	T apply(A a);
	
	/**
	 * <p>
	 * Returns a composed function that first applies this function to
	 * its input, then relays the result of this function to the given function
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
	 * @return A new composed {@link Function} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT> Function<A,FT> then(Function<T,FT> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.apply(apply(t));
	}
	
	/**
	 * <p>
	 * Returns a composed function that first applies this function to
	 * its input, then relays the result of this function to the given function
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
	 * @return A new composed {@link Function} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT> Function<A,FT> then(java.util.function.Function<? super T,? extends FT> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.apply(apply(t));
	}
	
	/**
	 * <p>
	 * Returns a composed function that first applies the given function to its
	 * input, then relays the result of the given function to this function and
	 * finally returns the result of this function.
	 * 
	 * <p>
	 * If evaluation of either function throws an exception, it is relayed to
	 * the caller of the composed function.
	 *
	 * @param <FA>
	 * The type of the first input parameter of the given function and of the
	 * first input parameter of the returned composed function.
	 *		   
	 * @param before The function to apply before this function is applied.
	 * 
	 * @return a new composed {@link Function} that first applies the given
	 * function and then applies this function to the result.
	 */
	default <FA> Function<FA,T> before(Function<FA,A> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> apply(before.apply(v));
	}
	
	/**
	 * <p>
	 * Returns a composed function that first applies the given function to its
	 * input, then relays the result of the given function to this function and
	 * finally returns the result of this function.
	 * 
	 * <p>
	 * If evaluation of either function throws an exception, it is relayed to
	 * the caller of the composed function.
	 *
	 * @param <FA>
	 * The type of the first input parameter of the given function and of the
	 * first input parameter of the returned composed function.
	 *		   
	 * @param before The function to apply before this function is applied.
	 * 
	 * @return a new composed {@link Function} that first applies the given
	 * function and then applies this function to the result.
	 */
	default <FA> Function<FA,T> before(java.util.function.Function<? super FA,? extends A> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> apply(before.apply(v));
	}
	
	/**
	 * Returns a function that always returns its input argument.
	 *
	 * @param <T>
	 * The type of the input parameter and return type of the function.
	 * 
	 * @return A function that always returns its input argument.
	 */
	static <T> Function<T, T> identity()
	{
		return t -> t;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #then(java.util.function.Function)} instead.
	 */
	@Override
	@Deprecated
	default <FT> Function<A,FT> andThen(java.util.function.Function<? super T,? extends FT> after)
	{
		return then(after);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #before(java.util.function.Function)} instead.
	 */
	@Override
	@Deprecated
	default <FA> Function<FA,T> compose(java.util.function.Function<? super FA,? extends A> before)
	{
		return before(before);
	}
	
}
	
