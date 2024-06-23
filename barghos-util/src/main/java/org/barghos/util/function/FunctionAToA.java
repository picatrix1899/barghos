package org.barghos.util.function;

import org.barghos.validation.Validation;

/**
 * Represents a function that accepts one 1-dimensional array argument and returns a 1-dimensional result array.
 * 
 * <p>
 * This is a functional interface
 * whose functional method is {@link #applyArray(Object[])}.
 * 
 * @param <A> The type of the first parameter.
 * @param <T> The return type.
 * 
 * @see FunctionAToA
 * @see FunctionExAToA
 * @see Function2AToA
 * @see FunctionEx2AToA
 * @see Function3AToA
 * @see FunctionEx3AToA
 * @see Function4AToA
 * @see FunctionEx4AToA
 */
@FunctionalInterface
public interface FunctionAToA<A,T> extends FunctionA<A,T[]>, FunctionToA<A[],T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	T[] applyArray(A[] a);

	/**
	 * Returns a function that always returns its input argument.
	 *
	 * @param <T> The type of the input and output objects to the function.
	 * 
	 * @return A function that always returns its input argument.
	 */
	static <T> FunctionAToA<T,T> identity()
	{
		return t -> t;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyArray(Object[])} instead.
	 */
	@Override
	default T[] apply(A[] a)
	{
		return applyArray(a);
	}
}
