package org.barghos.util.function.floats;

import org.barghos.util.function.Function;
import org.barghos.validation.Validation;

/**
 * Represents a function that accepts one argument and returns a float result.
 * 
 * <p>
 * This is a functional interface
 * whose functional function is {@link #apply(Object)}.
 * 
 * @param <A> The type of the first parameter.
 * 
 * @see FunctionToF
 * @see FunctionExToF
 * @see Function2ToF
 * @see FunctionEx2ToF
 * @see Function3ToF
 * @see FunctionEx3ToF
 * @see Function4ToF
 * @see FunctionEx4ToF
 */
@FunctionalInterface
public interface FunctionToF<A> extends Function<A,Float>
{
	
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	float applyToFloat(A a);
	
	/**
     * {@inheritDoc}
     * 
     * @deprecated Use {@link FunctionToF#applyToFloat(Object)} instead.
     */
    @Override
    @Deprecated
	default Float apply(A a)
	{
		return applyToFloat(a);
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
    default <FT> Function<A,FT> then(FunctionF<FT> after)
    {
    	Validation.validateNotNull("after", after);

        return (t) -> after.applyFloat(applyToFloat(t));
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
    default <FT> Function<A,FT> then(Function<Float,FT> after)
    {
    	Validation.validateNotNull("after", after);

        return (t) -> after.apply(applyToFloat(t));
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
    default <FT> Function<A,FT> then(java.util.function.Function<? super Float,? extends FT> after)
    {
    	Validation.validateNotNull("after", after);

        return (t) -> after.apply(applyToFloat(t));
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
    default FunctionToF<A> thenFloat(FunctionFToF after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.applyFloatToFloat(applyToFloat(t));
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
    default FunctionToF<A> thenFloat(Function<Float,Float> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.apply(applyToFloat(t));
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
    default FunctionToF<A> thenFloat(java.util.function.Function<? super Float,? extends Float> after)
	{
		Validation.validateNotNull("after", after);

        return (t) -> after.apply(applyToFloat(t));
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
     * @return a new composed {@link FunctionToF} that first applies the given
     * function and then applies this function to the result.
     */
    default <FA> FunctionToF<FA> before(Function<FA,A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloat(before.apply(v));
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
     * @return a new composed {@link FunctionToF} that first applies the given
     * function and then applies this function to the result.
     */
    default <FA> FunctionToF<FA> before(java.util.function.Function<? super FA,? extends A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloat(before.apply(v));
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
    default FunctionFToF beforeFloat(FunctionF<A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloat(before.applyFloat(v));
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
    default FunctionFToF beforeFloat(Function<Float,A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloat(before.apply(v));
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
    default FunctionFToF beforeFloat(java.util.function.Function<? super Float,? extends A> before)
    {
    	Validation.validateNotNull("before", before);
    	
        return (v) -> applyToFloat(before.apply(v));
    }
    
    /**
     * Returns a function that always returns its input argument.
     * 
     * @return A function that always returns its input argument.
     */
    static FunctionToF<Float> identity()
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
    default <FT> Function<A,FT> andThen(java.util.function.Function<? super Float,? extends FT> after)
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
    default <FA> FunctionToF<FA> compose(java.util.function.Function<? super FA,? extends A> before)
    {
    	return before(before);
    }
}
	
