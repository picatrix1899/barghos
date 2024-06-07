package org.barghos.util.function;

import org.barghos.util.function.floats.FunctionF;
import org.barghos.util.function.floats.FunctionFA;
import org.barghos.util.function.floats.FunctionToF;
import org.barghos.util.function.floats.FunctionToFA;
import org.barghos.validation.Validation;

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
    	Validation.validateNotNull("after", after);

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
    	Validation.validateNotNull("after", after);

        return (t) -> after.apply(apply(t));
    }
    
    /**
	 * <p>
     * Returns a composed float returning function that first applies this
     * function to its input, then relays the result of this function to the
     * given function and finally returns the result of the given function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     * 
     * @param after The function to apply after this function is applied.
     * 
     * @return A new composed {@link FunctionToF} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToF<A> thenFloat(FunctionToF<T> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.applyToFloat(apply(t));
	}
    
    /**
	 * <p>
     * Returns a composed float returning function that first applies this
     * function to its input, then relays the result of this function to the
     * given function and finally returns the result of the given function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     * 
     * @param after The function to apply after this function is applied.
     * 
     * @return A new composed {@link FunctionToF} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToF<A> thenFloat(Function<T,Float> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.apply(apply(t));
	}
    
    /**
	 * <p>
     * Returns a composed float returning function that first applies this
     * function to its input, then relays the result of this function to the
     * given function and finally returns the result of the given function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     * 
     * @param after The function to apply after this function is applied.
     * 
     * @return A new composed {@link FunctionToF} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToF<A> thenFloat(java.util.function.Function<? super T,? extends Float> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.apply(apply(t));
	}

    /**
	 * <p>
     * Returns a composed 1-dimensional float array returning function that
     * first applies this function to its input, then relays the result of this
     * function to the given function and finally returns the result of the
     * given function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     * 
     * @param after The function to apply after this function is applied.
     * 
     * @return A new composed {@link FunctionToFA} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToFA<A> thenFloatArray(FunctionToFA<T> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.applyToFloatArray(apply(t));
	}
    
    /**
	 * <p>
     * Returns a composed 1-dimensional float array returning function that
     * first applies this function to its input, then relays the result of this
     * function to the given function and finally returns the result of the
     * given function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     * 
     * @param after The function to apply after this function is applied.
     * 
     * @return A new composed {@link FunctionToFA} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToFA<A> thenFloatArray(Function<T,float[]> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.apply(apply(t));
	}
    
    /**
	 * <p>
     * Returns a composed 1-dimensional float array returning function that
     * first applies this function to its input, then relays the result of this
     * function to the given function and finally returns the result of the
     * given function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     * 
     * @param after The function to apply after this function is applied.
     * 
     * @return A new composed {@link FunctionToFA} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToFA<A> thenFloatArray(java.util.function.Function<? super T,? extends float[]> after)
	{
		Validation.validateNotNull("after", after);

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
    	Validation.validateNotNull("before", before);
    	
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
    	Validation.validateNotNull("before", before);
    	
        return (v) -> apply(before.apply(v));
    }
    
    /**
	 * <p>
     * Returns a composed function with float parameters that first applies the
     * given function to its input, then relays the result of the given function
     * to this function and finally returns the result of this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionF} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionF<T> beforeFloat(FunctionF<A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> apply(before.applyFloat(v));
    }
    
    /**
	 * <p>
     * Returns a composed function with float parameters that first applies the
     * given function to its input, then relays the result of the given function
     * to this function and finally returns the result of this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionF} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionF<T> beforeFloat(Function<Float,A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> apply(before.apply(v));
    }
    
    /**
	 * <p>
     * Returns a composed function with float parameters that first applies the
     * given function to its input, then relays the result of the given function
     * to this function and finally returns the result of this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionF} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionF<T> beforeFloat(java.util.function.Function<? super Float,? extends A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> apply(before.apply(v));
    }
    
    /**
	 * <p>
     * Returns a composed function with 1-dimensional float array parameters
     * that first applies the given function to its input, then relays the
     * result of the given function to this function and finally returns the
     * result of this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionFA} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionFA<T> beforeFloatArray(FunctionFA<A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> apply(before.applyFloatArray(v));
    }
    
    /**
	 * <p>
     * Returns a composed function with 1-dimensional float array parameters
     * that first applies the given function to its input, then relays the
     * result of the given function to this function and finally returns the
     * result of this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionFA} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionFA<T> beforeFloatArray(Function<float[],A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> apply(before.apply(v));
    }
    
    /**
	 * <p>
     * Returns a composed function with 1-dimensional float array parameters
     * that first applies the given function to its input, then relays the
     * result of the given function to this function and finally returns the
     * result of this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionFA} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionFA<T> beforeFloatArray(java.util.function.Function<? super float[],? extends A> before)
    {
    	Validation.validateNotNull("before", before);
    	
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
	
