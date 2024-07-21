package org.barghos.util.function.floats;

import org.barghos.util.function.Function;
import org.barghos.validation.ParameterValidation;

/**
 * Represents a function that accepts two arguments and returns a result.
 * 
 * <p>
 * This is a functional interface
 * whose functional method is {@link #applyFloatToFloat(float, float)}.
 * 
 * 
 * @see Function
 * @see FunctionEx
 * @see Function4FToF
 * @see FunctionEx2
 * @see Function3
 * @see FunctionEx3
 * @see Function4
 * @see FunctionEx4
 */
@FunctionalInterface
public interface Function4FToF extends Function4F<Float>, Function4ToF<Float,Float,Float,Float>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * 
	 * @return The result of the function.
	 */
	float apply4FToF(float a, float b, float c, float d);
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float, float)} instead.
	 */
	@Override
	@Deprecated
	default Float apply4F(float a, float b, float c, float d)
	{
		return apply4FToF(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float, float)} instead.
	 */
	@Override
	@Deprecated
	default float apply4ToF(Float a, Float b, Float c, Float d)
	{
		return apply4FToF(a, b, c, d);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float, float)} instead.
	 */
	@Override
	@Deprecated
	default Float apply(Float a, Float b, Float c, Float d)
	{
		return apply4FToF(a, b, c, d);
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
	default <FT> Function4F<FT> thenF(FunctionF<FT> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> after.applyF(apply4FToF(a, b, c, d));
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
	default Function4FToF thenF(Function<Float,Float> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> after.apply(apply4FToF(a, b, c, d));
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
	default Function4FToF thenF(java.util.function.Function<? super Float,? extends Float> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> after.apply(apply4FToF(a, b, c, d));
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
	default <FT> Function4F<FT> then(FunctionF<FT> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> after.applyF(apply4FToF(a, b, c, d));
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
	default <FT> Function4F<FT> then(Function<Float,FT> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> after.apply(apply4FToF(a, b, c, d));
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
	default <FT> Function4F<FT> then(java.util.function.Function<? super Float,? extends FT> after)
	{
		ParameterValidation.pvNotNull("after", after);
		
		return (a, b, c, d) -> after.apply(apply4FToF(a, b, c, d));
	}
}
