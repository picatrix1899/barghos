package org.barghos.util.function.floats;

import org.barghos.util.function.Function;
import org.barghos.util.function.Function2;
import org.barghos.util.function.Function3;
import org.barghos.util.function.Function4;
import org.barghos.util.function.FunctionEx;
import org.barghos.util.function.FunctionEx2;
import org.barghos.util.function.FunctionEx3;
import org.barghos.util.function.FunctionEx4;
import org.barghos.validation.Validation;

/**
 * Represents a function that accepts two float arguments and returns a result.
 * 
 * <p>
 * This is a functional interface
 * whose functional method is {@link #apply(float, float)}.
 * 
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
public interface Function2F<T> extends Function2<Float,Float,T>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	T applyFloat(float a, float b);
	
	/**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #applyFloat(float, float)} instead.
     */
    @Override
    @Deprecated
	default T apply(Float a, Float b)
	{
		return applyFloat(a, b);
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
    default <FT> Function2F<FT> then(Function<T,FT> after)
    {
        Validation.validateNotNull("after", after);
        
        return (a, b) -> after.apply(applyFloat(a, b));
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
    default <FT> Function2F<FT> then(java.util.function.Function<? super T,? extends FT> after)
    {
        Validation.validateNotNull("after", after);
        
        return (a, b) -> after.apply(applyFloat(a, b));
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
    default Function2F<Float> thenFloat(FunctionToF<T> after)
    {
        Validation.validateNotNull("after", after);
        
        return (a, b) -> after.applyToFloat(applyFloat(a, b));
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
    default Function2F<Float> thenFloat(Function<T,Float> after)
    {
        Validation.validateNotNull("after", after);
        
        return (a, b) -> after.apply(applyFloat(a, b));
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
    default Function2F<Float> thenFloat(java.util.function.Function<? super T,? extends Float> after)
    {
        Validation.validateNotNull("after", after);
        
        return (a, b) -> after.apply(applyFloat(a, b));
    }
    
    /**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link #thenGeneric(Function)} instead.
     */
    @Override
    @Deprecated
    default <FT> Function2F<FT> andThen(java.util.function.Function<? super T,? extends FT> after)
    {
        return then(after);
    }
}
