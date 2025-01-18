//package org.barghos.util.function.floats;
//
//import org.barghos.util.function.Function;
//import org.barghos.util.function.Function3;
//import org.barghos.util.function.Function4;
//import org.barghos.validation.ParameterValidation;
//
///**
// * Represents a function that accepts two arguments and returns a result.
// * 
// * <p>
// * This is a functional interface
// * whose functional method is {@link #applyToFloat(Object, Object)}.
// * 
// * @param <A> The type of the first parameter.
// * @param <B> The type of the second parameter.
// * 
// * @see Function
// * @see FunctionEx
// * @see Function4ToF
// * @see FunctionEx2
// * @see Function3
// * @see FunctionEx3
// * @see Function4
// * @see FunctionEx4
// */
//@FunctionalInterface
//public interface Function4ToF<A,B,C,D> extends Function4<A,B,C,D,Float>
//{
//	/**
//	 * Invokes the function.
//	 * 
//	 * @param a The first parameter.
//	 * @param b The second parameter.
//	 * 
//	 * @return The result of the function.
//	 */
//	float apply4ToF(A a, B b, C c, D d);
//	
//	/**
//	 * {@inheritDoc}
//	 * 
//	 * @deprecated Use {@link #applyToFloat(Object, Object)} instead.
//	 */
//	@Override
//	@Deprecated
//	default Float apply(A a, B b, C c, D d)
//	{
//		return apply4ToF(a, b, c, d);
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
//	default <FT> Function4<A,B,C,D,FT> then(FunctionF<FT> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> after.applyF(apply4ToF(a, b, c, d));
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
//	default <FT> Function4<A,B,C,D,FT> then(Function<Float,FT> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> after.apply(apply4ToF(a, b, c, d));
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
//	default <FT> Function4<A,B,C,D,FT> then(java.util.function.Function<? super Float,? extends FT> after)
//	{
//		ParameterValidation.pvNotNull("after", after);
//		
//		return (a, b, c, d) -> after.apply(apply4ToF(a, b, c, d));
//	}
//}
