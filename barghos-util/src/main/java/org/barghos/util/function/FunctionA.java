package org.barghos.util.function;

/**
 * Represents a function that accepts one 1-dimensional array argument and returns a result.
 * 
 * <p>
 * This is a functional interface
 * whose functional method is {@link #applyArray(Object[])}.
 * 
 * @param <A> The type of the first parameter.
 * @param <T> The return type.
 * 
 * @see FunctionA
 * @see FunctionExA
 * @see Function2A
 * @see FunctionEx2A
 * @see Function3A
 * @see FunctionEx3A
 * @see Function4A
 * @see FunctionEx4A
 */
@FunctionalInterface
public interface FunctionA<A,T> extends Function<A[],T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	T applyArray(A[] a);

	/**
     * Returns a function that always returns its input argument.
     *
     * @param <T> The type of the input and output objects to the function.
     * 
     * @return A function that always returns its input argument.
     */
    static <T> FunctionA<T,T[]> identity()
    {
        return t -> t;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #applyArray(Object[])} instead.
     */
    @Override
    default T apply(A[] a)
    {
    	return applyArray(a);
    }
}
