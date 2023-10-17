package org.barghos.util.function;

import org.barghos.validation.Validation;

/**
 * Represents a function that accepts one argument and returns a result.
 * 
 * <p>
 * This is a functional interface
 * whose functional method is {@link #apply(Object)}.
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
     * Returns a composed function that first applies the {@code before}
     * function to its input, and then applies this function to the result.
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *
     * @param <V> the type of input to the {@code before} function, and to the composed function.
     *           
     * @param before the function to apply before this function is applied.
     * 
     * @return a composed function that first applies the {@code before}
     * function and then applies this function.
     * 
     * @throws NullPointerException if before is null.
     */
    default <V> Function<V,T> beforeThat(Function<V,A> before)
    {
    	Validation.validateNotNull(before);
    	
        return (v) -> apply(before.apply(v));
    }

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
    default <V> Function<A,V> andThen(Function<T,V> after)
    {
    	Validation.validateNotNull(after);
    	
        return (t) -> after.apply(apply(t));
    }
	
	/** {@inheritDoc}} */
	@Override
    default <V> Function<V,T> compose(java.util.function.Function<? super V,? extends A> before)
    {
    	Validation.validateNotNull(before);
        
        return (v) -> apply(before.apply(v));
    }

	/** {@inheritDoc}} */
	@Override
    default <V> Function<A,V> andThen(java.util.function.Function<? super T,? extends V> after)
    {
        Validation.validateNotNull(after);
        
        return (t) -> after.apply(apply(t));
    }

	/**
     * Returns a function that always returns its input argument.
     *
     * @param <T> The type of the input and output objects to the function.
     * 
     * @return A function that always returns its input argument.
     */
    static <T> Function<T,T> identity()
    {
        return t -> t;
    }
}
