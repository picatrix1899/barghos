//package org.barghos.util.function.floats;
//
//import org.barghos.util.function.Function;
//import org.barghos.util.function.Function2;
//import org.barghos.util.function.Function3;
//import org.barghos.util.function.Function4;
//import org.barghos.util.function.FunctionEx;
//import org.barghos.util.function.FunctionEx2;
//import org.barghos.util.function.FunctionEx3;
//import org.barghos.util.function.FunctionEx4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents a function that accepts two float arguments and returns a result.
// * 
// * <p>
// * This is a functional interface
// * whose functional method is {@link #apply(float, float)}.
// * 
// * @param <T> The return type.
// * 
// * @see Function
// * @see FunctionEx
// * @see Function2
// * @see FunctionEx2
// * @see Function3
// * @see FunctionEx3
// * @see Function4
// * @see FunctionEx4
// */
//@FunctionalInterface
//public interface Function3F<T> extends Function3<Float,Float,Float,T>
//{
//	/**
//	 * Invokes the function.
//	 * 
//	 * @param a The first parameter.
//	 * 
//	 * @return The result of the function.
//	 */
//	T apply3F(float a, float b, float c);
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @deprecated Use {@link #applyF(float, float)} instead.
//	 */
//	@Override
//	@Deprecated
//	default T apply(Float a, Float b, Float c)
//	{
//		return apply3F(a, b, c);
//	}
//	
//	/**
//	 * <p>
//	 * Returns a composed function that first applies this function to
//	 * its input, then applies the given function to the result of this function
//	 * and finally returns the result of the given function.
//	 * 
//	 * <p>
//	 * If evaluation of either function throws an exception, it is relayed to
//	 * the caller of the composed function.
//	 *
//	 * @param <FT>
//	 * The return type of the of the given function and of the return type of
//	 * the returned composed function.
//	 * 
//	 * @param after The function to apply after this function is applied.
//	 * 
//	 * @return A composed function that first applies this function and then
//	 * applies the given function to the result.
//	 */
//	default Function3F<Float> thenF(FunctionToF<T> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> after.applyToF(apply3F(a, b, c));
//	}
//	
//	/**
//	 * <p>
//	 * Returns a composed function that first applies this function to
//	 * its input, then applies the given function to the result of this function
//	 * and finally returns the result of the given function.
//	 * 
//	 * <p>
//	 * If evaluation of either function throws an exception, it is relayed to
//	 * the caller of the composed function.
//	 *
//	 * @param <FT>
//	 * The return type of the of the given function and of the return type of
//	 * the returned composed function.
//	 * 
//	 * @param after The function to apply after this function is applied.
//	 * 
//	 * @return A composed function that first applies this function and then
//	 * applies the given function to the result.
//	 */
//	default Function3F<Float> thenF(Function<T,Float> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> after.apply(apply3F(a, b, c));
//	}
//	
//	/**
//	 * <p>
//	 * Returns a composed function that first applies this function to
//	 * its input, then applies the given function to the result of this function
//	 * and finally returns the result of the given function.
//	 * 
//	 * <p>
//	 * If evaluation of either function throws an exception, it is relayed to
//	 * the caller of the composed function.
//	 *
//	 * @param <FT>
//	 * The return type of the of the given function and of the return type of
//	 * the returned composed function.
//	 * 
//	 * @param after The function to apply after this function is applied.
//	 * 
//	 * @return A composed function that first applies this function and then
//	 * applies the given function to the result.
//	 */
//	default Function3F<Float> thenF(java.util.function.Function<? super T,? extends Float> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> after.apply(apply3F(a, b, c));
//	}
//	
//	/**
//	 * <p>
//	 * Returns a composed function that first applies this function to
//	 * its input, then applies the given function to the result of this function
//	 * and finally returns the result of the given function.
//	 * 
//	 * <p>
//	 * If evaluation of either function throws an exception, it is relayed to
//	 * the caller of the composed function.
//	 *
//	 * @param <FT>
//	 * The return type of the of the given function and of the return type of
//	 * the returned composed function.
//	 * 
//	 * @param after The function to apply after this function is applied.
//	 * 
//	 * @return A composed function that first applies this function and then
//	 * applies the given function to the result.
//	 */
//	default <FT> Function3F<FT> then(Function<T,FT> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> after.apply(apply3F(a, b, c));
//	}
//	
//	/**
//	 * <p>
//	 * Returns a composed function that first applies this function to
//	 * its input, then applies the given function to the result of this function
//	 * and finally returns the result of the given function.
//	 * 
//	 * <p>
//	 * If evaluation of either function throws an exception, it is relayed to
//	 * the caller of the composed function.
//	 *
//	 * @param <FT>
//	 * The return type of the of the given function and of the return type of
//	 * the returned composed function.
//	 * 
//	 * @param after The function to apply after this function is applied.
//	 * 
//	 * @return A composed function that first applies this function and then
//	 * applies the given function to the result.
//	 */
//	default <FT> Function3F<FT> then(java.util.function.Function<? super T,? extends FT> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c) -> after.apply(apply3F(a, b, c));
//	}
//}
