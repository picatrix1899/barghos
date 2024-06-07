package org.barghos.util.function.floats;

import org.barghos.util.function.Function;
import org.barghos.validation.Validation;

/**
 * Represents a function that accepts one argument and returns an 1-directional
 * float array result.
 * 
 * <p>
 * This is a functional interface
 * whose functional function is {@link #apply(Object)}.
 * 
 * @param <A> The type of the first parameter.
 * 
 * @see FunctionToFA
 * @see FunctionExToF
 * @see Function2ToF
 * @see FunctionEx2ToF
 * @see Function3ToF
 * @see FunctionEx3ToF
 * @see Function4ToF
 * @see FunctionEx4ToF
 */
@FunctionalInterface
public interface FunctionToFA<A> extends Function<A,float[]>
{
	
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	float[] applyToFloatArray(A a);
	
	/**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link FunctionToFA#applyToFloatArray(Object)} instead.
     */
    @Override
    @Deprecated
	default float[] apply(A a)
	{
		return applyToFloatArray(a);
	}

    /**
	 * <p>
     * Returns a composed function that first applies this function to its
     * input, then relays the result of this function to the given function and
     * finally returns the result of the given function.
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
    default <FT> Function<A,FT> then(FunctionFA<FT> after)
    {
    	Validation.validateNotNull("after", after);

        return (t) -> after.applyFloatArray(applyToFloatArray(t));
    }
    
    /**
	 * <p>
     * Returns a composed function that first applies this function to its
     * input, then relays the result of this function to the given function and
     * finally returns the result of the given function.
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
    default <FT> Function<A,FT> then(Function<float[],FT> after)
    {
    	Validation.validateNotNull("after", after);

        return (t) -> after.apply(applyToFloatArray(t));
    }
	
    /**
	 * <p>
     * Returns a composed function that first applies this function to its
     * input, then relays the result of this function to the given function and
     * finally returns the result of the given function.
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
    default <FT> Function<A,FT> then(java.util.function.Function<? super float[],? extends FT> after)
    {
    	Validation.validateNotNull("after", after);

        return (t) -> after.apply(applyToFloatArray(t));
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
     * @return A new composed {@link FunctionToFA} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToFA<A> thenFloatArray(FunctionFAToFA after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.applyFloatArrayToFloatArray(applyToFloatArray(t));
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
     * @return A new composed {@link FunctionToFA} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToFA<A> thenFloatArray(Function<float[],float[]> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.apply(applyToFloatArray(t));
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
     * @return A new composed {@link FunctionToFA} that first applies this
     * function and then applies the given function to the result.
     */
    default FunctionToFA<A> thenFloatArray(java.util.function.Function<? super float[],? extends float[]> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.apply(applyToFloatArray(t));
	}
    
    /**
	 * <p>
     * Returns a composed float returning function that first applies the given
     * function to its input, then relays the result of the given function to
     * this function and finally returns the result of this function.
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
     * @return a new composed {@link FunctionToFA} that first applies the given
     * function and then applies this function to the result.
     */
    default <FA> FunctionToFA<FA> before(Function<FA,A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloatArray(before.apply(v));
    }
    
    /**
	 * <p>
     * Returns a composed float returning function that first applies the given
     * function to its input, then relays the result of the given function to
     * this function and finally returns the result of this function.
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
     * @return a new composed {@link FunctionToFA} that first applies the given
     * function and then applies this function to the result.
     */
    default <FA> FunctionToFA<FA> before(java.util.function.Function<? super FA,? extends A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloatArray(before.apply(v));
    }
    
    /**
	 * <p>
     * Returns a composed float returning function with float parameters that
     * first applies the given function to its input, then relays the result of
     * the given function to this function and finally returns the result of
     * this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionFToF} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionFAToFA beforeFloatArray(FunctionFA<A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloatArray(before.applyFloatArray(v));
    }
    
    /**
	 * <p>
     * Returns a composed float returning function with float parameters that
     * first applies the given function to its input, then relays the result of
     * the given function to this function and finally returns the result of
     * this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionFToF} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionFAToFA beforeFloatArray(Function<float[],A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloatArray(before.apply(v));
    }
    
    /**
	 * <p>
     * Returns a composed float returning function with float parameters that
     * first applies the given function to its input, then relays the result of
     * the given function to this function and finally returns the result of
     * this function.
     * 
     * <p>
     * If evaluation of either function throws an exception, it is relayed to
     * the caller of the composed function.
     *      
     * @param before The function to apply before this function is applied.
     * 
     * @return a new composed {@link FunctionFToF} that first applies the
     * given function and then applies this function to the result.
     */
    default FunctionFAToFA beforeFloatArray(java.util.function.Function<? super float[],? extends A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloatArray(before.apply(v));
    }
    
    /**
     * Returns a function that always returns its input argument.
     * 
     * @return A function that always returns its input argument.
     */
    static FunctionToFA<float[]> identity()
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
    default <FT> Function<A,FT> andThen(java.util.function.Function<? super float[],? extends FT> after)
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
    default <FA> FunctionToFA<FA> compose(java.util.function.Function<? super FA,? extends A> before)
    {
    	return before(before);
    }
}
	
