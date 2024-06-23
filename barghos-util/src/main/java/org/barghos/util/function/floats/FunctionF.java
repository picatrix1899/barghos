package org.barghos.util.function.floats;

import org.barghos.util.function.Function;
import org.barghos.validation.Validation;

/**
 * Represents a function that accepts one float argument and returns a result.
 * 
 * <p>
 * This is a functional interface
 * whose functional function is {@link #applyFloat(float)}.
 * 
 * @param <T> The return type.
 * 
 * @see FunctionF
 * @see FunctionExF
 * @see Function2F
 * @see FunctionEx2F
 * @see Function3F
 * @see FunctionEx3F
 * @see Function4F
 * @see FunctionEx4F
 */
@FunctionalInterface
public interface FunctionF<T> extends Function<Float,T>
{

	/**
	 * Invokes the function.
	 * 
	 * @param a The first parameter.
	 * 
	 * @return The result of the function.
	 */
	T applyFloat(float a);
	
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated Use {@link #applyFloat(float)} instead.
	 */
	@Override
	@Deprecated
	default T apply(Float a)
	{
		return applyFloat(a);
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
	 * @return A new composed {@link FunctionF} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT> FunctionF<FT> then(Function<T,FT> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.apply(applyFloat(t));
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
	 * @return A new composed {@link FunctionF} that first applies this function
	 * and then applies the given function to the result.
	 */
	default <FT> FunctionF<FT> then(java.util.function.Function<? super T,? extends FT> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.apply(applyFloat(t));
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
	default FunctionFToF thenFloat(FunctionToF<T> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.applyToFloat(applyFloat(t));
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
	default FunctionFToF thenFloat(Function<T,Float> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.apply(applyFloat(t));
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
	default FunctionFToF thenFloat(java.util.function.Function<? super T,? extends Float> after)
	{
		Validation.validateNotNull("after", after);

		return (t) -> after.apply(applyFloat(t));
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
	default <FA> Function<FA,T> before(FunctionToF<FA> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloat(before.applyToFloat(v));
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
	default <FA> Function<FA,T> before(Function<FA,Float> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloat(before.apply(v));
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
	default <FA> Function<FA,T> before(java.util.function.Function<? super FA,? extends Float> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloat(before.apply(v));
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
	default FunctionF<T> beforeFloat(FunctionFToF before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloat(before.applyFloatToFloat(v));
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
	default FunctionF<T> beforeFloat(FunctionToF<Float> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloat(before.applyToFloat(v));
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
	default FunctionF<T> beforeFloat(FunctionF<Float> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloat(before.applyFloat(v));
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
	default FunctionF<T> beforeFloat(Function<Float,Float> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloat(before.apply(v));
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
	default FunctionF<T> beforeFloat(java.util.function.Function<? super Float,? extends Float> before)
	{
		Validation.validateNotNull("before", before);
		
		return (v) -> applyFloat(before.apply(v));
	}
	
	/**
	 * Returns a function that always returns its input argument.
	 * 
	 * @return A function that always returns its input argument.
	 */
	static FunctionF<Float> identity()
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
	default <FT> FunctionF<FT> andThen(java.util.function.Function<? super T,? extends FT> after)
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
	default <FA> Function<FA,T> compose(java.util.function.Function<? super FA,? extends Float> before)
	{
		return before(before);
	}
}
	
