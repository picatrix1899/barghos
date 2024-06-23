package org.barghos.util.function.floats;

import org.barghos.util.function.Function;
import org.barghos.validation.Validation;

/**
 * Represents a function that accepts one 1-dimensional float array argument and
 * returns a result.
 * 
 * <p>
 * This is a functional interface
 * whose functional function is {@link #applyFloatArray(float[])}.
 * 
 * @param <T> The return type.
 * 
 * @see FunctionFA
 * @see FunctionExFA
 * @see Function2FA
 * @see FunctionEx2FA
 * @see Function3FA
 * @see FunctionEx3FA
 * @see Function4FA
 * @see FunctionEx4FA
 */
@FunctionalInterface
public interface FunctionFA<T> extends Function<float[],T>
{

	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	T applyFloatArray(float[] a);
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatArray(float[])} instead.
	 */
	@Override
	@Deprecated
	default T apply(float[] a)
	{
		return applyFloatArray(a);
	}
	
	/**
	 * <p>
	 * Returns a composed function with float parameters that first applies this
	 * function to its input, then relays the result of this function to the
	 * given function and finally returns the result of the given function.
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
	 * @return A new composed {@link FunctionFA} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT> FunctionFA<FT> then(Function<T,FT> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.apply(applyFloatArray(t));
	}
	
	/**
	 * <p>
	 * Returns a composed function with float parameters that first applies this
	 * function to its input, then relays the result of this function to the
	 * given function and finally returns the result of the given function.
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
	 * @return A new composed {@link FunctionFA} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT> FunctionFA<FT> then(java.util.function.Function<? super T,? extends FT> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.apply(applyFloatArray(t));
	}
	
	/**
	 * <p>
	 * Returns a composed float returning function with float parameters that
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
	 * @return A new composed {@link FunctionFToF} that first applies this
	 * function and then applies the given function to the result.
	 */
	default FunctionFAToFA thenFloatArray(FunctionToFA<T> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.applyToFloatArray(applyFloatArray(t));
	}
	
	/**
	 * <p>
	 * Returns a composed float returning function with float parameters that
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
	 * @return A new composed {@link FunctionFToF} that first applies this
	 * function and then applies the given function to the result.
	 */
	default FunctionFAToFA thenFloatArray(Function<T,float[]> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.apply(applyFloatArray(t));
	}
	
	/**
	 * <p>
	 * Returns a composed float returning function with float parameters that
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
	 * @return A new composed {@link FunctionFToF} that first applies this
	 * function and then applies the given function to the result.
	 */
	default FunctionFAToFA thenFloatArray(java.util.function.Function<? super T,? extends float[]> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.apply(applyFloatArray(t));
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
	default <FA> Function<FA,T> before(FunctionToFA<FA> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloatArray(before.applyToFloatArray(v));
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
	default <FA> Function<FA,T> before(Function<FA,float[]> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloatArray(before.apply(v));
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
	default <FA> Function<FA,T> before(java.util.function.Function<? super FA,? extends float[]> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloatArray(before.apply(v));
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
	 * @return a new composed {@link FunctionFA} that first applies the
	 * given function and then applies this function to the result.
	 */
	default FunctionFA<T> beforeFloatArray(FunctionFAToFA before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloatArray(before.applyFloatArrayToFloatArray(v));
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
	 * @return a new composed {@link FunctionFA} that first applies the
	 * given function and then applies this function to the result.
	 */
	default FunctionFA<T> beforeFloatArray(FunctionToFA<float[]> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloatArray(before.applyToFloatArray(v));
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
	 * @return a new composed {@link FunctionFA} that first applies the
	 * given function and then applies this function to the result.
	 */
	default FunctionFA<T> beforeFloatArray(FunctionFA<float[]> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloatArray(before.applyFloatArray(v));
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
	 * @return a new composed {@link FunctionFA} that first applies the
	 * given function and then applies this function to the result.
	 */
	default FunctionFA<T> beforeFloatArray(Function<float[],float[]> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloatArray(before.apply(v));
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
	 * @return a new composed {@link FunctionFA} that first applies the
	 * given function and then applies this function to the result.
	 */
	default FunctionFA<T> beforeFloatArray(java.util.function.Function<? super float[],? extends float[]> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloatArray(before.apply(v));
	}
	
	/**
	 * Returns a function that always returns its input argument.
	 * 
	 * @return A function that always returns its input argument.
	 */
	static FunctionFA<float[]> identity()
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
	default <FT> FunctionFA<FT> andThen(java.util.function.Function<? super T,? extends FT> after)
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
	default <FA> Function<FA,T> compose(java.util.function.Function<? super FA,? extends float[]> before)
	{
		return before(before);
	}
}
	
