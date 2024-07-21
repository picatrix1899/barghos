package org.barghos.util.function.floats;

import org.barghos.util.function.Function;
import org.barghos.validation.ParameterValidation;

/**
 * Represents a function that accepts one float argument and returns a float
 * result.
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
 * @see Function2ToF
 * @see FunctionEx2
 * @see Function3
 * @see FunctionEx3
 * @see Function4
 * @see FunctionEx4
 */
@FunctionalInterface
public interface FunctionFToF extends FunctionF<Float>, FunctionToF<Float>
{
	
	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	float applyFToF(float a);
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float)} instead.
	 */
	@Override
	@Deprecated
	default Float applyF(float a)
	{
		return applyFToF(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float)} instead.
	 */
	@Override
	@Deprecated
	default float applyToF(Float a)
	{
		return applyFToF(a);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloatToFloat(float)} instead.
	 */
	@Override
	@Deprecated
	default Float apply(Float a)
	{
		return applyFToF(a);
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
	 * @param <FT>
	 * The return type of the of the given function and of the return type of
	 * the returned composed function.
	 * 
	 * @param after The function to apply after this function is applied.
	 * 
	 * @return A new composed {@link FunctionF} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT> FunctionF<FT> then(FunctionF<FT> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.applyF(applyFToF(t));
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
	 * @param <FT>
	 * The return type of the of the given function and of the return type of
	 * the returned composed function.
	 * 
	 * @param after The function to apply after this function is applied.
	 * 
	 * @return A new composed {@link FunctionF} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT>  FunctionF<FT> then(Function<Float,FT> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.apply(applyFToF(t));
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
	 * @param <FT>
	 * The return type of the of the given function and of the return type of
	 * the returned composed function.
	 * 
	 * @param after The function to apply after this function is applied.
	 * 
	 * @return A new composed {@link FunctionF} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT> FunctionF<FT> then(java.util.function.Function<? super Float,? extends FT> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.apply(applyFToF(t));
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
	default FunctionFToF thenF(FunctionFToF after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.applyFToF(applyFToF(t));
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
	default FunctionFToF thenF(FunctionToF<Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.applyToF(applyFToF(t));
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
	default FunctionFToF thenF(FunctionF<Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.applyF(applyFToF(t));
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
	default FunctionFToF thenF(Function<Float,Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.apply(applyFToF(t));
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
	default FunctionFToF thenF(java.util.function.Function<? super Float,? extends Float> after)
	{
		ParameterValidation.pvNotNull("after", after);

		return (t) -> after.apply(applyFToF(t));
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
	default <FA> FunctionToF<FA> before(FunctionToF<FA> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> applyFToF(before.applyToF(v));
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
	default <FA> FunctionToF<FA> before(Function<FA,Float> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> applyFToF(before.apply(v));
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
	default <FA> FunctionToF<FA> before(java.util.function.Function<? super FA,? extends Float> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> applyFToF(before.apply(v));
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
	default FunctionFToF beforeF(FunctionFToF before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> applyFToF(before.applyFToF(v));
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
	default FunctionFToF beforeF(FunctionToF<Float> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> applyFToF(before.applyToF(v));
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
	default FunctionFToF beforeF(FunctionF<Float> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> applyFToF(before.applyF(v));
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
	default FunctionFToF beforeF(Function<Float,Float> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> applyFToF(before.apply(v));
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
	default FunctionFToF beforeF(java.util.function.Function<? super Float,? extends Float> before)
	{
		ParameterValidation.pvNotNull("before", before);
		
		return (v) -> applyFToF(before.apply(v));
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
	default <FT> FunctionF<FT> andThen(java.util.function.Function<? super Float,? extends FT> after)
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
	default <FA> FunctionToF<FA> compose(java.util.function.Function<? super FA,? extends Float> before)
	{
		return before(before);
	}
}
	
