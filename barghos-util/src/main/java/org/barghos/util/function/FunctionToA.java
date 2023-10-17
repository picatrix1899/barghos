package org.barghos.util.function;

/**
 * Represents a function that accepts one argument and returns a 1-dimensional result array.
 * 
 * <p>
 * This is a functional interface
 * whose functional method is {@link #applyToArray(Object)}.
 * 
 * @param <A> The type of the first parameter.
 * @param <T> The return type.
 * 
 * @see FunctionToA
 * @see FunctionExToA
 * @see Function2ToA
 * @see FunctionEx2ToA
 * @see Function3ToA
 * @see FunctionEx3ToA
 * @see Function4ToA
 * @see FunctionEx4ToA
 */
@FunctionalInterface
public interface FunctionToA<A,T> extends Function<A,T[]>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	T[] applyToArray(A a);

	/**
     * Returns a function that always returns its input argument.
     *
     * @param <T> The type of the input and output objects to the function.
     * 
     * @return A function that always returns its input argument.
     */
    static <T> FunctionToA<T[],T> identity()
    {
        return t -> t;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #applyToArray(Object)} instead.
     */
    @Override
    default T[] apply(A a)
    {
    	return applyToArray(a);
    }
}
