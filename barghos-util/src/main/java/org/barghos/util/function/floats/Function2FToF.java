package org.barghos.util.function.floats;

import org.barghos.util.function.Function;
import org.barghos.util.function.Function2;
import org.barghos.validation.Validation;

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
 * @see Function2FToF
 * @see FunctionEx2
 * @see Function3
 * @see FunctionEx3
 * @see Function4
 * @see FunctionEx4
 */
@FunctionalInterface
public interface Function2FToF extends Function2F<Float>, Function2ToF<Float, Float>
{
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * @param b The second parameter.
	 * 
	 * @return The result of the function.
	 */
	float applyFloatToFloat(float a, float b);
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float, float)} instead.
	 */
	@Override
	@Deprecated
	default Float applyFloat(float a, float b)
	{
		return applyFloatToFloat(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float, float)} instead.
	 */
	@Override
	@Deprecated
	default float applyToFloat(Float a, Float b)
	{
		return applyFloatToFloat(a, b);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float, float)} instead.
	 */
	@Override
	@Deprecated
	default Float apply(Float a, Float b)
	{
		return applyFloatToFloat(a, b);
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
	default <FT> Function2F<FT> thenFloat(FunctionF<FT> after)
	{
		Validation.validateNotNull("after", after);
		
		return (a, b) -> after.applyFloat(applyFloatToFloat(a, b));
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
	default Function2FToF thenFloat(Function<Float,Float> after)
	{
		Validation.validateNotNull("after", after);
		
		return (a, b) -> after.apply(applyFloatToFloat(a, b));
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
	default Function2FToF thenFloat(java.util.function.Function<? super Float,? extends Float> after)
	{
		Validation.validateNotNull("after", after);
		
		return (a, b) -> after.apply(applyFloatToFloat(a, b));
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
	default <FT> Function2F<FT> then(FunctionF<FT> after)
	{
		Validation.validateNotNull("after", after);
		
		return (a, b) -> after.applyFloat(applyFloatToFloat(a, b));
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
	default <FT> Function2F<FT> then(Function<Float,FT> after)
	{
		Validation.validateNotNull("after", after);
		
		return (a, b) -> after.apply(applyFloatToFloat(a, b));
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
	default <FT> Function2F<FT> then(java.util.function.Function<? super Float,? extends FT> after)
	{
		Validation.validateNotNull("after", after);
		
		return (a, b) -> after.apply(applyFloatToFloat(a, b));
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #thenGeneric(Function)} instead.
	 */
	@Override
	@Deprecated
	default <FT> Function2F<FT> andThen(java.util.function.Function<? super Float,? extends FT> after)
	{
		return then(after);
	}
}
